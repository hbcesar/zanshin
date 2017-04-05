/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.zanshin.model.gore.GorePackage
 * @generated
 */
public interface GoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoreFactory eINSTANCE = it.unitn.disi.zanshin.model.gore.impl.GoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GORE Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GORE Element</em>'.
	 * @generated
	 */
	GOREElement createGOREElement();

	/**
	 * Returns a new object of class '<em>Goal Oriented Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Oriented Requirement</em>'.
	 * @generated
	 */
	GoalOrientedRequirement createGoalOrientedRequirement();

	/**
	 * Returns a new object of class '<em>Performative Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performative Requirement</em>'.
	 * @generated
	 */
	PerformativeRequirement createPerformativeRequirement();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Hard Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hard Goal</em>'.
	 * @generated
	 */
	HardGoal createHardGoal();

	/**
	 * Returns a new object of class '<em>Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Softgoal</em>'.
	 * @generated
	 */
	Softgoal createSoftgoal();

	/**
	 * Returns a new object of class '<em>Quality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Constraint</em>'.
	 * @generated
	 */
	QualityConstraint createQualityConstraint();

	/**
	 * Returns a new object of class '<em>Aw Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aw Req</em>'.
	 * @generated
	 */
	AwReq createAwReq();

	/**
	 * Returns a new object of class '<em>Domain Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Assumption</em>'.
	 * @generated
	 */
	DomainAssumption createDomainAssumption();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Differential Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Differential Relation</em>'.
	 * @generated
	 */
	DifferentialRelation createDifferentialRelation();

	/**
	 * Returns a new object of class '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Model</em>'.
	 * @generated
	 */
	GoalModel createGoalModel();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GorePackage getGorePackage();

} //GoreFactory
