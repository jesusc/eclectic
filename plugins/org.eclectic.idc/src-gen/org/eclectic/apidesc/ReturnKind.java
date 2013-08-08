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
 * A representation of the literals of the enumeration '<em><b>Return Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclectic.apidesc.ApidescPackage#getReturnKind()
 * @model
 * @generated
 */
public enum ReturnKind implements Enumerator {
	/**
	 * The '<em><b>SINGLE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_OBJECT(0, "SINGLE_OBJECT", "SINGLE_OBJECT"),

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
	PRIMITIVE_FLOAT(5, "PRIMITIVE_FLOAT", "PRIMITIVE_FLOAT"),

	/**
	 * The '<em><b>ARRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(6, "ARRAY", "ARRAY"),

	/**
	 * The '<em><b>COLLECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION(7, "COLLECTION", "COLLECTION"),

	/**
	 * The '<em><b>VOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(8, "VOID", "VOID");

	/**
	 * The '<em><b>SINGLE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_OBJECT_VALUE = 0;

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
	 * The '<em><b>ARRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 6;

	/**
	 * The '<em><b>COLLECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLLECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_VALUE = 7;

	/**
	 * The '<em><b>VOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 8;

	/**
	 * An array of all the '<em><b>Return Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReturnKind[] VALUES_ARRAY =
		new ReturnKind[] {
			SINGLE_OBJECT,
			PRIMITIVE_INTEGER,
			PRIMITIVE_STRING,
			PRIMITIVE_BOOLEAN,
			PRIMITIVE_DOUBLE,
			PRIMITIVE_FLOAT,
			ARRAY,
			COLLECTION,
			VOID,
		};

	/**
	 * A public read-only list of all the '<em><b>Return Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReturnKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Return Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnKind get(int value) {
		switch (value) {
			case SINGLE_OBJECT_VALUE: return SINGLE_OBJECT;
			case PRIMITIVE_INTEGER_VALUE: return PRIMITIVE_INTEGER;
			case PRIMITIVE_STRING_VALUE: return PRIMITIVE_STRING;
			case PRIMITIVE_BOOLEAN_VALUE: return PRIMITIVE_BOOLEAN;
			case PRIMITIVE_DOUBLE_VALUE: return PRIMITIVE_DOUBLE;
			case PRIMITIVE_FLOAT_VALUE: return PRIMITIVE_FLOAT;
			case ARRAY_VALUE: return ARRAY;
			case COLLECTION_VALUE: return COLLECTION;
			case VOID_VALUE: return VOID;
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
	private ReturnKind(int value, String name, String literal) {
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
	
} //ReturnKind
