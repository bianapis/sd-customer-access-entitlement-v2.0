package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord;
import org.bian.dto.BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestrictionsEvaluateOutputModel
 */
public class BQRestrictionsEvaluateOutputModel   {
  private BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String restrictionsInstanceReference = null;

  private String restrictionsEvaluateActionReference = null;

  private Object restrictionsEvaluateActionRecord = null;

  private String restrictionsInstanceStatus = null;

  private BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restrictions instance 
   * @return restrictionsInstanceReference
  **/

  public String getRestrictionsInstanceReference() {
    return restrictionsInstanceReference;
  }

  public void setRestrictionsInstanceReference(String restrictionsInstanceReference) {
    this.restrictionsInstanceReference = restrictionsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return restrictionsEvaluateActionReference
  **/

  public String getRestrictionsEvaluateActionReference() {
    return restrictionsEvaluateActionReference;
  }

  public void setRestrictionsEvaluateActionReference(String restrictionsEvaluateActionReference) {
    this.restrictionsEvaluateActionReference = restrictionsEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return restrictionsEvaluateActionRecord
  **/

  public Object getRestrictionsEvaluateActionRecord() {
    return restrictionsEvaluateActionRecord;
  }

  public void setRestrictionsEvaluateActionRecord(Object restrictionsEvaluateActionRecord) {
    this.restrictionsEvaluateActionRecord = restrictionsEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Restrictions instance (e.g. initialised, pending, active) 
   * @return restrictionsInstanceStatus
  **/

  public String getRestrictionsInstanceStatus() {
    return restrictionsInstanceStatus;
  }

  public void setRestrictionsInstanceStatus(String restrictionsInstanceStatus) {
    this.restrictionsInstanceStatus = restrictionsInstanceStatus;
  }


  /**
   * Get restrictionsInstanceRecord
   * @return restrictionsInstanceRecord
  **/

  public BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord getRestrictionsInstanceRecord() {
    return restrictionsInstanceRecord;
  }

  public void setRestrictionsInstanceRecord(BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord) {
    this.restrictionsInstanceRecord = restrictionsInstanceRecord;
  }


}

