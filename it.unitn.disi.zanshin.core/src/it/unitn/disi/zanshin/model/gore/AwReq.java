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
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getIncrementCoefficient <em>Increment Coefficient</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq()
 * @model
 * @generated
 */
public interface AwReq extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GOREElement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq_Target()
	 * @model required="true"
	 * @generated
	 */
	GOREElement getTarget();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.AwReq#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GOREElement value);

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
