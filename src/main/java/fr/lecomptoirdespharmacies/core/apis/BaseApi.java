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

    public BaseApi(VidalApi vidalApi){
        this.vidalApi = vidalApi;
    }

    protected <T extends AbstractBase> List<T> doRequest(String key, Class cls, RequestParameters requestParameters) throws Exception{
        RestHelper restHelper = new RestHelper(this.vidalApi);
        return restHelper.doRequest(key, requestParameters.getQueryParameters(), requestParameters.getPathParameters(), cls);
    }
}

