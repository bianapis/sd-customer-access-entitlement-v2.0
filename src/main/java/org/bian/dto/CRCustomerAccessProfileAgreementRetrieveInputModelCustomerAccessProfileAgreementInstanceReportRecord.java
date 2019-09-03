package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceReportRecord
 */
public class CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceReportRecord   {
  private String customerAccessProfileAgreementInstanceReportReference = null;

  private String customerAccessProfileAgreementInstanceReportType = null;

  private String customerAccessProfileAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerAccessProfileAgreementInstanceReportReference
  **/

  public String getCustomerAccessProfileAgreementInstanceReportReference() {
    return customerAccessProfileAgreementInstanceReportReference;
  }

  public void setCustomerAccessProfileAgreementInstanceReportReference(String customerAccessProfileAgreementInstanceReportReference) {
    this.customerAccessProfileAgreementInstanceReportReference = customerAccessProfileAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerAccessProfileAgreementInstanceReportType
  **/

  public String getCustomerAccessProfileAgreementInstanceReportType() {
    return customerAccessProfileAgreementInstanceReportType;
  }

  public void setCustomerAccessProfileAgreementInstanceReportType(String customerAccessProfileAgreementInstanceReportType) {
    this.customerAccessProfileAgreementInstanceReportType = customerAccessProfileAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerAccessProfileAgreementInstanceReportParameters
  **/

  public String getCustomerAccessProfileAgreementInstanceReportParameters() {
    return customerAccessProfileAgreementInstanceReportParameters;
  }

  public void setCustomerAccessProfileAgreementInstanceReportParameters(String customerAccessProfileAgreementInstanceReportParameters) {
    this.customerAccessProfileAgreementInstanceReportParameters = customerAccessProfileAgreementInstanceReportParameters;
  }


}

