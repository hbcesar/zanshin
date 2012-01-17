/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.Event;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;
import it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcaFactoryImpl extends EFactoryImpl implements EcaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcaFactory init() {
		try {
			EcaFactory theEcaFactory = (EcaFactory)EPackage.Registry.INSTANCE.getEFactory("http://zanshin.disi.unitn.it/1.0/eca");  //$NON-NLS-1$
			if (theEcaFactory != null) {
				return theEcaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcaPackage.ECA_AW_REQ: return createEcaAwReq();
			case EcaPackage.EVENT: return createEvent();
			case EcaPackage.ADAPTATION_SESSION: return createAdaptationSession();
			case EcaPackage.SIMPLE_RESOLUTION_CONDITION: return createSimpleResolutionCondition();
			case EcaPackage.SIMPLE_APPLICABILITY_CONDITION: return createSimpleApplicabilityCondition();
			case EcaPackage.RETRY_STRATEGY: return createRetryStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaAwReq createEcaAwReq() {
		EcaAwReqImpl ecaAwReq = new EcaAwReqImpl();
		return ecaAwReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationSession createAdaptationSession() {
		AdaptationSessionImpl adaptationSession = new AdaptationSessionImpl();
		return adaptationSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleResolutionCondition createSimpleResolutionCondition() {
		SimpleResolutionConditionImpl simpleResolutionCondition = new SimpleResolutionConditionImpl();
		return simpleResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleApplicabilityCondition createSimpleApplicabilityCondition() {
		SimpleApplicabilityConditionImpl simpleApplicabilityCondition = new SimpleApplicabilityConditionImpl();
		return simpleApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryStrategy createRetryStrategy() {
		RetryStrategyImpl retryStrategy = new RetryStrategyImpl();
		return retryStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaPackage getEcaPackage() {
		return (EcaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcaPackage getPackage() {
		return EcaPackage.eINSTANCE;
	}

} //EcaFactoryImpl
