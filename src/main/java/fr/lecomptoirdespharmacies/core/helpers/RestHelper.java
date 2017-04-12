package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.entities.BaseEntity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
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
     * @throws Exception
     */
    public <T extends BaseEntity> List<T> doRequest(String key, HashMap<String, String> queries, TreeMap<Integer, String> params, Class cls) throws Exception{

        UrlHelper urlHelper = new UrlHelper(vidalApi);

        URL url = new URL(urlHelper.getStrUrl(key,queries,params));

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod(urlHelper.getRequestType(key));

        int responseCode = connection.getResponseCode();
        InputStream is;
        if (responseCode != 200 && responseCode != 204) {
            is = connection.getErrorStream();
        } else {
            is = connection.getInputStream();
        }

        StringBuffer resp;
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String line;
        resp = new StringBuffer();
        while ((line = br.readLine()) != null) {
            resp.append(line);
        }

        XmlHelper xmlHelper = new XmlHelper();

        return xmlHelper.xmlToObjects(resp.toString(), cls);
    }
}
