package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceAnalysis;
import org.bian.dto.CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRetrieveInputModel
 */
public class CRCustomerAccessProfileAgreementRetrieveInputModel   {
  private Object customerAccessProfileAgreementRetrieveActionTaskRecord = null;

  private String customerAccessProfileAgreementRetrieveActionRequest = null;

  private CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceReportRecord customerAccessProfileAgreementInstanceReportRecord = null;

  private CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceAnalysis customerAccessProfileAgreementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerAccessProfileAgreementRetrieveActionRequest
  **/

  public String getCustomerAccessProfileAgreementRetrieveActionRequest() {
    return customerAccessProfileAgreementRetrieveActionRequest;
  }

  public void setCustomerAccessProfileAgreementRetrieveActionRequest(String customerAccessProfileAgreementRetrieveActionRequest) {
    this.customerAccessProfileAgreementRetrieveActionRequest = customerAccessProfileAgreementRetrieveActionRequest;
  }


  /**
   * Get customerAccessProfileAgreementInstanceReportRecord
   * @return customerAccessProfileAgreementInstanceReportRecord
  **/

  public CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceReportRecord getCustomerAccessProfileAgreementInstanceReportRecord() {
    return customerAccessProfileAgreementInstanceReportRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceReportRecord(CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceReportRecord customerAccessProfileAgreementInstanceReportRecord) {
    this.customerAccessProfileAgreementInstanceReportRecord = customerAccessProfileAgreementInstanceReportRecord;
  }


  /**
   * Get customerAccessProfileAgreementInstanceAnalysis
   * @return customerAccessProfileAgreementInstanceAnalysis
  **/

  public CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceAnalysis getCustomerAccessProfileAgreementInstanceAnalysis() {
    return customerAccessProfileAgreementInstanceAnalysis;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysis(CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceAnalysis customerAccessProfileAgreementInstanceAnalysis) {
    this.customerAccessProfileAgreementInstanceAnalysis = customerAccessProfileAgreementInstanceAnalysis;
  }


}

