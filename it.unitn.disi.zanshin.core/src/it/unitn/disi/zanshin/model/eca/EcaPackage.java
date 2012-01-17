/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.GorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unitn.disi.zanshin.model.eca.EcaFactory
 * @model kind="package"
 * @generated
 */
public interface EcaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eca"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zanshin.disi.unitn.it/1.0/eca"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "it.unitn.disi.zanshin.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcaPackage eINSTANCE = it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl <em>Aw Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEcaAwReq()
	 * @generated
	 */
	int ECA_AW_REQ = 0;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__REFINEMENT_TYPE = GorePackage.AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__CHILDREN = GorePackage.AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__PARENT = GorePackage.AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__TIME = GorePackage.AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__STATE = GorePackage.AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__OTHER_TARGETS = GorePackage.AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__TARGET = GorePackage.AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__GOAL_MODEL = GorePackage.AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__CONDITION = GorePackage.AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__STRATEGIES = GorePackage.AW_REQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ__SELECTED_STRATEGY = GorePackage.AW_REQ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aw Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECA_AW_REQ_FEATURE_COUNT = GorePackage.AW_REQ_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl <em>Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getResolutionCondition()
	 * @generated
	 */
	int RESOLUTION_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION__AW_REQ = 0;

	/**
	 * The number of structural features of the '<em>Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl <em>Adaptation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationStrategy()
	 * @generated
	 */
	int ADAPTATION_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__AW_REQ = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Adaptation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl <em>Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getApplicabilityCondition()
	 * @generated
	 */
	int APPLICABILITY_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.EventImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SESSION = 0;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AW_REQ = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl <em>Adaptation Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationSession()
	 * @generated
	 */
	int ADAPTATION_SESSION = 5;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION__ACTIVE = 1;

	/**
	 * The number of structural features of the '<em>Adaptation Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl <em>Simple Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleResolutionCondition()
	 * @generated
	 */
	int SIMPLE_RESOLUTION_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION__AW_REQ = RESOLUTION_CONDITION__AW_REQ;

	/**
	 * The number of structural features of the '<em>Simple Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl <em>Simple Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleApplicabilityCondition()
	 * @generated
	 */
	int SIMPLE_APPLICABILITY_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The number of structural features of the '<em>Simple Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl <em>Retry Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl
	 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRetryStrategy()
	 * @generated
	 */
	int RETRY_STRATEGY = 8;

	/**
	 * The feature id for the '<em><b>Aw Req</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__AW_REQ = ADAPTATION_STRATEGY__AW_REQ;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__CONDITION = ADAPTATION_STRATEGY__CONDITION;

	/**
	 * The number of structural features of the '<em>Retry Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq
	 * @generated
	 */
	EClass getEcaAwReq();

	/**
	 * Returns the meta object for the containment reference '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition()
	 * @see #getEcaAwReq()
	 * @generated
	 */
	EReference getEcaAwReq_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies()
	 * @see #getEcaAwReq()
	 * @generated
	 */
	EReference getEcaAwReq_Strategies();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getSelectedStrategy <em>Selected Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getSelectedStrategy()
	 * @see #getEcaAwReq()
	 * @generated
	 */
	EReference getEcaAwReq_SelectedStrategy();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition <em>Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ResolutionCondition
	 * @generated
	 */
	EClass getResolutionCondition();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq()
	 * @see #getResolutionCondition()
	 * @generated
	 */
	EReference getResolutionCondition_AwReq();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy
	 * @generated
	 */
	EClass getAdaptationStrategy();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_AwReq();

	/**
	 * Returns the meta object for the containment reference '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_Condition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition <em>Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition
	 * @generated
	 */
	EClass getApplicabilityCondition();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy()
	 * @see #getApplicabilityCondition()
	 * @generated
	 */
	EReference getApplicabilityCondition_Strategy();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.eca.Event#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Session</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event#getSession()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Session();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.eca.Event#getAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event#getAwReq()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_AwReq();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession <em>Adaptation Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Session</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession
	 * @generated
	 */
	EClass getAdaptationSession();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents()
	 * @see #getAdaptationSession()
	 * @generated
	 */
	EReference getAdaptationSession_Events();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession#isActive()
	 * @see #getAdaptationSession()
	 * @generated
	 */
	EAttribute getAdaptationSession_Active();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition <em>Simple Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Resolution Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition
	 * @generated
	 */
	EClass getSimpleResolutionCondition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition <em>Simple Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Applicability Condition</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition
	 * @generated
	 */
	EClass getSimpleApplicabilityCondition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy <em>Retry Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Strategy</em>'.
	 * @see it.unitn.disi.zanshin.model.eca.RetryStrategy
	 * @generated
	 */
	EClass getRetryStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcaFactory getEcaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl <em>Aw Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEcaAwReq()
		 * @generated
		 */
		EClass ECA_AW_REQ = eINSTANCE.getEcaAwReq();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECA_AW_REQ__CONDITION = eINSTANCE.getEcaAwReq_Condition();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECA_AW_REQ__STRATEGIES = eINSTANCE.getEcaAwReq_Strategies();

		/**
		 * The meta object literal for the '<em><b>Selected Strategy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECA_AW_REQ__SELECTED_STRATEGY = eINSTANCE.getEcaAwReq_SelectedStrategy();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl <em>Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getResolutionCondition()
		 * @generated
		 */
		EClass RESOLUTION_CONDITION = eINSTANCE.getResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Aw Req</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_CONDITION__AW_REQ = eINSTANCE.getResolutionCondition_AwReq();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl <em>Adaptation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationStrategy()
		 * @generated
		 */
		EClass ADAPTATION_STRATEGY = eINSTANCE.getAdaptationStrategy();

		/**
		 * The meta object literal for the '<em><b>Aw Req</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__AW_REQ = eINSTANCE.getAdaptationStrategy_AwReq();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__CONDITION = eINSTANCE.getAdaptationStrategy_Condition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl <em>Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.ApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getApplicabilityCondition()
		 * @generated
		 */
		EClass APPLICABILITY_CONDITION = eINSTANCE.getApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICABILITY_CONDITION__STRATEGY = eINSTANCE.getApplicabilityCondition_Strategy();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.EventImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SESSION = eINSTANCE.getEvent_Session();

		/**
		 * The meta object literal for the '<em><b>Aw Req</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__AW_REQ = eINSTANCE.getEvent_AwReq();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl <em>Adaptation Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.AdaptationSessionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getAdaptationSession()
		 * @generated
		 */
		EClass ADAPTATION_SESSION = eINSTANCE.getAdaptationSession();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_SESSION__EVENTS = eINSTANCE.getAdaptationSession_Events();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_SESSION__ACTIVE = eINSTANCE.getAdaptationSession_Active();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl <em>Simple Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleResolutionConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleResolutionCondition()
		 * @generated
		 */
		EClass SIMPLE_RESOLUTION_CONDITION = eINSTANCE.getSimpleResolutionCondition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl <em>Simple Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.SimpleApplicabilityConditionImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getSimpleApplicabilityCondition()
		 * @generated
		 */
		EClass SIMPLE_APPLICABILITY_CONDITION = eINSTANCE.getSimpleApplicabilityCondition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl <em>Retry Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl
		 * @see it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl#getRetryStrategy()
		 * @generated
		 */
		EClass RETRY_STRATEGY = eINSTANCE.getRetryStrategy();

	}

} //EcaPackage
