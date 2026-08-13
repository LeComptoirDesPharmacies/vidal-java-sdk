package fr.lecomptoirdespharmacies.core.helpers;

import com.sun.net.httpserver.HttpServer;
import fr.lecomptoirdespharmacies.VidalApi;
import fr.lecomptoirdespharmacies.entities.Package;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static fr.lecomptoirdespharmacies.core.Constant.GET_PACKAGE;
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

        // Accepts the request, then stays silent instead of answering.
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

    private VidalApi buildVidalApi() {
        VidalApi vidalApi = new VidalApi();
        vidalApi.config.app_id = "FAKE_APP_ID";
        vidalApi.config.app_key = "FAKE_APP_KEY";
        vidalApi.config.baseUrl = "http://127.0.0.1:" + server.getAddress().getPort();
        return vidalApi;
    }

    private void getPackage(VidalApi vidalApi) throws Exception {
        TreeMap<Integer, String> params = new TreeMap<>();
        params.put(0, "959354");

        new RestHelper(vidalApi).doRequest(GET_PACKAGE, new HashMap<String, List<String>>(), params, Package.class);
    }

    @Test
    void silentVidalShouldTimeOutInsteadOfWaitingForever() {
        VidalApi vidalApi = buildVidalApi();
        vidalApi.config.readTimeoutMs = 500;

        long start = System.nanoTime();

        assertThrows(SocketTimeoutException.class, () -> getPackage(vidalApi));

        long elapsedMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
        assertTrue(elapsedMs < 10_000, "Call should have been cut short, took " + elapsedMs + "ms");
    }

    @Test
    void readTimeoutShouldDefaultToTenSeconds() {
        assertTrue(new VidalApi().config.readTimeoutMs == 10_000);
    }
}
