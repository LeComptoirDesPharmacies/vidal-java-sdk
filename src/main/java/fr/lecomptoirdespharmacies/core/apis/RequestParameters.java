package fr.lecomptoirdespharmacies.core.apis;

import fr.lecomptoirdespharmacies.core.helpers.ListHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class RequestParameters {
    /**
     * Contains url optional queries
     * Example : ?key1=value1&key2=value2
     */
    private HashMap<String, List<String>> queryParameters;

    /**
     * TreeMap who contains url params by appear order in url. Start to 0.
     * Order -> 'Value'
     * Example : /entity/{entityId}/subentity/{subentityId}
     * 0 -> 'entityId value'
     * 1 -> 'subentityId value'
     */
    private TreeMap<Integer, String> pathParams;

    public RequestParameters(){
        this.queryParameters = new HashMap<String, List<String>>();
        this.pathParams = new TreeMap<Integer, String>();
    }

    public HashMap<String, List<String>> getQueryParameters() {
        return queryParameters;
    }

    /**
     * Add list of values for the same key in hashmap
     * @param key       Query key
     * @param values     Query values
     */
    protected void addQueryParameter(final String key, final List<String> values){
        if((key != null && StringUtils.isNotEmpty(key)) && ( values != null && values.size() > 0)){
            this.queryParameters.merge(key,values, ListHelper::mergeList);
        }
    }

    /**
     * Add value in hashmap
     * @param key       Query key
     * @param value     Query value
     */
    protected void addQueryParameter(final String key, final String value){
        if((key != null && StringUtils.isNotEmpty(key)) && ( value != null && StringUtils.isNotEmpty(value))){
            this.queryParameters.merge(key, Arrays.asList(value), ListHelper::mergeList);
        }
    }

    public TreeMap<Integer, String> getPathParameters() {
        return pathParams;
    }


    /**
     * Add params in treeMap
     * @param order     Order in TreeMap correspond to order in URL start to 0
     * @param value     Params value
     */
    protected void addPathParameter(final Integer order, final String value){
        if(order != null && ( value != null && StringUtils.isNotEmpty(value))){
            this.pathParams.put(order,value);
        }
    }
}
