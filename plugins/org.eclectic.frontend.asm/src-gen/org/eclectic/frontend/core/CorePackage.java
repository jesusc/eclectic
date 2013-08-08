/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eclectic_frontend_core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.eclectic.frontend.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.LocatedElementImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__ROW = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__FILE = 2;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.NamedElementImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.DefinitionParameterImpl <em>Definition Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.DefinitionParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getDefinitionParameter()
	 * @generated
	 */
	int DEFINITION_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Definition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ModuleParameterImpl <em>Module Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ModuleParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getModuleParameter()
	 * @generated
	 */
	int MODULE_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARAMETER__NAME = DEFINITION_PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Module Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARAMETER_FEATURE_COUNT = DEFINITION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ModuleDefinitionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getModuleDefinition()
	 * @generated
	 */
	int MODULE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ROW = LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__FILE = LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ANNOTATED_WITH = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.AnnotableElementImpl <em>Annotable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.AnnotableElementImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getAnnotableElement()
	 * @generated
	 */
	int ANNOTABLE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_ELEMENT__ANNOTATED_WITH = 0;

	/**
	 * The number of structural features of the '<em>Annotable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ImplicitlyAnnotableElementImpl <em>Implicitly Annotable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ImplicitlyAnnotableElementImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getImplicitlyAnnotableElement()
	 * @generated
	 */
	int IMPLICITLY_ANNOTABLE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITLY_ANNOTABLE_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Implicitly Annotable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITLY_ANNOTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.AnnotationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.OptimizationsAnnotationImpl <em>Optimizations Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.OptimizationsAnnotationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getOptimizationsAnnotation()
	 * @generated
	 */
	int OPTIMIZATIONS_ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATIONS_ANNOTATION__ANNOTATED_ELEMENT = ANNOTATION__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATIONS_ANNOTATION__ENABLED = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optimizations Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATIONS_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.MetamodelModelAnnotationImpl <em>Metamodel Model Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.MetamodelModelAnnotationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getMetamodelModelAnnotation()
	 * @generated
	 */
	int METAMODEL_MODEL_ANNOTATION = 9;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_MODEL_ANNOTATION__ANNOTATED_ELEMENT = ANNOTATION__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_MODEL_ANNOTATION__METAMODEL = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel Model Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_MODEL_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.SingleAnnotationImpl <em>Single Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.SingleAnnotationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getSingleAnnotation()
	 * @generated
	 */
	int SINGLE_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANNOTATION__ANNOTATED_ELEMENT = ANNOTATION__ANNOTATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Single Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.PotencyAnnotationImpl <em>Potency Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.PotencyAnnotationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPotencyAnnotation()
	 * @generated
	 */
	int POTENCY_ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCY_ANNOTATION__ANNOTATED_ELEMENT = SINGLE_ANNOTATION__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCY_ANNOTATION__VALUE = SINGLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Potency Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCY_ANNOTATION_FEATURE_COUNT = SINGLE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.GenericAnnotationImpl <em>Generic Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.GenericAnnotationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getGenericAnnotation()
	 * @generated
	 */
	int GENERIC_ANNOTATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Generic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.AnnotationParameterImpl <em>Annotation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.AnnotationParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getAnnotationParameter()
	 * @generated
	 */
	int ANNOTATION_PARAMETER = 13;

	/**
	 * The number of structural features of the '<em>Annotation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.RepresentModelImpl <em>Represent Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.RepresentModelImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRepresentModel()
	 * @generated
	 */
	int REPRESENT_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENT_MODEL__ANNOTATED_WITH = ANNOTABLE_ELEMENT__ANNOTATED_WITH;

	/**
	 * The number of structural features of the '<em>Represent Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENT_MODEL_FEATURE_COUNT = ANNOTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl <em>Transformation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TransformationDefinitionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTransformationDefinition()
	 * @generated
	 */
	int TRANSFORMATION_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__ROW = MODULE_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__COLUMN = MODULE_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__FILE = MODULE_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__NAME = MODULE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__ANNOTATED_WITH = MODULE_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__IN_MODELS = MODULE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__OUT_MODELS = MODULE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__IMPORTED_MODELS = MODULE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__INLINE_MODELS = MODULE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__ANNOTATIONS = MODULE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__USES = MODULE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION__REQUIRES = MODULE_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transformation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION_FEATURE_COUNT = MODULE_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.EclecticTransformationDefinitionImpl <em>Eclectic Transformation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.EclecticTransformationDefinitionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getEclecticTransformationDefinition()
	 * @generated
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__ROW = TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__COLUMN = TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__FILE = TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__NAME = TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__ANNOTATED_WITH = TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__IN_MODELS = TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__OUT_MODELS = TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__IMPORTED_MODELS = TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__INLINE_MODELS = TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__ANNOTATIONS = TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__USES = TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__REQUIRES = TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION__TRANSFORMATIONS = TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eclectic Transformation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLECTIC_TRANSFORMATION_DEFINITION_FEATURE_COUNT = TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TransformationDefinitionParameterImpl <em>Transformation Definition Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TransformationDefinitionParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTransformationDefinitionParameter()
	 * @generated
	 */
	int TRANSFORMATION_DEFINITION_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION_PARAMETER__NAME = DEFINITION_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION_PARAMETER__ANNOTATED_WITH = DEFINITION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation Definition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_DEFINITION_PARAMETER_FEATURE_COUNT = DEFINITION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ImportedModelImpl <em>Imported Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ImportedModelImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getImportedModel()
	 * @generated
	 */
	int IMPORTED_MODEL = 18;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__ANNOTATED_WITH = REPRESENT_MODEL__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__NAME = REPRESENT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL_FEATURE_COUNT = REPRESENT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.UseDeclarationImpl <em>Use Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.UseDeclarationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getUseDeclaration()
	 * @generated
	 */
	int USE_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_DECLARATION__ANNOTATED_WITH = REPRESENT_MODEL__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_DECLARATION__MODULE = REPRESENT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_DECLARATION__AS = REPRESENT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Use Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_DECLARATION_FEATURE_COUNT = REPRESENT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.RequireDeclarationImpl <em>Require Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.RequireDeclarationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRequireDeclaration()
	 * @generated
	 */
	int REQUIRE_DECLARATION = 20;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__ANNOTATED_WITH = REPRESENT_MODEL__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__NAME = REPRESENT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__DEFAULT = REPRESENT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__PARAMETERS = REPRESENT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Require Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION_FEATURE_COUNT = REPRESENT_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.RequireParameterImpl <em>Require Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.RequireParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRequireParameter()
	 * @generated
	 */
	int REQUIRE_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Formal Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Require Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.RequireModelParameterImpl <em>Require Model Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.RequireModelParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRequireModelParameter()
	 * @generated
	 */
	int REQUIRE_MODEL_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Formal Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_MODEL_PARAMETER__FORMAL_PARAMETER_NAME = REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_MODEL_PARAMETER__MODEL = REQUIRE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Require Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_MODEL_PARAMETER_FEATURE_COUNT = REQUIRE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.VariableImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.StatementImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 24;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ROW = LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__FILE = LOCATED_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ExpressionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ROW = STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COLUMN = STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__FILE = STATEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.DefineVariableImpl <em>Define Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.DefineVariableImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getDefineVariable()
	 * @generated
	 */
	int DEFINE_VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_VARIABLE__ROW = STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_VARIABLE__COLUMN = STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_VARIABLE__FILE = STATEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_VARIABLE__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_VARIABLE__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Define Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.PropertyWriteImpl <em>Property Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.PropertyWriteImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPropertyWrite()
	 * @generated
	 */
	int PROPERTY_WRITE = 27;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE__PROPERTY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE__RECEPTOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE__EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WRITE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TypeExpressionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTypeExpression()
	 * @generated
	 */
	int TYPE_EXPRESSION = 43;

	/**
	 * The number of structural features of the '<em>Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ClassUseImpl <em>Class Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ClassUseImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getClassUse()
	 * @generated
	 */
	int CLASS_USE = 44;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_USE__ANNOTATIONS = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_USE__MODEL = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_USE__CLASS_NAME = TYPE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strict Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_USE__STRICT_TYPE = TYPE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_USE_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ModelReferenceImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 28;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__ANNOTATIONS = CLASS_USE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__MODEL = CLASS_USE__MODEL;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__CLASS_NAME = CLASS_USE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Strict Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__STRICT_TYPE = CLASS_USE__STRICT_TYPE;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__ROW = CLASS_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__COLUMN = CLASS_USE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__FILE = CLASS_USE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = CLASS_USE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.VariableReferenceImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.MethodCallImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 30;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__RECEPTOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>With Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__WITH_PARAMETERS = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.KeywordMethodCallImpl <em>Keyword Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.KeywordMethodCallImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getKeywordMethodCall()
	 * @generated
	 */
	int KEYWORD_METHOD_CALL = 31;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_METHOD_CALL__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_METHOD_CALL__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_METHOD_CALL__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_METHOD_CALL__RECEPTOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_METHOD_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Keyword Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_METHOD_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.KeywordParameterImpl <em>Keyword Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.KeywordParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getKeywordParameter()
	 * @generated
	 */
	int KEYWORD_PARAMETER = 32;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_PARAMETER__KEYWORD = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Keyword Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.BinaryExprImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getBinaryExpr()
	 * @generated
	 */
	int BINARY_EXPR = 33;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binary Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__BINARY_OP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ClosureDeclarationImpl <em>Closure Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ClosureDeclarationImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getClosureDeclaration()
	 * @generated
	 */
	int CLOSURE_DECLARATION = 34;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DECLARATION__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DECLARATION__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DECLARATION__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DECLARATION__STATEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DECLARATION__FORMAL_PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Closure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DECLARATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ClosureParameterImpl <em>Closure Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ClosureParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getClosureParameter()
	 * @generated
	 */
	int CLOSURE_PARAMETER = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Closure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.ResolveLinkImpl <em>Resolve Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.ResolveLinkImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getResolveLink()
	 * @generated
	 */
	int RESOLVE_LINK = 36;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__IS_EXTERNAL = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__MODULE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__LINK_NAME = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK__FEATURE_NAME = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resolve Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_LINK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.IfExprImpl <em>If Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.IfExprImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getIfExpr()
	 * @generated
	 */
	int IF_EXPR = 37;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR__THEN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elsifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR__ELSIFS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.IfBranchImpl <em>If Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.IfBranchImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getIfBranch()
	 * @generated
	 */
	int IF_BRANCH = 38;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH__STATEMENTS = 1;

	/**
	 * The number of structural features of the '<em>If Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.NumLiteralImpl <em>Num Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.NumLiteralImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getNumLiteral()
	 * @generated
	 */
	int NUM_LITERAL = 39;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_LITERAL__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_LITERAL__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_LITERAL__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.DoubleLiteralImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 40;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.StringLiteralImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 41;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.BooleanLiteralImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 42;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.MatchTraceImpl <em>Match Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.MatchTraceImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getMatchTrace()
	 * @generated
	 */
	int MATCH_TRACE = 56;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TraceCompareExpressionImpl <em>Trace Compare Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TraceCompareExpressionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceCompareExpression()
	 * @generated
	 */
	int TRACE_COMPARE_EXPRESSION = 57;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.PutTraceImpl <em>Put Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.PutTraceImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPutTrace()
	 * @generated
	 */
	int PUT_TRACE = 58;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.PutTraceParameterImpl <em>Put Trace Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.PutTraceParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPutTraceParameter()
	 * @generated
	 */
	int PUT_TRACE_PARAMETER = 59;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TraceUseImpl <em>Trace Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TraceUseImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceUse()
	 * @generated
	 */
	int TRACE_USE = 45;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_USE__TRACE = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_USE_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TypedWithClassImpl <em>Typed With Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TypedWithClassImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTypedWithClass()
	 * @generated
	 */
	int TYPED_WITH_CLASS = 46;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_WITH_CLASS__TYPE_ = 0;

	/**
	 * The number of structural features of the '<em>Typed With Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_WITH_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TraceInterfaceImpl <em>Trace Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TraceInterfaceImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceInterface()
	 * @generated
	 */
	int TRACE_INTERFACE = 47;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE__ROW = MODULE_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE__COLUMN = MODULE_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE__FILE = MODULE_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE__NAME = MODULE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE__ANNOTATED_WITH = MODULE_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE__DEFINITIONS = MODULE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_INTERFACE_FEATURE_COUNT = MODULE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TracedModelParameterImpl <em>Traced Model Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TracedModelParameterImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTracedModelParameter()
	 * @generated
	 */
	int TRACED_MODEL_PARAMETER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_PARAMETER__NAME = DEFINITION_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_PARAMETER__ANNOTATED_WITH = DEFINITION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_PARAMETER_FEATURE_COUNT = DEFINITION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TraceDefinitionImpl <em>Trace Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TraceDefinitionImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceDefinition()
	 * @generated
	 */
	int TRACE_DEFINITION = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DEFINITION__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.TraceElementImpl <em>Trace Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.TraceElementImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceElement()
	 * @generated
	 */
	int TRACE_ELEMENT = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.InlineModelImpl <em>Inline Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.InlineModelImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineModel()
	 * @generated
	 */
	int INLINE_MODEL = 51;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__ROW = MODULE_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__COLUMN = MODULE_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__FILE = MODULE_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__NAME = MODULE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__ANNOTATED_WITH = MODULE_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__CLASSES = MODULE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL_FEATURE_COUNT = MODULE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.InlineClassImpl <em>Inline Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.InlineClassImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineClass()
	 * @generated
	 */
	int INLINE_CLASS = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.InlineFeatureImpl <em>Inline Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.InlineFeatureImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineFeature()
	 * @generated
	 */
	int INLINE_FEATURE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE__MULTIVALUED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inline Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.InlineAttributeImpl <em>Inline Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.InlineAttributeImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineAttribute()
	 * @generated
	 */
	int INLINE_ATTRIBUTE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ATTRIBUTE__NAME = INLINE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ATTRIBUTE__TYPE = INLINE_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ATTRIBUTE__MULTIVALUED = INLINE_FEATURE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Inline Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ATTRIBUTE_FEATURE_COUNT = INLINE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.impl.InlineReferenceImpl <em>Inline Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.impl.InlineReferenceImpl
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineReference()
	 * @generated
	 */
	int INLINE_REFERENCE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_REFERENCE__NAME = INLINE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_REFERENCE__TYPE = INLINE_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_REFERENCE__MULTIVALUED = INLINE_FEATURE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Inline Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_REFERENCE_FEATURE_COUNT = INLINE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE__TRACE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trace Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE__TRACE_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE__CARDINALITY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Match Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TRACE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multivalued Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG = 0;

	/**
	 * The feature id for the '<em><b>Trace Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMPARE_EXPRESSION__TRACE_VAR = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMPARE_EXPRESSION__EXPR = 2;

	/**
	 * The number of structural features of the '<em>Trace Compare Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMPARE_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE__ROW = EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE__COLUMN = EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE__FILE = EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE__TRACE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Put Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE_PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Trace Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE_PARAMETER__TRACE_VAR = 1;

	/**
	 * The number of structural features of the '<em>Put Trace Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_TRACE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.BinaryOp <em>Binary Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.BinaryOp
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 60;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.core.ResolveTraceCardinality <em>Resolve Trace Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.core.ResolveTraceCardinality
	 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getResolveTraceCardinality()
	 * @generated
	 */
	int RESOLVE_TRACE_CARDINALITY = 61;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see org.eclectic.frontend.core.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.LocatedElement#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.eclectic.frontend.core.LocatedElement#getRow()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.LocatedElement#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclectic.frontend.core.LocatedElement#getColumn()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.LocatedElement#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclectic.frontend.core.LocatedElement#getFile()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_File();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclectic.frontend.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.DefinitionParameter <em>Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parameter</em>'.
	 * @see org.eclectic.frontend.core.DefinitionParameter
	 * @generated
	 */
	EClass getDefinitionParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ModuleParameter <em>Module Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Parameter</em>'.
	 * @see org.eclectic.frontend.core.ModuleParameter
	 * @generated
	 */
	EClass getModuleParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Definition</em>'.
	 * @see org.eclectic.frontend.core.ModuleDefinition
	 * @generated
	 */
	EClass getModuleDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.AnnotableElement <em>Annotable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable Element</em>'.
	 * @see org.eclectic.frontend.core.AnnotableElement
	 * @generated
	 */
	EClass getAnnotableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.frontend.core.AnnotableElement#getAnnotatedWith <em>Annotated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated With</em>'.
	 * @see org.eclectic.frontend.core.AnnotableElement#getAnnotatedWith()
	 * @see #getAnnotableElement()
	 * @generated
	 */
	EReference getAnnotableElement_AnnotatedWith();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ImplicitlyAnnotableElement <em>Implicitly Annotable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicitly Annotable Element</em>'.
	 * @see org.eclectic.frontend.core.ImplicitlyAnnotableElement
	 * @generated
	 */
	EClass getImplicitlyAnnotableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.ImplicitlyAnnotableElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.eclectic.frontend.core.ImplicitlyAnnotableElement#getAnnotations()
	 * @see #getImplicitlyAnnotableElement()
	 * @generated
	 */
	EReference getImplicitlyAnnotableElement_Annotations();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclectic.frontend.core.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.Annotation#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Element</em>'.
	 * @see org.eclectic.frontend.core.Annotation#getAnnotatedElement()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotatedElement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.OptimizationsAnnotation <em>Optimizations Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimizations Annotation</em>'.
	 * @see org.eclectic.frontend.core.OptimizationsAnnotation
	 * @generated
	 */
	EClass getOptimizationsAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.OptimizationsAnnotation#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclectic.frontend.core.OptimizationsAnnotation#isEnabled()
	 * @see #getOptimizationsAnnotation()
	 * @generated
	 */
	EAttribute getOptimizationsAnnotation_Enabled();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.MetamodelModelAnnotation <em>Metamodel Model Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Model Annotation</em>'.
	 * @see org.eclectic.frontend.core.MetamodelModelAnnotation
	 * @generated
	 */
	EClass getMetamodelModelAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.MetamodelModelAnnotation#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see org.eclectic.frontend.core.MetamodelModelAnnotation#getMetamodel()
	 * @see #getMetamodelModelAnnotation()
	 * @generated
	 */
	EAttribute getMetamodelModelAnnotation_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.SingleAnnotation <em>Single Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Annotation</em>'.
	 * @see org.eclectic.frontend.core.SingleAnnotation
	 * @generated
	 */
	EClass getSingleAnnotation();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.PotencyAnnotation <em>Potency Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potency Annotation</em>'.
	 * @see org.eclectic.frontend.core.PotencyAnnotation
	 * @generated
	 */
	EClass getPotencyAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.PotencyAnnotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.PotencyAnnotation#getValue()
	 * @see #getPotencyAnnotation()
	 * @generated
	 */
	EAttribute getPotencyAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.GenericAnnotation <em>Generic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Annotation</em>'.
	 * @see org.eclectic.frontend.core.GenericAnnotation
	 * @generated
	 */
	EClass getGenericAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.GenericAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.core.GenericAnnotation#getName()
	 * @see #getGenericAnnotation()
	 * @generated
	 */
	EAttribute getGenericAnnotation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.GenericAnnotation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.core.GenericAnnotation#getParameters()
	 * @see #getGenericAnnotation()
	 * @generated
	 */
	EReference getGenericAnnotation_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.AnnotationParameter <em>Annotation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Parameter</em>'.
	 * @see org.eclectic.frontend.core.AnnotationParameter
	 * @generated
	 */
	EClass getAnnotationParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.RepresentModel <em>Represent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Represent Model</em>'.
	 * @see org.eclectic.frontend.core.RepresentModel
	 * @generated
	 */
	EClass getRepresentModel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TransformationDefinition <em>Transformation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Definition</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition
	 * @generated
	 */
	EClass getTransformationDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getInModels <em>In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Models</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getInModels()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_InModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getOutModels <em>Out Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Models</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getOutModels()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_OutModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getImportedModels <em>Imported Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Models</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getImportedModels()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_ImportedModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getInlineModels <em>Inline Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inline Models</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getInlineModels()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_InlineModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getAnnotations()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getUses()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TransformationDefinition#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinition#getRequires()
	 * @see #getTransformationDefinition()
	 * @generated
	 */
	EReference getTransformationDefinition_Requires();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.EclecticTransformationDefinition <em>Eclectic Transformation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclectic Transformation Definition</em>'.
	 * @see org.eclectic.frontend.core.EclecticTransformationDefinition
	 * @generated
	 */
	EClass getEclecticTransformationDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.EclecticTransformationDefinition#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.eclectic.frontend.core.EclecticTransformationDefinition#getTransformations()
	 * @see #getEclecticTransformationDefinition()
	 * @generated
	 */
	EReference getEclecticTransformationDefinition_Transformations();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TransformationDefinitionParameter <em>Transformation Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Definition Parameter</em>'.
	 * @see org.eclectic.frontend.core.TransformationDefinitionParameter
	 * @generated
	 */
	EClass getTransformationDefinitionParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ImportedModel <em>Imported Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Model</em>'.
	 * @see org.eclectic.frontend.core.ImportedModel
	 * @generated
	 */
	EClass getImportedModel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.UseDeclaration <em>Use Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Declaration</em>'.
	 * @see org.eclectic.frontend.core.UseDeclaration
	 * @generated
	 */
	EClass getUseDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.UseDeclaration#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see org.eclectic.frontend.core.UseDeclaration#getModule()
	 * @see #getUseDeclaration()
	 * @generated
	 */
	EAttribute getUseDeclaration_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.UseDeclaration#getAs <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As</em>'.
	 * @see org.eclectic.frontend.core.UseDeclaration#getAs()
	 * @see #getUseDeclaration()
	 * @generated
	 */
	EAttribute getUseDeclaration_As();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.RequireDeclaration <em>Require Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Declaration</em>'.
	 * @see org.eclectic.frontend.core.RequireDeclaration
	 * @generated
	 */
	EClass getRequireDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.RequireDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.core.RequireDeclaration#getName()
	 * @see #getRequireDeclaration()
	 * @generated
	 */
	EAttribute getRequireDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.RequireDeclaration#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclectic.frontend.core.RequireDeclaration#getDefault()
	 * @see #getRequireDeclaration()
	 * @generated
	 */
	EAttribute getRequireDeclaration_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.RequireDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.core.RequireDeclaration#getParameters()
	 * @see #getRequireDeclaration()
	 * @generated
	 */
	EReference getRequireDeclaration_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.RequireParameter <em>Require Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Parameter</em>'.
	 * @see org.eclectic.frontend.core.RequireParameter
	 * @generated
	 */
	EClass getRequireParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.RequireParameter#getFormalParameterName <em>Formal Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter Name</em>'.
	 * @see org.eclectic.frontend.core.RequireParameter#getFormalParameterName()
	 * @see #getRequireParameter()
	 * @generated
	 */
	EAttribute getRequireParameter_FormalParameterName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.RequireModelParameter <em>Require Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Model Parameter</em>'.
	 * @see org.eclectic.frontend.core.RequireModelParameter
	 * @generated
	 */
	EClass getRequireModelParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.RequireModelParameter#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.frontend.core.RequireModelParameter#getModel()
	 * @see #getRequireModelParameter()
	 * @generated
	 */
	EReference getRequireModelParameter_Model();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclectic.frontend.core.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.core.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclectic.frontend.core.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclectic.frontend.core.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.DefineVariable <em>Define Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Variable</em>'.
	 * @see org.eclectic.frontend.core.DefineVariable
	 * @generated
	 */
	EClass getDefineVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.DefineVariable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclectic.frontend.core.DefineVariable#getExpression()
	 * @see #getDefineVariable()
	 * @generated
	 */
	EReference getDefineVariable_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.PropertyWrite <em>Property Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Write</em>'.
	 * @see org.eclectic.frontend.core.PropertyWrite
	 * @generated
	 */
	EClass getPropertyWrite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.PropertyWrite#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.eclectic.frontend.core.PropertyWrite#getProperty()
	 * @see #getPropertyWrite()
	 * @generated
	 */
	EAttribute getPropertyWrite_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.PropertyWrite#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receptor</em>'.
	 * @see org.eclectic.frontend.core.PropertyWrite#getReceptor()
	 * @see #getPropertyWrite()
	 * @generated
	 */
	EReference getPropertyWrite_Receptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.PropertyWrite#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclectic.frontend.core.PropertyWrite#getExpression()
	 * @see #getPropertyWrite()
	 * @generated
	 */
	EReference getPropertyWrite_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.eclectic.frontend.core.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see org.eclectic.frontend.core.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.VariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclectic.frontend.core.VariableReference#getVariable()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Variable();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see org.eclectic.frontend.core.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.MethodCall#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receptor</em>'.
	 * @see org.eclectic.frontend.core.MethodCall#getReceptor()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Receptor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.MethodCall#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclectic.frontend.core.MethodCall#getMethodName()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_MethodName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.MethodCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.core.MethodCall#getParameters()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.MethodCall#isWithParameters <em>With Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Parameters</em>'.
	 * @see org.eclectic.frontend.core.MethodCall#isWithParameters()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_WithParameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.KeywordMethodCall <em>Keyword Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Method Call</em>'.
	 * @see org.eclectic.frontend.core.KeywordMethodCall
	 * @generated
	 */
	EClass getKeywordMethodCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.KeywordMethodCall#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receptor</em>'.
	 * @see org.eclectic.frontend.core.KeywordMethodCall#getReceptor()
	 * @see #getKeywordMethodCall()
	 * @generated
	 */
	EReference getKeywordMethodCall_Receptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.KeywordMethodCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.core.KeywordMethodCall#getParameters()
	 * @see #getKeywordMethodCall()
	 * @generated
	 */
	EReference getKeywordMethodCall_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.KeywordParameter <em>Keyword Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Parameter</em>'.
	 * @see org.eclectic.frontend.core.KeywordParameter
	 * @generated
	 */
	EClass getKeywordParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.KeywordParameter#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.eclectic.frontend.core.KeywordParameter#getKeyword()
	 * @see #getKeywordParameter()
	 * @generated
	 */
	EAttribute getKeywordParameter_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.KeywordParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.KeywordParameter#getValue()
	 * @see #getKeywordParameter()
	 * @generated
	 */
	EReference getKeywordParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.BinaryExpr <em>Binary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expr</em>'.
	 * @see org.eclectic.frontend.core.BinaryExpr
	 * @generated
	 */
	EClass getBinaryExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.BinaryExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.eclectic.frontend.core.BinaryExpr#getLeft()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EReference getBinaryExpr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.BinaryExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.eclectic.frontend.core.BinaryExpr#getRight()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EReference getBinaryExpr_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.BinaryExpr#getBinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Op</em>'.
	 * @see org.eclectic.frontend.core.BinaryExpr#getBinaryOp()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EAttribute getBinaryExpr_BinaryOp();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ClosureDeclaration <em>Closure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closure Declaration</em>'.
	 * @see org.eclectic.frontend.core.ClosureDeclaration
	 * @generated
	 */
	EClass getClosureDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.ClosureDeclaration#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.core.ClosureDeclaration#getStatements()
	 * @see #getClosureDeclaration()
	 * @generated
	 */
	EReference getClosureDeclaration_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.ClosureDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see org.eclectic.frontend.core.ClosureDeclaration#getFormalParameters()
	 * @see #getClosureDeclaration()
	 * @generated
	 */
	EReference getClosureDeclaration_FormalParameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ClosureParameter <em>Closure Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closure Parameter</em>'.
	 * @see org.eclectic.frontend.core.ClosureParameter
	 * @generated
	 */
	EClass getClosureParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ResolveLink <em>Resolve Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Link</em>'.
	 * @see org.eclectic.frontend.core.ResolveLink
	 * @generated
	 */
	EClass getResolveLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.ResolveLink#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclectic.frontend.core.ResolveLink#getExpr()
	 * @see #getResolveLink()
	 * @generated
	 */
	EReference getResolveLink_Expr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.ResolveLink#getIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see org.eclectic.frontend.core.ResolveLink#getIsExternal()
	 * @see #getResolveLink()
	 * @generated
	 */
	EAttribute getResolveLink_IsExternal();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.ResolveLink#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.eclectic.frontend.core.ResolveLink#getModule()
	 * @see #getResolveLink()
	 * @generated
	 */
	EReference getResolveLink_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.ResolveLink#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.eclectic.frontend.core.ResolveLink#getLinkName()
	 * @see #getResolveLink()
	 * @generated
	 */
	EAttribute getResolveLink_LinkName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.ResolveLink#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.frontend.core.ResolveLink#getFeatureName()
	 * @see #getResolveLink()
	 * @generated
	 */
	EAttribute getResolveLink_FeatureName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.IfExpr <em>If Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expr</em>'.
	 * @see org.eclectic.frontend.core.IfExpr
	 * @generated
	 */
	EClass getIfExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.IfExpr#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclectic.frontend.core.IfExpr#getThen()
	 * @see #getIfExpr()
	 * @generated
	 */
	EReference getIfExpr_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.IfExpr#getElsifs <em>Elsifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsifs</em>'.
	 * @see org.eclectic.frontend.core.IfExpr#getElsifs()
	 * @see #getIfExpr()
	 * @generated
	 */
	EReference getIfExpr_Elsifs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.IfExpr#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclectic.frontend.core.IfExpr#getElse()
	 * @see #getIfExpr()
	 * @generated
	 */
	EReference getIfExpr_Else();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.IfBranch <em>If Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Branch</em>'.
	 * @see org.eclectic.frontend.core.IfBranch
	 * @generated
	 */
	EClass getIfBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.IfBranch#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclectic.frontend.core.IfBranch#getCondition()
	 * @see #getIfBranch()
	 * @generated
	 */
	EReference getIfBranch_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.IfBranch#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.core.IfBranch#getStatements()
	 * @see #getIfBranch()
	 * @generated
	 */
	EReference getIfBranch_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.NumLiteral <em>Num Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Literal</em>'.
	 * @see org.eclectic.frontend.core.NumLiteral
	 * @generated
	 */
	EClass getNumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.NumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.NumLiteral#getValue()
	 * @see #getNumLiteral()
	 * @generated
	 */
	EAttribute getNumLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see org.eclectic.frontend.core.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.DoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.DoubleLiteral#getValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclectic.frontend.core.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.eclectic.frontend.core.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.MatchTrace <em>Match Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Trace</em>'.
	 * @see org.eclectic.frontend.core.MatchTrace
	 * @generated
	 */
	EClass getMatchTrace();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.MatchTrace#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see org.eclectic.frontend.core.MatchTrace#getTrace()
	 * @see #getMatchTrace()
	 * @generated
	 */
	EReference getMatchTrace_Trace();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.MatchTrace#getTraceExpr <em>Trace Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace Expr</em>'.
	 * @see org.eclectic.frontend.core.MatchTrace#getTraceExpr()
	 * @see #getMatchTrace()
	 * @generated
	 */
	EReference getMatchTrace_TraceExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.MatchTrace#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclectic.frontend.core.MatchTrace#getCardinality()
	 * @see #getMatchTrace()
	 * @generated
	 */
	EAttribute getMatchTrace_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TraceCompareExpression <em>Trace Compare Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Compare Expression</em>'.
	 * @see org.eclectic.frontend.core.TraceCompareExpression
	 * @generated
	 */
	EClass getTraceCompareExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.TraceCompareExpression#isMultivaluedTag <em>Multivalued Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued Tag</em>'.
	 * @see org.eclectic.frontend.core.TraceCompareExpression#isMultivaluedTag()
	 * @see #getTraceCompareExpression()
	 * @generated
	 */
	EAttribute getTraceCompareExpression_MultivaluedTag();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.TraceCompareExpression#getTraceVar <em>Trace Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace Var</em>'.
	 * @see org.eclectic.frontend.core.TraceCompareExpression#getTraceVar()
	 * @see #getTraceCompareExpression()
	 * @generated
	 */
	EReference getTraceCompareExpression_TraceVar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.TraceCompareExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclectic.frontend.core.TraceCompareExpression#getExpr()
	 * @see #getTraceCompareExpression()
	 * @generated
	 */
	EReference getTraceCompareExpression_Expr();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.PutTrace <em>Put Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Put Trace</em>'.
	 * @see org.eclectic.frontend.core.PutTrace
	 * @generated
	 */
	EClass getPutTrace();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.PutTrace#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see org.eclectic.frontend.core.PutTrace#getTrace()
	 * @see #getPutTrace()
	 * @generated
	 */
	EReference getPutTrace_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.PutTrace#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.core.PutTrace#getParameters()
	 * @see #getPutTrace()
	 * @generated
	 */
	EReference getPutTrace_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.PutTraceParameter <em>Put Trace Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Put Trace Parameter</em>'.
	 * @see org.eclectic.frontend.core.PutTraceParameter
	 * @generated
	 */
	EClass getPutTraceParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.PutTraceParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclectic.frontend.core.PutTraceParameter#getValue()
	 * @see #getPutTraceParameter()
	 * @generated
	 */
	EReference getPutTraceParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.PutTraceParameter#getTraceVar <em>Trace Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace Var</em>'.
	 * @see org.eclectic.frontend.core.PutTraceParameter#getTraceVar()
	 * @see #getPutTraceParameter()
	 * @generated
	 */
	EReference getPutTraceParameter_TraceVar();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TypeExpression <em>Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Expression</em>'.
	 * @see org.eclectic.frontend.core.TypeExpression
	 * @generated
	 */
	EClass getTypeExpression();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.ClassUse <em>Class Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Use</em>'.
	 * @see org.eclectic.frontend.core.ClassUse
	 * @generated
	 */
	EClass getClassUse();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.ClassUse#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.frontend.core.ClassUse#getModel()
	 * @see #getClassUse()
	 * @generated
	 */
	EReference getClassUse_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.ClassUse#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclectic.frontend.core.ClassUse#getClassName()
	 * @see #getClassUse()
	 * @generated
	 */
	EAttribute getClassUse_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.ClassUse#isStrictType <em>Strict Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Type</em>'.
	 * @see org.eclectic.frontend.core.ClassUse#isStrictType()
	 * @see #getClassUse()
	 * @generated
	 */
	EAttribute getClassUse_StrictType();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TraceUse <em>Trace Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Use</em>'.
	 * @see org.eclectic.frontend.core.TraceUse
	 * @generated
	 */
	EClass getTraceUse();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.core.TraceUse#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see org.eclectic.frontend.core.TraceUse#getTrace()
	 * @see #getTraceUse()
	 * @generated
	 */
	EReference getTraceUse_Trace();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TypedWithClass <em>Typed With Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed With Class</em>'.
	 * @see org.eclectic.frontend.core.TypedWithClass
	 * @generated
	 */
	EClass getTypedWithClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.TypedWithClass#getType_ <em>Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type </em>'.
	 * @see org.eclectic.frontend.core.TypedWithClass#getType_()
	 * @see #getTypedWithClass()
	 * @generated
	 */
	EReference getTypedWithClass_Type_();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TraceInterface <em>Trace Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Interface</em>'.
	 * @see org.eclectic.frontend.core.TraceInterface
	 * @generated
	 */
	EClass getTraceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TraceInterface#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.eclectic.frontend.core.TraceInterface#getDefinitions()
	 * @see #getTraceInterface()
	 * @generated
	 */
	EReference getTraceInterface_Definitions();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TracedModelParameter <em>Traced Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Model Parameter</em>'.
	 * @see org.eclectic.frontend.core.TracedModelParameter
	 * @generated
	 */
	EClass getTracedModelParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TraceDefinition <em>Trace Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Definition</em>'.
	 * @see org.eclectic.frontend.core.TraceDefinition
	 * @generated
	 */
	EClass getTraceDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.TraceDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclectic.frontend.core.TraceDefinition#getElements()
	 * @see #getTraceDefinition()
	 * @generated
	 */
	EReference getTraceDefinition_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.TraceElement <em>Trace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Element</em>'.
	 * @see org.eclectic.frontend.core.TraceElement
	 * @generated
	 */
	EClass getTraceElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.TraceElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.core.TraceElement#getType()
	 * @see #getTraceElement()
	 * @generated
	 */
	EReference getTraceElement_Type();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.InlineModel <em>Inline Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Model</em>'.
	 * @see org.eclectic.frontend.core.InlineModel
	 * @generated
	 */
	EClass getInlineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.InlineModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.eclectic.frontend.core.InlineModel#getClasses()
	 * @see #getInlineModel()
	 * @generated
	 */
	EReference getInlineModel_Classes();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.InlineClass <em>Inline Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Class</em>'.
	 * @see org.eclectic.frontend.core.InlineClass
	 * @generated
	 */
	EClass getInlineClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.core.InlineClass#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclectic.frontend.core.InlineClass#getFeatures()
	 * @see #getInlineClass()
	 * @generated
	 */
	EReference getInlineClass_Features();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.InlineFeature <em>Inline Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Feature</em>'.
	 * @see org.eclectic.frontend.core.InlineFeature
	 * @generated
	 */
	EClass getInlineFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.core.InlineFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.core.InlineFeature#getType()
	 * @see #getInlineFeature()
	 * @generated
	 */
	EReference getInlineFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.core.InlineFeature#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see org.eclectic.frontend.core.InlineFeature#isMultivalued()
	 * @see #getInlineFeature()
	 * @generated
	 */
	EAttribute getInlineFeature_Multivalued();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.InlineAttribute <em>Inline Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Attribute</em>'.
	 * @see org.eclectic.frontend.core.InlineAttribute
	 * @generated
	 */
	EClass getInlineAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.core.InlineReference <em>Inline Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Reference</em>'.
	 * @see org.eclectic.frontend.core.InlineReference
	 * @generated
	 */
	EClass getInlineReference();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.frontend.core.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Op</em>'.
	 * @see org.eclectic.frontend.core.BinaryOp
	 * @generated
	 */
	EEnum getBinaryOp();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.frontend.core.ResolveTraceCardinality <em>Resolve Trace Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolve Trace Cardinality</em>'.
	 * @see org.eclectic.frontend.core.ResolveTraceCardinality
	 * @generated
	 */
	EEnum getResolveTraceCardinality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.LocatedElementImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__ROW = eINSTANCE.getLocatedElement_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COLUMN = eINSTANCE.getLocatedElement_Column();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__FILE = eINSTANCE.getLocatedElement_File();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.NamedElementImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.DefinitionParameterImpl <em>Definition Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.DefinitionParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getDefinitionParameter()
		 * @generated
		 */
		EClass DEFINITION_PARAMETER = eINSTANCE.getDefinitionParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ModuleParameterImpl <em>Module Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ModuleParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getModuleParameter()
		 * @generated
		 */
		EClass MODULE_PARAMETER = eINSTANCE.getModuleParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ModuleDefinitionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getModuleDefinition()
		 * @generated
		 */
		EClass MODULE_DEFINITION = eINSTANCE.getModuleDefinition();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.AnnotableElementImpl <em>Annotable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.AnnotableElementImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getAnnotableElement()
		 * @generated
		 */
		EClass ANNOTABLE_ELEMENT = eINSTANCE.getAnnotableElement();

		/**
		 * The meta object literal for the '<em><b>Annotated With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTABLE_ELEMENT__ANNOTATED_WITH = eINSTANCE.getAnnotableElement_AnnotatedWith();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ImplicitlyAnnotableElementImpl <em>Implicitly Annotable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ImplicitlyAnnotableElementImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getImplicitlyAnnotableElement()
		 * @generated
		 */
		EClass IMPLICITLY_ANNOTABLE_ELEMENT = eINSTANCE.getImplicitlyAnnotableElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICITLY_ANNOTABLE_ELEMENT__ANNOTATIONS = eINSTANCE.getImplicitlyAnnotableElement_Annotations();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.AnnotationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATED_ELEMENT = eINSTANCE.getAnnotation_AnnotatedElement();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.OptimizationsAnnotationImpl <em>Optimizations Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.OptimizationsAnnotationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getOptimizationsAnnotation()
		 * @generated
		 */
		EClass OPTIMIZATIONS_ANNOTATION = eINSTANCE.getOptimizationsAnnotation();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATIONS_ANNOTATION__ENABLED = eINSTANCE.getOptimizationsAnnotation_Enabled();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.MetamodelModelAnnotationImpl <em>Metamodel Model Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.MetamodelModelAnnotationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getMetamodelModelAnnotation()
		 * @generated
		 */
		EClass METAMODEL_MODEL_ANNOTATION = eINSTANCE.getMetamodelModelAnnotation();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_MODEL_ANNOTATION__METAMODEL = eINSTANCE.getMetamodelModelAnnotation_Metamodel();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.SingleAnnotationImpl <em>Single Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.SingleAnnotationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getSingleAnnotation()
		 * @generated
		 */
		EClass SINGLE_ANNOTATION = eINSTANCE.getSingleAnnotation();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.PotencyAnnotationImpl <em>Potency Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.PotencyAnnotationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPotencyAnnotation()
		 * @generated
		 */
		EClass POTENCY_ANNOTATION = eINSTANCE.getPotencyAnnotation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTENCY_ANNOTATION__VALUE = eINSTANCE.getPotencyAnnotation_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.GenericAnnotationImpl <em>Generic Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.GenericAnnotationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getGenericAnnotation()
		 * @generated
		 */
		EClass GENERIC_ANNOTATION = eINSTANCE.getGenericAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ANNOTATION__NAME = eINSTANCE.getGenericAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ANNOTATION__PARAMETERS = eINSTANCE.getGenericAnnotation_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.AnnotationParameterImpl <em>Annotation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.AnnotationParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getAnnotationParameter()
		 * @generated
		 */
		EClass ANNOTATION_PARAMETER = eINSTANCE.getAnnotationParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.RepresentModelImpl <em>Represent Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.RepresentModelImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRepresentModel()
		 * @generated
		 */
		EClass REPRESENT_MODEL = eINSTANCE.getRepresentModel();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TransformationDefinitionImpl <em>Transformation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TransformationDefinitionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTransformationDefinition()
		 * @generated
		 */
		EClass TRANSFORMATION_DEFINITION = eINSTANCE.getTransformationDefinition();

		/**
		 * The meta object literal for the '<em><b>In Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__IN_MODELS = eINSTANCE.getTransformationDefinition_InModels();

		/**
		 * The meta object literal for the '<em><b>Out Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__OUT_MODELS = eINSTANCE.getTransformationDefinition_OutModels();

		/**
		 * The meta object literal for the '<em><b>Imported Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__IMPORTED_MODELS = eINSTANCE.getTransformationDefinition_ImportedModels();

		/**
		 * The meta object literal for the '<em><b>Inline Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__INLINE_MODELS = eINSTANCE.getTransformationDefinition_InlineModels();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__ANNOTATIONS = eINSTANCE.getTransformationDefinition_Annotations();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__USES = eINSTANCE.getTransformationDefinition_Uses();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_DEFINITION__REQUIRES = eINSTANCE.getTransformationDefinition_Requires();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.EclecticTransformationDefinitionImpl <em>Eclectic Transformation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.EclecticTransformationDefinitionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getEclecticTransformationDefinition()
		 * @generated
		 */
		EClass ECLECTIC_TRANSFORMATION_DEFINITION = eINSTANCE.getEclecticTransformationDefinition();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLECTIC_TRANSFORMATION_DEFINITION__TRANSFORMATIONS = eINSTANCE.getEclecticTransformationDefinition_Transformations();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TransformationDefinitionParameterImpl <em>Transformation Definition Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TransformationDefinitionParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTransformationDefinitionParameter()
		 * @generated
		 */
		EClass TRANSFORMATION_DEFINITION_PARAMETER = eINSTANCE.getTransformationDefinitionParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ImportedModelImpl <em>Imported Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ImportedModelImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getImportedModel()
		 * @generated
		 */
		EClass IMPORTED_MODEL = eINSTANCE.getImportedModel();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.UseDeclarationImpl <em>Use Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.UseDeclarationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getUseDeclaration()
		 * @generated
		 */
		EClass USE_DECLARATION = eINSTANCE.getUseDeclaration();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_DECLARATION__MODULE = eINSTANCE.getUseDeclaration_Module();

		/**
		 * The meta object literal for the '<em><b>As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_DECLARATION__AS = eINSTANCE.getUseDeclaration_As();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.RequireDeclarationImpl <em>Require Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.RequireDeclarationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRequireDeclaration()
		 * @generated
		 */
		EClass REQUIRE_DECLARATION = eINSTANCE.getRequireDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_DECLARATION__NAME = eINSTANCE.getRequireDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_DECLARATION__DEFAULT = eINSTANCE.getRequireDeclaration_Default();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_DECLARATION__PARAMETERS = eINSTANCE.getRequireDeclaration_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.RequireParameterImpl <em>Require Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.RequireParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRequireParameter()
		 * @generated
		 */
		EClass REQUIRE_PARAMETER = eINSTANCE.getRequireParameter();

		/**
		 * The meta object literal for the '<em><b>Formal Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME = eINSTANCE.getRequireParameter_FormalParameterName();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.RequireModelParameterImpl <em>Require Model Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.RequireModelParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getRequireModelParameter()
		 * @generated
		 */
		EClass REQUIRE_MODEL_PARAMETER = eINSTANCE.getRequireModelParameter();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_MODEL_PARAMETER__MODEL = eINSTANCE.getRequireModelParameter_Model();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.VariableImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.StatementImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ExpressionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.DefineVariableImpl <em>Define Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.DefineVariableImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getDefineVariable()
		 * @generated
		 */
		EClass DEFINE_VARIABLE = eINSTANCE.getDefineVariable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_VARIABLE__EXPRESSION = eINSTANCE.getDefineVariable_Expression();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.PropertyWriteImpl <em>Property Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.PropertyWriteImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPropertyWrite()
		 * @generated
		 */
		EClass PROPERTY_WRITE = eINSTANCE.getPropertyWrite();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_WRITE__PROPERTY = eINSTANCE.getPropertyWrite_Property();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_WRITE__RECEPTOR = eINSTANCE.getPropertyWrite_Receptor();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_WRITE__EXPRESSION = eINSTANCE.getPropertyWrite_Expression();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ModelReferenceImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.VariableReferenceImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getVariableReference_Variable();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.MethodCallImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__RECEPTOR = eINSTANCE.getMethodCall_Receptor();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL__METHOD_NAME = eINSTANCE.getMethodCall_MethodName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__PARAMETERS = eINSTANCE.getMethodCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>With Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL__WITH_PARAMETERS = eINSTANCE.getMethodCall_WithParameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.KeywordMethodCallImpl <em>Keyword Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.KeywordMethodCallImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getKeywordMethodCall()
		 * @generated
		 */
		EClass KEYWORD_METHOD_CALL = eINSTANCE.getKeywordMethodCall();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORD_METHOD_CALL__RECEPTOR = eINSTANCE.getKeywordMethodCall_Receptor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORD_METHOD_CALL__PARAMETERS = eINSTANCE.getKeywordMethodCall_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.KeywordParameterImpl <em>Keyword Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.KeywordParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getKeywordParameter()
		 * @generated
		 */
		EClass KEYWORD_PARAMETER = eINSTANCE.getKeywordParameter();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_PARAMETER__KEYWORD = eINSTANCE.getKeywordParameter_Keyword();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORD_PARAMETER__VALUE = eINSTANCE.getKeywordParameter_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.BinaryExprImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getBinaryExpr()
		 * @generated
		 */
		EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

		/**
		 * The meta object literal for the '<em><b>Binary Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPR__BINARY_OP = eINSTANCE.getBinaryExpr_BinaryOp();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ClosureDeclarationImpl <em>Closure Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ClosureDeclarationImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getClosureDeclaration()
		 * @generated
		 */
		EClass CLOSURE_DECLARATION = eINSTANCE.getClosureDeclaration();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSURE_DECLARATION__STATEMENTS = eINSTANCE.getClosureDeclaration_Statements();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSURE_DECLARATION__FORMAL_PARAMETERS = eINSTANCE.getClosureDeclaration_FormalParameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ClosureParameterImpl <em>Closure Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ClosureParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getClosureParameter()
		 * @generated
		 */
		EClass CLOSURE_PARAMETER = eINSTANCE.getClosureParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ResolveLinkImpl <em>Resolve Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ResolveLinkImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getResolveLink()
		 * @generated
		 */
		EClass RESOLVE_LINK = eINSTANCE.getResolveLink();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_LINK__EXPR = eINSTANCE.getResolveLink_Expr();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_LINK__IS_EXTERNAL = eINSTANCE.getResolveLink_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_LINK__MODULE = eINSTANCE.getResolveLink_Module();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_LINK__LINK_NAME = eINSTANCE.getResolveLink_LinkName();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_LINK__FEATURE_NAME = eINSTANCE.getResolveLink_FeatureName();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.IfExprImpl <em>If Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.IfExprImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getIfExpr()
		 * @generated
		 */
		EClass IF_EXPR = eINSTANCE.getIfExpr();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPR__THEN = eINSTANCE.getIfExpr_Then();

		/**
		 * The meta object literal for the '<em><b>Elsifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPR__ELSIFS = eINSTANCE.getIfExpr_Elsifs();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPR__ELSE = eINSTANCE.getIfExpr_Else();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.IfBranchImpl <em>If Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.IfBranchImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getIfBranch()
		 * @generated
		 */
		EClass IF_BRANCH = eINSTANCE.getIfBranch();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BRANCH__CONDITION = eINSTANCE.getIfBranch_Condition();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BRANCH__STATEMENTS = eINSTANCE.getIfBranch_Statements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.NumLiteralImpl <em>Num Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.NumLiteralImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getNumLiteral()
		 * @generated
		 */
		EClass NUM_LITERAL = eINSTANCE.getNumLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_LITERAL__VALUE = eINSTANCE.getNumLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.DoubleLiteralImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getDoubleLiteral()
		 * @generated
		 */
		EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.StringLiteralImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.BooleanLiteralImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.MatchTraceImpl <em>Match Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.MatchTraceImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getMatchTrace()
		 * @generated
		 */
		EClass MATCH_TRACE = eINSTANCE.getMatchTrace();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TRACE__TRACE = eINSTANCE.getMatchTrace_Trace();

		/**
		 * The meta object literal for the '<em><b>Trace Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TRACE__TRACE_EXPR = eINSTANCE.getMatchTrace_TraceExpr();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_TRACE__CARDINALITY = eINSTANCE.getMatchTrace_Cardinality();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TraceCompareExpressionImpl <em>Trace Compare Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TraceCompareExpressionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceCompareExpression()
		 * @generated
		 */
		EClass TRACE_COMPARE_EXPRESSION = eINSTANCE.getTraceCompareExpression();

		/**
		 * The meta object literal for the '<em><b>Multivalued Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG = eINSTANCE.getTraceCompareExpression_MultivaluedTag();

		/**
		 * The meta object literal for the '<em><b>Trace Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_COMPARE_EXPRESSION__TRACE_VAR = eINSTANCE.getTraceCompareExpression_TraceVar();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_COMPARE_EXPRESSION__EXPR = eINSTANCE.getTraceCompareExpression_Expr();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.PutTraceImpl <em>Put Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.PutTraceImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPutTrace()
		 * @generated
		 */
		EClass PUT_TRACE = eINSTANCE.getPutTrace();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_TRACE__TRACE = eINSTANCE.getPutTrace_Trace();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_TRACE__PARAMETERS = eINSTANCE.getPutTrace_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.PutTraceParameterImpl <em>Put Trace Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.PutTraceParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getPutTraceParameter()
		 * @generated
		 */
		EClass PUT_TRACE_PARAMETER = eINSTANCE.getPutTraceParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_TRACE_PARAMETER__VALUE = eINSTANCE.getPutTraceParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Trace Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_TRACE_PARAMETER__TRACE_VAR = eINSTANCE.getPutTraceParameter_TraceVar();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TypeExpressionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTypeExpression()
		 * @generated
		 */
		EClass TYPE_EXPRESSION = eINSTANCE.getTypeExpression();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.ClassUseImpl <em>Class Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.ClassUseImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getClassUse()
		 * @generated
		 */
		EClass CLASS_USE = eINSTANCE.getClassUse();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_USE__MODEL = eINSTANCE.getClassUse_Model();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_USE__CLASS_NAME = eINSTANCE.getClassUse_ClassName();

		/**
		 * The meta object literal for the '<em><b>Strict Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_USE__STRICT_TYPE = eINSTANCE.getClassUse_StrictType();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TraceUseImpl <em>Trace Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TraceUseImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceUse()
		 * @generated
		 */
		EClass TRACE_USE = eINSTANCE.getTraceUse();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_USE__TRACE = eINSTANCE.getTraceUse_Trace();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TypedWithClassImpl <em>Typed With Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TypedWithClassImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTypedWithClass()
		 * @generated
		 */
		EClass TYPED_WITH_CLASS = eINSTANCE.getTypedWithClass();

		/**
		 * The meta object literal for the '<em><b>Type </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_WITH_CLASS__TYPE_ = eINSTANCE.getTypedWithClass_Type_();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TraceInterfaceImpl <em>Trace Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TraceInterfaceImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceInterface()
		 * @generated
		 */
		EClass TRACE_INTERFACE = eINSTANCE.getTraceInterface();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_INTERFACE__DEFINITIONS = eINSTANCE.getTraceInterface_Definitions();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TracedModelParameterImpl <em>Traced Model Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TracedModelParameterImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTracedModelParameter()
		 * @generated
		 */
		EClass TRACED_MODEL_PARAMETER = eINSTANCE.getTracedModelParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TraceDefinitionImpl <em>Trace Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TraceDefinitionImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceDefinition()
		 * @generated
		 */
		EClass TRACE_DEFINITION = eINSTANCE.getTraceDefinition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_DEFINITION__ELEMENTS = eINSTANCE.getTraceDefinition_Elements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.TraceElementImpl <em>Trace Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.TraceElementImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getTraceElement()
		 * @generated
		 */
		EClass TRACE_ELEMENT = eINSTANCE.getTraceElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_ELEMENT__TYPE = eINSTANCE.getTraceElement_Type();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.InlineModelImpl <em>Inline Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.InlineModelImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineModel()
		 * @generated
		 */
		EClass INLINE_MODEL = eINSTANCE.getInlineModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_MODEL__CLASSES = eINSTANCE.getInlineModel_Classes();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.InlineClassImpl <em>Inline Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.InlineClassImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineClass()
		 * @generated
		 */
		EClass INLINE_CLASS = eINSTANCE.getInlineClass();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_CLASS__FEATURES = eINSTANCE.getInlineClass_Features();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.InlineFeatureImpl <em>Inline Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.InlineFeatureImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineFeature()
		 * @generated
		 */
		EClass INLINE_FEATURE = eINSTANCE.getInlineFeature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_FEATURE__TYPE = eINSTANCE.getInlineFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FEATURE__MULTIVALUED = eINSTANCE.getInlineFeature_Multivalued();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.InlineAttributeImpl <em>Inline Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.InlineAttributeImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineAttribute()
		 * @generated
		 */
		EClass INLINE_ATTRIBUTE = eINSTANCE.getInlineAttribute();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.impl.InlineReferenceImpl <em>Inline Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.impl.InlineReferenceImpl
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getInlineReference()
		 * @generated
		 */
		EClass INLINE_REFERENCE = eINSTANCE.getInlineReference();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.BinaryOp <em>Binary Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.BinaryOp
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getBinaryOp()
		 * @generated
		 */
		EEnum BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.core.ResolveTraceCardinality <em>Resolve Trace Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.core.ResolveTraceCardinality
		 * @see org.eclectic.frontend.core.impl.CorePackageImpl#getResolveTraceCardinality()
		 * @generated
		 */
		EEnum RESOLVE_TRACE_CARDINALITY = eINSTANCE.getResolveTraceCardinality();

	}

} //CorePackage
