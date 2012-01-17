/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getQualityConstraint()
 * @model
 * @generated
 */
public interface QualityConstraint extends DefinableRequirement {
	/**
	 * Returns the value of the '<em><b>Softgoal</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softgoal</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softgoal</em>' container reference.
	 * @see #setSoftgoal(Softgoal)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getQualityConstraint_Softgoal()
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	Softgoal getSoftgoal();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Softgoal</em>' container reference.
	 * @see #getSoftgoal()
	 * @generated
	 */
	void setSoftgoal(Softgoal value);

} // QualityConstraint
