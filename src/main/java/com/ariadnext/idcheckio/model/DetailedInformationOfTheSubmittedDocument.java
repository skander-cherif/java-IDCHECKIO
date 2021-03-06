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


package com.ariadnext.idcheckio.model;

import java.util.Objects;
import com.ariadnext.idcheckio.model.EventDate;
import com.ariadnext.idcheckio.model.GenericData;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * DetailedInformationOfTheSubmittedDocument
 */

public class DetailedInformationOfTheSubmittedDocument   {
  @SerializedName("emitCountry")
  private String emitCountry = null;

  @SerializedName("emitDate")
  private EventDate emitDate = null;

  @SerializedName("expirationDate")
  private EventDate expirationDate = null;

  @SerializedName("documentNumber")
  private String documentNumber = null;

  @SerializedName("extraInfos")
  private List<GenericData> extraInfos = new ArrayList<GenericData>();

  public DetailedInformationOfTheSubmittedDocument emitCountry(String emitCountry) {
    this.emitCountry = emitCountry;
    return this;
  }

   /**
   * emit country
   * @return emitCountry
  **/
  @ApiModelProperty(example = "null", value = "emit country")
  public String getEmitCountry() {
    return emitCountry;
  }

  public void setEmitCountry(String emitCountry) {
    this.emitCountry = emitCountry;
  }

  public DetailedInformationOfTheSubmittedDocument emitDate(EventDate emitDate) {
    this.emitDate = emitDate;
    return this;
  }

   /**
   * Get emitDate
   * @return emitDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public EventDate getEmitDate() {
    return emitDate;
  }

  public void setEmitDate(EventDate emitDate) {
    this.emitDate = emitDate;
  }

  public DetailedInformationOfTheSubmittedDocument expirationDate(EventDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public EventDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(EventDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public DetailedInformationOfTheSubmittedDocument documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * document number
   * @return documentNumber
  **/
  @ApiModelProperty(example = "null", value = "document number")
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public DetailedInformationOfTheSubmittedDocument extraInfos(List<GenericData> extraInfos) {
    this.extraInfos = extraInfos;
    return this;
  }

  public DetailedInformationOfTheSubmittedDocument addExtraInfosItem(GenericData extraInfosItem) {
    this.extraInfos.add(extraInfosItem);
    return this;
  }

   /**
   * additional informations
   * @return extraInfos
  **/
  @ApiModelProperty(example = "null", value = "additional informations")
  public List<GenericData> getExtraInfos() {
    return extraInfos;
  }

  public void setExtraInfos(List<GenericData> extraInfos) {
    this.extraInfos = extraInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedInformationOfTheSubmittedDocument detailedInformationOfTheSubmittedDocument = (DetailedInformationOfTheSubmittedDocument) o;
    return Objects.equals(this.emitCountry, detailedInformationOfTheSubmittedDocument.emitCountry) &&
        Objects.equals(this.emitDate, detailedInformationOfTheSubmittedDocument.emitDate) &&
        Objects.equals(this.expirationDate, detailedInformationOfTheSubmittedDocument.expirationDate) &&
        Objects.equals(this.documentNumber, detailedInformationOfTheSubmittedDocument.documentNumber) &&
        Objects.equals(this.extraInfos, detailedInformationOfTheSubmittedDocument.extraInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emitCountry, emitDate, expirationDate, documentNumber, extraInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedInformationOfTheSubmittedDocument {\n");
    
    sb.append("    emitCountry: ").append(toIndentedString(emitCountry)).append("\n");
    sb.append("    emitDate: ").append(toIndentedString(emitDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    extraInfos: ").append(toIndentedString(extraInfos)).append("\n");
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

