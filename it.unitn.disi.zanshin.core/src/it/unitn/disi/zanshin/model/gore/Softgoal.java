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
public interface Softgoal extends GoalOrientedRequirement, Goal {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.QualityConstraint}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getSoftgoal_Constraints()
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint#getSoftgoal
	 * @model opposite="softgoal"
	 * @generated
	 */
	EList<QualityConstraint> getConstraints();

} // Softgoal
