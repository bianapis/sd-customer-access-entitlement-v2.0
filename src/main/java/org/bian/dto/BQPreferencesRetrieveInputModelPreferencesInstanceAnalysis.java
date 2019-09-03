package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPreferencesRetrieveInputModelPreferencesInstanceAnalysis
 */
public class BQPreferencesRetrieveInputModelPreferencesInstanceAnalysis   {
  private String preferencesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return preferencesInstanceAnalysisReference
  **/

  public String getPreferencesInstanceAnalysisReference() {
    return preferencesInstanceAnalysisReference;
  }

  public void setPreferencesInstanceAnalysisReference(String preferencesInstanceAnalysisReference) {
    this.preferencesInstanceAnalysisReference = preferencesInstanceAnalysisReference;
  }


}

