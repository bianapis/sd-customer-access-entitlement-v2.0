package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesRetrieveInputModelPreferencesInstanceAnalysis;
import org.bian.dto.BQPreferencesRetrieveInputModelPreferencesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveInputModel
 */
public class BQPreferencesRetrieveInputModel   {
  private Object preferencesRetrieveActionTaskRecord = null;

  private String preferencesRetrieveActionRequest = null;

  private BQPreferencesRetrieveInputModelPreferencesInstanceReport preferencesInstanceReport = null;

  private BQPreferencesRetrieveInputModelPreferencesInstanceAnalysis preferencesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return preferencesRetrieveActionTaskRecord
  **/

  public Object getPreferencesRetrieveActionTaskRecord() {
    return preferencesRetrieveActionTaskRecord;
  }

  public void setPreferencesRetrieveActionTaskRecord(Object preferencesRetrieveActionTaskRecord) {
    this.preferencesRetrieveActionTaskRecord = preferencesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return preferencesRetrieveActionRequest
  **/

  public String getPreferencesRetrieveActionRequest() {
    return preferencesRetrieveActionRequest;
  }

  public void setPreferencesRetrieveActionRequest(String preferencesRetrieveActionRequest) {
    this.preferencesRetrieveActionRequest = preferencesRetrieveActionRequest;
  }


  /**
   * Get preferencesInstanceReport
   * @return preferencesInstanceReport
  **/

  public BQPreferencesRetrieveInputModelPreferencesInstanceReport getPreferencesInstanceReport() {
    return preferencesInstanceReport;
  }

  public void setPreferencesInstanceReport(BQPreferencesRetrieveInputModelPreferencesInstanceReport preferencesInstanceReport) {
    this.preferencesInstanceReport = preferencesInstanceReport;
  }


  /**
   * Get preferencesInstanceAnalysis
   * @return preferencesInstanceAnalysis
  **/

  public BQPreferencesRetrieveInputModelPreferencesInstanceAnalysis getPreferencesInstanceAnalysis() {
    return preferencesInstanceAnalysis;
  }

  public void setPreferencesInstanceAnalysis(BQPreferencesRetrieveInputModelPreferencesInstanceAnalysis preferencesInstanceAnalysis) {
    this.preferencesInstanceAnalysis = preferencesInstanceAnalysis;
  }


}

