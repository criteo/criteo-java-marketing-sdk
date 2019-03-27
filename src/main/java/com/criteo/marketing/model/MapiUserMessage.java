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
 * MapiUserMessage
 */

public class MapiUserMessage {
  public static final String SERIALIZED_NAME_UMS_ID = "umsId";
  @SerializedName(SERIALIZED_NAME_UMS_ID)
  private Integer umsId;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contactEmail";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  private String contactEmail;

  public MapiUserMessage umsId(Integer umsId) {
    this.umsId = umsId;
    return this;
  }

   /**
   * Get umsId
   * @return umsId
  **/
  @ApiModelProperty(value = "")
  public Integer getUmsId() {
    return umsId;
  }

  public void setUmsId(Integer umsId) {
    this.umsId = umsId;
  }

  public MapiUserMessage contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapiUserMessage mapiUserMessage = (MapiUserMessage) o;
    return Objects.equals(this.umsId, mapiUserMessage.umsId) &&
        Objects.equals(this.contactEmail, mapiUserMessage.contactEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(umsId, contactEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiUserMessage {\n");
    sb.append("    umsId: ").append(toIndentedString(umsId)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
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

