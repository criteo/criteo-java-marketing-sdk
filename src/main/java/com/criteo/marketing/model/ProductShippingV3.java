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
import com.criteo.marketing.model.Price;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProductShippingV3
 */

public class ProductShippingV3 {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Price price;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Object locationId;

  public static final String SERIALIZED_NAME_LOCATION_GROUP_NAME = "locationGroupName";
  @SerializedName(SERIALIZED_NAME_LOCATION_GROUP_NAME)
  private String locationGroupName;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;


  public ProductShippingV3 price(Price price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Price getPrice() {
    return price;
  }



  public void setPrice(Price price) {
    this.price = price;
  }


  public ProductShippingV3 country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The CLDR territory code of the country to which an item will ship.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CLDR territory code of the country to which an item will ship.")

  public String getCountry() {
    return country;
  }



  public void setCountry(String country) {
    this.country = country;
  }


  public ProductShippingV3 region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The geographic region to which a shipping rate applies.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The geographic region to which a shipping rate applies.")

  public String getRegion() {
    return region;
  }



  public void setRegion(String region) {
    this.region = region;
  }


  public ProductShippingV3 service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * A free-form description of the service class or delivery speed.
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A free-form description of the service class or delivery speed.")

  public String getService() {
    return service;
  }



  public void setService(String service) {
    this.service = service;
  }


  public ProductShippingV3 locationId(Object locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * The numeric ID of a location that the shipping rate applies to as defined in the AdWords API.
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID of a location that the shipping rate applies to as defined in the AdWords API.")

  public Object getLocationId() {
    return locationId;
  }



  public void setLocationId(Object locationId) {
    this.locationId = locationId;
  }


  public ProductShippingV3 locationGroupName(String locationGroupName) {
    
    this.locationGroupName = locationGroupName;
    return this;
  }

   /**
   * The location where the shipping is applicable, represented by a location group name.
   * @return locationGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location where the shipping is applicable, represented by a location group name.")

  public String getLocationGroupName() {
    return locationGroupName;
  }



  public void setLocationGroupName(String locationGroupName) {
    this.locationGroupName = locationGroupName;
  }


  public ProductShippingV3 postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code range that the shipping rate applies to, represented by a postal code, a postal code prefix followed by a * wildcard, a range between two postal codes or two postal code prefixes of equal length.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code range that the shipping rate applies to, represented by a postal code, a postal code prefix followed by a * wildcard, a range between two postal codes or two postal code prefixes of equal length.")

  public String getPostalCode() {
    return postalCode;
  }



  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductShippingV3 productShippingV3 = (ProductShippingV3) o;
    return Objects.equals(this.price, productShippingV3.price) &&
        Objects.equals(this.country, productShippingV3.country) &&
        Objects.equals(this.region, productShippingV3.region) &&
        Objects.equals(this.service, productShippingV3.service) &&
        Objects.equals(this.locationId, productShippingV3.locationId) &&
        Objects.equals(this.locationGroupName, productShippingV3.locationGroupName) &&
        Objects.equals(this.postalCode, productShippingV3.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, country, region, service, locationId, locationGroupName, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductShippingV3 {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationGroupName: ").append(toIndentedString(locationGroupName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

