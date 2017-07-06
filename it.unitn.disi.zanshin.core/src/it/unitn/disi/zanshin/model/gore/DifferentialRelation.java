/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Differential Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getOperator <em>Operator</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getValue <em>Value</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation()
 * @model
 * @generated
 */
public interface DifferentialRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator</em>' reference.
	 * @see #setIndicator(AwReq)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_Indicator()
	 * @model
	 * @generated
	 */
	AwReq getIndicator();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getIndicator <em>Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' reference.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(AwReq value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_LowerBound()
	 * @model
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_UpperBound()
	 * @model
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator
	 * @see #setOperator(DifferentialRelationOperator)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_Operator()
	 * @model
	 * @generated
	 */
	DifferentialRelationOperator getOperator();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(DifferentialRelationOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_Value()
	 * @model default="0.0"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Internal ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal ID</em>' attribute.
	 * @see #setInternalID(Integer)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelation_InternalID()
	 * @model default="0" id="true"
	 * @generated
	 */
	Integer getInternalID();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.DifferentialRelation#getInternalID <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal ID</em>' attribute.
	 * @see #getInternalID()
	 * @generated
	 */
	void setInternalID(Integer value);

} // DifferentialRelation
