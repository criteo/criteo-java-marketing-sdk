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
 * AudienceCreateResponse
 */

public class AudienceCreateResponse {
  public static final String SERIALIZED_NAME_AUDIENCE_ID = "audienceId";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
  private Integer audienceId;


  public AudienceCreateResponse audienceId(Integer audienceId) {
    
    this.audienceId = audienceId;
    return this;
  }

   /**
   * Get audienceId
   * @return audienceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAudienceId() {
    return audienceId;
  }



  public void setAudienceId(Integer audienceId) {
    this.audienceId = audienceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateResponse audienceCreateResponse = (AudienceCreateResponse) o;
    return Objects.equals(this.audienceId, audienceCreateResponse.audienceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateResponse {\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
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

