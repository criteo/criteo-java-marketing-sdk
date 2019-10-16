# AudiencesApi

All URIs are relative to *https://api.criteo.com/marketing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRemoveUsersToAudience**](AudiencesApi.md#addRemoveUsersToAudience) | **PATCH** /v1/audiences/userlist/{audienceId} | Add/Remove users to an Audience.
[**createAudience**](AudiencesApi.md#createAudience) | **POST** /v1/audiences/userlist | Create a new Audience.
[**deleteAudience**](AudiencesApi.md#deleteAudience) | **DELETE** /v1/audiences/{audienceId} | Delete an Audience.
[**getAudiences**](AudiencesApi.md#getAudiences) | **GET** /v1/audiences | Get the list of Audiences.
[**removeUsersFromAudience**](AudiencesApi.md#removeUsersFromAudience) | **DELETE** /v1/audiences/userlist/{audienceId}/users | Remove all users from an Audience.
[**updateAudienceMetadata**](AudiencesApi.md#updateAudienceMetadata) | **PUT** /v1/audiences/{audienceId} | Update an Audience metadata.


<a name="addRemoveUsersToAudience"></a>
# **addRemoveUsersToAudience**
> AudiencePatchResponse addRemoveUsersToAudience(audienceId, authorization, request)

Add/Remove users to an Audience.

Add/Remove users to an Audience.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AudiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AudiencesApi apiInstance = new AudiencesApi(defaultClient);
    Integer audienceId = 56; // Integer | Mandatory. The id of the audience to add or remove users to.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    AudiencePatchRequest request = new AudiencePatchRequest(); // AudiencePatchRequest | Mandatory. The request to create the Audience.
    try {
      AudiencePatchResponse result = apiInstance.addRemoveUsersToAudience(audienceId, authorization, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiencesApi#addRemoveUsersToAudience");
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
 **audienceId** | **Integer**| Mandatory. The id of the audience to add or remove users to. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **request** | [**AudiencePatchRequest**](AudiencePatchRequest.md)| Mandatory. The request to create the Audience. |

### Return type

[**AudiencePatchResponse**](AudiencePatchResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Users were Added/Removed successfully. |  -  |
**400** | Invalid Operation, Schema, no valid identifiers given, too many identifiers given in a single request or invalid use of Gum caller id field. |  -  |
**401** | Authentication failed. |  -  |
**403** | The Advertiser this Audience belongs to is not in current user&#39;s portfolio. |  -  |
**404** | Audience not found. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="createAudience"></a>
# **createAudience**
> AudienceCreateResponse createAudience(authorization, createRequest)

Create a new Audience.

Create a new Audience for the given Advertiser.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AudiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AudiencesApi apiInstance = new AudiencesApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    AudienceCreateRequest createRequest = new AudienceCreateRequest(); // AudienceCreateRequest | 
    try {
      AudienceCreateResponse result = apiInstance.createAudience(authorization, createRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiencesApi#createAudience");
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
 **createRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md)|  |

### Return type

[**AudienceCreateResponse**](AudienceCreateResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created Audience. |  -  |
**400** | The Audience name is incorrect. Must not be empty. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user&#39;s portfolio. |  -  |
**409** | The Audience name is already used for this Advertiser. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="deleteAudience"></a>
# **deleteAudience**
> Object deleteAudience(audienceId, authorization)

Delete an Audience.

Delete an Audience.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AudiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AudiencesApi apiInstance = new AudiencesApi(defaultClient);
    Integer audienceId = 56; // Integer | Mandatory. The id of the audience to delete.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      Object result = apiInstance.deleteAudience(audienceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiencesApi#deleteAudience");
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
 **audienceId** | **Integer**| Mandatory. The id of the audience to delete. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | Audience was deleted. |  -  |
**401** | Authentication failed. |  -  |
**403** | The Advertiser this Audience belongs to is not in current user&#39;s portfolio. |  -  |
**404** | Audience not found. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getAudiences"></a>
# **getAudiences**
> AudiencesGetResponse getAudiences(authorization, advertiserId)

Get the list of Audiences.

Get the list of Audiences for the given Advertiser.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AudiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AudiencesApi apiInstance = new AudiencesApi(defaultClient);
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    Integer advertiserId = 56; // Integer | Mandatory. Advertiser to get all Audiences for.
    try {
      AudiencesGetResponse result = apiInstance.getAudiences(authorization, advertiserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiencesApi#getAudiences");
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
 **advertiserId** | **Integer**| Mandatory. Advertiser to get all Audiences for. | [optional]

### Return type

[**AudiencesGetResponse**](AudiencesGetResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Audiences. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user&#39;s portfolio. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="removeUsersFromAudience"></a>
# **removeUsersFromAudience**
> Object removeUsersFromAudience(audienceId, authorization)

Remove all users from an Audience.

Remove all users from an Audience.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AudiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AudiencesApi apiInstance = new AudiencesApi(defaultClient);
    Integer audienceId = 56; // Integer | Mandatory. The id of the audience to empty.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    try {
      Object result = apiInstance.removeUsersFromAudience(audienceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiencesApi#removeUsersFromAudience");
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
 **audienceId** | **Integer**| Mandatory. The id of the audience to empty. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | Audience was emptied. |  -  |
**401** | Authentication failed. |  -  |
**403** | The Advertiser this Audience belongs to is not in current user&#39;s portfolio. |  -  |
**404** | Audience not found. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="updateAudienceMetadata"></a>
# **updateAudienceMetadata**
> Object updateAudienceMetadata(audienceId, authorization, request)

Update an Audience metadata.

Update an Audience metadata.

### Example
```java
// Import classes:
import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.auth.*;
import com.criteo.marketing.models.*;
import com.criteo.marketing.api.AudiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com/marketing");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AudiencesApi apiInstance = new AudiencesApi(defaultClient);
    Integer audienceId = 56; // Integer | Mandatory. The id of the Audience to update.
    String authorization = "\"Bearer VALID_JWT_TOKEN_BASE64\""; // String | JWT Bearer Token
    AudiencePutRequest request = new AudiencePutRequest(); // AudiencePutRequest | Mandatory. The request to update the Audience metadata.
    try {
      Object result = apiInstance.updateAudienceMetadata(audienceId, authorization, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiencesApi#updateAudienceMetadata");
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
 **audienceId** | **Integer**| Mandatory. The id of the Audience to update. |
 **authorization** | **String**| JWT Bearer Token | [default to &quot;Bearer VALID_JWT_TOKEN_BASE64&quot;]
 **request** | [**AudiencePutRequest**](AudiencePutRequest.md)| Mandatory. The request to update the Audience metadata. |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | Audience metadata was successfully changed. |  -  |
**400** | The Audience name is incorrect. Must not be empty. |  -  |
**401** | Authentication failed. |  -  |
**403** | The Advertiser this Audience belongs to is not in current user&#39;s portfolio. |  -  |
**404** | Audience not found. |  -  |
**409** | The Audience name is already used for this Advertiser. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

