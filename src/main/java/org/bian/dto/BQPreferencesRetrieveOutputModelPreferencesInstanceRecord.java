package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveOutputModelPreferencesInstanceRecord
 */
public class BQPreferencesRetrieveOutputModelPreferencesInstanceRecord   {
  private BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord channelAccessPreferencesRecord = null;


  /**
   * Get channelAccessPreferencesRecord
   * @return channelAccessPreferencesRecord
  **/

  public BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord getChannelAccessPreferencesRecord() {
    return channelAccessPreferencesRecord;
  }

  public void setChannelAccessPreferencesRecord(BQPreferencesRetrieveOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord channelAccessPreferencesRecord) {
    this.channelAccessPreferencesRecord = channelAccessPreferencesRecord;
  }


}

