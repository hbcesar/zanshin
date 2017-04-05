/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl#getAlgorithmId <em>Algorithm Id</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationStrategyImpl#getProcedureIds <em>Procedure Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationStrategyImpl extends AdaptationStrategyImpl implements ReconfigurationStrategy {
	/**
	 * The default value of the '{@link #getAlgorithmId() <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmId() <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmId()
	 * @generated
	 * @ordered
	 */
	protected String algorithmId = ALGORITHM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationLevel LEVEL_EDEFAULT = AggregationLevel.CLASS;

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
	 * The cached value of the '{@link #getProcedureIds() <em>Procedure Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> procedureIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmId() {
		return algorithmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmId(String newAlgorithmId) {
		String oldAlgorithmId = algorithmId;
		algorithmId = newAlgorithmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID, oldAlgorithmId, algorithmId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_STRATEGY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProcedureIds() {
		if (procedureIds == null) {
			procedureIds = new EDataTypeUniqueEList<String>(String.class, this, EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS);
		}
		return procedureIds;
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
		
		// Attribute algorithmId is mandatory.
		if (algorithmId == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"algorithmId\" and cannot be executed.", strategyName); //$NON-NLS-1$
			return;
		}
		
		// Obtains a reference to the reconfiguration service and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);
		if (reconfigService == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but an algorithm with id \"{1}\" is not registered!", strategyName, algorithmId); //$NON-NLS-1$
			return;
		}
		
		// Attribute level defaults to CLASS.
		if (level == null)
			level = it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS;
		
		// The AwReq and the goal model are mandatory.
		it.unitn.disi.zanshin.model.gore.AwReq awreq = getAwReq();
		if (awreq == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but no AwReq is associated with it!", strategyName); //$NON-NLS-1$
			return;
		}
		it.unitn.disi.zanshin.model.gore.GoalModel model = awreq.findGoalModel();
		if (model == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to apply {0}, but associated AwReq {1} does not belong to a goal model!", strategyName, awreq.eClass().getName()); //$NON-NLS-1$
			return;
		}
		
		// Executes the reconfiguration strategy.
		strategyName += "(" + algorithmId + "; " + level + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		it.unitn.disi.zanshin.core.CoreUtils.log.info("{0} Applying strategy {1}...", session.getId(), strategyName); //$NON-NLS-1$
		it.unitn.disi.zanshin.model.gore.Configuration newConfig = reconfigService.findConfiguration(procedureIds, awreq);
		controller.applyConfig(model, newConfig, level);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				return getAlgorithmId();
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				return getLevel();
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				return getProcedureIds();
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
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				setAlgorithmId((String)newValue);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				setLevel((AggregationLevel)newValue);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				getProcedureIds().clear();
				getProcedureIds().addAll((Collection<? extends String>)newValue);
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
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				setAlgorithmId(ALGORITHM_ID_EDEFAULT);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				getProcedureIds().clear();
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
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				return ALGORITHM_ID_EDEFAULT == null ? algorithmId != null : !ALGORITHM_ID_EDEFAULT.equals(algorithmId);
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				return procedureIds != null && !procedureIds.isEmpty();
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
		result.append(" (algorithmId: ");
		result.append(algorithmId);
		result.append(", level: ");
		result.append(level);
		result.append(", procedureIds: ");
		result.append(procedureIds);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationStrategyImpl
