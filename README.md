Vidal Java SDK
======================

VidalSDK is a Java client __starter__ library for [Vidal REST API](https://vidal.3scale.net/docs)
 
It's __not an official library__ developed by [Vidal](https://www.vidal.fr/), 
It's a library developed by [Le Comptoir des Pharmacies](https://www.lecomptoirdespharmacies.fr/)
for their own use.

__Written in Java 8__

Features
-------------

Currently it only implements some __Package management features__.

- Get a Package with vidal id
- Search a Package by name, type, status
- Search a Package by code (cip, cip13, ...)

If you want more features, you can fork this repo and feel free to modify
the code.

Contact
-------------

If you want more information,
you can [mail me](mailto:webmaster@lecomptoirdespharmacies.fr). 

Simple usage 
-------------

```
public static void main(String[] args){
    VidalApi vidalApi = new VidalApi();
    vidalApi.config.app_id = "YOUR VIDAL APP ID";
    vidalApi.config.app_key = "YOUR VIDAL APP KEY";
    try {
        Package dolipraneliquiz  = vidalApi.packageApi.searchByCode("3400927897474");
        List<Package> packages = vidalApi.packageApi.searchByName("dentifrice", null, PackageStatus.NEW, PackageTypes.NON_PHARMACEUTICAL);
    } catch (Exception e){
        System.out.print(e);
    }
}
```

License 
-----------
Distributes under [MIT license](http://www.opensource.org/licenses/mit-license.php), see LICENSE file.