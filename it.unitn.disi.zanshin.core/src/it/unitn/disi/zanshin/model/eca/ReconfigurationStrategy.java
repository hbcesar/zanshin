/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationStrategy()
 * @model
 * @generated
 */
public interface ReconfigurationStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Algorithm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Id</em>' attribute.
	 * @see #setAlgorithmId(String)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationStrategy_AlgorithmId()
	 * @model
	 * @generated
	 */
	String getAlgorithmId();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Id</em>' attribute.
	 * @see #getAlgorithmId()
	 * @generated
	 */
	void setAlgorithmId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String strategyName = getClass().getInterfaces()[0].getSimpleName();\n\n'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // ReconfigurationStrategy
