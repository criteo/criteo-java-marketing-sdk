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
import com.criteo.marketing.model.BidMessage;
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
 * CampaignMessage
 */

public class CampaignMessage {
  /**
   * Gets or Sets campaignType
   */
  @JsonAdapter(CampaignTypeEnum.Adapter.class)
  public enum CampaignTypeEnum {
    MIDFUNNEL("MidFunnel"),
    
    LOWERFUNNEL("LowerFunnel"),
    
    AUDIENCESELLING("AudienceSelling");

    private String value;

    CampaignTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignTypeEnum fromValue(String value) {
      for (CampaignTypeEnum b : CampaignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaignType";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignTypeEnum campaignType;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiserName";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Integer> categories = null;

  public static final String SERIALIZED_NAME_BUDGET_ID = "budgetId";
  @SerializedName(SERIALIZED_NAME_BUDGET_ID)
  private Integer budgetId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Integer advertiserId;

  /**
   * Gets or Sets campaignStatus
   */
  @JsonAdapter(CampaignStatusEnum.Adapter.class)
  public enum CampaignStatusEnum {
    RUNNING("Running"),
    
    ARCHIVED("Archived"),
    
    NOTRUNNING("NotRunning");

    private String value;

    CampaignStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignStatusEnum fromValue(String value) {
      for (CampaignStatusEnum b : CampaignStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_STATUS = "campaignStatus";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATUS)
  private CampaignStatusEnum campaignStatus;

  public static final String SERIALIZED_NAME_CAMPAIGN_BID = "campaignBid";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_BID)
  private BidMessage campaignBid;


  public CampaignMessage campaignType(CampaignTypeEnum campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }



  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }


  public CampaignMessage advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * Get advertiserName
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdvertiserName() {
    return advertiserName;
  }



  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public CampaignMessage categories(List<Integer> categories) {
    
    this.categories = categories;
    return this;
  }

  public CampaignMessage addCategoriesItem(Integer categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCategories() {
    return categories;
  }



  public void setCategories(List<Integer> categories) {
    this.categories = categories;
  }


  public CampaignMessage budgetId(Integer budgetId) {
    
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


  public CampaignMessage campaignId(Integer campaignId) {
    
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


  public CampaignMessage campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignName() {
    return campaignName;
  }



  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignMessage advertiserId(Integer advertiserId) {
    
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


  public CampaignMessage campaignStatus(CampaignStatusEnum campaignStatus) {
    
    this.campaignStatus = campaignStatus;
    return this;
  }

   /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }



  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  public CampaignMessage campaignBid(BidMessage campaignBid) {
    
    this.campaignBid = campaignBid;
    return this;
  }

   /**
   * Get campaignBid
   * @return campaignBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BidMessage getCampaignBid() {
    return campaignBid;
  }



  public void setCampaignBid(BidMessage campaignBid) {
    this.campaignBid = campaignBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMessage campaignMessage = (CampaignMessage) o;
    return Objects.equals(this.campaignType, campaignMessage.campaignType) &&
        Objects.equals(this.advertiserName, campaignMessage.advertiserName) &&
        Objects.equals(this.categories, campaignMessage.categories) &&
        Objects.equals(this.budgetId, campaignMessage.budgetId) &&
        Objects.equals(this.campaignId, campaignMessage.campaignId) &&
        Objects.equals(this.campaignName, campaignMessage.campaignName) &&
        Objects.equals(this.advertiserId, campaignMessage.advertiserId) &&
        Objects.equals(this.campaignStatus, campaignMessage.campaignStatus) &&
        Objects.equals(this.campaignBid, campaignMessage.campaignBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignType, advertiserName, categories, budgetId, campaignId, campaignName, advertiserId, campaignStatus, campaignBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMessage {\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    campaignBid: ").append(toIndentedString(campaignBid)).append("\n");
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

