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
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getParent <em>Parent</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getChildren <em>Children</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalOrientedRequirement()
 * @model
 * @generated
 */
public interface GoalOrientedRequirement extends GOREElement {
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
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalOrientedRequirement_Children()
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<GoalOrientedRequirement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(GoalOrientedRequirement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGoalOrientedRequirement_Parent()
	 * @see it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	GoalOrientedRequirement getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GoalOrientedRequirement value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of defineable children.\nint[] stateCount = new int[it.unitn.disi.zanshin.model.gore.DefinableRequirementState.VALUES.size()];\nint defChildrenCount = 0;\nfor (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren()) {\n\tif (child instanceof DefinableRequirement) {\n\t\tdefChildrenCount++;\n\t\tstateCount[((DefinableRequirement) child).getState().getValue()]++;\n\t}\n}\n\n// Converts to EList so we can return, adding the total number of definable children to the last position.\nEList<Integer> stateCountList = new org.eclipse.emf.common.util.BasicEList<>();\nfor (int count : stateCount)\n\tstateCountList.add(count);\nstateCountList.add(defChildrenCount);\nreturn stateCountList;'"
	 * @generated
	 */
	EList<Integer> getChildrenStateCount();

} // GoalOrientedRequirement
