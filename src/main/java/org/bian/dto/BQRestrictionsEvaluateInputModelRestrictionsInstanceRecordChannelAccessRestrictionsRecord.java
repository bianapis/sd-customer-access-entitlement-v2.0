package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsEvaluateInputModelRestrictionsInstanceRecordChannelAccessRestrictionsRecord
 */
public class BQRestrictionsEvaluateInputModelRestrictionsInstanceRecordChannelAccessRestrictionsRecord   {
  private String channelAccessProductServiceTypeUsage = null;

  private String channelAccessProductServiceChannelDeviceRestrictions = null;

  private String channelAccessProductServiceLocationRestrictions = null;

  private String channelAccessProductServiceFrequencyLimitRestrictions = null;

  private String channelAccessProductServiceTimeDurationRestrictions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details allowed products/services and associated features 
   * @return channelAccessProductServiceTypeUsage
  **/

  public String getChannelAccessProductServiceTypeUsage() {
    return channelAccessProductServiceTypeUsage;
  }

  public void setChannelAccessProductServiceTypeUsage(String channelAccessProductServiceTypeUsage) {
    this.channelAccessProductServiceTypeUsage = channelAccessProductServiceTypeUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details restrictions on allowed product/services by channel/device 
   * @return channelAccessProductServiceChannelDeviceRestrictions
  **/

  public String getChannelAccessProductServiceChannelDeviceRestrictions() {
    return channelAccessProductServiceChannelDeviceRestrictions;
  }

  public void setChannelAccessProductServiceChannelDeviceRestrictions(String channelAccessProductServiceChannelDeviceRestrictions) {
    this.channelAccessProductServiceChannelDeviceRestrictions = channelAccessProductServiceChannelDeviceRestrictions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details restrictions on allowed product/services by location 
   * @return channelAccessProductServiceLocationRestrictions
  **/

  public String getChannelAccessProductServiceLocationRestrictions() {
    return channelAccessProductServiceLocationRestrictions;
  }

  public void setChannelAccessProductServiceLocationRestrictions(String channelAccessProductServiceLocationRestrictions) {
    this.channelAccessProductServiceLocationRestrictions = channelAccessProductServiceLocationRestrictions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details restrictions on allowed product/services by frequency and cumulative amounts - can be cross-product 
   * @return channelAccessProductServiceFrequencyLimitRestrictions
  **/

  public String getChannelAccessProductServiceFrequencyLimitRestrictions() {
    return channelAccessProductServiceFrequencyLimitRestrictions;
  }

  public void setChannelAccessProductServiceFrequencyLimitRestrictions(String channelAccessProductServiceFrequencyLimitRestrictions) {
    this.channelAccessProductServiceFrequencyLimitRestrictions = channelAccessProductServiceFrequencyLimitRestrictions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details restrictions on allowed product/service by schedule and cumulative access duration 
   * @return channelAccessProductServiceTimeDurationRestrictions
  **/

  public String getChannelAccessProductServiceTimeDurationRestrictions() {
    return channelAccessProductServiceTimeDurationRestrictions;
  }

  public void setChannelAccessProductServiceTimeDurationRestrictions(String channelAccessProductServiceTimeDurationRestrictions) {
    this.channelAccessProductServiceTimeDurationRestrictions = channelAccessProductServiceTimeDurationRestrictions;
  }


}

