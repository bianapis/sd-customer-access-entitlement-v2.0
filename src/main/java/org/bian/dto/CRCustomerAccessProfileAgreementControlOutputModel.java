package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementControlOutputModel
 */
public class CRCustomerAccessProfileAgreementControlOutputModel   {
  private String customerAccessProfileAgreementControlActionTaskReference = null;

  private Object customerAccessProfileAgreementControlActionTaskRecord = null;

  private String customerAccessProfileAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Access Profile Agreement instance control processing service call 
   * @return customerAccessProfileAgreementControlActionTaskReference
  **/

  public String getCustomerAccessProfileAgreementControlActionTaskReference() {
    return customerAccessProfileAgreementControlActionTaskReference;
  }

  public void setCustomerAccessProfileAgreementControlActionTaskReference(String customerAccessProfileAgreementControlActionTaskReference) {
    this.customerAccessProfileAgreementControlActionTaskReference = customerAccessProfileAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerAccessProfileAgreementControlActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementControlActionTaskRecord() {
    return customerAccessProfileAgreementControlActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementControlActionTaskRecord(Object customerAccessProfileAgreementControlActionTaskRecord) {
    this.customerAccessProfileAgreementControlActionTaskRecord = customerAccessProfileAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerAccessProfileAgreementControlActionResponse
  **/

  public String getCustomerAccessProfileAgreementControlActionResponse() {
    return customerAccessProfileAgreementControlActionResponse;
  }

  public void setCustomerAccessProfileAgreementControlActionResponse(String customerAccessProfileAgreementControlActionResponse) {
    this.customerAccessProfileAgreementControlActionResponse = customerAccessProfileAgreementControlActionResponse;
  }


}

