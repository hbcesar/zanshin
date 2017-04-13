/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Oriented Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalOrientedRequirement()
 * @model
 * @generated
 */
public interface GoalOrientedRequirement extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.DomainAssumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalOrientedRequirement_Assumptions()
	 * @model
	 * @generated
	 */
	EList<DomainAssumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Refinement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.RefinementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see #setRefinementType(RefinementType)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalOrientedRequirement_RefinementType()
	 * @model
	 * @generated
	 */
	RefinementType getRefinementType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see #getRefinementType()
	 * @generated
	 */
	void setRefinementType(RefinementType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();\r\nEList<AwReq> awreqs = super.getAwreqs();\r\nEList<DomainAssumption> domainAssumptions = this.getAssumptions();\r\n\t\t\t\t\r\nfor(GOREElement child : awreqs){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\r\nfor(GOREElement child : domainAssumptions){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\r\nreturn children;'"
	 * @generated
	 */
	EList<GOREElement> getChildren();

} // GoalOrientedRequirement
