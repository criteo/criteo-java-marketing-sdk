# CategoriesApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /v1/categories | Gets categories
[**updateCategories**](CategoriesApi.md#updateCategories) | **PUT** /v1/categories | Enables/disables categories


<a name="getCategories"></a>
# **getCategories**
> List&lt;CategoryMessage&gt; getCategories(authorization, campaignIds, advertiserIds, categoryHashCodes, enabledOnly)

Gets categories

Get the list of categories with the specified filters.  If a category is requested but is missing from current user&#39;s portfolio, it will not be included in the list.  If neither campaign ids nor advertisers ids are provided, then the user&#39;s portfolio will be used.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String campaignIds = "campaignIds_example"; // String | Optional. One or more campaign ids, E.g., 78, 12932, 45236. If the campaign ids requested are not liked to advertisers in the user's portfolio, they will be skipped.
    String advertiserIds = "advertiserIds_example"; // String | Optional. One or more advertiser ids, E.g., 78, 12932, 45236. If the advertiser ids requested are not part of the user's portfolio, they will be skipped.
    String categoryHashCodes = "categoryHashCodes_example"; // String | Optional. One or more category hash codes.
    Boolean enabledOnly = true; // Boolean | Optional. Returns only categories you can bid on. Defaults to false.
    try {
      List<CategoryMessage> result = apiInstance.getCategories(authorization, campaignIds, advertiserIds, categoryHashCodes, enabledOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategories");
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
 **campaignIds** | **String**| Optional. One or more campaign ids, E.g., 78, 12932, 45236. If the campaign ids requested are not liked to advertisers in the user&#39;s portfolio, they will be skipped. | [optional]
 **advertiserIds** | **String**| Optional. One or more advertiser ids, E.g., 78, 12932, 45236. If the advertiser ids requested are not part of the user&#39;s portfolio, they will be skipped. | [optional]
 **categoryHashCodes** | **String**| Optional. One or more category hash codes. | [optional]
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
**400** | There is not even one valid advertiserId or campaignId requested. |  -  |
**401** | Authentication failed. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="updateCategories"></a>
# **updateCategories**
> List&lt;CategoryUpdatesPerCatalog&gt; updateCategories(authorization, categoriesPerCatalog)

Enables/disables categories

Update categories for multiple catalogs.&lt;br /&gt;  Please note that all validations need to pass before applying the requested changes;  the subsequent validation error messages will be returned in the response.&lt;br /&gt;  Please note that bidding will still happen for disabled categories, but using the Camapign&#39;s bid.  If the call is successful, full details about the changed categories will be returned.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    List<CategoryUpdatesPerCatalog> categoriesPerCatalog = Arrays.asList(); // List<CategoryUpdatesPerCatalog> | The list of categories to be enabled/disabled, grouped by catalog.
    try {
      List<CategoryUpdatesPerCatalog> result = apiInstance.updateCategories(authorization, categoriesPerCatalog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#updateCategories");
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
 **categoriesPerCatalog** | [**List&lt;CategoryUpdatesPerCatalog&gt;**](CategoryUpdatesPerCatalog.md)| The list of categories to be enabled/disabled, grouped by catalog. |

### Return type

[**List&lt;CategoryUpdatesPerCatalog&gt;**](CategoryUpdatesPerCatalog.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Categories updated OK. |  -  |
**400** | Invalid input. Please check returned message for details. |  -  |
**401** | Authentication failed. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

