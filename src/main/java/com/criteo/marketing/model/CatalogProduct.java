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
import com.criteo.marketing.model.GoogleProduct;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CatalogProduct
 */

public class CatalogProduct {
  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private Long batchId;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  /**
   * Mandatory. Method type, the acceptable values are insert and delete
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    INSERT("Insert"),
    
    DELETE("Delete");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_ITEM_GROUP_ID = "itemGroupId";
  @SerializedName(SERIALIZED_NAME_ITEM_GROUP_ID)
  private String itemGroupId;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private GoogleProduct product;


  public CatalogProduct batchId(Long batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Mandatory. batch Id, set by the partner. Use to future deduplication
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory. batch Id, set by the partner. Use to future deduplication")

  public Long getBatchId() {
    return batchId;
  }



  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }


  public CatalogProduct catalogId(Integer catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Mandatory. The criteo catalog (partner) Id
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory. The criteo catalog (partner) Id")

  public Integer getCatalogId() {
    return catalogId;
  }



  public void setCatalogId(Integer catalogId) {
    this.catalogId = catalogId;
  }


  public CatalogProduct method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Mandatory. Method type, the acceptable values are insert and delete
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory. Method type, the acceptable values are insert and delete")

  public MethodEnum getMethod() {
    return method;
  }



  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public CatalogProduct productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Mandatory if the method is delete. This is the id of the product to delete in the partner catalog
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory if the method is delete. This is the id of the product to delete in the partner catalog")

  public String getProductId() {
    return productId;
  }



  public void setProductId(String productId) {
    this.productId = productId;
  }


  public CatalogProduct itemGroupId(String itemGroupId) {
    
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * Mandatory if the method is delete and the product is a variant. This id is the grouping key (parent id) for variants
   * @return itemGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory if the method is delete and the product is a variant. This id is the grouping key (parent id) for variants")

  public String getItemGroupId() {
    return itemGroupId;
  }



  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }


  public CatalogProduct product(GoogleProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GoogleProduct getProduct() {
    return product;
  }



  public void setProduct(GoogleProduct product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogProduct catalogProduct = (CatalogProduct) o;
    return Objects.equals(this.batchId, catalogProduct.batchId) &&
        Objects.equals(this.catalogId, catalogProduct.catalogId) &&
        Objects.equals(this.method, catalogProduct.method) &&
        Objects.equals(this.productId, catalogProduct.productId) &&
        Objects.equals(this.itemGroupId, catalogProduct.itemGroupId) &&
        Objects.equals(this.product, catalogProduct.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, catalogId, method, productId, itemGroupId, product);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogProduct {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

