

# ProductTaxV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **Double** | The percentage of tax rate that applies to the item price. |  [optional]
**country** | **String** | The country within which the item is taxed, specified as a CLDR territory code. |  [optional]
**region** | **String** | The geographic region to which the tax rate applies. |  [optional]
**taxShip** | **Boolean** | Set to true if tax is charged on shipping. |  [optional]
**locationId** | [**Object**](.md) | The numeric ID of a location that the tax rate applies to as defined in the AdWords API. |  [optional]
**postalCode** | **String** | The postal code range that the tax rate applies to, represented by a ZIP code, a ZIP code prefix using * wildcard, a range between two ZIP codes or two ZIP code prefixes of equal length. Examples: 94114, 94*, 94002-95460, 94*-95*. |  [optional]



