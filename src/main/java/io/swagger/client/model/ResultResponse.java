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
import io.swagger.client.model.CheckSummaryOfTheSubmittedDocument;
import io.swagger.client.model.ClassificationOfTheSubmittedDocument;
import io.swagger.client.model.ControlGroup;
import io.swagger.client.model.DetailedInformationOfTheHolderOfTheSubmittedDocument;
import io.swagger.client.model.DetailedInformationOfTheSubmittedDocument;
import io.swagger.client.model.ExtractedImage;
import io.swagger.client.model.Mrz;
import java.util.ArrayList;
import java.util.List;


/**
 * ResultResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-16T10:49:19.639+01:00")
public class ResultResponse   {
  @SerializedName("uid")
  private String uid = null;

  @SerializedName("analysisRefUid")
  private String analysisRefUid = null;

  @SerializedName("checkReportSummary")
  private CheckSummaryOfTheSubmittedDocument checkReportSummary = null;

  @SerializedName("documentClassification")
  private ClassificationOfTheSubmittedDocument documentClassification = null;

  @SerializedName("documentDetail")
  private DetailedInformationOfTheSubmittedDocument documentDetail = null;

  @SerializedName("holderDetail")
  private DetailedInformationOfTheHolderOfTheSubmittedDocument holderDetail = null;

  @SerializedName("mrz")
  private Mrz mrz = null;

  @SerializedName("controls")
  private List<ControlGroup> controls = new ArrayList<ControlGroup>();

  @SerializedName("image")
  private List<ExtractedImage> image = new ArrayList<ExtractedImage>();

  public ResultResponse uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * uid
   * @return uid
  **/
  @ApiModelProperty(example = "null", required = true, value = "uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public ResultResponse analysisRefUid(String analysisRefUid) {
    this.analysisRefUid = analysisRefUid;
    return this;
  }

   /**
   * analysisRefUid
   * @return analysisRefUid
  **/
  @ApiModelProperty(example = "null", required = true, value = "analysisRefUid")
  public String getAnalysisRefUid() {
    return analysisRefUid;
  }

  public void setAnalysisRefUid(String analysisRefUid) {
    this.analysisRefUid = analysisRefUid;
  }

  public ResultResponse checkReportSummary(CheckSummaryOfTheSubmittedDocument checkReportSummary) {
    this.checkReportSummary = checkReportSummary;
    return this;
  }

   /**
   * Get checkReportSummary
   * @return checkReportSummary
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CheckSummaryOfTheSubmittedDocument getCheckReportSummary() {
    return checkReportSummary;
  }

  public void setCheckReportSummary(CheckSummaryOfTheSubmittedDocument checkReportSummary) {
    this.checkReportSummary = checkReportSummary;
  }

  public ResultResponse documentClassification(ClassificationOfTheSubmittedDocument documentClassification) {
    this.documentClassification = documentClassification;
    return this;
  }

   /**
   * Get documentClassification
   * @return documentClassification
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ClassificationOfTheSubmittedDocument getDocumentClassification() {
    return documentClassification;
  }

  public void setDocumentClassification(ClassificationOfTheSubmittedDocument documentClassification) {
    this.documentClassification = documentClassification;
  }

  public ResultResponse documentDetail(DetailedInformationOfTheSubmittedDocument documentDetail) {
    this.documentDetail = documentDetail;
    return this;
  }

   /**
   * Get documentDetail
   * @return documentDetail
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DetailedInformationOfTheSubmittedDocument getDocumentDetail() {
    return documentDetail;
  }

  public void setDocumentDetail(DetailedInformationOfTheSubmittedDocument documentDetail) {
    this.documentDetail = documentDetail;
  }

  public ResultResponse holderDetail(DetailedInformationOfTheHolderOfTheSubmittedDocument holderDetail) {
    this.holderDetail = holderDetail;
    return this;
  }

   /**
   * Get holderDetail
   * @return holderDetail
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DetailedInformationOfTheHolderOfTheSubmittedDocument getHolderDetail() {
    return holderDetail;
  }

  public void setHolderDetail(DetailedInformationOfTheHolderOfTheSubmittedDocument holderDetail) {
    this.holderDetail = holderDetail;
  }

  public ResultResponse mrz(Mrz mrz) {
    this.mrz = mrz;
    return this;
  }

   /**
   * Get mrz
   * @return mrz
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Mrz getMrz() {
    return mrz;
  }

  public void setMrz(Mrz mrz) {
    this.mrz = mrz;
  }

  public ResultResponse controls(List<ControlGroup> controls) {
    this.controls = controls;
    return this;
  }

  public ResultResponse addControlsItem(ControlGroup controlsItem) {
    this.controls.add(controlsItem);
    return this;
  }

   /**
   * Performed controls on the submitted document
   * @return controls
  **/
  @ApiModelProperty(example = "null", required = true, value = "Performed controls on the submitted document")
  public List<ControlGroup> getControls() {
    return controls;
  }

  public void setControls(List<ControlGroup> controls) {
    this.controls = controls;
  }

  public ResultResponse image(List<ExtractedImage> image) {
    this.image = image;
    return this;
  }

  public ResultResponse addImageItem(ExtractedImage imageItem) {
    this.image.add(imageItem);
    return this;
  }

   /**
   * Cropped image of the submitted document according request
   * @return image
  **/
  @ApiModelProperty(example = "null", value = "Cropped image of the submitted document according request")
  public List<ExtractedImage> getImage() {
    return image;
  }

  public void setImage(List<ExtractedImage> image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultResponse resultResponse = (ResultResponse) o;
    return Objects.equals(this.uid, resultResponse.uid) &&
        Objects.equals(this.analysisRefUid, resultResponse.analysisRefUid) &&
        Objects.equals(this.checkReportSummary, resultResponse.checkReportSummary) &&
        Objects.equals(this.documentClassification, resultResponse.documentClassification) &&
        Objects.equals(this.documentDetail, resultResponse.documentDetail) &&
        Objects.equals(this.holderDetail, resultResponse.holderDetail) &&
        Objects.equals(this.mrz, resultResponse.mrz) &&
        Objects.equals(this.controls, resultResponse.controls) &&
        Objects.equals(this.image, resultResponse.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, analysisRefUid, checkReportSummary, documentClassification, documentDetail, holderDetail, mrz, controls, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultResponse {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    analysisRefUid: ").append(toIndentedString(analysisRefUid)).append("\n");
    sb.append("    checkReportSummary: ").append(toIndentedString(checkReportSummary)).append("\n");
    sb.append("    documentClassification: ").append(toIndentedString(documentClassification)).append("\n");
    sb.append("    documentDetail: ").append(toIndentedString(documentDetail)).append("\n");
    sb.append("    holderDetail: ").append(toIndentedString(holderDetail)).append("\n");
    sb.append("    mrz: ").append(toIndentedString(mrz)).append("\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

