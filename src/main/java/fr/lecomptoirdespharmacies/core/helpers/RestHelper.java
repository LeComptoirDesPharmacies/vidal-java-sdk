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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;

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
     * connection reset, unknown host, answer cut short — and is the one failure callers usually
     * want to tell apart, hence the dedicated exception. What Vidal answered is left to the caller
     * to make sense of: an unreadable answer is not an unreachable Vidal.
     *
     * @return the answer body, or empty when Vidal answered it has no content
     *
     * @throws VidalUnreachableException if Vidal could not be reached
     */
    private Optional<String> fetch(URL url, String requestType) {
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Without these, a slow or silent Vidal holds the calling thread forever.
            connection.setConnectTimeout(vidalApi.config.connectTimeoutMs);
            connection.setReadTimeout(vidalApi.config.readTimeoutMs);

            connection.setRequestMethod(requestType);

            int responseCode = connection.getResponseCode();

            if (responseCode == 204) {
                return Optional.empty();
            }

            InputStream is;
            if (responseCode != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }

            StringBuffer resp = new StringBuffer();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    resp.append(line);
                }
            }

            return Optional.of(resp.toString());
        } catch (IOException e) {
            // Never the full url: it carries app_id and app_key as query parameters.
            throw new VidalUnreachableException(
                    "Could not reach Vidal at " + url.getHost() + url.getPath() + " : " + e, e);
        }
    }
}
