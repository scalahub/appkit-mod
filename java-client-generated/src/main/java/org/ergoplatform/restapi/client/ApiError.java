/*
 * Ergo Node API
 * API docs for Ergo Node. Models are shared between all Ergo products
 *
 * OpenAPI spec version: 0.1
 * Contact: ergoplatform@protonmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.restapi.client;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ApiError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-19T14:53:04.559Z[GMT]")
public class ApiError {
  @SerializedName("error")
  private Integer error = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("detail")
  private String detail = null;

  public ApiError error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * Error code
   * @return error
  **/
  @Schema(example = "500", required = true, description = "Error code")
  public Integer getError() {
    return error;
  }

  public void setError(Integer error) {
    this.error = error;
  }

  public ApiError reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * String error code
   * @return reason
  **/
  @Schema(example = "Internal server error", required = true, description = "String error code")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ApiError detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Detailed error description
   * @return detail
  **/
  @Schema(required = true, description = "Detailed error description")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.error, apiError.error) &&
        Objects.equals(this.reason, apiError.reason) &&
        Objects.equals(this.detail, apiError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, reason, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
