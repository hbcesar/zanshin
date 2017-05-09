/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eeat.model.LTL.LTLPackage;

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
 * @see it.unitn.disi.zanshin.model.gore.GoreFactory
 * @model kind="package"
 * @generated
 */
public interface GorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://raw.githubusercontent.com/hbcesar/zanshin/master/it.unitn.disi.zanshin.core/META-INF/gore.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "it.unitn.disi.zanshin.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GorePackage eINSTANCE = it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoalModel()
	 * @generated
	 */
	int GOAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__INTERNAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Root Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ROOT_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__RELATIONS = 4;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl <em>GORE Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGOREElement()
	 * @generated
	 */
	int GORE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__TIME = LTLPackage.OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__STATE = LTLPackage.OCL_ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__AWREQS = LTLPackage.OCL_ANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GORE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT_FEATURE_COUNT = LTLPackage.OCL_ANY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl <em>Goal Oriented Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoalOrientedRequirement()
	 * @generated
	 */
	int GOAL_ORIENTED_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__PARENT = GORE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__REFINEMENTS = GORE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal Oriented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.PerformativeRequirementImpl <em>Performative Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.PerformativeRequirementImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getPerformativeRequirement()
	 * @generated
	 */
	int PERFORMATIVE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__TIME = GOAL_ORIENTED_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__STATE = GOAL_ORIENTED_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__AWREQS = GOAL_ORIENTED_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE = GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__ASSUMPTIONS = GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__PARENT = GOAL_ORIENTED_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__REFINEMENTS = GOAL_ORIENTED_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__START_TIME = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Performative Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT_FEATURE_COUNT = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl <em>Hard Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getHardGoal()
	 * @generated
	 */
	int HARD_GOAL = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__TIME = PERFORMATIVE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__STATE = PERFORMATIVE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__AWREQS = PERFORMATIVE_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__REFINEMENT_TYPE = PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__ASSUMPTIONS = PERFORMATIVE_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__PARENT = PERFORMATIVE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__REFINEMENTS = PERFORMATIVE_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__START_TIME = PERFORMATIVE_REQUIREMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL__GOAL_MODEL = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hard Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GOAL_FEATURE_COUNT = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getSoftgoal()
	 * @generated
	 */
	int SOFTGOAL = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__TIME = GOAL_ORIENTED_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__STATE = GOAL_ORIENTED_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__AWREQS = GOAL_ORIENTED_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__REFINEMENT_TYPE = GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__ASSUMPTIONS = GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__PARENT = GOAL_ORIENTED_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__REFINEMENTS = GOAL_ORIENTED_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CONSTRAINTS = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_FEATURE_COUNT = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl <em>Quality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getQualityConstraint()
	 * @generated
	 */
	int QUALITY_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__TARGET = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl <em>Aw Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.AwReqImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getAwReq()
	 * @generated
	 */
	int AW_REQ = 7;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Increment Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__INCREMENT_COEFFICIENT = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__TARGET = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aw Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.DomainAssumptionImpl <em>Domain Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.DomainAssumptionImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDomainAssumption()
	 * @generated
	 */
	int DOMAIN_ASSUMPTION = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__PARENT = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.TaskImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 9;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIME = PERFORMATIVE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATE = PERFORMATIVE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AWREQS = PERFORMATIVE_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REFINEMENT_TYPE = PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSUMPTIONS = PERFORMATIVE_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = PERFORMATIVE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REFINEMENTS = PERFORMATIVE_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TIME = PERFORMATIVE_REQUIREMENT__START_TIME;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.ActorImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 10;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GOAL_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.ConfigurationImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__GOAL_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl <em>Differential Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDifferentialRelation()
	 * @generated
	 */
	int DIFFERENTIAL_RELATION = 12;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__LOWER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__UPPER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Differential Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.ParameterImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__METRIC = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.AggregationLevel <em>Aggregation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getAggregationLevel()
	 * @generated
	 */
	int AGGREGATION_LEVEL = 14;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.GOREElementState <em>GORE Element State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.GOREElementState
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGOREElementState()
	 * @generated
	 */
	int GORE_ELEMENT_STATE = 15;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator <em>Differential Relation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDifferentialRelationOperator()
	 * @generated
	 */
	int DIFFERENTIAL_RELATION_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.MonitorableMethod <em>Monitorable Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.MonitorableMethod
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getMonitorableMethod()
	 * @generated
	 */
	int MONITORABLE_METHOD = 17;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.ParameterMetric <em>Parameter Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameterMetric()
	 * @generated
	 */
	int PARAMETER_METRIC = 18;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.ParameterType
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 19;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.RefinementType <em>Refinement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getRefinementType()
	 * @generated
	 */
	int REFINEMENT_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.GoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel
	 * @generated
	 */
	EClass getGoalModel();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.GoalModel <em>Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Id</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel
	 * @see #getGoalModel()
	 * @generated
	 */
	EAttribute getGoalModel_InternalId();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getActors()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Actors();

	/**
	 * Returns the meta object for the containment reference '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal <em>Root Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Goal</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_RootGoal();

	/**
	 * Returns the meta object for the containment reference '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getConfiguration()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getRelations()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Relations();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.GOREElement <em>GORE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GORE Element</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElement
	 * @generated
	 */
	EClass getGOREElement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElement#getTime()
	 * @see #getGOREElement()
	 * @generated
	 */
	EAttribute getGOREElement_Time();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElement#getState()
	 * @see #getGOREElement()
	 * @generated
	 */
	EAttribute getGOREElement_State();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getAwreqs <em>Awreqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Awreqs</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElement#getAwreqs()
	 * @see #getGOREElement()
	 * @generated
	 */
	EReference getGOREElement_Awreqs();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement <em>Goal Oriented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Oriented Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement
	 * @generated
	 */
	EClass getGoalOrientedRequirement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement Type</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinementType()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EAttribute getGoalOrientedRequirement_RefinementType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getAssumptions()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EReference getGoalOrientedRequirement_Assumptions();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getParent()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EReference getGoalOrientedRequirement_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refinements</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinements()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EReference getGoalOrientedRequirement_Refinements();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement <em>Performative Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performative Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.PerformativeRequirement
	 * @generated
	 */
	EClass getPerformativeRequirement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getStartTime()
	 * @see #getPerformativeRequirement()
	 * @generated
	 */
	EAttribute getPerformativeRequirement_StartTime();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.HardGoal <em>Hard Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Goal</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.HardGoal
	 * @generated
	 */
	EClass getHardGoal();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.HardGoal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.HardGoal#getGoalModel()
	 * @see #getHardGoal()
	 * @generated
	 */
	EReference getHardGoal_GoalModel();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softgoal</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal
	 * @generated
	 */
	EClass getSoftgoal();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints()
	 * @see #getSoftgoal()
	 * @generated
	 */
	EReference getSoftgoal_Constraints();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint <em>Quality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Constraint</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint
	 * @generated
	 */
	EClass getQualityConstraint();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint#getTarget()
	 * @see #getQualityConstraint()
	 * @generated
	 */
	EReference getQualityConstraint_Target();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.AwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aw Req</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq
	 * @generated
	 */
	EClass getAwReq();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.AwReq#getIncrementCoefficient <em>Increment Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment Coefficient</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq#getIncrementCoefficient()
	 * @see #getAwReq()
	 * @generated
	 */
	EAttribute getAwReq_IncrementCoefficient();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.AwReq#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq#getTarget()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_Target();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.DomainAssumption <em>Domain Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Assumption</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DomainAssumption
	 * @generated
	 */
	EClass getDomainAssumption();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.DomainAssumption#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DomainAssumption#getParent()
	 * @see #getDomainAssumption()
	 * @generated
	 */
	EReference getDomainAssumption_Parent();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Actor#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Actor#getGoalModel()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_GoalModel();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.Configuration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Configuration#getParameters()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Configuration#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Configuration#getGoalModel()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_GoalModel();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation <em>Differential Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Differential Relation</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation
	 * @generated
	 */
	EClass getDifferentialRelation();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Indicator</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation#getIndicator()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EReference getDifferentialRelation_Indicator();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation#getParameter()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EReference getDifferentialRelation_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation#getLowerBound()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation#getUpperBound()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation#getOperator()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_Operator();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelation#getValue()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_Value();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.Parameter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getMetric()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Metric();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.AggregationLevel <em>Aggregation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Level</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @generated
	 */
	EEnum getAggregationLevel();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.GOREElementState <em>GORE Element State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GORE Element State</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElementState
	 * @generated
	 */
	EEnum getGOREElementState();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator <em>Differential Relation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Differential Relation Operator</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator
	 * @generated
	 */
	EEnum getDifferentialRelationOperator();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.MonitorableMethod <em>Monitorable Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitorable Method</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.MonitorableMethod
	 * @generated
	 */
	EEnum getMonitorableMethod();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.ParameterMetric <em>Parameter Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Metric</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
	 * @generated
	 */
	EEnum getParameterMetric();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.RefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refinement Type</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @generated
	 */
	EEnum getRefinementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GoreFactory getGoreFactory();

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
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoalModel()
		 * @generated
		 */
		EClass GOAL_MODEL = eINSTANCE.getGoalModel();

		/**
		 * The meta object literal for the '<em><b>Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__INTERNAL_ID = eINSTANCE.getGoalModel_InternalId();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ACTORS = eINSTANCE.getGoalModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Root Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ROOT_GOAL = eINSTANCE.getGoalModel_RootGoal();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__CONFIGURATION = eINSTANCE.getGoalModel_Configuration();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__RELATIONS = eINSTANCE.getGoalModel_Relations();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl <em>GORE Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGOREElement()
		 * @generated
		 */
		EClass GORE_ELEMENT = eINSTANCE.getGOREElement();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GORE_ELEMENT__TIME = eINSTANCE.getGOREElement_Time();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GORE_ELEMENT__STATE = eINSTANCE.getGOREElement_State();

		/**
		 * The meta object literal for the '<em><b>Awreqs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GORE_ELEMENT__AWREQS = eINSTANCE.getGOREElement_Awreqs();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl <em>Goal Oriented Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoalOrientedRequirement()
		 * @generated
		 */
		EClass GOAL_ORIENTED_REQUIREMENT = eINSTANCE.getGoalOrientedRequirement();

		/**
		 * The meta object literal for the '<em><b>Refinement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE = eINSTANCE.getGoalOrientedRequirement_RefinementType();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS = eINSTANCE.getGoalOrientedRequirement_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ORIENTED_REQUIREMENT__PARENT = eINSTANCE.getGoalOrientedRequirement_Parent();

		/**
		 * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ORIENTED_REQUIREMENT__REFINEMENTS = eINSTANCE.getGoalOrientedRequirement_Refinements();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.PerformativeRequirementImpl <em>Performative Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.PerformativeRequirementImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getPerformativeRequirement()
		 * @generated
		 */
		EClass PERFORMATIVE_REQUIREMENT = eINSTANCE.getPerformativeRequirement();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMATIVE_REQUIREMENT__START_TIME = eINSTANCE.getPerformativeRequirement_StartTime();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl <em>Hard Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getHardGoal()
		 * @generated
		 */
		EClass HARD_GOAL = eINSTANCE.getHardGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARD_GOAL__GOAL_MODEL = eINSTANCE.getHardGoal_GoalModel();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl <em>Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getSoftgoal()
		 * @generated
		 */
		EClass SOFTGOAL = eINSTANCE.getSoftgoal();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTGOAL__CONSTRAINTS = eINSTANCE.getSoftgoal_Constraints();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl <em>Quality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getQualityConstraint()
		 * @generated
		 */
		EClass QUALITY_CONSTRAINT = eINSTANCE.getQualityConstraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CONSTRAINT__TARGET = eINSTANCE.getQualityConstraint_Target();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl <em>Aw Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.AwReqImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getAwReq()
		 * @generated
		 */
		EClass AW_REQ = eINSTANCE.getAwReq();

		/**
		 * The meta object literal for the '<em><b>Increment Coefficient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AW_REQ__INCREMENT_COEFFICIENT = eINSTANCE.getAwReq_IncrementCoefficient();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__TARGET = eINSTANCE.getAwReq_Target();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.DomainAssumptionImpl <em>Domain Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.DomainAssumptionImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDomainAssumption()
		 * @generated
		 */
		EClass DOMAIN_ASSUMPTION = eINSTANCE.getDomainAssumption();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ASSUMPTION__PARENT = eINSTANCE.getDomainAssumption_Parent();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.TaskImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.ActorImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__GOAL_MODEL = eINSTANCE.getActor_GoalModel();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.ConfigurationImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PARAMETERS = eINSTANCE.getConfiguration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__GOAL_MODEL = eINSTANCE.getConfiguration_GoalModel();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl <em>Differential Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDifferentialRelation()
		 * @generated
		 */
		EClass DIFFERENTIAL_RELATION = eINSTANCE.getDifferentialRelation();

		/**
		 * The meta object literal for the '<em><b>Indicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENTIAL_RELATION__INDICATOR = eINSTANCE.getDifferentialRelation_Indicator();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENTIAL_RELATION__PARAMETER = eINSTANCE.getDifferentialRelation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__LOWER_BOUND = eINSTANCE.getDifferentialRelation_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__UPPER_BOUND = eINSTANCE.getDifferentialRelation_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__OPERATOR = eINSTANCE.getDifferentialRelation_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__VALUE = eINSTANCE.getDifferentialRelation_Value();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.ParameterImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CONFIGURATION = eINSTANCE.getParameter_Configuration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__METRIC = eINSTANCE.getParameter_Metric();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.AggregationLevel <em>Aggregation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getAggregationLevel()
		 * @generated
		 */
		EEnum AGGREGATION_LEVEL = eINSTANCE.getAggregationLevel();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.GOREElementState <em>GORE Element State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.GOREElementState
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGOREElementState()
		 * @generated
		 */
		EEnum GORE_ELEMENT_STATE = eINSTANCE.getGOREElementState();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator <em>Differential Relation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDifferentialRelationOperator()
		 * @generated
		 */
		EEnum DIFFERENTIAL_RELATION_OPERATOR = eINSTANCE.getDifferentialRelationOperator();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.MonitorableMethod <em>Monitorable Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.MonitorableMethod
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getMonitorableMethod()
		 * @generated
		 */
		EEnum MONITORABLE_METHOD = eINSTANCE.getMonitorableMethod();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.ParameterMetric <em>Parameter Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameterMetric()
		 * @generated
		 */
		EEnum PARAMETER_METRIC = eINSTANCE.getParameterMetric();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.ParameterType
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.RefinementType <em>Refinement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.RefinementType
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getRefinementType()
		 * @generated
		 */
		EEnum REFINEMENT_TYPE = eINSTANCE.getRefinementType();

	}

} //GorePackage
