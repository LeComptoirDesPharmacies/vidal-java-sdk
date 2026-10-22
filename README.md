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
| Vidal answered `5xx` or `429` | `VidalUnreachableException` |
| Vidal answered another error status (a `404` on a search included), or an answer that could not be read | `VidalResponseException` |
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

A package Vidal does not know is **not** an error: a `204` comes back as `null`, or as an empty list
for the searches, and so does a `404` on `get(id)`. A `404` on a search is an error, though: it says
the url is wrong (a mistyped `baseUrl`, a path Vidal moved), and reading it as "no match" would make
every search come back empty without a word. A failure never masquerades as an empty result — error
bodies are not parsed, since they would yield no entity and read exactly like "no such package".

How to build & deploy
-------------

```
./gradlew build
./gradlew uploadArchives

```

The wrapper is Gradle 4.8.1: run it with `JAVA_HOME` on a JDK 11 at most.

How to release
-------------

Releases go through the `perform-release` GitHub workflow, driven by lcdp-release: the tool pushes a
`release/vX.Y.Z` branch cut from `master` and dispatches the workflow on it. The workflow sets
`X.Y.Z` in `build.gradle` (`version` and `pom.version`), merges the branch into `master`, tags
`vX.Y.Z`, deletes the release branch, then publishes the jar to the git-backed Maven repository
`bitbucket.org/lecomptoirdespharmacies/maven_repository` with `./gradlew uploadArchives`.

The workflow needs one repository secret, `MAVEN_REPOSITORY_SSH_KEY`: the private SSH key of an
account allowed to push to `maven_repository` (a Bitbucket repository access key is read-only and
will not do).

A release made by hand (`./gradlew uploadArchives` from a bumped `master`) must also push the
`vX.Y.Z` tag: lcdp-release reads the tags to know what is released.

License 
-----------
Distributes under [MIT license](http://www.opensource.org/licenses/mit-license.php), see LICENSE file.