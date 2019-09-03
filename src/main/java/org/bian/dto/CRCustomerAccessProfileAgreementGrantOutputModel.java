package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAccessProfileAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementGrantOutputModel
 */
public class CRCustomerAccessProfileAgreementGrantOutputModel   {
  private String customerAccessProfileAgreementGrantActionTaskReference = null;

  private Object customerAccessProfileAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCustomerAccessProfileAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Access Profile Agreement instance grant service call 
   * @return customerAccessProfileAgreementGrantActionTaskReference
  **/

  public String getCustomerAccessProfileAgreementGrantActionTaskReference() {
    return customerAccessProfileAgreementGrantActionTaskReference;
  }

  public void setCustomerAccessProfileAgreementGrantActionTaskReference(String customerAccessProfileAgreementGrantActionTaskReference) {
    this.customerAccessProfileAgreementGrantActionTaskReference = customerAccessProfileAgreementGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCustomerAccessProfileAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCustomerAccessProfileAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

