

# GoogleProductV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the item. |  [optional]
**offerId** | **String** | Not used by Criteo. |  [optional]
**title** | **String** | Title of the item. |  [optional]
**description** | **String** | Description of the item. |  [optional]
**link** | **String** | URL directly linking to your item&#39;s page on your website. |  [optional]
**imageLink** | **String** | URL of an image of the item. |  [optional]
**additionalImageLinks** | **List&lt;String&gt;** | Additional URLs of images of the item. |  [optional]
**contentLanguage** | **String** | The two-letter ISO 639-1 language code for the item. |  [optional]
**targetCountry** | **String** | The CLDR territory code for the item. |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) | The item&#39;s channel (online only). |  [optional]
**expirationDate** | **String** | Date on which the item should expire, as specified upon insertion, in ISO 8601 format. |  [optional]
**adult** | **Boolean** | Set to true if the item is targeted towards adults. |  [optional]
**kind** | [**KindEnum**](#KindEnum) | Identifies what kind of resource this is. |  [optional]
**brand** | **String** | Brand of the item. |  [optional]
**color** | **String** | Color of the item. |  [optional]
**googleProductCategory** | **String** | Google&#39;s category of the item (see Google product taxonomy). |  [optional]
**gtin** | **String** | Global Trade Item Number (GTIN) of the item. |  [optional]
**itemGroupId** | **String** | Shared identifier for all variants of the same product. |  [optional]
**material** | **String** | The material of which the item is made. |  [optional]
**mpn** | **String** | Manufacturer Part Number (MPN) of the item. |  [optional]
**pattern** | **String** | The item&#39;s pattern (e.g. polka dots). |  [optional]
**price** | [**Price**](Price.md) |  |  [optional]
**salePrice** | [**Price**](Price.md) |  |  [optional]
**salePriceEffectiveDate** | **String** | Date range during which the item is on sale. |  [optional]
**shipping** | [**List&lt;ProductShippingV3&gt;**](ProductShippingV3.md) | Shipping rules. |  [optional]
**shippingWeight** | [**ProductShippingWeightV3**](ProductShippingWeightV3.md) |  |  [optional]
**sizes** | **List&lt;String&gt;** | Size of the item. Only one value is allowed. For variants with different sizes, insert a separate product for each size with the same itemGroupId value. |  [optional]
**taxes** | [**List&lt;ProductTaxV3&gt;**](ProductTaxV3.md) | Tax information. |  [optional]
**customAttributes** | [**List&lt;CustomAttributeV3&gt;**](CustomAttributeV3.md) | A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form (e.g., { \&quot;name\&quot;: \&quot;size type\&quot;, \&quot;value\&quot;: \&quot;regular\&quot; }). This is useful for submitting attributes not explicitly exposed by the API, such as additional attributes used for Shopping Actions. |  [optional]
**identifierExists** | **Boolean** | False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the Unique Product Identifier Rules for all target countries except for Canada. |  [optional]
**installment** | [**InstallmentV3**](InstallmentV3.md) |  |  [optional]
**loyaltyPoints** | [**LoyaltyPointsV3**](LoyaltyPointsV3.md) |  |  [optional]
**multipack** | [**Object**](.md) | The number of identical products in a merchant-defined multipack. To avoid any overflow issue, pass it as a string. |  [optional]
**customLabel0** | **String** | Custom label 0 for custom grouping of items in a Shopping campaign. |  [optional]
**customLabel1** | **String** | Custom label 1 for custom grouping of items in a Shopping campaign. |  [optional]
**customLabel2** | **String** | Custom label 2 for custom grouping of items in a Shopping campaign. |  [optional]
**customLabel3** | **String** | Custom label 3 for custom grouping of items in a Shopping campaign. |  [optional]
**customLabel4** | **String** | Custom label 4 for custom grouping of items in a Shopping campaign. |  [optional]
**isBundle** | **Boolean** | Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. |  [optional]
**mobileLink** | **String** | accounts.link to a mobile-optimized version of the landing page. |  [optional]
**availabilityDate** | **String** | The day a pre-ordered product becomes available for delivery, in ISO 8601 format. |  [optional]
**shippingLabel** | **String** | The shipping label of the product, used to group product in account-level shipping rules. |  [optional]
**unitPricingMeasure** | [**UnitMeasure**](UnitMeasure.md) |  |  [optional]
**unitPricingBaseMeasure** | [**ProductUnitPricingBaseMeasureV3**](ProductUnitPricingBaseMeasureV3.md) |  |  [optional]
**shippingLength** | [**ProductShippingDimensionV3**](ProductShippingDimensionV3.md) |  |  [optional]
**shippingWidth** | [**ProductShippingDimensionV3**](ProductShippingDimensionV3.md) |  |  [optional]
**shippingHeight** | [**ProductShippingDimensionV3**](ProductShippingDimensionV3.md) |  |  [optional]
**displayAdsId** | **String** | An identifier for an item for dynamic remarketing campaigns. |  [optional]
**displayAdsSimilarIds** | **String** | Advertiser-specified recommendations. |  [optional]
**displayAdsTitle** | **String** | Title of an item for dynamic remarketing campaigns. |  [optional]
**displayAdsLink** | **String** | URL directly to your item&#39;s landing page for dynamic remarketing campaigns. |  [optional]
**displayAdsValue** | **Double** | Offer margin for dynamic remarketing campaigns. |  [optional]
**sellOnGoogleQuantity** | **String** | The quantity of the product that is available for selling on Google. Supported only for online products. |  [optional]
**promotionIds** | **List&lt;String&gt;** | The unique ID of a promotion. |  [optional]
**maxHandlingTime** | **String** | Maximal product handling time (in business days). |  [optional]
**minHandlingTime** | **String** | Minimal product handling time (in business days). |  [optional]
**costOfGoodsSold** | [**Price**](Price.md) |  |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | The source of the offer, i.e., how the offer was created. |  [optional]
**includedDestinations** | **List&lt;String&gt;** | The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included unless provided in excludedDestinations. |  [optional]
**excludedDestinations** | **List&lt;String&gt;** | The list of destinations to exclude for this target (corresponds to unchecked check boxes in Merchant Center). |  [optional]
**adsGrouping** | **String** | Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. |  [optional]
**adsLabels** | **List&lt;String&gt;** | Similar to adsGrouping, but only works on CPC. |  [optional]
**adsRedirect** | **String** | Allows advertisers to override the item URL when the product is shown within the context of Product Ads. |  [optional]
**productTypes** | **List&lt;String&gt;** | Categories of the item (formatted as in products data specification). |  [optional]
**ageGroup** | **String** | Target age group of the item. |  [optional]
**availability** | **String** | Availability status of the item. |  [optional]
**condition** | **String** | Condition or state of the item. |  [optional]
**gender** | **String** | Target gender of the item. |  [optional]
**sizeSystem** | **String** | System in which the size is specified. Recommended for apparel items. |  [optional]
**sizeType** | **String** | The cut of the item. Recommended for apparel items. |  [optional]
**energyEfficiencyClass** | **String** | The energy efficiency class as defined in EU directive 2010/30/EU. |  [optional]
**minEnergyEfficiencyClass** | **String** | The energy efficiency class as defined in EU directive 2010/30/EU. |  [optional]
**maxEnergyEfficiencyClass** | **String** | The energy efficiency class as defined in EU directive 2010/30/EU. |  [optional]
**taxCategory** | **String** | The tax category of the product, used to configure detailed tax nexus in account-level tax settings. |  [optional]
**transitTimeLabel** | **String** | The transit time label of the product, used to group product in account-level transit time tables. |  [optional]



## Enum: ChannelEnum

Name | Value
---- | -----
ONLINE | &quot;Online&quot;



## Enum: KindEnum

Name | Value
---- | -----
CONTENTPRODUCT | &quot;ContentProduct&quot;



## Enum: SourceEnum

Name | Value
---- | -----
API | &quot;Api&quot;
CRAWL | &quot;Crawl&quot;
FEED | &quot;Feed&quot;



