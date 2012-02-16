/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Aw Req</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition <em>Condition</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getSelectedStrategy <em>Selected Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEcaAwReq()
 * @model
 * @generated
 */
public interface EcaAwReq extends AwReq {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ResolutionCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEcaAwReq_Condition()
	 * @see it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq
	 * @model opposite="awReq" containment="true"
	 * @generated
	 */
	ResolutionCondition getCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ResolutionCondition value);

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEcaAwReq_Strategies()
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq
	 * @model opposite="awReq" containment="true"
	 * @generated
	 */
	EList<AdaptationStrategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Strategy</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Strategy</em>' reference.
	 * @see #setSelectedStrategy(AdaptationStrategy)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEcaAwReq_SelectedStrategy()
	 * @model
	 * @generated
	 */
	AdaptationStrategy getSelectedStrategy();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getSelectedStrategy <em>Selected Strategy</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Strategy</em>' reference.
	 * @see #getSelectedStrategy()
	 * @generated
	 */
	void setSelectedStrategy(AdaptationStrategy value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Performs the replacement as a normal AwReq first.\nsuper.replaceWith(newRequirement);\n\n// Then, instructs each adaptation strategy to update their own references after the change.\nfor (AdaptationStrategy strategy : ((EcaAwReq) newRequirement).getStrategies())\n\tstrategy.updateReferences();'"
	 * @generated
	 */
	void replaceWith(Requirement newRequirement);

} // EcaAwReq
