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
 * SellerBudgetMessage
 */

public class SellerBudgetMessage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SELLER_ID = "sellerId";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Integer> campaignIds = null;

  public static final String SERIALIZED_NAME_BUDGET_TYPE = "budgetType";
  @SerializedName(SERIALIZED_NAME_BUDGET_TYPE)
  private String budgetType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_SPEND = "spend";
  @SerializedName(SERIALIZED_NAME_SPEND)
  private Double spend;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ARCHIVED("Archived"),
    
    CURRENT("Current"),
    
    SCHEDULED("Scheduled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IS_SUSPENDED = "isSuspended";
  @SerializedName(SERIALIZED_NAME_IS_SUSPENDED)
  private Boolean isSuspended;


  public SellerBudgetMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public SellerBudgetMessage sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * Get sellerId
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSellerId() {
    return sellerId;
  }



  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public SellerBudgetMessage campaignIds(List<Integer> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public SellerBudgetMessage addCampaignIdsItem(Integer campaignIdsItem) {
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


  public SellerBudgetMessage budgetType(String budgetType) {
    
    this.budgetType = budgetType;
    return this;
  }

   /**
   * Get budgetType
   * @return budgetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBudgetType() {
    return budgetType;
  }



  public void setBudgetType(String budgetType) {
    this.budgetType = budgetType;
  }


  public SellerBudgetMessage amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAmount() {
    return amount;
  }



  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public SellerBudgetMessage startDate(OffsetDateTime startDate) {
    
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


  public SellerBudgetMessage endDate(String endDate) {
    
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


  public SellerBudgetMessage spend(Double spend) {
    
    this.spend = spend;
    return this;
  }

   /**
   * Get spend
   * @return spend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSpend() {
    return spend;
  }



  public void setSpend(Double spend) {
    this.spend = spend;
  }


  public SellerBudgetMessage status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }



  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SellerBudgetMessage isSuspended(Boolean isSuspended) {
    
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
    SellerBudgetMessage sellerBudgetMessage = (SellerBudgetMessage) o;
    return Objects.equals(this.id, sellerBudgetMessage.id) &&
        Objects.equals(this.sellerId, sellerBudgetMessage.sellerId) &&
        Objects.equals(this.campaignIds, sellerBudgetMessage.campaignIds) &&
        Objects.equals(this.budgetType, sellerBudgetMessage.budgetType) &&
        Objects.equals(this.amount, sellerBudgetMessage.amount) &&
        Objects.equals(this.startDate, sellerBudgetMessage.startDate) &&
        Objects.equals(this.endDate, sellerBudgetMessage.endDate) &&
        Objects.equals(this.spend, sellerBudgetMessage.spend) &&
        Objects.equals(this.status, sellerBudgetMessage.status) &&
        Objects.equals(this.isSuspended, sellerBudgetMessage.isSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellerId, campaignIds, budgetType, amount, startDate, endDate, spend, status, isSuspended);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerBudgetMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    spend: ").append(toIndentedString(spend)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

