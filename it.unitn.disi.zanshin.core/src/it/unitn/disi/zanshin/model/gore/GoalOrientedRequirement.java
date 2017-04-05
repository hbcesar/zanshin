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

} // GoalOrientedRequirement
