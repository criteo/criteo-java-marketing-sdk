# StatisticsApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStats**](StatisticsApi.md#getStats) | **POST** /v1/statistics | Generates a statistics report


<a name="getStats"></a>
# **getStats**
> byte[] getStats(authorization, statsQuery)

Generates a statistics report

&lt;b&gt;ReportType&lt;/b&gt;: The type of report to generate. Possible values: CampaignPerformance, FacebookDPA, TransactionID. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;AdvertiserIds&lt;/b&gt;: The list of advertiser ids, comma-separated. Advertisers not in your portfolio will be skipped. If not present, all the advertisers in the portfolio will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;StartDate, EndDate&lt;/b&gt;: Start date (beginning of day) and end date (end of day) to be used for the report generation. Format to use: yyyy-MM-dd (e.g. 2017-10-30). &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Dimensions&lt;/b&gt;: The dimensions to be used in the report. Between one and three. Possible values: CampaignId, AdvertiserId, Category, Hour, Day, Week, Month, Year. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Metrics&lt;/b&gt;: The metrics to be used in the report. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Format&lt;/b&gt;: The file format of the generated report. Possible values: Csv, Excel, Xml, Json &lt;i&gt;(mandatory)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Currency&lt;/b&gt;: The currency to be used in the report. Three-letter capitals. For a list of possible values, please see &lt;a href&#x3D;\&quot;https://support.criteo.com/s/article?article&#x3D;Criteo-Marketing-API-Intro\&quot;&gt;the full documentation&lt;/a&gt;. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;Timezone&lt;/b&gt;: Timezone to be used in the report. Possible values: GMT, PST, JST. If not set, the user&#39;s preference setting will be used. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;b&gt;IgnoreXDevice&lt;/b&gt;: Ignore cross-device data. Also can explicitly set to null for TransactionID ReportType to get all data. Defaults to false. &lt;i&gt;(optional)&lt;/i&gt;&lt;br /&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;              Statistic export in a file might be corrupted through Swagger. It&#39;s recommended to access this file through a CURL request or other programmatic methods.              &lt;h4&gt;Validation rules&lt;/h4&gt;              StartDate and EndDate are mandatory.&lt;br /&gt;              StartDate should come before, or be equal to EndDate.&lt;br /&gt;              The requested dimensions must be in a supported combination.&lt;br /&gt;              At least one metric must be provided.&lt;br /&gt;              All metrics must be supported.&lt;br /&gt;              The selected advertisers must have at least one campaign.&lt;br /&gt;              Seller dimension is not supported.&lt;br /&gt;&lt;h4&gt;Response custom headers&lt;/h4&gt;              If you are asking for a CampaignPerformance report and sales metrics are late, response will have a custom header &lt;b&gt;latest-available-sales&lt;/b&gt;, a datetime with format &lt;b&gt;yyyy-MM-dd HH:mm&lt;/b&gt; using the requested timezone.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    StatsQueryMessageEx statsQuery = new StatsQueryMessageEx(); // StatsQueryMessageEx | The report query details
    try {
      byte[] result = apiInstance.getStats(authorization, statsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#getStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **statsQuery** | [**StatsQueryMessageEx**](StatsQueryMessageEx.md)| The report query details |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Statistics report generated OK. |  -  |
**400** | Bad request, invalid syntax or validation error. |  -  |
**401** | Authentication failed. |  -  |
**403** | No campaigns found. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

