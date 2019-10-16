# PublishersApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStats**](PublishersApi.md#getStats) | **POST** /v1/publishers/stats | 


<a name="getStats"></a>
# **getStats**
> List&lt;PublisherStatsMessage&gt; getStats(authorization, queryMessage)



### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.PublishersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PublishersApi apiInstance = new PublishersApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    PublisherStatsQueryMessage queryMessage = new PublisherStatsQueryMessage(); // PublisherStatsQueryMessage | 
    try {
      List<PublisherStatsMessage> result = apiInstance.getStats(authorization, queryMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublishersApi#getStats");
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
 **queryMessage** | [**PublisherStatsQueryMessage**](PublisherStatsQueryMessage.md)|  |

### Return type

[**List&lt;PublisherStatsMessage&gt;**](PublisherStatsMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Stats returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | API account not eligible to use this feature. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

