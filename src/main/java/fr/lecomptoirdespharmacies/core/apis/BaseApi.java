package fr.lecomptoirdespharmacies.core.apis;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.helpers.ListHelper;
import fr.lecomptoirdespharmacies.core.helpers.RestHelper;
import fr.lecomptoirdespharmacies.entities.AbstractBase;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public abstract class BaseApi {


    /**
     * Instance of vidal Api with Configuration
     */
    private VidalApi vidalApi;

    /**
     * Contains url optional queries
     * Example : ?key1=value1&key2=value2
     */
    private HashMap<String, List<String>> queries;

    /**
     * TreeMap who contains url params by appear order in url. Start to 0.
     * Order -> 'Value'
     * Example : /entity/{entityId}/subentity/{subentityId}
     * 0 -> 'entityId value'
     * 1 -> 'subentityId value'
     */
    private TreeMap<Integer, String> params;


    public BaseApi(VidalApi vidalApi){
        this.vidalApi = vidalApi;
        this.queries = new HashMap<String, List<String>>();
    }

    /**
     * Add params in treeMap
     * @param order     Order in TreeMap correspond to order in URL start to 0
     * @param value     Params value
     */
    protected void addParams(final Integer order, final String value){
        if(order != null && ( value != null && StringUtils.isNotEmpty(value))){
            this.params.put(order,value);
        }
    }


    /**
     * Add list of values for the same key in hashmap
     * @param key       Query key
     * @param values     Query values
     */
    protected void addQuery(final String key, final List<String> values){
        if((key != null && StringUtils.isNotEmpty(key)) && ( values != null && values.size() > 0)){
            this.queries.merge(key,values, ListHelper::mergeList);
        }
    }

    /**
     * Add value in hashmap
     * @param key       Query key
     * @param value     Query value
     */
    protected void addQuery(final String key, final String value){
        if((key != null && StringUtils.isNotEmpty(key)) && ( value != null && StringUtils.isNotEmpty(value))){
            this.queries.merge(key, Arrays.asList(value), ListHelper::mergeList);
        }
    }

    protected void clearQueries(){
        this.queries = new HashMap<String, List<String>>();
    }

    protected void clearParams(){
        this.params = new TreeMap<Integer, String>();
    }

    /**
     * Clear params and strings queries
     */
    protected void clear(){
        clearParams();
        clearQueries();
    }

    protected <T extends AbstractBase> List<T> doRequest(String key, Class cls) throws Exception{
        RestHelper restHelper = new RestHelper(this.vidalApi);
        return restHelper.doRequest(key, this.queries, this.params, cls);
    }
}

