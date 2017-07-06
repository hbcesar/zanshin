/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.eca.EcaPackage;

import it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator;
import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.GOREElementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement;
import it.unitn.disi.zanshin.model.gore.GoreFactory;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.HardGoal;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.ParameterMetric;
import it.unitn.disi.zanshin.model.gore.ParameterType;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.RefinementType;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
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
public class GorePackageImpl extends EPackageImpl implements GorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goreElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalOrientedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performativeRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAssumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentialRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goreElementStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum differentialRelationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitorableMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refinementTypeEEnum = null;

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
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GorePackageImpl() {
		super(eNS_URI, GoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GorePackage init() {
		if (isInited) return (GorePackage)EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI);

		// Obtain or create and register package
		GorePackageImpl theGorePackage = (GorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcaPackageImpl theEcaPackage = (EcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI) instanceof EcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI) : EcaPackage.eINSTANCE);
		LTLPackageImpl theLTLPackage = (LTLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LTLPackage.eNS_URI) instanceof LTLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LTLPackage.eNS_URI) : LTLPackage.eINSTANCE);

		// Create package meta-data objects
		theGorePackage.createPackageContents();
		theEcaPackage.createPackageContents();
		theLTLPackage.createPackageContents();

		// Initialize created meta-data
		theGorePackage.initializePackageContents();
		theEcaPackage.initializePackageContents();
		theLTLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GorePackage.eNS_URI, theGorePackage);
		return theGorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalModel() {
		return goalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoalModel_InternalId() {
		return (EAttribute)goalModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Actors() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_RootGoal() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Configuration() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Relations() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGOREElement() {
		return goreElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_Time() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_State() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGOREElement_Awreqs() {
		return (EReference)goreElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_InternalID() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalOrientedRequirement() {
		return goalOrientedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoalOrientedRequirement_RefinementType() {
		return (EAttribute)goalOrientedRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOrientedRequirement_Assumptions() {
		return (EReference)goalOrientedRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOrientedRequirement_Parent() {
		return (EReference)goalOrientedRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOrientedRequirement_Refinements() {
		return (EReference)goalOrientedRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformativeRequirement() {
		return performativeRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformativeRequirement_StartTime() {
		return (EAttribute)performativeRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardGoal() {
		return hardGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardGoal_GoalModel() {
		return (EReference)hardGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftgoal() {
		return softgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftgoal_Constraints() {
		return (EReference)softgoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityConstraint() {
		return qualityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityConstraint_Target() {
		return (EReference)qualityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwReq() {
		return awReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwReq_IncrementCoefficient() {
		return (EAttribute)awReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwReq_Target() {
		return (EReference)awReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAssumption() {
		return domainAssumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAssumption_Parent() {
		return (EReference)domainAssumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_GoalModel() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_InternalID() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Parameters() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_GoalModel() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_InternalID() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentialRelation() {
		return differentialRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentialRelation_Indicator() {
		return (EReference)differentialRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentialRelation_Parameter() {
		return (EReference)differentialRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_LowerBound() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_UpperBound() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_Operator() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_Value() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_InternalID() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Configuration() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Unit() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Metric() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_InternalID() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationLevel() {
		return aggregationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGOREElementState() {
		return goreElementStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDifferentialRelationOperator() {
		return differentialRelationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitorableMethod() {
		return monitorableMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterMetric() {
		return parameterMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefinementType() {
		return refinementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoreFactory getGoreFactory() {
		return (GoreFactory)getEFactoryInstance();
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
		goalModelEClass = createEClass(GOAL_MODEL);
		createEAttribute(goalModelEClass, GOAL_MODEL__INTERNAL_ID);
		createEReference(goalModelEClass, GOAL_MODEL__ACTORS);
		createEReference(goalModelEClass, GOAL_MODEL__ROOT_GOAL);
		createEReference(goalModelEClass, GOAL_MODEL__CONFIGURATION);
		createEReference(goalModelEClass, GOAL_MODEL__RELATIONS);

		goreElementEClass = createEClass(GORE_ELEMENT);
		createEAttribute(goreElementEClass, GORE_ELEMENT__TIME);
		createEAttribute(goreElementEClass, GORE_ELEMENT__STATE);
		createEReference(goreElementEClass, GORE_ELEMENT__AWREQS);
		createEAttribute(goreElementEClass, GORE_ELEMENT__INTERNAL_ID);

		goalOrientedRequirementEClass = createEClass(GOAL_ORIENTED_REQUIREMENT);
		createEAttribute(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE);
		createEReference(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS);
		createEReference(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__PARENT);
		createEReference(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__REFINEMENTS);

		performativeRequirementEClass = createEClass(PERFORMATIVE_REQUIREMENT);
		createEAttribute(performativeRequirementEClass, PERFORMATIVE_REQUIREMENT__START_TIME);

		hardGoalEClass = createEClass(HARD_GOAL);
		createEReference(hardGoalEClass, HARD_GOAL__GOAL_MODEL);

		softgoalEClass = createEClass(SOFTGOAL);
		createEReference(softgoalEClass, SOFTGOAL__CONSTRAINTS);

		qualityConstraintEClass = createEClass(QUALITY_CONSTRAINT);
		createEReference(qualityConstraintEClass, QUALITY_CONSTRAINT__TARGET);

		awReqEClass = createEClass(AW_REQ);
		createEAttribute(awReqEClass, AW_REQ__INCREMENT_COEFFICIENT);
		createEReference(awReqEClass, AW_REQ__TARGET);

		domainAssumptionEClass = createEClass(DOMAIN_ASSUMPTION);
		createEReference(domainAssumptionEClass, DOMAIN_ASSUMPTION__PARENT);

		taskEClass = createEClass(TASK);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__GOAL_MODEL);
		createEAttribute(actorEClass, ACTOR__INTERNAL_ID);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__PARAMETERS);
		createEReference(configurationEClass, CONFIGURATION__GOAL_MODEL);
		createEAttribute(configurationEClass, CONFIGURATION__INTERNAL_ID);

		differentialRelationEClass = createEClass(DIFFERENTIAL_RELATION);
		createEReference(differentialRelationEClass, DIFFERENTIAL_RELATION__INDICATOR);
		createEReference(differentialRelationEClass, DIFFERENTIAL_RELATION__PARAMETER);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__LOWER_BOUND);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__UPPER_BOUND);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__OPERATOR);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__VALUE);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__INTERNAL_ID);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__CONFIGURATION);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__UNIT);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__METRIC);
		createEAttribute(parameterEClass, PARAMETER__INTERNAL_ID);

		// Create enums
		aggregationLevelEEnum = createEEnum(AGGREGATION_LEVEL);
		goreElementStateEEnum = createEEnum(GORE_ELEMENT_STATE);
		differentialRelationOperatorEEnum = createEEnum(DIFFERENTIAL_RELATION_OPERATOR);
		monitorableMethodEEnum = createEEnum(MONITORABLE_METHOD);
		parameterMetricEEnum = createEEnum(PARAMETER_METRIC);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		refinementTypeEEnum = createEEnum(REFINEMENT_TYPE);
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
		LTLPackage theLTLPackage = (LTLPackage)EPackage.Registry.INSTANCE.getEPackage(LTLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		goreElementEClass.getESuperTypes().add(theLTLPackage.getOclAny());
		goalOrientedRequirementEClass.getESuperTypes().add(this.getGOREElement());
		performativeRequirementEClass.getESuperTypes().add(this.getGoalOrientedRequirement());
		hardGoalEClass.getESuperTypes().add(this.getPerformativeRequirement());
		softgoalEClass.getESuperTypes().add(this.getGoalOrientedRequirement());
		qualityConstraintEClass.getESuperTypes().add(this.getGOREElement());
		awReqEClass.getESuperTypes().add(this.getGOREElement());
		domainAssumptionEClass.getESuperTypes().add(this.getGOREElement());
		taskEClass.getESuperTypes().add(this.getPerformativeRequirement());

		// Initialize classes and features; add operations and parameters
		initEClass(goalModelEClass, GoalModel.class, "GoalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoalModel_InternalId(), ecorePackage.getELongObject(), "internalId", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Actors(), this.getActor(), this.getActor_GoalModel(), "actors", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_RootGoal(), this.getHardGoal(), this.getHardGoal_GoalModel(), "rootGoal", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Configuration(), this.getConfiguration(), this.getConfiguration_GoalModel(), "configuration", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Relations(), this.getDifferentialRelation(), null, "relations", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(goalModelEClass, ecorePackage.getELongObject(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(goalModelEClass, this.getDifferentialRelation(), "filterRelations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAwReq(), "indicator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(goalModelEClass, this.getDifferentialRelation(), "filterRelations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(goalModelEClass, this.getDifferentialRelation(), "filterRelations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAwReq(), "indicator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(goalModelEClass, this.getDifferentialRelation(), "filterRelations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAwReq(), "indicator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(goreElementEClass, GOREElement.class, "GOREElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGOREElement_Time(), ecorePackage.getEDate(), "time", null, 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGOREElement_State(), this.getGOREElementState(), "state", "undefined", 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGOREElement_Awreqs(), this.getAwReq(), this.getAwReq_Target(), "awreqs", null, 0, -1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGOREElement_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(goreElementEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(goreElementEClass, null, "end", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(goreElementEClass, null, "success", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(goreElementEClass, null, "fail", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(goreElementEClass, null, "checkState", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(goreElementEClass, null, "replaceWith", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGOREElement(), "newRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(goreElementEClass, this.getGoalModel(), "findGoalModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(goreElementEClass, null, "getChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getGOREElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(goreElementEClass, ecorePackage.getEInt(), "getChildrenStateCount", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(goreElementEClass, this.getGOREElement(), "getRefinementSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(goreElementEClass, null, "setRefinementSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGOREElement(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(goalOrientedRequirementEClass, GoalOrientedRequirement.class, "GoalOrientedRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoalOrientedRequirement_RefinementType(), this.getRefinementType(), "refinementType", null, 0, 1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalOrientedRequirement_Assumptions(), this.getDomainAssumption(), this.getDomainAssumption_Parent(), "assumptions", null, 0, -1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalOrientedRequirement_Parent(), this.getGoalOrientedRequirement(), this.getGoalOrientedRequirement_Refinements(), "parent", null, 0, 1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalOrientedRequirement_Refinements(), this.getGoalOrientedRequirement(), this.getGoalOrientedRequirement_Parent(), "refinements", null, 0, -1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(goalOrientedRequirementEClass, null, "getChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getGOREElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(performativeRequirementEClass, PerformativeRequirement.class, "PerformativeRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformativeRequirement_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, PerformativeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(performativeRequirementEClass, null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(performativeRequirementEClass, null, "checkState", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(performativeRequirementEClass, null, "getChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getGOREElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(hardGoalEClass, HardGoal.class, "HardGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardGoal_GoalModel(), this.getGoalModel(), this.getGoalModel_RootGoal(), "goalModel", null, 0, 1, HardGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftgoal_Constraints(), this.getQualityConstraint(), this.getQualityConstraint_Target(), "constraints", null, 0, -1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(softgoalEClass, null, "getChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getGOREElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(qualityConstraintEClass, QualityConstraint.class, "QualityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityConstraint_Target(), this.getSoftgoal(), this.getSoftgoal_Constraints(), "target", null, 0, 1, QualityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(qualityConstraintEClass, null, "replaceWith", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoalOrientedRequirement(), "newRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(awReqEClass, AwReq.class, "AwReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwReq_IncrementCoefficient(), ecorePackage.getEDouble(), "incrementCoefficient", "1.0", 0, 1, AwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwReq_Target(), this.getGOREElement(), this.getGOREElement_Awreqs(), "target", null, 0, 1, AwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainAssumptionEClass, DomainAssumption.class, "DomainAssumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainAssumption_Parent(), this.getGoalOrientedRequirement(), this.getGoalOrientedRequirement_Assumptions(), "parent", null, 1, 1, DomainAssumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_GoalModel(), this.getGoalModel(), this.getGoalModel_Actors(), "goalModel", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Parameters(), this.getParameter(), this.getParameter_Configuration(), "parameters", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_GoalModel(), this.getGoalModel(), this.getGoalModel_Configuration(), "goalModel", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differentialRelationEClass, DifferentialRelation.class, "DifferentialRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentialRelation_Indicator(), this.getAwReq(), null, "indicator", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferentialRelation_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_LowerBound(), ecorePackage.getEString(), "lowerBound", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_UpperBound(), ecorePackage.getEString(), "upperBound", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_Operator(), this.getDifferentialRelationOperator(), "operator", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_Value(), ecorePackage.getEDouble(), "value", "0.0", 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Configuration(), this.getConfiguration(), this.getConfiguration_Parameters(), "configuration", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getParameterType(), "type", "vp", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Metric(), this.getParameterMetric(), "metric", "enumerated", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_InternalID(), ecorePackage.getEIntegerObject(), "internalID", "0", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBooleanObject(), "greaterThan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBooleanObject(), "fewerThan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBooleanObject(), "equalTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEString(), "addedTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEString(), "multipliedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEString(), "subtractedFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBooleanObject(), "withinBoundsOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDifferentialRelation(), "relation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBooleanObject(), "incrementableIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDifferentialRelation(), "relation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, this.getParameter(), "createCopy", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null, "increment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDifferentialRelation(), "relation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregationLevelEEnum, AggregationLevel.class, "AggregationLevel");
		addEEnumLiteral(aggregationLevelEEnum, AggregationLevel.INSTANCE);
		addEEnumLiteral(aggregationLevelEEnum, AggregationLevel.CLASS);
		addEEnumLiteral(aggregationLevelEEnum, AggregationLevel.BOTH);

		initEEnum(goreElementStateEEnum, GOREElementState.class, "GOREElementState");
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.UNDEFINED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.STARTED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.SUCCEEDED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.FAILED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.CANCELED);

		initEEnum(differentialRelationOperatorEEnum, DifferentialRelationOperator.class, "DifferentialRelationOperator");
		addEEnumLiteral(differentialRelationOperatorEEnum, DifferentialRelationOperator.GREATER_THAN);
		addEEnumLiteral(differentialRelationOperatorEEnum, DifferentialRelationOperator.FEWER_THAN);

		initEEnum(monitorableMethodEEnum, MonitorableMethod.class, "MonitorableMethod");
		addEEnumLiteral(monitorableMethodEEnum, MonitorableMethod.START);
		addEEnumLiteral(monitorableMethodEEnum, MonitorableMethod.END);
		addEEnumLiteral(monitorableMethodEEnum, MonitorableMethod.SUCCESS);
		addEEnumLiteral(monitorableMethodEEnum, MonitorableMethod.FAIL);
		addEEnumLiteral(monitorableMethodEEnum, MonitorableMethod.CANCEL);

		initEEnum(parameterMetricEEnum, ParameterMetric.class, "ParameterMetric");
		addEEnumLiteral(parameterMetricEEnum, ParameterMetric.ENUMERATED);
		addEEnumLiteral(parameterMetricEEnum, ParameterMetric.INTEGER);
		addEEnumLiteral(parameterMetricEEnum, ParameterMetric.REAL);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.VARIATION_POINT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.ENUMERATED_CONTROL_VARIABLE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.NUMERIC_CONTROL_VARIABLE);

		initEEnum(refinementTypeEEnum, RefinementType.class, "RefinementType");
		addEEnumLiteral(refinementTypeEEnum, RefinementType.AND);
		addEEnumLiteral(refinementTypeEEnum, RefinementType.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //GorePackageImpl
