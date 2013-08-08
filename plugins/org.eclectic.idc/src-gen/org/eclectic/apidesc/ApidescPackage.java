/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

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
 * @see org.eclectic.apidesc.ApidescFactory
 * @model kind="package"
 * @generated
 */
public interface ApidescPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apidesc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/apidesc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apidesc_mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApidescPackage eINSTANCE = org.eclectic.apidesc.impl.ApidescPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.ApiDescriptionImpl <em>Api Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.ApiDescriptionImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getApiDescription()
	 * @generated
	 */
	int API_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Api Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DESCRIPTION__API_NAME = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DESCRIPTION__METAMODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mapper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DESCRIPTION__MAPPER_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Class Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DESCRIPTION__CLASS_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Declared Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DESCRIPTION__DECLARED_ELEMENTS = 4;

	/**
	 * The number of structural features of the '<em>Api Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.ClassMappingImpl <em>Class Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.ClassMappingImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getClassMapping()
	 * @generated
	 */
	int CLASS_MAPPING = 1;

	/**
	 * The number of structural features of the '<em>Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SimpleClassMappingImpl <em>Simple Class Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SimpleClassMappingImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleClassMapping()
	 * @generated
	 */
	int SIMPLE_CLASS_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_MAPPING__METACLASS_NAME = CLASS_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Canonical Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME = CLASS_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS = CLASS_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_MAPPING__CREATION = CLASS_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_MAPPING_FEATURE_COUNT = CLASS_MAPPING_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.CreationMechanismImpl <em>Creation Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.CreationMechanismImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getCreationMechanism()
	 * @generated
	 */
	int CREATION_MECHANISM = 3;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MECHANISM__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Creation Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MECHANISM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.StatementImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 4;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SetFeatureImpl <em>Set Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SetFeatureImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSetFeature()
	 * @generated
	 */
	int SET_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__FEATURE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__VALUE_KIND = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__STR_VALUE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__INT_VALUE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bool Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__BOOL_VALUE = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Set Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.ConstructorImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 6;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__STATEMENT = CREATION_MECHANISM__STATEMENT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = CREATION_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = CREATION_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.FeatureMappingImpl <em>Feature Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.FeatureMappingImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getFeatureMapping()
	 * @generated
	 */
	int FEATURE_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING__FEATURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Constructor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING__CONSTRUCTOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Set Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING__SET_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Get Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING__GET_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING__IS_MULTIVALUED = 4;

	/**
	 * The number of structural features of the '<em>Feature Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SetMechanismImpl <em>Set Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SetMechanismImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSetMechanism()
	 * @generated
	 */
	int SET_MECHANISM = 8;

	/**
	 * The number of structural features of the '<em>Set Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MECHANISM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SimpleSetImpl <em>Simple Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SimpleSetImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleSet()
	 * @generated
	 */
	int SIMPLE_SET = 9;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SET__SETTER = SET_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SET_FEATURE_COUNT = SET_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.GetMechanismImpl <em>Get Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.GetMechanismImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getGetMechanism()
	 * @generated
	 */
	int GET_MECHANISM = 10;

	/**
	 * The number of structural features of the '<em>Get Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MECHANISM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SimpleGetImpl <em>Simple Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SimpleGetImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleGet()
	 * @generated
	 */
	int SIMPLE_GET = 11;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_GET__DEBUG_NAME = GET_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_GET__GETTER = GET_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_GET_FEATURE_COUNT = GET_MECHANISM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.GenericGetImpl <em>Generic Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.GenericGetImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getGenericGet()
	 * @generated
	 */
	int GENERIC_GET = 12;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GET__DEBUG_NAME = SIMPLE_GET__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GET__GETTER = SIMPLE_GET__GETTER;

	/**
	 * The number of structural features of the '<em>Generic Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GET_FEATURE_COUNT = SIMPLE_GET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.GenericSetImpl <em>Generic Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.GenericSetImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getGenericSet()
	 * @generated
	 */
	int GENERIC_SET = 13;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SET__SETTER = SIMPLE_SET__SETTER;

	/**
	 * The number of structural features of the '<em>Generic Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SET_FEATURE_COUNT = SIMPLE_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.MethodImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETER_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Return Void</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_VOID = 3;

	/**
	 * The feature id for the '<em><b>Return Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Return Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_COLLECTION = 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.AttributeMappingImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getAttributeMapping()
	 * @generated
	 */
	int ATTRIBUTE_MAPPING = 15;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__FEATURE_NAME = FEATURE_MAPPING__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Constructor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__CONSTRUCTOR_TYPE = FEATURE_MAPPING__CONSTRUCTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Set Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__SET_METHOD = FEATURE_MAPPING__SET_METHOD;

	/**
	 * The feature id for the '<em><b>Get Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__GET_METHOD = FEATURE_MAPPING__GET_METHOD;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__IS_MULTIVALUED = FEATURE_MAPPING__IS_MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__TYPE = FEATURE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_FEATURE_COUNT = FEATURE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SimpleAttributeMappingImpl <em>Simple Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SimpleAttributeMappingImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleAttributeMapping()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE_MAPPING = 16;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING__FEATURE_NAME = ATTRIBUTE_MAPPING__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Constructor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING__CONSTRUCTOR_TYPE = ATTRIBUTE_MAPPING__CONSTRUCTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Set Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING__SET_METHOD = ATTRIBUTE_MAPPING__SET_METHOD;

	/**
	 * The feature id for the '<em><b>Get Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING__GET_METHOD = ATTRIBUTE_MAPPING__GET_METHOD;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING__IS_MULTIVALUED = ATTRIBUTE_MAPPING__IS_MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING__TYPE = ATTRIBUTE_MAPPING__TYPE;

	/**
	 * The number of structural features of the '<em>Simple Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_MAPPING_FEATURE_COUNT = ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.SimpleReferenceMappingImpl <em>Simple Reference Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.SimpleReferenceMappingImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleReferenceMapping()
	 * @generated
	 */
	int SIMPLE_REFERENCE_MAPPING = 17;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING__FEATURE_NAME = FEATURE_MAPPING__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Constructor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING__CONSTRUCTOR_TYPE = FEATURE_MAPPING__CONSTRUCTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Set Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING__SET_METHOD = FEATURE_MAPPING__SET_METHOD;

	/**
	 * The feature id for the '<em><b>Get Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING__GET_METHOD = FEATURE_MAPPING__GET_METHOD;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING__IS_MULTIVALUED = FEATURE_MAPPING__IS_MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING__TYPE = FEATURE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Reference Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCE_MAPPING_FEATURE_COUNT = FEATURE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.impl.DeclaredElementImpl <em>Declared Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.impl.DeclaredElementImpl
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getDeclaredElement()
	 * @generated
	 */
	int DECLARED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Declared Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.ReturnKind <em>Return Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.ReturnKind
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getReturnKind()
	 * @generated
	 */
	int RETURN_KIND = 19;

	/**
	 * The meta object id for the '{@link org.eclectic.apidesc.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.apidesc.PrimitiveType
	 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 20;

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.ApiDescription <em>Api Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api Description</em>'.
	 * @see org.eclectic.apidesc.ApiDescription
	 * @generated
	 */
	EClass getApiDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.ApiDescription#getApiName <em>Api Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Name</em>'.
	 * @see org.eclectic.apidesc.ApiDescription#getApiName()
	 * @see #getApiDescription()
	 * @generated
	 */
	EAttribute getApiDescription_ApiName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.ApiDescription#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see org.eclectic.apidesc.ApiDescription#getMetamodelName()
	 * @see #getApiDescription()
	 * @generated
	 */
	EAttribute getApiDescription_MetamodelName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.ApiDescription#getMapperClassName <em>Mapper Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapper Class Name</em>'.
	 * @see org.eclectic.apidesc.ApiDescription#getMapperClassName()
	 * @see #getApiDescription()
	 * @generated
	 */
	EAttribute getApiDescription_MapperClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.apidesc.ApiDescription#getClassMappings <em>Class Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Mappings</em>'.
	 * @see org.eclectic.apidesc.ApiDescription#getClassMappings()
	 * @see #getApiDescription()
	 * @generated
	 */
	EReference getApiDescription_ClassMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.apidesc.ApiDescription#getDeclaredElements <em>Declared Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Elements</em>'.
	 * @see org.eclectic.apidesc.ApiDescription#getDeclaredElements()
	 * @see #getApiDescription()
	 * @generated
	 */
	EReference getApiDescription_DeclaredElements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.ClassMapping <em>Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mapping</em>'.
	 * @see org.eclectic.apidesc.ClassMapping
	 * @generated
	 */
	EClass getClassMapping();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SimpleClassMapping <em>Simple Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Class Mapping</em>'.
	 * @see org.eclectic.apidesc.SimpleClassMapping
	 * @generated
	 */
	EClass getSimpleClassMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SimpleClassMapping#getMetaclassName <em>Metaclass Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metaclass Name</em>'.
	 * @see org.eclectic.apidesc.SimpleClassMapping#getMetaclassName()
	 * @see #getSimpleClassMapping()
	 * @generated
	 */
	EAttribute getSimpleClassMapping_MetaclassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SimpleClassMapping#getCanonicalClassName <em>Canonical Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Class Name</em>'.
	 * @see org.eclectic.apidesc.SimpleClassMapping#getCanonicalClassName()
	 * @see #getSimpleClassMapping()
	 * @generated
	 */
	EAttribute getSimpleClassMapping_CanonicalClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.apidesc.SimpleClassMapping#getFeatureMappings <em>Feature Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Mappings</em>'.
	 * @see org.eclectic.apidesc.SimpleClassMapping#getFeatureMappings()
	 * @see #getSimpleClassMapping()
	 * @generated
	 */
	EReference getSimpleClassMapping_FeatureMappings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.SimpleClassMapping#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation</em>'.
	 * @see org.eclectic.apidesc.SimpleClassMapping#getCreation()
	 * @see #getSimpleClassMapping()
	 * @generated
	 */
	EReference getSimpleClassMapping_Creation();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.CreationMechanism <em>Creation Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Mechanism</em>'.
	 * @see org.eclectic.apidesc.CreationMechanism
	 * @generated
	 */
	EClass getCreationMechanism();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.apidesc.CreationMechanism#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see org.eclectic.apidesc.CreationMechanism#getStatement()
	 * @see #getCreationMechanism()
	 * @generated
	 */
	EReference getCreationMechanism_Statement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclectic.apidesc.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SetFeature <em>Set Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Feature</em>'.
	 * @see org.eclectic.apidesc.SetFeature
	 * @generated
	 */
	EClass getSetFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.apidesc.SetFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclectic.apidesc.SetFeature#getFeature()
	 * @see #getSetFeature()
	 * @generated
	 */
	EReference getSetFeature_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SetFeature#getValueKind <em>Value Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Kind</em>'.
	 * @see org.eclectic.apidesc.SetFeature#getValueKind()
	 * @see #getSetFeature()
	 * @generated
	 */
	EAttribute getSetFeature_ValueKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SetFeature#getStrValue <em>Str Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Value</em>'.
	 * @see org.eclectic.apidesc.SetFeature#getStrValue()
	 * @see #getSetFeature()
	 * @generated
	 */
	EAttribute getSetFeature_StrValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SetFeature#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.eclectic.apidesc.SetFeature#getIntValue()
	 * @see #getSetFeature()
	 * @generated
	 */
	EAttribute getSetFeature_IntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SetFeature#isBoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Value</em>'.
	 * @see org.eclectic.apidesc.SetFeature#isBoolValue()
	 * @see #getSetFeature()
	 * @generated
	 */
	EAttribute getSetFeature_BoolValue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.eclectic.apidesc.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.apidesc.Constructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclectic.apidesc.Constructor#getParameters()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.FeatureMapping <em>Feature Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Mapping</em>'.
	 * @see org.eclectic.apidesc.FeatureMapping
	 * @generated
	 */
	EClass getFeatureMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.FeatureMapping#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.apidesc.FeatureMapping#getFeatureName()
	 * @see #getFeatureMapping()
	 * @generated
	 */
	EAttribute getFeatureMapping_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.FeatureMapping#getConstructorType <em>Constructor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor Type</em>'.
	 * @see org.eclectic.apidesc.FeatureMapping#getConstructorType()
	 * @see #getFeatureMapping()
	 * @generated
	 */
	EAttribute getFeatureMapping_ConstructorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.FeatureMapping#getSetMethod <em>Set Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Method</em>'.
	 * @see org.eclectic.apidesc.FeatureMapping#getSetMethod()
	 * @see #getFeatureMapping()
	 * @generated
	 */
	EReference getFeatureMapping_SetMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.FeatureMapping#getGetMethod <em>Get Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Method</em>'.
	 * @see org.eclectic.apidesc.FeatureMapping#getGetMethod()
	 * @see #getFeatureMapping()
	 * @generated
	 */
	EReference getFeatureMapping_GetMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.FeatureMapping#isIsMultivalued <em>Is Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multivalued</em>'.
	 * @see org.eclectic.apidesc.FeatureMapping#isIsMultivalued()
	 * @see #getFeatureMapping()
	 * @generated
	 */
	EAttribute getFeatureMapping_IsMultivalued();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SetMechanism <em>Set Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Mechanism</em>'.
	 * @see org.eclectic.apidesc.SetMechanism
	 * @generated
	 */
	EClass getSetMechanism();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SimpleSet <em>Simple Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Set</em>'.
	 * @see org.eclectic.apidesc.SimpleSet
	 * @generated
	 */
	EClass getSimpleSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.SimpleSet#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setter</em>'.
	 * @see org.eclectic.apidesc.SimpleSet#getSetter()
	 * @see #getSimpleSet()
	 * @generated
	 */
	EReference getSimpleSet_Setter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.GetMechanism <em>Get Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Mechanism</em>'.
	 * @see org.eclectic.apidesc.GetMechanism
	 * @generated
	 */
	EClass getGetMechanism();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SimpleGet <em>Simple Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Get</em>'.
	 * @see org.eclectic.apidesc.SimpleGet
	 * @generated
	 */
	EClass getSimpleGet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.SimpleGet#getDebugName <em>Debug Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Name</em>'.
	 * @see org.eclectic.apidesc.SimpleGet#getDebugName()
	 * @see #getSimpleGet()
	 * @generated
	 */
	EAttribute getSimpleGet_DebugName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.apidesc.SimpleGet#getGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getter</em>'.
	 * @see org.eclectic.apidesc.SimpleGet#getGetter()
	 * @see #getSimpleGet()
	 * @generated
	 */
	EReference getSimpleGet_Getter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.GenericGet <em>Generic Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Get</em>'.
	 * @see org.eclectic.apidesc.GenericGet
	 * @generated
	 */
	EClass getGenericGet();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.GenericSet <em>Generic Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Set</em>'.
	 * @see org.eclectic.apidesc.GenericSet
	 * @generated
	 */
	EClass getGenericSet();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.eclectic.apidesc.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.apidesc.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclectic.apidesc.Method#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Types</em>'.
	 * @see org.eclectic.apidesc.Method#getParameterTypes()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ParameterTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.eclectic.apidesc.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.Method#getReturnVoid <em>Return Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Void</em>'.
	 * @see org.eclectic.apidesc.Method#getReturnVoid()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnVoid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.Method#getReturnArray <em>Return Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Array</em>'.
	 * @see org.eclectic.apidesc.Method#getReturnArray()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.Method#getReturnCollection <em>Return Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Collection</em>'.
	 * @see org.eclectic.apidesc.Method#getReturnCollection()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnCollection();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.AttributeMapping <em>Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Mapping</em>'.
	 * @see org.eclectic.apidesc.AttributeMapping
	 * @generated
	 */
	EClass getAttributeMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.AttributeMapping#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclectic.apidesc.AttributeMapping#getType()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EAttribute getAttributeMapping_Type();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SimpleAttributeMapping <em>Simple Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute Mapping</em>'.
	 * @see org.eclectic.apidesc.SimpleAttributeMapping
	 * @generated
	 */
	EClass getSimpleAttributeMapping();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.SimpleReferenceMapping <em>Simple Reference Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Reference Mapping</em>'.
	 * @see org.eclectic.apidesc.SimpleReferenceMapping
	 * @generated
	 */
	EClass getSimpleReferenceMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.apidesc.SimpleReferenceMapping#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclectic.apidesc.SimpleReferenceMapping#getType()
	 * @see #getSimpleReferenceMapping()
	 * @generated
	 */
	EReference getSimpleReferenceMapping_Type();

	/**
	 * Returns the meta object for class '{@link org.eclectic.apidesc.DeclaredElement <em>Declared Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Element</em>'.
	 * @see org.eclectic.apidesc.DeclaredElement
	 * @generated
	 */
	EClass getDeclaredElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.apidesc.DeclaredElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.apidesc.DeclaredElement#getName()
	 * @see #getDeclaredElement()
	 * @generated
	 */
	EAttribute getDeclaredElement_Name();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.apidesc.ReturnKind <em>Return Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Kind</em>'.
	 * @see org.eclectic.apidesc.ReturnKind
	 * @generated
	 */
	EEnum getReturnKind();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.apidesc.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see org.eclectic.apidesc.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApidescFactory getApidescFactory();

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
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.ApiDescriptionImpl <em>Api Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.ApiDescriptionImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getApiDescription()
		 * @generated
		 */
		EClass API_DESCRIPTION = eINSTANCE.getApiDescription();

		/**
		 * The meta object literal for the '<em><b>Api Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_DESCRIPTION__API_NAME = eINSTANCE.getApiDescription_ApiName();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_DESCRIPTION__METAMODEL_NAME = eINSTANCE.getApiDescription_MetamodelName();

		/**
		 * The meta object literal for the '<em><b>Mapper Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_DESCRIPTION__MAPPER_CLASS_NAME = eINSTANCE.getApiDescription_MapperClassName();

		/**
		 * The meta object literal for the '<em><b>Class Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_DESCRIPTION__CLASS_MAPPINGS = eINSTANCE.getApiDescription_ClassMappings();

		/**
		 * The meta object literal for the '<em><b>Declared Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_DESCRIPTION__DECLARED_ELEMENTS = eINSTANCE.getApiDescription_DeclaredElements();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.ClassMappingImpl <em>Class Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.ClassMappingImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getClassMapping()
		 * @generated
		 */
		EClass CLASS_MAPPING = eINSTANCE.getClassMapping();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SimpleClassMappingImpl <em>Simple Class Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SimpleClassMappingImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleClassMapping()
		 * @generated
		 */
		EClass SIMPLE_CLASS_MAPPING = eINSTANCE.getSimpleClassMapping();

		/**
		 * The meta object literal for the '<em><b>Metaclass Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CLASS_MAPPING__METACLASS_NAME = eINSTANCE.getSimpleClassMapping_MetaclassName();

		/**
		 * The meta object literal for the '<em><b>Canonical Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME = eINSTANCE.getSimpleClassMapping_CanonicalClassName();

		/**
		 * The meta object literal for the '<em><b>Feature Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS = eINSTANCE.getSimpleClassMapping_FeatureMappings();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS_MAPPING__CREATION = eINSTANCE.getSimpleClassMapping_Creation();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.CreationMechanismImpl <em>Creation Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.CreationMechanismImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getCreationMechanism()
		 * @generated
		 */
		EClass CREATION_MECHANISM = eINSTANCE.getCreationMechanism();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION_MECHANISM__STATEMENT = eINSTANCE.getCreationMechanism_Statement();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.StatementImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SetFeatureImpl <em>Set Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SetFeatureImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSetFeature()
		 * @generated
		 */
		EClass SET_FEATURE = eINSTANCE.getSetFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_FEATURE__FEATURE = eINSTANCE.getSetFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Value Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FEATURE__VALUE_KIND = eINSTANCE.getSetFeature_ValueKind();

		/**
		 * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FEATURE__STR_VALUE = eINSTANCE.getSetFeature_StrValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FEATURE__INT_VALUE = eINSTANCE.getSetFeature_IntValue();

		/**
		 * The meta object literal for the '<em><b>Bool Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FEATURE__BOOL_VALUE = eINSTANCE.getSetFeature_BoolValue();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.ConstructorImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.FeatureMappingImpl <em>Feature Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.FeatureMappingImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getFeatureMapping()
		 * @generated
		 */
		EClass FEATURE_MAPPING = eINSTANCE.getFeatureMapping();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MAPPING__FEATURE_NAME = eINSTANCE.getFeatureMapping_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Constructor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MAPPING__CONSTRUCTOR_TYPE = eINSTANCE.getFeatureMapping_ConstructorType();

		/**
		 * The meta object literal for the '<em><b>Set Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING__SET_METHOD = eINSTANCE.getFeatureMapping_SetMethod();

		/**
		 * The meta object literal for the '<em><b>Get Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING__GET_METHOD = eINSTANCE.getFeatureMapping_GetMethod();

		/**
		 * The meta object literal for the '<em><b>Is Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MAPPING__IS_MULTIVALUED = eINSTANCE.getFeatureMapping_IsMultivalued();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SetMechanismImpl <em>Set Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SetMechanismImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSetMechanism()
		 * @generated
		 */
		EClass SET_MECHANISM = eINSTANCE.getSetMechanism();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SimpleSetImpl <em>Simple Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SimpleSetImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleSet()
		 * @generated
		 */
		EClass SIMPLE_SET = eINSTANCE.getSimpleSet();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SET__SETTER = eINSTANCE.getSimpleSet_Setter();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.GetMechanismImpl <em>Get Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.GetMechanismImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getGetMechanism()
		 * @generated
		 */
		EClass GET_MECHANISM = eINSTANCE.getGetMechanism();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SimpleGetImpl <em>Simple Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SimpleGetImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleGet()
		 * @generated
		 */
		EClass SIMPLE_GET = eINSTANCE.getSimpleGet();

		/**
		 * The meta object literal for the '<em><b>Debug Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_GET__DEBUG_NAME = eINSTANCE.getSimpleGet_DebugName();

		/**
		 * The meta object literal for the '<em><b>Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_GET__GETTER = eINSTANCE.getSimpleGet_Getter();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.GenericGetImpl <em>Generic Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.GenericGetImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getGenericGet()
		 * @generated
		 */
		EClass GENERIC_GET = eINSTANCE.getGenericGet();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.GenericSetImpl <em>Generic Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.GenericSetImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getGenericSet()
		 * @generated
		 */
		EClass GENERIC_SET = eINSTANCE.getGenericSet();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.MethodImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__PARAMETER_TYPES = eINSTANCE.getMethod_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Void</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_VOID = eINSTANCE.getMethod_ReturnVoid();

		/**
		 * The meta object literal for the '<em><b>Return Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_ARRAY = eINSTANCE.getMethod_ReturnArray();

		/**
		 * The meta object literal for the '<em><b>Return Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_COLLECTION = eINSTANCE.getMethod_ReturnCollection();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.AttributeMappingImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getAttributeMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING__TYPE = eINSTANCE.getAttributeMapping_Type();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SimpleAttributeMappingImpl <em>Simple Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SimpleAttributeMappingImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleAttributeMapping()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE_MAPPING = eINSTANCE.getSimpleAttributeMapping();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.SimpleReferenceMappingImpl <em>Simple Reference Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.SimpleReferenceMappingImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getSimpleReferenceMapping()
		 * @generated
		 */
		EClass SIMPLE_REFERENCE_MAPPING = eINSTANCE.getSimpleReferenceMapping();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_REFERENCE_MAPPING__TYPE = eINSTANCE.getSimpleReferenceMapping_Type();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.impl.DeclaredElementImpl <em>Declared Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.impl.DeclaredElementImpl
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getDeclaredElement()
		 * @generated
		 */
		EClass DECLARED_ELEMENT = eINSTANCE.getDeclaredElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_ELEMENT__NAME = eINSTANCE.getDeclaredElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.ReturnKind <em>Return Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.ReturnKind
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getReturnKind()
		 * @generated
		 */
		EEnum RETURN_KIND = eINSTANCE.getReturnKind();

		/**
		 * The meta object literal for the '{@link org.eclectic.apidesc.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.apidesc.PrimitiveType
		 * @see org.eclectic.apidesc.impl.ApidescPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //ApidescPackage
