/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Actor#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' container reference.
	 * @see #setGoalModel(GoalModel)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getActor_GoalModel()
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getActors
	 * @model opposite="actors" transient="false"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Actor#getGoalModel <em>Goal Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' container reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

} // Actor
