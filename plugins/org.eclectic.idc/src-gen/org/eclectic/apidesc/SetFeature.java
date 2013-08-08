/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.SetFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SetFeature#getValueKind <em>Value Kind</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SetFeature#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SetFeature#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SetFeature#isBoolValue <em>Bool Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getSetFeature()
 * @model
 * @generated
 */
public interface SetFeature extends Statement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(FeatureMapping)
	 * @see org.eclectic.apidesc.ApidescPackage#getSetFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	FeatureMapping getFeature();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SetFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureMapping value);

	/**
	 * Returns the value of the '<em><b>Value Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclectic.apidesc.ReturnKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Kind</em>' attribute.
	 * @see org.eclectic.apidesc.ReturnKind
	 * @see #setValueKind(ReturnKind)
	 * @see org.eclectic.apidesc.ApidescPackage#getSetFeature_ValueKind()
	 * @model required="true"
	 * @generated
	 */
	ReturnKind getValueKind();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SetFeature#getValueKind <em>Value Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Kind</em>' attribute.
	 * @see org.eclectic.apidesc.ReturnKind
	 * @see #getValueKind()
	 * @generated
	 */
	void setValueKind(ReturnKind value);

	/**
	 * Returns the value of the '<em><b>Str Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Value</em>' attribute.
	 * @see #setStrValue(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getSetFeature_StrValue()
	 * @model
	 * @generated
	 */
	String getStrValue();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SetFeature#getStrValue <em>Str Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Value</em>' attribute.
	 * @see #getStrValue()
	 * @generated
	 */
	void setStrValue(String value);

	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(int)
	 * @see org.eclectic.apidesc.ApidescPackage#getSetFeature_IntValue()
	 * @model
	 * @generated
	 */
	int getIntValue();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SetFeature#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(int value);

	/**
	 * Returns the value of the '<em><b>Bool Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Value</em>' attribute.
	 * @see #setBoolValue(boolean)
	 * @see org.eclectic.apidesc.ApidescPackage#getSetFeature_BoolValue()
	 * @model
	 * @generated
	 */
	boolean isBoolValue();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SetFeature#isBoolValue <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Value</em>' attribute.
	 * @see #isBoolValue()
	 * @generated
	 */
	void setBoolValue(boolean value);

} // SetFeature
