/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getInModels <em>In Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getOutModels <em>Out Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getImportedModels <em>Imported Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getInlineModels <em>Inline Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.TransformationDefinition#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition()
 * @model abstract="true"
 * @generated
 */
public interface TransformationDefinition extends ModuleDefinition {
	/**
	 * Returns the value of the '<em><b>In Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.TransformationDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Models</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_InModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationDefinitionParameter> getInModels();

	/**
	 * Returns the value of the '<em><b>Out Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.TransformationDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Models</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_OutModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationDefinitionParameter> getOutModels();

	/**
	 * Returns the value of the '<em><b>Imported Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.ImportedModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Models</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_ImportedModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedModel> getImportedModels();

	/**
	 * Returns the value of the '<em><b>Inline Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.InlineModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Models</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_InlineModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<InlineModel> getInlineModels();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.UseDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseDeclaration> getUses();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.RequireDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getTransformationDefinition_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequireDeclaration> getRequires();

} // TransformationDefinition
