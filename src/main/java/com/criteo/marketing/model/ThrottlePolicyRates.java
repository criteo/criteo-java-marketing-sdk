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
 * ThrottlePolicyRates
 */

public class ThrottlePolicyRates {
  public static final String SERIALIZED_NAME_HOUR = "hour";
  @SerializedName(SERIALIZED_NAME_HOUR)
  private Long hour;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Long custom;

  public static final String SERIALIZED_NAME_SECOND = "second";
  @SerializedName(SERIALIZED_NAME_SECOND)
  private Long second;

  public static final String SERIALIZED_NAME_MINUTE = "minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  private Long minute;

  public ThrottlePolicyRates hour(Long hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @ApiModelProperty(value = "")
  public Long getHour() {
    return hour;
  }

  public void setHour(Long hour) {
    this.hour = hour;
  }

  public ThrottlePolicyRates custom(Long custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @ApiModelProperty(value = "")
  public Long getCustom() {
    return custom;
  }

  public void setCustom(Long custom) {
    this.custom = custom;
  }

  public ThrottlePolicyRates second(Long second) {
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @ApiModelProperty(value = "")
  public Long getSecond() {
    return second;
  }

  public void setSecond(Long second) {
    this.second = second;
  }

  public ThrottlePolicyRates minute(Long minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @ApiModelProperty(value = "")
  public Long getMinute() {
    return minute;
  }

  public void setMinute(Long minute) {
    this.minute = minute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrottlePolicyRates throttlePolicyRates = (ThrottlePolicyRates) o;
    return Objects.equals(this.hour, throttlePolicyRates.hour) &&
        Objects.equals(this.custom, throttlePolicyRates.custom) &&
        Objects.equals(this.second, throttlePolicyRates.second) &&
        Objects.equals(this.minute, throttlePolicyRates.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, custom, second, minute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottlePolicyRates {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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

