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

import java.math.BigInteger;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.ergoplatform.explorer.client.model.Miner;
/**
 * Block for search results
 */
@Schema(description = "Block for search results")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class SearchBlock {
  @SerializedName("id")
  private String id = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("transactionsCount")
  private Integer transactionsCount = null;

  @SerializedName("miner")
  private Miner miner = null;

  @SerializedName("minerReward")
  private Long minerReward = null;

  @SerializedName("difficulty")
  private BigInteger difficulty = null;

  @SerializedName("size")
  private Integer size = null;

  public SearchBlock id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SearchBlock height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * minimum: 0
   * @return height
  **/
  @Schema(example = "667", required = true, description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public SearchBlock timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(required = true, description = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public SearchBlock transactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Get transactionsCount
   * minimum: 0
   * @return transactionsCount
  **/
  @Schema(example = "667", required = true, description = "")
  public Integer getTransactionsCount() {
    return transactionsCount;
  }

  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }

  public SearchBlock miner(Miner miner) {
    this.miner = miner;
    return this;
  }

   /**
   * Get miner
   * @return miner
  **/
  @Schema(required = true, description = "")
  public Miner getMiner() {
    return miner;
  }

  public void setMiner(Miner miner) {
    this.miner = miner;
  }

  public SearchBlock minerReward(Long minerReward) {
    this.minerReward = minerReward;
    return this;
  }

   /**
   * Miner Reward
   * minimum: 0
   * @return minerReward
  **/
  @Schema(example = "12045", required = true, description = "Miner Reward")
  public Long getMinerReward() {
    return minerReward;
  }

  public void setMinerReward(Long minerReward) {
    this.minerReward = minerReward;
  }

  public SearchBlock difficulty(BigInteger difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * minimum: 0
   * @return difficulty
  **/
  @Schema(example = "123", description = "")
  public BigInteger getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(BigInteger difficulty) {
    this.difficulty = difficulty;
  }

  public SearchBlock size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size of block in bytes
   * minimum: 0
   * @return size
  **/
  @Schema(example = "1030453", required = true, description = "Size of block in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBlock searchBlock = (SearchBlock) o;
    return Objects.equals(this.id, searchBlock.id) &&
        Objects.equals(this.height, searchBlock.height) &&
        Objects.equals(this.timestamp, searchBlock.timestamp) &&
        Objects.equals(this.transactionsCount, searchBlock.transactionsCount) &&
        Objects.equals(this.miner, searchBlock.miner) &&
        Objects.equals(this.minerReward, searchBlock.minerReward) &&
        Objects.equals(this.difficulty, searchBlock.difficulty) &&
        Objects.equals(this.size, searchBlock.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, height, timestamp, transactionsCount, miner, minerReward, difficulty, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBlock {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    minerReward: ").append(toIndentedString(minerReward)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
