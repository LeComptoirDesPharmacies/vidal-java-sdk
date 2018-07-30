package fr.lecomptoirdespharmacies.core;

import fr.lecomptoirdespharmacies.core.enums.PackageAggregate;

import java.util.Arrays;
import java.util.List;

public class Constant {

    public static final String SEARCH_PACKAGE_CODE = "search_package_code";

    public static final String SEARCH_PACKAGE_QUERY = "search_package_query";

    public static final String GET_PACKAGE = "get_package";

    public static final List<String> AGGREGATE_LIST = Arrays.asList(
            PackageAggregate.STORAGE.name(),
            PackageAggregate.PRODUCT.name()
    );
}
