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
 * A representation of the literals of the enumeration '<em><b>Read Meta Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.instr.InstrPackage#getReadMetaKind()
 * @model
 * @generated
 */
public enum ReadMetaKind implements Enumerator {
	/**
	 * The '<em><b>METACLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METACLASS_VALUE
	 * @generated
	 * @ordered
	 */
	METACLASS(0, "METACLASS", "METACLASS"),

	/**
	 * The '<em><b>MODEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL(1, "MODEL", "MODEL"), /**
	 * The '<em><b>THIS TRANSFORMATION METHOD HANDLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIS_TRANSFORMATION_METHOD_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	THIS_TRANSFORMATION_METHOD_HANDLER(2, "THIS_TRANSFORMATION_METHOD_HANDLER", "THIS_TRANSFORMATION_METHOD_HANDLER"), /**
	 * The '<em><b>THIS TRANSFORMATION OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIS_TRANSFORMATION_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	THIS_TRANSFORMATION_OBJECT(3, "THIS_TRANSFORMATION_OBJECT", "THIS_TRANSFORMATION_OBJECT");

	/**
	 * The '<em><b>METACLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METACLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METACLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METACLASS_VALUE = 0;

	/**
	 * The '<em><b>MODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_VALUE = 1;

	/**
	 * The '<em><b>THIS TRANSFORMATION METHOD HANDLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THIS TRANSFORMATION METHOD HANDLER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIS_TRANSFORMATION_METHOD_HANDLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIS_TRANSFORMATION_METHOD_HANDLER_VALUE = 2;

	/**
	 * The '<em><b>THIS TRANSFORMATION OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THIS TRANSFORMATION OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIS_TRANSFORMATION_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIS_TRANSFORMATION_OBJECT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Read Meta Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReadMetaKind[] VALUES_ARRAY =
		new ReadMetaKind[] {
			METACLASS,
			MODEL,
			THIS_TRANSFORMATION_METHOD_HANDLER,
			THIS_TRANSFORMATION_OBJECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Read Meta Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReadMetaKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Read Meta Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReadMetaKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadMetaKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Read Meta Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReadMetaKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadMetaKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Read Meta Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReadMetaKind get(int value) {
		switch (value) {
			case METACLASS_VALUE: return METACLASS;
			case MODEL_VALUE: return MODEL;
			case THIS_TRANSFORMATION_METHOD_HANDLER_VALUE: return THIS_TRANSFORMATION_METHOD_HANDLER;
			case THIS_TRANSFORMATION_OBJECT_VALUE: return THIS_TRANSFORMATION_OBJECT;
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
	private ReadMetaKind(int value, String name, String literal) {
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
	
} //ReadMetaKind
