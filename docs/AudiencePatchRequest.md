

# AudiencePatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | Mandatory. The Operation of this request. Can be either &#39;add&#39; or &#39;remove&#39;. |  [optional]
**schema** | **String** | Mandatory. The Schema specified for the identifiers. Can be &#39;email&#39;, &#39;madid&#39;, &#39;identityLink&#39; or &#39;gum&#39;. |  [optional]
**identifiers** | **List&lt;String&gt;** | Mandatory. The identifiers. |  [optional]
**gumCallerId** | **Integer** | Optional. GumCallerId required only when patching identifiers with &#39;gum&#39; schema. |  [optional]



