package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementRequestOutputModelCustomerAccessProfileAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRequestOutputModel
 */
public class CRCustomerAccessProfileAgreementRequestOutputModel   {
  private CRCustomerAccessProfileAgreementRequestOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private String customerAccessProfileAgreementRequestActionTaskReference = null;

  private Object customerAccessProfileAgreementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public CRCustomerAccessProfileAgreementRequestOutputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementRequestOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Access Profile Agreement instance request service call 
   * @return customerAccessProfileAgreementRequestActionTaskReference
  **/

  public String getCustomerAccessProfileAgreementRequestActionTaskReference() {
    return customerAccessProfileAgreementRequestActionTaskReference;
  }

  public void setCustomerAccessProfileAgreementRequestActionTaskReference(String customerAccessProfileAgreementRequestActionTaskReference) {
    this.customerAccessProfileAgreementRequestActionTaskReference = customerAccessProfileAgreementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerAccessProfileAgreementRequestActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementRequestActionTaskRecord() {
    return customerAccessProfileAgreementRequestActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementRequestActionTaskRecord(Object customerAccessProfileAgreementRequestActionTaskRecord) {
    this.customerAccessProfileAgreementRequestActionTaskRecord = customerAccessProfileAgreementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

