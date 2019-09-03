package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesEvaluateOutputModelPreferencesInstanceRecord;
import org.bian.dto.BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesEvaluateOutputModel
 */
public class BQPreferencesEvaluateOutputModel   {
  private BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String preferencesInstanceReference = null;

  private String preferencesEvaluateActionReference = null;

  private Object preferencesEvaluateActionRecord = null;

  private String preferencesInstanceStatus = null;

  private BQPreferencesEvaluateOutputModelPreferencesInstanceRecord preferencesInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Preferences instance 
   * @return preferencesInstanceReference
  **/

  public String getPreferencesInstanceReference() {
    return preferencesInstanceReference;
  }

  public void setPreferencesInstanceReference(String preferencesInstanceReference) {
    this.preferencesInstanceReference = preferencesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return preferencesEvaluateActionReference
  **/

  public String getPreferencesEvaluateActionReference() {
    return preferencesEvaluateActionReference;
  }

  public void setPreferencesEvaluateActionReference(String preferencesEvaluateActionReference) {
    this.preferencesEvaluateActionReference = preferencesEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return preferencesEvaluateActionRecord
  **/

  public Object getPreferencesEvaluateActionRecord() {
    return preferencesEvaluateActionRecord;
  }

  public void setPreferencesEvaluateActionRecord(Object preferencesEvaluateActionRecord) {
    this.preferencesEvaluateActionRecord = preferencesEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Preferences instance (e.g. initialised, pending, active) 
   * @return preferencesInstanceStatus
  **/

  public String getPreferencesInstanceStatus() {
    return preferencesInstanceStatus;
  }

  public void setPreferencesInstanceStatus(String preferencesInstanceStatus) {
    this.preferencesInstanceStatus = preferencesInstanceStatus;
  }


  /**
   * Get preferencesInstanceRecord
   * @return preferencesInstanceRecord
  **/

  public BQPreferencesEvaluateOutputModelPreferencesInstanceRecord getPreferencesInstanceRecord() {
    return preferencesInstanceRecord;
  }

  public void setPreferencesInstanceRecord(BQPreferencesEvaluateOutputModelPreferencesInstanceRecord preferencesInstanceRecord) {
    this.preferencesInstanceRecord = preferencesInstanceRecord;
  }


}

