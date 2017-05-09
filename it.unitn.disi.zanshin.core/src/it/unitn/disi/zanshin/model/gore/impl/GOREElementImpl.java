/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.GOREElementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eeat.model.LTL.impl.OclAnyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GORE Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl#getTime <em>Time</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl#getState <em>State</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GOREElementImpl#getAwreqs <em>Awreqs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GOREElementImpl extends OclAnyImpl implements GOREElement {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final GOREElementState STATE_EDEFAULT = GOREElementState.UNDEFINED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected GOREElementState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAwreqs() <em>Awreqs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwreqs()
	 * @generated
	 * @ordered
	 */
	protected EList<AwReq> awreqs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GOREElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GORE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GORE_ELEMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElementState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(GOREElementState newState) {
		GOREElementState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GORE_ELEMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AwReq> getAwreqs() {
		if (awreqs == null) {
			awreqs = new EObjectContainmentWithInverseEList<AwReq>(AwReq.class, this, GorePackage.GORE_ELEMENT__AWREQS, GorePackage.AW_REQ__PARENT);
		}
		return awreqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement started: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		setState(it.unitn.disi.zanshin.model.gore.GOREElementState.STARTED);
						
		// If the monitoring service is active, warn it that this requirement has been started.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.START);
						
		// Propagate the start to the parent.
		it.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();
		if ((parent != null) && (((GOREElement) parent).getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.UNDEFINED))
			((GOREElement) parent).start();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void end() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement ended: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				
		// If the monitoring service is active, warn it that this requirement has ended.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void success() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement succeeded: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		setState(it.unitn.disi.zanshin.model.gore.GOREElementState.SUCCEEDED);
						
		// If the monitoring service is active, warn it that this requirement has been successful.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.SUCCESS);
						
		// If the requirement is successful, then it has also ended.
		end();
						
		// Propagate the success to the parent, depending on the type of refinement.
		it.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();
		if ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement)) {
			it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement p = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;
			if (p.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR) ((GOREElement) parent).success();
			else ((GOREElement)parent).checkState();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fail() {
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Requirement failed: " + eClass().getName() + " (" + this + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		setState(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED);
						
		// If the monitoring service is active, warn it that this requirement has failed.
		it.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();
		if (monitoringService != null)
			monitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.FAIL);
							
		// If the requirement failed, then it has also ended.
		end();
						
		// Propagate the failure to the parent, depending on the type of refinement.
		it.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();
		if ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement)) {
			it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement p = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;
			if (p.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) ((GOREElement) parent).fail();
			else ((GOREElement)parent).checkState();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkState() {
		// Counts the number of children in each state and the number of definable children.
		org.eclipse.emf.common.util.EList<Integer> stateCount = getChildrenStateCount();
		int defChildrenCount = stateCount.get(stateCount.size() - 1);
						
		// For AND-refined requirements, checks if all children have SUCCEEDED.
		if (this instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) {
			it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement p = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) this;
					
			if(p.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) {
				if (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.SUCCEEDED_VALUE) == defChildrenCount) success();
			}
					
			// For OR-refined requirements, checks if all children have FAILED.
			else {
				if (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) == defChildrenCount) fail();
			}
		} 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void replaceWith(final GOREElement newRequirement) {
		// Cannot replace a requirement instance with null.
		if (newRequirement == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Cannot replace a requirement instance with null. A proper requirement instance should be provided."); //$NON-NLS-1$
					throw new IllegalArgumentException();
		}
						
		// Can only replace requirements of the same class.
		if (! newRequirement.eClass().equals(eClass())) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("Cannot replace a requirement instance of class {0} with one of class {1}. Instances should be of the same class.", eClass().getName(), newRequirement.eClass().getName());//$NON-NLS-1$
			throw new IllegalArgumentException();
		}
						
		// Changes the parent-child relationship (if there's no parent, we're setting null over null, so no harm). When
		// elements have many-to-one bilateral associations, only the "one" side is manipulated. This is on purpose, as EMF
		// generated code will handle the inverse association automatically.
		GOREElement parent = getParent();
		setParent(null);
		newRequirement.setParent(parent);
		it.unitn.disi.zanshin.core.CoreUtils.log.debug("Replacing requirement instances of class {0} ({1} -> {2})", eClass().getName(), this, newRequirement); //$NON-NLS-1$
						
		// After a piece of the requirements tree gets replaced by new instances (with possible different states), check if
		// the ancestors should also have their state reset. For instance, if a failed instance is replaced by a non-failing
		// one in an AND-refinement, the parent should change from Failed to Started or Undefined. Navigate up the tree.
		while (parent != null) {
			// This procedure only makes sense in Goal Oriented Requirements.
			if(parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement){
				it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement req = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;
				
				// Counts the number of children in each state and the number of definable children.
				EList<Integer> stateCount = req.getChildrenStateCount();
				//int defChildrenCount = stateCount.get(stateCount.size() - 1);
				int defChildrenCount = getChildren().size();
				boolean doReset = false;
				
				// Checks the type of the requirement.
				switch (req.getRefinementType()) {
				case AND:
					// For failed AND-refined requirements, if none of its children failed, reset its state.
					doReset = (req.getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED) && (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) == 0);
					break;
				case OR:
					// For failed OR-refined requirements, if at least one of its children didn't fail, reset its state.
					doReset = (req.getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED) && (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) < defChildrenCount);
					break;
				}
						
				// Checks if a reset is in order.
				if (doReset) {
					// If no children have yet started, set the requirement also as Undefined.
					if (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.UNDEFINED_VALUE) == defChildrenCount)
						req.setState(it.unitn.disi.zanshin.model.gore.GOREElementState.UNDEFINED);
				
					// Otherwise, if at least one child has started, set it also as Started.
					else req.setState(it.unitn.disi.zanshin.model.gore.GOREElementState.STARTED);
				
					// Log what has just happened.
					it.unitn.disi.zanshin.core.CoreUtils.log.debug("The status of {0} has been reset to {1}", req.eClass().getName(), req.getState()); //$NON-NLS-1$
				}
					
			} 
			
			// Next ancestor.
			parent = parent.getParent();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel findGoalModel() {
		GoalModel model = null;
						
		// If it's the root goal, return the goal model.
		if (this instanceof it.unitn.disi.zanshin.model.gore.HardGoal)
					model = ((it.unitn.disi.zanshin.model.gore.HardGoal) this).getGoalModel();
						
		// If the model is not found in the root goal, move up the requirement tree looking for the root goal.
		if ((model == null) && (getParent() != null))
					model = getParent().findGoalModel();
						
		// Returns the found model, or null if no model has been found.
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOREElement> getChildren() {
		EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();
		EList<AwReq> awreqs = this.getAwreqs();
								
		for(GOREElement child : awreqs){
			children.add(child);
		}
				
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getChildrenStateCount() {
		// Counts the number of children in each state and the number of children.
		int[] stateCount = new int[it.unitn.disi.zanshin.model.gore.GOREElementState.VALUES.size()];
		 
		for (it.unitn.disi.zanshin.model.gore.GOREElement child : getChildren()) {
			stateCount[((GOREElement) child).getState().getValue()]++;
		}
		
		// Converts to EList so we can return
		EList<Integer> stateCountList = new org.eclipse.emf.common.util.BasicEList<>();
		for (int count : stateCount)
			stateCountList.add(count);
		
		return stateCountList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getParent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(GOREElement parent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__AWREQS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAwreqs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__AWREQS:
				return ((InternalEList<?>)getAwreqs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__TIME:
				return getTime();
			case GorePackage.GORE_ELEMENT__STATE:
				return getState();
			case GorePackage.GORE_ELEMENT__AWREQS:
				return getAwreqs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__TIME:
				setTime((Date)newValue);
				return;
			case GorePackage.GORE_ELEMENT__STATE:
				setState((GOREElementState)newValue);
				return;
			case GorePackage.GORE_ELEMENT__AWREQS:
				getAwreqs().clear();
				getAwreqs().addAll((Collection<? extends AwReq>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GorePackage.GORE_ELEMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GorePackage.GORE_ELEMENT__AWREQS:
				getAwreqs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GorePackage.GORE_ELEMENT__STATE:
				return state != STATE_EDEFAULT;
			case GorePackage.GORE_ELEMENT__AWREQS:
				return awreqs != null && !awreqs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //GOREElementImpl
