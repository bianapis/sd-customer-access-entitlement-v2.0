package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementGrantInputModel
 */
public class CRCustomerAccessProfileAgreementGrantInputModel   {
  private String customerAccessEntitlementServicingSessionReference = null;

  private String customerAccessProfileAgreementInstanceReference = null;

  private Object customerAccessProfileAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCustomerAccessProfileAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return customerAccessProfileAgreementGrantActionTaskRecord
  **/

  public Object getCustomerAccessProfileAgreementGrantActionTaskRecord() {
    return customerAccessProfileAgreementGrantActionTaskRecord;
  }

  public void setCustomerAccessProfileAgreementGrantActionTaskRecord(Object customerAccessProfileAgreementGrantActionTaskRecord) {
    this.customerAccessProfileAgreementGrantActionTaskRecord = customerAccessProfileAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCustomerAccessProfileAgreementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCustomerAccessProfileAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

