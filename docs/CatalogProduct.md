

# CatalogProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **Long** | Mandatory. batch Id, set by the partner. Use to future deduplication |  [optional]
**catalogId** | **Integer** | Mandatory. The criteo catalog (partner) Id |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | Mandatory. Method type, the acceptable values are insert and delete |  [optional]
**productId** | **String** | Mandatory if the method is delete. This is the id of the product to delete in the partner catalog |  [optional]
**itemGroupId** | **String** | Mandatory if the method is delete and the product is a variant. This id is the grouping key (parent id) for variants |  [optional]
**product** | [**GoogleProduct**](GoogleProduct.md) |  |  [optional]



## Enum: MethodEnum

Name | Value
---- | -----
INSERT | &quot;Insert&quot;
DELETE | &quot;Delete&quot;



