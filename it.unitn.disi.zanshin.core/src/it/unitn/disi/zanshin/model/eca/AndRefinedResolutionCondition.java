/**
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Refined Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.AndRefinedResolutionCondition#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAndRefinedResolutionCondition()
 * @model
 * @generated
 */
public interface AndRefinedResolutionCondition extends ResolutionCondition {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.eca.ResolutionCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAndRefinedResolutionCondition_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResolutionCondition> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// The problem is solved if all children evaluate to true, i.e., if any of them is false, it is not solved.\nfor (it.unitn.disi.zanshin.model.eca.ResolutionCondition condition : getChildren())\n\tif (! condition.evaluate(session)) return false;\n\n// If none of them were false, then the problem is solved.\nreturn true;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // AndRefinedResolutionCondition
