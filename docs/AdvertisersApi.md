# AdvertisersApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaigns**](AdvertisersApi.md#getCampaigns) | **GET** /v1/advertisers/{advertiserId}/campaigns | Gets all advertiser&#39;s campaigns
[**getCategories**](AdvertisersApi.md#getCategories) | **GET** /v1/advertisers/{advertiserId}/categories | Gets all advertiser&#39;s categories
[**getCategory**](AdvertisersApi.md#getCategory) | **GET** /v1/advertisers/{advertiserId}/categories/{categoryHashCode} | Gets a specific advertiser&#39;s category


<a name="getCampaigns"></a>
# **getCampaigns**
> List&lt;CampaignMessage&gt; getCampaigns(advertiserId, authorization)

Gets all advertiser&#39;s campaigns

Get the list of all the campaigns linked to the requested advertiser.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AdvertisersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AdvertisersApi apiInstance = new AdvertisersApi(defaultClient);
    Integer advertiserId = 56; // Integer | Mandatory. The id of the advertiser to return.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      List<CampaignMessage> result = apiInstance.getCampaigns(advertiserId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisersApi#getCampaigns");
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
 **advertiserId** | **Integer**| Mandatory. The id of the advertiser to return. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**List&lt;CampaignMessage&gt;**](CampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Campaigns returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user’s portfolio. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getCategories"></a>
# **getCategories**
> List&lt;CategoryMessage&gt; getCategories(advertiserId, authorization, enabledOnly)

Gets all advertiser&#39;s categories

Get the list of all the categories linked to the requested advertiser.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AdvertisersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AdvertisersApi apiInstance = new AdvertisersApi(defaultClient);
    Integer advertiserId = 56; // Integer | Mandatory. The id of the advertiser to return.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    Boolean enabledOnly = true; // Boolean | Optional. Returns only categories you can bid on. Defaults to false.
    try {
      List<CategoryMessage> result = apiInstance.getCategories(advertiserId, authorization, enabledOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisersApi#getCategories");
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
 **advertiserId** | **Integer**| Mandatory. The id of the advertiser to return. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **enabledOnly** | **Boolean**| Optional. Returns only categories you can bid on. Defaults to false. | [optional]

### Return type

[**List&lt;CategoryMessage&gt;**](CategoryMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Categories returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user’s portfolio. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getCategory"></a>
# **getCategory**
> List&lt;CategoryMessage&gt; getCategory(advertiserId, categoryHashCode, authorization)

Gets a specific advertiser&#39;s category

Get a specific category linked to the requested advertiser.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AdvertisersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AdvertisersApi apiInstance = new AdvertisersApi(defaultClient);
    Integer advertiserId = 56; // Integer | Mandatory. The id of the advertiser to return.
    Integer categoryHashCode = 56; // Integer | Mandatory. The id of the category to return.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      List<CategoryMessage> result = apiInstance.getCategory(advertiserId, categoryHashCode, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisersApi#getCategory");
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
 **advertiserId** | **Integer**| Mandatory. The id of the advertiser to return. |
 **categoryHashCode** | **Integer**| Mandatory. The id of the category to return. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**List&lt;CategoryMessage&gt;**](CategoryMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Category returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user’s portfolio. |  -  |
**404** | The requested category was not found for the advertiser. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

