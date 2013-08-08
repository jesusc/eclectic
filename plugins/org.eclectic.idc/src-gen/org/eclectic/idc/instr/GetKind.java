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
 * A representation of the literals of the enumeration '<em><b>Get Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.instr.InstrPackage#getGetKind()
 * @model
 * @generated
 */
public enum GetKind implements Enumerator {
	/**
	 * The '<em><b>PLAIN GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_GET_VALUE
	 * @generated
	 * @ordered
	 */
	PLAIN_GET(0, "PLAIN_GET", "PLAIN_GET"),

	/**
	 * The '<em><b>TRY GET FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRY_GET_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	TRY_GET_FIRST(1, "TRY_GET_FIRST", "TRY_GET_FIRST"),

	/**
	 * The '<em><b>TRY METHOD FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRY_METHOD_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	TRY_METHOD_FIRST(2, "TRY_METHOD_FIRST", "TRY_METHOD_FIRST");

	/**
	 * The '<em><b>PLAIN GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAIN GET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAIN_GET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAIN_GET_VALUE = 0;

	/**
	 * The '<em><b>TRY GET FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRY GET FIRST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRY_GET_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRY_GET_FIRST_VALUE = 1;

	/**
	 * The '<em><b>TRY METHOD FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRY METHOD FIRST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRY_METHOD_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRY_METHOD_FIRST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Get Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GetKind[] VALUES_ARRAY =
		new GetKind[] {
			PLAIN_GET,
			TRY_GET_FIRST,
			TRY_METHOD_FIRST,
		};

	/**
	 * A public read-only list of all the '<em><b>Get Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GetKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Get Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GetKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GetKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Get Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GetKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GetKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Get Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GetKind get(int value) {
		switch (value) {
			case PLAIN_GET_VALUE: return PLAIN_GET;
			case TRY_GET_FIRST_VALUE: return TRY_GET_FIRST;
			case TRY_METHOD_FIRST_VALUE: return TRY_METHOD_FIRST;
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
	private GetKind(int value, String name, String literal) {
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
	
} //GetKind
