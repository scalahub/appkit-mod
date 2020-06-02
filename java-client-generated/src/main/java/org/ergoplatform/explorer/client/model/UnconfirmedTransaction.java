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
import java.util.ArrayList;
import java.util.List;
import org.ergoplatform.explorer.client.model.UnconfirmedTransactionInput;
import org.ergoplatform.explorer.client.model.UnconfirmedTransactionOutput;
/**
 * UnconfirmedTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class UnconfirmedTransaction {
  @SerializedName("id")
  private String id = null;

  @SerializedName("inputs")
  private List<UnconfirmedTransactionInput> inputs = new ArrayList<>();

  @SerializedName("outputs")
  private List<UnconfirmedTransactionOutput> outputs = new ArrayList<>();

  @SerializedName("size")
  private Integer size = null;

  public UnconfirmedTransaction id(String id) {
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

  public UnconfirmedTransaction inputs(List<UnconfirmedTransactionInput> inputs) {
    this.inputs = inputs;
    return this;
  }

  public UnconfirmedTransaction addInputsItem(UnconfirmedTransactionInput inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Transaction inputs
   * @return inputs
  **/
  @Schema(required = true, description = "Transaction inputs")
  public List<UnconfirmedTransactionInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<UnconfirmedTransactionInput> inputs) {
    this.inputs = inputs;
  }

  public UnconfirmedTransaction outputs(List<UnconfirmedTransactionOutput> outputs) {
    this.outputs = outputs;
    return this;
  }

  public UnconfirmedTransaction addOutputsItem(UnconfirmedTransactionOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Transaction outputs
   * @return outputs
  **/
  @Schema(required = true, description = "Transaction outputs")
  public List<UnconfirmedTransactionOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<UnconfirmedTransactionOutput> outputs) {
    this.outputs = outputs;
  }

  public UnconfirmedTransaction size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Transaction size in bytes
   * @return size
  **/
  @Schema(example = "512", description = "Transaction size in bytes")
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
    UnconfirmedTransaction unconfirmedTransaction = (UnconfirmedTransaction) o;
    return Objects.equals(this.id, unconfirmedTransaction.id) &&
        Objects.equals(this.inputs, unconfirmedTransaction.inputs) &&
        Objects.equals(this.outputs, unconfirmedTransaction.outputs) &&
        Objects.equals(this.size, unconfirmedTransaction.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inputs, outputs, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnconfirmedTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
