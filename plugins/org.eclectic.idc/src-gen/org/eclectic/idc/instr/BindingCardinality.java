/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Cardinality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.instr.InstrPackage#getBindingCardinality()
 * @model
 * @generated
 */
public enum BindingCardinality implements Enumerator {
	/**
	 * The '<em><b>ONE MONOVALUED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_MONOVALUED_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_MONOVALUED(0, "ONE_MONOVALUED", "ONE_MONOVALUED"),

	/**
	 * The '<em><b>ONE MULTIVALUED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_MULTIVALUED_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_MULTIVALUED(1, "ONE_MULTIVALUED", "ONE_MULTIVALUED"),

	/**
	 * The '<em><b>ONE DYNAMIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_DYNAMIC_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_DYNAMIC(2, "ONE_DYNAMIC", "ONE_DYNAMIC"),

	/**
	 * The '<em><b>MANY AS ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_AS_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_AS_ONE(3, "MANY_AS_ONE", "MANY_AS_ONE");

	/**
	 * The '<em><b>ONE MONOVALUED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE MONOVALUED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_MONOVALUED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_MONOVALUED_VALUE = 0;

	/**
	 * The '<em><b>ONE MULTIVALUED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE MULTIVALUED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_MULTIVALUED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_MULTIVALUED_VALUE = 1;

	/**
	 * The '<em><b>ONE DYNAMIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE DYNAMIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_DYNAMIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_DYNAMIC_VALUE = 2;

	/**
	 * The '<em><b>MANY AS ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANY AS ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_AS_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY_AS_ONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Binding Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingCardinality[] VALUES_ARRAY =
		new BindingCardinality[] {
			ONE_MONOVALUED,
			ONE_MULTIVALUED,
			ONE_DYNAMIC,
			MANY_AS_ONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Binding Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingCardinality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Cardinality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingCardinality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingCardinality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Cardinality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingCardinality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingCardinality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Cardinality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingCardinality get(int value) {
		switch (value) {
			case ONE_MONOVALUED_VALUE: return ONE_MONOVALUED;
			case ONE_MULTIVALUED_VALUE: return ONE_MULTIVALUED;
			case ONE_DYNAMIC_VALUE: return ONE_DYNAMIC;
			case MANY_AS_ONE_VALUE: return MANY_AS_ONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BindingCardinality(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BindingCardinality
