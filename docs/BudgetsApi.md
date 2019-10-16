# BudgetsApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](BudgetsApi.md#get) | **GET** /v1/budgets | Gets budgets


<a name="get"></a>
# **get**
> List&lt;BudgetMessage&gt; get(authorization, advertiserIds, budgetIds, onlyActiveCampaigns)

Gets budgets

Get the list of budgets with the specified filters.  If an advertiser or a budget is requested but is missing from current user&#39;s portfolio, it will not be included in the list.  If neither budgets ids nor advertisers ids are provided, then the user&#39;s portfolio will be used.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String advertiserIds = "advertiserIds_example"; // String | Optional. One or more advertiser ids, E.g. 78, 12932, 45236. If the requested advertiser ids are not part of the user's portfolio, they will be skipped.
    String budgetIds = "budgetIds_example"; // String | Optional. One or more budget ids, E.g. 75, 1931, 532. If the requested budget ids are not part of the user's portfolio, they will be skipped.
    Boolean onlyActiveCampaigns = true; // Boolean | Optional. Filters by campaign status, allowing to only display active campaigns or not. Default value is true.
    try {
      List<BudgetMessage> result = apiInstance.get(authorization, advertiserIds, budgetIds, onlyActiveCampaigns);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#get");
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
 **advertiserIds** | **String**| Optional. One or more advertiser ids, E.g. 78, 12932, 45236. If the requested advertiser ids are not part of the user&#39;s portfolio, they will be skipped. | [optional]
 **budgetIds** | **String**| Optional. One or more budget ids, E.g. 75, 1931, 532. If the requested budget ids are not part of the user&#39;s portfolio, they will be skipped. | [optional]
 **onlyActiveCampaigns** | **Boolean**| Optional. Filters by campaign status, allowing to only display active campaigns or not. Default value is true. | [optional]

### Return type

[**List&lt;BudgetMessage&gt;**](BudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Budgets returned OK. |  -  |
**400** | No advertiser was specified and user does not have a portfolio. |  -  |
**401** | Authentication failed. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

