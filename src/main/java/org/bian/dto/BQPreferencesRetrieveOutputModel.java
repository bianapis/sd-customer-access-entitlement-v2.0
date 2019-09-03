package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord;
import org.bian.dto.BQPreferencesRetrieveOutputModelPreferencesInstanceAnalysis;
import org.bian.dto.BQPreferencesRetrieveOutputModelPreferencesInstanceRecord;
import org.bian.dto.BQPreferencesRetrieveOutputModelPreferencesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveOutputModel
 */
public class BQPreferencesRetrieveOutputModel   {
  private BQPreferencesRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private BQPreferencesRetrieveOutputModelPreferencesInstanceRecord preferencesInstanceRecord = null;

  private String preferencesRetrieveActionTaskReference = null;

  private Object preferencesRetrieveActionTaskRecord = null;

  private String preferencesRetrieveActionResponse = null;

  private BQPreferencesRetrieveOutputModelPreferencesInstanceReport preferencesInstanceReport = null;

  private BQPreferencesRetrieveOutputModelPreferencesInstanceAnalysis preferencesInstanceAnalysis = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQPreferencesRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQPreferencesRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * Get preferencesInstanceRecord
   * @return preferencesInstanceRecord
  **/

  public BQPreferencesRetrieveOutputModelPreferencesInstanceRecord getPreferencesInstanceRecord() {
    return preferencesInstanceRecord;
  }

  public void setPreferencesInstanceRecord(BQPreferencesRetrieveOutputModelPreferencesInstanceRecord preferencesInstanceRecord) {
    this.preferencesInstanceRecord = preferencesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Preferences instance retrieve service call 
   * @return preferencesRetrieveActionTaskReference
  **/

  public String getPreferencesRetrieveActionTaskReference() {
    return preferencesRetrieveActionTaskReference;
  }

  public void setPreferencesRetrieveActionTaskReference(String preferencesRetrieveActionTaskReference) {
    this.preferencesRetrieveActionTaskReference = preferencesRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return preferencesRetrieveActionResponse
  **/

  public String getPreferencesRetrieveActionResponse() {
    return preferencesRetrieveActionResponse;
  }

  public void setPreferencesRetrieveActionResponse(String preferencesRetrieveActionResponse) {
    this.preferencesRetrieveActionResponse = preferencesRetrieveActionResponse;
  }


  /**
   * Get preferencesInstanceReport
   * @return preferencesInstanceReport
  **/

  public BQPreferencesRetrieveOutputModelPreferencesInstanceReport getPreferencesInstanceReport() {
    return preferencesInstanceReport;
  }

  public void setPreferencesInstanceReport(BQPreferencesRetrieveOutputModelPreferencesInstanceReport preferencesInstanceReport) {
    this.preferencesInstanceReport = preferencesInstanceReport;
  }


  /**
   * Get preferencesInstanceAnalysis
   * @return preferencesInstanceAnalysis
  **/

  public BQPreferencesRetrieveOutputModelPreferencesInstanceAnalysis getPreferencesInstanceAnalysis() {
    return preferencesInstanceAnalysis;
  }

  public void setPreferencesInstanceAnalysis(BQPreferencesRetrieveOutputModelPreferencesInstanceAnalysis preferencesInstanceAnalysis) {
    this.preferencesInstanceAnalysis = preferencesInstanceAnalysis;
  }


}

