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
        List<Package> packages = vidalApi.packageApi.searchByName("dentifrice", "", PackageStatus.NEW, PackageTypes.NON_PHARMACEUTICAL);
    } catch (Exception e){
        System.out.print(e);
    }
}
```

Timeouts
-------------

Calls to Vidal are bounded by a connect timeout of 5s and a read timeout of 10s.
Both are adjustable, and `0` restores the previous behaviour of waiting forever:

```
vidalApi.config.connectTimeoutMs = 3000;
vidalApi.config.readTimeoutMs = 7000;
```

Errors
-------------

Nothing this SDK raises is a checked exception, so callers only handle what they care about:

| Failure | Exception |
| --- | --- |
| Vidal could not be reached (timeout, connection reset, unknown host) | `VidalUnreachableException`, keeping the `IOException` as its cause |
| Vidal answered, but the answer could not be read | `VidalResponseException` |
| The request cannot be sent as asked | `IllegalArgumentException` |
| `app_id`, `app_key` or `baseUrl` missing | `IllegalStateException` |

Only the first one is worth retrying later, which is usually the single distinction callers need:

```
try {
    Package aPackage = vidalApi.packageApi.get(959354L);
} catch (VidalUnreachableException e){
    // Vidal is down or too slow: nothing to fix on the request itself
}
```

A package Vidal does not know is **not** an error: it comes back as `null`, or as an empty list for
the searches. A failure never masquerades as an empty result.

How to build & deploy
-------------

```
./gradlew build
./gradlew uploadArchives

```

License 
-----------
Distributes under [MIT license](http://www.opensource.org/licenses/mit-license.php), see LICENSE file.