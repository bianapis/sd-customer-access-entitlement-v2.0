package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementExchangeInputModelCustomerAccessProfileAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementExchangeInputModel
 */
public class CRCustomerAccessProfileAgreementExchangeInputModel   {
  private String customerAccessEntitlementServicingSessionReference = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private Object customerAccessProfileAgreementExchangeActionTaskRecord = null;

  private CRCustomerAccessProfileAgreementExchangeInputModelCustomerAccessProfileAgreementExchangeActionRequest customerAccessProfileAgreementExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerAccessEntitlementServicingSessionReference
  **/

  public String getCustomerAccessEntitlementServicingSessionReference() {
    return customerAccessEntitlementServicingSessionReference;
  }

  public void setCustomerAccessEntitlementServicingSessionReference(String customerAccessEntitlementServicingSessionReference) {
    this.customerAccessEntitlementServicingSessionReference = customerAccessEntitlementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Access Profile Agreement instance 
   * @return customerAccessProfileAgreementInstanceReference
  **/

  public String getCustomerAccessProfileAgreementInstanceReference() {
    return customerAccessProfileAgreementInstanceReference;
  }

  public void setCustomerAccessProfileAgreementInstanceReference(String customerAccessProfileAgreementInstanceReference) {
    this.customerAccessProfileAgreementInstanceReference = customerAccessProfileAgreementInstanceReference;
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
   * Get customerAccessProfileAgreementExchangeActionRequest
   * @return customerAccessProfileAgreementExchangeActionRequest
  **/

  public CRCustomerAccessProfileAgreementExchangeInputModelCustomerAccessProfileAgreementExchangeActionRequest getCustomerAccessProfileAgreementExchangeActionRequest() {
    return customerAccessProfileAgreementExchangeActionRequest;
  }

  public void setCustomerAccessProfileAgreementExchangeActionRequest(CRCustomerAccessProfileAgreementExchangeInputModelCustomerAccessProfileAgreementExchangeActionRequest customerAccessProfileAgreementExchangeActionRequest) {
    this.customerAccessProfileAgreementExchangeActionRequest = customerAccessProfileAgreementExchangeActionRequest;
  }


}

