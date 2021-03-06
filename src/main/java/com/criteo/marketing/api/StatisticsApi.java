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


import com.criteo.marketing.model.CampaignReportQueryMessage;
import com.criteo.marketing.model.StatsQueryMessageEx;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsApi {
    private ApiClient localVarApiClient;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCampaignReport
     * @param authorization JWT Bearer Token (required)
     * @param reportQuery  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report generated OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied (Endpoint in beta) </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCampaignReportCall(String authorization, CampaignReportQueryMessage reportQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = reportQuery;

        // create path and map variables
        String localVarPath = "/v1/statistics/report";

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
    private okhttp3.Call getCampaignReportValidateBeforeCall(String authorization, CampaignReportQueryMessage reportQuery, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getCampaignReport(Async)");
        }
        
        // verify the required parameter 'reportQuery' is set
        if (reportQuery == null) {
            throw new ApiException("Missing the required parameter 'reportQuery' when calling getCampaignReport(Async)");
        }
        

        okhttp3.Call localVarCall = getCampaignReportCall(authorization, reportQuery, _callback);
        return localVarCall;

    }

    /**
     * Generates a statistics report
     * ###This Statistics endpoint is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities. It is currently in beta and subject to change. Reach out to your Criteo contact if you’re interesting in participating in the beta###  **AdvertiserIds**:(mandatory) The list of advertiser ids, comma-separated. Advertisers not in your portfolio   will be skipped. If no id is present, all the advertisers in the portfolio will be used.&lt;br /&gt;  **StartDate, EndDate**: (mandatory) Start date (beginning of day) and end date (beginning of day) to be used for  the report generation. Format to use: yyyy-mm-dd (e.g. 2017-10-30).&lt;br /&gt;  **Dimensions**: (mandatory) The dimensions to be used in the report. Possible values: CampaignId, Campaign,  AdvertiserId, Advertiser, CategoryId, Category, Hour, Day, Week, Month, Year.&lt;br /&gt;  **Metrics**:(mandatory) The metrics to be used in the report. For a list of possible values, please see  &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;API-Statistics-Reference\&quot;&gt;the full documentation&lt;/a&gt;.&lt;br /&gt;  **Format**: (mandatory)The file format of the generated report. Possible values: Csv, Excel, Xml, Json&lt;br /&gt;  **Currency**: (optional) The currency to be used in the report. ISO 4217 code (three-letter capitals). For a list of   supported values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Supported-currencies-API\&quot;&gt;the full documentation&lt;/a&gt;.  If not set, the user&#39;s preference setting will be used.&lt;br /&gt;  **Timezone**: (optional) Timezone to be used in the report. Possible format&lt;br /&gt;  - TZ format (e.g. Europe/London)  - UTC format (e.g. UTC+1:00)  - Timezone abbreviation (e.g. PST)                If not set, GMT is used.&lt;br /&gt;  #### Functional cases ####  Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through   a CURL request or other programmatic methods.  #### Validation rules ####  StartDate and EndDate are mandatory.&lt;br /&gt;  StartDate should come before, or be equal to EndDate.&lt;br /&gt;  The requested dimensions must be in a supported combination.&lt;br /&gt;  At least one metric must be provided.&lt;br /&gt;  All metrics must be supported.&lt;br /&gt;  No duplicated metric in the list.&lt;br /&gt;  The selected advertisers must have at least one campaign.&lt;br /&gt;
     * @param authorization JWT Bearer Token (required)
     * @param reportQuery  (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report generated OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied (Endpoint in beta) </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getCampaignReport(String authorization, CampaignReportQueryMessage reportQuery) throws ApiException {
        ApiResponse<byte[]> localVarResp = getCampaignReportWithHttpInfo(authorization, reportQuery);
        return localVarResp.getData();
    }

    /**
     * Generates a statistics report
     * ###This Statistics endpoint is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities. It is currently in beta and subject to change. Reach out to your Criteo contact if you’re interesting in participating in the beta###  **AdvertiserIds**:(mandatory) The list of advertiser ids, comma-separated. Advertisers not in your portfolio   will be skipped. If no id is present, all the advertisers in the portfolio will be used.&lt;br /&gt;  **StartDate, EndDate**: (mandatory) Start date (beginning of day) and end date (beginning of day) to be used for  the report generation. Format to use: yyyy-mm-dd (e.g. 2017-10-30).&lt;br /&gt;  **Dimensions**: (mandatory) The dimensions to be used in the report. Possible values: CampaignId, Campaign,  AdvertiserId, Advertiser, CategoryId, Category, Hour, Day, Week, Month, Year.&lt;br /&gt;  **Metrics**:(mandatory) The metrics to be used in the report. For a list of possible values, please see  &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;API-Statistics-Reference\&quot;&gt;the full documentation&lt;/a&gt;.&lt;br /&gt;  **Format**: (mandatory)The file format of the generated report. Possible values: Csv, Excel, Xml, Json&lt;br /&gt;  **Currency**: (optional) The currency to be used in the report. ISO 4217 code (three-letter capitals). For a list of   supported values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Supported-currencies-API\&quot;&gt;the full documentation&lt;/a&gt;.  If not set, the user&#39;s preference setting will be used.&lt;br /&gt;  **Timezone**: (optional) Timezone to be used in the report. Possible format&lt;br /&gt;  - TZ format (e.g. Europe/London)  - UTC format (e.g. UTC+1:00)  - Timezone abbreviation (e.g. PST)                If not set, GMT is used.&lt;br /&gt;  #### Functional cases ####  Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through   a CURL request or other programmatic methods.  #### Validation rules ####  StartDate and EndDate are mandatory.&lt;br /&gt;  StartDate should come before, or be equal to EndDate.&lt;br /&gt;  The requested dimensions must be in a supported combination.&lt;br /&gt;  At least one metric must be provided.&lt;br /&gt;  All metrics must be supported.&lt;br /&gt;  No duplicated metric in the list.&lt;br /&gt;  The selected advertisers must have at least one campaign.&lt;br /&gt;
     * @param authorization JWT Bearer Token (required)
     * @param reportQuery  (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report generated OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied (Endpoint in beta) </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getCampaignReportWithHttpInfo(String authorization, CampaignReportQueryMessage reportQuery) throws ApiException {
        okhttp3.Call localVarCall = getCampaignReportValidateBeforeCall(authorization, reportQuery, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generates a statistics report (asynchronously)
     * ###This Statistics endpoint is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities. It is currently in beta and subject to change. Reach out to your Criteo contact if you’re interesting in participating in the beta###  **AdvertiserIds**:(mandatory) The list of advertiser ids, comma-separated. Advertisers not in your portfolio   will be skipped. If no id is present, all the advertisers in the portfolio will be used.&lt;br /&gt;  **StartDate, EndDate**: (mandatory) Start date (beginning of day) and end date (beginning of day) to be used for  the report generation. Format to use: yyyy-mm-dd (e.g. 2017-10-30).&lt;br /&gt;  **Dimensions**: (mandatory) The dimensions to be used in the report. Possible values: CampaignId, Campaign,  AdvertiserId, Advertiser, CategoryId, Category, Hour, Day, Week, Month, Year.&lt;br /&gt;  **Metrics**:(mandatory) The metrics to be used in the report. For a list of possible values, please see  &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;API-Statistics-Reference\&quot;&gt;the full documentation&lt;/a&gt;.&lt;br /&gt;  **Format**: (mandatory)The file format of the generated report. Possible values: Csv, Excel, Xml, Json&lt;br /&gt;  **Currency**: (optional) The currency to be used in the report. ISO 4217 code (three-letter capitals). For a list of   supported values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Supported-currencies-API\&quot;&gt;the full documentation&lt;/a&gt;.  If not set, the user&#39;s preference setting will be used.&lt;br /&gt;  **Timezone**: (optional) Timezone to be used in the report. Possible format&lt;br /&gt;  - TZ format (e.g. Europe/London)  - UTC format (e.g. UTC+1:00)  - Timezone abbreviation (e.g. PST)                If not set, GMT is used.&lt;br /&gt;  #### Functional cases ####  Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through   a CURL request or other programmatic methods.  #### Validation rules ####  StartDate and EndDate are mandatory.&lt;br /&gt;  StartDate should come before, or be equal to EndDate.&lt;br /&gt;  The requested dimensions must be in a supported combination.&lt;br /&gt;  At least one metric must be provided.&lt;br /&gt;  All metrics must be supported.&lt;br /&gt;  No duplicated metric in the list.&lt;br /&gt;  The selected advertisers must have at least one campaign.&lt;br /&gt;
     * @param authorization JWT Bearer Token (required)
     * @param reportQuery  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report generated OK. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied (Endpoint in beta) </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCampaignReportAsync(String authorization, CampaignReportQueryMessage reportQuery, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCampaignReportValidateBeforeCall(authorization, reportQuery, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getStats
     * @param authorization JWT Bearer Token (required)
     * @param statsQuery The report query details (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Statistics report generated OK. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, invalid syntax or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> No campaigns found. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatsCall(String authorization, StatsQueryMessageEx statsQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = statsQuery;

        // create path and map variables
        String localVarPath = "/v1/statistics";

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
    private okhttp3.Call getStatsValidateBeforeCall(String authorization, StatsQueryMessageEx statsQuery, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getStats(Async)");
        }
        
        // verify the required parameter 'statsQuery' is set
        if (statsQuery == null) {
            throw new ApiException("Missing the required parameter 'statsQuery' when calling getStats(Async)");
        }
        

        okhttp3.Call localVarCall = getStatsCall(authorization, statsQuery, _callback);
        return localVarCall;

    }

    /**
     * Generates a statistics report
     * &lt;b&gt;ReportType&lt;/b&gt;: The type of report to generate. Possible values: CampaignPerformance, FacebookDPA, TransactionID. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;AdvertiserIds&lt;/b&gt;: The list of advertiser ids, comma-separated. Advertisers not in your portfolio will be skipped. If not present, all the advertisers in the portfolio will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;StartDate, EndDate&lt;/b&gt;: Start date (beginning of day) and end date (end of day) to be used for the report generation. Format to use: yyyy-MM-dd (e.g. 2017-10-30). &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Dimensions&lt;/b&gt;: The dimensions to be used in the report. Between one and three. Possible values: CampaignId, AdvertiserId, Category, Hour, Day, Week, Month, Year. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Metrics&lt;/b&gt;: The metrics to be used in the report. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Format&lt;/b&gt;: The file format of the generated report. Possible values: Csv, Excel, Xml, Json &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Currency&lt;/b&gt;: The currency to be used in the report. Three-letter capitals. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Timezone&lt;/b&gt;: Timezone to be used in the report. Possible values: GMT, PST, JST. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;IgnoreXDevice&lt;/b&gt;: Ignore cross-device data. Also can explicitly set to null for TransactionID ReportType to get all data. Defaults to false. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;              Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through a CURL request or other programmatic methods.              &lt;h4&gt;Validation rules&lt;/h4&gt;              StartDate and EndDate are mandatory.&lt;br /&gt;              StartDate should come before, or be equal to EndDate.&lt;br /&gt;              The requested dimensions must be in a supported combination.&lt;br /&gt;              At least one metric must be provided.&lt;br /&gt;              All metrics must be supported.&lt;br /&gt;              The selected advertisers must have at least one campaign.&lt;br /&gt;              Seller dimension is not supported.&lt;br /&gt;&lt;h4&gt;Response custom headers&lt;/h4&gt;              If you are asking for a CampaignPerformance report and sales metrics are late, response will have a custom header &lt;b&gt;latest-available-sales&lt;/b&gt;, a datetime with format &lt;b&gt;yyyy-MM-dd HH:mm&lt;/b&gt; using the requested timezone.
     * @param authorization JWT Bearer Token (required)
     * @param statsQuery The report query details (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Statistics report generated OK. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, invalid syntax or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> No campaigns found. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getStats(String authorization, StatsQueryMessageEx statsQuery) throws ApiException {
        ApiResponse<byte[]> localVarResp = getStatsWithHttpInfo(authorization, statsQuery);
        return localVarResp.getData();
    }

    /**
     * Generates a statistics report
     * &lt;b&gt;ReportType&lt;/b&gt;: The type of report to generate. Possible values: CampaignPerformance, FacebookDPA, TransactionID. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;AdvertiserIds&lt;/b&gt;: The list of advertiser ids, comma-separated. Advertisers not in your portfolio will be skipped. If not present, all the advertisers in the portfolio will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;StartDate, EndDate&lt;/b&gt;: Start date (beginning of day) and end date (end of day) to be used for the report generation. Format to use: yyyy-MM-dd (e.g. 2017-10-30). &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Dimensions&lt;/b&gt;: The dimensions to be used in the report. Between one and three. Possible values: CampaignId, AdvertiserId, Category, Hour, Day, Week, Month, Year. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Metrics&lt;/b&gt;: The metrics to be used in the report. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Format&lt;/b&gt;: The file format of the generated report. Possible values: Csv, Excel, Xml, Json &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Currency&lt;/b&gt;: The currency to be used in the report. Three-letter capitals. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Timezone&lt;/b&gt;: Timezone to be used in the report. Possible values: GMT, PST, JST. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;IgnoreXDevice&lt;/b&gt;: Ignore cross-device data. Also can explicitly set to null for TransactionID ReportType to get all data. Defaults to false. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;              Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through a CURL request or other programmatic methods.              &lt;h4&gt;Validation rules&lt;/h4&gt;              StartDate and EndDate are mandatory.&lt;br /&gt;              StartDate should come before, or be equal to EndDate.&lt;br /&gt;              The requested dimensions must be in a supported combination.&lt;br /&gt;              At least one metric must be provided.&lt;br /&gt;              All metrics must be supported.&lt;br /&gt;              The selected advertisers must have at least one campaign.&lt;br /&gt;              Seller dimension is not supported.&lt;br /&gt;&lt;h4&gt;Response custom headers&lt;/h4&gt;              If you are asking for a CampaignPerformance report and sales metrics are late, response will have a custom header &lt;b&gt;latest-available-sales&lt;/b&gt;, a datetime with format &lt;b&gt;yyyy-MM-dd HH:mm&lt;/b&gt; using the requested timezone.
     * @param authorization JWT Bearer Token (required)
     * @param statsQuery The report query details (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Statistics report generated OK. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, invalid syntax or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> No campaigns found. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getStatsWithHttpInfo(String authorization, StatsQueryMessageEx statsQuery) throws ApiException {
        okhttp3.Call localVarCall = getStatsValidateBeforeCall(authorization, statsQuery, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generates a statistics report (asynchronously)
     * &lt;b&gt;ReportType&lt;/b&gt;: The type of report to generate. Possible values: CampaignPerformance, FacebookDPA, TransactionID. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;AdvertiserIds&lt;/b&gt;: The list of advertiser ids, comma-separated. Advertisers not in your portfolio will be skipped. If not present, all the advertisers in the portfolio will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;StartDate, EndDate&lt;/b&gt;: Start date (beginning of day) and end date (end of day) to be used for the report generation. Format to use: yyyy-MM-dd (e.g. 2017-10-30). &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Dimensions&lt;/b&gt;: The dimensions to be used in the report. Between one and three. Possible values: CampaignId, AdvertiserId, Category, Hour, Day, Week, Month, Year. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Metrics&lt;/b&gt;: The metrics to be used in the report. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Format&lt;/b&gt;: The file format of the generated report. Possible values: Csv, Excel, Xml, Json &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Currency&lt;/b&gt;: The currency to be used in the report. Three-letter capitals. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Timezone&lt;/b&gt;: Timezone to be used in the report. Possible values: GMT, PST, JST. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;IgnoreXDevice&lt;/b&gt;: Ignore cross-device data. Also can explicitly set to null for TransactionID ReportType to get all data. Defaults to false. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;              Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through a CURL request or other programmatic methods.              &lt;h4&gt;Validation rules&lt;/h4&gt;              StartDate and EndDate are mandatory.&lt;br /&gt;              StartDate should come before, or be equal to EndDate.&lt;br /&gt;              The requested dimensions must be in a supported combination.&lt;br /&gt;              At least one metric must be provided.&lt;br /&gt;              All metrics must be supported.&lt;br /&gt;              The selected advertisers must have at least one campaign.&lt;br /&gt;              Seller dimension is not supported.&lt;br /&gt;&lt;h4&gt;Response custom headers&lt;/h4&gt;              If you are asking for a CampaignPerformance report and sales metrics are late, response will have a custom header &lt;b&gt;latest-available-sales&lt;/b&gt;, a datetime with format &lt;b&gt;yyyy-MM-dd HH:mm&lt;/b&gt; using the requested timezone.
     * @param authorization JWT Bearer Token (required)
     * @param statsQuery The report query details (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Statistics report generated OK. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, invalid syntax or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> No campaigns found. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Throttling failure. Maximum sending rate exceeded. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unknown error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatsAsync(String authorization, StatsQueryMessageEx statsQuery, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatsValidateBeforeCall(authorization, statsQuery, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
