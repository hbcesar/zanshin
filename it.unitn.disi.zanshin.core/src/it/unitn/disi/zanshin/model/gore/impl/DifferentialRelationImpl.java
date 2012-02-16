/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Differential Relation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl#getIndicator <em>Indicator</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl#getParameter <em>Parameter</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl#getLowerBound <em>Lower Bound</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl#getUpperBound <em>Upper Bound</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl#getOperator <em>Operator</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.DifferentialRelationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DifferentialRelationImpl extends EObjectImpl implements DifferentialRelation {
	/**
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected AwReq indicator;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final DifferentialRelationOperator OPERATOR_EDEFAULT = DifferentialRelationOperator.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected DifferentialRelationOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DifferentialRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.DIFFERENTIAL_RELATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AwReq getIndicator() {
		if (indicator != null && indicator.eIsProxy()) {
			InternalEObject oldIndicator = (InternalEObject) indicator;
			indicator = (AwReq) eResolveProxy(oldIndicator);
			if (indicator != oldIndicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.DIFFERENTIAL_RELATION__INDICATOR, oldIndicator, indicator));
			}
		}
		return indicator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AwReq basicGetIndicator() {
		return indicator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIndicator(AwReq newIndicator) {
		AwReq oldIndicator = indicator;
		indicator = newIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.DIFFERENTIAL_RELATION__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DifferentialRelationOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOperator(DifferentialRelationOperator newOperator) {
		DifferentialRelationOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
			if (resolve)
				return getIndicator();
			return basicGetIndicator();
		case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
			return getLowerBound();
		case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
			return getUpperBound();
		case GorePackage.DIFFERENTIAL_RELATION__OPERATOR:
			return getOperator();
		case GorePackage.DIFFERENTIAL_RELATION__VALUE:
			return getValue();
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
		case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
			setIndicator((AwReq) newValue);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
			setParameter((Parameter) newValue);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
			setLowerBound((String) newValue);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
			setUpperBound((String) newValue);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__OPERATOR:
			setOperator((DifferentialRelationOperator) newValue);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__VALUE:
			setValue((Double) newValue);
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
		case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
			setIndicator((AwReq) null);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
			setParameter((Parameter) null);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case GorePackage.DIFFERENTIAL_RELATION__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
			return indicator != null;
		case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
			return parameter != null;
		case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
			return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
		case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
			return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
		case GorePackage.DIFFERENTIAL_RELATION__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case GorePackage.DIFFERENTIAL_RELATION__VALUE:
			return value != VALUE_EDEFAULT;
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
		result.append(" (lowerBound: "); //$NON-NLS-1$
		result.append(lowerBound);
		result.append(", upperBound: "); //$NON-NLS-1$
		result.append(upperBound);
		result.append(", operator: "); //$NON-NLS-1$
		result.append(operator);
		result.append(", value: "); //$NON-NLS-1$
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // DifferentialRelationImpl
