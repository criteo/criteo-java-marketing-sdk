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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ErrorSource
 */

public class ErrorSource {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CONTINUE("Continue"),
    
    SWITCHINGPROTOCOLS("SwitchingProtocols"),
    
    OK("OK"),
    
    CREATED("Created"),
    
    ACCEPTED("Accepted"),
    
    NONAUTHORITATIVEINFORMATION("NonAuthoritativeInformation"),
    
    NOCONTENT("NoContent"),
    
    RESETCONTENT("ResetContent"),
    
    PARTIALCONTENT("PartialContent"),
    
    MULTIPLECHOICES("MultipleChoices"),
    
    AMBIGUOUS("Ambiguous"),
    
    MOVEDPERMANENTLY("MovedPermanently"),
    
    MOVED("Moved"),
    
    FOUND("Found"),
    
    REDIRECT("Redirect"),
    
    SEEOTHER("SeeOther"),
    
    REDIRECTMETHOD("RedirectMethod"),
    
    NOTMODIFIED("NotModified"),
    
    USEPROXY("UseProxy"),
    
    UNUSED("Unused"),
    
    TEMPORARYREDIRECT("TemporaryRedirect"),
    
    REDIRECTKEEPVERB("RedirectKeepVerb"),
    
    BADREQUEST("BadRequest"),
    
    UNAUTHORIZED("Unauthorized"),
    
    PAYMENTREQUIRED("PaymentRequired"),
    
    FORBIDDEN("Forbidden"),
    
    NOTFOUND("NotFound"),
    
    METHODNOTALLOWED("MethodNotAllowed"),
    
    NOTACCEPTABLE("NotAcceptable"),
    
    PROXYAUTHENTICATIONREQUIRED("ProxyAuthenticationRequired"),
    
    REQUESTTIMEOUT("RequestTimeout"),
    
    CONFLICT("Conflict"),
    
    GONE("Gone"),
    
    LENGTHREQUIRED("LengthRequired"),
    
    PRECONDITIONFAILED("PreconditionFailed"),
    
    REQUESTENTITYTOOLARGE("RequestEntityTooLarge"),
    
    REQUESTURITOOLONG("RequestUriTooLong"),
    
    UNSUPPORTEDMEDIATYPE("UnsupportedMediaType"),
    
    REQUESTEDRANGENOTSATISFIABLE("RequestedRangeNotSatisfiable"),
    
    EXPECTATIONFAILED("ExpectationFailed"),
    
    UPGRADEREQUIRED("UpgradeRequired"),
    
    INTERNALSERVERERROR("InternalServerError"),
    
    NOTIMPLEMENTED("NotImplemented"),
    
    BADGATEWAY("BadGateway"),
    
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    
    GATEWAYTIMEOUT("GatewayTimeout"),
    
    HTTPVERSIONNOTSUPPORTED("HttpVersionNotSupported");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Map<String, String> source = null;


   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetail() {
    return detail;
  }




   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getSource() {
    return source;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorSource errorSource = (ErrorSource) o;
    return Objects.equals(this.detail, errorSource.detail) &&
        Objects.equals(this.status, errorSource.status) &&
        Objects.equals(this.source, errorSource.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, status, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorSource {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

