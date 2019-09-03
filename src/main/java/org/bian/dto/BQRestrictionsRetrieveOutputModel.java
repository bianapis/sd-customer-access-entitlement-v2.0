package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord;
import org.bian.dto.BQRestrictionsRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord;
import org.bian.dto.BQRestrictionsRetrieveOutputModelRestrictionsInstanceAnalysis;
import org.bian.dto.BQRestrictionsRetrieveOutputModelRestrictionsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRestrictionsRetrieveOutputModel
 */
public class BQRestrictionsRetrieveOutputModel   {
  private BQRestrictionsRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord = null;

  private BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord = null;

  private String restrictionsRetrieveActionTaskReference = null;

  private Object restrictionsRetrieveActionTaskRecord = null;

  private String restrictionsRetrieveActionResponse = null;

  private BQRestrictionsRetrieveOutputModelRestrictionsInstanceReport restrictionsInstanceReport = null;

  private BQRestrictionsRetrieveOutputModelRestrictionsInstanceAnalysis restrictionsInstanceAnalysis = null;


  /**
   * Get customerAccessProfileAgreementInstanceRecord
   * @return customerAccessProfileAgreementInstanceRecord
  **/

  public BQRestrictionsRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord getCustomerAccessProfileAgreementInstanceRecord() {
    return customerAccessProfileAgreementInstanceRecord;
  }

  public void setCustomerAccessProfileAgreementInstanceRecord(BQRestrictionsRetrieveOutputModelCustomerAccessProfileAgreementInstanceRecord customerAccessProfileAgreementInstanceRecord) {
    this.customerAccessProfileAgreementInstanceRecord = customerAccessProfileAgreementInstanceRecord;
  }


  /**
   * Get restrictionsInstanceRecord
   * @return restrictionsInstanceRecord
  **/

  public BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord getRestrictionsInstanceRecord() {
    return restrictionsInstanceRecord;
  }

  public void setRestrictionsInstanceRecord(BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord restrictionsInstanceRecord) {
    this.restrictionsInstanceRecord = restrictionsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Restrictions instance retrieve service call 
   * @return restrictionsRetrieveActionTaskReference
  **/

  public String getRestrictionsRetrieveActionTaskReference() {
    return restrictionsRetrieveActionTaskReference;
  }

  public void setRestrictionsRetrieveActionTaskReference(String restrictionsRetrieveActionTaskReference) {
    this.restrictionsRetrieveActionTaskReference = restrictionsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return restrictionsRetrieveActionTaskRecord
  **/

  public Object getRestrictionsRetrieveActionTaskRecord() {
    return restrictionsRetrieveActionTaskRecord;
  }

  public void setRestrictionsRetrieveActionTaskRecord(Object restrictionsRetrieveActionTaskRecord) {
    this.restrictionsRetrieveActionTaskRecord = restrictionsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return restrictionsRetrieveActionResponse
  **/

  public String getRestrictionsRetrieveActionResponse() {
    return restrictionsRetrieveActionResponse;
  }

  public void setRestrictionsRetrieveActionResponse(String restrictionsRetrieveActionResponse) {
    this.restrictionsRetrieveActionResponse = restrictionsRetrieveActionResponse;
  }


  /**
   * Get restrictionsInstanceReport
   * @return restrictionsInstanceReport
  **/

  public BQRestrictionsRetrieveOutputModelRestrictionsInstanceReport getRestrictionsInstanceReport() {
    return restrictionsInstanceReport;
  }

  public void setRestrictionsInstanceReport(BQRestrictionsRetrieveOutputModelRestrictionsInstanceReport restrictionsInstanceReport) {
    this.restrictionsInstanceReport = restrictionsInstanceReport;
  }


  /**
   * Get restrictionsInstanceAnalysis
   * @return restrictionsInstanceAnalysis
  **/

  public BQRestrictionsRetrieveOutputModelRestrictionsInstanceAnalysis getRestrictionsInstanceAnalysis() {
    return restrictionsInstanceAnalysis;
  }

  public void setRestrictionsInstanceAnalysis(BQRestrictionsRetrieveOutputModelRestrictionsInstanceAnalysis restrictionsInstanceAnalysis) {
    this.restrictionsInstanceAnalysis = restrictionsInstanceAnalysis;
  }


}

