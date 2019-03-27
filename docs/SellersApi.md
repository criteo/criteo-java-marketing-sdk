# SellersApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBudgets**](SellersApi.md#createBudgets) | **POST** /v1/sellers/budgets | Creates a budget for a seller/list of sellers.
[**get**](SellersApi.md#get) | **GET** /v1/sellers | Gets sellers details.
[**getCampaigns**](SellersApi.md#getCampaigns) | **GET** /v1/sellers/campaigns | Gets campaigns
[**getStats**](SellersApi.md#getStats) | **POST** /v1/sellers/stats | Generates a statistics report
[**updateBids**](SellersApi.md#updateBids) | **PUT** /v1/sellers/bids | Set or update a bid for a seller/list of sellers.
[**updateBudgets**](SellersApi.md#updateBudgets) | **PUT** /v1/sellers/budgets | Updates a budget for a seller/list of sellers.


<a name="createBudgets"></a>
# **createBudgets**
> SellerBudgetsMessage createBudgets(authorization, sellerBudgets)

Creates a budget for a seller/list of sellers.

&lt;b&gt;Seller name&lt;/b&gt;: can be retrieved from the /sellers/ endpoint. This value is case insensitive.&lt;br /&gt;&lt;b&gt;Amount&lt;/b&gt;: in your currency. Set it to \&quot;null\&quot; or leave empty to create an uncapped budget (with no limit).&lt;br /&gt;&lt;h4&gt;Response&lt;/h4&gt;&lt;p&gt;              The budget&#39;s start date will be set to:&lt;br /&gt;              • today: in case no budget is currently set for this seller&lt;br /&gt;              • tomorrow: in case your seller already has a budget running, ending at midnight. Note that start dates are UTC+00:00 based.&lt;br /&gt;              The budget will remain active until being completely consumed or stopped.&lt;br /&gt;&lt;/p&gt;&lt;h4&gt;Validation rules&lt;/h4&gt;&lt;p&gt;              Budgets cannot &lt;b&gt;overlap&lt;/b&gt; with each other for a specific seller.&lt;br /&gt;&lt;/p&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;&lt;p&gt;              When a seller&#39;s budget is totally consumed, display delivery will automatically stop for this specific seller.&lt;br /&gt;              If budget needs to be updated, by: adding fund, reducing a budget amount or stopping it, refer to the “update budget” endpoint.&lt;br /&gt;&lt;/p&gt;

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersApi apiInstance = new SellersApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
SellerBudgetsCreateMessage sellerBudgets = new SellerBudgetsCreateMessage(); // SellerBudgetsCreateMessage | 
try {
    SellerBudgetsMessage result = apiInstance.createBudgets(authorization, sellerBudgets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersApi#createBudgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerBudgets** | [**SellerBudgetsCreateMessage**](SellerBudgetsCreateMessage.md)|  |

### Return type

[**SellerBudgetsMessage**](SellerBudgetsMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="get"></a>
# **get**
> List&lt;SellerMessage&gt; get(authorization, campaignIds, onlyActiveSellers, onlySellersWithProductsInCatalog, onlyActiveBudgets)

Gets sellers details.

Returns a list of sellers with all their details.&lt;br /&gt;  By default, this list will contain all active sellers that have been on-boarded onto the Criteo Reseller Program.&lt;br /&gt;  Note that (in the situation where you would have multiple Criteo Reseller Program campaigns running at the same time) campaign filter can be applied to restrict the response to one or multiple campaign ids.&lt;br /&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;&lt;p&gt;  Only currently running and future seller budgets will be retrieved. Past sellers&#39; budgets can be retrieved from the statistics endpoint.&lt;br /&gt;  Seller&#39;s status has 2 possible values - Active or Inactive - which corresponds to:&lt;br /&gt;  • &lt;b&gt;Active&lt;/b&gt;: Seller in a running campaign, with a bid (CPC) and a budget &amp;gt; 0&lt;br /&gt;  • &lt;b&gt;Inactive&lt;/b&gt;: Seller with a budget consumed or that you explicitly stopped.&lt;br /&gt;&lt;/p&gt;

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersApi apiInstance = new SellersApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String campaignIds = "campaignIds_example"; // String | Optional. One or more campaign ids, E.g., 78, 12932, 45236. If any of the requested campaign ids are not Criteo Reseller Program or are not liked to advertisers in the user's portfolio, the call will fail.
Boolean onlyActiveSellers = true; // Boolean | Optional. Filters by seller status, allowing to only display active sellers or not. Default value is false.
Boolean onlySellersWithProductsInCatalog = true; // Boolean | Optional. Only return sellers that have currently products in the catalog. Default value is false.
Boolean onlyActiveBudgets = true; // Boolean | Optional. Will return only active budget for each seller. Default value is false
try {
    List<SellerMessage> result = apiInstance.get(authorization, campaignIds, onlyActiveSellers, onlySellersWithProductsInCatalog, onlyActiveBudgets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **campaignIds** | **String**| Optional. One or more campaign ids, E.g., 78, 12932, 45236. If any of the requested campaign ids are not Criteo Reseller Program or are not liked to advertisers in the user&#39;s portfolio, the call will fail. | [optional]
 **onlyActiveSellers** | **Boolean**| Optional. Filters by seller status, allowing to only display active sellers or not. Default value is false. | [optional]
 **onlySellersWithProductsInCatalog** | **Boolean**| Optional. Only return sellers that have currently products in the catalog. Default value is false. | [optional]
 **onlyActiveBudgets** | **Boolean**| Optional. Will return only active budget for each seller. Default value is false | [optional]

### Return type

[**List&lt;SellerMessage&gt;**](SellerMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getCampaigns"></a>
# **getCampaigns**
> List&lt;MarketplaceCampaignMessage&gt; getCampaigns(authorization, campaignIds, advertiserIds, status)

Gets campaigns

Get the list of campaigns with the specified filters.  If a campaign is requested but is missing from current user&#39;s portfolio, it will not be included in the list.  If neither campaign ids nor advertisers ids are provided, then the user&#39;s portfolio will be used.

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersApi apiInstance = new SellersApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String campaignIds = "campaignIds_example"; // String | Optional. One or more campaign ids, E.g. 78, 12932, 45236. If any of the requested campaign ids are not Criteo Reseller Program or are not liked to advertisers in the user's portfolio, the call will fail.
String advertiserIds = "advertiserIds_example"; // String | Optional. One or more advertiser ids, E.g. 78, 12932, 45236. If the requested advertiser ids are not part of the user's portfolio, the call will fail.
String status = "status_example"; // String | Optional. Status of the campaign. By default, all campaigns are returned, regardless of their status.
try {
    List<MarketplaceCampaignMessage> result = apiInstance.getCampaigns(authorization, campaignIds, advertiserIds, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersApi#getCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **campaignIds** | **String**| Optional. One or more campaign ids, E.g. 78, 12932, 45236. If any of the requested campaign ids are not Criteo Reseller Program or are not liked to advertisers in the user&#39;s portfolio, the call will fail. | [optional]
 **advertiserIds** | **String**| Optional. One or more advertiser ids, E.g. 78, 12932, 45236. If the requested advertiser ids are not part of the user&#39;s portfolio, the call will fail. | [optional]
 **status** | **String**| Optional. Status of the campaign. By default, all campaigns are returned, regardless of their status. | [optional] [enum: Running, Archived, NotRunning]

### Return type

[**List&lt;MarketplaceCampaignMessage&gt;**](MarketplaceCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getStats"></a>
# **getStats**
> getStats(authorization, statsQuery)

Generates a statistics report

&lt;b&gt;AdvertiserIds&lt;/b&gt;: Optional. The list of advertiser ids, comma-separated. Advertisers not in your portfolio will be skipped. If not present, all the advertisers in the portfolio will be used.&lt;br /&gt;&lt;b&gt;StartDate, EndDate&lt;/b&gt;: Start date (beginning of day) and end date (end of day) to be used for the report generation. Format to use: yyyy-MM-dd (e.g. 2017-10-30).&lt;br /&gt;&lt;b&gt;Dimensions&lt;/b&gt;: The dimensions to be used in the report. Between one and three. Possible values: CampaignId, AdvertiserId, Seller, Day, Week, Month, Year.&lt;br /&gt;&lt;b&gt;Metrics&lt;/b&gt;: The metrics to be used in the report. Possible values: Clicks, AdvertiserCost, Displays.&lt;br /&gt;&lt;b&gt;Format&lt;/b&gt;: The file format of the generated report. Possible values: Csv, Excel, Xml, Json.&lt;br /&gt;&lt;b&gt;Currency&lt;/b&gt;: Optional. The currency to be used in the report. Three-letter capitals. For a list of possible values, please see the full documentation. If not set, the user&#39;s preference setting will be used.&lt;br /&gt;&lt;b&gt;Timezone&lt;/b&gt;: Optional. Timezone to be used in the report. Possible values: GMT, PST, JST. If not set, the user&#39;s preference setting will be used.&lt;br /&gt;&lt;h4&gt;Validation rules&lt;/h4&gt;              StartDate and EndDate are mandatory.&lt;br /&gt;              StartDate should come before, or be equal to EndDate.&lt;br /&gt;              The requested dimensions must be in a supported combination.&lt;br /&gt;              At least one metric must be provided.&lt;br /&gt;              All metrics must be supported.&lt;br /&gt;              The selected advertisers must have at least one campaign.&lt;br /&gt;              Seller dimension is mandatory.&lt;br /&gt;

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersApi apiInstance = new SellersApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
StatsQueryMessage statsQuery = new StatsQueryMessage(); // StatsQueryMessage | The report query details
try {
    apiInstance.getStats(authorization, statsQuery);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersApi#getStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **statsQuery** | [**StatsQueryMessage**](StatsQueryMessage.md)| The report query details |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: Not defined

<a name="updateBids"></a>
# **updateBids**
> SellerBidsMessage updateBids(authorization, sellerBids)

Set or update a bid for a seller/list of sellers.

&lt;b&gt;Seller name&lt;/b&gt;: can be retrieved from the /sellers/ endpoint. This value is case insensitive.              &lt;h4&gt;Functional cases&lt;/h4&gt;&lt;p&gt;              In case one of the bid values cannot be updated, the whole batch will be dropped.&lt;br /&gt;&lt;/p&gt;

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersApi apiInstance = new SellersApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
SellerBidsMessage sellerBids = new SellerBidsMessage(); // SellerBidsMessage | 
try {
    SellerBidsMessage result = apiInstance.updateBids(authorization, sellerBids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersApi#updateBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerBids** | [**SellerBidsMessage**](SellerBidsMessage.md)|  |

### Return type

[**SellerBidsMessage**](SellerBidsMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="updateBudgets"></a>
# **updateBudgets**
> SellerBudgetsMessage updateBudgets(authorization, sellerBudgets)

Updates a budget for a seller/list of sellers.

&lt;b&gt;Amount&lt;/b&gt;: Optional. Uses the advertiser&#39;s currency. Set it to \&quot;null\&quot; or leave empty to create an uncapped budget (with no limit).&lt;br /&gt;&lt;b&gt;Status&lt;/b&gt;: Optional. Budget&#39;s status, possible values are: [\&quot;Inactive\&quot;,\&quot;Active\&quot;]. If set to null or undefined, status does not change.              &lt;h4&gt;Validation rules&lt;/h4&gt;&lt;p&gt;              Budgets cannot &lt;b&gt;overlap&lt;/b&gt; with each other for a specific seller.&lt;br /&gt;              Budget&#39;s &lt;b&gt;amount&lt;/b&gt; can be decreased if it did not start yet.&lt;br /&gt;              Budget&#39;s &lt;b&gt;status&lt;/b&gt; can only be changed from \&quot;Active\&quot; to \&quot;Inactive\&quot;, if budget already started.&lt;br /&gt;&lt;b&gt;Inactive&lt;/b&gt; budgets cannot be updated.              &lt;/p&gt;&lt;h4&gt;Functional cases&lt;/h4&gt;&lt;h5&gt;Increase budget amount&lt;/h5&gt;&lt;p&gt;              Budget can only be increased if its end date is not reached.&lt;br /&gt;              Amount value must include the amount that has been already spent.&lt;br /&gt;              Example: if you want to add 50€ to a 100€ budget, you should update the amount to 150€, regardless of the amount already spent.&lt;br /&gt;              Or, alternatively, you can set it to \&quot;null\&quot; or leave empty to change the budget to uncapped.&lt;br /&gt;&lt;/p&gt;&lt;h5&gt;Stop budget consumption&lt;/h5&gt;&lt;p&gt;              Setting a currently running budget’s status to Inactive, result in:&lt;br /&gt;              • Setting its end date to today (at 23:59:59, according to UTC+00:00)&lt;br /&gt;              • Stopping its consumption instantly&lt;br /&gt;&lt;/p&gt;&lt;h5&gt;Decrease budget amount&lt;/h5&gt;&lt;p&gt;              In order to decrease the amount of a currently running budget, you have to:&lt;br /&gt;              • Stop budget consumption (making the currently running budget to end at 23:59:59, according to UTC+00:00)&lt;br /&gt;              • Create a new budget with a dedicated amount. (that will start the following day, according to UTC+00:00)&lt;br /&gt;&lt;/p&gt;

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersApi apiInstance = new SellersApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
SellerBudgetsUpdateMessage sellerBudgets = new SellerBudgetsUpdateMessage(); // SellerBudgetsUpdateMessage | 
try {
    SellerBudgetsMessage result = apiInstance.updateBudgets(authorization, sellerBudgets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersApi#updateBudgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerBudgets** | [**SellerBudgetsUpdateMessage**](SellerBudgetsUpdateMessage.md)|  |

### Return type

[**SellerBudgetsMessage**](SellerBudgetsMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

