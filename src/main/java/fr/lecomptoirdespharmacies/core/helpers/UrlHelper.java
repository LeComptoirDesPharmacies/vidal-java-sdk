package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.enums.RequestType;
import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static fr.lecomptoirdespharmacies.core.Constant.GET_PACKAGE;
import static fr.lecomptoirdespharmacies.core.Constant.SEARCH_PACKAGE_CODE;
import static fr.lecomptoirdespharmacies.core.Constant.SEARCH_PACKAGE_QUERY;
import static java.util.stream.Collectors.joining;

public class UrlHelper {

    /**
     * Instance of vidal Api with Configuration
     */
    protected VidalApi vidalApi;

    public UrlHelper(VidalApi vidalApi){
        this.vidalApi = vidalApi;
    }

    private Map<String, String[]> requests = new HashMap<String, String[]>(){{

        // Package Api request
        put(SEARCH_PACKAGE_CODE, new String[]{"/search", RequestType.GET.toString()});
        put(SEARCH_PACKAGE_QUERY, new String[]{"/packages", RequestType.GET.toString()});
        put(GET_PACKAGE, new String[]{"/package/%s", RequestType.GET.toString()});
    }};

    private String getBaseUrl() throws Exception{
        if(StringUtils.isEmpty(vidalApi.config.baseUrl)){
            throw new Exception ("vidalApi.config.baseUrl is not defined.");
        }
        return vidalApi.config.baseUrl;
    }

    public String getStrUrl(String key, HashMap<String,List<String>> queries, TreeMap<Integer,String> params ) throws Exception{
        return this.getFullUrl(key, queries, params);
    }

    public String getRequestType(String key){
        return this.requests.get(key)[1];
    }

    /**
     * Add authentication parameters to url string
     * @param url   Base Url with requested area
     * @return      Url with authentication in queries
     * @throws Exception
     */
    private String addAuthenticationKeys(String url) throws Exception{
        if(StringUtils.isEmpty(vidalApi.config.app_id)){
            throw new Exception ("vidalApi.config.app_id is not defined.");
        }

        if(StringUtils.isEmpty(vidalApi.config.app_key)){
            throw new Exception ("vidalApi.config.app_key is not defined.");
        }

        url += "?app_id="+vidalApi.config.app_id + "&app_key="+vidalApi.config.app_key;

        return url;
    }

    /**
     * @since 1.8+
     * @param url       Only url with auth already in queries
     * @param queries   All strings queries
     * @return          Url with queries
     */
    private String getUrlWithQueries( String url, HashMap<String,List<String>> queries){

        // get all queries and parse it to "&key1=value1&key2=value2..."
        String queryStr = queries.entrySet()
                        .stream()
                        .map(entry -> {
                                 return entry.getValue()
                                         .stream().map(value ->
                                                 "&"+entry.getKey()+"="+value
                                         ).collect(joining());
                                }
                        )
                .collect(joining());

        return url + queryStr;
    }

    /**
     * Format url with params
     * @param baseUrl   Base url
     * @param key       Request key
     * @param params    Url parameters
     * @return          Formated url to String
     */
    private String formatUrl(String baseUrl, String key, TreeMap<Integer,String> params) throws Exception{
        if(requests.get(key) == null ){
            throw new Exception ("Invalid request key.");
        }
        String request = String.format(requests.get(key)[0], params.entrySet().stream().map(Map.Entry::getValue).toArray());
        return baseUrl + request;
    }

    /**
     *
     * @param key       Request key
     * @param queries   All url strings queries
     * @param params    All url parameters
     * @return          Full url string
     * @throws Exception
     */
    private String getFullUrl (String key, HashMap<String,List<String>> queries, TreeMap<Integer,String> params) throws Exception{

        // Base url set in conf file
        String baseUrl = getBaseUrl();

        // Url with requested area
        String requestUrl = formatUrl(baseUrl, key, params);

        // Authenticated Url with app_id and app_key
        String authUrl = addAuthenticationKeys(requestUrl);

        // Url with all queries
        String fullUrl = getUrlWithQueries(authUrl, queries);

        return fullUrl;
    }
}
