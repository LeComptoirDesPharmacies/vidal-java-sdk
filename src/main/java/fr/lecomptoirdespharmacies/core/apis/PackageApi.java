package fr.lecomptoirdespharmacies.core.apis;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.enums.PackageStatus;
import fr.lecomptoirdespharmacies.core.enums.PackageTypes;
import fr.lecomptoirdespharmacies.core.enums.SearchFilter;
import fr.lecomptoirdespharmacies.core.exceptions.VidalUnreachableException;
import fr.lecomptoirdespharmacies.core.helpers.ListHelper;
import fr.lecomptoirdespharmacies.entities.Base;
import fr.lecomptoirdespharmacies.entities.Package;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static fr.lecomptoirdespharmacies.core.Constant.AGGREGATE_LIST;

/**
 * Do request for retrieve Package
 */
public class PackageApi extends BaseApi {

    private final Class cls = Package.class;

    // Use base class before get Package by id
    private final Class base = Base.class;

    /**
     * Instance of vidal Api with Configuration
     */
    protected VidalApi vidalApi;

    public PackageApi(VidalApi vidalApi){
        super(vidalApi);
    }

    /**
     * Get a package
     * @param vidalId   Package vidal id
     * @return          Package
     * @throws VidalUnreachableException    if Vidal could not be reached
     */
    public Package get(Long vidalId) {
        RequestParameters requestParameters = new RequestParameters();
        requestParameters.addPathParameter(0, vidalId.toString());

        // Aggregate
        requestParameters.addQueryParameter("aggregate", AGGREGATE_LIST);

        return (Package) ListHelper.getObject(doRequest("get_package", cls, requestParameters));
    }

    /**
     * Search package by name
     * @param query         Search terms
     * @param startswith    Starts with terms
     * @param status        Package status ( AVAILABLE, DELETED, ...)
     * @param type          Package type ( VIDAL, ACCESSORY, ...)
     * @return              List of package matching
     * @throws VidalUnreachableException    if Vidal could not be reached
     */
    public List<Package> searchByName(String query, String startswith, PackageStatus status, PackageTypes type) {
        if(StringUtils.isEmpty(query) && StringUtils.isEmpty(startswith)
                && StringUtils.isEmpty(status.name()) && StringUtils.isEmpty(type.name())){
            throw new IllegalArgumentException("Empty fields cannot do request");
        }
        if(StringUtils.isNotEmpty(query) && StringUtils.isNotEmpty(startswith)){
            throw new IllegalArgumentException("You need to choice between query and starts with.");
        }

        query = encode(query);
        startswith = encode(startswith);

        RequestParameters requestParameters = new RequestParameters();
        requestParameters.addQueryParameter("q", query);
        requestParameters.addQueryParameter("startwith",startswith);
        if(type != null) {
            requestParameters.addQueryParameter("type", type.name());
        }
        if(status != null) {
            requestParameters.addQueryParameter("status", status.name());
        }
        return baseToPackage(doRequest("search_package_query", base, requestParameters));
    }

    /**
     * Search Package by code
     * @param code      Code ( CIP, ACL, CIP13 ... )
     * @return          Packages matching
     * @throws VidalUnreachableException    if Vidal could not be reached
     */
    public List<Package> searchByCode(String code) {

        if(code == null || StringUtils.isEmpty(code)) {
            throw new IllegalArgumentException("Empty code cannot do request");
        }

        code = encode(code);

        RequestParameters requestParameters = new RequestParameters();
        requestParameters.addQueryParameter("code", code);
        requestParameters.addQueryParameter("filter", SearchFilter.PACKAGE.name());

        return baseToPackage(doRequest("search_package_code", base, requestParameters));

    }

    private String encode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 is not supported by this JVM", e);
        }
    }

    /**
     * Do request to transform Base Entity to Package
     * @param entities  Entity to get
     * @return          Packages
     */
    private List<Package> baseToPackage(List<Base> entities){
        if (Objects.isNull(entities)) {
            return Collections.emptyList();
        }

        // A failure here is not wrapped: burying it would hide why the search failed.
        return entities.stream()
                .map(e -> get(e.vidalId))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
