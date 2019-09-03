package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceAnalysis;
import org.bian.dto.CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord;
import org.bian.dto.CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRetrieveOutputModel
 */
public class CRCustomerAccessProfileAgreementRetrieveOutputModel   {
  private CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementRetrieveActionTaskReference = null;

  private Object customerAccessProfileAgreementRetrieveActionTaskRecord = null;

  private String customerAccessProfileAgreementRetrieveActionResponse = null;

  private CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceReportRecord customerAccessProfileAgreementInstanceReportRecord = null;

  private CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceAnalysis customerAccessProfileAgreementInstanceAnalysis = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Access Profile Agreement instance retrieve service call 
   * @return customerAccessProfileAgreementRetrieveActionTaskReference
  **/

  public String getCustomerAccessProfileAgreementRetrieveActionTaskReference() {
    return customerAccessProfileAgreementRetrieveActionTaskReference;
  }

  public void setCustomerAccessProfileAgreementRetrieveActionTaskReference(String customerAccessProfileAgreementRetrieveActionTaskReference) {
    this.customerAccessProfileAgreementRetrieveActionTaskReference = customerAccessProfileAgreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerAccessProfileAgreementRetrieveActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementRetrieveActionTaskRecord() {
    return customerAccessProfileAgreementRetrieveActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementRetrieveActionTaskRecord(Object customerAccessProfileAgreementRetrieveActionTaskRecord) {
    this.customerAccessProfileAgreementRetrieveActionTaskRecord = customerAccessProfileAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerAccessProfileAgreementRetrieveActionResponse
  **/

  public String getCustomerAccessProfileAgreementRetrieveActionResponse() {
    return customerAccessProfileAgreementRetrieveActionResponse;
  }

  public void setCustomerAccessProfileAgreementRetrieveActionResponse(String customerAccessProfileAgreementRetrieveActionResponse) {
    this.customerAccessProfileAgreementRetrieveActionResponse = customerAccessProfileAgreementRetrieveActionResponse;
  }


  /**
   * Get customerAccessProfileAgreementInstanceReportRecord
   * @return customerAccessProfileAgreementInstanceReportRecord
  **/

  public CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceReportRecord getCustomerAccessProfileAgreementInstanceReportRecord() {
    return customerAccessProfileAgreementInstanceReportRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceReportRecord(CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceReportRecord customerAccessProfileAgreementInstanceReportRecord) {
    this.customerAccessProfileAgreementInstanceReportRecord = customerAccessProfileAgreementInstanceReportRecord;
  }


  /**
   * Get customerAccessProfileAgreementInstanceAnalysis
   * @return customerAccessProfileAgreementInstanceAnalysis
  **/

  public CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceAnalysis getCustomerAccessProfileAgreementInstanceAnalysis() {
    return customerAccessProfileAgreementInstanceAnalysis;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysis(CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceAnalysis customerAccessProfileAgreementInstanceAnalysis) {
    this.customerAccessProfileAgreementInstanceAnalysis = customerAccessProfileAgreementInstanceAnalysis;
  }


}

