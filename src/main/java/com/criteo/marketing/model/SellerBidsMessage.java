/*
 * Marketing API v.1.0
 * IMPORTANT: This swagger links to Criteo production environment. Any test applied here will thus impact real campaigns.
 *
 * The version of the OpenAPI document: v.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.marketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.marketing.model.SellerBidInfoMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SellerBidsMessage
 */

public class SellerBidsMessage {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_SELLER_BIDS = "sellerBids";
  @SerializedName(SERIALIZED_NAME_SELLER_BIDS)
  private List<SellerBidInfoMessage> sellerBids = null;


  public SellerBidsMessage campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCampaignId() {
    return campaignId;
  }



  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public SellerBidsMessage sellerBids(List<SellerBidInfoMessage> sellerBids) {
    
    this.sellerBids = sellerBids;
    return this;
  }

  public SellerBidsMessage addSellerBidsItem(SellerBidInfoMessage sellerBidsItem) {
    if (this.sellerBids == null) {
      this.sellerBids = new ArrayList<>();
    }
    this.sellerBids.add(sellerBidsItem);
    return this;
  }

   /**
   * Get sellerBids
   * @return sellerBids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SellerBidInfoMessage> getSellerBids() {
    return sellerBids;
  }



  public void setSellerBids(List<SellerBidInfoMessage> sellerBids) {
    this.sellerBids = sellerBids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerBidsMessage sellerBidsMessage = (SellerBidsMessage) o;
    return Objects.equals(this.campaignId, sellerBidsMessage.campaignId) &&
        Objects.equals(this.sellerBids, sellerBidsMessage.sellerBids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, sellerBids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerBidsMessage {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    sellerBids: ").append(toIndentedString(sellerBids)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

