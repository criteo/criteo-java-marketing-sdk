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

/**
 * CategoryUpdateError
 */

public class CategoryUpdateError {
  public static final String SERIALIZED_NAME_CATEGORY_HASH_CODE = "categoryHashCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_HASH_CODE)
  private Integer categoryHashCode;

  /**
   * Gets or Sets errorCode
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    OK("OK"),
    
    ACCESSDENIED("AccessDenied"),
    
    ENABLEDCATEGORYNUMBEREXCEEDED("EnabledCategoryNumberExceeded"),
    
    CATEGORIESNOTENABLED("CategoriesNotEnabled"),
    
    DUPLICATECATALOGENTRY("DuplicateCatalogEntry"),
    
    INVALIDCATALOGID("InvalidCatalogId"),
    
    INVALIDCATEGORYHASHCODE("InvalidCategoryHashcode"),
    
    INACTIVECATEGORY("InactiveCategory"),
    
    DUPLICATECATEGORYENTRY("DuplicateCategoryEntry"),
    
    BIDDINGCATEGORIESONTHISCAMPAIGNNOTALLOWED("BiddingCategoriesOnThisCampaignNotAllowed"),
    
    CAMPAIGNNOTINPORTFOLIOORNOTACTIVE("CampaignNotInPortfolioOrNotActive"),
    
    DUPLICATECAMPAIGNENTRY("DuplicateCampaignEntry"),
    
    BIDDINGONTHISCAMPAIGNNOTALLOWED("BiddingOnThisCampaignNotAllowed"),
    
    BIDNOTINRANGE("BidNotInRange"),
    
    FOURDECIMALSNOTALLOWED("FourDecimalsNotAllowed"),
    
    BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED("BiddingOnTargetBudgetCampaignNotAllowed");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String text) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ErrorCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

   /**
   * Get categoryHashCode
   * @return categoryHashCode
  **/
  @ApiModelProperty(value = "")
  public Integer getCategoryHashCode() {
    return categoryHashCode;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryUpdateError categoryUpdateError = (CategoryUpdateError) o;
    return Objects.equals(this.categoryHashCode, categoryUpdateError.categoryHashCode) &&
        Objects.equals(this.errorCode, categoryUpdateError.errorCode) &&
        Objects.equals(this.errorMessage, categoryUpdateError.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryHashCode, errorCode, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdateError {\n");
    sb.append("    categoryHashCode: ").append(toIndentedString(categoryHashCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

