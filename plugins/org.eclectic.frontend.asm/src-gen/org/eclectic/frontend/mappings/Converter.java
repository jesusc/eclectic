/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.UseDeclaration;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Converter#getIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Converter#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Converter#getConverterName <em>Converter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getConverter()
 * @model
 * @generated
 */
public interface Converter extends EObject {
	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(Boolean)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getConverter_IsExternal()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsExternal();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Converter#getIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #getIsExternal()
	 * @generated
	 */
	void setIsExternal(Boolean value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(UseDeclaration)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getConverter_Module()
	 * @model
	 * @generated
	 */
	UseDeclaration getModule();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Converter#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(UseDeclaration value);

	/**
	 * Returns the value of the '<em><b>Converter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converter Name</em>' attribute.
	 * @see #setConverterName(String)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getConverter_ConverterName()
	 * @model required="true"
	 * @generated
	 */
	String getConverterName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Converter#getConverterName <em>Converter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converter Name</em>' attribute.
	 * @see #getConverterName()
	 * @generated
	 */
	void setConverterName(String value);

} // Converter
