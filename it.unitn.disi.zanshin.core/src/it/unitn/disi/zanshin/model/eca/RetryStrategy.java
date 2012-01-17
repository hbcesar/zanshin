/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRetryStrategy()
 * @model
 * @generated
 */
public interface RetryStrategy extends AdaptationStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"############ Retry Strategy being applied!!!\");'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // RetryStrategy
