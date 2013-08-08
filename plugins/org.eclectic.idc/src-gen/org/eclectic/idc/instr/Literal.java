/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.Literal#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Literal#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Literal#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Literal#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Literal#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getLiteral_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Literal#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(Integer)
	 * @see org.eclectic.idc.instr.InstrPackage#getLiteral_IntValue()
	 * @model
	 * @generated
	 */
	Integer getIntValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Literal#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Value</em>' attribute.
	 * @see #setDoubleValue(Double)
	 * @see org.eclectic.idc.instr.InstrPackage#getLiteral_DoubleValue()
	 * @model
	 * @generated
	 */
	Double getDoubleValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Literal#getDoubleValue <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Value</em>' attribute.
	 * @see #getDoubleValue()
	 * @generated
	 */
	void setDoubleValue(Double value);

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(Boolean)
	 * @see org.eclectic.idc.instr.InstrPackage#getLiteral_BooleanValue()
	 * @model
	 * @generated
	 */
	Boolean getBooleanValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Literal#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclectic.idc.instr.LiteralKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.instr.LiteralKind
	 * @see #setKind(LiteralKind)
	 * @see org.eclectic.idc.instr.InstrPackage#getLiteral_Kind()
	 * @model required="true"
	 * @generated
	 */
	LiteralKind getKind();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Literal#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclectic.idc.instr.LiteralKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(LiteralKind value);

} // Literal
