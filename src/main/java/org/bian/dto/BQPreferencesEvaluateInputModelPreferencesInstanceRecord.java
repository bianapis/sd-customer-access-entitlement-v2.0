package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPreferencesEvaluateInputModelPreferencesInstanceRecordChannelAccessPreferencesRecord;

import javax.validation.Valid;
  
/**
 * BQPreferencesEvaluateInputModelPreferencesInstanceRecord
 */
public class BQPreferencesEvaluateInputModelPreferencesInstanceRecord   {
  private BQPreferencesEvaluateInputModelPreferencesInstanceRecordChannelAccessPreferencesRecord channelAccessPreferencesRecord = null;


  /**
   * Get channelAccessPreferencesRecord
   * @return channelAccessPreferencesRecord
  **/

  public BQPreferencesEvaluateInputModelPreferencesInstanceRecordChannelAccessPreferencesRecord getChannelAccessPreferencesRecord() {
    return channelAccessPreferencesRecord;
  }

  public void setChannelAccessPreferencesRecord(BQPreferencesEvaluateInputModelPreferencesInstanceRecordChannelAccessPreferencesRecord channelAccessPreferencesRecord) {
    this.channelAccessPreferencesRecord = channelAccessPreferencesRecord;
  }


}

