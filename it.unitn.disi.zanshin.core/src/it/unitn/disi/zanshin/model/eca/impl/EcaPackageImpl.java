/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;
import it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eeat.model.LTL.LTLPackage;
import org.eeat.model.LTL.impl.LTLPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcaPackageImpl extends EPackageImpl implements EcaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecaAwReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryStrategyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcaPackageImpl() {
		super(eNS_URI, EcaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcaPackage init() {
		if (isInited) return (EcaPackage)EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI);

		// Obtain or create and register package
		EcaPackageImpl theEcaPackage = (EcaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GorePackageImpl theGorePackage = (GorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI) instanceof GorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI) : GorePackage.eINSTANCE);
		LTLPackageImpl theLTLPackage = (LTLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LTLPackage.eNS_URI) instanceof LTLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LTLPackage.eNS_URI) : LTLPackage.eINSTANCE);

		// Create package meta-data objects
		theEcaPackage.createPackageContents();
		theGorePackage.createPackageContents();
		theLTLPackage.createPackageContents();

		// Initialize created meta-data
		theEcaPackage.initializePackageContents();
		theGorePackage.initializePackageContents();
		theLTLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcaPackage.eNS_URI, theEcaPackage);
		return theEcaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcaAwReq() {
		return ecaAwReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcaAwReq_Condition() {
		return (EReference)ecaAwReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcaAwReq_Strategies() {
		return (EReference)ecaAwReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcaAwReq_SelectedStrategy() {
		return (EReference)ecaAwReqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionCondition() {
		return resolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionCondition_AwReq() {
		return (EReference)resolutionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationStrategy() {
		return adaptationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_AwReq() {
		return (EReference)adaptationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_Condition() {
		return (EReference)adaptationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicabilityCondition() {
		return applicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicabilityCondition_Strategy() {
		return (EReference)applicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Session() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_AwReq() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Time() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationSession() {
		return adaptationSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationSession_Events() {
		return (EReference)adaptationSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptationSession_Active() {
		return (EAttribute)adaptationSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleResolutionCondition() {
		return simpleResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleApplicabilityCondition() {
		return simpleApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryStrategy() {
		return retryStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaFactory getEcaFactory() {
		return (EcaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ecaAwReqEClass = createEClass(ECA_AW_REQ);
		createEReference(ecaAwReqEClass, ECA_AW_REQ__CONDITION);
		createEReference(ecaAwReqEClass, ECA_AW_REQ__STRATEGIES);
		createEReference(ecaAwReqEClass, ECA_AW_REQ__SELECTED_STRATEGY);

		resolutionConditionEClass = createEClass(RESOLUTION_CONDITION);
		createEReference(resolutionConditionEClass, RESOLUTION_CONDITION__AW_REQ);

		adaptationStrategyEClass = createEClass(ADAPTATION_STRATEGY);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__AW_REQ);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__CONDITION);

		applicabilityConditionEClass = createEClass(APPLICABILITY_CONDITION);
		createEReference(applicabilityConditionEClass, APPLICABILITY_CONDITION__STRATEGY);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__SESSION);
		createEReference(eventEClass, EVENT__AW_REQ);
		createEAttribute(eventEClass, EVENT__TIME);

		adaptationSessionEClass = createEClass(ADAPTATION_SESSION);
		createEReference(adaptationSessionEClass, ADAPTATION_SESSION__EVENTS);
		createEAttribute(adaptationSessionEClass, ADAPTATION_SESSION__ACTIVE);

		simpleResolutionConditionEClass = createEClass(SIMPLE_RESOLUTION_CONDITION);

		simpleApplicabilityConditionEClass = createEClass(SIMPLE_APPLICABILITY_CONDITION);

		retryStrategyEClass = createEClass(RETRY_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GorePackage theGorePackage = (GorePackage)EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecaAwReqEClass.getESuperTypes().add(theGorePackage.getAwReq());
		simpleResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		simpleApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		retryStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(ecaAwReqEClass, EcaAwReq.class, "EcaAwReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEcaAwReq_Condition(), this.getResolutionCondition(), this.getResolutionCondition_AwReq(), "condition", null, 0, 1, EcaAwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEcaAwReq_Strategies(), this.getAdaptationStrategy(), this.getAdaptationStrategy_AwReq(), "strategies", null, 0, -1, EcaAwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEcaAwReq_SelectedStrategy(), this.getAdaptationStrategy(), null, "selectedStrategy", null, 0, 1, EcaAwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(resolutionConditionEClass, ResolutionCondition.class, "ResolutionCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResolutionCondition_AwReq(), this.getEcaAwReq(), this.getEcaAwReq_Condition(), "awReq", null, 0, 1, ResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(resolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(adaptationStrategyEClass, AdaptationStrategy.class, "AdaptationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAdaptationStrategy_AwReq(), this.getEcaAwReq(), this.getEcaAwReq_Strategies(), "awReq", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAdaptationStrategy_Condition(), this.getApplicabilityCondition(), this.getApplicabilityCondition_Strategy(), "condition", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(adaptationStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(applicabilityConditionEClass, ApplicabilityCondition.class, "ApplicabilityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getApplicabilityCondition_Strategy(), this.getAdaptationStrategy(), this.getAdaptationStrategy_Condition(), "strategy", null, 0, 1, ApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(applicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvent_Session(), this.getAdaptationSession(), this.getAdaptationSession_Events(), "session", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvent_AwReq(), this.getEcaAwReq(), null, "awReq", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEvent_Time(), ecorePackage.getEDate(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(adaptationSessionEClass, AdaptationSession.class, "AdaptationSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAdaptationSession_Events(), this.getEvent(), this.getEvent_Session(), "events", null, 0, -1, AdaptationSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAdaptationSession_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, AdaptationSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(adaptationSessionEClass, null, "addEvent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getEcaAwReq(), "awreq", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(adaptationSessionEClass, null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(simpleResolutionConditionEClass, SimpleResolutionCondition.class, "SimpleResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(simpleResolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(simpleApplicabilityConditionEClass, SimpleApplicabilityCondition.class, "SimpleApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(simpleApplicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(retryStrategyEClass, RetryStrategy.class, "RetryStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(retryStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //EcaPackageImpl
