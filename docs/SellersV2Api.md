# SellersV2Api

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSellerBudgets**](SellersV2Api.md#createSellerBudgets) | **POST** /v2/crp/budgets | 
[**getBudgetsBySeller**](SellersV2Api.md#getBudgetsBySeller) | **GET** /v2/crp/sellers/{sellerId}/budgets | 
[**getBudgetsBySellerCampaignId**](SellersV2Api.md#getBudgetsBySellerCampaignId) | **GET** /v2/crp/seller-campaigns/{sellerCampaignId}/budgets | 
[**getSeller**](SellersV2Api.md#getSeller) | **GET** /v2/crp/sellers/{sellerId} | 
[**getSellerBudget**](SellersV2Api.md#getSellerBudget) | **GET** /v2/crp/budgets/{budgetId} | 
[**getSellerBudgets**](SellersV2Api.md#getSellerBudgets) | **GET** /v2/crp/budgets | 
[**getSellerCampaign**](SellersV2Api.md#getSellerCampaign) | **GET** /v2/crp/seller-campaigns/{sellerCampaignId} | 
[**getSellerCampaigns**](SellersV2Api.md#getSellerCampaigns) | **GET** /v2/crp/seller-campaigns | 
[**getSellerCampaignsBySeller**](SellersV2Api.md#getSellerCampaignsBySeller) | **GET** /v2/crp/sellers/{sellerId}/seller-campaigns | 
[**getSellers**](SellersV2Api.md#getSellers) | **GET** /v2/crp/sellers | 
[**updateSellerBudget**](SellersV2Api.md#updateSellerBudget) | **PATCH** /v2/crp/budgets/{budgetId} | 
[**updateSellerBudgets**](SellersV2Api.md#updateSellerBudgets) | **PATCH** /v2/crp/budgets | 
[**updateSellerCampaign**](SellersV2Api.md#updateSellerCampaign) | **PATCH** /v2/crp/seller-campaigns/{sellerCampaignId} | 
[**updateSellerCampaigns**](SellersV2Api.md#updateSellerCampaigns) | **PATCH** /v2/crp/seller-campaigns | 


<a name="createSellerBudgets"></a>
# **createSellerBudgets**
> List&lt;SellerBudgetMessage&gt; createSellerBudgets(authorization, createSellerBudgets)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
List<CreateSellerBudgetMapiMessage> createSellerBudgets = Arrays.asList(null); // List<CreateSellerBudgetMapiMessage> | 
try {
    List<SellerBudgetMessage> result = apiInstance.createSellerBudgets(authorization, createSellerBudgets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#createSellerBudgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **createSellerBudgets** | [**List&lt;CreateSellerBudgetMapiMessage&gt;**](List.md)|  |

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getBudgetsBySeller"></a>
# **getBudgetsBySeller**
> List&lt;SellerBudgetMessage&gt; getBudgetsBySeller(sellerId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
Long sellerId = 56L; // Long | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String status = "status_example"; // String | 
Boolean withBalance = true; // Boolean | 
Boolean withSpend = true; // Boolean | 
OffsetDateTime endAfterDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime startBeforeDate = new OffsetDateTime(); // OffsetDateTime | 
Integer campaignId = 56; // Integer | 
try {
    List<SellerBudgetMessage> result = apiInstance.getBudgetsBySeller(sellerId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getBudgetsBySeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **Long**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **status** | **String**|  | [optional] [enum: Inactive, Active]
 **withBalance** | **Boolean**|  | [optional]
 **withSpend** | **Boolean**|  | [optional]
 **endAfterDate** | **OffsetDateTime**|  | [optional]
 **startBeforeDate** | **OffsetDateTime**|  | [optional]
 **campaignId** | **Integer**|  | [optional]

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getBudgetsBySellerCampaignId"></a>
# **getBudgetsBySellerCampaignId**
> List&lt;SellerBudgetMessage&gt; getBudgetsBySellerCampaignId(sellerCampaignId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String sellerCampaignId = "sellerCampaignId_example"; // String | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String status = "status_example"; // String | 
Boolean withBalance = true; // Boolean | 
Boolean withSpend = true; // Boolean | 
OffsetDateTime endAfterDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime startBeforeDate = new OffsetDateTime(); // OffsetDateTime | 
try {
    List<SellerBudgetMessage> result = apiInstance.getBudgetsBySellerCampaignId(sellerCampaignId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getBudgetsBySellerCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerCampaignId** | **String**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **status** | **String**|  | [optional] [enum: Inactive, Active]
 **withBalance** | **Boolean**|  | [optional]
 **withSpend** | **Boolean**|  | [optional]
 **endAfterDate** | **OffsetDateTime**|  | [optional]
 **startBeforeDate** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getSeller"></a>
# **getSeller**
> SellerBase getSeller(sellerId, authorization)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
Long sellerId = 56L; // Long | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    SellerBase result = apiInstance.getSeller(sellerId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **Long**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerBase**](SellerBase.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getSellerBudget"></a>
# **getSellerBudget**
> SellerBudgetMessage getSellerBudget(budgetId, authorization)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
Long budgetId = 56L; // Long | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    SellerBudgetMessage result = apiInstance.getSellerBudget(budgetId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSellerBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | **Long**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerBudgetMessage**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="getSellerBudgets"></a>
# **getSellerBudgets**
> List&lt;SellerBudgetMessage&gt; getSellerBudgets(authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId, sellerId)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String status = "status_example"; // String | 
Boolean withBalance = true; // Boolean | 
Boolean withSpend = true; // Boolean | 
OffsetDateTime endAfterDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime startBeforeDate = new OffsetDateTime(); // OffsetDateTime | 
Integer campaignId = 56; // Integer | 
Long sellerId = 56L; // Long | 
try {
    List<SellerBudgetMessage> result = apiInstance.getSellerBudgets(authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId, sellerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSellerBudgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **status** | **String**|  | [optional] [enum: Inactive, Active]
 **withBalance** | **Boolean**|  | [optional]
 **withSpend** | **Boolean**|  | [optional]
 **endAfterDate** | **OffsetDateTime**|  | [optional]
 **startBeforeDate** | **OffsetDateTime**|  | [optional]
 **campaignId** | **Integer**|  | [optional]
 **sellerId** | **Long**|  | [optional]

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getSellerCampaign"></a>
# **getSellerCampaign**
> SellerCampaignMessage getSellerCampaign(sellerCampaignId, authorization)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String sellerCampaignId = "sellerCampaignId_example"; // String | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    SellerCampaignMessage result = apiInstance.getSellerCampaign(sellerCampaignId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSellerCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerCampaignId** | **String**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerCampaignMessage**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="getSellerCampaigns"></a>
# **getSellerCampaigns**
> List&lt;SellerCampaignMessage&gt; getSellerCampaigns(authorization, sellerStatus, sellerId, campaignId, budgetStatus)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String sellerStatus = "sellerStatus_example"; // String | 
Long sellerId = 56L; // Long | 
Integer campaignId = 56; // Integer | 
String budgetStatus = "budgetStatus_example"; // String | 
try {
    List<SellerCampaignMessage> result = apiInstance.getSellerCampaigns(authorization, sellerStatus, sellerId, campaignId, budgetStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSellerCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerStatus** | **String**|  | [optional] [enum: Inactive, Active]
 **sellerId** | **Long**|  | [optional]
 **campaignId** | **Integer**|  | [optional]
 **budgetStatus** | **String**|  | [optional] [enum: Inactive, Active]

### Return type

[**List&lt;SellerCampaignMessage&gt;**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getSellerCampaignsBySeller"></a>
# **getSellerCampaignsBySeller**
> List&lt;SellerCampaignMessage&gt; getSellerCampaignsBySeller(sellerId, authorization, sellerStatus, campaignId, budgetStatus)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
Long sellerId = 56L; // Long | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String sellerStatus = "sellerStatus_example"; // String | 
Integer campaignId = 56; // Integer | 
String budgetStatus = "budgetStatus_example"; // String | 
try {
    List<SellerCampaignMessage> result = apiInstance.getSellerCampaignsBySeller(sellerId, authorization, sellerStatus, campaignId, budgetStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSellerCampaignsBySeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **Long**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerStatus** | **String**|  | [optional] [enum: Inactive, Active]
 **campaignId** | **Integer**|  | [optional]
 **budgetStatus** | **String**|  | [optional] [enum: Inactive, Active]

### Return type

[**List&lt;SellerCampaignMessage&gt;**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="getSellers"></a>
# **getSellers**
> List&lt;SellerBase&gt; getSellers(authorization, sellerStatus, withProducts, withBudgetStatus)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
String sellerStatus = "sellerStatus_example"; // String | 
Boolean withProducts = true; // Boolean | 
String withBudgetStatus = "withBudgetStatus_example"; // String | 
try {
    List<SellerBase> result = apiInstance.getSellers(authorization, sellerStatus, withProducts, withBudgetStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#getSellers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerStatus** | **String**|  | [optional] [enum: Inactive, Active]
 **withProducts** | **Boolean**|  | [optional]
 **withBudgetStatus** | **String**|  | [optional] [enum: Inactive, Active]

### Return type

[**List&lt;SellerBase&gt;**](SellerBase.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="updateSellerBudget"></a>
# **updateSellerBudget**
> List&lt;SellerBudgetMessage&gt; updateSellerBudget(budgetId, startDate, status, amount, endDate, authorization, campaignIds)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
Long budgetId = 56L; // Long | 
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
String status = "status_example"; // String | 
String amount = "amount_example"; // String | 
String endDate = "endDate_example"; // String | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
List<Integer> campaignIds = Arrays.asList(); // List<Integer> | 
try {
    List<SellerBudgetMessage> result = apiInstance.updateSellerBudget(budgetId, startDate, status, amount, endDate, authorization, campaignIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#updateSellerBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | **Long**|  |
 **startDate** | **OffsetDateTime**|  |
 **status** | **String**|  | [enum: Inactive, Active]
 **amount** | **String**|  |
 **endDate** | **String**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **campaignIds** | [**List&lt;Integer&gt;**](List.md)|  |

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="updateSellerBudgets"></a>
# **updateSellerBudgets**
> List&lt;SellerBudgetMessage&gt; updateSellerBudgets(authorization, updateSellerBudgets)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
List<UpdateSellerBudgetMessage> updateSellerBudgets = Arrays.asList(null); // List<UpdateSellerBudgetMessage> | 
try {
    List<SellerBudgetMessage> result = apiInstance.updateSellerBudgets(authorization, updateSellerBudgets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#updateSellerBudgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **updateSellerBudgets** | [**List&lt;UpdateSellerBudgetMessage&gt;**](List.md)|  |

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

<a name="updateSellerCampaign"></a>
# **updateSellerCampaign**
> SellerCampaignMessage updateSellerCampaign(sellerCampaignId, bid, authorization)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String sellerCampaignId = "sellerCampaignId_example"; // String | 
Double bid = 3.4D; // Double | 
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    SellerCampaignMessage result = apiInstance.updateSellerCampaign(sellerCampaignId, bid, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#updateSellerCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerCampaignId** | **String**|  |
 **bid** | **Double**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerCampaignMessage**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="updateSellerCampaigns"></a>
# **updateSellerCampaigns**
> List&lt;SellerCampaignMessage&gt; updateSellerCampaigns(authorization, campaignMessages)



### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.SellersV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SellersV2Api apiInstance = new SellersV2Api();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
List<SellerCampaignBase> campaignMessages = Arrays.asList(null); // List<SellerCampaignBase> | 
try {
    List<SellerCampaignMessage> result = apiInstance.updateSellerCampaigns(authorization, campaignMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SellersV2Api#updateSellerCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **campaignMessages** | [**List&lt;SellerCampaignBase&gt;**](List.md)|  |

### Return type

[**List&lt;SellerCampaignMessage&gt;**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

