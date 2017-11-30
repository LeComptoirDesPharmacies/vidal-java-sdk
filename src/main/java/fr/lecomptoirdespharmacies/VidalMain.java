package fr.lecomptoirdespharmacies;

import fr.lecomptoirdespharmacies.core.enums.PackageStatus;
import fr.lecomptoirdespharmacies.core.enums.PackageTypes;
import fr.lecomptoirdespharmacies.entities.Package;

import java.util.List;

public class VidalMain {
    public static void main(String [] args) {
        VidalApi vidalApi = new VidalApi();

        vidalApi.config.app_id = "11cd6222";
        vidalApi.config.app_key = "ea26f72538ac6a7c9e29f23268bea08c";
        try {
            List<Package> packages = vidalApi.packageApi.searchByName("dentifrice", "", PackageStatus.NEW, PackageTypes.NON_PHARMACEUTICAL);
            List<Package> dolipraneliquiz  = vidalApi.packageApi.searchByCode("3638401");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
