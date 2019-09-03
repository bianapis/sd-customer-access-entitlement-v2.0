package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord;
import org.bian.dto.BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestrictionsEvaluateInputModel
 */
public class BQRestrictionsEvaluateInputModel   {
  private BQRestrictionsEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private Object restrictionsEvaluateActionRecord = null;

  private BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQRestrictionsEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQRestrictionsEvaluateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
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
   * @return restrictionsEvaluateActionRecord
  **/

  public Object getRestrictionsEvaluateActionRecord() {
    return restrictionsEvaluateActionRecord;
  }

  public void setRestrictionsEvaluateActionRecord(Object restrictionsEvaluateActionRecord) {
    this.restrictionsEvaluateActionRecord = restrictionsEvaluateActionRecord;
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

