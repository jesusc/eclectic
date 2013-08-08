/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.ModelDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.ReadMeta#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.ReadMeta#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.ReadMeta#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getReadMeta()
 * @model
 * @generated
 */
public interface ReadMeta extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getReadMeta_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.ReadMeta#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link org.eclectic.idc.instr.ReadMetaKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.instr.ReadMetaKind
	 * @see #setKind(ReadMetaKind)
	 * @see org.eclectic.idc.instr.InstrPackage#getReadMeta_Kind()
	 * @model default="0" required="true"
	 * @generated
	 */
	ReadMetaKind getKind();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.ReadMeta#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.instr.ReadMetaKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ReadMetaKind value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelDefinition)
	 * @see org.eclectic.idc.instr.InstrPackage#getReadMeta_Model()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.ReadMeta#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelDefinition value);

} // ReadMeta
