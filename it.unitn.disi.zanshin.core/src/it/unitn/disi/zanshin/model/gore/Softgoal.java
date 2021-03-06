/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Softgoal#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getSoftgoal()
 * @model
 * @generated
 */
public interface Softgoal extends GoalOrientedRequirement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.QualityConstraint}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getSoftgoal_Constraints()
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<QualityConstraint> getConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();\r\nEList<GOREElement> awreqs_da = (EList<GOREElement>) super.getChildren();\r\nEList<QualityConstraint> qc = this.getConstraints();\r\nEList<it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement> goals = getRefinements();\r\n\t\t\t\t\t\t\t\t\r\nfor(GOREElement child : awreqs_da){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\t\t\t\t\r\nfor(GOREElement child : qc){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\r\nfor(it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement child : goals){\r\n\tchildren.add((GOREElement) child);\r\n}\r\n\t\t\t\t\t\t\t\t\r\nreturn children;'"
	 * @generated
	 */
	EList<GOREElement> getChildren();

} // Softgoal
