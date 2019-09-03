package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesEvaluateOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesEvaluateOutputModelPreferencesInstanceRecord
 */
public class BQPreferencesEvaluateOutputModelPreferencesInstanceRecord   {
  private BQPreferencesEvaluateOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord channelAccessPreferencesRecord = null;


  /**
   * Get channelAccessPreferencesRecord
   * @return channelAccessPreferencesRecord
  **/

  public BQPreferencesEvaluateOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord getChannelAccessPreferencesRecord() {
    return channelAccessPreferencesRecord;
  }

  public void setChannelAccessPreferencesRecord(BQPreferencesEvaluateOutputModelPreferencesInstanceRecordChannelAccessPreferencesRecord channelAccessPreferencesRecord) {
    this.channelAccessPreferencesRecord = channelAccessPreferencesRecord;
  }


}

