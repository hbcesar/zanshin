/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hard Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.HardGoal#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.HardGoal#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getHardGoal()
 * @model
 * @generated
 */
public interface HardGoal extends PerformativeRequirement {
	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal <em>Root Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' container reference.
	 * @see #setGoalModel(GoalModel)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getHardGoal_GoalModel()
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getRootGoal
	 * @model opposite="rootGoal" transient="false"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.HardGoal#getGoalModel <em>Goal Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' container reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getHardGoal_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

} // HardGoal
