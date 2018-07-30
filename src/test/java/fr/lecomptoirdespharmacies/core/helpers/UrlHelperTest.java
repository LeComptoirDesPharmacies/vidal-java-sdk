package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.VidalApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import static fr.lecomptoirdespharmacies.core.Constant.AGGREGATE_LIST;
import static fr.lecomptoirdespharmacies.core.Constant.SEARCH_PACKAGE_CODE;
import static org.junit.jupiter.api.Assertions.*;

class UrlHelperTest {

    private UrlHelper urlHelper;

    private VidalApi buildVidalApi(){
        VidalApi vidalApi = new VidalApi();
        vidalApi.config.app_key = "FAKE_APP_KEY";
        vidalApi.config.app_id = "FAKE_APP_ID";
        return vidalApi;
    }

    @BeforeEach
    void setUp() {
        VidalApi vidalApi = buildVidalApi();
        this.urlHelper = new UrlHelper(vidalApi);
    }

    @Test
    void createUrlToRetrievePackageByCode() throws Exception{

        final String actual = "http://api.vidal.fr/rest/api/search?app_id=FAKE_APP_ID&app_key=FAKE_APP_KEY&aggregate=STORAGE&aggregate=PRODUCT";

        TreeMap<Integer, String> params = new TreeMap<>();
        params.put(0, "1234");

        HashMap<String, List<String>> queries = new HashMap<>();
        queries.put("aggregate", AGGREGATE_LIST);

        String url = urlHelper.getStrUrl(SEARCH_PACKAGE_CODE, queries, params);

        assertEquals(url, actual);
    }

    @Test
    void getRequestTypeToRetrievePackageByCode_ShouldReturnGET() {
        final String actual = "GET";

        assertEquals(urlHelper.getRequestType(SEARCH_PACKAGE_CODE), actual);
    }
}