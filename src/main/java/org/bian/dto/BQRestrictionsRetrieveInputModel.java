package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsRetrieveInputModelRestrictionsInstanceAnalysis;
import org.bian.dto.BQRestrictionsRetrieveInputModelRestrictionsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRestrictionsRetrieveInputModel
 */
public class BQRestrictionsRetrieveInputModel   {
  private Object restrictionsRetrieveActionTaskRecord = null;

  private String restrictionsRetrieveActionRequest = null;

  private BQRestrictionsRetrieveInputModelRestrictionsInstanceReport restrictionsInstanceReport = null;

  private BQRestrictionsRetrieveInputModelRestrictionsInstanceAnalysis restrictionsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return restrictionsRetrieveActionTaskRecord
  **/

  public Object getRestrictionsRetrieveActionTaskRecord() {
    return restrictionsRetrieveActionTaskRecord;
  }

  public void setRestrictionsRetrieveActionTaskRecord(Object restrictionsRetrieveActionTaskRecord) {
    this.restrictionsRetrieveActionTaskRecord = restrictionsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return restrictionsRetrieveActionRequest
  **/

  public String getRestrictionsRetrieveActionRequest() {
    return restrictionsRetrieveActionRequest;
  }

  public void setRestrictionsRetrieveActionRequest(String restrictionsRetrieveActionRequest) {
    this.restrictionsRetrieveActionRequest = restrictionsRetrieveActionRequest;
  }


  /**
   * Get restrictionsInstanceReport
   * @return restrictionsInstanceReport
  **/

  public BQRestrictionsRetrieveInputModelRestrictionsInstanceReport getRestrictionsInstanceReport() {
    return restrictionsInstanceReport;
  }

  public void setRestrictionsInstanceReport(BQRestrictionsRetrieveInputModelRestrictionsInstanceReport restrictionsInstanceReport) {
    this.restrictionsInstanceReport = restrictionsInstanceReport;
  }


  /**
   * Get restrictionsInstanceAnalysis
   * @return restrictionsInstanceAnalysis
  **/

  public BQRestrictionsRetrieveInputModelRestrictionsInstanceAnalysis getRestrictionsInstanceAnalysis() {
    return restrictionsInstanceAnalysis;
  }

  public void setRestrictionsInstanceAnalysis(BQRestrictionsRetrieveInputModelRestrictionsInstanceAnalysis restrictionsInstanceAnalysis) {
    this.restrictionsInstanceAnalysis = restrictionsInstanceAnalysis;
  }


}

