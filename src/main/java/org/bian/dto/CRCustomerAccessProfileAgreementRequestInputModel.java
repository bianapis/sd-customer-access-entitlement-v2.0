package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementRequestInputModelCustomerAccessProfileAgreementInstanceRecord;
import org.bian.dto.CRCustomerAccessProfileAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRequestInputModel
 */
public class CRCustomerAccessProfileAgreementRequestInputModel   {
  private String customerAccessEntitlementServicingSessionReference = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private CRCustomerAccessProfileAgreementRequestInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private Object customerAccessProfileAgreementRequestActionTaskRecord = null;

  private CRCustomerAccessProfileAgreementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerAccessEntitlementServicingSessionReference
  **/

  public String getCustomerAccessEntitlementServicingSessionReference() {
    return customerAccessEntitlementServicingSessionReference;
  }

  public void setCustomerAccessEntitlementServicingSessionReference(String customerAccessEntitlementServicingSessionReference) {
    this.customerAccessEntitlementServicingSessionReference = customerAccessEntitlementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Access Profile Agreement instance 
   * @return customerAccessProfileAgreementInstanceReference
  **/

  public String getCustomerAccessProfileAgreementInstanceReference() {
    return customerAccessProfileAgreementInstanceReference;
  }

  public void setCustomerAccessProfileAgreementInstanceReference(String customerAccessProfileAgreementInstanceReference) {
    this.customerAccessProfileAgreementInstanceReference = customerAccessProfileAgreementInstanceReference;
  }


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public CRCustomerAccessProfileAgreementRequestInputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(CRCustomerAccessProfileAgreementRequestInputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerAccessProfileAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerAccessProfileAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

