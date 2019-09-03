package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementUpdateInputModel
 */
public class CRCustomerAccessProfileAgreementUpdateInputModel   {
  private String customerAccessEntitlementServicingSessionReference = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private Object customerAccessProfileAgreementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerAccessProfileAgreementUpdateActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementUpdateActionTaskRecord() {
    return customerAccessProfileAgreementUpdateActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementUpdateActionTaskRecord(Object customerAccessProfileAgreementUpdateActionTaskRecord) {
    this.customerAccessProfileAgreementUpdateActionTaskRecord = customerAccessProfileAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

