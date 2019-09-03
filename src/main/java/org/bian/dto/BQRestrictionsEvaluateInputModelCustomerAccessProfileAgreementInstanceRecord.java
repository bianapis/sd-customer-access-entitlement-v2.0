package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord
 */
public class BQRestrictionsEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord   {
  private String customerReference = null;

  private Object customerChannelAccessProfileRecord = null;

  private String customerAccessAgreementValidFromToDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The overall access profile, combining the restrictions and preferences from subordinate qualifiers 
   * @return customerChannelAccessProfileRecord
  **/

  public Object getCustomerChannelAccessProfileRecord() {
    return customerChannelAccessProfileRecord;
  }

  public void setCustomerChannelAccessProfileRecord(Object customerChannelAccessProfileRecord) {
    this.customerChannelAccessProfileRecord = customerChannelAccessProfileRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The duration that the agreement is in force 
   * @return customerAccessAgreementValidFromToDate
  **/

  public String getCustomerAccessAgreementValidFromToDate() {
    return customerAccessAgreementValidFromToDate;
  }

  public void setCustomerAccessAgreementValidFromToDate(String customerAccessAgreementValidFromToDate) {
    this.customerAccessAgreementValidFromToDate = customerAccessAgreementValidFromToDate;
  }


}

