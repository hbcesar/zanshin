/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
	String eNAME = "gore"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zanshin.disi.unitn.it/1.0/core"; //$NON-NLS-1$

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
	GorePackage eINSTANCE = it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.RequirementImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINEMENT_TYPE = LTLPackage.OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILDREN = LTLPackage.OCL_ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT = LTLPackage.OCL_ANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = LTLPackage.OCL_ANY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.DefinableRequirementImpl <em>Definable Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.DefinableRequirementImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDefinableRequirement()
	 * @generated
	 */
	int DEFINABLE_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_REQUIREMENT__REFINEMENT_TYPE = REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_REQUIREMENT__CHILDREN = REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_REQUIREMENT__PARENT = REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_REQUIREMENT__TIME = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_REQUIREMENT__STATE = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definable Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getSoftgoal()
	 * @generated
	 */
	int SOFTGOAL = 2;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__REFINEMENT_TYPE = REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CHILDREN = REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__PARENT = REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CONSTRAINTS = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__GOAL_MODEL = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE = DEFINABLE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__CHILDREN = DEFINABLE_REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__PARENT = DEFINABLE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__TIME = DEFINABLE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__STATE = DEFINABLE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__START_TIME = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Performative Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT_FEATURE_COUNT = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl <em>Quality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getQualityConstraint()
	 * @generated
	 */
	int QUALITY_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__REFINEMENT_TYPE = DEFINABLE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__CHILDREN = DEFINABLE_REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__PARENT = DEFINABLE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__TIME = DEFINABLE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__STATE = DEFINABLE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__SOFTGOAL = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT_FEATURE_COUNT = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl <em>Aw Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.AwReqImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getAwReq()
	 * @generated
	 */
	int AW_REQ = 5;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__REFINEMENT_TYPE = DEFINABLE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__CHILDREN = DEFINABLE_REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__PARENT = DEFINABLE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__TIME = DEFINABLE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__STATE = DEFINABLE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__OTHER_TARGETS = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__TARGET = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__GOAL_MODEL = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aw Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ_FEATURE_COUNT = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.DomainAssumptionImpl <em>Domain Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.DomainAssumptionImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDomainAssumption()
	 * @generated
	 */
	int DOMAIN_ASSUMPTION = 6;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__REFINEMENT_TYPE = DEFINABLE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__CHILDREN = DEFINABLE_REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__PARENT = DEFINABLE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__TIME = DEFINABLE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__STATE = DEFINABLE_REQUIREMENT__STATE;

	/**
	 * The number of structural features of the '<em>Domain Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION_FEATURE_COUNT = DEFINABLE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.GoalImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 7;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__REFINEMENT_TYPE = PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CHILDREN = PERFORMATIVE_REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT = PERFORMATIVE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TIME = PERFORMATIVE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__STATE = PERFORMATIVE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__START_TIME = PERFORMATIVE_REQUIREMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_MODEL = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.TaskImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 8;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REFINEMENT_TYPE = PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CHILDREN = PERFORMATIVE_REQUIREMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = PERFORMATIVE_REQUIREMENT__PARENT;

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
	int ACTOR = 9;

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
	int CONFIGURATION = 10;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoalModel()
	 * @generated
	 */
	int GOAL_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Root Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ROOT_GOAL = 0;

	/**
	 * The feature id for the '<em><b>Softgoals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__SOFTGOALS = 1;

	/**
	 * The feature id for the '<em><b>Aw Reqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__AW_REQS = 2;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ACTORS = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__INTERNAL_ID = 5;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.ParameterImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GOAL_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.impl.ReconfigurationAlgorithmImpl <em>Reconfiguration Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.impl.ReconfigurationAlgorithmImpl
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getReconfigurationAlgorithm()
	 * @generated
	 */
	int RECONFIGURATION_ALGORITHM = 13;

	/**
	 * The number of structural features of the '<em>Reconfiguration Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ALGORITHM_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirementState <em>Definable Requirement State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirementState
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDefinableRequirementState()
	 * @generated
	 */
	int DEFINABLE_REQUIREMENT_STATE = 15;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.MonitorableMethod <em>Monitorable Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.MonitorableMethod
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getMonitorableMethod()
	 * @generated
	 */
	int MONITORABLE_METHOD = 16;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.model.gore.RefinementType <em>Refinement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getRefinementType()
	 * @generated
	 */
	int REFINEMENT_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.Requirement#getRefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement Type</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getRefinementType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RefinementType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.Requirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getChildren()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Children();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getParent()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Parent();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement <em>Definable Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definable Requirement</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirement
	 * @generated
	 */
	EClass getDefinableRequirement();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirement#getTime()
	 * @see #getDefinableRequirement()
	 * @generated
	 */
	EAttribute getDefinableRequirement_Time();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirement#getState()
	 * @see #getDefinableRequirement()
	 * @generated
	 */
	EAttribute getDefinableRequirement_State();

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
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Softgoal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal#getGoalModel()
	 * @see #getSoftgoal()
	 * @generated
	 */
	EReference getSoftgoal_GoalModel();

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
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint <em>Quality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Constraint</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint
	 * @generated
	 */
	EClass getQualityConstraint();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Softgoal</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal()
	 * @see #getQualityConstraint()
	 * @generated
	 */
	EReference getQualityConstraint_Softgoal();

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
	 * Returns the meta object for the reference list '{@link it.unitn.disi.zanshin.model.gore.AwReq#getOtherTargets <em>Other Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Other Targets</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq#getOtherTargets()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_OtherTargets();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.zanshin.model.gore.AwReq#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq#getTarget()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_Target();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.AwReq#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq#getGoalModel()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_GoalModel();

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
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Goal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Goal#getGoalModel()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_GoalModel();

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
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.GoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel
	 * @generated
	 */
	EClass getGoalModel();

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
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getSoftgoals <em>Softgoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Softgoals</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getSoftgoals()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Softgoals();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getAwReqs <em>Aw Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aw Reqs</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getAwReqs()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_AwReqs();

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
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getParameters()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Parameters();

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
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link it.unitn.disi.zanshin.model.gore.Parameter#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getGoalModel()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_GoalModel();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.model.gore.ReconfigurationAlgorithm <em>Reconfiguration Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Algorithm</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.ReconfigurationAlgorithm
	 * @generated
	 */
	EClass getReconfigurationAlgorithm();

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
	 * Returns the meta object for enum '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirementState <em>Definable Requirement State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definable Requirement State</em>'.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirementState
	 * @generated
	 */
	EEnum getDefinableRequirementState();

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
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.RequirementImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Refinement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REFINEMENT_TYPE = eINSTANCE.getRequirement_RefinementType();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CHILDREN = eINSTANCE.getRequirement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARENT = eINSTANCE.getRequirement_Parent();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.DefinableRequirementImpl <em>Definable Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.DefinableRequirementImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDefinableRequirement()
		 * @generated
		 */
		EClass DEFINABLE_REQUIREMENT = eINSTANCE.getDefinableRequirement();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINABLE_REQUIREMENT__TIME = eINSTANCE.getDefinableRequirement_Time();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINABLE_REQUIREMENT__STATE = eINSTANCE.getDefinableRequirement_State();

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
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTGOAL__GOAL_MODEL = eINSTANCE.getSoftgoal_GoalModel();

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
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl <em>Quality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getQualityConstraint()
		 * @generated
		 */
		EClass QUALITY_CONSTRAINT = eINSTANCE.getQualityConstraint();

		/**
		 * The meta object literal for the '<em><b>Softgoal</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CONSTRAINT__SOFTGOAL = eINSTANCE.getQualityConstraint_Softgoal();

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
		 * The meta object literal for the '<em><b>Other Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__OTHER_TARGETS = eINSTANCE.getAwReq_OtherTargets();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__TARGET = eINSTANCE.getAwReq_Target();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__GOAL_MODEL = eINSTANCE.getAwReq_GoalModel();

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
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.GoalImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_MODEL = eINSTANCE.getGoal_GoalModel();

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
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getGoalModel()
		 * @generated
		 */
		EClass GOAL_MODEL = eINSTANCE.getGoalModel();

		/**
		 * The meta object literal for the '<em><b>Root Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ROOT_GOAL = eINSTANCE.getGoalModel_RootGoal();

		/**
		 * The meta object literal for the '<em><b>Softgoals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__SOFTGOALS = eINSTANCE.getGoalModel_Softgoals();

		/**
		 * The meta object literal for the '<em><b>Aw Reqs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__AW_REQS = eINSTANCE.getGoalModel_AwReqs();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ACTORS = eINSTANCE.getGoalModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__PARAMETERS = eINSTANCE.getGoalModel_Parameters();

		/**
		 * The meta object literal for the '<em><b>Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__INTERNAL_ID = eINSTANCE.getGoalModel_InternalId();

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
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__GOAL_MODEL = eINSTANCE.getParameter_GoalModel();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.impl.ReconfigurationAlgorithmImpl <em>Reconfiguration Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.impl.ReconfigurationAlgorithmImpl
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getReconfigurationAlgorithm()
		 * @generated
		 */
		EClass RECONFIGURATION_ALGORITHM = eINSTANCE.getReconfigurationAlgorithm();

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
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirementState <em>Definable Requirement State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirementState
		 * @see it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl#getDefinableRequirementState()
		 * @generated
		 */
		EEnum DEFINABLE_REQUIREMENT_STATE = eINSTANCE.getDefinableRequirementState();

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
