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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * SpendingProof
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class SpendingProof {
  @SerializedName("proofBytes")
  private String proofBytes = null;

  @SerializedName("extension")
  private Map<String, String> extension = new HashMap<>();

  public SpendingProof proofBytes(String proofBytes) {
    this.proofBytes = proofBytes;
    return this;
  }

   /**
   * Base16-encoded proof bytes
   * @return proofBytes
  **/
  @Schema(example = "2ddaaa576ccff6420b7e0557e3970e6c93fd5004189f11a50f8bb60f7f8d740c3925575e97a183728dde", required = true, description = "Base16-encoded proof bytes")
  public String getProofBytes() {
    return proofBytes;
  }

  public void setProofBytes(String proofBytes) {
    this.proofBytes = proofBytes;
  }

  public SpendingProof extension(Map<String, String> extension) {
    this.extension = extension;
    return this;
  }

  public SpendingProof putExtensionItem(String key, String extensionItem) {
    this.extension.put(key, extensionItem);
    return this;
  }

   /**
   * Variables to be put into context
   * @return extension
  **/
  @Schema(example = "{\"1\":\"0101\"}", required = true, description = "Variables to be put into context")
  public Map<String, String> getExtension() {
    return extension;
  }

  public void setExtension(Map<String, String> extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingProof spendingProof = (SpendingProof) o;
    return Objects.equals(this.proofBytes, spendingProof.proofBytes) &&
        Objects.equals(this.extension, spendingProof.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proofBytes, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingProof {\n");
    
    sb.append("    proofBytes: ").append(toIndentedString(proofBytes)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
