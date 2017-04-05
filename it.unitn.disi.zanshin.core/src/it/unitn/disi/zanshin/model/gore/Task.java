/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Task#getDecompositions <em>Decompositions</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends PerformativeRequirement {

	/**
	 * Returns the value of the '<em><b>Decompositions</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decompositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decompositions</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getTask_Decompositions()
	 * @model
	 * @generated
	 */
	EList<Task> getDecompositions();
} // Task
