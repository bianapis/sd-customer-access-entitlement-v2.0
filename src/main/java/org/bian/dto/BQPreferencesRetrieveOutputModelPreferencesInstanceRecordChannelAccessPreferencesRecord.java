package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecordChannelAccessPreferenceProfile;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord
 */
public class BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord   {
  private String channelAccessPreferenceReference = null;

  private String channelAccessPreferenceType = null;

  private BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecordChannelAccessPreferenceProfile channelAccessPreferenceProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to one of possibly several preferences 
   * @return channelAccessPreferenceReference
  **/

  public String getChannelAccessPreferenceReference() {
    return channelAccessPreferenceReference;
  }

  public void setChannelAccessPreferenceReference(String channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of preference (e.g. for correspondence) 
   * @return channelAccessPreferenceType
  **/

  public String getChannelAccessPreferenceType() {
    return channelAccessPreferenceType;
  }

  public void setChannelAccessPreferenceType(String channelAccessPreferenceType) {
    this.channelAccessPreferenceType = channelAccessPreferenceType;
  }


  /**
   * Get channelAccessPreferenceProfile
   * @return channelAccessPreferenceProfile
  **/

  public BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecordChannelAccessPreferenceProfile getChannelAccessPreferenceProfile() {
    return channelAccessPreferenceProfile;
  }

  public void setChannelAccessPreferenceProfile(BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecordChannelAccessPreferenceProfile channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
  }


}

