/**
 * IdCheck.IO API
 * Check identity documents
 *
 * OpenAPI spec version: 0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Mrz
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-16T10:49:19.639+01:00")
public class Mrz   {
  @SerializedName("line1")
  private String line1 = null;

  @SerializedName("line2")
  private String line2 = null;

  @SerializedName("line3")
  private String line3 = null;

  public Mrz line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * line 1 of MRZ
   * @return line1
  **/
  @ApiModelProperty(example = "null", required = true, value = "line 1 of MRZ")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public Mrz line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * line 2 of MRZ
   * @return line2
  **/
  @ApiModelProperty(example = "null", value = "line 2 of MRZ")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public Mrz line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * line 3 of MRZ
   * @return line3
  **/
  @ApiModelProperty(example = "null", value = "line 3 of MRZ")
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mrz mrz = (Mrz) o;
    return Objects.equals(this.line1, mrz.line1) &&
        Objects.equals(this.line2, mrz.line2) &&
        Objects.equals(this.line3, mrz.line3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mrz {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

