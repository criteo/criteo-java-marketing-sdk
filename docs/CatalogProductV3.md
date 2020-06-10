

# CatalogProductV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **Long** | An entry ID, unique within the batch request. |  [optional]
**merchantId** | **String** | The ID of the managing account. |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | The method of the batch entry. |  [optional]
**productId** | **String** | The ID of the product to get or delete. Only defined if the method is get or delete. |  [optional]
**product** | [**GoogleProductV3**](GoogleProductV3.md) |  |  [optional]
**feedId** | **String** | The Content API feed id. |  [optional]



## Enum: MethodEnum

Name | Value
---- | -----
INSERT | &quot;Insert&quot;
DELETE | &quot;Delete&quot;



