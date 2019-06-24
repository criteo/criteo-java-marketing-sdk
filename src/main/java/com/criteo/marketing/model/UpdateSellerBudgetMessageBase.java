/*
 * Marketing API v.1.0
 * IMPORTANT: This swagger links to Criteo production environment. Any test applied here will thus impact real campaigns.
 *
 * OpenAPI spec version: v.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.marketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateSellerBudgetMessageBase
 */

public class UpdateSellerBudgetMessageBase {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Integer> campaignIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_SUSPENDED = "isSuspended";
  @SerializedName(SERIALIZED_NAME_IS_SUSPENDED)
  private Boolean isSuspended;

  public UpdateSellerBudgetMessageBase amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public UpdateSellerBudgetMessageBase startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public UpdateSellerBudgetMessageBase endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public UpdateSellerBudgetMessageBase campaignIds(List<Integer> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public UpdateSellerBudgetMessageBase addCampaignIdsItem(Integer campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Integer> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public UpdateSellerBudgetMessageBase isSuspended(Boolean isSuspended) {
    this.isSuspended = isSuspended;
    return this;
  }

   /**
   * Get isSuspended
   * @return isSuspended
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsSuspended() {
    return isSuspended;
  }

  public void setIsSuspended(Boolean isSuspended) {
    this.isSuspended = isSuspended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSellerBudgetMessageBase updateSellerBudgetMessageBase = (UpdateSellerBudgetMessageBase) o;
    return Objects.equals(this.amount, updateSellerBudgetMessageBase.amount) &&
        Objects.equals(this.startDate, updateSellerBudgetMessageBase.startDate) &&
        Objects.equals(this.endDate, updateSellerBudgetMessageBase.endDate) &&
        Objects.equals(this.campaignIds, updateSellerBudgetMessageBase.campaignIds) &&
        Objects.equals(this.isSuspended, updateSellerBudgetMessageBase.isSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, startDate, endDate, campaignIds, isSuspended);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSellerBudgetMessageBase {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    isSuspended: ").append(toIndentedString(isSuspended)).append("\n");
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

