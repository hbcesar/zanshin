/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Simple Resolution Condition</b></em>'. <!--
 * end-user-doc -->
 * 
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getSimpleResolutionCondition()
 * @model
 * @generated
 */
public interface SimpleResolutionCondition extends ResolutionCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Retrieves the last AwReq that was evaluated. If not directly related, get from the event list. \nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\norg.eclipse.emf.common.util.EList<it.unitn.disi.zanshin.model.eca.Event> events = session.getEvents();\nif ((awreq == null) && (events.size() > 0))\n\tawreq = events.get(events.size() - 1).getAwReq();\n\n// If the current evaluation is Success, the problem is solved.\nif ((awreq != null) && (awreq.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED))\n\treturn true;\n\n// Otherwise, if the last applied strategy was \"abort\", the problem is also solved.\nelse if (events.size() > 0) {\n\tit.unitn.disi.zanshin.model.eca.Event lastEvent = events.get(events.size() - 1);\n\tit.unitn.disi.zanshin.model.eca.EcaAwReq lastAwReq = (lastEvent == null) ? null : lastEvent.getAwReq();\n\tit.unitn.disi.zanshin.model.eca.AdaptationStrategy lastStrategy = (lastAwReq == null) ? null : lastAwReq.getSelectedStrategy();\n\tif ((lastStrategy != null) && (it.unitn.disi.zanshin.model.eca.EcaPackage.eINSTANCE.getAbortStrategy().isInstance(lastStrategy)))\n\t\treturn true;\n}\n\n// If none of the above, the problem is not yet solved.\nreturn false;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // SimpleResolutionCondition
