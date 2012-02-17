/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Definable Requirement State</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDefinableRequirementState()
 * @model
 * @generated
 */
public enum DefinableRequirementState implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "undefined"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>STARTED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	STARTED(1, "STARTED", "started"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SUCCEEDED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #SUCCEEDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCEEDED(2, "SUCCEEDED", "succeeded"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FAILED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(3, "FAILED", "failed"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CANCELED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #CANCELED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELED(4, "CANCELED", "canceled"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNDEFINED
	 * @model literal="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>STARTED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #STARTED
	 * @model literal="started"
	 * @generated
	 * @ordered
	 */
	public static final int STARTED_VALUE = 1;

	/**
	 * The '<em><b>SUCCEEDED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCEEDED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SUCCEEDED
	 * @model literal="succeeded"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCEEDED_VALUE = 2;

	/**
	 * The '<em><b>FAILED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILED</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FAILED
	 * @model literal="failed"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 3;

	/**
	 * The '<em><b>CANCELED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCELED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CANCELED
	 * @model literal="canceled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Definable Requirement State</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DefinableRequirementState[] VALUES_ARRAY = new DefinableRequirementState[] { UNDEFINED, STARTED, SUCCEEDED, FAILED, CANCELED, };

	/**
	 * A public read-only list of all the '<em><b>Definable Requirement State</b></em>' enumerators. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DefinableRequirementState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Definable Requirement State</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DefinableRequirementState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinableRequirementState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) { return result; }
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Definable Requirement State</b></em>' literal with the specified name. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DefinableRequirementState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinableRequirementState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) { return result; }
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Definable Requirement State</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DefinableRequirementState get(int value) {
		switch (value) {
		case UNDEFINED_VALUE:
			return UNDEFINED;
		case STARTED_VALUE:
			return STARTED;
		case SUCCEEDED_VALUE:
			return SUCCEEDED;
		case FAILED_VALUE:
			return FAILED;
		case CANCELED_VALUE:
			return CANCELED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private DefinableRequirementState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // DefinableRequirementState
