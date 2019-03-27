
# StatsQueryMessage

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
**timezone** | [**TimezoneEnum**](#TimezoneEnum) |  |  [optional]


<a name="List<DimensionsEnum>"></a>
## Enum: List&lt;DimensionsEnum&gt;
Name | Value
---- | -----
CAMPAIGNID | &quot;CampaignId&quot;
ADVERTISERID | &quot;AdvertiserId&quot;
CATEGORY | &quot;Category&quot;
SELLER | &quot;Seller&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
WEEK | &quot;Week&quot;
MONTH | &quot;Month&quot;
YEAR | &quot;Year&quot;


<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
CSV | &quot;Csv&quot;
EXCEL | &quot;Excel&quot;
XML | &quot;Xml&quot;
JSON | &quot;Json&quot;


<a name="TimezoneEnum"></a>
## Enum: TimezoneEnum
Name | Value
---- | -----
GMT | &quot;GMT&quot;
PST | &quot;PST&quot;
JST | &quot;JST&quot;



