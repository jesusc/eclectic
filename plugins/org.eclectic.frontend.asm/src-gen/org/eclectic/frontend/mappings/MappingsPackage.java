/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.CorePackage;

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
 * @see org.eclectic.frontend.mappings.MappingsFactory
 * @model kind="package"
 * @generated
 */
public interface MappingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mappings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/mappingL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_mappingL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingsPackage eINSTANCE = org.eclectic.frontend.mappings.impl.MappingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.MappingTransformationImpl <em>Mapping Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.MappingTransformationImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingTransformation()
	 * @generated
	 */
	int MAPPING_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__DELEGATES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION__CONTEXTS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.MappingVariableImpl <em>Mapping Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.MappingVariableImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingVariable()
	 * @generated
	 */
	int MAPPING_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VARIABLE__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Mapping Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VARIABLE_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.MatchedElementImpl <em>Matched Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.MatchedElementImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMatchedElement()
	 * @generated
	 */
	int MATCHED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_ELEMENT__ANNOTATIONS = CorePackage.CLASS_USE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_ELEMENT__MODEL = CorePackage.CLASS_USE__MODEL;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_ELEMENT__CLASS_NAME = CorePackage.CLASS_USE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Strict Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_ELEMENT__STRICT_TYPE = CorePackage.CLASS_USE__STRICT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_ELEMENT__NAME = CorePackage.CLASS_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matched Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_ELEMENT_FEATURE_COUNT = CorePackage.CLASS_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.DelegateImpl <em>Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.DelegateImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getDelegate()
	 * @generated
	 */
	int DELEGATE = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__LEFT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__IS_EXTERNAL = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__MODULE = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__LINK_NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__FEATURE_NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE__TAGS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ContextImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__LEFT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__RIGHT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MAPPINGS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MODIFIERS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SECTIONS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TAGS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.SectionImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Section Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SECTION_TYPE = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MAPPINGS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.MappingElementImpl <em>Mapping Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.MappingElementImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingElement()
	 * @generated
	 */
	int MAPPING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ClassMappingImpl <em>Class Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ClassMappingImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getClassMapping()
	 * @generated
	 */
	int CLASS_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING__ROW = MAPPING_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING__COLUMN = MAPPING_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING__FILE = MAPPING_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.Feature2FeatureImpl <em>Feature2 Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.Feature2FeatureImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getFeature2Feature()
	 * @generated
	 */
	int FEATURE2_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_FEATURE__ROW = MAPPING_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_FEATURE__COLUMN = MAPPING_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_FEATURE__FILE = MAPPING_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_FEATURE__LEFT_FEATURE = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_FEATURE__CONVERTER = MAPPING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature2 Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_FEATURE_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeMappingImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeMapping()
	 * @generated
	 */
	int ATTRIBUTE_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__ROW = FEATURE2_FEATURE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__COLUMN = FEATURE2_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__FILE = FEATURE2_FEATURE__FILE;

	/**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__LEFT_FEATURE = FEATURE2_FEATURE__LEFT_FEATURE;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__CONVERTER = FEATURE2_FEATURE__CONVERTER;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__LEFT = FEATURE2_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__RIGHT_PART = FEATURE2_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_FEATURE_COUNT = FEATURE2_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeRightPartImpl <em>Attribute Right Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeRightPartImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeRightPart()
	 * @generated
	 */
	int ATTRIBUTE_RIGHT_PART = 10;

	/**
	 * The number of structural features of the '<em>Attribute Right Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RIGHT_PART_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsStringImpl <em>Attribute Is String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeIsStringImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsString()
	 * @generated
	 */
	int ATTRIBUTE_IS_STRING = 11;

	/**
	 * The feature id for the '<em><b>Str Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_STRING__STR_VALUE = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Is String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_STRING_FEATURE_COUNT = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsBooleanImpl <em>Attribute Is Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeIsBooleanImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsBoolean()
	 * @generated
	 */
	int ATTRIBUTE_IS_BOOLEAN = 12;

	/**
	 * The feature id for the '<em><b>Bool Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Is Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_BOOLEAN_FEATURE_COUNT = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsDoubleImpl <em>Attribute Is Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeIsDoubleImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsDouble()
	 * @generated
	 */
	int ATTRIBUTE_IS_DOUBLE = 13;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_DOUBLE__DOUBLE_VALUE = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Is Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_DOUBLE_FEATURE_COUNT = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsResolveLinkImpl <em>Attribute Is Resolve Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeIsResolveLinkImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsResolveLink()
	 * @generated
	 */
	int ATTRIBUTE_IS_RESOLVE_LINK = 14;

	/**
	 * The feature id for the '<em><b>Resolve Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Is Resolve Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_RESOLVE_LINK_FEATURE_COUNT = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsIntegerImpl <em>Attribute Is Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeIsIntegerImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsInteger()
	 * @generated
	 */
	int ATTRIBUTE_IS_INTEGER = 15;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_INTEGER__INT_VALUE = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Is Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IS_INTEGER_FEATURE_COUNT = ATTRIBUTE_RIGHT_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ConverterImpl <em>Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ConverterImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getConverter()
	 * @generated
	 */
	int CONVERTER = 16;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__IS_EXTERNAL = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__MODULE = 1;

	/**
	 * The feature id for the '<em><b>Converter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CONVERTER_NAME = 2;

	/**
	 * The number of structural features of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.TagImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl <em>Class2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.Class2ClassImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getClass2Class()
	 * @generated
	 */
	int CLASS2_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__ROW = CLASS_MAPPING__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__COLUMN = CLASS_MAPPING__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__FILE = CLASS_MAPPING__FILE;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__CARDINALITY = CLASS_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__MODIFIERS = CLASS_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__LEFT = CLASS_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__RIGHT = CLASS_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scoped Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS__SCOPED_ATTRIBUTES = CLASS_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_CLASS_FEATURE_COUNT = CLASS_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.C2CModifierImpl <em>C2C Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.C2CModifierImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getC2CModifier()
	 * @generated
	 */
	int C2C_MODIFIER = 19;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2C_MODIFIER__ROW = MAPPING_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2C_MODIFIER__COLUMN = MAPPING_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2C_MODIFIER__FILE = MAPPING_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>C2C Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2C_MODIFIER_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.RelatedByImpl <em>Related By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.RelatedByImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getRelatedBy()
	 * @generated
	 */
	int RELATED_BY = 20;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_BY__ROW = C2C_MODIFIER__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_BY__COLUMN = C2C_MODIFIER__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_BY__FILE = C2C_MODIFIER__FILE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_BY__ATTRIBUTE = C2C_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Related By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_BY_FEATURE_COUNT = C2C_MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.LinkedByImpl <em>Linked By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.LinkedByImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getLinkedBy()
	 * @generated
	 */
	int LINKED_BY = 21;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_BY__ROW = C2C_MODIFIER__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_BY__COLUMN = C2C_MODIFIER__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_BY__FILE = C2C_MODIFIER__FILE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_BY__ATTRIBUTE = C2C_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_BY__LINKED_ELEMENT = C2C_MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linked By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_BY_FEATURE_COUNT = C2C_MODIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.EqualityFilterImpl <em>Equality Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.EqualityFilterImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getEqualityFilter()
	 * @generated
	 */
	int EQUALITY_FILTER = 22;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FILTER__ROW = C2C_MODIFIER__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FILTER__COLUMN = C2C_MODIFIER__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FILTER__FILE = C2C_MODIFIER__FILE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FILTER__ATTRIBUTE = C2C_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FILTER__FILTER = C2C_MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equality Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FILTER_FEATURE_COUNT = C2C_MODIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.OperatorImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.SplitImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 24;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ROW = OPERATOR__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__COLUMN = OPERATOR__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__FILE = OPERATOR__FILE;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__MAPPINGS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.JoinImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 25;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ROW = OPERATOR__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COLUMN = OPERATOR__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__FILE = OPERATOR__FILE;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MAPPINGS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl <em>Attribute2 Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttribute2Attribute()
	 * @generated
	 */
	int ATTRIBUTE2_ATTRIBUTE = 26;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__ROW = FEATURE2_FEATURE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__COLUMN = FEATURE2_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__FILE = FEATURE2_FEATURE__FILE;

	/**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__LEFT_FEATURE = FEATURE2_FEATURE__LEFT_FEATURE;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__CONVERTER = FEATURE2_FEATURE__CONVERTER;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__CARDINALITY = FEATURE2_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__CONTEXT = FEATURE2_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__RIGHT = FEATURE2_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__MODIFIERS = FEATURE2_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute2 Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE_FEATURE_COUNT = FEATURE2_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl <em>Reference2 Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getReference2Reference()
	 * @generated
	 */
	int REFERENCE2_REFERENCE = 27;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__ROW = FEATURE2_FEATURE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__COLUMN = FEATURE2_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__FILE = FEATURE2_FEATURE__FILE;

	/**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__LEFT_FEATURE = FEATURE2_FEATURE__LEFT_FEATURE;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__CONVERTER = FEATURE2_FEATURE__CONVERTER;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__CARDINALITY = FEATURE2_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__LEFT = FEATURE2_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__RIGHT = FEATURE2_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE__RESOLVER_NAME = FEATURE2_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reference2 Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE2_REFERENCE_FEATURE_COUNT = FEATURE2_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ModifierImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 28;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeModifierImpl <em>Attribute Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeModifierImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeModifier()
	 * @generated
	 */
	int ATTRIBUTE_MODIFIER = 29;

	/**
	 * The number of structural features of the '<em>Attribute Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MODIFIER_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ConvertModifierImpl <em>Convert Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ConvertModifierImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getConvertModifier()
	 * @generated
	 */
	int CONVERT_MODIFIER = 30;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MODIFIER__CONVERTER = ATTRIBUTE_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Convert Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MODIFIER_FEATURE_COUNT = ATTRIBUTE_MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.DefaultValueImpl <em>Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.DefaultValueImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getDefaultValue()
	 * @generated
	 */
	int DEFAULT_VALUE = 31;

	/**
	 * The number of structural features of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_FEATURE_COUNT = ATTRIBUTE_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.IntDefaultValueImpl <em>Int Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.IntDefaultValueImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getIntDefaultValue()
	 * @generated
	 */
	int INT_DEFAULT_VALUE = 32;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DEFAULT_VALUE__DEFAULT_VALUE = DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DEFAULT_VALUE_FEATURE_COUNT = DEFAULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.MetamodelElementRefImpl <em>Metamodel Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.MetamodelElementRefImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMetamodelElementRef()
	 * @generated
	 */
	int METAMODEL_ELEMENT_REF = 33;

	/**
	 * The number of structural features of the '<em>Metamodel Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_REF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ClassRefImpl <em>Class Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ClassRefImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getClassRef()
	 * @generated
	 */
	int CLASS_REF = 34;

	/**
	 * The feature id for the '<em><b>Klass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__KLASS = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF_FEATURE_COUNT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.FeatureRefImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getFeatureRef()
	 * @generated
	 */
	int FEATURE_REF = 35;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__ROW = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__COLUMN = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__FILE = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__LEFT_FEATURE = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__CONVERTER = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__REFERRED_ELEMENT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__FEATURE_NAME = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__MULTIVALUED = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF_FEATURE_COUNT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.AttributeRefImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeRef()
	 * @generated
	 */
	int ATTRIBUTE_REF = 36;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__REFERRED_ELEMENT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__FEATURE_NAME = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__MULTIVALUED = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF_FEATURE_COUNT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.impl.ReferenceRefImpl <em>Reference Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.impl.ReferenceRefImpl
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getReferenceRef()
	 * @generated
	 */
	int REFERENCE_REF = 37;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REF__REFERRED_ELEMENT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REF__FEATURE_NAME = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REF__MULTIVALUED = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REF_FEATURE_COUNT = METAMODEL_ELEMENT_REF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.mappings.MappingCardinality <em>Mapping Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.mappings.MappingCardinality
	 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingCardinality()
	 * @generated
	 */
	int MAPPING_CARDINALITY = 38;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.MappingTransformation <em>Mapping Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Transformation</em>'.
	 * @see org.eclectic.frontend.mappings.MappingTransformation
	 * @generated
	 */
	EClass getMappingTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.MappingTransformation#getDelegates <em>Delegates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegates</em>'.
	 * @see org.eclectic.frontend.mappings.MappingTransformation#getDelegates()
	 * @see #getMappingTransformation()
	 * @generated
	 */
	EReference getMappingTransformation_Delegates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.MappingTransformation#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclectic.frontend.mappings.MappingTransformation#getContexts()
	 * @see #getMappingTransformation()
	 * @generated
	 */
	EReference getMappingTransformation_Contexts();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.MappingVariable <em>Mapping Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Variable</em>'.
	 * @see org.eclectic.frontend.mappings.MappingVariable
	 * @generated
	 */
	EClass getMappingVariable();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.MatchedElement <em>Matched Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Element</em>'.
	 * @see org.eclectic.frontend.mappings.MatchedElement
	 * @generated
	 */
	EClass getMatchedElement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Delegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate
	 * @generated
	 */
	EClass getDelegate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Delegate#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate#getLeft()
	 * @see #getDelegate()
	 * @generated
	 */
	EReference getDelegate_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Delegate#getIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate#getIsExternal()
	 * @see #getDelegate()
	 * @generated
	 */
	EAttribute getDelegate_IsExternal();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.Delegate#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate#getModule()
	 * @see #getDelegate()
	 * @generated
	 */
	EReference getDelegate_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Delegate#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate#getLinkName()
	 * @see #getDelegate()
	 * @generated
	 */
	EAttribute getDelegate_LinkName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Delegate#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate#getFeatureName()
	 * @see #getDelegate()
	 * @generated
	 */
	EAttribute getDelegate_FeatureName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Delegate#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.eclectic.frontend.mappings.Delegate#getTags()
	 * @see #getDelegate()
	 * @generated
	 */
	EReference getDelegate_Tags();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclectic.frontend.mappings.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Context#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see org.eclectic.frontend.mappings.Context#getLeft()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Context#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see org.eclectic.frontend.mappings.Context#getRight()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Right();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Context#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclectic.frontend.mappings.Context#getMappings()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Context#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see org.eclectic.frontend.mappings.Context#getModifiers()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Modifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Context#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclectic.frontend.mappings.Context#getSections()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Context#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.eclectic.frontend.mappings.Context#getTags()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Tags();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclectic.frontend.mappings.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Section#getSectionType <em>Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Type</em>'.
	 * @see org.eclectic.frontend.mappings.Section#getSectionType()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_SectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Section#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclectic.frontend.mappings.Section#getMappings()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Mappings();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.MappingElement <em>Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Element</em>'.
	 * @see org.eclectic.frontend.mappings.MappingElement
	 * @generated
	 */
	EClass getMappingElement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.ClassMapping <em>Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mapping</em>'.
	 * @see org.eclectic.frontend.mappings.ClassMapping
	 * @generated
	 */
	EClass getClassMapping();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Feature2Feature <em>Feature2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature2 Feature</em>'.
	 * @see org.eclectic.frontend.mappings.Feature2Feature
	 * @generated
	 */
	EClass getFeature2Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.Feature2Feature#getLeftFeature <em>Left Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Feature</em>'.
	 * @see org.eclectic.frontend.mappings.Feature2Feature#getLeftFeature()
	 * @see #getFeature2Feature()
	 * @generated
	 */
	EReference getFeature2Feature_LeftFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.Feature2Feature#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Converter</em>'.
	 * @see org.eclectic.frontend.mappings.Feature2Feature#getConverter()
	 * @see #getFeature2Feature()
	 * @generated
	 */
	EReference getFeature2Feature_Converter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeMapping <em>Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Mapping</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeMapping
	 * @generated
	 */
	EClass getAttributeMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.AttributeMapping#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeMapping#getLeft()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EReference getAttributeMapping_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.AttributeMapping#getRightPart <em>Right Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Part</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeMapping#getRightPart()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EReference getAttributeMapping_RightPart();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeRightPart <em>Attribute Right Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Right Part</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeRightPart
	 * @generated
	 */
	EClass getAttributeRightPart();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeIsString <em>Attribute Is String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Is String</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsString
	 * @generated
	 */
	EClass getAttributeIsString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.AttributeIsString#getStrValue <em>Str Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Value</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsString#getStrValue()
	 * @see #getAttributeIsString()
	 * @generated
	 */
	EAttribute getAttributeIsString_StrValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeIsBoolean <em>Attribute Is Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Is Boolean</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsBoolean
	 * @generated
	 */
	EClass getAttributeIsBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.AttributeIsBoolean#getBoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Value</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsBoolean#getBoolValue()
	 * @see #getAttributeIsBoolean()
	 * @generated
	 */
	EAttribute getAttributeIsBoolean_BoolValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeIsDouble <em>Attribute Is Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Is Double</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsDouble
	 * @generated
	 */
	EClass getAttributeIsDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.AttributeIsDouble#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsDouble#getDoubleValue()
	 * @see #getAttributeIsDouble()
	 * @generated
	 */
	EAttribute getAttributeIsDouble_DoubleValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeIsResolveLink <em>Attribute Is Resolve Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Is Resolve Link</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsResolveLink
	 * @generated
	 */
	EClass getAttributeIsResolveLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.AttributeIsResolveLink#getResolveLink <em>Resolve Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolve Link</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsResolveLink#getResolveLink()
	 * @see #getAttributeIsResolveLink()
	 * @generated
	 */
	EReference getAttributeIsResolveLink_ResolveLink();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeIsInteger <em>Attribute Is Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Is Integer</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsInteger
	 * @generated
	 */
	EClass getAttributeIsInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.AttributeIsInteger#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeIsInteger#getIntValue()
	 * @see #getAttributeIsInteger()
	 * @generated
	 */
	EAttribute getAttributeIsInteger_IntValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Converter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Converter</em>'.
	 * @see org.eclectic.frontend.mappings.Converter
	 * @generated
	 */
	EClass getConverter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Converter#getIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see org.eclectic.frontend.mappings.Converter#getIsExternal()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_IsExternal();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.Converter#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.eclectic.frontend.mappings.Converter#getModule()
	 * @see #getConverter()
	 * @generated
	 */
	EReference getConverter_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Converter#getConverterName <em>Converter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter Name</em>'.
	 * @see org.eclectic.frontend.mappings.Converter#getConverterName()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_ConverterName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.eclectic.frontend.mappings.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Class2Class <em>Class2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2 Class</em>'.
	 * @see org.eclectic.frontend.mappings.Class2Class
	 * @generated
	 */
	EClass getClass2Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Class2Class#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclectic.frontend.mappings.Class2Class#getCardinality()
	 * @see #getClass2Class()
	 * @generated
	 */
	EAttribute getClass2Class_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Class2Class#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see org.eclectic.frontend.mappings.Class2Class#getModifiers()
	 * @see #getClass2Class()
	 * @generated
	 */
	EReference getClass2Class_Modifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Class2Class#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see org.eclectic.frontend.mappings.Class2Class#getLeft()
	 * @see #getClass2Class()
	 * @generated
	 */
	EReference getClass2Class_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Class2Class#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see org.eclectic.frontend.mappings.Class2Class#getRight()
	 * @see #getClass2Class()
	 * @generated
	 */
	EReference getClass2Class_Right();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Class2Class#getScopedAttributes <em>Scoped Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scoped Attributes</em>'.
	 * @see org.eclectic.frontend.mappings.Class2Class#getScopedAttributes()
	 * @see #getClass2Class()
	 * @generated
	 */
	EReference getClass2Class_ScopedAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.C2CModifier <em>C2C Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2C Modifier</em>'.
	 * @see org.eclectic.frontend.mappings.C2CModifier
	 * @generated
	 */
	EClass getC2CModifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.RelatedBy <em>Related By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related By</em>'.
	 * @see org.eclectic.frontend.mappings.RelatedBy
	 * @generated
	 */
	EClass getRelatedBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.RelatedBy#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.eclectic.frontend.mappings.RelatedBy#getAttribute()
	 * @see #getRelatedBy()
	 * @generated
	 */
	EReference getRelatedBy_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.LinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked By</em>'.
	 * @see org.eclectic.frontend.mappings.LinkedBy
	 * @generated
	 */
	EClass getLinkedBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.LinkedBy#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.eclectic.frontend.mappings.LinkedBy#getAttribute()
	 * @see #getLinkedBy()
	 * @generated
	 */
	EReference getLinkedBy_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.LinkedBy#getLinkedElement <em>Linked Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Element</em>'.
	 * @see org.eclectic.frontend.mappings.LinkedBy#getLinkedElement()
	 * @see #getLinkedBy()
	 * @generated
	 */
	EReference getLinkedBy_LinkedElement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.EqualityFilter <em>Equality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Filter</em>'.
	 * @see org.eclectic.frontend.mappings.EqualityFilter
	 * @generated
	 */
	EClass getEqualityFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.mappings.EqualityFilter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.eclectic.frontend.mappings.EqualityFilter#getAttribute()
	 * @see #getEqualityFilter()
	 * @generated
	 */
	EReference getEqualityFilter_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.EqualityFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.eclectic.frontend.mappings.EqualityFilter#getFilter()
	 * @see #getEqualityFilter()
	 * @generated
	 */
	EAttribute getEqualityFilter_Filter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see org.eclectic.frontend.mappings.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see org.eclectic.frontend.mappings.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Split#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclectic.frontend.mappings.Split#getMappings()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Mappings();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.eclectic.frontend.mappings.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Join#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclectic.frontend.mappings.Join#getMappings()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Mappings();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Attribute2Attribute <em>Attribute2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute2 Attribute</em>'.
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute
	 * @generated
	 */
	EClass getAttribute2Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute#getCardinality()
	 * @see #getAttribute2Attribute()
	 * @generated
	 */
	EAttribute getAttribute2Attribute_Cardinality();

	/**
	 * Returns the meta object for the container reference '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute#getContext()
	 * @see #getAttribute2Attribute()
	 * @generated
	 */
	EReference getAttribute2Attribute_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute#getRight()
	 * @see #getAttribute2Attribute()
	 * @generated
	 */
	EReference getAttribute2Attribute_Right();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute#getModifiers()
	 * @see #getAttribute2Attribute()
	 * @generated
	 */
	EReference getAttribute2Attribute_Modifiers();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Reference2Reference <em>Reference2 Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference2 Reference</em>'.
	 * @see org.eclectic.frontend.mappings.Reference2Reference
	 * @generated
	 */
	EClass getReference2Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Reference2Reference#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclectic.frontend.mappings.Reference2Reference#getCardinality()
	 * @see #getReference2Reference()
	 * @generated
	 */
	EAttribute getReference2Reference_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Reference2Reference#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see org.eclectic.frontend.mappings.Reference2Reference#getLeft()
	 * @see #getReference2Reference()
	 * @generated
	 */
	EReference getReference2Reference_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.mappings.Reference2Reference#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see org.eclectic.frontend.mappings.Reference2Reference#getRight()
	 * @see #getReference2Reference()
	 * @generated
	 */
	EReference getReference2Reference_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.Reference2Reference#getResolverName <em>Resolver Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver Name</em>'.
	 * @see org.eclectic.frontend.mappings.Reference2Reference#getResolverName()
	 * @see #getReference2Reference()
	 * @generated
	 */
	EAttribute getReference2Reference_ResolverName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see org.eclectic.frontend.mappings.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeModifier <em>Attribute Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Modifier</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeModifier
	 * @generated
	 */
	EClass getAttributeModifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.ConvertModifier <em>Convert Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert Modifier</em>'.
	 * @see org.eclectic.frontend.mappings.ConvertModifier
	 * @generated
	 */
	EClass getConvertModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.ConvertModifier#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter</em>'.
	 * @see org.eclectic.frontend.mappings.ConvertModifier#getConverter()
	 * @see #getConvertModifier()
	 * @generated
	 */
	EAttribute getConvertModifier_Converter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value</em>'.
	 * @see org.eclectic.frontend.mappings.DefaultValue
	 * @generated
	 */
	EClass getDefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.IntDefaultValue <em>Int Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Default Value</em>'.
	 * @see org.eclectic.frontend.mappings.IntDefaultValue
	 * @generated
	 */
	EClass getIntDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.IntDefaultValue#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclectic.frontend.mappings.IntDefaultValue#getDefaultValue()
	 * @see #getIntDefaultValue()
	 * @generated
	 */
	EAttribute getIntDefaultValue_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.MetamodelElementRef <em>Metamodel Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Ref</em>'.
	 * @see org.eclectic.frontend.mappings.MetamodelElementRef
	 * @generated
	 */
	EClass getMetamodelElementRef();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Ref</em>'.
	 * @see org.eclectic.frontend.mappings.ClassRef
	 * @generated
	 */
	EClass getClassRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.ClassRef#getKlass <em>Klass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Klass</em>'.
	 * @see org.eclectic.frontend.mappings.ClassRef#getKlass()
	 * @see #getClassRef()
	 * @generated
	 */
	EReference getClassRef_Klass();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.FeatureRef <em>Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Ref</em>'.
	 * @see org.eclectic.frontend.mappings.FeatureRef
	 * @generated
	 */
	EClass getFeatureRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.FeatureRef#getReferredElement <em>Referred Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Element</em>'.
	 * @see org.eclectic.frontend.mappings.FeatureRef#getReferredElement()
	 * @see #getFeatureRef()
	 * @generated
	 */
	EReference getFeatureRef_ReferredElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.FeatureRef#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.frontend.mappings.FeatureRef#getFeatureName()
	 * @see #getFeatureRef()
	 * @generated
	 */
	EAttribute getFeatureRef_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.FeatureRef#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see org.eclectic.frontend.mappings.FeatureRef#isMultivalued()
	 * @see #getFeatureRef()
	 * @generated
	 */
	EAttribute getFeatureRef_Multivalued();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.AttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Ref</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeRef
	 * @generated
	 */
	EClass getAttributeRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.AttributeRef#getReferredElement <em>Referred Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Element</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeRef#getReferredElement()
	 * @see #getAttributeRef()
	 * @generated
	 */
	EReference getAttributeRef_ReferredElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.AttributeRef#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeRef#getFeatureName()
	 * @see #getAttributeRef()
	 * @generated
	 */
	EAttribute getAttributeRef_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.AttributeRef#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see org.eclectic.frontend.mappings.AttributeRef#isMultivalued()
	 * @see #getAttributeRef()
	 * @generated
	 */
	EAttribute getAttributeRef_Multivalued();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.mappings.ReferenceRef <em>Reference Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Ref</em>'.
	 * @see org.eclectic.frontend.mappings.ReferenceRef
	 * @generated
	 */
	EClass getReferenceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.mappings.ReferenceRef#getReferredElement <em>Referred Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Element</em>'.
	 * @see org.eclectic.frontend.mappings.ReferenceRef#getReferredElement()
	 * @see #getReferenceRef()
	 * @generated
	 */
	EReference getReferenceRef_ReferredElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.ReferenceRef#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.frontend.mappings.ReferenceRef#getFeatureName()
	 * @see #getReferenceRef()
	 * @generated
	 */
	EAttribute getReferenceRef_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.mappings.ReferenceRef#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see org.eclectic.frontend.mappings.ReferenceRef#isMultivalued()
	 * @see #getReferenceRef()
	 * @generated
	 */
	EAttribute getReferenceRef_Multivalued();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.frontend.mappings.MappingCardinality <em>Mapping Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Cardinality</em>'.
	 * @see org.eclectic.frontend.mappings.MappingCardinality
	 * @generated
	 */
	EEnum getMappingCardinality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingsFactory getMappingsFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.MappingTransformationImpl <em>Mapping Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.MappingTransformationImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingTransformation()
		 * @generated
		 */
		EClass MAPPING_TRANSFORMATION = eINSTANCE.getMappingTransformation();

		/**
		 * The meta object literal for the '<em><b>Delegates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TRANSFORMATION__DELEGATES = eINSTANCE.getMappingTransformation_Delegates();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TRANSFORMATION__CONTEXTS = eINSTANCE.getMappingTransformation_Contexts();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.MappingVariableImpl <em>Mapping Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.MappingVariableImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingVariable()
		 * @generated
		 */
		EClass MAPPING_VARIABLE = eINSTANCE.getMappingVariable();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.MatchedElementImpl <em>Matched Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.MatchedElementImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMatchedElement()
		 * @generated
		 */
		EClass MATCHED_ELEMENT = eINSTANCE.getMatchedElement();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.DelegateImpl <em>Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.DelegateImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getDelegate()
		 * @generated
		 */
		EClass DELEGATE = eINSTANCE.getDelegate();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE__LEFT = eINSTANCE.getDelegate_Left();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE__IS_EXTERNAL = eINSTANCE.getDelegate_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE__MODULE = eINSTANCE.getDelegate_Module();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE__LINK_NAME = eINSTANCE.getDelegate_LinkName();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE__FEATURE_NAME = eINSTANCE.getDelegate_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE__TAGS = eINSTANCE.getDelegate_Tags();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ContextImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__LEFT = eINSTANCE.getContext_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__RIGHT = eINSTANCE.getContext_Right();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__MAPPINGS = eINSTANCE.getContext_Mappings();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__MODIFIERS = eINSTANCE.getContext_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__SECTIONS = eINSTANCE.getContext_Sections();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TAGS = eINSTANCE.getContext_Tags();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.SectionImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Section Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__SECTION_TYPE = eINSTANCE.getSection_SectionType();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__MAPPINGS = eINSTANCE.getSection_Mappings();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.MappingElementImpl <em>Mapping Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.MappingElementImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingElement()
		 * @generated
		 */
		EClass MAPPING_ELEMENT = eINSTANCE.getMappingElement();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ClassMappingImpl <em>Class Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ClassMappingImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getClassMapping()
		 * @generated
		 */
		EClass CLASS_MAPPING = eINSTANCE.getClassMapping();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.Feature2FeatureImpl <em>Feature2 Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.Feature2FeatureImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getFeature2Feature()
		 * @generated
		 */
		EClass FEATURE2_FEATURE = eINSTANCE.getFeature2Feature();

		/**
		 * The meta object literal for the '<em><b>Left Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE2_FEATURE__LEFT_FEATURE = eINSTANCE.getFeature2Feature_LeftFeature();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE2_FEATURE__CONVERTER = eINSTANCE.getFeature2Feature_Converter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeMappingImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPING__LEFT = eINSTANCE.getAttributeMapping_Left();

		/**
		 * The meta object literal for the '<em><b>Right Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPING__RIGHT_PART = eINSTANCE.getAttributeMapping_RightPart();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeRightPartImpl <em>Attribute Right Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeRightPartImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeRightPart()
		 * @generated
		 */
		EClass ATTRIBUTE_RIGHT_PART = eINSTANCE.getAttributeRightPart();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsStringImpl <em>Attribute Is String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeIsStringImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsString()
		 * @generated
		 */
		EClass ATTRIBUTE_IS_STRING = eINSTANCE.getAttributeIsString();

		/**
		 * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IS_STRING__STR_VALUE = eINSTANCE.getAttributeIsString_StrValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsBooleanImpl <em>Attribute Is Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeIsBooleanImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsBoolean()
		 * @generated
		 */
		EClass ATTRIBUTE_IS_BOOLEAN = eINSTANCE.getAttributeIsBoolean();

		/**
		 * The meta object literal for the '<em><b>Bool Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE = eINSTANCE.getAttributeIsBoolean_BoolValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsDoubleImpl <em>Attribute Is Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeIsDoubleImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsDouble()
		 * @generated
		 */
		EClass ATTRIBUTE_IS_DOUBLE = eINSTANCE.getAttributeIsDouble();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IS_DOUBLE__DOUBLE_VALUE = eINSTANCE.getAttributeIsDouble_DoubleValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsResolveLinkImpl <em>Attribute Is Resolve Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeIsResolveLinkImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsResolveLink()
		 * @generated
		 */
		EClass ATTRIBUTE_IS_RESOLVE_LINK = eINSTANCE.getAttributeIsResolveLink();

		/**
		 * The meta object literal for the '<em><b>Resolve Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK = eINSTANCE.getAttributeIsResolveLink_ResolveLink();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeIsIntegerImpl <em>Attribute Is Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeIsIntegerImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeIsInteger()
		 * @generated
		 */
		EClass ATTRIBUTE_IS_INTEGER = eINSTANCE.getAttributeIsInteger();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IS_INTEGER__INT_VALUE = eINSTANCE.getAttributeIsInteger_IntValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ConverterImpl <em>Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ConverterImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getConverter()
		 * @generated
		 */
		EClass CONVERTER = eINSTANCE.getConverter();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERTER__IS_EXTERNAL = eINSTANCE.getConverter_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERTER__MODULE = eINSTANCE.getConverter_Module();

		/**
		 * The meta object literal for the '<em><b>Converter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERTER__CONVERTER_NAME = eINSTANCE.getConverter_ConverterName();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.TagImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl <em>Class2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.Class2ClassImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getClass2Class()
		 * @generated
		 */
		EClass CLASS2_CLASS = eINSTANCE.getClass2Class();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2_CLASS__CARDINALITY = eINSTANCE.getClass2Class_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_CLASS__MODIFIERS = eINSTANCE.getClass2Class_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_CLASS__LEFT = eINSTANCE.getClass2Class_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_CLASS__RIGHT = eINSTANCE.getClass2Class_Right();

		/**
		 * The meta object literal for the '<em><b>Scoped Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_CLASS__SCOPED_ATTRIBUTES = eINSTANCE.getClass2Class_ScopedAttributes();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.C2CModifierImpl <em>C2C Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.C2CModifierImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getC2CModifier()
		 * @generated
		 */
		EClass C2C_MODIFIER = eINSTANCE.getC2CModifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.RelatedByImpl <em>Related By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.RelatedByImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getRelatedBy()
		 * @generated
		 */
		EClass RELATED_BY = eINSTANCE.getRelatedBy();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_BY__ATTRIBUTE = eINSTANCE.getRelatedBy_Attribute();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.LinkedByImpl <em>Linked By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.LinkedByImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getLinkedBy()
		 * @generated
		 */
		EClass LINKED_BY = eINSTANCE.getLinkedBy();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_BY__ATTRIBUTE = eINSTANCE.getLinkedBy_Attribute();

		/**
		 * The meta object literal for the '<em><b>Linked Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_BY__LINKED_ELEMENT = eINSTANCE.getLinkedBy_LinkedElement();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.EqualityFilterImpl <em>Equality Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.EqualityFilterImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getEqualityFilter()
		 * @generated
		 */
		EClass EQUALITY_FILTER = eINSTANCE.getEqualityFilter();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY_FILTER__ATTRIBUTE = eINSTANCE.getEqualityFilter_Attribute();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY_FILTER__FILTER = eINSTANCE.getEqualityFilter_Filter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.OperatorImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.SplitImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__MAPPINGS = eINSTANCE.getSplit_Mappings();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.JoinImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__MAPPINGS = eINSTANCE.getJoin_Mappings();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl <em>Attribute2 Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttribute2Attribute()
		 * @generated
		 */
		EClass ATTRIBUTE2_ATTRIBUTE = eINSTANCE.getAttribute2Attribute();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE2_ATTRIBUTE__CARDINALITY = eINSTANCE.getAttribute2Attribute_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE2_ATTRIBUTE__CONTEXT = eINSTANCE.getAttribute2Attribute_Context();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE2_ATTRIBUTE__RIGHT = eINSTANCE.getAttribute2Attribute_Right();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE2_ATTRIBUTE__MODIFIERS = eINSTANCE.getAttribute2Attribute_Modifiers();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl <em>Reference2 Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getReference2Reference()
		 * @generated
		 */
		EClass REFERENCE2_REFERENCE = eINSTANCE.getReference2Reference();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE2_REFERENCE__CARDINALITY = eINSTANCE.getReference2Reference_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE2_REFERENCE__LEFT = eINSTANCE.getReference2Reference_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE2_REFERENCE__RIGHT = eINSTANCE.getReference2Reference_Right();

		/**
		 * The meta object literal for the '<em><b>Resolver Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE2_REFERENCE__RESOLVER_NAME = eINSTANCE.getReference2Reference_ResolverName();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ModifierImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeModifierImpl <em>Attribute Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeModifierImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeModifier()
		 * @generated
		 */
		EClass ATTRIBUTE_MODIFIER = eINSTANCE.getAttributeModifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ConvertModifierImpl <em>Convert Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ConvertModifierImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getConvertModifier()
		 * @generated
		 */
		EClass CONVERT_MODIFIER = eINSTANCE.getConvertModifier();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERT_MODIFIER__CONVERTER = eINSTANCE.getConvertModifier_Converter();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.DefaultValueImpl <em>Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.DefaultValueImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getDefaultValue()
		 * @generated
		 */
		EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.IntDefaultValueImpl <em>Int Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.IntDefaultValueImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getIntDefaultValue()
		 * @generated
		 */
		EClass INT_DEFAULT_VALUE = eINSTANCE.getIntDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_DEFAULT_VALUE__DEFAULT_VALUE = eINSTANCE.getIntDefaultValue_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.MetamodelElementRefImpl <em>Metamodel Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.MetamodelElementRefImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMetamodelElementRef()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_REF = eINSTANCE.getMetamodelElementRef();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ClassRefImpl <em>Class Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ClassRefImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getClassRef()
		 * @generated
		 */
		EClass CLASS_REF = eINSTANCE.getClassRef();

		/**
		 * The meta object literal for the '<em><b>Klass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_REF__KLASS = eINSTANCE.getClassRef_Klass();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.FeatureRefImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getFeatureRef()
		 * @generated
		 */
		EClass FEATURE_REF = eINSTANCE.getFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Referred Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_REF__REFERRED_ELEMENT = eINSTANCE.getFeatureRef_ReferredElement();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_REF__FEATURE_NAME = eINSTANCE.getFeatureRef_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_REF__MULTIVALUED = eINSTANCE.getFeatureRef_Multivalued();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.AttributeRefImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getAttributeRef()
		 * @generated
		 */
		EClass ATTRIBUTE_REF = eINSTANCE.getAttributeRef();

		/**
		 * The meta object literal for the '<em><b>Referred Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REF__REFERRED_ELEMENT = eINSTANCE.getAttributeRef_ReferredElement();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_REF__FEATURE_NAME = eINSTANCE.getAttributeRef_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_REF__MULTIVALUED = eINSTANCE.getAttributeRef_Multivalued();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.impl.ReferenceRefImpl <em>Reference Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.impl.ReferenceRefImpl
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getReferenceRef()
		 * @generated
		 */
		EClass REFERENCE_REF = eINSTANCE.getReferenceRef();

		/**
		 * The meta object literal for the '<em><b>Referred Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_REF__REFERRED_ELEMENT = eINSTANCE.getReferenceRef_ReferredElement();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_REF__FEATURE_NAME = eINSTANCE.getReferenceRef_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_REF__MULTIVALUED = eINSTANCE.getReferenceRef_Multivalued();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.mappings.MappingCardinality <em>Mapping Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.mappings.MappingCardinality
		 * @see org.eclectic.frontend.mappings.impl.MappingsPackageImpl#getMappingCardinality()
		 * @generated
		 */
		EEnum MAPPING_CARDINALITY = eINSTANCE.getMappingCardinality();

	}

} //MappingsPackage
