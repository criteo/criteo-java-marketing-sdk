# AuthenticationApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oAuth2TokenPost**](AuthenticationApi.md#oAuth2TokenPost) | **POST** /oauth2/token | Authenticates provided credentials and returns an access token


<a name="oAuth2TokenPost"></a>
# **oAuth2TokenPost**
> InlineResponse200 oAuth2TokenPost(clientId, clientSecret, grantType)

Authenticates provided credentials and returns an access token

Get the token necessary to perform any action through our API. You can create your API User in our Criteo platform &lt;a href&#x3D;&#39;https://marketing.criteo.com&#39; target&#x3D;&#39;_blank&#39;&gt;here&lt;/a&gt;. If you forgot your credentials (client_id and/or client_secret) you will need to reset them there.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String clientId = "clientId_example"; // String | API Client-Id or Username
    String clientSecret = "clientSecret_example"; // String | API Client secret or password
    String grantType = "\"client_credentials\""; // String | Other grant types are not available
    try {
      InlineResponse200 result = apiInstance.oAuth2TokenPost(clientId, clientSecret, grantType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#oAuth2TokenPost");
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
 **clientId** | **String**| API Client-Id or Username | [optional]
 **clientSecret** | **String**| API Client secret or password | [optional]
 **grantType** | **String**| Other grant types are not available | [optional] [default to &quot;client_credentials&quot;]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request, invalid syntax |  -  |
**403** | Forbidden |  -  |
**429** | Rate limit reached |  -  |
**500** | Unknown Error |  -  |

