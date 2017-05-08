/**
 */
package it.unitn.disi.zanshin.model.gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getParent <em>Parent</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getIncrementCoefficient <em>Increment Coefficient</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq()
 * @model
 * @generated
 */
public interface AwReq extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getAwreqs <em>Awreqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(GOREElement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq_Parent()
	 * @see it.unitn.disi.zanshin.model.gore.GOREElement#getAwreqs
	 * @model opposite="awreqs" required="true"
	 * @generated
	 */
	GOREElement getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.AwReq#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GOREElement value);

	/**
	 * Returns the value of the '<em><b>Increment Coefficient</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Coefficient</em>' attribute.
	 * @see #setIncrementCoefficient(double)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq_IncrementCoefficient()
	 * @model default="1.0"
	 * @generated
	 */
	double getIncrementCoefficient();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.AwReq#getIncrementCoefficient <em>Increment Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Coefficient</em>' attribute.
	 * @see #getIncrementCoefficient()
	 * @generated
	 */
	void setIncrementCoefficient(double value);

} // AwReq
