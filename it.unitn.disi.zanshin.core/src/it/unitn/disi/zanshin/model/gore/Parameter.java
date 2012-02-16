/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getUnit <em>Unit</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Parameter#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.Configuration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Configuration()
	 * @see it.unitn.disi.zanshin.model.gore.Configuration#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"VP"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterType
	 * @see #setType(ParameterType)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Type()
	 * @model default="VP" required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The default value is <code>"Enumerated"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.ParameterMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
	 * @see #setMetric(ParameterMetric)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getParameter_Metric()
	 * @model default="Enumerated" required="true"
	 * @generated
	 */
	ParameterMetric getMetric();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Parameter#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.ParameterMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ParameterMetric value);

} // Parameter
