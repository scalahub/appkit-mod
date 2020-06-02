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
import java.math.BigDecimal;
/**
 * BlockchainStatsTransactionSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class BlockchainStatsTransactionSummary {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("totalFee")
  private BigDecimal totalFee = null;

  @SerializedName("totalOutput")
  private Integer totalOutput = null;

  @SerializedName("estimatedTransactionVolume")
  private BigDecimal estimatedTransactionVolume = null;

  public BlockchainStatsTransactionSummary total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Number of transactions
   * @return total
  **/
  @Schema(description = "Number of transactions")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public BlockchainStatsTransactionSummary totalFee(BigDecimal totalFee) {
    this.totalFee = totalFee;
    return this;
  }

   /**
   * Total Transaction Fees
   * @return totalFee
  **/
  @Schema(example = "4334312000000", description = "Total Transaction Fees")
  public BigDecimal getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(BigDecimal totalFee) {
    this.totalFee = totalFee;
  }

  public BlockchainStatsTransactionSummary totalOutput(Integer totalOutput) {
    this.totalOutput = totalOutput;
    return this;
  }

   /**
   * Total Output Volume
   * @return totalOutput
  **/
  @Schema(example = "430123324234", description = "Total Output Volume")
  public Integer getTotalOutput() {
    return totalOutput;
  }

  public void setTotalOutput(Integer totalOutput) {
    this.totalOutput = totalOutput;
  }

  public BlockchainStatsTransactionSummary estimatedTransactionVolume(BigDecimal estimatedTransactionVolume) {
    this.estimatedTransactionVolume = estimatedTransactionVolume;
    return this;
  }

   /**
   * Estimated Transaction Volume
   * @return estimatedTransactionVolume
  **/
  @Schema(example = "4301223423", description = "Estimated Transaction Volume")
  public BigDecimal getEstimatedTransactionVolume() {
    return estimatedTransactionVolume;
  }

  public void setEstimatedTransactionVolume(BigDecimal estimatedTransactionVolume) {
    this.estimatedTransactionVolume = estimatedTransactionVolume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainStatsTransactionSummary blockchainStatsTransactionSummary = (BlockchainStatsTransactionSummary) o;
    return Objects.equals(this.total, blockchainStatsTransactionSummary.total) &&
        Objects.equals(this.totalFee, blockchainStatsTransactionSummary.totalFee) &&
        Objects.equals(this.totalOutput, blockchainStatsTransactionSummary.totalOutput) &&
        Objects.equals(this.estimatedTransactionVolume, blockchainStatsTransactionSummary.estimatedTransactionVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, totalFee, totalOutput, estimatedTransactionVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainStatsTransactionSummary {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    totalOutput: ").append(toIndentedString(totalOutput)).append("\n");
    sb.append("    estimatedTransactionVolume: ").append(toIndentedString(estimatedTransactionVolume)).append("\n");
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
