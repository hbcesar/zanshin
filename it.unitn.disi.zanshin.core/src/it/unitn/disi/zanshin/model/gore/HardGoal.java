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
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getHardGoal()
 * @model
 * @generated
 */
public interface HardGoal extends PerformativeRequirement, Goal {
	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' reference.
	 * @see #setGoalModel(GoalModel)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getHardGoal_GoalModel()
	 * @model
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.HardGoal#getGoalModel <em>Goal Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();\r\nEList<GOREElement> awreqs_da = (EList<GOREElement>) super.getChildren();\r\nEList<Task> tasks = super.getTasks();\r\nEList<Goal> goals = getRefinements();\r\n\t\t\t\t\t\t\t\t\r\nfor(GOREElement child : awreqs_da){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\t\t\t\t\r\nfor(GOREElement child : tasks){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\r\nfor(Goal child : goals){\r\n\tchildren.add((GOREElement) child);\r\n}\r\n\t\t\t\t\t\t\t\t\r\nreturn children;'"
	 * @generated
	 */
	EList<GOREElement> getChildren();

} // HardGoal
