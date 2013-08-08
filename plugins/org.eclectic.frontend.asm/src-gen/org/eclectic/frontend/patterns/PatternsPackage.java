/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns;

import org.eclectic.frontend.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclectic.frontend.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/patL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_patL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = org.eclectic.frontend.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.PatternSpecificationImpl <em>Pattern Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.PatternSpecificationImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPatternSpecification()
	 * @generated
	 */
	int PATTERN_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION__PATTERNS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SPECIFICATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.PatternImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__OBJECTS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__OUTPUT_VARIABLES = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.POutputVariableImpl <em>POutput Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.POutputVariableImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPOutputVariable()
	 * @generated
	 */
	int POUTPUT_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUTPUT_VARIABLE__OBJECT = 0;

	/**
	 * The number of structural features of the '<em>POutput Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUTPUT_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.PObjectImpl <em>PObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.PObjectImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPObject()
	 * @generated
	 */
	int POBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__ROW = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__COLUMN = CorePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__FILE = CorePackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__TYPE = CorePackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__FEATURES = CorePackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.PFeatureImpl <em>PFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.PFeatureImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPFeature()
	 * @generated
	 */
	int PFEATURE = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.PAttributeImpl <em>PAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.PAttributeImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPAttribute()
	 * @generated
	 */
	int PATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__ROW = PFEATURE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__COLUMN = PFEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__FILE = PFEATURE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__NAME = PFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__VALUE = PFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__VARIABLE = PFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE_FEATURE_COUNT = PFEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.PReferenceImpl <em>PReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.PReferenceImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPReference()
	 * @generated
	 */
	int PREFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__ROW = PFEATURE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__COLUMN = PFEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__FILE = PFEATURE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__NAME = PFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__VALUE = PFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = PFEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.patterns.impl.CollectionReferenceImpl <em>Collection Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.patterns.impl.CollectionReferenceImpl
	 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getCollectionReference()
	 * @generated
	 */
	int COLLECTION_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__ROW = PREFERENCE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__COLUMN = PREFERENCE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__FILE = PREFERENCE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__NAME = PREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__VALUE = PREFERENCE__VALUE;

	/**
	 * The number of structural features of the '<em>Collection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE_FEATURE_COUNT = PREFERENCE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.PatternSpecification <em>Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Specification</em>'.
	 * @see org.eclectic.frontend.patterns.PatternSpecification
	 * @generated
	 */
	EClass getPatternSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.patterns.PatternSpecification#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see org.eclectic.frontend.patterns.PatternSpecification#getPatterns()
	 * @see #getPatternSpecification()
	 * @generated
	 */
	EReference getPatternSpecification_Patterns();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see org.eclectic.frontend.patterns.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.patterns.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.patterns.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.patterns.Pattern#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.eclectic.frontend.patterns.Pattern#getObjects()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.patterns.Pattern#getOutputVariables <em>Output Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Variables</em>'.
	 * @see org.eclectic.frontend.patterns.Pattern#getOutputVariables()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_OutputVariables();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.POutputVariable <em>POutput Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POutput Variable</em>'.
	 * @see org.eclectic.frontend.patterns.POutputVariable
	 * @generated
	 */
	EClass getPOutputVariable();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.patterns.POutputVariable#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.eclectic.frontend.patterns.POutputVariable#getObject()
	 * @see #getPOutputVariable()
	 * @generated
	 */
	EReference getPOutputVariable_Object();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.PObject <em>PObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PObject</em>'.
	 * @see org.eclectic.frontend.patterns.PObject
	 * @generated
	 */
	EClass getPObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.patterns.PObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.patterns.PObject#getType()
	 * @see #getPObject()
	 * @generated
	 */
	EReference getPObject_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.patterns.PObject#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclectic.frontend.patterns.PObject#getFeatures()
	 * @see #getPObject()
	 * @generated
	 */
	EReference getPObject_Features();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.PFeature <em>PFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFeature</em>'.
	 * @see org.eclectic.frontend.patterns.PFeature
	 * @generated
	 */
	EClass getPFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.patterns.PFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.patterns.PFeature#getName()
	 * @see #getPFeature()
	 * @generated
	 */
	EAttribute getPFeature_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.PAttribute <em>PAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAttribute</em>'.
	 * @see org.eclectic.frontend.patterns.PAttribute
	 * @generated
	 */
	EClass getPAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.patterns.PAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclectic.frontend.patterns.PAttribute#getValue()
	 * @see #getPAttribute()
	 * @generated
	 */
	EReference getPAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.patterns.PAttribute#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclectic.frontend.patterns.PAttribute#getVariable()
	 * @see #getPAttribute()
	 * @generated
	 */
	EReference getPAttribute_Variable();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.PReference <em>PReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PReference</em>'.
	 * @see org.eclectic.frontend.patterns.PReference
	 * @generated
	 */
	EClass getPReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.patterns.PReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclectic.frontend.patterns.PReference#getValue()
	 * @see #getPReference()
	 * @generated
	 */
	EReference getPReference_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.patterns.CollectionReference <em>Collection Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Reference</em>'.
	 * @see org.eclectic.frontend.patterns.CollectionReference
	 * @generated
	 */
	EClass getCollectionReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.PatternSpecificationImpl <em>Pattern Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.PatternSpecificationImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPatternSpecification()
		 * @generated
		 */
		EClass PATTERN_SPECIFICATION = eINSTANCE.getPatternSpecification();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SPECIFICATION__PATTERNS = eINSTANCE.getPatternSpecification_Patterns();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.PatternImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__OBJECTS = eINSTANCE.getPattern_Objects();

		/**
		 * The meta object literal for the '<em><b>Output Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__OUTPUT_VARIABLES = eINSTANCE.getPattern_OutputVariables();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.POutputVariableImpl <em>POutput Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.POutputVariableImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPOutputVariable()
		 * @generated
		 */
		EClass POUTPUT_VARIABLE = eINSTANCE.getPOutputVariable();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUTPUT_VARIABLE__OBJECT = eINSTANCE.getPOutputVariable_Object();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.PObjectImpl <em>PObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.PObjectImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPObject()
		 * @generated
		 */
		EClass POBJECT = eINSTANCE.getPObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POBJECT__TYPE = eINSTANCE.getPObject_Type();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POBJECT__FEATURES = eINSTANCE.getPObject_Features();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.PFeatureImpl <em>PFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.PFeatureImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPFeature()
		 * @generated
		 */
		EClass PFEATURE = eINSTANCE.getPFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFEATURE__NAME = eINSTANCE.getPFeature_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.PAttributeImpl <em>PAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.PAttributeImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPAttribute()
		 * @generated
		 */
		EClass PATTRIBUTE = eINSTANCE.getPAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTRIBUTE__VALUE = eINSTANCE.getPAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTRIBUTE__VARIABLE = eINSTANCE.getPAttribute_Variable();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.PReferenceImpl <em>PReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.PReferenceImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getPReference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCE__VALUE = eINSTANCE.getPReference_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.patterns.impl.CollectionReferenceImpl <em>Collection Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.patterns.impl.CollectionReferenceImpl
		 * @see org.eclectic.frontend.patterns.impl.PatternsPackageImpl#getCollectionReference()
		 * @generated
		 */
		EClass COLLECTION_REFERENCE = eINSTANCE.getCollectionReference();

	}

} //PatternsPackage
