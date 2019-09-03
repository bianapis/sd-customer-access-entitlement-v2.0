package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementUpdateOutputModel
 */
public class CRCustomerAccessProfileAgreementUpdateOutputModel   {
  private CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementUpdateActionTaskReference = null;

  private Object customerAccessProfileAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementUpdateInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerAccessProfileAgreementUpdateActionTaskReference
  **/

  public String getCustomerAccessProfileAgreementUpdateActionTaskReference() {
    return customerAccessProfileAgreementUpdateActionTaskReference;
  }

  public void setCustomerAccessProfileAgreementUpdateActionTaskReference(String customerAccessProfileAgreementUpdateActionTaskReference) {
    this.customerAccessProfileAgreementUpdateActionTaskReference = customerAccessProfileAgreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerAccessProfileAgreementUpdateActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementUpdateActionTaskRecord() {
    return customerAccessProfileAgreementUpdateActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementUpdateActionTaskRecord(Object customerAccessProfileAgreementUpdateActionTaskRecord) {
    this.customerAccessProfileAgreementUpdateActionTaskRecord = customerAccessProfileAgreementUpdateActionTaskRecord;
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

