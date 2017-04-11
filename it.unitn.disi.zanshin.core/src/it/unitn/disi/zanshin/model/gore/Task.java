/**
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends PerformativeRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();\r\nEList<GOREElement> awreqs_da = (EList<GOREElement>) super.getChildren();\r\nEList<Task> tasks = this.getTasks();\r\n\t\t\t\t\r\nfor(GOREElement child : awreqs_da){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\r\nfor(GOREElement child : tasks){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\r\nreturn children;'"
	 * @generated
	 */
	EList<GOREElement> getChildren();

} // Task
