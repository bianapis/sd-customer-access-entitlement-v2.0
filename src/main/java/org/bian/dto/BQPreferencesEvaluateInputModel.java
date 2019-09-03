package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord;
import org.bian.dto.BQPreferencesEvaluateInputModelPreferencesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesEvaluateInputModel
 */
public class BQPreferencesEvaluateInputModel   {
  private BQPreferencesEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private Object preferencesEvaluateActionRecord = null;

  private BQPreferencesEvaluateInputModelPreferencesInstanceRecord preferencesInstanceRecord = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQPreferencesEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQPreferencesEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
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
   * Get preferencesInstanceRecord
   * @return preferencesInstanceRecord
  **/

  public BQPreferencesEvaluateInputModelPreferencesInstanceRecord getPreferencesInstanceRecord() {
    return preferencesInstanceRecord;
  }

  public void setPreferencesInstanceRecord(BQPreferencesEvaluateInputModelPreferencesInstanceRecord preferencesInstanceRecord) {
    this.preferencesInstanceRecord = preferencesInstanceRecord;
  }


}

