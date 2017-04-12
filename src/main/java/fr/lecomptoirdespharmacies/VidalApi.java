package fr.lecomptoirdespharmacies;

import fr.lecomptoirdespharmacies.core.apis.PackageApi;
import fr.lecomptoirdespharmacies.core.Configuration;

public class VidalApi {

    public VidalApi(){

        //Default config setup
        config = new Configuration();

        //APIs
        packageApi = new PackageApi(this);
    }

    /**
     * Configuration instance
     */
    public Configuration config;

    /**
     * VIDAL Search Api
     */
    public PackageApi packageApi;
}
