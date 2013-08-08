/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclectic.apidesc.ApidescPackage#getPrimitiveType()
 * @model
 * @generated
 */
public enum PrimitiveType implements Enumerator {
	/**
	 * The '<em><b>PRIMITIVE INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_INTEGER(1, "PRIMITIVE_INTEGER", "PRIMITIVE_INTEGER"),

	/**
	 * The '<em><b>PRIMITIVE STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_STRING(2, "PRIMITIVE_STRING", "PRIMITIVE_STRING"),

	/**
	 * The '<em><b>PRIMITIVE BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_BOOLEAN(3, "PRIMITIVE_BOOLEAN", "PRIMITIVE_BOOLEAN"),

	/**
	 * The '<em><b>PRIMITIVE DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_DOUBLE(4, "PRIMITIVE_DOUBLE", "PRIMITIVE_DOUBLE"),

	/**
	 * The '<em><b>PRIMITIVE FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_FLOAT(5, "PRIMITIVE_FLOAT", "PRIMITIVE_FLOAT");

	/**
	 * The '<em><b>PRIMITIVE INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMITIVE INTEGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_INTEGER_VALUE = 1;

	/**
	 * The '<em><b>PRIMITIVE STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMITIVE STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_STRING_VALUE = 2;

	/**
	 * The '<em><b>PRIMITIVE BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMITIVE BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_BOOLEAN_VALUE = 3;

	/**
	 * The '<em><b>PRIMITIVE DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMITIVE DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_DOUBLE_VALUE = 4;

	/**
	 * The '<em><b>PRIMITIVE FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMITIVE FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMITIVE_FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_FLOAT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveType[] VALUES_ARRAY =
		new PrimitiveType[] {
			PRIMITIVE_INTEGER,
			PRIMITIVE_STRING,
			PRIMITIVE_BOOLEAN,
			PRIMITIVE_DOUBLE,
			PRIMITIVE_FLOAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType get(int value) {
		switch (value) {
			case PRIMITIVE_INTEGER_VALUE: return PRIMITIVE_INTEGER;
			case PRIMITIVE_STRING_VALUE: return PRIMITIVE_STRING;
			case PRIMITIVE_BOOLEAN_VALUE: return PRIMITIVE_BOOLEAN;
			case PRIMITIVE_DOUBLE_VALUE: return PRIMITIVE_DOUBLE;
			case PRIMITIVE_FLOAT_VALUE: return PRIMITIVE_FLOAT;
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
	private PrimitiveType(int value, String name, String literal) {
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
	
} //PrimitiveType
