package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementEvaluateInputModel
 */
public class CRCustomerAccessProfileAgreementEvaluateInputModel   {
  private String customerAccessEntitlementServicingSessionReference = null;

  private Object customerAccessProfileAgreementEvaluateActionRecord = null;

  private String customerAccessProfileAgreementInstanceStatus = null;

  private CRCustomerAccessProfileAgreementEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return customerAccessProfileAgreementEvaluateActionRecord
  **/

  public Object getCustomerAccessProfileAgreementEvaluateActionRecord() {
    return customerAccessProfileAgreementEvaluateActionRecord;
  }

  public void setCustomerAccessProfileAgreementEvaluateActionRecord(Object customerAccessProfileAgreementEvaluateActionRecord) {
    this.customerAccessProfileAgreementEvaluateActionRecord = customerAccessProfileAgreementEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Access Profile Agreement instance (e.g. initialised, pending, active) 
   * @return customerAccessProfileAgreementInstanceStatus
  **/

  public String getCustomerAccessProfileAgreementInstanceStatus() {
    return customerAccessProfileAgreementInstanceStatus;
  }

  public void setCustomerAccessProfileAgreementInstanceStatus(String customerAccessProfileAgreementInstanceStatus) {
    this.customerAccessProfileAgreementInstanceStatus = customerAccessProfileAgreementInstanceStatus;
  }


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public CRCustomerAccessProfileAgreementEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


}

