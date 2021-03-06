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
import com.criteo.marketing.model.SellerBudgetResponseMessage;
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
 * SellerBudgetsMessage
 */

public class SellerBudgetsMessage {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_SELLER_BUDGETS = "sellerBudgets";
  @SerializedName(SERIALIZED_NAME_SELLER_BUDGETS)
  private List<SellerBudgetResponseMessage> sellerBudgets = null;


  public SellerBudgetsMessage campaignId(Integer campaignId) {
    
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


  public SellerBudgetsMessage sellerBudgets(List<SellerBudgetResponseMessage> sellerBudgets) {
    
    this.sellerBudgets = sellerBudgets;
    return this;
  }

  public SellerBudgetsMessage addSellerBudgetsItem(SellerBudgetResponseMessage sellerBudgetsItem) {
    if (this.sellerBudgets == null) {
      this.sellerBudgets = new ArrayList<>();
    }
    this.sellerBudgets.add(sellerBudgetsItem);
    return this;
  }

   /**
   * Get sellerBudgets
   * @return sellerBudgets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SellerBudgetResponseMessage> getSellerBudgets() {
    return sellerBudgets;
  }



  public void setSellerBudgets(List<SellerBudgetResponseMessage> sellerBudgets) {
    this.sellerBudgets = sellerBudgets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerBudgetsMessage sellerBudgetsMessage = (SellerBudgetsMessage) o;
    return Objects.equals(this.campaignId, sellerBudgetsMessage.campaignId) &&
        Objects.equals(this.sellerBudgets, sellerBudgetsMessage.sellerBudgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, sellerBudgets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerBudgetsMessage {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    sellerBudgets: ").append(toIndentedString(sellerBudgets)).append("\n");
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

