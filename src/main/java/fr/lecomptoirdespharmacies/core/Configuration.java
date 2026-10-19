package fr.lecomptoirdespharmacies.core;

public class Configuration {

    /**
     * Vidal Application REST id
     */
    public String app_id = "";

    /**
     * Vidal Application REST key
     */
    public String app_key = "";

    /**
     * Base url to Vidal API
     */
    public String baseUrl = "http://api.vidal.fr/rest/api";

    /**
     * Maximum time, in milliseconds, to wait for the connection to Vidal to be established.
     * 0 means an infinite wait.
     */
    public int connectTimeoutMs = 5_000;

    /**
     * Maximum time, in milliseconds, to wait for data once the connection to Vidal is established.
     * 0 means an infinite wait.
     */
    public int readTimeoutMs = 10_000;
}
