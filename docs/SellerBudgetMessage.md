

# SellerBudgetMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**sellerId** | **String** |  |  [optional]
**campaignIds** | **List&lt;Integer&gt;** |  |  [optional]
**budgetType** | **String** |  |  [optional]
**amount** | **Double** |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | **String** |  |  [optional]
**spend** | **Double** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**isSuspended** | **Boolean** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ARCHIVED | &quot;Archived&quot;
CURRENT | &quot;Current&quot;
SCHEDULED | &quot;Scheduled&quot;



