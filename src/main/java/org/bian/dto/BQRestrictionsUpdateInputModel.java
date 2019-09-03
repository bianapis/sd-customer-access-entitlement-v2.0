package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord;
import org.bian.dto.BQRestrictionsUpdateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestrictionsUpdateInputModel
 */
public class BQRestrictionsUpdateInputModel   {
  private BQRestrictionsUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private String restrictionsInstanceReference = null;

  private BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord = null;

  private Object restrictionsUpdateActionTaskRecord = null;

  private String restrictionsUpdateActionRequest = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQRestrictionsUpdateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQRestrictionsUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Access Profile Agreement instance 
   * @return customerAccessProfileAgreementInstanceReference
  **/

  public String getCustomerAccessProfileAgreementInstanceReference() {
    return customerAccessProfileAgreementInstanceReference;
  }

  public void setCustomerAccessProfileAgreementInstanceReference(String customerAccessProfileAgreementInstanceReference) {
    this.customerAccessProfileAgreementInstanceReference = customerAccessProfileAgreementInstanceReference;
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
   * Get restrictionsInstanceRecord
   * @return restrictionsInstanceRecord
  **/

  public BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord getRestrictionsInstanceRecord() {
    return restrictionsInstanceRecord;
  }

  public void setRestrictionsInstanceRecord(BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord) {
    this.restrictionsInstanceRecord = restrictionsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return restrictionsUpdateActionTaskRecord
  **/

  public Object getRestrictionsUpdateActionTaskRecord() {
    return restrictionsUpdateActionTaskRecord;
  }

  public void setRestrictionsUpdateActionTaskRecord(Object restrictionsUpdateActionTaskRecord) {
    this.restrictionsUpdateActionTaskRecord = restrictionsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return restrictionsUpdateActionRequest
  **/

  public String getRestrictionsUpdateActionRequest() {
    return restrictionsUpdateActionRequest;
  }

  public void setRestrictionsUpdateActionRequest(String restrictionsUpdateActionRequest) {
    this.restrictionsUpdateActionRequest = restrictionsUpdateActionRequest;
  }


}

