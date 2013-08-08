/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.UseDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Delegate#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Delegate#getIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Delegate#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Delegate#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Delegate#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Delegate#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate()
 * @model
 * @generated
 */
public interface Delegate extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.MatchedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate_Left()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedElement> getLeft();

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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate_IsExternal()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsExternal();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Delegate#getIsExternal <em>Is External</em>}' attribute.
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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate_Module()
	 * @model
	 * @generated
	 */
	UseDeclaration getModule();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Delegate#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(UseDeclaration value);

	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate_LinkName()
	 * @model required="true"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Delegate#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Delegate#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getDelegate_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Delegate
