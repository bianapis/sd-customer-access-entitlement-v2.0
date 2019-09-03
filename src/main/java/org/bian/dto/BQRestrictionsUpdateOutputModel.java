package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord;
import org.bian.dto.BQRestrictionsUpdateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestrictionsUpdateOutputModel
 */
public class BQRestrictionsUpdateOutputModel   {
  private BQRestrictionsUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord = null;

  private String restrictionsUpdateActionTaskReference = null;

  private Object restrictionsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return restrictionsUpdateActionTaskReference
  **/

  public String getRestrictionsUpdateActionTaskReference() {
    return restrictionsUpdateActionTaskReference;
  }

  public void setRestrictionsUpdateActionTaskReference(String restrictionsUpdateActionTaskReference) {
    this.restrictionsUpdateActionTaskReference = restrictionsUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

