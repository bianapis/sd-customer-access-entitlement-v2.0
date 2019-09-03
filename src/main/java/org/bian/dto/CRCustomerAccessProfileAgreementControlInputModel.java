package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementControlInputModelCustomerAccessProfileAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementControlInputModel
 */
public class CRCustomerAccessProfileAgreementControlInputModel   {
  private String customerAccessEntitlementServicingSessionReference = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private Object customerAccessProfileAgreementControlActionTaskRecord = null;

  private CRCustomerAccessProfileAgreementControlInputModelCustomerAccessProfileAgreementControlActionRequest customerAccessProfileAgreementControlActionRequest = null;


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
   * Get customerAccessProfileAgreementControlActionRequest
   * @return customerAccessProfileAgreementControlActionRequest
  **/

  public CRCustomerAccessProfileAgreementControlInputModelCustomerAccessProfileAgreementControlActionRequest getCustomerAccessProfileAgreementControlActionRequest() {
    return customerAccessProfileAgreementControlActionRequest;
  }

  public void setCustomerAccessProfileAgreementControlActionRequest(CRCustomerAccessProfileAgreementControlInputModelCustomerAccessProfileAgreementControlActionRequest customerAccessProfileAgreementControlActionRequest) {
    this.customerAccessProfileAgreementControlActionRequest = customerAccessProfileAgreementControlActionRequest;
  }


}

