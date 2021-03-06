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
import org.ergoplatform.explorer.client.model.TransactionSummaryBlock;
/**
 * TransactionSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class TransactionSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("confirmationsCount")
  private Integer confirmationsCount = null;

  @SerializedName("block")
  private TransactionSummaryBlock block = null;

  public TransactionSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionSummary timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(required = true, description = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public TransactionSummary size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size of transcaction in bytes
   * @return size
  **/
  @Schema(example = "43904312", required = true, description = "Size of transcaction in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public TransactionSummary confirmationsCount(Integer confirmationsCount) {
    this.confirmationsCount = confirmationsCount;
    return this;
  }

   /**
   * Number of confimations in transaction
   * @return confirmationsCount
  **/
  @Schema(example = "142", description = "Number of confimations in transaction")
  public Integer getConfirmationsCount() {
    return confirmationsCount;
  }

  public void setConfirmationsCount(Integer confirmationsCount) {
    this.confirmationsCount = confirmationsCount;
  }

  public TransactionSummary block(TransactionSummaryBlock block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @Schema(required = true, description = "")
  public TransactionSummaryBlock getBlock() {
    return block;
  }

  public void setBlock(TransactionSummaryBlock block) {
    this.block = block;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSummary transactionSummary = (TransactionSummary) o;
    return Objects.equals(this.id, transactionSummary.id) &&
        Objects.equals(this.timestamp, transactionSummary.timestamp) &&
        Objects.equals(this.size, transactionSummary.size) &&
        Objects.equals(this.confirmationsCount, transactionSummary.confirmationsCount) &&
        Objects.equals(this.block, transactionSummary.block);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, size, confirmationsCount, block);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    confirmationsCount: ").append(toIndentedString(confirmationsCount)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
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
