# PortfolioApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolio**](PortfolioApi.md#getPortfolio) | **GET** /v1/portfolio | Gets portfolio


<a name="getPortfolio"></a>
# **getPortfolio**
> List&lt;PortfolioMessage&gt; getPortfolio(authorization)

Gets portfolio

### Example
```java
// Import classes:
//import com.criteo.marketing.ApiClient;
//import com.criteo.marketing.ApiException;
//import com.criteo.marketing.Configuration;
//import com.criteo.marketing.auth.*;
//import com.criteo.marketing.api.PortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PortfolioApi apiInstance = new PortfolioApi();
String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
try {
    List<PortfolioMessage> result = apiInstance.getPortfolio(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

[**List&lt;PortfolioMessage&gt;**](PortfolioMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

