/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.StrengthenReplace;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.GOREElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strengthen Replace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.StrengthenReplaceImpl#getNewRequirement <em>New Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrengthenReplaceImpl extends AdaptationStrategyImpl implements StrengthenReplace {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected GOREElement requirement;

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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationLevel LEVEL_EDEFAULT = AggregationLevel.INSTANCE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected AggregationLevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewRequirement() <em>New Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRequirement()
	 * @generated
	 * @ordered
	 */
	protected GOREElement newRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrengthenReplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.STRENGTHEN_REPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject)requirement;
			requirement = (GOREElement)eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.STRENGTHEN_REPLACE__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(GOREElement newRequirement) {
		GOREElement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE__REQUIREMENT, oldRequirement, requirement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE__COPY, oldCopy, copy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(AggregationLevel newLevel) {
		AggregationLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getNewRequirement() {
		if (newRequirement != null && newRequirement.eIsProxy()) {
			InternalEObject oldNewRequirement = (InternalEObject)newRequirement;
			newRequirement = (GOREElement)eResolveProxy(oldNewRequirement);
			if (newRequirement != oldNewRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.STRENGTHEN_REPLACE__NEW_REQUIREMENT, oldNewRequirement, newRequirement));
			}
		}
		return newRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetNewRequirement() {
		return newRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRequirement(GOREElement newNewRequirement) {
		GOREElement oldNewRequirement = newRequirement;
		newRequirement = newNewRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE__NEW_REQUIREMENT, oldNewRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(final AdaptationSession session) {
		String strategyName = eClass().getName();
		
		// Obtains a reference to the target system's controller and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();
		if (controller == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but the target system's controller has not yet been registered!", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Retrieve the strategy's attributes.
		it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();
		
		// Attribute requirement defaults to the AwReq's target.
		if (requirement == null) {
			setRequirement(awreq.getParent());
			if (requirement == null) {
				it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"requirement\" and cannot be executed. Cannot use the default value because the referred AwReq doesn't have a target set.", strategyName); //$NON-NLS-1$
				return;
			}
		}
		
		// Attribute copy defaults to TRUE.
		if (copy == null) copy = Boolean.TRUE;
		
		// Attribute level defaults to INSTANCE.
		if (level == null) level = it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE;
		
		// Attribute newRequirement is mandatory.
		if (newRequirement == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"newRequirement\" and cannot be executed.", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Executes the Strengthen by Replacing strategy.
		it.unitn.disi.zanshin.model.gore.GoalModel goalModel = requirement.findGoalModel();
		strategyName += "(" + requirement.eClass().getName() + "; " + copy + "; " + level + "; " + newRequirement.eClass().getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Applying strategy {1}...", session.getId(), strategyName); //$NON-NLS-1$
		if ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {
			controller.disable(requirement.eClass());
			controller.enable(newRequirement.eClass());
		}
		if ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {
			if ((copy) && (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement) && (newRequirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement))
				controller.copyData(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) newRequirement);
			controller.terminate(goalModel, requirement);
			if (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
				controller.rollback(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement);
			controller.initiate(goalModel, newRequirement);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateReferences() {
		// Retrieves the model id and continues only if this requirement is part of a model.
		it.unitn.disi.zanshin.model.gore.GoalModel model = getAwReq().findGoalModel();
		if (model != null) {
			Long modelId = model.getId();
			
			// Retrieves the repository service from the platform to be able to update the references.
			it.unitn.disi.zanshin.services.IRepositoryService repositoryService = it.unitn.disi.zanshin.core.Activator.getRepositoryService();
			
			// Updates references to requirement and newRequirement.
			if (requirement != null)
				setRequirement(repositoryService.retrieveRequirement(modelId, requirement.eClass()));
			if (newRequirement != null)
				setNewRequirement(repositoryService.retrieveRequirement(modelId, newRequirement.eClass()));
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
			case EcaPackage.STRENGTHEN_REPLACE__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
			case EcaPackage.STRENGTHEN_REPLACE__COPY:
				return getCopy();
			case EcaPackage.STRENGTHEN_REPLACE__LEVEL:
				return getLevel();
			case EcaPackage.STRENGTHEN_REPLACE__NEW_REQUIREMENT:
				if (resolve) return getNewRequirement();
				return basicGetNewRequirement();
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
			case EcaPackage.STRENGTHEN_REPLACE__REQUIREMENT:
				setRequirement((GOREElement)newValue);
				return;
			case EcaPackage.STRENGTHEN_REPLACE__COPY:
				setCopy((Boolean)newValue);
				return;
			case EcaPackage.STRENGTHEN_REPLACE__LEVEL:
				setLevel((AggregationLevel)newValue);
				return;
			case EcaPackage.STRENGTHEN_REPLACE__NEW_REQUIREMENT:
				setNewRequirement((GOREElement)newValue);
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
			case EcaPackage.STRENGTHEN_REPLACE__REQUIREMENT:
				setRequirement((GOREElement)null);
				return;
			case EcaPackage.STRENGTHEN_REPLACE__COPY:
				setCopy(COPY_EDEFAULT);
				return;
			case EcaPackage.STRENGTHEN_REPLACE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EcaPackage.STRENGTHEN_REPLACE__NEW_REQUIREMENT:
				setNewRequirement((GOREElement)null);
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
			case EcaPackage.STRENGTHEN_REPLACE__REQUIREMENT:
				return requirement != null;
			case EcaPackage.STRENGTHEN_REPLACE__COPY:
				return COPY_EDEFAULT == null ? copy != null : !COPY_EDEFAULT.equals(copy);
			case EcaPackage.STRENGTHEN_REPLACE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EcaPackage.STRENGTHEN_REPLACE__NEW_REQUIREMENT:
				return newRequirement != null;
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
		result.append(" (copy: ");
		result.append(copy);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //StrengthenReplaceImpl
