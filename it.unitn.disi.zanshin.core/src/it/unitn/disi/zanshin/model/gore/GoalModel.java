/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Goal Model</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal <em>Root Goal</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getSoftgoals <em>Softgoals</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getAwReqs <em>Aw Reqs</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getActors <em>Actors</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.GoalModel#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel()
 * @model features="internalId" internalIdDataType="org.eclipse.emf.ecore.ELongObject" internalIdChangeable="false"
 *        internalIdSuppressedGetVisibility="true"
 * @generated
 */
public interface GoalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Goal</b></em>' containment reference. It is bidirectional and its opposite is
	 * '{@link it.unitn.disi.zanshin.model.gore.Goal#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Goal</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Goal</em>' containment reference.
	 * @see #setRootGoal(Goal)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_RootGoal()
	 * @see it.unitn.disi.zanshin.model.gore.Goal#getGoalModel
	 * @model opposite="goalModel" containment="true" required="true"
	 * @generated
	 */
	Goal getRootGoal();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal <em>Root Goal</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Root Goal</em>' containment reference.
	 * @see #getRootGoal()
	 * @generated
	 */
	void setRootGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Softgoals</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.Softgoal}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Softgoal#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softgoals</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Softgoals</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_Softgoals()
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal#getGoalModel
	 * @model opposite="goalModel" containment="true"
	 * @generated
	 */
	EList<Softgoal> getSoftgoals();

	/**
	 * Returns the value of the '<em><b>Aw Reqs</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.AwReq}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.AwReq#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aw Reqs</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aw Reqs</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_AwReqs()
	 * @see it.unitn.disi.zanshin.model.gore.AwReq#getGoalModel
	 * @model opposite="goalModel" containment="true"
	 * @generated
	 */
	EList<AwReq> getAwReqs();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.Actor}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Actor#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_Actors()
	 * @see it.unitn.disi.zanshin.model.gore.Actor#getGoalModel
	 * @model opposite="goalModel" containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.Parameter}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Parameter#getGoalModel <em>Goal Model</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalModel_Parameters()
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getGoalModel
	 * @model opposite="goalModel" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='if (internalId == null) internalId = System.currentTimeMillis();\nreturn internalId;'"
	 * @generated
	 */
	Long getId();

} // GoalModel
