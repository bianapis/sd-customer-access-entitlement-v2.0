package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementEvaluateOutputModel
 */
public class CRCustomerAccessProfileAgreementEvaluateOutputModel   {
  private String customerAccessProfileAgreementInstanceReference = null;

  private String customerAccessProfileAgreementEvaluateActionReference = null;

  private Object customerAccessProfileAgreementEvaluateActionRecord = null;

  private String customerAccessProfileAgreementInstanceStatus = null;

  private CRCustomerAccessProfileAgreementEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return customerAccessProfileAgreementEvaluateActionReference
  **/

  public String getCustomerAccessProfileAgreementEvaluateActionReference() {
    return customerAccessProfileAgreementEvaluateActionReference;
  }

  public void setCustomerAccessProfileAgreementEvaluateActionReference(String customerAccessProfileAgreementEvaluateActionReference) {
    this.customerAccessProfileAgreementEvaluateActionReference = customerAccessProfileAgreementEvaluateActionReference;
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

  public CRCustomerAccessProfileAgreementEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


}

