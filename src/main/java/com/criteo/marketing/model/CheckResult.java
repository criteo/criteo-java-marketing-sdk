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
import java.util.ArrayList;
import java.util.List;

/**
 * CheckResult
 */

public class CheckResult {
  public static final String SERIALIZED_NAME_CHECK_NAME = "checkName";
  @SerializedName(SERIALIZED_NAME_CHECK_NAME)
  private String checkName;

  public static final String SERIALIZED_NAME_SUCCESSFUL = "successful";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL)
  private Boolean successful;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_INNER_CHECK_RESULTS = "innerCheckResults";
  @SerializedName(SERIALIZED_NAME_INNER_CHECK_RESULTS)
  private List<CheckResult> innerCheckResults = null;


  public CheckResult checkName(String checkName) {
    
    this.checkName = checkName;
    return this;
  }

   /**
   * Get checkName
   * @return checkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckName() {
    return checkName;
  }



  public void setCheckName(String checkName) {
    this.checkName = checkName;
  }


  public CheckResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccessful() {
    return successful;
  }



  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public CheckResult error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }



  public void setError(String error) {
    this.error = error;
  }


  public CheckResult innerCheckResults(List<CheckResult> innerCheckResults) {
    
    this.innerCheckResults = innerCheckResults;
    return this;
  }

  public CheckResult addInnerCheckResultsItem(CheckResult innerCheckResultsItem) {
    if (this.innerCheckResults == null) {
      this.innerCheckResults = new ArrayList<>();
    }
    this.innerCheckResults.add(innerCheckResultsItem);
    return this;
  }

   /**
   * Get innerCheckResults
   * @return innerCheckResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CheckResult> getInnerCheckResults() {
    return innerCheckResults;
  }



  public void setInnerCheckResults(List<CheckResult> innerCheckResults) {
    this.innerCheckResults = innerCheckResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckResult checkResult = (CheckResult) o;
    return Objects.equals(this.checkName, checkResult.checkName) &&
        Objects.equals(this.successful, checkResult.successful) &&
        Objects.equals(this.error, checkResult.error) &&
        Objects.equals(this.innerCheckResults, checkResult.innerCheckResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkName, successful, error, innerCheckResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResult {\n");
    sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    innerCheckResults: ").append(toIndentedString(innerCheckResults)).append("\n");
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

