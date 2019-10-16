

# CampaignMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  [optional]
**advertiserName** | **String** |  |  [optional]
**categories** | **List&lt;Integer&gt;** |  |  [optional]
**budgetId** | **Integer** |  |  [optional]
**campaignId** | **Integer** |  |  [optional]
**campaignName** | **String** |  |  [optional]
**advertiserId** | **Integer** |  |  [optional]
**campaignStatus** | [**CampaignStatusEnum**](#CampaignStatusEnum) |  |  [optional]
**campaignBid** | [**BidMessage**](BidMessage.md) |  |  [optional]



## Enum: CampaignTypeEnum

Name | Value
---- | -----
MIDFUNNEL | &quot;MidFunnel&quot;
LOWERFUNNEL | &quot;LowerFunnel&quot;
AUDIENCESELLING | &quot;AudienceSelling&quot;



## Enum: CampaignStatusEnum

Name | Value
---- | -----
RUNNING | &quot;Running&quot;
ARCHIVED | &quot;Archived&quot;
NOTRUNNING | &quot;NotRunning&quot;



