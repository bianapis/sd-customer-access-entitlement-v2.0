/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerAccessEntitlementApiServiceImpl implements CustomerAccessEntitlementApiService {

	public SDCustomerAccessEntitlementActivateOutputModel activate(SDCustomerAccessEntitlementActivateInputModel request){
		return JsonReader.read("activate-SDCustomerAccessEntitlementActivateOutputModel.json",new TypeReference<SDCustomerAccessEntitlementActivateOutputModel>(){});
	}
	
	public SDCustomerAccessEntitlementConfigureOutputModel configure(String sdReferenceId, SDCustomerAccessEntitlementConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerAccessEntitlementConfigureOutputModel.json",new TypeReference<SDCustomerAccessEntitlementConfigureOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementControlInputModel request){
		return JsonReader.read("control-CRCustomerAccessProfileAgreementControlOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementControlOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerAccessProfileAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCustomerAccessProfileAgreementEvaluateOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementEvaluateOutputModel>(){});
	}
	
	public BQPreferencesEvaluateOutputModel evaluatePreferences(String sdReferenceId, String crReferenceId, BQPreferencesEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPreferencesEvaluateOutputModel.json",new TypeReference<BQPreferencesEvaluateOutputModel>(){});
	}
	
	public BQRestrictionsEvaluateOutputModel evaluateRestrictions(String sdReferenceId, String crReferenceId, BQRestrictionsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQRestrictionsEvaluateOutputModel.json",new TypeReference<BQRestrictionsEvaluateOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerAccessProfileAgreementExchangeOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementExchangeOutputModel>(){});
	}
	
	public SDCustomerAccessEntitlementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerAccessEntitlementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerAccessEntitlementFeedbackOutputModel.json",new TypeReference<SDCustomerAccessEntitlementFeedbackOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementGrantInputModel request){
		return JsonReader.read("grant-CRCustomerAccessProfileAgreementGrantOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementGrantOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementRequestInputModel request){
		return JsonReader.read("request-CRCustomerAccessProfileAgreementRequestOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementRequestOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerAccessProfileAgreementRetrieveOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPreferencesRetrieveOutputModel retrievePreferences(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPreferencesRetrieveOutputModel.json",new TypeReference<BQPreferencesRetrieveOutputModel>(){});
	}
	
	public BQRestrictionsRetrieveOutputModel retrieveRestrictions(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRestrictionsRetrieveOutputModel.json",new TypeReference<BQRestrictionsRetrieveOutputModel>(){});
	}
	
	public SDCustomerAccessEntitlementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerAccessEntitlementRetrieveOutputModel.json",new TypeReference<SDCustomerAccessEntitlementRetrieveOutputModel>(){});
	}
	
	public CRCustomerAccessProfileAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementUpdateInputModel request){
		return JsonReader.read("update-CRCustomerAccessProfileAgreementUpdateOutputModel.json",new TypeReference<CRCustomerAccessProfileAgreementUpdateOutputModel>(){});
	}
	
	public BQPreferencesUpdateOutputModel updatePreferences(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPreferencesUpdateInputModel request){
		return JsonReader.read("update-BQPreferencesUpdateOutputModel.json",new TypeReference<BQPreferencesUpdateOutputModel>(){});
	}
	
	public BQRestrictionsUpdateOutputModel updateRestrictions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestrictionsUpdateInputModel request){
		return JsonReader.read("update-BQRestrictionsUpdateOutputModel.json",new TypeReference<BQRestrictionsUpdateOutputModel>(){});
	}
	
}
