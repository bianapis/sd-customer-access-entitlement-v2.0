package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsRetrieveOutputModelRestrictionsInstanceAnalysis
 */
public class BQRestrictionsRetrieveOutputModelRestrictionsInstanceAnalysis   {
  private Object restrictionsInstanceAnalysisRecord = null;

  private String restrictionsInstanceAnalysisReportType = null;

  private String restrictionsInstanceAnalysisParameters = null;

  private Object restrictionsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return restrictionsInstanceAnalysisRecord
  **/

  public Object getRestrictionsInstanceAnalysisRecord() {
    return restrictionsInstanceAnalysisRecord;
  }

  public void setRestrictionsInstanceAnalysisRecord(Object restrictionsInstanceAnalysisRecord) {
    this.restrictionsInstanceAnalysisRecord = restrictionsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return restrictionsInstanceAnalysisReportType
  **/

  public String getRestrictionsInstanceAnalysisReportType() {
    return restrictionsInstanceAnalysisReportType;
  }

  public void setRestrictionsInstanceAnalysisReportType(String restrictionsInstanceAnalysisReportType) {
    this.restrictionsInstanceAnalysisReportType = restrictionsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return restrictionsInstanceAnalysisParameters
  **/

  public String getRestrictionsInstanceAnalysisParameters() {
    return restrictionsInstanceAnalysisParameters;
  }

  public void setRestrictionsInstanceAnalysisParameters(String restrictionsInstanceAnalysisParameters) {
    this.restrictionsInstanceAnalysisParameters = restrictionsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return restrictionsInstanceAnalysisReport
  **/

  public Object getRestrictionsInstanceAnalysisReport() {
    return restrictionsInstanceAnalysisReport;
  }

  public void setRestrictionsInstanceAnalysisReport(Object restrictionsInstanceAnalysisReport) {
    this.restrictionsInstanceAnalysisReport = restrictionsInstanceAnalysisReport;
  }


}

