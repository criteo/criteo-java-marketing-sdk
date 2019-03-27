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
import com.criteo.marketing.model.BidMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CategoryBidMessage
 */

public class CategoryBidMessage {
  public static final String SERIALIZED_NAME_CATEGORY_HASHCODE = "categoryHashcode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_HASHCODE)
  private Integer categoryHashcode;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "categoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CATEGORY_BID = "categoryBid";
  @SerializedName(SERIALIZED_NAME_CATEGORY_BID)
  private BidMessage categoryBid = null;

  public CategoryBidMessage categoryHashcode(Integer categoryHashcode) {
    this.categoryHashcode = categoryHashcode;
    return this;
  }

   /**
   * Get categoryHashcode
   * @return categoryHashcode
  **/
  @ApiModelProperty(value = "")
  public Integer getCategoryHashcode() {
    return categoryHashcode;
  }

  public void setCategoryHashcode(Integer categoryHashcode) {
    this.categoryHashcode = categoryHashcode;
  }

  public CategoryBidMessage categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @ApiModelProperty(value = "")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public CategoryBidMessage categoryBid(BidMessage categoryBid) {
    this.categoryBid = categoryBid;
    return this;
  }

   /**
   * Get categoryBid
   * @return categoryBid
  **/
  @ApiModelProperty(value = "")
  public BidMessage getCategoryBid() {
    return categoryBid;
  }

  public void setCategoryBid(BidMessage categoryBid) {
    this.categoryBid = categoryBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryBidMessage categoryBidMessage = (CategoryBidMessage) o;
    return Objects.equals(this.categoryHashcode, categoryBidMessage.categoryHashcode) &&
        Objects.equals(this.categoryName, categoryBidMessage.categoryName) &&
        Objects.equals(this.categoryBid, categoryBidMessage.categoryBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryHashcode, categoryName, categoryBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryBidMessage {\n");
    sb.append("    categoryHashcode: ").append(toIndentedString(categoryHashcode)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryBid: ").append(toIndentedString(categoryBid)).append("\n");
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

