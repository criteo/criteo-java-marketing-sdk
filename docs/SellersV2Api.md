# SellersV2Api

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSellerBudgets**](SellersV2Api.md#createSellerBudgets) | **POST** /v2/crp/budgets | Create a collection of budgets.
[**createSellerCampaignsBySeller**](SellersV2Api.md#createSellerCampaignsBySeller) | **POST** /v2/crp/sellers/{sellerId}/seller-campaigns | Create a SellerCampaign
[**createSellers**](SellersV2Api.md#createSellers) | **POST** /v2/crp/advertisers/{advertiserId}/sellers | Create new sellers for an advertiser
[**getAdvertiser**](SellersV2Api.md#getAdvertiser) | **GET** /v2/crp/advertisers/{advertiserId} | Get an advertiser.
[**getAdvertiserCampaigns**](SellersV2Api.md#getAdvertiserCampaigns) | **GET** /v2/crp/advertisers/{advertiserId}/campaigns | Get the collection of CRP campaigns associated with the advertiserId.
[**getAdvertisers**](SellersV2Api.md#getAdvertisers) | **GET** /v2/crp/advertisers | Get the collection of advertisers associated with the user.
[**getBudgetsBySeller**](SellersV2Api.md#getBudgetsBySeller) | **GET** /v2/crp/sellers/{sellerId}/budgets | Get a collection of budgets for this seller.
[**getBudgetsBySellerCampaignId**](SellersV2Api.md#getBudgetsBySellerCampaignId) | **GET** /v2/crp/seller-campaigns/{sellerCampaignId}/budgets | Get a collection of budgets for this seller campaign.
[**getSeller**](SellersV2Api.md#getSeller) | **GET** /v2/crp/sellers/{sellerId} | Get details for a seller.
[**getSellerBudget**](SellersV2Api.md#getSellerBudget) | **GET** /v2/crp/budgets/{budgetId} | Get details for a budget.
[**getSellerBudgets**](SellersV2Api.md#getSellerBudgets) | **GET** /v2/crp/budgets | Get a collection of budgets.
[**getSellerCampaign**](SellersV2Api.md#getSellerCampaign) | **GET** /v2/crp/seller-campaigns/{sellerCampaignId} | Get details for a seller campaign.
[**getSellerCampaigns**](SellersV2Api.md#getSellerCampaigns) | **GET** /v2/crp/seller-campaigns | Get a collection of seller campaigns.
[**getSellerCampaignsBySeller**](SellersV2Api.md#getSellerCampaignsBySeller) | **GET** /v2/crp/sellers/{sellerId}/seller-campaigns | Get a collection of seller campaigns for this seller.
[**getSellers**](SellersV2Api.md#getSellers) | **GET** /v2/crp/sellers | Get a collection of sellers.
[**updateSellerBudget**](SellersV2Api.md#updateSellerBudget) | **PATCH** /v2/crp/budgets/{budgetId} | Modify a single budget.
[**updateSellerBudgets**](SellersV2Api.md#updateSellerBudgets) | **PATCH** /v2/crp/budgets | Modify a collection of budgets.
[**updateSellerCampaign**](SellersV2Api.md#updateSellerCampaign) | **PATCH** /v2/crp/seller-campaigns/{sellerCampaignId} | Update an existing seller campaign.
[**updateSellerCampaigns**](SellersV2Api.md#updateSellerCampaigns) | **PATCH** /v2/crp/seller-campaigns | Update a collection of seller campaigns.


<a name="createSellerBudgets"></a>
# **createSellerBudgets**
> List&lt;SellerBudgetMessage&gt; createSellerBudgets(authorization, createSellerBudgets)

Create a collection of budgets.

Create one or more new budgets to enable spending with the given limitations.  All three types of budgets can be created this way.                The following constraints apply when creating a new budget.                • &lt;b&gt;sellerId&lt;/b&gt;: the seller MUST be supplied&lt;br /&gt;  • &lt;b&gt;campaignIds&lt;/b&gt;: a non-empty array of campaign ids MUST be supplied&lt;br /&gt;  • &lt;b&gt;budgetType&lt;/b&gt;: a budget type MUST be supplied&lt;br /&gt;  • &lt;b&gt;amount&lt;/b&gt;: an amount MAY be supplied only if the type is not Uncapped and if supplied it MUST be non-negative&lt;br /&gt;  • &lt;b&gt;startDate&lt;/b&gt;: a future start date MUST be supplied&lt;br /&gt;  • &lt;b&gt;endDate&lt;/b&gt;: an end date MAY be supplied and if supplied MUST be greater than the start date&lt;br /&gt;                Other attributes MUST NOT be supplied.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    List<CreateSellerBudgetMapiMessage> createSellerBudgets = Arrays.asList(); // List<CreateSellerBudgetMapiMessage> | 
    try {
      List<SellerBudgetMessage> result = apiInstance.createSellerBudgets(authorization, createSellerBudgets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#createSellerBudgets");
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
 **createSellerBudgets** | [**List&lt;CreateSellerBudgetMapiMessage&gt;**](CreateSellerBudgetMapiMessage.md)|  |

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="createSellerCampaignsBySeller"></a>
# **createSellerCampaignsBySeller**
> SellerCampaignMessage createSellerCampaignsBySeller(sellerId, authorization, sellerCampaign)

Create a SellerCampaign

Associate an existing Seller with an existing Campaign allowing for budget creation

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerId = "sellerId_example"; // String | Supply a generated Id of an existing Seller
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    CreateSellerCampaignMessageMapi sellerCampaign = new CreateSellerCampaignMessageMapi(); // CreateSellerCampaignMessageMapi | Supply the campaign Id and bid to create the mapping
    try {
      SellerCampaignMessage result = apiInstance.createSellerCampaignsBySeller(sellerId, authorization, sellerCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#createSellerCampaignsBySeller");
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
 **sellerId** | **String**| Supply a generated Id of an existing Seller |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerCampaign** | [**CreateSellerCampaignMessageMapi**](CreateSellerCampaignMessageMapi.md)| Supply the campaign Id and bid to create the mapping |

### Return type

[**SellerCampaignMessage**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="createSellers"></a>
# **createSellers**
> List&lt;SellerBase&gt; createSellers(advertiserId, authorization, sellerNames, partnerId)

Create new sellers for an advertiser

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    Integer advertiserId = 56; // Integer | 
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    List<String> sellerNames = Arrays.asList(); // List<String> | 
    Integer partnerId = 56; // Integer | 
    try {
      List<SellerBase> result = apiInstance.createSellers(advertiserId, authorization, sellerNames, partnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#createSellers");
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
 **advertiserId** | **Integer**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerNames** | [**List&lt;String&gt;**](String.md)|  |
 **partnerId** | **Integer**|  | [optional]

### Return type

[**List&lt;SellerBase&gt;**](SellerBase.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getAdvertiser"></a>
# **getAdvertiser**
> AdvertiserInfoMessage getAdvertiser(advertiserId, authorization)

Get an advertiser.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    Integer advertiserId = 56; // Integer | 
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      AdvertiserInfoMessage result = apiInstance.getAdvertiser(advertiserId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getAdvertiser");
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
 **advertiserId** | **Integer**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**AdvertiserInfoMessage**](AdvertiserInfoMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getAdvertiserCampaigns"></a>
# **getAdvertiserCampaigns**
> List&lt;AdvertiserCampaignMessage&gt; getAdvertiserCampaigns(advertiserId, authorization)

Get the collection of CRP campaigns associated with the advertiserId.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    Integer advertiserId = 56; // Integer | 
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      List<AdvertiserCampaignMessage> result = apiInstance.getAdvertiserCampaigns(advertiserId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getAdvertiserCampaigns");
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
 **advertiserId** | **Integer**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**List&lt;AdvertiserCampaignMessage&gt;**](AdvertiserCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getAdvertisers"></a>
# **getAdvertisers**
> List&lt;AdvertiserInfoMessage&gt; getAdvertisers(authorization)

Get the collection of advertisers associated with the user.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      List<AdvertiserInfoMessage> result = apiInstance.getAdvertisers(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getAdvertisers");
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

### Return type

[**List&lt;AdvertiserInfoMessage&gt;**](AdvertiserInfoMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getBudgetsBySeller"></a>
# **getBudgetsBySeller**
> List&lt;SellerBudgetMessage&gt; getBudgetsBySeller(sellerId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId, type)

Get a collection of budgets for this seller.

Return a collection of budgets for this seller filtered by optional filter parameters.  If all parameters are omitted the entire collection to which the user has  access is returned, except those whose endDate is in the past. Returned budgets must satisfy all supplied filter  criteria if multiple parameters are used. See the budgets endpoint for additional details.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerId = "sellerId_example"; // String | Return only budgets belonging to the given seller.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String status = "status_example"; // String | Return only budgets with the given status.
    Boolean withBalance = true; // Boolean | Return only budgets with the given status.
    Boolean withSpend = true; // Boolean | Return budgets with any positive spend.
    OffsetDateTime endAfterDate = new OffsetDateTime(); // OffsetDateTime | Return budgets that end after the given date using the `yyyy-MM-DD` format.              If param is not provided, default behavior is to only return budgets that have not yet ended.
    OffsetDateTime startBeforeDate = new OffsetDateTime(); // OffsetDateTime | Return budgets that start on or before the given date using the `yyyy-MM-DD` format.
    Integer campaignId = 56; // Integer | Return only budgets that pay for a given campaign.
    String type = "type_example"; // String | Return only budgets with the given budget type.
    try {
      List<SellerBudgetMessage> result = apiInstance.getBudgetsBySeller(sellerId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getBudgetsBySeller");
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
 **sellerId** | **String**| Return only budgets belonging to the given seller. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **status** | **String**| Return only budgets with the given status. | [optional] [enum: Archived, Current, Scheduled]
 **withBalance** | **Boolean**| Return only budgets with the given status. | [optional]
 **withSpend** | **Boolean**| Return budgets with any positive spend. | [optional]
 **endAfterDate** | **OffsetDateTime**| Return budgets that end after the given date using the &#x60;yyyy-MM-DD&#x60; format.              If param is not provided, default behavior is to only return budgets that have not yet ended. | [optional]
 **startBeforeDate** | **OffsetDateTime**| Return budgets that start on or before the given date using the &#x60;yyyy-MM-DD&#x60; format. | [optional]
 **campaignId** | **Integer**| Return only budgets that pay for a given campaign. | [optional]
 **type** | **String**| Return only budgets with the given budget type. | [optional]

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getBudgetsBySellerCampaignId"></a>
# **getBudgetsBySellerCampaignId**
> List&lt;SellerBudgetMessage&gt; getBudgetsBySellerCampaignId(sellerCampaignId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, type)

Get a collection of budgets for this seller campaign.

Return a collection of budgets for this seller campaign filtered by optional filter parameters.  If all parameters are omitted the entire collection to which the user has  access is returned, except those whose endDate is in the past. Returned budgets must satisfy all supplied filter  criteria if multiple parameters are used.                See the budgets endpoint for additional details.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerCampaignId = "sellerCampaignId_example"; // String | Return only budgets belonging to the given seller campaign.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String status = "status_example"; // String | Return only budgets with the given status.
    Boolean withBalance = true; // Boolean | Return only budgets with a positive balance.
    Boolean withSpend = true; // Boolean | Return budgets with a positive spend.
    OffsetDateTime endAfterDate = new OffsetDateTime(); // OffsetDateTime | Return budgets that end after the given date using the `yyyy-MM-DD` format.               If param is not provided, default behavior is to only return budgets that have not yet ended.
    OffsetDateTime startBeforeDate = new OffsetDateTime(); // OffsetDateTime | Return budgets that start on or before the given date using the `yyyy-MM-DD` format.
    String type = "type_example"; // String | Return only budgets with the given budget type.
    try {
      List<SellerBudgetMessage> result = apiInstance.getBudgetsBySellerCampaignId(sellerCampaignId, authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getBudgetsBySellerCampaignId");
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
 **sellerCampaignId** | **String**| Return only budgets belonging to the given seller campaign. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **status** | **String**| Return only budgets with the given status. | [optional] [enum: Archived, Current, Scheduled]
 **withBalance** | **Boolean**| Return only budgets with a positive balance. | [optional]
 **withSpend** | **Boolean**| Return budgets with a positive spend. | [optional]
 **endAfterDate** | **OffsetDateTime**| Return budgets that end after the given date using the &#x60;yyyy-MM-DD&#x60; format.               If param is not provided, default behavior is to only return budgets that have not yet ended. | [optional]
 **startBeforeDate** | **OffsetDateTime**| Return budgets that start on or before the given date using the &#x60;yyyy-MM-DD&#x60; format. | [optional]
 **type** | **String**| Return only budgets with the given budget type. | [optional]

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSeller"></a>
# **getSeller**
> SellerBase getSeller(sellerId, authorization)

Get details for a seller.

Returns details for the selected seller.  For example                    {          \&quot;id\&quot; : \&quot;123456\&quot;          \&quot;sellerName\&quot;: \&quot;HBogart\&quot;,      }

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerId = "sellerId_example"; // String | Id of the seller.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      SellerBase result = apiInstance.getSeller(sellerId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSeller");
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
 **sellerId** | **String**| Id of the seller. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerBase**](SellerBase.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSellerBudget"></a>
# **getSellerBudget**
> SellerBudgetMessage getSellerBudget(budgetId, authorization)

Get details for a budget.

Return a budget. For example:                    {          \&quot;id\&quot;: \&quot;1759183\&quot;,          \&quot;sellerId\&quot;: \&quot;321392\&quot;,          \&quot;campaignIds\&quot;: [              143962          ],          \&quot;budgetType\&quot;: \&quot;Capped\&quot;,          \&quot;amount\&quot;: 1000,          \&quot;startDate\&quot;: \&quot;2021-01-11\&quot;,          \&quot;endDate\&quot;: \&quot;2021-01-12\&quot;,          \&quot;spend\&quot;: null,          \&quot;status\&quot;: \&quot;Active\&quot;      }                A budget limits the spend of a seller for one or more campaigns.                There are three types of budget:&lt;br /&gt;&lt;b&gt;Uncapped&lt;/b&gt; budgets put no limit on the total amount of spend.&lt;br /&gt;&lt;b&gt;Capped&lt;/b&gt; budgets limit the total spend to a fixed amount.&lt;br /&gt;&lt;b&gt;Daily&lt;/b&gt; budgets limit daily spend to a fixed amount.&lt;br /&gt;                In addition, budgets can limit the spend to a specific range of dates using  the start and end date attributes. Finally a budget must be active to be used.                &lt;b&gt;Spend&lt;/b&gt; approximates the current spend against this budget. There may be a lag  between when an ad is clicked and the time it accrues to the spend.  Daily budgets  show spend against the most recent day only.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    Long budgetId = 56L; // Long | Id of the budget.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      SellerBudgetMessage result = apiInstance.getSellerBudget(budgetId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSellerBudget");
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
 **budgetId** | **Long**| Id of the budget. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerBudgetMessage**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSellerBudgets"></a>
# **getSellerBudgets**
> List&lt;SellerBudgetMessage&gt; getSellerBudgets(authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId, sellerId, type)

Get a collection of budgets.

Return a collection of budgets filtered by optional filter parameters.  If all parameters are omitted the entire collection to which the user has  access is returned, except those whose endDate is in the past. Returned budgets must satisfy all supplied filter  criteria if multiple parameters are used.                &lt;b&gt;Date filter.&lt;/b&gt; Filtering can return only budgets that were active for a  date range by specifying the startBeforeDate and endAfterDate. Leaving off the startBeforeDate  value makes budgets with any startDate qualify, whereas when leaving off the endAfterDate value will only return  budgets whose endDate has not already passed. To get budgets that were active  on a specific date, set both values to that day.                &lt;b&gt;Spend.&lt;/b&gt; If the endAfterDate is supplied, the spend excludes spend that  happened after that date. In the case of a daily budget, only the spend for  the final day is displayed.                See the budgets endpoint for additional details.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String status = "status_example"; // String | Return only budgets with the given status.
    Boolean withBalance = true; // Boolean | Return only budgets with the given status.
    Boolean withSpend = true; // Boolean | Return budgets with any positive spend.
    OffsetDateTime endAfterDate = new OffsetDateTime(); // OffsetDateTime | Return budgets that end after the given date using the `yyyy-MM-DD` format.               If param is not provided, default behavior is to only return budgets that have not yet ended.
    OffsetDateTime startBeforeDate = new OffsetDateTime(); // OffsetDateTime | Return budgets that start on or before the given date using the `yyyy-MM-DD` format.
    Integer campaignId = 56; // Integer | Return only budgets that pay for a given campaign.
    String sellerId = "sellerId_example"; // String | Return only budgets belonging to the given seller.
    String type = "type_example"; // String | Return only budgets with the given budget type.
    try {
      List<SellerBudgetMessage> result = apiInstance.getSellerBudgets(authorization, status, withBalance, withSpend, endAfterDate, startBeforeDate, campaignId, sellerId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSellerBudgets");
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
 **status** | **String**| Return only budgets with the given status. | [optional] [enum: Archived, Current, Scheduled]
 **withBalance** | **Boolean**| Return only budgets with the given status. | [optional]
 **withSpend** | **Boolean**| Return budgets with any positive spend. | [optional]
 **endAfterDate** | **OffsetDateTime**| Return budgets that end after the given date using the &#x60;yyyy-MM-DD&#x60; format.               If param is not provided, default behavior is to only return budgets that have not yet ended. | [optional]
 **startBeforeDate** | **OffsetDateTime**| Return budgets that start on or before the given date using the &#x60;yyyy-MM-DD&#x60; format. | [optional]
 **campaignId** | **Integer**| Return only budgets that pay for a given campaign. | [optional]
 **sellerId** | **String**| Return only budgets belonging to the given seller. | [optional]
 **type** | **String**| Return only budgets with the given budget type. | [optional]

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSellerCampaign"></a>
# **getSellerCampaign**
> SellerCampaignMessage getSellerCampaign(sellerCampaignId, authorization)

Get details for a seller campaign.

Return details for a seller campaign.  For example,                    {          \&quot;id\&quot;: \&quot;543210.123456\&quot;,          \&quot;suspendedSince\&quot;: \&quot;2018-07-30\&quot;,          \&quot;sellerId\&quot;: \&quot;543210\&quot;,          \&quot;campaignId\&quot;: 123456,          \&quot;bid\&quot;: 1.55      }                An active seller campaign is one for which the value of &lt;b&gt;suspendedSince&lt;/b&gt; is null and  the &lt;b&gt;bid&lt;/b&gt; is positive. The currency of the bid is the &lt;b&gt;bidCurrency&lt;/b&gt; of the  associated campaign.                Any active seller campaign must also have an active total (capped or uncapped) budget.  It may optionally have an active daily budget as well to further limit spending.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerCampaignId = "sellerCampaignId_example"; // String | Id of the seller campaign.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      SellerCampaignMessage result = apiInstance.getSellerCampaign(sellerCampaignId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSellerCampaign");
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
 **sellerCampaignId** | **String**| Id of the seller campaign. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerCampaignMessage**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSellerCampaigns"></a>
# **getSellerCampaigns**
> List&lt;SellerCampaignMessage&gt; getSellerCampaigns(authorization, sellerStatus, sellerId, campaignId, budgetStatus)

Get a collection of seller campaigns.

Return a collection of seller campaigns filtered by optional filter parameters.  If all parameters are omitted the entire collection to which the user has  access is returned. Returned sellers must satisfy all supplied filter  criteria if multiple parameters are used.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String sellerStatus = "sellerStatus_example"; // String | Return only seller campaigns for sellers with the given status.
    String sellerId = "sellerId_example"; // String | Return only seller campaigns belonging to the given seller.
    Integer campaignId = 56; // Integer | Return only seller campaigns associated with the given campaign.
    String budgetStatus = "budgetStatus_example"; // String | Return only seller campaigns whose budget has the given status.
    try {
      List<SellerCampaignMessage> result = apiInstance.getSellerCampaigns(authorization, sellerStatus, sellerId, campaignId, budgetStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSellerCampaigns");
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
 **sellerStatus** | **String**| Return only seller campaigns for sellers with the given status. | [optional] [enum: Inactive, Active]
 **sellerId** | **String**| Return only seller campaigns belonging to the given seller. | [optional]
 **campaignId** | **Integer**| Return only seller campaigns associated with the given campaign. | [optional]
 **budgetStatus** | **String**| Return only seller campaigns whose budget has the given status. | [optional] [enum: Archived, Current, Scheduled]

### Return type

[**List&lt;SellerCampaignMessage&gt;**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSellerCampaignsBySeller"></a>
# **getSellerCampaignsBySeller**
> List&lt;SellerCampaignMessage&gt; getSellerCampaignsBySeller(sellerId, authorization, sellerStatus, campaignId, budgetStatus)

Get a collection of seller campaigns for this seller.

Return a collection of seller campaigns for this seller filtered by optional filter parameters.  If all parameters are omitted the entire collection to which the user has  access is returned. Returned sellers must satisfy all supplied filter  criteria if multiple parameters are used.  See the seller campaigns endpoint for additional details.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerId = "sellerId_example"; // String | Return only seller campaigns belonging to the given seller.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String sellerStatus = "sellerStatus_example"; // String | Return only seller campaigns for sellers with the given status.
    Integer campaignId = 56; // Integer | Return only seller campaigns associated with the given campaign.
    String budgetStatus = "budgetStatus_example"; // String | Return only seller campaigns whose budget has the given status.
    try {
      List<SellerCampaignMessage> result = apiInstance.getSellerCampaignsBySeller(sellerId, authorization, sellerStatus, campaignId, budgetStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSellerCampaignsBySeller");
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
 **sellerId** | **String**| Return only seller campaigns belonging to the given seller. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **sellerStatus** | **String**| Return only seller campaigns for sellers with the given status. | [optional] [enum: Inactive, Active]
 **campaignId** | **Integer**| Return only seller campaigns associated with the given campaign. | [optional]
 **budgetStatus** | **String**| Return only seller campaigns whose budget has the given status. | [optional] [enum: Archived, Current, Scheduled]

### Return type

[**List&lt;SellerCampaignMessage&gt;**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getSellers"></a>
# **getSellers**
> List&lt;SellerBase&gt; getSellers(authorization, sellerStatus, withProducts, withBudgetStatus, sellerName)

Get a collection of sellers.

Return a collection of sellers filtered by optional filter parameters.  If all parameters are omitted the entire collection to which the user has  access is returned. Returned sellers must satisfy all supplied filter  criteria if multiple parameters are used.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    String sellerStatus = "sellerStatus_example"; // String | Return only sellers with specific status.
    Boolean withProducts = true; // Boolean | Return only sellers with or without products in catalog.
    String withBudgetStatus = "withBudgetStatus_example"; // String | Return only sellers with specific budget status.
    String sellerName = "sellerName_example"; // String | Return only sellers with the matching name.
    try {
      List<SellerBase> result = apiInstance.getSellers(authorization, sellerStatus, withProducts, withBudgetStatus, sellerName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#getSellers");
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
 **sellerStatus** | **String**| Return only sellers with specific status. | [optional] [enum: Inactive, Active]
 **withProducts** | **Boolean**| Return only sellers with or without products in catalog. | [optional]
 **withBudgetStatus** | **String**| Return only sellers with specific budget status. | [optional] [enum: Archived, Current, Scheduled]
 **sellerName** | **String**| Return only sellers with the matching name. | [optional]

### Return type

[**List&lt;SellerBase&gt;**](SellerBase.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="updateSellerBudget"></a>
# **updateSellerBudget**
> SellerBudgetMessage updateSellerBudget(budgetId, authorization, message)

Modify a single budget.

Modify an existing active budget to change its limitations or status.  All three types of budgets can be modified.                See the additional restrictions listed in the PATCH budgets endpoint.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    Long budgetId = 56L; // Long | 
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    UpdateSellerBudgetMessageBase message = new UpdateSellerBudgetMessageBase(); // UpdateSellerBudgetMessageBase | 
    try {
      SellerBudgetMessage result = apiInstance.updateSellerBudget(budgetId, authorization, message);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#updateSellerBudget");
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
 **budgetId** | **Long**|  |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **message** | [**UpdateSellerBudgetMessageBase**](UpdateSellerBudgetMessageBase.md)|  |

### Return type

[**SellerBudgetMessage**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="updateSellerBudgets"></a>
# **updateSellerBudgets**
> List&lt;SellerBudgetMessage&gt; updateSellerBudgets(authorization, updateSellerBudgets)

Modify a collection of budgets.

Modify one or more existing active budgets to change their limitations or status.  All three types of budgets can be modified.                The following constraints apply when modifying an existing budget.                • &lt;b&gt;campaignIds&lt;/b&gt;: a non-empty subset of the original campaign ids MAY be supplied&lt;br /&gt;  • &lt;b&gt;amount&lt;/b&gt;: an amount MAY be supplied only if the type is not Uncapped and if supplied it MUST be non-negative&lt;br /&gt;  • &lt;b&gt;startDate&lt;/b&gt;: a future start date MAY be supplied for budgets that have not yet started&lt;br /&gt;  • &lt;b&gt;endDate&lt;/b&gt;: an end date MAY be supplied and if supplied MUST be a future date greater than the start date&lt;br /&gt;                Other attributes MUST NOT be supplied.                Adding new campaigns to a budget is not allowed. In addition, reducing the amount for  a Capped budget to a value less than the current spend not allowed.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    List<UpdateSellerBudgetMessage> updateSellerBudgets = Arrays.asList(); // List<UpdateSellerBudgetMessage> | 
    try {
      List<SellerBudgetMessage> result = apiInstance.updateSellerBudgets(authorization, updateSellerBudgets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#updateSellerBudgets");
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
 **updateSellerBudgets** | [**List&lt;UpdateSellerBudgetMessage&gt;**](UpdateSellerBudgetMessage.md)|  |

### Return type

[**List&lt;SellerBudgetMessage&gt;**](SellerBudgetMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="updateSellerCampaign"></a>
# **updateSellerCampaign**
> SellerCampaignMessage updateSellerCampaign(sellerCampaignId, bid, authorization)

Update an existing seller campaign.

Patching a seller campaign allows the bid to be modified. The bid must be a non-negative value.  Setting the bid to zero will make a seller campaign inactive.                The currency used for bids will be the default currency of the campaign.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String sellerCampaignId = "sellerCampaignId_example"; // String | Id of the existing seller campaign to update
    Double bid = 3.4D; // Double | The new bid for the seller campaign.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      SellerCampaignMessage result = apiInstance.updateSellerCampaign(sellerCampaignId, bid, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#updateSellerCampaign");
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
 **sellerCampaignId** | **String**| Id of the existing seller campaign to update |
 **bid** | **Double**| The new bid for the seller campaign. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**SellerCampaignMessage**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="updateSellerCampaigns"></a>
# **updateSellerCampaigns**
> List&lt;SellerCampaignMessage&gt; updateSellerCampaigns(authorization, campaignMessages)

Update a collection of seller campaigns.

Patching a collection of seller campaigns allows their bids to be modified.  Each bid must be a non-negative value. Setting the bid to zero will make a seller campaign inactive.                The currency used for bids will be the default currency of the campaign.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.SellersV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SellersV2Api apiInstance = new SellersV2Api(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    List<SellerCampaignUpdate> campaignMessages = Arrays.asList(); // List<SellerCampaignUpdate> | 
    try {
      List<SellerCampaignMessage> result = apiInstance.updateSellerCampaigns(authorization, campaignMessages);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellersV2Api#updateSellerCampaigns");
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
 **campaignMessages** | [**List&lt;SellerCampaignUpdate&gt;**](SellerCampaignUpdate.md)|  |

### Return type

[**List&lt;SellerCampaignMessage&gt;**](SellerCampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | List of errors encountered |  -  |
**401** | Authentication failed. |  -  |
**403** | You do not have access to the requested records |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

