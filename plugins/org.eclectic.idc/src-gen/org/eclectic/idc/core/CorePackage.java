/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclectic.idc.ecl_meta.Ecl_metaPackage;

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
 * @see org.eclectic.idc.core.CoreFactory
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
	String eNS_URI = "http://eclectic.org/idc/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idc_ast_core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.eclectic.idc.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.LocatedElementImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getLocatedElement()
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
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.NamedElementImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.CodeUnitImpl <em>Code Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.CodeUnitImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getCodeUnit()
	 * @generated
	 */
	int CODE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__ROW = LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__FILE = LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__QUALIFIER = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__MAIN = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__MODELS = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__ADDITIONAL_MODELS = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__IMPORTED_MODELS = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT__REQUIRES = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Code Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.ExecutableUnitImpl <em>Executable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.ExecutableUnitImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getExecutableUnit()
	 * @generated
	 */
	int EXECUTABLE_UNIT = 6;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.EntryPointUnitImpl <em>Entry Point Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.EntryPointUnitImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getEntryPointUnit()
	 * @generated
	 */
	int ENTRY_POINT_UNIT = 7;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.MethodLibraryImpl <em>Method Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.MethodLibraryImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMethodLibrary()
	 * @generated
	 */
	int METHOD_LIBRARY = 8;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.ModelDefinitionImpl <em>Model Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.ModelDefinitionImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getModelDefinition()
	 * @generated
	 */
	int MODEL_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINITION__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Included Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINITION__INCLUDED_LIBRARIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINITION__METAMODEL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.RequireDeclarationImpl <em>Require Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.RequireDeclarationImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getRequireDeclaration()
	 * @generated
	 */
	int REQUIRE_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__NAME = MODEL_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__KIND = MODEL_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Included Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__INCLUDED_LIBRARIES = MODEL_DEFINITION__INCLUDED_LIBRARIES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__METAMODEL = MODEL_DEFINITION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__DEFAULT = MODEL_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION__PARAMETERS = MODEL_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Require Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_DECLARATION_FEATURE_COUNT = MODEL_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.RequireParameterImpl <em>Require Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.RequireParameterImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getRequireParameter()
	 * @generated
	 */
	int REQUIRE_PARAMETER = 4;

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
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.RequireModelParameterImpl <em>Require Model Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.RequireModelParameterImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getRequireModelParameter()
	 * @generated
	 */
	int REQUIRE_MODEL_PARAMETER = 5;

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
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__ROW = CODE_UNIT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__COLUMN = CODE_UNIT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__FILE = CODE_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__NAME = CODE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__QUALIFIER = CODE_UNIT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__MAIN = CODE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__MODELS = CODE_UNIT__MODELS;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__ADDITIONAL_MODELS = CODE_UNIT__ADDITIONAL_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__IMPORTED_MODELS = CODE_UNIT__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__REQUIRES = CODE_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__PRE = CODE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT__POST = CODE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_UNIT_FEATURE_COUNT = CODE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__ROW = EXECUTABLE_UNIT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__COLUMN = EXECUTABLE_UNIT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__FILE = EXECUTABLE_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__NAME = EXECUTABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__QUALIFIER = EXECUTABLE_UNIT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__MAIN = EXECUTABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__MODELS = EXECUTABLE_UNIT__MODELS;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__ADDITIONAL_MODELS = EXECUTABLE_UNIT__ADDITIONAL_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__IMPORTED_MODELS = EXECUTABLE_UNIT__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__REQUIRES = EXECUTABLE_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__PRE = EXECUTABLE_UNIT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT__POST = EXECUTABLE_UNIT__POST;

	/**
	 * The number of structural features of the '<em>Entry Point Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_UNIT_FEATURE_COUNT = EXECUTABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__ROW = CODE_UNIT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__COLUMN = CODE_UNIT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__FILE = CODE_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__NAME = CODE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__QUALIFIER = CODE_UNIT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__MAIN = CODE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__MODELS = CODE_UNIT__MODELS;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__ADDITIONAL_MODELS = CODE_UNIT__ADDITIONAL_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__IMPORTED_MODELS = CODE_UNIT__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__REQUIRES = CODE_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__METHODS = CODE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY_FEATURE_COUNT = CODE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.MetamodelDefinitionImpl <em>Metamodel Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.MetamodelDefinitionImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMetamodelDefinition()
	 * @generated
	 */
	int METAMODEL_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DEFINITION__PATH = 0;

	/**
	 * The number of structural features of the '<em>Metamodel Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.ImportedModelImpl <em>Imported Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.ImportedModelImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getImportedModel()
	 * @generated
	 */
	int IMPORTED_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__NAME = MODEL_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__KIND = MODEL_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Included Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__INCLUDED_LIBRARIES = MODEL_DEFINITION__INCLUDED_LIBRARIES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__METAMODEL = MODEL_DEFINITION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Capability Queues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL__CAPABILITY_QUEUES = MODEL_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_MODEL_FEATURE_COUNT = MODEL_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.InstructionBlockImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getInstructionBlock()
	 * @generated
	 */
	int INSTRUCTION_BLOCK = 12;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.MappingImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 13;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ROW = LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FILE = LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__INSTRUCTIONS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.InstructionImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 14;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__ROW = LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__FILE = LOCATED_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.FunctionDefImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 15;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__INSTRUCTIONS = INSTRUCTION_BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__ROW = INSTRUCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__COLUMN = INSTRUCTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__FILE = INSTRUCTION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__FORMAL_PARAMETERS = INSTRUCTION_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF_FEATURE_COUNT = INSTRUCTION_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.NormalFunctionImpl <em>Normal Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.NormalFunctionImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getNormalFunction()
	 * @generated
	 */
	int NORMAL_FUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION__INSTRUCTIONS = FUNCTION_DEF__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION__ROW = FUNCTION_DEF__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION__COLUMN = FUNCTION_DEF__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION__FILE = FUNCTION_DEF__FILE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION__FORMAL_PARAMETERS = FUNCTION_DEF__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION__NAME = FUNCTION_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FUNCTION_FEATURE_COUNT = FUNCTION_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.VariableImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GET_RECEPTORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SET_RECEPTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SET_VALUES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ASSIGN_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IF_CONDITIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CALL_RECEPTORS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CALL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EMIT_VALUES = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.ParameterImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GET_RECEPTORS = VARIABLE__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SET_RECEPTORS = VARIABLE__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SET_VALUES = VARIABLE__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ASSIGN_VARIABLES = VARIABLE__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IF_CONDITIONS = VARIABLE__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CALL_RECEPTORS = VARIABLE__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CALL_PARAMETERS = VARIABLE__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EMIT_VALUES = VARIABLE__EMIT_VALUES;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.MethodDefinitionImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMethodDefinition()
	 * @generated
	 */
	int METHOD_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__INSTRUCTIONS = FUNCTION_DEF__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__ROW = FUNCTION_DEF__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__COLUMN = FUNCTION_DEF__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__FILE = FUNCTION_DEF__FILE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__FORMAL_PARAMETERS = FUNCTION_DEF__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__NAME = FUNCTION_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__TYPE = FUNCTION_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Self Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__SELF_VAR = FUNCTION_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_FEATURE_COUNT = FUNCTION_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.SelfVariableImpl <em>Self Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.SelfVariableImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getSelfVariable()
	 * @generated
	 */
	int SELF_VARIABLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__GET_RECEPTORS = VARIABLE__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__SET_RECEPTORS = VARIABLE__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__SET_VALUES = VARIABLE__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__ASSIGN_VARIABLES = VARIABLE__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__IF_CONDITIONS = VARIABLE__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__CALL_RECEPTORS = VARIABLE__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__CALL_PARAMETERS = VARIABLE__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE__EMIT_VALUES = VARIABLE__EMIT_VALUES;

	/**
	 * The number of structural features of the '<em>Self Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.impl.TypeInfoImpl <em>Type Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.impl.TypeInfoImpl
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getTypeInfo()
	 * @generated
	 */
	int TYPE_INFO = 21;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INFO__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INFO__CLASSIFIER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INFO__IS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Strict Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INFO__STRICT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Type Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INFO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.core.ModelKind <em>Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.core.ModelKind
	 * @see org.eclectic.idc.core.impl.CorePackageImpl#getModelKind()
	 * @generated
	 */
	int MODEL_KIND = 22;


	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see org.eclectic.idc.core.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.LocatedElement#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.eclectic.idc.core.LocatedElement#getRow()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.LocatedElement#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclectic.idc.core.LocatedElement#getColumn()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.LocatedElement#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclectic.idc.core.LocatedElement#getFile()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_File();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclectic.idc.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.idc.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.CodeUnit <em>Code Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Unit</em>'.
	 * @see org.eclectic.idc.core.CodeUnit
	 * @generated
	 */
	EClass getCodeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.CodeUnit#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.eclectic.idc.core.CodeUnit#getQualifier()
	 * @see #getCodeUnit()
	 * @generated
	 */
	EAttribute getCodeUnit_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.CodeUnit#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see org.eclectic.idc.core.CodeUnit#isMain()
	 * @see #getCodeUnit()
	 * @generated
	 */
	EAttribute getCodeUnit_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.CodeUnit#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.eclectic.idc.core.CodeUnit#getModels()
	 * @see #getCodeUnit()
	 * @generated
	 */
	EReference getCodeUnit_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.CodeUnit#getAdditionalModels <em>Additional Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Models</em>'.
	 * @see org.eclectic.idc.core.CodeUnit#getAdditionalModels()
	 * @see #getCodeUnit()
	 * @generated
	 */
	EReference getCodeUnit_AdditionalModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.CodeUnit#getImportedModels <em>Imported Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Models</em>'.
	 * @see org.eclectic.idc.core.CodeUnit#getImportedModels()
	 * @see #getCodeUnit()
	 * @generated
	 */
	EReference getCodeUnit_ImportedModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.CodeUnit#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see org.eclectic.idc.core.CodeUnit#getRequires()
	 * @see #getCodeUnit()
	 * @generated
	 */
	EReference getCodeUnit_Requires();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.RequireDeclaration <em>Require Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Declaration</em>'.
	 * @see org.eclectic.idc.core.RequireDeclaration
	 * @generated
	 */
	EClass getRequireDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.RequireDeclaration#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclectic.idc.core.RequireDeclaration#getDefault()
	 * @see #getRequireDeclaration()
	 * @generated
	 */
	EAttribute getRequireDeclaration_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.RequireDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.idc.core.RequireDeclaration#getParameters()
	 * @see #getRequireDeclaration()
	 * @generated
	 */
	EReference getRequireDeclaration_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.RequireParameter <em>Require Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Parameter</em>'.
	 * @see org.eclectic.idc.core.RequireParameter
	 * @generated
	 */
	EClass getRequireParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.RequireParameter#getFormalParameterName <em>Formal Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter Name</em>'.
	 * @see org.eclectic.idc.core.RequireParameter#getFormalParameterName()
	 * @see #getRequireParameter()
	 * @generated
	 */
	EAttribute getRequireParameter_FormalParameterName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.RequireModelParameter <em>Require Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Model Parameter</em>'.
	 * @see org.eclectic.idc.core.RequireModelParameter
	 * @generated
	 */
	EClass getRequireModelParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.core.RequireModelParameter#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.idc.core.RequireModelParameter#getModel()
	 * @see #getRequireModelParameter()
	 * @generated
	 */
	EReference getRequireModelParameter_Model();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.ExecutableUnit <em>Executable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Unit</em>'.
	 * @see org.eclectic.idc.core.ExecutableUnit
	 * @generated
	 */
	EClass getExecutableUnit();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.core.ExecutableUnit#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre</em>'.
	 * @see org.eclectic.idc.core.ExecutableUnit#getPre()
	 * @see #getExecutableUnit()
	 * @generated
	 */
	EReference getExecutableUnit_Pre();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.core.ExecutableUnit#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post</em>'.
	 * @see org.eclectic.idc.core.ExecutableUnit#getPost()
	 * @see #getExecutableUnit()
	 * @generated
	 */
	EReference getExecutableUnit_Post();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.EntryPointUnit <em>Entry Point Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Unit</em>'.
	 * @see org.eclectic.idc.core.EntryPointUnit
	 * @generated
	 */
	EClass getEntryPointUnit();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.MethodLibrary <em>Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Library</em>'.
	 * @see org.eclectic.idc.core.MethodLibrary
	 * @generated
	 */
	EClass getMethodLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.MethodLibrary#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclectic.idc.core.MethodLibrary#getMethods()
	 * @see #getMethodLibrary()
	 * @generated
	 */
	EReference getMethodLibrary_Methods();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.ModelDefinition <em>Model Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Definition</em>'.
	 * @see org.eclectic.idc.core.ModelDefinition
	 * @generated
	 */
	EClass getModelDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.ModelDefinition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclectic.idc.core.ModelDefinition#getKind()
	 * @see #getModelDefinition()
	 * @generated
	 */
	EAttribute getModelDefinition_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.ModelDefinition#getIncludedLibraries <em>Included Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Libraries</em>'.
	 * @see org.eclectic.idc.core.ModelDefinition#getIncludedLibraries()
	 * @see #getModelDefinition()
	 * @generated
	 */
	EReference getModelDefinition_IncludedLibraries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.core.ModelDefinition#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metamodel</em>'.
	 * @see org.eclectic.idc.core.ModelDefinition#getMetamodel()
	 * @see #getModelDefinition()
	 * @generated
	 */
	EReference getModelDefinition_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.MetamodelDefinition <em>Metamodel Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Definition</em>'.
	 * @see org.eclectic.idc.core.MetamodelDefinition
	 * @generated
	 */
	EClass getMetamodelDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.MetamodelDefinition#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclectic.idc.core.MetamodelDefinition#getPath()
	 * @see #getMetamodelDefinition()
	 * @generated
	 */
	EAttribute getMetamodelDefinition_Path();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.ImportedModel <em>Imported Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Model</em>'.
	 * @see org.eclectic.idc.core.ImportedModel
	 * @generated
	 */
	EClass getImportedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.ImportedModel#getCapabilityQueues <em>Capability Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Queues</em>'.
	 * @see org.eclectic.idc.core.ImportedModel#getCapabilityQueues()
	 * @see #getImportedModel()
	 * @generated
	 */
	EReference getImportedModel_CapabilityQueues();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Block</em>'.
	 * @see org.eclectic.idc.core.InstructionBlock
	 * @generated
	 */
	EClass getInstructionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.InstructionBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.eclectic.idc.core.InstructionBlock#getInstructions()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.eclectic.idc.core.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.eclectic.idc.core.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see org.eclectic.idc.core.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.core.FunctionDef#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see org.eclectic.idc.core.FunctionDef#getFormalParameters()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_FormalParameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.NormalFunction <em>Normal Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Function</em>'.
	 * @see org.eclectic.idc.core.NormalFunction
	 * @generated
	 */
	EClass getNormalFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.NormalFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.idc.core.NormalFunction#getName()
	 * @see #getNormalFunction()
	 * @generated
	 */
	EAttribute getNormalFunction_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclectic.idc.core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.MethodDefinition <em>Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Definition</em>'.
	 * @see org.eclectic.idc.core.MethodDefinition
	 * @generated
	 */
	EClass getMethodDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.core.MethodDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.idc.core.MethodDefinition#getType()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EReference getMethodDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.core.MethodDefinition#getSelfVar <em>Self Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self Var</em>'.
	 * @see org.eclectic.idc.core.MethodDefinition#getSelfVar()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EReference getMethodDefinition_SelfVar();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.SelfVariable <em>Self Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Variable</em>'.
	 * @see org.eclectic.idc.core.SelfVariable
	 * @generated
	 */
	EClass getSelfVariable();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclectic.idc.core.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.core.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.idc.core.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getGetReceptors <em>Get Receptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get Receptors</em>'.
	 * @see org.eclectic.idc.core.Variable#getGetReceptors()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_GetReceptors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getSetReceptors <em>Set Receptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Set Receptors</em>'.
	 * @see org.eclectic.idc.core.Variable#getSetReceptors()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_SetReceptors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Set Values</em>'.
	 * @see org.eclectic.idc.core.Variable#getSetValues()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_SetValues();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getAssignVariables <em>Assign Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Variables</em>'.
	 * @see org.eclectic.idc.core.Variable#getAssignVariables()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_AssignVariables();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getIfConditions <em>If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>If Conditions</em>'.
	 * @see org.eclectic.idc.core.Variable#getIfConditions()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_IfConditions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getCallReceptors <em>Call Receptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Receptors</em>'.
	 * @see org.eclectic.idc.core.Variable#getCallReceptors()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CallReceptors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getCallParameters <em>Call Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Parameters</em>'.
	 * @see org.eclectic.idc.core.Variable#getCallParameters()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CallParameters();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.core.Variable#getEmitValues <em>Emit Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emit Values</em>'.
	 * @see org.eclectic.idc.core.Variable#getEmitValues()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_EmitValues();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.core.TypeInfo <em>Type Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Info</em>'.
	 * @see org.eclectic.idc.core.TypeInfo
	 * @generated
	 */
	EClass getTypeInfo();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.core.TypeInfo#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.idc.core.TypeInfo#getModel()
	 * @see #getTypeInfo()
	 * @generated
	 */
	EReference getTypeInfo_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.TypeInfo#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see org.eclectic.idc.core.TypeInfo#getClassifierName()
	 * @see #getTypeInfo()
	 * @generated
	 */
	EAttribute getTypeInfo_ClassifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.TypeInfo#isIsList <em>Is List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is List</em>'.
	 * @see org.eclectic.idc.core.TypeInfo#isIsList()
	 * @see #getTypeInfo()
	 * @generated
	 */
	EAttribute getTypeInfo_IsList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.core.TypeInfo#isStrictType <em>Strict Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Type</em>'.
	 * @see org.eclectic.idc.core.TypeInfo#isStrictType()
	 * @see #getTypeInfo()
	 * @generated
	 */
	EAttribute getTypeInfo_StrictType();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.idc.core.ModelKind <em>Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Kind</em>'.
	 * @see org.eclectic.idc.core.ModelKind
	 * @generated
	 */
	EEnum getModelKind();

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
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.LocatedElementImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getLocatedElement()
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
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.NamedElementImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.CodeUnitImpl <em>Code Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.CodeUnitImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getCodeUnit()
		 * @generated
		 */
		EClass CODE_UNIT = eINSTANCE.getCodeUnit();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_UNIT__QUALIFIER = eINSTANCE.getCodeUnit_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_UNIT__MAIN = eINSTANCE.getCodeUnit_Main();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT__MODELS = eINSTANCE.getCodeUnit_Models();

		/**
		 * The meta object literal for the '<em><b>Additional Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT__ADDITIONAL_MODELS = eINSTANCE.getCodeUnit_AdditionalModels();

		/**
		 * The meta object literal for the '<em><b>Imported Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT__IMPORTED_MODELS = eINSTANCE.getCodeUnit_ImportedModels();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT__REQUIRES = eINSTANCE.getCodeUnit_Requires();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.RequireDeclarationImpl <em>Require Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.RequireDeclarationImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getRequireDeclaration()
		 * @generated
		 */
		EClass REQUIRE_DECLARATION = eINSTANCE.getRequireDeclaration();

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
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.RequireParameterImpl <em>Require Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.RequireParameterImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getRequireParameter()
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
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.RequireModelParameterImpl <em>Require Model Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.RequireModelParameterImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getRequireModelParameter()
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
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.ExecutableUnitImpl <em>Executable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.ExecutableUnitImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getExecutableUnit()
		 * @generated
		 */
		EClass EXECUTABLE_UNIT = eINSTANCE.getExecutableUnit();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_UNIT__PRE = eINSTANCE.getExecutableUnit_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_UNIT__POST = eINSTANCE.getExecutableUnit_Post();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.EntryPointUnitImpl <em>Entry Point Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.EntryPointUnitImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getEntryPointUnit()
		 * @generated
		 */
		EClass ENTRY_POINT_UNIT = eINSTANCE.getEntryPointUnit();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.MethodLibraryImpl <em>Method Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.MethodLibraryImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMethodLibrary()
		 * @generated
		 */
		EClass METHOD_LIBRARY = eINSTANCE.getMethodLibrary();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_LIBRARY__METHODS = eINSTANCE.getMethodLibrary_Methods();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.ModelDefinitionImpl <em>Model Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.ModelDefinitionImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getModelDefinition()
		 * @generated
		 */
		EClass MODEL_DEFINITION = eINSTANCE.getModelDefinition();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINITION__KIND = eINSTANCE.getModelDefinition_Kind();

		/**
		 * The meta object literal for the '<em><b>Included Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DEFINITION__INCLUDED_LIBRARIES = eINSTANCE.getModelDefinition_IncludedLibraries();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DEFINITION__METAMODEL = eINSTANCE.getModelDefinition_Metamodel();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.MetamodelDefinitionImpl <em>Metamodel Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.MetamodelDefinitionImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMetamodelDefinition()
		 * @generated
		 */
		EClass METAMODEL_DEFINITION = eINSTANCE.getMetamodelDefinition();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_DEFINITION__PATH = eINSTANCE.getMetamodelDefinition_Path();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.ImportedModelImpl <em>Imported Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.ImportedModelImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getImportedModel()
		 * @generated
		 */
		EClass IMPORTED_MODEL = eINSTANCE.getImportedModel();

		/**
		 * The meta object literal for the '<em><b>Capability Queues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_MODEL__CAPABILITY_QUEUES = eINSTANCE.getImportedModel_CapabilityQueues();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.InstructionBlockImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getInstructionBlock()
		 * @generated
		 */
		EClass INSTRUCTION_BLOCK = eINSTANCE.getInstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__INSTRUCTIONS = eINSTANCE.getInstructionBlock_Instructions();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.MappingImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.InstructionImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.FunctionDefImpl <em>Function Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.FunctionDefImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getFunctionDef()
		 * @generated
		 */
		EClass FUNCTION_DEF = eINSTANCE.getFunctionDef();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__FORMAL_PARAMETERS = eINSTANCE.getFunctionDef_FormalParameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.NormalFunctionImpl <em>Normal Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.NormalFunctionImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getNormalFunction()
		 * @generated
		 */
		EClass NORMAL_FUNCTION = eINSTANCE.getNormalFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_FUNCTION__NAME = eINSTANCE.getNormalFunction_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.ParameterImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.MethodDefinitionImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getMethodDefinition()
		 * @generated
		 */
		EClass METHOD_DEFINITION = eINSTANCE.getMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEFINITION__TYPE = eINSTANCE.getMethodDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Self Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEFINITION__SELF_VAR = eINSTANCE.getMethodDefinition_SelfVar();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.SelfVariableImpl <em>Self Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.SelfVariableImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getSelfVariable()
		 * @generated
		 */
		EClass SELF_VARIABLE = eINSTANCE.getSelfVariable();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.VariableImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Get Receptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__GET_RECEPTORS = eINSTANCE.getVariable_GetReceptors();

		/**
		 * The meta object literal for the '<em><b>Set Receptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SET_RECEPTORS = eINSTANCE.getVariable_SetReceptors();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SET_VALUES = eINSTANCE.getVariable_SetValues();

		/**
		 * The meta object literal for the '<em><b>Assign Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ASSIGN_VARIABLES = eINSTANCE.getVariable_AssignVariables();

		/**
		 * The meta object literal for the '<em><b>If Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__IF_CONDITIONS = eINSTANCE.getVariable_IfConditions();

		/**
		 * The meta object literal for the '<em><b>Call Receptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CALL_RECEPTORS = eINSTANCE.getVariable_CallReceptors();

		/**
		 * The meta object literal for the '<em><b>Call Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CALL_PARAMETERS = eINSTANCE.getVariable_CallParameters();

		/**
		 * The meta object literal for the '<em><b>Emit Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__EMIT_VALUES = eINSTANCE.getVariable_EmitValues();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.impl.TypeInfoImpl <em>Type Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.impl.TypeInfoImpl
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getTypeInfo()
		 * @generated
		 */
		EClass TYPE_INFO = eINSTANCE.getTypeInfo();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_INFO__MODEL = eINSTANCE.getTypeInfo_Model();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_INFO__CLASSIFIER_NAME = eINSTANCE.getTypeInfo_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Is List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_INFO__IS_LIST = eINSTANCE.getTypeInfo_IsList();

		/**
		 * The meta object literal for the '<em><b>Strict Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_INFO__STRICT_TYPE = eINSTANCE.getTypeInfo_StrictType();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.core.ModelKind <em>Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.core.ModelKind
		 * @see org.eclectic.idc.core.impl.CorePackageImpl#getModelKind()
		 * @generated
		 */
		EEnum MODEL_KIND = eINSTANCE.getModelKind();

	}

} //CorePackage
