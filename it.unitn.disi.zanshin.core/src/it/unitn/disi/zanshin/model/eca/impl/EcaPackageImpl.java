/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AbortStrategy;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.AndRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.DelegateStrategy;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.OrRefinedResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy;
import it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy;
import it.unitn.disi.zanshin.model.eca.RelaxReplace;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;
import it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;
import it.unitn.disi.zanshin.model.eca.StrengthenEnableChildStrategy;
import it.unitn.disi.zanshin.model.eca.StrengthenReplace;
import it.unitn.disi.zanshin.model.eca.WarningStrategy;

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
	private EClass andRefinedResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRefinedResolutionConditionEClass = null;

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
	private EClass maxExecutionsPerSessionApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andRefinedApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRefinedApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abortStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relaxDisableChildStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relaxReplaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strengthenEnableChildStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strengthenReplaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warningStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationStrategyEClass = null;

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
	public EAttribute getResolutionCondition_InternalID() {
		return (EAttribute)resolutionConditionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAdaptationStrategy_InternalID() {
		return (EAttribute)adaptationStrategyEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getApplicabilityCondition_InternalID() {
		return (EAttribute)applicabilityConditionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAdaptationSession_Id() {
		return (EAttribute)adaptationSessionEClass.getEStructuralFeatures().get(2);
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
	public EClass getAndRefinedResolutionCondition() {
		return andRefinedResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndRefinedResolutionCondition_Children() {
		return (EReference)andRefinedResolutionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRefinedResolutionCondition() {
		return orRefinedResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrRefinedResolutionCondition_Children() {
		return (EReference)orRefinedResolutionConditionEClass.getEStructuralFeatures().get(0);
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
	public EClass getMaxExecutionsPerSessionApplicabilityCondition() {
		return maxExecutionsPerSessionApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxExecutionsPerSessionApplicabilityCondition_MaxExecutions() {
		return (EAttribute)maxExecutionsPerSessionApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndRefinedApplicabilityCondition() {
		return andRefinedApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndRefinedApplicabilityCondition_Children() {
		return (EReference)andRefinedApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRefinedApplicabilityCondition() {
		return orRefinedApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrRefinedApplicabilityCondition_Children() {
		return (EReference)orRefinedApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbortStrategy() {
		return abortStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegateStrategy() {
		return delegateStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegateStrategy_Actor() {
		return (EReference)delegateStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelaxDisableChildStrategy() {
		return relaxDisableChildStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxDisableChildStrategy_Requirement() {
		return (EReference)relaxDisableChildStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelaxDisableChildStrategy_Level() {
		return (EAttribute)relaxDisableChildStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxDisableChildStrategy_Child() {
		return (EReference)relaxDisableChildStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelaxReplace() {
		return relaxReplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxReplace_Requirement() {
		return (EReference)relaxReplaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelaxReplace_Copy() {
		return (EAttribute)relaxReplaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelaxReplace_Level() {
		return (EAttribute)relaxReplaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxReplace_NewRequirement() {
		return (EReference)relaxReplaceEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getRetryStrategy_Copy() {
		return (EAttribute)retryStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryStrategy_Time() {
		return (EAttribute)retryStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrengthenEnableChildStrategy() {
		return strengthenEnableChildStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenEnableChildStrategy_Requirement() {
		return (EReference)strengthenEnableChildStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrengthenEnableChildStrategy_Level() {
		return (EAttribute)strengthenEnableChildStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenEnableChildStrategy_Child() {
		return (EReference)strengthenEnableChildStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrengthenReplace() {
		return strengthenReplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenReplace_Requirement() {
		return (EReference)strengthenReplaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrengthenReplace_Copy() {
		return (EAttribute)strengthenReplaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrengthenReplace_Level() {
		return (EAttribute)strengthenReplaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenReplace_NewRequirement() {
		return (EReference)strengthenReplaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarningStrategy() {
		return warningStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWarningStrategy_Actor() {
		return (EReference)warningStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationApplicabilityCondition() {
		return reconfigurationApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationApplicabilityCondition_WrappedCondition() {
		return (EReference)reconfigurationApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationResolutionCondition() {
		return reconfigurationResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationResolutionCondition_WrappedCondition() {
		return (EReference)reconfigurationResolutionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationStrategy() {
		return reconfigurationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationStrategy_AlgorithmId() {
		return (EAttribute)reconfigurationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationStrategy_Level() {
		return (EAttribute)reconfigurationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationStrategy_ProcedureIds() {
		return (EAttribute)reconfigurationStrategyEClass.getEStructuralFeatures().get(2);
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
		createEAttribute(resolutionConditionEClass, RESOLUTION_CONDITION__INTERNAL_ID);

		adaptationStrategyEClass = createEClass(ADAPTATION_STRATEGY);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__AW_REQ);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__CONDITION);
		createEAttribute(adaptationStrategyEClass, ADAPTATION_STRATEGY__INTERNAL_ID);

		applicabilityConditionEClass = createEClass(APPLICABILITY_CONDITION);
		createEReference(applicabilityConditionEClass, APPLICABILITY_CONDITION__STRATEGY);
		createEAttribute(applicabilityConditionEClass, APPLICABILITY_CONDITION__INTERNAL_ID);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__SESSION);
		createEReference(eventEClass, EVENT__AW_REQ);
		createEAttribute(eventEClass, EVENT__TIME);

		adaptationSessionEClass = createEClass(ADAPTATION_SESSION);
		createEReference(adaptationSessionEClass, ADAPTATION_SESSION__EVENTS);
		createEAttribute(adaptationSessionEClass, ADAPTATION_SESSION__ACTIVE);
		createEAttribute(adaptationSessionEClass, ADAPTATION_SESSION__ID);

		simpleResolutionConditionEClass = createEClass(SIMPLE_RESOLUTION_CONDITION);

		andRefinedResolutionConditionEClass = createEClass(AND_REFINED_RESOLUTION_CONDITION);
		createEReference(andRefinedResolutionConditionEClass, AND_REFINED_RESOLUTION_CONDITION__CHILDREN);

		orRefinedResolutionConditionEClass = createEClass(OR_REFINED_RESOLUTION_CONDITION);
		createEReference(orRefinedResolutionConditionEClass, OR_REFINED_RESOLUTION_CONDITION__CHILDREN);

		simpleApplicabilityConditionEClass = createEClass(SIMPLE_APPLICABILITY_CONDITION);

		maxExecutionsPerSessionApplicabilityConditionEClass = createEClass(MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION);
		createEAttribute(maxExecutionsPerSessionApplicabilityConditionEClass, MAX_EXECUTIONS_PER_SESSION_APPLICABILITY_CONDITION__MAX_EXECUTIONS);

		andRefinedApplicabilityConditionEClass = createEClass(AND_REFINED_APPLICABILITY_CONDITION);
		createEReference(andRefinedApplicabilityConditionEClass, AND_REFINED_APPLICABILITY_CONDITION__CHILDREN);

		orRefinedApplicabilityConditionEClass = createEClass(OR_REFINED_APPLICABILITY_CONDITION);
		createEReference(orRefinedApplicabilityConditionEClass, OR_REFINED_APPLICABILITY_CONDITION__CHILDREN);

		abortStrategyEClass = createEClass(ABORT_STRATEGY);

		delegateStrategyEClass = createEClass(DELEGATE_STRATEGY);
		createEReference(delegateStrategyEClass, DELEGATE_STRATEGY__ACTOR);

		relaxDisableChildStrategyEClass = createEClass(RELAX_DISABLE_CHILD_STRATEGY);
		createEReference(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT);
		createEAttribute(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY__LEVEL);
		createEReference(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY__CHILD);

		relaxReplaceEClass = createEClass(RELAX_REPLACE);
		createEReference(relaxReplaceEClass, RELAX_REPLACE__REQUIREMENT);
		createEAttribute(relaxReplaceEClass, RELAX_REPLACE__COPY);
		createEAttribute(relaxReplaceEClass, RELAX_REPLACE__LEVEL);
		createEReference(relaxReplaceEClass, RELAX_REPLACE__NEW_REQUIREMENT);

		retryStrategyEClass = createEClass(RETRY_STRATEGY);
		createEAttribute(retryStrategyEClass, RETRY_STRATEGY__COPY);
		createEAttribute(retryStrategyEClass, RETRY_STRATEGY__TIME);

		strengthenEnableChildStrategyEClass = createEClass(STRENGTHEN_ENABLE_CHILD_STRATEGY);
		createEReference(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY__REQUIREMENT);
		createEAttribute(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY__LEVEL);
		createEReference(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY__CHILD);

		strengthenReplaceEClass = createEClass(STRENGTHEN_REPLACE);
		createEReference(strengthenReplaceEClass, STRENGTHEN_REPLACE__REQUIREMENT);
		createEAttribute(strengthenReplaceEClass, STRENGTHEN_REPLACE__COPY);
		createEAttribute(strengthenReplaceEClass, STRENGTHEN_REPLACE__LEVEL);
		createEReference(strengthenReplaceEClass, STRENGTHEN_REPLACE__NEW_REQUIREMENT);

		warningStrategyEClass = createEClass(WARNING_STRATEGY);
		createEReference(warningStrategyEClass, WARNING_STRATEGY__ACTOR);

		reconfigurationApplicabilityConditionEClass = createEClass(RECONFIGURATION_APPLICABILITY_CONDITION);
		createEReference(reconfigurationApplicabilityConditionEClass, RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION);

		reconfigurationResolutionConditionEClass = createEClass(RECONFIGURATION_RESOLUTION_CONDITION);
		createEReference(reconfigurationResolutionConditionEClass, RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION);

		reconfigurationStrategyEClass = createEClass(RECONFIGURATION_STRATEGY);
		createEAttribute(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY__ALGORITHM_ID);
		createEAttribute(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY__LEVEL);
		createEAttribute(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY__PROCEDURE_IDS);
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
		andRefinedResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		orRefinedResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		simpleApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		maxExecutionsPerSessionApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		andRefinedApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		orRefinedApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		abortStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		delegateStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		relaxDisableChildStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		relaxReplaceEClass.getESuperTypes().add(this.getAdaptationStrategy());
		retryStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		strengthenEnableChildStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		strengthenReplaceEClass.getESuperTypes().add(this.getAdaptationStrategy());
		warningStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		reconfigurationApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		reconfigurationResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		reconfigurationStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(ecaAwReqEClass, EcaAwReq.class, "EcaAwReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcaAwReq_Condition(), this.getResolutionCondition(), this.getResolutionCondition_AwReq(), "condition", null, 0, 1, EcaAwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcaAwReq_Strategies(), this.getAdaptationStrategy(), this.getAdaptationStrategy_AwReq(), "strategies", null, 0, -1, EcaAwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcaAwReq_SelectedStrategy(), this.getAdaptationStrategy(), null, "selectedStrategy", null, 0, 1, EcaAwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(ecaAwReqEClass, null, "replaceWith", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGorePackage.getGOREElement(), "newRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resolutionConditionEClass, ResolutionCondition.class, "ResolutionCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolutionCondition_AwReq(), this.getEcaAwReq(), this.getEcaAwReq_Condition(), "awReq", null, 0, 1, ResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolutionCondition_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, ResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(resolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adaptationStrategyEClass, AdaptationStrategy.class, "AdaptationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationStrategy_AwReq(), this.getEcaAwReq(), this.getEcaAwReq_Strategies(), "awReq", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationStrategy_Condition(), this.getApplicabilityCondition(), this.getApplicabilityCondition_Strategy(), "condition", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptationStrategy_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(adaptationStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(adaptationStrategyEClass, null, "updateReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicabilityConditionEClass, ApplicabilityCondition.class, "ApplicabilityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicabilityCondition_Strategy(), this.getAdaptationStrategy(), this.getAdaptationStrategy_Condition(), "strategy", null, 0, 1, ApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicabilityCondition_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, ApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(applicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Session(), this.getAdaptationSession(), this.getAdaptationSession_Events(), "session", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_AwReq(), this.getEcaAwReq(), null, "awReq", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Time(), ecorePackage.getEDate(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationSessionEClass, AdaptationSession.class, "AdaptationSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationSession_Events(), this.getEvent(), this.getEvent_Session(), "events", null, 0, -1, AdaptationSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptationSession_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, AdaptationSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptationSession_Id(), ecorePackage.getEString(), "id", null, 0, 1, AdaptationSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(adaptationSessionEClass, null, "addEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEcaAwReq(), "awreq", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(adaptationSessionEClass, null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleResolutionConditionEClass, SimpleResolutionCondition.class, "SimpleResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(simpleResolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(andRefinedResolutionConditionEClass, AndRefinedResolutionCondition.class, "AndRefinedResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndRefinedResolutionCondition_Children(), this.getResolutionCondition(), null, "children", null, 0, -1, AndRefinedResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(andRefinedResolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orRefinedResolutionConditionEClass, OrRefinedResolutionCondition.class, "OrRefinedResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrRefinedResolutionCondition_Children(), this.getResolutionCondition(), null, "children", null, 0, -1, OrRefinedResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(orRefinedResolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleApplicabilityConditionEClass, SimpleApplicabilityCondition.class, "SimpleApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(simpleApplicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(maxExecutionsPerSessionApplicabilityConditionEClass, MaxExecutionsPerSessionApplicabilityCondition.class, "MaxExecutionsPerSessionApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxExecutionsPerSessionApplicabilityCondition_MaxExecutions(), ecorePackage.getEIntegerObject(), "maxExecutions", null, 0, 1, MaxExecutionsPerSessionApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(maxExecutionsPerSessionApplicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(andRefinedApplicabilityConditionEClass, AndRefinedApplicabilityCondition.class, "AndRefinedApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndRefinedApplicabilityCondition_Children(), this.getApplicabilityCondition(), null, "children", null, 0, -1, AndRefinedApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(andRefinedApplicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orRefinedApplicabilityConditionEClass, OrRefinedApplicabilityCondition.class, "OrRefinedApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrRefinedApplicabilityCondition_Children(), this.getApplicabilityCondition(), null, "children", null, 0, -1, OrRefinedApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(orRefinedApplicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abortStrategyEClass, AbortStrategy.class, "AbortStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(abortStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(delegateStrategyEClass, DelegateStrategy.class, "DelegateStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegateStrategy_Actor(), theGorePackage.getActor(), null, "actor", null, 0, 1, DelegateStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(delegateStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relaxDisableChildStrategyEClass, RelaxDisableChildStrategy.class, "RelaxDisableChildStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelaxDisableChildStrategy_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, RelaxDisableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelaxDisableChildStrategy_Level(), theGorePackage.getAggregationLevel(), "level", null, 0, 1, RelaxDisableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaxDisableChildStrategy_Child(), theGorePackage.getGOREElement(), null, "child", null, 0, 1, RelaxDisableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(relaxDisableChildStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(relaxDisableChildStrategyEClass, null, "updateReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relaxReplaceEClass, RelaxReplace.class, "RelaxReplace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelaxReplace_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, RelaxReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelaxReplace_Copy(), ecorePackage.getEBooleanObject(), "copy", null, 0, 1, RelaxReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelaxReplace_Level(), theGorePackage.getAggregationLevel(), "level", null, 0, 1, RelaxReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaxReplace_NewRequirement(), theGorePackage.getGOREElement(), null, "newRequirement", null, 0, 1, RelaxReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(relaxReplaceEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(relaxReplaceEClass, null, "updateReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(retryStrategyEClass, RetryStrategy.class, "RetryStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetryStrategy_Copy(), ecorePackage.getEBooleanObject(), "copy", null, 0, 1, RetryStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryStrategy_Time(), ecorePackage.getELongObject(), "time", null, 0, 1, RetryStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(retryStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strengthenEnableChildStrategyEClass, StrengthenEnableChildStrategy.class, "StrengthenEnableChildStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrengthenEnableChildStrategy_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, StrengthenEnableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrengthenEnableChildStrategy_Level(), theGorePackage.getAggregationLevel(), "level", null, 0, 1, StrengthenEnableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrengthenEnableChildStrategy_Child(), theGorePackage.getGOREElement(), null, "child", null, 0, 1, StrengthenEnableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(strengthenEnableChildStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strengthenEnableChildStrategyEClass, null, "updateReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strengthenReplaceEClass, StrengthenReplace.class, "StrengthenReplace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrengthenReplace_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, StrengthenReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrengthenReplace_Copy(), ecorePackage.getEBooleanObject(), "copy", null, 0, 1, StrengthenReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrengthenReplace_Level(), theGorePackage.getAggregationLevel(), "level", null, 0, 1, StrengthenReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrengthenReplace_NewRequirement(), theGorePackage.getGOREElement(), null, "newRequirement", null, 0, 1, StrengthenReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(strengthenReplaceEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strengthenReplaceEClass, null, "updateReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(warningStrategyEClass, WarningStrategy.class, "WarningStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWarningStrategy_Actor(), theGorePackage.getActor(), null, "actor", null, 0, 1, WarningStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(warningStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reconfigurationApplicabilityConditionEClass, ReconfigurationApplicabilityCondition.class, "ReconfigurationApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationApplicabilityCondition_WrappedCondition(), this.getApplicabilityCondition(), null, "wrappedCondition", null, 0, 1, ReconfigurationApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(reconfigurationApplicabilityConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reconfigurationResolutionConditionEClass, ReconfigurationResolutionCondition.class, "ReconfigurationResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationResolutionCondition_WrappedCondition(), this.getResolutionCondition(), null, "wrappedCondition", null, 0, 1, ReconfigurationResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(reconfigurationResolutionConditionEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reconfigurationStrategyEClass, ReconfigurationStrategy.class, "ReconfigurationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationStrategy_AlgorithmId(), ecorePackage.getEString(), "algorithmId", null, 0, 1, ReconfigurationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationStrategy_Level(), theGorePackage.getAggregationLevel(), "level", "class-level", 0, 1, ReconfigurationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationStrategy_ProcedureIds(), ecorePackage.getEString(), "procedureIds", null, 0, -1, ReconfigurationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(reconfigurationStrategyEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdaptationSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcaPackageImpl
