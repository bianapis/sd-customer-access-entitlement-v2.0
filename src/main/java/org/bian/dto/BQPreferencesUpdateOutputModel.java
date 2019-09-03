package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesUpdateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesUpdateOutputModel
 */
public class BQPreferencesUpdateOutputModel   {
  private BQPreferencesUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String preferencesUpdateActionTaskReference = null;

  private Object preferencesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQPreferencesUpdateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQPreferencesUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return preferencesUpdateActionTaskReference
  **/

  public String getPreferencesUpdateActionTaskReference() {
    return preferencesUpdateActionTaskReference;
  }

  public void setPreferencesUpdateActionTaskReference(String preferencesUpdateActionTaskReference) {
    this.preferencesUpdateActionTaskReference = preferencesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return preferencesUpdateActionTaskRecord
  **/

  public Object getPreferencesUpdateActionTaskRecord() {
    return preferencesUpdateActionTaskRecord;
  }

  public void setPreferencesUpdateActionTaskRecord(Object preferencesUpdateActionTaskRecord) {
    this.preferencesUpdateActionTaskRecord = preferencesUpdateActionTaskRecord;
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

