/*
 * Ergo blockchain explorer
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.explorer.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TransactionSummaryBlock
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class TransactionSummaryBlock {
  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("headerId")
  private String headerId = null;

  @SerializedName("height")
  private Integer height = null;

  public TransactionSummaryBlock timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public TransactionSummaryBlock headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * Get headerId
   * @return headerId
  **/
  @Schema(description = "")
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }

  public TransactionSummaryBlock height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Block height
   * minimum: 0
   * @return height
  **/
  @Schema(example = "667", description = "Block height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSummaryBlock transactionSummaryBlock = (TransactionSummaryBlock) o;
    return Objects.equals(this.timestamp, transactionSummaryBlock.timestamp) &&
        Objects.equals(this.headerId, transactionSummaryBlock.headerId) &&
        Objects.equals(this.height, transactionSummaryBlock.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, headerId, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSummaryBlock {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
