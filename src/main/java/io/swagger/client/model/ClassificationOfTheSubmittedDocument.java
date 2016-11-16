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
 * ClassificationOfTheSubmittedDocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-16T10:49:19.639+01:00")
public class ClassificationOfTheSubmittedDocument   {
  /**
   * identity document type
   */
  public enum IdTypeEnum {
    @SerializedName("ID")
    ID("ID"),
    
    @SerializedName("P")
    P("P"),
    
    @SerializedName("RP")
    RP("RP"),
    
    @SerializedName("V")
    V("V"),
    
    @SerializedName("DL")
    DL("DL"),
    
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN");

    private String value;

    IdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("idType")
  private IdTypeEnum idType = null;

  public ClassificationOfTheSubmittedDocument idType(IdTypeEnum idType) {
    this.idType = idType;
    return this;
  }

   /**
   * identity document type
   * @return idType
  **/
  @ApiModelProperty(example = "null", value = "identity document type")
  public IdTypeEnum getIdType() {
    return idType;
  }

  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationOfTheSubmittedDocument classificationOfTheSubmittedDocument = (ClassificationOfTheSubmittedDocument) o;
    return Objects.equals(this.idType, classificationOfTheSubmittedDocument.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationOfTheSubmittedDocument {\n");
    
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

