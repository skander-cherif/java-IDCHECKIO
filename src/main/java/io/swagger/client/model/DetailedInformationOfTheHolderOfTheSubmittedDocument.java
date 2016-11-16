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
import io.swagger.client.model.EventDate;
import io.swagger.client.model.GenericData;
import java.util.ArrayList;
import java.util.List;


/**
 * DetailedInformationOfTheHolderOfTheSubmittedDocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-16T10:49:19.639+01:00")
public class DetailedInformationOfTheHolderOfTheSubmittedDocument   {
  @SerializedName("lastName")
  private List<String> lastName = new ArrayList<String>();

  @SerializedName("firstName")
  private List<String> firstName = new ArrayList<String>();

  @SerializedName("usageName")
  private String usageName = null;

  @SerializedName("nationality")
  private String nationality = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("birthDate")
  private EventDate birthDate = null;

  @SerializedName("birthPlace")
  private String birthPlace = null;

  @SerializedName("birthDpt")
  private String birthDpt = null;

  @SerializedName("extraInfos")
  private List<GenericData> extraInfos = new ArrayList<GenericData>();

  public DetailedInformationOfTheHolderOfTheSubmittedDocument lastName(List<String> lastName) {
    this.lastName = lastName;
    return this;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument addLastNameItem(String lastNameItem) {
    this.lastName.add(lastNameItem);
    return this;
  }

   /**
   * list of lastnames
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "list of lastnames")
  public List<String> getLastName() {
    return lastName;
  }

  public void setLastName(List<String> lastName) {
    this.lastName = lastName;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument firstName(List<String> firstName) {
    this.firstName = firstName;
    return this;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument addFirstNameItem(String firstNameItem) {
    this.firstName.add(firstNameItem);
    return this;
  }

   /**
   * list of firstnames
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "list of firstnames")
  public List<String> getFirstName() {
    return firstName;
  }

  public void setFirstName(List<String> firstName) {
    this.firstName = firstName;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument usageName(String usageName) {
    this.usageName = usageName;
    return this;
  }

   /**
   * usage name
   * @return usageName
  **/
  @ApiModelProperty(example = "null", value = "usage name")
  public String getUsageName() {
    return usageName;
  }

  public void setUsageName(String usageName) {
    this.usageName = usageName;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * nationality
   * @return nationality
  **/
  @ApiModelProperty(example = "null", value = "nationality")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument address(String address) {
    this.address = address;
    return this;
  }

   /**
   * address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument birthDate(EventDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public EventDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(EventDate birthDate) {
    this.birthDate = birthDate;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

   /**
   * birth place
   * @return birthPlace
  **/
  @ApiModelProperty(example = "null", value = "birth place")
  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument birthDpt(String birthDpt) {
    this.birthDpt = birthDpt;
    return this;
  }

   /**
   * birth department
   * @return birthDpt
  **/
  @ApiModelProperty(example = "null", value = "birth department")
  public String getBirthDpt() {
    return birthDpt;
  }

  public void setBirthDpt(String birthDpt) {
    this.birthDpt = birthDpt;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument extraInfos(List<GenericData> extraInfos) {
    this.extraInfos = extraInfos;
    return this;
  }

  public DetailedInformationOfTheHolderOfTheSubmittedDocument addExtraInfosItem(GenericData extraInfosItem) {
    this.extraInfos.add(extraInfosItem);
    return this;
  }

   /**
   * additional information
   * @return extraInfos
  **/
  @ApiModelProperty(example = "null", value = "additional information")
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
    DetailedInformationOfTheHolderOfTheSubmittedDocument detailedInformationOfTheHolderOfTheSubmittedDocument = (DetailedInformationOfTheHolderOfTheSubmittedDocument) o;
    return Objects.equals(this.lastName, detailedInformationOfTheHolderOfTheSubmittedDocument.lastName) &&
        Objects.equals(this.firstName, detailedInformationOfTheHolderOfTheSubmittedDocument.firstName) &&
        Objects.equals(this.usageName, detailedInformationOfTheHolderOfTheSubmittedDocument.usageName) &&
        Objects.equals(this.nationality, detailedInformationOfTheHolderOfTheSubmittedDocument.nationality) &&
        Objects.equals(this.gender, detailedInformationOfTheHolderOfTheSubmittedDocument.gender) &&
        Objects.equals(this.address, detailedInformationOfTheHolderOfTheSubmittedDocument.address) &&
        Objects.equals(this.birthDate, detailedInformationOfTheHolderOfTheSubmittedDocument.birthDate) &&
        Objects.equals(this.birthPlace, detailedInformationOfTheHolderOfTheSubmittedDocument.birthPlace) &&
        Objects.equals(this.birthDpt, detailedInformationOfTheHolderOfTheSubmittedDocument.birthDpt) &&
        Objects.equals(this.extraInfos, detailedInformationOfTheHolderOfTheSubmittedDocument.extraInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, usageName, nationality, gender, address, birthDate, birthPlace, birthDpt, extraInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedInformationOfTheHolderOfTheSubmittedDocument {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    usageName: ").append(toIndentedString(usageName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    birthDpt: ").append(toIndentedString(birthDpt)).append("\n");
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

