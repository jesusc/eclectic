/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.Get#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Get#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Get#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Get#getMaybeCollection <em>Maybe Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getGet()
 * @model
 * @generated
 */
public interface Get extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getGetReceptors <em>Get Receptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' reference.
	 * @see #setReceptor(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getGet_Receptor()
	 * @see org.eclectic.idc.core.Variable#getGetReceptors
	 * @model opposite="getReceptors"
	 * @generated
	 */
	Variable getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Get#getReceptor <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Variable value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getGet_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Get#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link org.eclectic.idc.instr.GetKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.instr.GetKind
	 * @see #setKind(GetKind)
	 * @see org.eclectic.idc.instr.InstrPackage#getGet_Kind()
	 * @model default="0" required="true"
	 * @generated
	 */
	GetKind getKind();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Get#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.instr.GetKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(GetKind value);

	/**
	 * Returns the value of the '<em><b>Maybe Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maybe Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maybe Collection</em>' attribute.
	 * @see #setMaybeCollection(Boolean)
	 * @see org.eclectic.idc.instr.InstrPackage#getGet_MaybeCollection()
	 * @model default="false"
	 * @generated
	 */
	Boolean getMaybeCollection();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Get#getMaybeCollection <em>Maybe Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maybe Collection</em>' attribute.
	 * @see #getMaybeCollection()
	 * @generated
	 */
	void setMaybeCollection(Boolean value);

} // Get
