package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveOutputModelPreferencesInstanceReport
 */
public class BQPreferencesRetrieveOutputModelPreferencesInstanceReport   {
  private Object preferencesInstanceReportRecord = null;

  private String preferencesInstanceReportType = null;

  private String preferencesInstanceReportParameters = null;

  private Object preferencesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return preferencesInstanceReportRecord
  **/

  public Object getPreferencesInstanceReportRecord() {
    return preferencesInstanceReportRecord;
  }

  public void setPreferencesInstanceReportRecord(Object preferencesInstanceReportRecord) {
    this.preferencesInstanceReportRecord = preferencesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return preferencesInstanceReportType
  **/

  public String getPreferencesInstanceReportType() {
    return preferencesInstanceReportType;
  }

  public void setPreferencesInstanceReportType(String preferencesInstanceReportType) {
    this.preferencesInstanceReportType = preferencesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return preferencesInstanceReportParameters
  **/

  public String getPreferencesInstanceReportParameters() {
    return preferencesInstanceReportParameters;
  }

  public void setPreferencesInstanceReportParameters(String preferencesInstanceReportParameters) {
    this.preferencesInstanceReportParameters = preferencesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return preferencesInstanceReport
  **/

  public Object getPreferencesInstanceReport() {
    return preferencesInstanceReport;
  }

  public void setPreferencesInstanceReport(Object preferencesInstanceReport) {
    this.preferencesInstanceReport = preferencesInstanceReport;
  }


}

