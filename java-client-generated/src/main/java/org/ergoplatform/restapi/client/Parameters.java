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
 * Parameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-19T14:53:04.559Z[GMT]")
public class Parameters {
  @SerializedName("height")
  private Integer height = null;

  @SerializedName("storageFeeFactor")
  private Integer storageFeeFactor = null;

  @SerializedName("minValuePerByte")
  private Integer minValuePerByte = null;

  @SerializedName("maxBlockSize")
  private Integer maxBlockSize = null;

  @SerializedName("maxBlockCost")
  private Integer maxBlockCost = null;

  @SerializedName("blockVersion")
  private Integer blockVersion = null;

  @SerializedName("tokenAccessCost")
  private Integer tokenAccessCost = null;

  @SerializedName("inputCost")
  private Integer inputCost = null;

  @SerializedName("dataInputCost")
  private Integer dataInputCost = null;

  @SerializedName("outputCost")
  private Integer outputCost = null;

  public Parameters height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height when current parameters were considered(not actual height). Can be &#x27;0&#x27; if state is empty
   * minimum: 0
   * @return height
  **/
  @Schema(example = "667", required = true, description = "Height when current parameters were considered(not actual height). Can be '0' if state is empty")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Parameters storageFeeFactor(Integer storageFeeFactor) {
    this.storageFeeFactor = storageFeeFactor;
    return this;
  }

   /**
   * Storage fee coefficient (per byte per storage period ~4 years)
   * minimum: 0
   * @return storageFeeFactor
  **/
  @Schema(example = "100000", required = true, description = "Storage fee coefficient (per byte per storage period ~4 years)")
  public Integer getStorageFeeFactor() {
    return storageFeeFactor;
  }

  public void setStorageFeeFactor(Integer storageFeeFactor) {
    this.storageFeeFactor = storageFeeFactor;
  }

  public Parameters minValuePerByte(Integer minValuePerByte) {
    this.minValuePerByte = minValuePerByte;
    return this;
  }

   /**
   * Minimum value per byte of an output
   * minimum: 0
   * @return minValuePerByte
  **/
  @Schema(example = "360", required = true, description = "Minimum value per byte of an output")
  public Integer getMinValuePerByte() {
    return minValuePerByte;
  }

  public void setMinValuePerByte(Integer minValuePerByte) {
    this.minValuePerByte = minValuePerByte;
  }

  public Parameters maxBlockSize(Integer maxBlockSize) {
    this.maxBlockSize = maxBlockSize;
    return this;
  }

   /**
   * Maximum block size (in bytes)
   * minimum: 0
   * @return maxBlockSize
  **/
  @Schema(example = "1048576", required = true, description = "Maximum block size (in bytes)")
  public Integer getMaxBlockSize() {
    return maxBlockSize;
  }

  public void setMaxBlockSize(Integer maxBlockSize) {
    this.maxBlockSize = maxBlockSize;
  }

  public Parameters maxBlockCost(Integer maxBlockCost) {
    this.maxBlockCost = maxBlockCost;
    return this;
  }

   /**
   * Maximum cumulative computational complexity of input scipts in block transactions
   * minimum: 0
   * @return maxBlockCost
  **/
  @Schema(example = "104876", required = true, description = "Maximum cumulative computational complexity of input scipts in block transactions")
  public Integer getMaxBlockCost() {
    return maxBlockCost;
  }

  public void setMaxBlockCost(Integer maxBlockCost) {
    this.maxBlockCost = maxBlockCost;
  }

  public Parameters blockVersion(Integer blockVersion) {
    this.blockVersion = blockVersion;
    return this;
  }

   /**
   * Get blockVersion
   * @return blockVersion
  **/
  @Schema(required = true, description = "")
  public Integer getBlockVersion() {
    return blockVersion;
  }

  public void setBlockVersion(Integer blockVersion) {
    this.blockVersion = blockVersion;
  }

  public Parameters tokenAccessCost(Integer tokenAccessCost) {
    this.tokenAccessCost = tokenAccessCost;
    return this;
  }

   /**
   * Validation cost of a single token
   * minimum: 0
   * @return tokenAccessCost
  **/
  @Schema(example = "100", required = true, description = "Validation cost of a single token")
  public Integer getTokenAccessCost() {
    return tokenAccessCost;
  }

  public void setTokenAccessCost(Integer tokenAccessCost) {
    this.tokenAccessCost = tokenAccessCost;
  }

  public Parameters inputCost(Integer inputCost) {
    this.inputCost = inputCost;
    return this;
  }

   /**
   * Validation cost per one transaction input
   * minimum: 0
   * @return inputCost
  **/
  @Schema(example = "100", required = true, description = "Validation cost per one transaction input")
  public Integer getInputCost() {
    return inputCost;
  }

  public void setInputCost(Integer inputCost) {
    this.inputCost = inputCost;
  }

  public Parameters dataInputCost(Integer dataInputCost) {
    this.dataInputCost = dataInputCost;
    return this;
  }

   /**
   * Validation cost per one data input
   * minimum: 0
   * @return dataInputCost
  **/
  @Schema(example = "100", required = true, description = "Validation cost per one data input")
  public Integer getDataInputCost() {
    return dataInputCost;
  }

  public void setDataInputCost(Integer dataInputCost) {
    this.dataInputCost = dataInputCost;
  }

  public Parameters outputCost(Integer outputCost) {
    this.outputCost = outputCost;
    return this;
  }

   /**
   * Validation cost per one transaction output
   * minimum: 0
   * @return outputCost
  **/
  @Schema(example = "100", required = true, description = "Validation cost per one transaction output")
  public Integer getOutputCost() {
    return outputCost;
  }

  public void setOutputCost(Integer outputCost) {
    this.outputCost = outputCost;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameters parameters = (Parameters) o;
    return Objects.equals(this.height, parameters.height) &&
        Objects.equals(this.storageFeeFactor, parameters.storageFeeFactor) &&
        Objects.equals(this.minValuePerByte, parameters.minValuePerByte) &&
        Objects.equals(this.maxBlockSize, parameters.maxBlockSize) &&
        Objects.equals(this.maxBlockCost, parameters.maxBlockCost) &&
        Objects.equals(this.blockVersion, parameters.blockVersion) &&
        Objects.equals(this.tokenAccessCost, parameters.tokenAccessCost) &&
        Objects.equals(this.inputCost, parameters.inputCost) &&
        Objects.equals(this.dataInputCost, parameters.dataInputCost) &&
        Objects.equals(this.outputCost, parameters.outputCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, storageFeeFactor, minValuePerByte, maxBlockSize, maxBlockCost, blockVersion, tokenAccessCost, inputCost, dataInputCost, outputCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameters {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    storageFeeFactor: ").append(toIndentedString(storageFeeFactor)).append("\n");
    sb.append("    minValuePerByte: ").append(toIndentedString(minValuePerByte)).append("\n");
    sb.append("    maxBlockSize: ").append(toIndentedString(maxBlockSize)).append("\n");
    sb.append("    maxBlockCost: ").append(toIndentedString(maxBlockCost)).append("\n");
    sb.append("    blockVersion: ").append(toIndentedString(blockVersion)).append("\n");
    sb.append("    tokenAccessCost: ").append(toIndentedString(tokenAccessCost)).append("\n");
    sb.append("    inputCost: ").append(toIndentedString(inputCost)).append("\n");
    sb.append("    dataInputCost: ").append(toIndentedString(dataInputCost)).append("\n");
    sb.append("    outputCost: ").append(toIndentedString(outputCost)).append("\n");
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
