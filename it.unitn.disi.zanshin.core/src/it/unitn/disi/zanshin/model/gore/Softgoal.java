/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Softgoal</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Softgoal#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getSoftgoal()
 * @model
 * @generated
 */
public interface Softgoal extends Requirement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.QualityConstraint}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getSoftgoal_Constraints()
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal
	 * @model opposite="softgoal" containment="true"
	 * @generated
	 */
	EList<QualityConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getSoftgoals <em>Softgoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' container reference.
	 * @see #setGoalModel(GoalModel)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getSoftgoal_GoalModel()
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getSoftgoals
	 * @model opposite="softgoals" transient="false"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Softgoal#getGoalModel <em>Goal Model</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' container reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Performs the replacement as a normal requirement first.\nsuper.replaceWith(newRequirement);\n\n// Then, replace the relationship softgoals have with the goal model.\nit.unitn.disi.zanshin.model.gore.GoalModel model = getGoalModel();\nsetGoalModel(null);\n((Softgoal) newRequirement).setGoalModel(model);'"
	 * @generated
	 */
	void replaceWith(Requirement newRequirement);

} // Softgoal
