/**
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getSimpleResolutionCondition()
 * @model
 * @generated
 */
public interface SimpleResolutionCondition extends ResolutionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Retrieves the last AwReq that was evaluated. If not directly related, get from the event list. \r\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\r\norg.eclipse.emf.common.util.EList<it.unitn.disi.zanshin.model.eca.Event> events = session.getEvents();\r\nif ((awreq == null) && (events.size() > 0))\r\n\tawreq = events.get(events.size() - 1).getAwReq();\r\n\r\n// If the current evaluation is Success, the problem is solved.\r\nif ((awreq != null) && (awreq.getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.SUCCEEDED))\r\n\treturn true;\r\n\r\n// Otherwise, if the last applied strategy was \"abort\", the problem is also solved.\r\nelse if (events.size() > 0) {\r\n\tit.unitn.disi.zanshin.model.eca.Event lastEvent = events.get(events.size() - 1);\r\n\tit.unitn.disi.zanshin.model.eca.EcaAwReq lastAwReq = (lastEvent == null) ? null : lastEvent.getAwReq();\r\n\tit.unitn.disi.zanshin.model.eca.AdaptationStrategy lastStrategy = (lastAwReq == null) ? null : lastAwReq.getSelectedStrategy();\r\n\tif ((lastStrategy != null) && (it.unitn.disi.zanshin.model.eca.EcaPackage.eINSTANCE.getAbortStrategy().isInstance(lastStrategy)))\r\n\t\treturn true;\r\n}\r\n\r\n// If none of the above, the problem is not yet solved.\r\nreturn false;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // SimpleResolutionCondition
