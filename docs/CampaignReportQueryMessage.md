

# CampaignReportQueryMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **String** |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) |  |  [optional]
**metrics** | **List&lt;String&gt;** |  |  [optional]
**format** | [**FormatEnum**](#FormatEnum) |  |  [optional]
**currency** | **String** |  |  [optional]
**timezone** | **String** |  |  [optional]



## Enum: List&lt;DimensionsEnum&gt;

Name | Value
---- | -----
CAMPAIGNID | &quot;CampaignId&quot;
CAMPAIGN | &quot;Campaign&quot;
ADVERTISERID | &quot;AdvertiserId&quot;
ADVERTISER | &quot;Advertiser&quot;
CATEGORYID | &quot;CategoryId&quot;
CATEGORY | &quot;Category&quot;
SELLER | &quot;Seller&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
WEEK | &quot;Week&quot;
MONTH | &quot;Month&quot;
YEAR | &quot;Year&quot;



## Enum: FormatEnum

Name | Value
---- | -----
CSV | &quot;Csv&quot;
EXCEL | &quot;Excel&quot;
XML | &quot;Xml&quot;
JSON | &quot;Json&quot;



