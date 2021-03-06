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
import com.criteo.marketing.model.PolicyRouteInfo;
import com.criteo.marketing.model.ThrottlePolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoutePolicy
 */

public class RoutePolicy {
  public static final String SERIALIZED_NAME_POLICY_ROUTE_INFO = "policyRouteInfo";
  @SerializedName(SERIALIZED_NAME_POLICY_ROUTE_INFO)
  private PolicyRouteInfo policyRouteInfo;

  public static final String SERIALIZED_NAME_THROTTLE_POLICY = "throttlePolicy";
  @SerializedName(SERIALIZED_NAME_THROTTLE_POLICY)
  private ThrottlePolicy throttlePolicy;


  public RoutePolicy policyRouteInfo(PolicyRouteInfo policyRouteInfo) {
    
    this.policyRouteInfo = policyRouteInfo;
    return this;
  }

   /**
   * Get policyRouteInfo
   * @return policyRouteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PolicyRouteInfo getPolicyRouteInfo() {
    return policyRouteInfo;
  }



  public void setPolicyRouteInfo(PolicyRouteInfo policyRouteInfo) {
    this.policyRouteInfo = policyRouteInfo;
  }


  public RoutePolicy throttlePolicy(ThrottlePolicy throttlePolicy) {
    
    this.throttlePolicy = throttlePolicy;
    return this;
  }

   /**
   * Get throttlePolicy
   * @return throttlePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThrottlePolicy getThrottlePolicy() {
    return throttlePolicy;
  }



  public void setThrottlePolicy(ThrottlePolicy throttlePolicy) {
    this.throttlePolicy = throttlePolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutePolicy routePolicy = (RoutePolicy) o;
    return Objects.equals(this.policyRouteInfo, routePolicy.policyRouteInfo) &&
        Objects.equals(this.throttlePolicy, routePolicy.throttlePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyRouteInfo, throttlePolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutePolicy {\n");
    sb.append("    policyRouteInfo: ").append(toIndentedString(policyRouteInfo)).append("\n");
    sb.append("    throttlePolicy: ").append(toIndentedString(throttlePolicy)).append("\n");
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

