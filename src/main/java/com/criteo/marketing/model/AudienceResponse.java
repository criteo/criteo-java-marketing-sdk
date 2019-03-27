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
 * AudienceResponse
 */

public class AudienceResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Integer advertiserId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Long updated;

  public static final String SERIALIZED_NAME_NB_LINES = "nbLines";
  @SerializedName(SERIALIZED_NAME_NB_LINES)
  private Integer nbLines;

  public static final String SERIALIZED_NAME_NB_LINES_EMAIL = "nbLinesEmail";
  @SerializedName(SERIALIZED_NAME_NB_LINES_EMAIL)
  private Integer nbLinesEmail;

  public static final String SERIALIZED_NAME_NB_MATCHES_EMAIL = "nbMatchesEmail";
  @SerializedName(SERIALIZED_NAME_NB_MATCHES_EMAIL)
  private Integer nbMatchesEmail;

  public AudienceResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AudienceResponse advertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @ApiModelProperty(value = "")
  public Integer getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AudienceResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AudienceResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Unix timestamp in seconds of audience creation
   * @return created
  **/
  @ApiModelProperty(value = "Unix timestamp in seconds of audience creation")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public AudienceResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Unix timestamp in seconds of audience last update
   * @return updated
  **/
  @ApiModelProperty(value = "Unix timestamp in seconds of audience last update")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public AudienceResponse nbLines(Integer nbLines) {
    this.nbLines = nbLines;
    return this;
  }

   /**
   * The total number of line in the audience
   * @return nbLines
  **/
  @ApiModelProperty(value = "The total number of line in the audience")
  public Integer getNbLines() {
    return nbLines;
  }

  public void setNbLines(Integer nbLines) {
    this.nbLines = nbLines;
  }

  public AudienceResponse nbLinesEmail(Integer nbLinesEmail) {
    this.nbLinesEmail = nbLinesEmail;
    return this;
  }

   /**
   * The number of email line in the audience
   * @return nbLinesEmail
  **/
  @ApiModelProperty(value = "The number of email line in the audience")
  public Integer getNbLinesEmail() {
    return nbLinesEmail;
  }

  public void setNbLinesEmail(Integer nbLinesEmail) {
    this.nbLinesEmail = nbLinesEmail;
  }

  public AudienceResponse nbMatchesEmail(Integer nbMatchesEmail) {
    this.nbMatchesEmail = nbMatchesEmail;
    return this;
  }

   /**
   * The number of email matches in the audience
   * @return nbMatchesEmail
  **/
  @ApiModelProperty(value = "The number of email matches in the audience")
  public Integer getNbMatchesEmail() {
    return nbMatchesEmail;
  }

  public void setNbMatchesEmail(Integer nbMatchesEmail) {
    this.nbMatchesEmail = nbMatchesEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceResponse audienceResponse = (AudienceResponse) o;
    return Objects.equals(this.id, audienceResponse.id) &&
        Objects.equals(this.advertiserId, audienceResponse.advertiserId) &&
        Objects.equals(this.name, audienceResponse.name) &&
        Objects.equals(this.description, audienceResponse.description) &&
        Objects.equals(this.created, audienceResponse.created) &&
        Objects.equals(this.updated, audienceResponse.updated) &&
        Objects.equals(this.nbLines, audienceResponse.nbLines) &&
        Objects.equals(this.nbLinesEmail, audienceResponse.nbLinesEmail) &&
        Objects.equals(this.nbMatchesEmail, audienceResponse.nbMatchesEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, advertiserId, name, description, created, updated, nbLines, nbLinesEmail, nbMatchesEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    nbLines: ").append(toIndentedString(nbLines)).append("\n");
    sb.append("    nbLinesEmail: ").append(toIndentedString(nbLinesEmail)).append("\n");
    sb.append("    nbMatchesEmail: ").append(toIndentedString(nbMatchesEmail)).append("\n");
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

