package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.exceptions.VidalResponseException;
import fr.lecomptoirdespharmacies.core.exceptions.VidalUnreachableException;
import fr.lecomptoirdespharmacies.entities.AbstractBase;
import java.io.BufferedReader;
import java.io.IOException;
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

        Optional<String> resp = fetch(url, urlHelper.getRequestType(key));

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
     * @return the answer body, or empty when Vidal has nothing for this request
     *
     * @throws VidalUnreachableException if Vidal could not be reached, or refused to serve us
     * @throws VidalResponseException    if Vidal rejected the request itself
     */
    private Optional<String> fetch(URL url, String requestType) {
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Without these, a slow or silent Vidal holds the calling thread forever.
            connection.setConnectTimeout(vidalApi.config.connectTimeoutMs);
            connection.setReadTimeout(vidalApi.config.readTimeoutMs);

            connection.setRequestMethod(requestType);

            int responseCode = connection.getResponseCode();

            // No content, and nothing known under that identifier: a legitimate empty result.
            if (responseCode == 204 || responseCode == 404) {
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
            throw new VidalUnreachableException("Could not reach Vidal at " + safe(url) + " : " + e, e);
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
