package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveOutputModelPreferencesInstanceAnalysis
 */
public class BQPreferencesRetrieveOutputModelPreferencesInstanceAnalysis   {
  private Object preferencesInstanceAnalysisRecord = null;

  private String preferencesInstanceAnalysisReportType = null;

  private String preferencesInstanceAnalysisParameters = null;

  private Object preferencesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return preferencesInstanceAnalysisRecord
  **/

  public Object getPreferencesInstanceAnalysisRecord() {
    return preferencesInstanceAnalysisRecord;
  }

  public void setPreferencesInstanceAnalysisRecord(Object preferencesInstanceAnalysisRecord) {
    this.preferencesInstanceAnalysisRecord = preferencesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return preferencesInstanceAnalysisReportType
  **/

  public String getPreferencesInstanceAnalysisReportType() {
    return preferencesInstanceAnalysisReportType;
  }

  public void setPreferencesInstanceAnalysisReportType(String preferencesInstanceAnalysisReportType) {
    this.preferencesInstanceAnalysisReportType = preferencesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return preferencesInstanceAnalysisParameters
  **/

  public String getPreferencesInstanceAnalysisParameters() {
    return preferencesInstanceAnalysisParameters;
  }

  public void setPreferencesInstanceAnalysisParameters(String preferencesInstanceAnalysisParameters) {
    this.preferencesInstanceAnalysisParameters = preferencesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return preferencesInstanceAnalysisReport
  **/

  public Object getPreferencesInstanceAnalysisReport() {
    return preferencesInstanceAnalysisReport;
  }

  public void setPreferencesInstanceAnalysisReport(Object preferencesInstanceAnalysisReport) {
    this.preferencesInstanceAnalysisReport = preferencesInstanceAnalysisReport;
  }


}

