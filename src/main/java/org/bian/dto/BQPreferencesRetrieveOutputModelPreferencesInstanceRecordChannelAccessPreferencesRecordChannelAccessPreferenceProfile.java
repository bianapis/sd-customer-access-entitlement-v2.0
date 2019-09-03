package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecordChannelAccessPreferenceProfile
 */
public class BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecordChannelAccessPreferenceProfile   {
  private String channelAccessChannelDeviceType = null;

  private String channelAccessChannelDeviceTypePreference = null;

  private String productServiceType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the specific device or channel with the preference 
   * @return channelAccessChannelDeviceType
  **/

  public String getChannelAccessChannelDeviceType() {
    return channelAccessChannelDeviceType;
  }

  public void setChannelAccessChannelDeviceType(String channelAccessChannelDeviceType) {
    this.channelAccessChannelDeviceType = channelAccessChannelDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Details the preference (e.g. no paper correspondence, no solicitations) 
   * @return channelAccessChannelDeviceTypePreference
  **/

  public String getChannelAccessChannelDeviceTypePreference() {
    return channelAccessChannelDeviceTypePreference;
  }

  public void setChannelAccessChannelDeviceTypePreference(String channelAccessChannelDeviceTypePreference) {
    this.channelAccessChannelDeviceTypePreference = channelAccessChannelDeviceTypePreference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The types of product and service to which this preference applies 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


}

