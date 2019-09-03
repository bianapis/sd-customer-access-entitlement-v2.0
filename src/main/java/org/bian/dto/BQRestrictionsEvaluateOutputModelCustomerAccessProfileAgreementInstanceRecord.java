package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord
 */
public class BQRestrictionsEvaluateOutputModelCustomerAccessProfileAgreementInstanceRecord   {
  private Object customerChannelAccessProfileRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The overall access profile, combining the restrictions and preferences from subordinate qualifiers 
   * @return customerChannelAccessProfileRecord
  **/

  public Object getCustomerChannelAccessProfileRecord() {
    return customerChannelAccessProfileRecord;
  }

  public void setCustomerChannelAccessProfileRecord(Object customerChannelAccessProfileRecord) {
    this.customerChannelAccessProfileRecord = customerChannelAccessProfileRecord;
  }


}

