package com.criteo.marketing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.verify.VerificationTimes;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;


public class ApiClientTest {

    private static final int SERVER_PORT = 1080;
    private static final String BASE_URL = "http://localhost:" + SERVER_PORT;

    private static final String PATH_FAKE = "/fake/path";
    private static final String PATH_AUTHENTICATION = "/oauth2/token";
    private static final String EXPLICIT_TOKEN = "EXPLICIT-TOKEN";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    private static final int TOKEN_EXPIRES_IN_SECONDS = 16;

    private ClientAndServer mockServer;

    private ApiClient apiClient;

    @Before
    public void setup() {
        mockServer = startClientAndServer(SERVER_PORT);
        mockServer
                .when(request()
                        .withMethod("POST")
                        .withPath(PATH_AUTHENTICATION))
                .respond(response()
                        .withBody(String.format(
                            "{\"access_token\":\"FAKE-TOKEN\",\"token_type\":\"bearer\",\"expires_in\":%d}",
                                TOKEN_EXPIRES_IN_SECONDS))
                );

        apiClient = new ApiClient();
        apiClient.setBasePath(BASE_URL);
    }

    @After
    public void stopMockServer() {
        mockServer.stop();
    }

    @Test
    public void buildRequest_WithCredential_WithoutExplicitToken_ShouldRefreshToken() throws ApiException {
        apiClient.setUsername(USERNAME);
        apiClient.setPassword(PASSWORD);
        buildFakeGetRequest();
        verifyTokenRequestCounts(1);
    }

    @Test
    public void buildRequest_WithoutCredential_WithExplicitToken_ShouldNotRefreshToken() throws ApiException {
        buildFakeGetRequest(EXPLICIT_TOKEN);
        verifyTokenRequestCounts(0);
    }

    @Test
    public void buildRequest_WithCredential_WithExplicitToken_ShouldNotRefreshToken() throws ApiException {
        apiClient.setUsername(USERNAME);
        apiClient.setPassword(PASSWORD);
        buildFakeGetRequest(EXPLICIT_TOKEN);
        verifyTokenRequestCounts(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void buildRequest_WithoutCredential_WithoutExplicitToken_ShouldThrowException() throws ApiException {
        buildFakeGetRequest();
        verifyTokenRequestCounts(0);
    }

    @Test
    public void buildRequest_WithCredential_WithoutExplicitToken_TokenNotExpired_ShouldNotRefreshTokenInSecondCall() throws ApiException {
        apiClient.setUsername(USERNAME);
        apiClient.setPassword(PASSWORD);
        buildFakeGetRequest();
        verifyTokenRequestCounts(1);
        buildFakeGetRequest();
        verifyTokenRequestCounts(1);
    }

    @Test
    public void buildRequest_WithCredential_TokenExpired_ShouldRefreshTokenInSecondCall() throws ApiException, InterruptedException {
        apiClient.setUsername(USERNAME);
        apiClient.setPassword(PASSWORD);
        buildFakeGetRequest();
        verifyTokenRequestCounts(1);

        Thread.sleep(2000);
        buildFakeGetRequest();
        verifyTokenRequestCounts(2);
    }

    @Test
    public void buildRequest_AuthenticationEndpoint_ShouldNotRefreshToken() throws ApiException {
        buildAuthenticationRequest();
        verifyTokenRequestCounts(0);
    }

    private void buildFakeGetRequest() throws ApiException {
        buildFakeGetRequest("");
    }

    private void buildFakeGetRequest(String explicitToken) throws ApiException {
        buildFakeRequest(PATH_FAKE, "GET", explicitToken);
    }

    private void buildAuthenticationRequest() throws ApiException {
        buildFakeRequest(PATH_AUTHENTICATION, "POST", "");
    }

    private void buildFakeRequest(String path, String method, String explicitToken) throws ApiException {
        Map<String, Object> formParams = Collections.emptyMap();
        List<Pair> queryParams = Collections.emptyList();
        List<Pair> collectionQueryParams = Collections.emptyList();
        String[] authNames = {"Authorization"};

        Map<String, String> headerParams = new HashMap<String, String>() {{
            put("Authorization", explicitToken);
        }};

        apiClient.buildRequest(
                path,
                method,
                queryParams,
                collectionQueryParams,
                "",
                headerParams,
                formParams,
                authNames,
                null
        );
    }

    private void verifyTokenRequestCounts(int count) {
        mockServer.verify(
                request().withMethod("POST").withPath(PATH_AUTHENTICATION),
                VerificationTimes.exactly(count)
        );
    }
}
