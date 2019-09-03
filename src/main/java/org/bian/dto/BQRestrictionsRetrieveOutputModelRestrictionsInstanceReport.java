package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsRetrieveOutputModelRestrictionsInstanceReport
 */
public class BQRestrictionsRetrieveOutputModelRestrictionsInstanceReport   {
  private Object restrictionsInstanceReportRecord = null;

  private String restrictionsInstanceReportType = null;

  private String restrictionsInstanceReportParameters = null;

  private Object restrictionsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return restrictionsInstanceReportRecord
  **/

  public Object getRestrictionsInstanceReportRecord() {
    return restrictionsInstanceReportRecord;
  }

  public void setRestrictionsInstanceReportRecord(Object restrictionsInstanceReportRecord) {
    this.restrictionsInstanceReportRecord = restrictionsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return restrictionsInstanceReportType
  **/

  public String getRestrictionsInstanceReportType() {
    return restrictionsInstanceReportType;
  }

  public void setRestrictionsInstanceReportType(String restrictionsInstanceReportType) {
    this.restrictionsInstanceReportType = restrictionsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return restrictionsInstanceReportParameters
  **/

  public String getRestrictionsInstanceReportParameters() {
    return restrictionsInstanceReportParameters;
  }

  public void setRestrictionsInstanceReportParameters(String restrictionsInstanceReportParameters) {
    this.restrictionsInstanceReportParameters = restrictionsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return restrictionsInstanceReport
  **/

  public Object getRestrictionsInstanceReport() {
    return restrictionsInstanceReport;
  }

  public void setRestrictionsInstanceReport(Object restrictionsInstanceReport) {
    this.restrictionsInstanceReport = restrictionsInstanceReport;
  }


}

