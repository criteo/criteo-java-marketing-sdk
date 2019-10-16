

# CategoryUpdatesPerCatalogError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **Integer** |  |  [optional]
**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**categories** | [**List&lt;CategoryUpdateError&gt;**](CategoryUpdateError.md) |  |  [optional]



## Enum: ErrorCodeEnum

Name | Value
---- | -----
OK | &quot;OK&quot;
ACCESSDENIED | &quot;AccessDenied&quot;
ENABLEDCATEGORYNUMBEREXCEEDED | &quot;EnabledCategoryNumberExceeded&quot;
CATEGORIESNOTENABLED | &quot;CategoriesNotEnabled&quot;
DUPLICATECATALOGENTRY | &quot;DuplicateCatalogEntry&quot;
INVALIDCATALOGID | &quot;InvalidCatalogId&quot;
INVALIDCATEGORYHASHCODE | &quot;InvalidCategoryHashcode&quot;
INACTIVECATEGORY | &quot;InactiveCategory&quot;
DUPLICATECATEGORYENTRY | &quot;DuplicateCategoryEntry&quot;
BIDDINGCATEGORIESONTHISCAMPAIGNNOTALLOWED | &quot;BiddingCategoriesOnThisCampaignNotAllowed&quot;
CAMPAIGNNOTINPORTFOLIOORNOTACTIVE | &quot;CampaignNotInPortfolioOrNotActive&quot;
DUPLICATECAMPAIGNENTRY | &quot;DuplicateCampaignEntry&quot;
BIDDINGONTHISCAMPAIGNNOTALLOWED | &quot;BiddingOnThisCampaignNotAllowed&quot;
BIDNOTINRANGE | &quot;BidNotInRange&quot;
FOURDECIMALSNOTALLOWED | &quot;FourDecimalsNotAllowed&quot;
BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED | &quot;BiddingOnTargetBudgetCampaignNotAllowed&quot;



