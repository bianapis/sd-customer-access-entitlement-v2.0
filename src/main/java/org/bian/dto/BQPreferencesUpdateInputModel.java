package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesUpdateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesUpdateInputModel
 */
public class BQPreferencesUpdateInputModel   {
  private BQPreferencesUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private String preferencesInstanceReference = null;

  private Object preferencesUpdateActionTaskRecord = null;

  private String preferencesUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return preferencesUpdateActionRequest
  **/

  public String getPreferencesUpdateActionRequest() {
    return preferencesUpdateActionRequest;
  }

  public void setPreferencesUpdateActionRequest(String preferencesUpdateActionRequest) {
    this.preferencesUpdateActionRequest = preferencesUpdateActionRequest;
  }


}

