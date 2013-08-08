/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.CodeUnit#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclectic.idc.core.CodeUnit#isMain <em>Main</em>}</li>
 *   <li>{@link org.eclectic.idc.core.CodeUnit#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclectic.idc.core.CodeUnit#getAdditionalModels <em>Additional Models</em>}</li>
 *   <li>{@link org.eclectic.idc.core.CodeUnit#getImportedModels <em>Imported Models</em>}</li>
 *   <li>{@link org.eclectic.idc.core.CodeUnit#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getCodeUnit()
 * @model abstract="true"
 * @generated
 */
public interface CodeUnit extends LocatedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see org.eclectic.idc.core.CorePackage#getCodeUnit_Qualifier()
	 * @model
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.CodeUnit#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see org.eclectic.idc.core.CorePackage#getCodeUnit_Main()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.CodeUnit#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.ModelDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.eclectic.idc.core.CorePackage#getCodeUnit_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelDefinition> getModels();

	/**
	 * Returns the value of the '<em><b>Additional Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.ModelDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Models</em>' containment reference list.
	 * @see org.eclectic.idc.core.CorePackage#getCodeUnit_AdditionalModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelDefinition> getAdditionalModels();

	/**
	 * Returns the value of the '<em><b>Imported Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.ImportedModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Models</em>' containment reference list.
	 * @see org.eclectic.idc.core.CorePackage#getCodeUnit_ImportedModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedModel> getImportedModels();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.RequireDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.eclectic.idc.core.CorePackage#getCodeUnit_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequireDeclaration> getRequires();

} // CodeUnit
