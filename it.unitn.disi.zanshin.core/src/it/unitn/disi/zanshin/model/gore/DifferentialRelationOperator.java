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
 * <em><b>Differential Relation Operator</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getDifferentialRelationOperator()
 * @model
 * @generated
 */
public enum DifferentialRelationOperator implements Enumerator {
	/**
	 * The '<em><b>GREATER THAN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(0, "GREATER_THAN", "GT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FEWER THAN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #FEWER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	FEWER_THAN(0, "FEWER_THAN", "FT"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER THAN</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #GREATER_THAN
	 * @model literal="GT"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>FEWER THAN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEWER THAN</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FEWER_THAN
	 * @model literal="FT"
	 * @generated
	 * @ordered
	 */
	public static final int FEWER_THAN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Differential Relation Operator</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DifferentialRelationOperator[] VALUES_ARRAY = new DifferentialRelationOperator[] { GREATER_THAN, FEWER_THAN, };

	/**
	 * A public read-only list of all the '<em><b>Differential Relation Operator</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DifferentialRelationOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Differential Relation Operator</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DifferentialRelationOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DifferentialRelationOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) { return result; }
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Differential Relation Operator</b></em>' literal with the specified name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DifferentialRelationOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DifferentialRelationOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) { return result; }
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Differential Relation Operator</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DifferentialRelationOperator get(int value) {
		switch (value) {
		case GREATER_THAN_VALUE:
			return GREATER_THAN;
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
	private DifferentialRelationOperator(int value, String name, String literal) {
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

} // DifferentialRelationOperator
