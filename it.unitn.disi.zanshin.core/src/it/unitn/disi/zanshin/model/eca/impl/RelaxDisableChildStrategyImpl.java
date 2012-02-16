/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.RelaxDisableChildStrategy;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.Requirement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relax Disable Child Strategy</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl#getRequirement <em>Requirement</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl#getLevel <em>Level</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.RelaxDisableChildStrategyImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RelaxDisableChildStrategyImpl extends AdaptationStrategyImpl implements RelaxDisableChildStrategy {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirement;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationLevel LEVEL_EDEFAULT = AggregationLevel.INSTANCE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected AggregationLevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Requirement child;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RelaxDisableChildStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RELAX_DISABLE_CHILD_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Requirement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject) requirement;
			requirement = (Requirement) eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Requirement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequirement(Requirement newRequirement) {
		Requirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregationLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLevel(AggregationLevel newLevel) {
		AggregationLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Requirement getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject) child;
			child = (Requirement) eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Requirement basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChild(Requirement newChild) {
		Requirement oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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

		// Attribute requirement defaults to the AwReq's target.
		if (requirement == null) {
			setRequirement(awreq.getTarget());
			if (requirement == null) {
				it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"requirement\" and cannot be executed. Cannot use the default value because the referred AwReq doesn't have a target set.", strategyName); //$NON-NLS-1$
				return;
			}
		}

		// Attribute level defaults to INSTANCE.
		if (level == null)
			level = it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE;

		// Attribute child is mandatory.
		if (child == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"child\" and cannot be executed.", strategyName); //$NON-NLS-1$
			return;
		}

		// Executes the Relax by Disabling Child strategy.
		strategyName += "(" + requirement.eClass().getName() + "; " + level + "; " + child.eClass().getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Applying strategy {1}...", session.getId(), strategyName); //$NON-NLS-1$
		if ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH))
			controller.disable(child.eClass());
		if ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {
			Requirement parent = requirement.getParent();
			controller.suspend(requirement);
			controller.terminate(child);
			if (child instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
				controller.rollback((it.unitn.disi.zanshin.model.gore.PerformativeRequirement) child);
			controller.suspend(child);
			controller.resume(requirement, parent);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void updateReferences() {
		// Retrieves the model id and continues only if this requirement is part of a model.
		it.unitn.disi.zanshin.model.gore.GoalModel model = getAwReq().findGoalModel();
		if (model != null) {
			Long modelId = model.getId();

			// Retrieves the repository service from the platform to be able to update the references.
			it.unitn.disi.zanshin.services.IRepositoryService repositoryService = it.unitn.disi.zanshin.core.Activator.getRepositoryService();

			// Updates references to requirement and child.
			if (requirement != null)
				setRequirement(repositoryService.retrieveRequirement(modelId, requirement.eClass()));
			if (child != null)
				setChild(repositoryService.retrieveRequirement(modelId, child.eClass()));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
			if (resolve)
				return getRequirement();
			return basicGetRequirement();
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
			return getLevel();
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
			if (resolve)
				return getChild();
			return basicGetChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
			setRequirement((Requirement) newValue);
			return;
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
			setLevel((AggregationLevel) newValue);
			return;
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
			setChild((Requirement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
			setRequirement((Requirement) null);
			return;
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
			setChild((Requirement) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
			return requirement != null;
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
			return level != LEVEL_EDEFAULT;
		case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
			return child != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (level: "); //$NON-NLS-1$
		result.append(level);
		result.append(')');
		return result.toString();
	}

} // RelaxDisableChildStrategyImpl
