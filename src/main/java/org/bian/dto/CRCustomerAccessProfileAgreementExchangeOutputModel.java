package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementExchangeOutputModel
 */
public class CRCustomerAccessProfileAgreementExchangeOutputModel   {
  private String customerAccessProfileAgreementExchangeActionTaskReference = null;

  private Object customerAccessProfileAgreementExchangeActionTaskRecord = null;

  private String customerAccessProfileAgreementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Access Profile Agreement instance exchange service call 
   * @return customerAccessProfileAgreementExchangeActionTaskReference
  **/

  public String getCustomerAccessProfileAgreementExchangeActionTaskReference() {
    return customerAccessProfileAgreementExchangeActionTaskReference;
  }

  public void setCustomerAccessProfileAgreementExchangeActionTaskReference(String customerAccessProfileAgreementExchangeActionTaskReference) {
    this.customerAccessProfileAgreementExchangeActionTaskReference = customerAccessProfileAgreementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerAccessProfileAgreementExchangeActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementExchangeActionTaskRecord() {
    return customerAccessProfileAgreementExchangeActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementExchangeActionTaskRecord(Object customerAccessProfileAgreementExchangeActionTaskRecord) {
    this.customerAccessProfileAgreementExchangeActionTaskRecord = customerAccessProfileAgreementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerAccessProfileAgreementExchangeActionResponse
  **/

  public String getCustomerAccessProfileAgreementExchangeActionResponse() {
    return customerAccessProfileAgreementExchangeActionResponse;
  }

  public void setCustomerAccessProfileAgreementExchangeActionResponse(String customerAccessProfileAgreementExchangeActionResponse) {
    this.customerAccessProfileAgreementExchangeActionResponse = customerAccessProfileAgreementExchangeActionResponse;
  }


}

