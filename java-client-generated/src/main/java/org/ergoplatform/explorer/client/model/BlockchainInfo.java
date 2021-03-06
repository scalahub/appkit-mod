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
 * BlockchainInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class BlockchainInfo {
  @SerializedName("version")
  private String version = null;

  @SerializedName("supply")
  private Integer supply = null;

  @SerializedName("transactionAverage")
  private Integer transactionAverage = null;

  @SerializedName("hashRate")
  private Integer hashRate = null;

  public BlockchainInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Software version
   * @return version
  **/
  @Schema(example = "1.0.0", required = true, description = "Software version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BlockchainInfo supply(Integer supply) {
    this.supply = supply;
    return this;
  }

   /**
   * Circulating supply
   * @return supply
  **/
  @Schema(example = "1000003", required = true, description = "Circulating supply")
  public Integer getSupply() {
    return supply;
  }

  public void setSupply(Integer supply) {
    this.supply = supply;
  }

  public BlockchainInfo transactionAverage(Integer transactionAverage) {
    this.transactionAverage = transactionAverage;
    return this;
  }

   /**
   * Average number of transactions in block
   * @return transactionAverage
  **/
  @Schema(example = "100302", required = true, description = "Average number of transactions in block")
  public Integer getTransactionAverage() {
    return transactionAverage;
  }

  public void setTransactionAverage(Integer transactionAverage) {
    this.transactionAverage = transactionAverage;
  }

  public BlockchainInfo hashRate(Integer hashRate) {
    this.hashRate = hashRate;
    return this;
  }

   /**
   * Hashrate
   * @return hashRate
  **/
  @Schema(example = "415434144", required = true, description = "Hashrate")
  public Integer getHashRate() {
    return hashRate;
  }

  public void setHashRate(Integer hashRate) {
    this.hashRate = hashRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainInfo blockchainInfo = (BlockchainInfo) o;
    return Objects.equals(this.version, blockchainInfo.version) &&
        Objects.equals(this.supply, blockchainInfo.supply) &&
        Objects.equals(this.transactionAverage, blockchainInfo.transactionAverage) &&
        Objects.equals(this.hashRate, blockchainInfo.hashRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, supply, transactionAverage, hashRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
    sb.append("    transactionAverage: ").append(toIndentedString(transactionAverage)).append("\n");
    sb.append("    hashRate: ").append(toIndentedString(hashRate)).append("\n");
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
