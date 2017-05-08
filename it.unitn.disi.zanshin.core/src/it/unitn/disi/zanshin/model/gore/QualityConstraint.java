/**
 */
package it.unitn.disi.zanshin.model.gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getQualityConstraint()
 * @model
 * @generated
 */
public interface QualityConstraint extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Softgoal)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getQualityConstraint_Parent()
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	Softgoal getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Softgoal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Performs the replacement as a normal requirement first.\r\nsuper.replaceWith(newRequirement);\r\n\t\t\r\n// Then, replace the relationship quality constraints have with softgoals.\r\nit.unitn.disi.zanshin.model.gore.Softgoal softgoal = getParent();\r\nsetParent(null);\r\n((QualityConstraint) newRequirement).setParent(softgoal);'"
	 * @generated
	 */
	void replaceWith(GoalOrientedRequirement newRequirement);

} // QualityConstraint
