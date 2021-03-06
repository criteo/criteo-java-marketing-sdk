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
 * ProductShippingDimensionV3
 */

public class ProductShippingDimensionV3 {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public ProductShippingDimensionV3 value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * The dimension of the product used to calculate the shipping cost of the item.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dimension of the product used to calculate the shipping cost of the item.")

  public Double getValue() {
    return value;
  }



  public void setValue(Double value) {
    this.value = value;
  }


  public ProductShippingDimensionV3 unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The unit of value.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit of value.")

  public String getUnit() {
    return unit;
  }



  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductShippingDimensionV3 productShippingDimensionV3 = (ProductShippingDimensionV3) o;
    return Objects.equals(this.value, productShippingDimensionV3.value) &&
        Objects.equals(this.unit, productShippingDimensionV3.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductShippingDimensionV3 {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

