package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceAnalysis
 */
public class CRCustomerAccessProfileAgreementRetrieveInputModelCustomerAccessProfileAgreementInstanceAnalysis   {
  private String customerAccessProfileAgreementInstanceAnalysisReference = null;

  private String customerAccessProfileAgreementInstanceAnalysisReportType = null;

  private String customerAccessProfileAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerAccessProfileAgreementInstanceAnalysisReference
  **/

  public String getCustomerAccessProfileAgreementInstanceAnalysisReference() {
    return customerAccessProfileAgreementInstanceAnalysisReference;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysisReference(String customerAccessProfileAgreementInstanceAnalysisReference) {
    this.customerAccessProfileAgreementInstanceAnalysisReference = customerAccessProfileAgreementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerAccessProfileAgreementInstanceAnalysisReportType
  **/

  public String getCustomerAccessProfileAgreementInstanceAnalysisReportType() {
    return customerAccessProfileAgreementInstanceAnalysisReportType;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysisReportType(String customerAccessProfileAgreementInstanceAnalysisReportType) {
    this.customerAccessProfileAgreementInstanceAnalysisReportType = customerAccessProfileAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerAccessProfileAgreementInstanceAnalysisParameters
  **/

  public String getCustomerAccessProfileAgreementInstanceAnalysisParameters() {
    return customerAccessProfileAgreementInstanceAnalysisParameters;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysisParameters(String customerAccessProfileAgreementInstanceAnalysisParameters) {
    this.customerAccessProfileAgreementInstanceAnalysisParameters = customerAccessProfileAgreementInstanceAnalysisParameters;
  }


}

