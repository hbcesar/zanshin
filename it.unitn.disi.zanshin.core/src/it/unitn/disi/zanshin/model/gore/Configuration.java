/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Configuration#getParameters <em>Parameters</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Configuration#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.Parameter}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration <em>Configuration</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getConfiguration_Parameters()
	 * @see it.unitn.disi.zanshin.model.gore.Parameter#getConfiguration
	 * @model opposite="configuration" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' container reference. It is bidirectional and its opposite is
	 * '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getConfiguration <em>Configuration</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Goal Model</em>' container reference.
	 * @see #setGoalModel(GoalModel)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getConfiguration_GoalModel()
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getConfiguration
	 * @model opposite="configuration" transient="false"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Configuration#getGoalModel <em>Goal Model</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Goal Model</em>' container reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);
} // Configuration
