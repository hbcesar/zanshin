/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retry Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.RetryStrategyImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RetryStrategyImpl extends AdaptationStrategyImpl implements RetryStrategy {
	/**
	 * The default value of the '{@link #getCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COPY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopy()
	 * @generated
	 * @ordered
	 */
	protected Boolean copy = COPY_EDEFAULT;
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Long time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetryStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RETRY_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCopy() {
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopy(Boolean newCopy) {
		Boolean oldCopy = copy;
		copy = newCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RETRY_STRATEGY__COPY, oldCopy, copy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Long newTime) {
		Long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RETRY_STRATEGY__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(AdaptationSession session) {
		String strategyName = getClass().getInterfaces()[0].getSimpleName();
		
		// Obtains a reference to the target system's controller and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();
		if (controller == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but the target system's controller has not yet been registered!", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Retrieve the strategy's attributes.
		it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();
		
		// Attribute copy defaults to TRUE.
		if (copy == null) copy = Boolean.TRUE;
		
		// Attribute time is mandatory.
		if (time == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"time\" and cannot be executed.", strategyName); //$NON-NLS-1$
			return;
		}
		
		// The requirement to retry is always the AwReq's target.
		it.unitn.disi.zanshin.model.gore.Requirement requirement = awreq.getTarget();
		if (requirement == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} cannot be executed because the referred AwReq doesn't have a target set.", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Executes the Retry strategy.
		strategyName += "(" + copy + "; " + time + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Applying strategy {1}...", session.getId(), strategyName); //$NON-NLS-1$
		try {
			org.eclipse.emf.ecore.EClass eClass = requirement.eClass();
			it.unitn.disi.zanshin.model.gore.Requirement newRequirement = controller.newInstance(eClass);
			if ((copy) && (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement) && (newRequirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)) 
				controller.copyData((it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) newRequirement);
			controller.terminate(requirement);
			if (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
				controller.rollback((it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement);
			controller.waitFor(time);
			controller.initiate(newRequirement);
		}
		catch (InstantiationException e) {
			it.unitn.disi.zanshin.core.CoreUtils.log.error("{0} Could not apply strategy {1} because a new instance of the requirement could not be created.", e, session.getId(), strategyName); //$NON-NLS-1$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RETRY_STRATEGY__COPY:
				return getCopy();
			case EcaPackage.RETRY_STRATEGY__TIME:
				return getTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcaPackage.RETRY_STRATEGY__COPY:
				setCopy((Boolean)newValue);
				return;
			case EcaPackage.RETRY_STRATEGY__TIME:
				setTime((Long)newValue);
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
			case EcaPackage.RETRY_STRATEGY__COPY:
				setCopy(COPY_EDEFAULT);
				return;
			case EcaPackage.RETRY_STRATEGY__TIME:
				setTime(TIME_EDEFAULT);
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
			case EcaPackage.RETRY_STRATEGY__COPY:
				return COPY_EDEFAULT == null ? copy != null : !COPY_EDEFAULT.equals(copy);
			case EcaPackage.RETRY_STRATEGY__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
		result.append(" (copy: "); //$NON-NLS-1$
		result.append(copy);
		result.append(", time: "); //$NON-NLS-1$
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //RetryStrategyImpl
