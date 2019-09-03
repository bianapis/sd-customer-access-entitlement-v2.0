package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsRetrieveInputModelRestrictionsInstanceAnalysis
 */
public class BQRestrictionsRetrieveInputModelRestrictionsInstanceAnalysis   {
  private String restrictionsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return restrictionsInstanceAnalysisReference
  **/

  public String getRestrictionsInstanceAnalysisReference() {
    return restrictionsInstanceAnalysisReference;
  }

  public void setRestrictionsInstanceAnalysisReference(String restrictionsInstanceAnalysisReference) {
    this.restrictionsInstanceAnalysisReference = restrictionsInstanceAnalysisReference;
  }


}

