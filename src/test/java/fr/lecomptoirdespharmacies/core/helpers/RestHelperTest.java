package fr.lecomptoirdespharmacies.core.helpers;

import com.sun.net.httpserver.HttpServer;
import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.core.exceptions.VidalResponseException;
import fr.lecomptoirdespharmacies.core.exceptions.VidalUnreachableException;
import fr.lecomptoirdespharmacies.entities.Package;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static fr.lecomptoirdespharmacies.core.Constant.AGGREGATE_LIST;
import static fr.lecomptoirdespharmacies.core.Constant.GET_PACKAGE;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * A Vidal that accepts the connection but never answers used to hold the calling thread forever,
 * because no timeout was set on the underlying connection.
 */
class RestHelperTest {

    private HttpServer server;

    /**
     * Released once the test is over, so the handler thread stops holding its request.
     */
    private CountDownLatch testOver;

    @BeforeEach
    void setUp() throws Exception {
        testOver = new CountDownLatch(1);

        // Accepts the request, then stays silent instead of answering, until answerWith says otherwise.
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            try {
                testOver.await(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            exchange.close();
        });
        server.start();
    }

    @AfterEach
    void tearDown() {
        testOver.countDown();
        server.stop(0);
    }

    /**
     * Replaces the silent handler by one answering the given status.
     */
    private void answerWith(int status, String body) {
        server.removeContext("/");
        server.createContext("/", exchange -> {
            byte[] content = body.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(status, content.length == 0 ? -1 : content.length);
            if (content.length > 0) {
                try (OutputStream out = exchange.getResponseBody()) {
                    out.write(content);
                }
            }
            exchange.close();
        });
    }

    private VidalApi buildVidalApi() {
        VidalApi vidalApi = new VidalApi();
        vidalApi.config.app_id = "FAKE_APP_ID";
        vidalApi.config.app_key = "FAKE_APP_KEY";
        vidalApi.config.baseUrl = "http://127.0.0.1:" + server.getAddress().getPort();
        return vidalApi;
    }

    private List<Package> getPackages(VidalApi vidalApi) {
        TreeMap<Integer, String> params = new TreeMap<>();
        params.put(0, "959354");

        HashMap<String, List<String>> queries = new HashMap<>();
        queries.put("aggregate", AGGREGATE_LIST);

        return new RestHelper(vidalApi).doRequest(GET_PACKAGE, queries, params, Package.class);
    }

    private void getPackage(VidalApi vidalApi) {
        getPackages(vidalApi);
    }

    @Test
    void silentVidalShouldTimeOutInsteadOfWaitingForever() {
        VidalApi vidalApi = buildVidalApi();
        vidalApi.config.readTimeoutMs = 500;

        long start = System.nanoTime();

        VidalUnreachableException exception =
                assertThrows(VidalUnreachableException.class, () -> getPackage(vidalApi));

        long elapsedMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
        assertTrue(elapsedMs < 10_000, "Call should have been cut short, took " + elapsedMs + "ms");
        assertTrue(exception.getCause() instanceof SocketTimeoutException,
                "Callers classify on the cause, it must be kept");
    }

    @Test
    void unreachableVidalShouldNotLeakTheCredentialsCarriedByTheUrl() {
        VidalApi vidalApi = buildVidalApi();
        vidalApi.config.readTimeoutMs = 500;

        VidalUnreachableException exception =
                assertThrows(VidalUnreachableException.class, () -> getPackage(vidalApi));

        assertFalse(exception.getMessage().contains("FAKE_APP_KEY"),
                "Message goes to logs and error trackers: " + exception.getMessage());
        assertFalse(exception.getMessage().contains("FAKE_APP_ID"), exception.getMessage());
    }

    @Test
    void aSearchShouldNotBuryTheUnreachableVidalOfThePackagesItFetches() {
        VidalApi vidalApi = buildVidalApi();
        vidalApi.config.readTimeoutMs = 500;

        // searchByCode fetches each hit through get(), whose failure used to come back wrapped.
        assertThrows(VidalUnreachableException.class,
                () -> vidalApi.packageApi.searchByCode("3400930000000"));
    }

    @Test
    void readTimeoutShouldDefaultToTenSeconds() {
        assertTrue(new VidalApi().config.readTimeoutMs == 10_000);
    }

    /**
     * An error body used to be handed to the parser, which found no entity in it — so an outage
     * came back as "Vidal knows no such package" and let a synchronization run on without it.
     */
    @Test
    void vidalAnsweringItIsUnavailableShouldFailRatherThanLookLikeNoResult() {
        answerWith(503, "<error>Service Unavailable</error>");

        VidalUnreachableException exception =
                assertThrows(VidalUnreachableException.class, () -> getPackage(buildVidalApi()));

        assertTrue(exception.getMessage().contains("503"), exception.getMessage());
    }

    @Test
    void vidalThrottlingUsShouldBeWorthRetrying() {
        answerWith(429, "");

        assertThrows(VidalUnreachableException.class, () -> getPackage(buildVidalApi()));
    }

    @Test
    void vidalRejectingTheRequestShouldNotBeReportedAsUnreachable() {
        answerWith(403, "");

        assertThrows(VidalResponseException.class, () -> getPackage(buildVidalApi()));
    }

    @Test
    void packageVidalDoesNotKnowShouldStayAnEmptyResult() throws Exception {
        answerWith(404, "");

        assertTrue(getPackages(buildVidalApi()).isEmpty());
    }

    @Test
    void errorStatusShouldNotLeakTheCredentialsCarriedByTheUrl() {
        answerWith(500, "");

        VidalUnreachableException exception =
                assertThrows(VidalUnreachableException.class, () -> getPackage(buildVidalApi()));

        assertFalse(exception.getMessage().contains("FAKE_APP_KEY"), exception.getMessage());
        assertTrue(exception.getMessage().contains("aggregate"),
                "the rest of the query says which call failed: " + exception.getMessage());
    }
}
