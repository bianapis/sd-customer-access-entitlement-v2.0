package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestrictionsEvaluateInputModelRestrictionsInstanceRecordChannelAccessRestrictionsRecord;

import javax.validation.Valid;
  
/**
 * BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord
 */
public class BQRestrictionsEvaluateInputModelRestrictionsInstanceRecord   {
  private BQRestrictionsEvaluateInputModelRestrictionsInstanceRecordChannelAccessRestrictionsRecord channelAccessRestrictionsRecord = null;


  /**
   * Get channelAccessRestrictionsRecord
   * @return channelAccessRestrictionsRecord
  **/

  public BQRestrictionsEvaluateInputModelRestrictionsInstanceRecordChannelAccessRestrictionsRecord getChannelAccessRestrictionsRecord() {
    return channelAccessRestrictionsRecord;
  }

  public void setChannelAccessRestrictionsRecord(BQRestrictionsEvaluateInputModelRestrictionsInstanceRecordChannelAccessRestrictionsRecord channelAccessRestrictionsRecord) {
    this.channelAccessRestrictionsRecord = channelAccessRestrictionsRecord;
  }


}

