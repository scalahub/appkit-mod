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
import org.ergoplatform.explorer.client.model.IOSummary;
import org.ergoplatform.explorer.client.model.TransactionInput;
import org.ergoplatform.explorer.client.model.TransactionOutput;
import org.ergoplatform.explorer.client.model.TransactionSummary;
/**
 * FullTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-09T08:14:50.203Z[GMT]")
public class FullTransaction {
  @SerializedName("summary")
  private TransactionSummary summary = null;

  @SerializedName("ioSummary")
  private IOSummary ioSummary = null;

  @SerializedName("inputs")
  private List<TransactionInput> inputs = new ArrayList<>();

  @SerializedName("outputs")
  private List<TransactionOutput> outputs = new ArrayList<>();

  public FullTransaction summary(TransactionSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @Schema(required = true, description = "")
  public TransactionSummary getSummary() {
    return summary;
  }

  public void setSummary(TransactionSummary summary) {
    this.summary = summary;
  }

  public FullTransaction ioSummary(IOSummary ioSummary) {
    this.ioSummary = ioSummary;
    return this;
  }

   /**
   * Get ioSummary
   * @return ioSummary
  **/
  @Schema(required = true, description = "")
  public IOSummary getIoSummary() {
    return ioSummary;
  }

  public void setIoSummary(IOSummary ioSummary) {
    this.ioSummary = ioSummary;
  }

  public FullTransaction inputs(List<TransactionInput> inputs) {
    this.inputs = inputs;
    return this;
  }

  public FullTransaction addInputsItem(TransactionInput inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Many transaction inputs
   * @return inputs
  **/
  @Schema(required = true, description = "Many transaction inputs")
  public List<TransactionInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<TransactionInput> inputs) {
    this.inputs = inputs;
  }

  public FullTransaction outputs(List<TransactionOutput> outputs) {
    this.outputs = outputs;
    return this;
  }

  public FullTransaction addOutputsItem(TransactionOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Many transaction outputs
   * @return outputs
  **/
  @Schema(required = true, description = "Many transaction outputs")
  public List<TransactionOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<TransactionOutput> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullTransaction fullTransaction = (FullTransaction) o;
    return Objects.equals(this.summary, fullTransaction.summary) &&
        Objects.equals(this.ioSummary, fullTransaction.ioSummary) &&
        Objects.equals(this.inputs, fullTransaction.inputs) &&
        Objects.equals(this.outputs, fullTransaction.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, ioSummary, inputs, outputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullTransaction {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    ioSummary: ").append(toIndentedString(ioSummary)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
