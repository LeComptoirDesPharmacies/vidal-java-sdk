package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.exceptions.VidalResponseException;
import fr.lecomptoirdespharmacies.core.exceptions.VidalUnreachableException;
import fr.lecomptoirdespharmacies.entities.AbstractBase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static fr.lecomptoirdespharmacies.core.Constant.GET_PACKAGE;

public class RestHelper {

    /**
     * Instance of vidal Api with Configuration
     */
    protected VidalApi vidalApi;

    public RestHelper(VidalApi vidalApi){
        this.vidalApi = vidalApi;
    }

    /**
     * Return an list of object
     * @param key       Request key
     * @param queries   All string queries for the request
     * @param cls       Real type of returned class
     * @param <T>       Class who extend of BaseEntity class
     * @return          List of Object T
     * @throws VidalUnreachableException    if Vidal could not be reached
     * @throws VidalResponseException       if its answer could not be read
     */
    public <T extends AbstractBase> List<T> doRequest(String key, HashMap<String, List<String>> queries, TreeMap<Integer, String> params, Class cls) {

        UrlHelper urlHelper = new UrlHelper(vidalApi);

        URL url = urlOf(urlHelper.getStrUrl(key,queries,params));

        /*
         * A 404 only says "no such package" on the one url naming a package. Anywhere else it says
         * the url itself is wrong (a mistyped baseUrl, a path Vidal moved): read as an empty result,
         * it would make every search come back empty and silently detach every product from Vidal.
         */
        boolean notFoundMeansUnknownPackage = GET_PACKAGE.equals(key);

        Optional<String> resp = fetch(url, urlHelper.getRequestType(key), notFoundMeansUnknownPackage);

        if (!resp.isPresent()) {
            return Collections.EMPTY_LIST;
        }

        XmlHelper xmlHelper = new XmlHelper();

        return xmlHelper.xmlToObjects(resp.get(), cls);
    }

    private URL urlOf(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            // Never the url itself in the message: it carries app_id and app_key.
            throw new IllegalStateException("Vidal base url is not a valid url", e);
        }
    }

    /**
     * Reads the answer Vidal gives to a request.
     * <p>
     * Every way of failing to reach Vidal surfaces here as an {@link IOException} — timeout,
     * connection reset, unknown host, answer cut short — and so does an answer saying Vidal cannot
     * serve us: both mean the data did not come, and both are worth retrying later.
     * <p>
     * Only a body that came with a 200 is returned. An error body is never parsed: it would yield
     * no entity and read exactly like "Vidal knows no such package", turning an outage into a
     * silently incomplete result.
     *
     * @param notFoundMeansUnknownPackage whether a 404 is a legitimate empty result for this url
     *
     * @return the answer body, or empty when Vidal has nothing for this request
     *
     * @throws VidalUnreachableException if Vidal could not be reached, or refused to serve us
     * @throws VidalResponseException    if Vidal rejected the request itself
     */
    private Optional<String> fetch(URL url, String requestType, boolean notFoundMeansUnknownPackage) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();

            // Without these, a slow or silent Vidal holds the calling thread forever.
            connection.setConnectTimeout(vidalApi.config.connectTimeoutMs);
            connection.setReadTimeout(vidalApi.config.readTimeoutMs);

            connection.setRequestMethod(requestType);

            int responseCode = connection.getResponseCode();

            if (responseCode != 200) {
                // Never parsed, but read to the end and closed so the connection can be reused.
                discard(connection.getErrorStream());
            }

            // No content, or nothing known under that package identifier: a legitimate empty result.
            if (responseCode == 204 || (responseCode == 404 && notFoundMeansUnknownPackage)) {
                return Optional.empty();
            }

            if (responseCode == 429 || responseCode >= 500) {
                throw new VidalUnreachableException(
                        "Vidal cannot serve " + safe(url) + " right now, it answered " + responseCode);
            }

            if (responseCode != 200) {
                throw new VidalResponseException(
                        "Vidal rejected " + safe(url) + " with status " + responseCode, null);
            }

            StringBuffer resp = new StringBuffer();
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    resp.append(line);
                }
            }

            return Optional.of(resp.toString());
        } catch (IOException e) {
            // The connection is in an unknown state: drop its socket rather than hand it back.
            if (connection != null) {
                connection.disconnect();
            }
            throw new VidalUnreachableException("Could not reach Vidal at " + safe(url) + " : " + e, e);
        }
    }

    /**
     * Reads an error body to the end and closes it. Left unread, the socket is neither reused nor
     * released until garbage collection, which a Vidal outage with retries turns into a leak.
     */
    private void discard(InputStream errorBody) {
        if (errorBody == null) {
            return;
        }
        byte[] buffer = new byte[4096];
        try (InputStream in = errorBody) {
            while (in.read(buffer) != -1) {
                // Nothing to keep: the status already says what happened.
            }
        } catch (IOException ignored) {
            // The status is what callers act on; a body we could not drain changes nothing.
        }
    }

    /**
     * The url as it can be shown in a log or an error tracker: {@code app_id} and {@code app_key}
     * travel in the query string, everything else is what tells which call failed.
     */
    private String safe(URL url) {
        String shown = url.getHost() + url.getPath();

        if (Objects.isNull(url.getQuery())) {
            return shown;
        }

        String query = Arrays.stream(url.getQuery().split("&"))
                .filter(parameter -> !parameter.startsWith("app_id=") && !parameter.startsWith("app_key="))
                .collect(Collectors.joining("&"));

        return query.isEmpty() ? shown : shown + "?" + query;
    }
}
