package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceAnalysis
 */
public class CRCustomerAccessProfileAgreementRetrieveOutputModelCustomerAccessProfileAgreementInstanceAnalysis   {
  private String customerAccessProfileAgreementInstanceAnalysisData = null;

  private String customerAccessProfileAgreementInstanceAnalysisReportType = null;

  private Object customerAccessProfileAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerAccessProfileAgreementInstanceAnalysisData
  **/

  public String getCustomerAccessProfileAgreementInstanceAnalysisData() {
    return customerAccessProfileAgreementInstanceAnalysisData;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysisData(String customerAccessProfileAgreementInstanceAnalysisData) {
    this.customerAccessProfileAgreementInstanceAnalysisData = customerAccessProfileAgreementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerAccessProfileAgreementInstanceAnalysisReport
  **/

  public Object getCustomerAccessProfileAgreementInstanceAnalysisReport() {
    return customerAccessProfileAgreementInstanceAnalysisReport;
  }

  public void setCustomerAccessProfileAgreementInstanceAnalysisReport(Object customerAccessProfileAgreementInstanceAnalysisReport) {
    this.customerAccessProfileAgreementInstanceAnalysisReport = customerAccessProfileAgreementInstanceAnalysisReport;
  }


}

