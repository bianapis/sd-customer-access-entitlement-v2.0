/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerAccessEntitlementApiService {

	SDCustomerAccessEntitlementActivateOutputModel activate(SDCustomerAccessEntitlementActivateInputModel request);
	
	SDCustomerAccessEntitlementConfigureOutputModel configure(String sdReferenceId, SDCustomerAccessEntitlementConfigureInputModel request);
	
	CRCustomerAccessProfileAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementControlInputModel request);
	
	CRCustomerAccessProfileAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerAccessProfileAgreementEvaluateInputModel request);
	
	BQPreferencesEvaluateOutputModel evaluatePreferences(String sdReferenceId, String crReferenceId, BQPreferencesEvaluateInputModel request);
	
	BQRestrictionsEvaluateOutputModel evaluateRestrictions(String sdReferenceId, String crReferenceId, BQRestrictionsEvaluateInputModel request);
	
	CRCustomerAccessProfileAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementExchangeInputModel request);
	
	SDCustomerAccessEntitlementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerAccessEntitlementFeedbackInputModel request);
	
	CRCustomerAccessProfileAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementGrantInputModel request);
	
	CRCustomerAccessProfileAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementRequestInputModel request);
	
	CRCustomerAccessProfileAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQPreferencesRetrieveOutputModel retrievePreferences(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRestrictionsRetrieveOutputModel retrieveRestrictions(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerAccessEntitlementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerAccessProfileAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerAccessProfileAgreementUpdateInputModel request);
	
	BQPreferencesUpdateOutputModel updatePreferences(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPreferencesUpdateInputModel request);
	
	BQRestrictionsUpdateOutputModel updateRestrictions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestrictionsUpdateInputModel request);
	
}
