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
 * UpdateSellerBudgetMessage
 */

public class UpdateSellerBudgetMessage {
  public static final String SERIALIZED_NAME_BUDGET_ID = "budgetId";
  @SerializedName(SERIALIZED_NAME_BUDGET_ID)
  private Long budgetId;

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
  private List<Integer> campaignIds = null;

  public static final String SERIALIZED_NAME_IS_SUSPENDED = "isSuspended";
  @SerializedName(SERIALIZED_NAME_IS_SUSPENDED)
  private Boolean isSuspended;


  public UpdateSellerBudgetMessage budgetId(Long budgetId) {
    
    this.budgetId = budgetId;
    return this;
  }

   /**
   * Get budgetId
   * @return budgetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBudgetId() {
    return budgetId;
  }



  public void setBudgetId(Long budgetId) {
    this.budgetId = budgetId;
  }


  public UpdateSellerBudgetMessage amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }



  public void setAmount(String amount) {
    this.amount = amount;
  }


  public UpdateSellerBudgetMessage startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }



  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public UpdateSellerBudgetMessage endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndDate() {
    return endDate;
  }



  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public UpdateSellerBudgetMessage campaignIds(List<Integer> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public UpdateSellerBudgetMessage addCampaignIdsItem(Integer campaignIdsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCampaignIds() {
    return campaignIds;
  }



  public void setCampaignIds(List<Integer> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public UpdateSellerBudgetMessage isSuspended(Boolean isSuspended) {
    
    this.isSuspended = isSuspended;
    return this;
  }

   /**
   * Get isSuspended
   * @return isSuspended
  **/
  @javax.annotation.Nullable
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
    UpdateSellerBudgetMessage updateSellerBudgetMessage = (UpdateSellerBudgetMessage) o;
    return Objects.equals(this.budgetId, updateSellerBudgetMessage.budgetId) &&
        Objects.equals(this.amount, updateSellerBudgetMessage.amount) &&
        Objects.equals(this.startDate, updateSellerBudgetMessage.startDate) &&
        Objects.equals(this.endDate, updateSellerBudgetMessage.endDate) &&
        Objects.equals(this.campaignIds, updateSellerBudgetMessage.campaignIds) &&
        Objects.equals(this.isSuspended, updateSellerBudgetMessage.isSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetId, amount, startDate, endDate, campaignIds, isSuspended);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSellerBudgetMessage {\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
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

