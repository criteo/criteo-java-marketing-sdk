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

/**
 * AudienceCreateRequest
 */

public class AudienceCreateRequest {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Integer advertiserId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public AudienceCreateRequest advertiserId(Integer advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Mandatory. The AdvertiserId this Audience will belong to.
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory. The AdvertiserId this Audience will belong to.")

  public Integer getAdvertiserId() {
    return advertiserId;
  }



  public void setAdvertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceCreateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Mandatory. The Audience Name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory. The Audience Name.")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public AudienceCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Optional description of the audience.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional description of the audience.")

  public String getDescription() {
    return description;
  }



  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateRequest audienceCreateRequest = (AudienceCreateRequest) o;
    return Objects.equals(this.advertiserId, audienceCreateRequest.advertiserId) &&
        Objects.equals(this.name, audienceCreateRequest.name) &&
        Objects.equals(this.description, audienceCreateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateRequest {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

