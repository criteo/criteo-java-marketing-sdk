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
 * StatsQueryMessage
 */

public class StatsQueryMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private String advertiserIds;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    CAMPAIGNID("CampaignId"),
    
    CAMPAIGN("Campaign"),
    
    ADVERTISERID("AdvertiserId"),
    
    ADVERTISER("Advertiser"),
    
    CATEGORYID("CategoryId"),
    
    CATEGORY("Category"),
    
    SELLER("Seller"),
    
    HOUR("Hour"),
    
    DAY("Day"),
    
    WEEK("Week"),
    
    MONTH("Month"),
    
    YEAR("Year");

    private String value;

    DimensionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DimensionsEnum fromValue(String value) {
      for (DimensionsEnum b : DimensionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DimensionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DimensionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DimensionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DimensionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<DimensionsEnum> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = null;

  /**
   * Gets or Sets format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    CSV("Csv"),
    
    EXCEL("Excel"),
    
    XML("Xml"),
    
    JSON("Json");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * Gets or Sets timezone
   */
  @JsonAdapter(TimezoneEnum.Adapter.class)
  public enum TimezoneEnum {
    GMT("GMT"),
    
    PST("PST"),
    
    JST("JST");

    private String value;

    TimezoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimezoneEnum fromValue(String value) {
      for (TimezoneEnum b : TimezoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimezoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimezoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimezoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimezoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private TimezoneEnum timezone;


  public StatsQueryMessage advertiserIds(String advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

   /**
   * Get advertiserIds
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdvertiserIds() {
    return advertiserIds;
  }



  public void setAdvertiserIds(String advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public StatsQueryMessage startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }



  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public StatsQueryMessage endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }



  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public StatsQueryMessage dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public StatsQueryMessage addDimensionsItem(DimensionsEnum dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DimensionsEnum> getDimensions() {
    return dimensions;
  }



  public void setDimensions(List<DimensionsEnum> dimensions) {
    this.dimensions = dimensions;
  }


  public StatsQueryMessage metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public StatsQueryMessage addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMetrics() {
    return metrics;
  }



  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }


  public StatsQueryMessage format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FormatEnum getFormat() {
    return format;
  }



  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public StatsQueryMessage currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }



  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public StatsQueryMessage timezone(TimezoneEnum timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimezoneEnum getTimezone() {
    return timezone;
  }



  public void setTimezone(TimezoneEnum timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsQueryMessage statsQueryMessage = (StatsQueryMessage) o;
    return Objects.equals(this.advertiserIds, statsQueryMessage.advertiserIds) &&
        Objects.equals(this.startDate, statsQueryMessage.startDate) &&
        Objects.equals(this.endDate, statsQueryMessage.endDate) &&
        Objects.equals(this.dimensions, statsQueryMessage.dimensions) &&
        Objects.equals(this.metrics, statsQueryMessage.metrics) &&
        Objects.equals(this.format, statsQueryMessage.format) &&
        Objects.equals(this.currency, statsQueryMessage.currency) &&
        Objects.equals(this.timezone, statsQueryMessage.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, startDate, endDate, dimensions, metrics, format, currency, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsQueryMessage {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

