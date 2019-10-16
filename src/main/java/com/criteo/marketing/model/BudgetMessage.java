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

/**
 * BudgetMessage
 */

public class BudgetMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Integer advertiserId;

  public static final String SERIALIZED_NAME_BUDGET_ID = "budgetId";
  @SerializedName(SERIALIZED_NAME_BUDGET_ID)
  private Integer budgetId;

  public static final String SERIALIZED_NAME_BUDGET_NAME = "budgetName";
  @SerializedName(SERIALIZED_NAME_BUDGET_NAME)
  private String budgetName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "totalAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Double totalAmount;

  public static final String SERIALIZED_NAME_REMAINING_BUDGET = "remainingBudget";
  @SerializedName(SERIALIZED_NAME_REMAINING_BUDGET)
  private Double remainingBudget;

  public static final String SERIALIZED_NAME_REMAINING_BUDGET_UPDATED = "remainingBudgetUpdated";
  @SerializedName(SERIALIZED_NAME_REMAINING_BUDGET_UPDATED)
  private OffsetDateTime remainingBudgetUpdated;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;


  public BudgetMessage advertiserId(Integer advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAdvertiserId() {
    return advertiserId;
  }



  public void setAdvertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BudgetMessage budgetId(Integer budgetId) {
    
    this.budgetId = budgetId;
    return this;
  }

   /**
   * Get budgetId
   * @return budgetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBudgetId() {
    return budgetId;
  }



  public void setBudgetId(Integer budgetId) {
    this.budgetId = budgetId;
  }


  public BudgetMessage budgetName(String budgetName) {
    
    this.budgetName = budgetName;
    return this;
  }

   /**
   * Get budgetName
   * @return budgetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBudgetName() {
    return budgetName;
  }



  public void setBudgetName(String budgetName) {
    this.budgetName = budgetName;
  }


   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }




  public BudgetMessage totalAmount(Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalAmount() {
    return totalAmount;
  }



  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public BudgetMessage remainingBudget(Double remainingBudget) {
    
    this.remainingBudget = remainingBudget;
    return this;
  }

   /**
   * Get remainingBudget
   * @return remainingBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getRemainingBudget() {
    return remainingBudget;
  }



  public void setRemainingBudget(Double remainingBudget) {
    this.remainingBudget = remainingBudget;
  }


  public BudgetMessage remainingBudgetUpdated(OffsetDateTime remainingBudgetUpdated) {
    
    this.remainingBudgetUpdated = remainingBudgetUpdated;
    return this;
  }

   /**
   * Get remainingBudgetUpdated
   * @return remainingBudgetUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRemainingBudgetUpdated() {
    return remainingBudgetUpdated;
  }



  public void setRemainingBudgetUpdated(OffsetDateTime remainingBudgetUpdated) {
    this.remainingBudgetUpdated = remainingBudgetUpdated;
  }


  public BudgetMessage active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }



  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetMessage budgetMessage = (BudgetMessage) o;
    return Objects.equals(this.advertiserId, budgetMessage.advertiserId) &&
        Objects.equals(this.budgetId, budgetMessage.budgetId) &&
        Objects.equals(this.budgetName, budgetMessage.budgetName) &&
        Objects.equals(this.type, budgetMessage.type) &&
        Objects.equals(this.totalAmount, budgetMessage.totalAmount) &&
        Objects.equals(this.remainingBudget, budgetMessage.remainingBudget) &&
        Objects.equals(this.remainingBudgetUpdated, budgetMessage.remainingBudgetUpdated) &&
        Objects.equals(this.active, budgetMessage.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budgetId, budgetName, type, totalAmount, remainingBudget, remainingBudgetUpdated, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetMessage {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
    sb.append("    budgetName: ").append(toIndentedString(budgetName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    remainingBudget: ").append(toIndentedString(remainingBudget)).append("\n");
    sb.append("    remainingBudgetUpdated: ").append(toIndentedString(remainingBudgetUpdated)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

