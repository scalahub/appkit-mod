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

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * An object containing all components of pow solution
 */
@Schema(description = "An object containing all components of pow solution")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-19T14:53:04.559Z[GMT]")
public class PowSolutions {
  @SerializedName("pk")
  private String pk = null;

  @SerializedName("w")
  private String w = null;

  @SerializedName("n")
  private String n = null;

  @SerializedName("d")
  private BigDecimal d = null;

  public PowSolutions pk(String pk) {
    this.pk = pk;
    return this;
  }

   /**
   * Base16-encoded public key
   * @return pk
  **/
  @Schema(example = "0350e25cee8562697d55275c96bb01b34228f9bd68fd9933f2a25ff195526864f5", required = true, description = "Base16-encoded public key")
  public String getPk() {
    return pk;
  }

  public void setPk(String pk) {
    this.pk = pk;
  }

  public PowSolutions w(String w) {
    this.w = w;
    return this;
  }

   /**
   * Get w
   * @return w
  **/
  @Schema(example = "0366ea253123dfdb8d6d9ca2cb9ea98629e8f34015b1e4ba942b1d88badfcc6a12", required = true, description = "")
  public String getW() {
    return w;
  }

  public void setW(String w) {
    this.w = w;
  }

  public PowSolutions n(String n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @Schema(example = "0000000000000000", required = true, description = "")
  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public PowSolutions d(BigDecimal d) {
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @Schema(example = "987654321", required = true, description = "")
  public BigDecimal getD() {
    return d;
  }

  public void setD(BigDecimal d) {
    this.d = d;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowSolutions powSolutions = (PowSolutions) o;
    return Objects.equals(this.pk, powSolutions.pk) &&
        Objects.equals(this.w, powSolutions.w) &&
        Objects.equals(this.n, powSolutions.n) &&
        Objects.equals(this.d, powSolutions.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, w, n, d);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowSolutions {\n");
    
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    w: ").append(toIndentedString(w)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
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