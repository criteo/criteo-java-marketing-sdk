# CampaignsApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBids**](CampaignsApi.md#getBids) | **GET** /v1/campaigns/bids | Gets a the bids for campaigns and their categories
[**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /v1/campaigns/{campaignId} | Gets a specific campaign
[**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /v1/campaigns | Gets campaigns
[**getCategories**](CampaignsApi.md#getCategories) | **GET** /v1/campaigns/{campaignId}/categories | Gets categories
[**getCategory**](CampaignsApi.md#getCategory) | **GET** /v1/campaigns/{campaignId}/categories/{categoryHashCode} | Gets a specific category
[**updateBids**](CampaignsApi.md#updateBids) | **PUT** /v1/campaigns/bids | Update bids for campaigns and their categories


<a name="getBids"></a>
# **getBids**
> List&lt;CampaignBidMessage&gt; getBids(authorization, campaignIds, advertiserIds, categoryHashCodes, bidType, campaignStatus, pendingChanges)

Gets a the bids for campaigns and their categories

Get the campaigns&#39; bids, as well as the bids of their categories

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String campaignIds = "campaignIds_example"; // String | Optional. The ids of the campaigns we want to get the bids on. If not specified, advertiserIds will be used.
String advertiserIds = "advertiserIds_example"; // String | Optional. The ids of the advertisers' campaigns we want to get the bids on. If campaignIds not specified, and neither is advertiserIds, all the advertisers in the user's portfolio are used.
String categoryHashCodes = "categoryHashCodes_example"; // String | Optional. Filters only specified categories. By default no filtering is applied.
String bidType = "bidType_example"; // String | Optional. Filters by bid type. By default no filtering is applied.
String campaignStatus = "campaignStatus_example"; // String | Optional. Filters by campaign status. By default no filtering is applied.
Boolean pendingChanges = true; // Boolean | Optional. Filters only pending changes or settled ones. By default no filtering is applied.
try {
    List<CampaignBidMessage> result = apiInstance.getBids(authorization, campaignIds, advertiserIds, categoryHashCodes, bidType, campaignStatus, pendingChanges);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **campaignIds** | **String**| Optional. The ids of the campaigns we want to get the bids on. If not specified, advertiserIds will be used. | [optional]
 **advertiserIds** | **String**| Optional. The ids of the advertisers&#39; campaigns we want to get the bids on. If campaignIds not specified, and neither is advertiserIds, all the advertisers in the user&#39;s portfolio are used. | [optional]
 **categoryHashCodes** | **String**| Optional. Filters only specified categories. By default no filtering is applied. | [optional]
 **bidType** | **String**| Optional. Filters by bid type. By default no filtering is applied. | [optional] [enum: Unknown, CPC, COS, CPO]
 **campaignStatus** | **String**| Optional. Filters by campaign status. By default no filtering is applied. | [optional] [enum: Running, Archived, NotRunning]
 **pendingChanges** | **Boolean**| Optional. Filters only pending changes or settled ones. By default no filtering is applied. | [optional]

### Return type

[**List&lt;CampaignBidMessage&gt;**](CampaignBidMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getCampaign"></a>
# **getCampaign**
> CampaignMessage getCampaign(campaignId, authorization)

Gets a specific campaign

Get a specific campaign

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
Integer campaignId = 56; // Integer | Mandatory. The id of the campaign to return.
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    CampaignMessage result = apiInstance.getCampaign(campaignId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| Mandatory. The id of the campaign to return. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**CampaignMessage**](CampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getCampaigns"></a>
# **getCampaigns**
> List&lt;CampaignMessage&gt; getCampaigns(authorization, campaignIds, advertiserIds, campaignStatus, bidType)

Gets campaigns

Get the list of campaigns with the specified filters.  If a campaign is requested but is missing from current user&#39;s portfolio, it will not be included in the list.  If neither campaign ids nor advertisers ids are provided, then the user&#39;s portfolio will be used.

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String campaignIds = "campaignIds_example"; // String | Optional. One or more campaign ids, E.g., 78, 12932, 45236. If the campaign ids requested are not linked to advertisers in the user's portfolio, they will be skipped.
String advertiserIds = "advertiserIds_example"; // String | Optional. One or more advertiser ids, E.g., 78, 12932, 45236. If the advertiser ids requested are not part of the user's portfolio, they will be skipped.
String campaignStatus = "campaignStatus_example"; // String | Optional. Filters by campaign status. By default no filtering is applied.
String bidType = "bidType_example"; // String | Optional. Filters by campaign bid type. By default, no filtering is applied.
try {
    List<CampaignMessage> result = apiInstance.getCampaigns(authorization, campaignIds, advertiserIds, campaignStatus, bidType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **campaignIds** | **String**| Optional. One or more campaign ids, E.g., 78, 12932, 45236. If the campaign ids requested are not linked to advertisers in the user&#39;s portfolio, they will be skipped. | [optional]
 **advertiserIds** | **String**| Optional. One or more advertiser ids, E.g., 78, 12932, 45236. If the advertiser ids requested are not part of the user&#39;s portfolio, they will be skipped. | [optional]
 **campaignStatus** | **String**| Optional. Filters by campaign status. By default no filtering is applied. | [optional] [enum: Running, Archived, NotRunning]
 **bidType** | **String**| Optional. Filters by campaign bid type. By default, no filtering is applied. | [optional] [enum: Unknown, CPC, COS, CPO]

### Return type

[**List&lt;CampaignMessage&gt;**](CampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getCategories"></a>
# **getCategories**
> CategoryMessage getCategories(campaignId, authorization, enabledOnly)

Gets categories

Get the list of categories linked to the requested campaign.

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
Integer campaignId = 56; // Integer | Mandatory. The id of the campaign the categories are linked to.
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
Boolean enabledOnly = true; // Boolean | Optional. Returns only categories you can bid on. Defaults to false.
try {
    CategoryMessage result = apiInstance.getCategories(campaignId, authorization, enabledOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| Mandatory. The id of the campaign the categories are linked to. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **enabledOnly** | **Boolean**| Optional. Returns only categories you can bid on. Defaults to false. | [optional]

### Return type

[**CategoryMessage**](CategoryMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getCategory"></a>
# **getCategory**
> CategoryMessage getCategory(campaignId, categoryHashCode, authorization)

Gets a specific category

Get a specific category linked to the requested campaign.

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
Integer campaignId = 56; // Integer | Mandatory. The id of the campaign the categories are linked to.
Integer categoryHashCode = 56; // Integer | Mandatory. The id of the category to return.
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    CategoryMessage result = apiInstance.getCategory(campaignId, categoryHashCode, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| Mandatory. The id of the campaign the categories are linked to. |
 **categoryHashCode** | **Integer**| Mandatory. The id of the category to return. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**CategoryMessage**](CategoryMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="updateBids"></a>
# **updateBids**
> List&lt;CampaignMessage&gt; updateBids(authorization, bidChanges)

Update bids for campaigns and their categories

If a campaign bid is updated, all (if any) category bids for this campaign will be updated with the new value if they are initially equal to the campaign bid.  If the category bid is not wanted to be cascaded to the categories with the same bid value, new change bids must be added in the request for the categories where the value should be kept (with the initial value).

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
List<CampaignBidChangeRequest> bidChanges = Arrays.asList(null); // List<CampaignBidChangeRequest> | Specifies the list of bid changes to be applied.
try {
    List<CampaignMessage> result = apiInstance.updateBids(authorization, bidChanges);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **bidChanges** | [**List&lt;CampaignBidChangeRequest&gt;**](List.md)| Specifies the list of bid changes to be applied. |

### Return type

[**List&lt;CampaignMessage&gt;**](CampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

