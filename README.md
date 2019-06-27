# Criteo Marketing SDK for Java
[![Build Status](https://travis-ci.com/criteo/criteo-java-marketing-sdk.svg?branch=master)](https://travis-ci.com/criteo/criteo-java-marketing-sdk)

Marketing API v.1.0

- API version: v.1.0


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

or

```shell
gradle install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.criteo</groupId>
  <artifactId>marketing.java-client</artifactId>
  <version>1.0.14</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.criteo:marketing.java-client:1.0.14"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/marketing.java-client-1.0.14.jar`
- `target/lib/*.jar`

## Example
Please see [src/examples/java/com/criteo/marketing/](src/examples/java/com/criteo/marketing/) for full examples to get a valid token and make a call to the API.

## Documentation for API Endpoints

All URIs are relative to *https://api.criteo.com/marketing*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertisersApi* | [**getCampaigns**](docs/AdvertisersApi.md#getCampaigns) | **GET** /v1/advertisers/{advertiserId}/campaigns | Gets all advertiser&#39;s campaigns
*AdvertisersApi* | [**getCategories**](docs/AdvertisersApi.md#getCategories) | **GET** /v1/advertisers/{advertiserId}/categories | Gets all advertiser&#39;s categories
*AdvertisersApi* | [**getCategory**](docs/AdvertisersApi.md#getCategory) | **GET** /v1/advertisers/{advertiserId}/categories/{categoryHashCode} | Gets a specific advertiser&#39;s category
*AudiencesApi* | [**addRemoveUsersToAudience**](docs/AudiencesApi.md#addRemoveUsersToAudience) | **PATCH** /v1/audiences/userlist/{audienceId} | Add/Remove users to an Audience.
*AudiencesApi* | [**createAudience**](docs/AudiencesApi.md#createAudience) | **POST** /v1/audiences/userlist | Create a new Audience.
*AudiencesApi* | [**deleteAudience**](docs/AudiencesApi.md#deleteAudience) | **DELETE** /v1/audiences/{audienceId} | Delete an Audience.
*AudiencesApi* | [**getAudiences**](docs/AudiencesApi.md#getAudiences) | **GET** /v1/audiences | Get the list of Audiences.
*AudiencesApi* | [**removeUsersFromAudience**](docs/AudiencesApi.md#removeUsersFromAudience) | **DELETE** /v1/audiences/userlist/{audienceId}/users | Remove all users from an Audience.
*AudiencesApi* | [**updateAudienceMetadata**](docs/AudiencesApi.md#updateAudienceMetadata) | **PUT** /v1/audiences/{audienceId} | Update an Audience metadata.
*AuthenticationApi* | [**oAuth2TokenPost**](docs/AuthenticationApi.md#oAuth2TokenPost) | **POST** /oauth2/token | Authenticates provided credentials and returns an access token
*BudgetsApi* | [**get**](docs/BudgetsApi.md#get) | **GET** /v1/budgets | Gets budgets
*CampaignsApi* | [**getBids**](docs/CampaignsApi.md#getBids) | **GET** /v1/campaigns/bids | Gets a the bids for campaigns and their categories
*CampaignsApi* | [**getCampaign**](docs/CampaignsApi.md#getCampaign) | **GET** /v1/campaigns/{campaignId} | Gets a specific campaign
*CampaignsApi* | [**getCampaigns**](docs/CampaignsApi.md#getCampaigns) | **GET** /v1/campaigns | Gets campaigns
*CampaignsApi* | [**getCategories**](docs/CampaignsApi.md#getCategories) | **GET** /v1/campaigns/{campaignId}/categories | Gets categories
*CampaignsApi* | [**getCategory**](docs/CampaignsApi.md#getCategory) | **GET** /v1/campaigns/{campaignId}/categories/{categoryHashCode} | Gets a specific category
*CampaignsApi* | [**updateBids**](docs/CampaignsApi.md#updateBids) | **PUT** /v1/campaigns/bids | Update bids for campaigns and their categories
*CategoriesApi* | [**getCategories**](docs/CategoriesApi.md#getCategories) | **GET** /v1/categories | Gets categories
*CategoriesApi* | [**updateCategories**](docs/CategoriesApi.md#updateCategories) | **PUT** /v1/categories | Enables/disables categories
*PortfolioApi* | [**getPortfolio**](docs/PortfolioApi.md#getPortfolio) | **GET** /v1/portfolio | Gets portfolio
*PublishersApi* | [**getStats**](docs/PublishersApi.md#getStats) | **POST** /v1/publishers/stats | 
*SellersApi* | [**createBudgets**](docs/SellersApi.md#createBudgets) | **POST** /v1/sellers/budgets | Creates a budget for a seller/list of sellers.
*SellersApi* | [**get**](docs/SellersApi.md#get) | **GET** /v1/sellers | Gets sellers details.
*SellersApi* | [**getCampaigns**](docs/SellersApi.md#getCampaigns) | **GET** /v1/sellers/campaigns | Gets campaigns
*SellersApi* | [**getStats**](docs/SellersApi.md#getStats) | **POST** /v1/sellers/stats | Generates a statistics report
*SellersApi* | [**updateBids**](docs/SellersApi.md#updateBids) | **PUT** /v1/sellers/bids | Set or update a bid for a seller/list of sellers.
*SellersApi* | [**updateBudgets**](docs/SellersApi.md#updateBudgets) | **PUT** /v1/sellers/budgets | Updates a budget for a seller/list of sellers.
*SellersV2Api* | [**createSellerBudgets**](docs/SellersV2Api.md#createSellerBudgets) | **POST** /v2/crp/budgets | Create a collection of budgets.
*SellersV2Api* | [**getBudgetsBySeller**](docs/SellersV2Api.md#getBudgetsBySeller) | **GET** /v2/crp/sellers/{sellerId}/budgets | Get a collection of budgets for this seller.
*SellersV2Api* | [**getBudgetsBySellerCampaignId**](docs/SellersV2Api.md#getBudgetsBySellerCampaignId) | **GET** /v2/crp/seller-campaigns/{sellerCampaignId}/budgets | Get a collection of budgets for this seller campaign.
*SellersV2Api* | [**getSeller**](docs/SellersV2Api.md#getSeller) | **GET** /v2/crp/sellers/{sellerId} | Get details for a seller.
*SellersV2Api* | [**getSellerBudget**](docs/SellersV2Api.md#getSellerBudget) | **GET** /v2/crp/budgets/{budgetId} | Get details for a budget.
*SellersV2Api* | [**getSellerBudgets**](docs/SellersV2Api.md#getSellerBudgets) | **GET** /v2/crp/budgets | Get a collection of budgets.
*SellersV2Api* | [**getSellerCampaign**](docs/SellersV2Api.md#getSellerCampaign) | **GET** /v2/crp/seller-campaigns/{sellerCampaignId} | Get details for a seller campaign.
*SellersV2Api* | [**getSellerCampaigns**](docs/SellersV2Api.md#getSellerCampaigns) | **GET** /v2/crp/seller-campaigns | Get a collection of seller campaigns.
*SellersV2Api* | [**getSellerCampaignsBySeller**](docs/SellersV2Api.md#getSellerCampaignsBySeller) | **GET** /v2/crp/sellers/{sellerId}/seller-campaigns | Get a collection of seller campaigns for this seller.
*SellersV2Api* | [**getSellers**](docs/SellersV2Api.md#getSellers) | **GET** /v2/crp/sellers | Get a collection of sellers.
*SellersV2Api* | [**updateSellerBudget**](docs/SellersV2Api.md#updateSellerBudget) | **PATCH** /v2/crp/budgets/{budgetId} | Modify a single budget.
*SellersV2Api* | [**updateSellerBudgets**](docs/SellersV2Api.md#updateSellerBudgets) | **PATCH** /v2/crp/budgets | Modify a collection of budgets.
*SellersV2Api* | [**updateSellerCampaign**](docs/SellersV2Api.md#updateSellerCampaign) | **PATCH** /v2/crp/seller-campaigns/{sellerCampaignId} | Update an existing seller campaign.
*SellersV2Api* | [**updateSellerCampaigns**](docs/SellersV2Api.md#updateSellerCampaigns) | **PATCH** /v2/crp/seller-campaigns | Update a collection of seller campaigns.
*SellersV2StatsApi* | [**campaigns**](docs/SellersV2StatsApi.md#campaigns) | **GET** /v2/crp/stats/campaigns | Get stats by campaign.
*SellersV2StatsApi* | [**sellerCampaigns**](docs/SellersV2StatsApi.md#sellerCampaigns) | **GET** /v2/crp/stats/seller-campaigns | Get stats by seller-campaign.
*SellersV2StatsApi* | [**sellers**](docs/SellersV2StatsApi.md#sellers) | **GET** /v2/crp/stats/sellers | Get stats by seller.
*StatisticsApi* | [**getStats**](docs/StatisticsApi.md#getStats) | **POST** /v1/statistics | Generates a statistics report


## Documentation for Models

 - [AudienceCreateRequest](docs/AudienceCreateRequest.md)
 - [AudienceCreateResponse](docs/AudienceCreateResponse.md)
 - [AudiencePatchRequest](docs/AudiencePatchRequest.md)
 - [AudiencePatchResponse](docs/AudiencePatchResponse.md)
 - [AudiencePutRequest](docs/AudiencePutRequest.md)
 - [AudienceResponse](docs/AudienceResponse.md)
 - [AudiencesGetResponse](docs/AudiencesGetResponse.md)
 - [BidMessage](docs/BidMessage.md)
 - [BudgetMessage](docs/BudgetMessage.md)
 - [CampaignBidChangeRequest](docs/CampaignBidChangeRequest.md)
 - [CampaignBidChangeResponse](docs/CampaignBidChangeResponse.md)
 - [CampaignBidMessage](docs/CampaignBidMessage.md)
 - [CampaignMessage](docs/CampaignMessage.md)
 - [CatalogProduct](docs/CatalogProduct.md)
 - [CategoryBidChangeRequest](docs/CategoryBidChangeRequest.md)
 - [CategoryBidMessage](docs/CategoryBidMessage.md)
 - [CategoryMessage](docs/CategoryMessage.md)
 - [CategoryUpdateError](docs/CategoryUpdateError.md)
 - [CategoryUpdateInput](docs/CategoryUpdateInput.md)
 - [CategoryUpdatesPerCatalog](docs/CategoryUpdatesPerCatalog.md)
 - [CategoryUpdatesPerCatalogError](docs/CategoryUpdatesPerCatalogError.md)
 - [CheckResult](docs/CheckResult.md)
 - [ClientRegistrationRequestMessage](docs/ClientRegistrationRequestMessage.md)
 - [ClientRegistrationResponseMessage](docs/ClientRegistrationResponseMessage.md)
 - [CreateSellerBudgetMapiMessage](docs/CreateSellerBudgetMapiMessage.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [GoogleProduct](docs/GoogleProduct.md)
 - [IThrottlingConfiguration](docs/IThrottlingConfiguration.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Installment](docs/Installment.md)
 - [InstallmentAmount](docs/InstallmentAmount.md)
 - [LoyatyPoints](docs/LoyatyPoints.md)
 - [MapiUserMessage](docs/MapiUserMessage.md)
 - [MarketplaceCampaignMessage](docs/MarketplaceCampaignMessage.md)
 - [MessageWithDetailsCampaignBidChangeResponse](docs/MessageWithDetailsCampaignBidChangeResponse.md)
 - [MessageWithDetailsCategoryUpdatesPerCatalogError](docs/MessageWithDetailsCategoryUpdatesPerCatalogError.md)
 - [PolicyRouteInfo](docs/PolicyRouteInfo.md)
 - [PortfolioMessage](docs/PortfolioMessage.md)
 - [Price](docs/Price.md)
 - [ProductImporterMessage](docs/ProductImporterMessage.md)
 - [PublisherFileStatsMessage](docs/PublisherFileStatsMessage.md)
 - [PublisherStatsMessage](docs/PublisherStatsMessage.md)
 - [PublisherStatsQueryMessage](docs/PublisherStatsQueryMessage.md)
 - [RoutePolicy](docs/RoutePolicy.md)
 - [SellerBase](docs/SellerBase.md)
 - [SellerBidInfoMessage](docs/SellerBidInfoMessage.md)
 - [SellerBidsMessage](docs/SellerBidsMessage.md)
 - [SellerBudgetCreateMessage](docs/SellerBudgetCreateMessage.md)
 - [SellerBudgetInfoMessage](docs/SellerBudgetInfoMessage.md)
 - [SellerBudgetMessage](docs/SellerBudgetMessage.md)
 - [SellerBudgetResponseMessage](docs/SellerBudgetResponseMessage.md)
 - [SellerBudgetUpdateMessage](docs/SellerBudgetUpdateMessage.md)
 - [SellerBudgetsCreateMessage](docs/SellerBudgetsCreateMessage.md)
 - [SellerBudgetsMessage](docs/SellerBudgetsMessage.md)
 - [SellerBudgetsUpdateMessage](docs/SellerBudgetsUpdateMessage.md)
 - [SellerCampaignMessage](docs/SellerCampaignMessage.md)
 - [SellerCampaignUpdate](docs/SellerCampaignUpdate.md)
 - [SellerInfoMessage](docs/SellerInfoMessage.md)
 - [SellerMessage](docs/SellerMessage.md)
 - [ServiceStatusCheckResult](docs/ServiceStatusCheckResult.md)
 - [Shipping](docs/Shipping.md)
 - [ShippingSize](docs/ShippingSize.md)
 - [StatsQueryMessage](docs/StatsQueryMessage.md)
 - [StatsQueryMessageEx](docs/StatsQueryMessageEx.md)
 - [Tax](docs/Tax.md)
 - [ThrottlePolicy](docs/ThrottlePolicy.md)
 - [ThrottlePolicyRates](docs/ThrottlePolicyRates.md)
 - [UnitMeasure](docs/UnitMeasure.md)
 - [UpdateSellerBudgetMessage](docs/UpdateSellerBudgetMessage.md)
 - [UpdateSellerBudgetMessageBase](docs/UpdateSellerBudgetMessageBase.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Disclaimer

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.