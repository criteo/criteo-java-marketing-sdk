/*
 * Marketing API v.1.0
 * IMPORTANT: This swagger links to Criteo production environment. Any test applied here will thus impact real campaigns.
 *
 * The version of the OpenAPI document: v.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.marketing.api;

import com.criteo.marketing.ApiCallback;
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.ApiResponse;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.Pair;
import com.criteo.marketing.ProgressRequestBody;
import com.criteo.marketing.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.marketing.model.PublisherStatsMessage;
import com.criteo.marketing.model.PublisherStatsQueryMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublishersApi {
    private ApiClient localVarApiClient;

    public PublishersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublishersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getStats
     * @param authorization JWT Bearer Token (required)
     * @param queryMessage  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Stats returned OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> API account not eligible to use this feature. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatsCall(String authorization, PublisherStatsQueryMessage queryMessage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = queryMessage;

        // create path and map variables
        String localVarPath = "/v1/publishers/stats";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "text/html"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "text/html"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatsValidateBeforeCall(String authorization, PublisherStatsQueryMessage queryMessage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getStats(Async)");
        }
        
        // verify the required parameter 'queryMessage' is set
        if (queryMessage == null) {
            throw new ApiException("Missing the required parameter 'queryMessage' when calling getStats(Async)");
        }
        

        okhttp3.Call localVarCall = getStatsCall(authorization, queryMessage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param authorization JWT Bearer Token (required)
     * @param queryMessage  (required)
     * @return List&lt;PublisherStatsMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Stats returned OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> API account not eligible to use this feature. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public List<PublisherStatsMessage> getStats(String authorization, PublisherStatsQueryMessage queryMessage) throws ApiException {
        ApiResponse<List<PublisherStatsMessage>> localVarResp = getStatsWithHttpInfo(authorization, queryMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization JWT Bearer Token (required)
     * @param queryMessage  (required)
     * @return ApiResponse&lt;List&lt;PublisherStatsMessage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Stats returned OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> API account not eligible to use this feature. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PublisherStatsMessage>> getStatsWithHttpInfo(String authorization, PublisherStatsQueryMessage queryMessage) throws ApiException {
        okhttp3.Call localVarCall = getStatsValidateBeforeCall(authorization, queryMessage, null);
        Type localVarReturnType = new TypeToken<List<PublisherStatsMessage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization JWT Bearer Token (required)
     * @param queryMessage  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Stats returned OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> API account not eligible to use this feature. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatsAsync(String authorization, PublisherStatsQueryMessage queryMessage, final ApiCallback<List<PublisherStatsMessage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatsValidateBeforeCall(authorization, queryMessage, _callback);
        Type localVarReturnType = new TypeToken<List<PublisherStatsMessage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
