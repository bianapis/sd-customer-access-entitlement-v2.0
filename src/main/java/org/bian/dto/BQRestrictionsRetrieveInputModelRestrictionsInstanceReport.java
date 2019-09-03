package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestrictionsRetrieveInputModelRestrictionsInstanceReport
 */
public class BQRestrictionsRetrieveInputModelRestrictionsInstanceReport   {
  private String restrictionsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return restrictionsInstanceReportReference
  **/

  public String getRestrictionsInstanceReportReference() {
    return restrictionsInstanceReportReference;
  }

  public void setRestrictionsInstanceReportReference(String restrictionsInstanceReportReference) {
    this.restrictionsInstanceReportReference = restrictionsInstanceReportReference;
  }


}

