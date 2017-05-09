/**
 */
package it.unitn.disi.zanshin.model.gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DomainAssumption#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDomainAssumption()
 * @model
 * @generated
 */
public interface DomainAssumption extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(GoalOrientedRequirement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDomainAssumption_Parent()
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getAssumptions
	 * @model opposite="assumptions" required="true" transient="false"
	 * @generated
	 */
	GoalOrientedRequirement getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DomainAssumption#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GoalOrientedRequirement value);

} // DomainAssumption
