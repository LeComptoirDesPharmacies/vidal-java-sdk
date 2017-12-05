package fr.lecomptoirdespharmacies.core.apis;

import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.enums.PackageAggregate;
import fr.lecomptoirdespharmacies.core.enums.PackageStatus;
import fr.lecomptoirdespharmacies.core.enums.PackageTypes;
import fr.lecomptoirdespharmacies.core.enums.SearchFilter;
import fr.lecomptoirdespharmacies.core.helpers.ListHelper;
import fr.lecomptoirdespharmacies.entities.Base;
import fr.lecomptoirdespharmacies.entities.Package;
import org.apache.commons.lang3.StringUtils;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Do request for retrieve Package
 */
public class PackageApi extends BaseApi {


    private final Class cls = Package.class;


    // Use base class before get Package by id
    private final Class base = Base.class;

    private final List<String> AGGREGATE_LIST = Arrays.asList(
            PackageAggregate.STORAGE.name(),
            PackageAggregate.PRODUCT.name()
    );

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
     * @throws Exception
     */
    public Package get(Long vidalId) throws Exception{
        this.clear();
        this.addParams(0, vidalId.toString());

        // Aggregate
        this.addQuery("aggregate", AGGREGATE_LIST);

        return (Package) ListHelper.getObject(doRequest("get_package", cls));
    }

    /**
     * Search package by name
     * @param query         Search terms
     * @param startswith    Starts with terms
     * @param status        Package status ( AVAILABLE, DELETED, ...)
     * @param type          Package type ( VIDAL, ACCESSORY, ...)
     * @return              List of package matching
     * @throws Exception
     */
    public List<Package> searchByName(String query, String startswith, PackageStatus status, PackageTypes type) throws Exception{
        if(StringUtils.isEmpty(query) && StringUtils.isEmpty(startswith)
                && StringUtils.isEmpty(status.name()) && StringUtils.isEmpty(type.name())){
            throw new Exception("Empty fields cannot do request");
        }
        if(StringUtils.isNotEmpty(query) && StringUtils.isNotEmpty(startswith)){
            throw new Exception("You need to choice between query and starts with.");
        }

        query = URLEncoder.encode(query,"UTF-8");
        startswith = URLEncoder.encode(startswith,"UTF-8");

        this.clear();
        this.addQuery("q", query);
        this.addQuery("startwith",startswith);
        if(type != null) {
            this.addQuery("type", type.name());
        }
        if(status != null) {
            this.addQuery("status", status.name());
        }
        return baseToPackage(doRequest("search_package_query", base));
    }

    /**
     * Search Package by code
     * @param code      Code ( CIP, ACL, CIP13 ... )
     * @return          Packages matching
     */
    public List<Package> searchByCode(String code) throws Exception{

        if(code == null || StringUtils.isEmpty(code)) {
            throw new Exception("Empty code cannot do request");
        }

        code = URLEncoder.encode(code,"UTF-8");

        this.clear();
        this.addQuery("code", code);
        this.addQuery("filter", SearchFilter.PACKAGE.name());

        return baseToPackage(doRequest("search_package_code", base));

    }

    /**
     * Do request to transform Base Entity to Package
     * @param entities  Entity to get
     * @return          Packages
     */
    private List<Package> baseToPackage(List<Base> entities){
        return entities.stream()
                .map(e -> {
                    try {
                        return get(e.vidalId);
                    } catch (Exception ex){
                        throw new RuntimeException(ex);
                    }
                }).collect(Collectors.toList());
    }
}
