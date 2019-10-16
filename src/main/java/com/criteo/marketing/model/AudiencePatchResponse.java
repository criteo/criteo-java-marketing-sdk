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
 * AudiencePatchResponse
 */

public class AudiencePatchResponse {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_REQUEST_DATE = "requestDate";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATE)
  private OffsetDateTime requestDate;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private String schema;

  public static final String SERIALIZED_NAME_NB_VALID_IDENTIFIERS = "nbValidIdentifiers";
  @SerializedName(SERIALIZED_NAME_NB_VALID_IDENTIFIERS)
  private Integer nbValidIdentifiers;

  public static final String SERIALIZED_NAME_NB_INVALID_IDENTIFIERS = "nbInvalidIdentifiers";
  @SerializedName(SERIALIZED_NAME_NB_INVALID_IDENTIFIERS)
  private Integer nbInvalidIdentifiers;

  public static final String SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS = "sampleInvalidIdentifiers";
  @SerializedName(SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS)
  private List<String> sampleInvalidIdentifiers = null;


  public AudiencePatchResponse operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The Operation recorded.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Operation recorded.")

  public String getOperation() {
    return operation;
  }



  public void setOperation(String operation) {
    this.operation = operation;
  }


  public AudiencePatchResponse requestDate(OffsetDateTime requestDate) {
    
    this.requestDate = requestDate;
    return this;
  }

   /**
   * When the Operation was recorded.
   * @return requestDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the Operation was recorded.")

  public OffsetDateTime getRequestDate() {
    return requestDate;
  }



  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }


  public AudiencePatchResponse schema(String schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * The schema specified for the identifiers.
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schema specified for the identifiers.")

  public String getSchema() {
    return schema;
  }



  public void setSchema(String schema) {
    this.schema = schema;
  }


  public AudiencePatchResponse nbValidIdentifiers(Integer nbValidIdentifiers) {
    
    this.nbValidIdentifiers = nbValidIdentifiers;
    return this;
  }

   /**
   * Get nbValidIdentifiers
   * @return nbValidIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNbValidIdentifiers() {
    return nbValidIdentifiers;
  }



  public void setNbValidIdentifiers(Integer nbValidIdentifiers) {
    this.nbValidIdentifiers = nbValidIdentifiers;
  }


  public AudiencePatchResponse nbInvalidIdentifiers(Integer nbInvalidIdentifiers) {
    
    this.nbInvalidIdentifiers = nbInvalidIdentifiers;
    return this;
  }

   /**
   * Get nbInvalidIdentifiers
   * @return nbInvalidIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNbInvalidIdentifiers() {
    return nbInvalidIdentifiers;
  }



  public void setNbInvalidIdentifiers(Integer nbInvalidIdentifiers) {
    this.nbInvalidIdentifiers = nbInvalidIdentifiers;
  }


  public AudiencePatchResponse sampleInvalidIdentifiers(List<String> sampleInvalidIdentifiers) {
    
    this.sampleInvalidIdentifiers = sampleInvalidIdentifiers;
    return this;
  }

  public AudiencePatchResponse addSampleInvalidIdentifiersItem(String sampleInvalidIdentifiersItem) {
    if (this.sampleInvalidIdentifiers == null) {
      this.sampleInvalidIdentifiers = new ArrayList<>();
    }
    this.sampleInvalidIdentifiers.add(sampleInvalidIdentifiersItem);
    return this;
  }

   /**
   * Optionnal. A sample of invalid identifiers if there is some.
   * @return sampleInvalidIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optionnal. A sample of invalid identifiers if there is some.")

  public List<String> getSampleInvalidIdentifiers() {
    return sampleInvalidIdentifiers;
  }



  public void setSampleInvalidIdentifiers(List<String> sampleInvalidIdentifiers) {
    this.sampleInvalidIdentifiers = sampleInvalidIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePatchResponse audiencePatchResponse = (AudiencePatchResponse) o;
    return Objects.equals(this.operation, audiencePatchResponse.operation) &&
        Objects.equals(this.requestDate, audiencePatchResponse.requestDate) &&
        Objects.equals(this.schema, audiencePatchResponse.schema) &&
        Objects.equals(this.nbValidIdentifiers, audiencePatchResponse.nbValidIdentifiers) &&
        Objects.equals(this.nbInvalidIdentifiers, audiencePatchResponse.nbInvalidIdentifiers) &&
        Objects.equals(this.sampleInvalidIdentifiers, audiencePatchResponse.sampleInvalidIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, requestDate, schema, nbValidIdentifiers, nbInvalidIdentifiers, sampleInvalidIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudiencePatchResponse {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    nbValidIdentifiers: ").append(toIndentedString(nbValidIdentifiers)).append("\n");
    sb.append("    nbInvalidIdentifiers: ").append(toIndentedString(nbInvalidIdentifiers)).append("\n");
    sb.append("    sampleInvalidIdentifiers: ").append(toIndentedString(sampleInvalidIdentifiers)).append("\n");
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

