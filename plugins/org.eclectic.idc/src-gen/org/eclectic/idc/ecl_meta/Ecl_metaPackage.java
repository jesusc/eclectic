/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta;

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
 * @see org.eclectic.idc.ecl_meta.Ecl_metaFactory
 * @model kind="package"
 * @generated
 */
public interface Ecl_metaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecl_meta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/ecl_meta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecl_meta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ecl_metaPackage eINSTANCE = org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.NamedElementImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

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
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KPackageImpl <em>KPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KPackageImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKPackage()
	 * @generated
	 */
	int KPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__SUBPACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__CLASSIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>KPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KMetamodelImpl <em>KMetamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KMetamodelImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKMetamodel()
	 * @generated
	 */
	int KMETAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMETAMODEL__NAME = KPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMETAMODEL__SUBPACKAGES = KPACKAGE__SUBPACKAGES;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMETAMODEL__CLASSIFIERS = KPACKAGE__CLASSIFIERS;

	/**
	 * The number of structural features of the '<em>KMetamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMETAMODEL_FEATURE_COUNT = KPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KClassifierImpl <em>KClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KClassifierImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKClassifier()
	 * @generated
	 */
	int KCLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCLASSIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>KClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KDataTypeImpl <em>KData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KDataTypeImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKDataType()
	 * @generated
	 */
	int KDATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDATA_TYPE__NAME = KCLASSIFIER__NAME;

	/**
	 * The number of structural features of the '<em>KData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDATA_TYPE_FEATURE_COUNT = KCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KPrimitiveTypeImpl <em>KPrimitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KPrimitiveTypeImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKPrimitiveType()
	 * @generated
	 */
	int KPRIMITIVE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPRIMITIVE_TYPE__NAME = KDATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>KPrimitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPRIMITIVE_TYPE_FEATURE_COUNT = KDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KEnumerationImpl <em>KEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KEnumerationImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKEnumeration()
	 * @generated
	 */
	int KENUMERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENUMERATION__NAME = KDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENUMERATION__LITERALS = KDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENUMERATION_FEATURE_COUNT = KDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KEnumLiteralImpl <em>KEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KEnumLiteralImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKEnumLiteral()
	 * @generated
	 */
	int KENUM_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENUM_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>KEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENUM_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KClassImpl <em>KClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KClassImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKClass()
	 * @generated
	 */
	int KCLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCLASS__NAME = KCLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCLASS__SUPERTYPES = KCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCLASS__FEATURES = KCLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>KClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCLASS_FEATURE_COUNT = KCLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl <em>KStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKStructuralFeature()
	 * @generated
	 */
	int KSTRUCTURAL_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSTRUCTURAL_FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSTRUCTURAL_FEATURE__IS_MULTIVALUED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSTRUCTURAL_FEATURE__KTYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ktype Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSTRUCTURAL_FEATURE__KTYPE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>KStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSTRUCTURAL_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KAttributeImpl <em>KAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KAttributeImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKAttribute()
	 * @generated
	 */
	int KATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATTRIBUTE__NAME = KSTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATTRIBUTE__IS_MULTIVALUED = KSTRUCTURAL_FEATURE__IS_MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Ktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATTRIBUTE__KTYPE = KSTRUCTURAL_FEATURE__KTYPE;

	/**
	 * The feature id for the '<em><b>Ktype Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATTRIBUTE__KTYPE_NAME = KSTRUCTURAL_FEATURE__KTYPE_NAME;

	/**
	 * The number of structural features of the '<em>KAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KATTRIBUTE_FEATURE_COUNT = KSTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.ecl_meta.impl.KReferenceImpl <em>KReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.ecl_meta.impl.KReferenceImpl
	 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKReference()
	 * @generated
	 */
	int KREFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__NAME = KSTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__IS_MULTIVALUED = KSTRUCTURAL_FEATURE__IS_MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Ktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__KTYPE = KSTRUCTURAL_FEATURE__KTYPE;

	/**
	 * The feature id for the '<em><b>Ktype Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__KTYPE_NAME = KSTRUCTURAL_FEATURE__KTYPE_NAME;

	/**
	 * The feature id for the '<em><b>Is Contained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__IS_CONTAINED = KSTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE_FEATURE_COUNT = KSTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclectic.idc.ecl_meta.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.ecl_meta.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.idc.ecl_meta.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KPackage <em>KPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPackage</em>'.
	 * @see org.eclectic.idc.ecl_meta.KPackage
	 * @generated
	 */
	EClass getKPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.ecl_meta.KPackage#getSubpackages <em>Subpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackages</em>'.
	 * @see org.eclectic.idc.ecl_meta.KPackage#getSubpackages()
	 * @see #getKPackage()
	 * @generated
	 */
	EReference getKPackage_Subpackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.ecl_meta.KPackage#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see org.eclectic.idc.ecl_meta.KPackage#getClassifiers()
	 * @see #getKPackage()
	 * @generated
	 */
	EReference getKPackage_Classifiers();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KMetamodel <em>KMetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KMetamodel</em>'.
	 * @see org.eclectic.idc.ecl_meta.KMetamodel
	 * @generated
	 */
	EClass getKMetamodel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KClassifier <em>KClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KClassifier</em>'.
	 * @see org.eclectic.idc.ecl_meta.KClassifier
	 * @generated
	 */
	EClass getKClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KDataType <em>KData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KData Type</em>'.
	 * @see org.eclectic.idc.ecl_meta.KDataType
	 * @generated
	 */
	EClass getKDataType();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KPrimitiveType <em>KPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPrimitive Type</em>'.
	 * @see org.eclectic.idc.ecl_meta.KPrimitiveType
	 * @generated
	 */
	EClass getKPrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KEnumeration <em>KEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KEnumeration</em>'.
	 * @see org.eclectic.idc.ecl_meta.KEnumeration
	 * @generated
	 */
	EClass getKEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.ecl_meta.KEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclectic.idc.ecl_meta.KEnumeration#getLiterals()
	 * @see #getKEnumeration()
	 * @generated
	 */
	EReference getKEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KEnumLiteral <em>KEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KEnum Literal</em>'.
	 * @see org.eclectic.idc.ecl_meta.KEnumLiteral
	 * @generated
	 */
	EClass getKEnumLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KClass <em>KClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KClass</em>'.
	 * @see org.eclectic.idc.ecl_meta.KClass
	 * @generated
	 */
	EClass getKClass();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.ecl_meta.KClass#getSupertypes <em>Supertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertypes</em>'.
	 * @see org.eclectic.idc.ecl_meta.KClass#getSupertypes()
	 * @see #getKClass()
	 * @generated
	 */
	EReference getKClass_Supertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.ecl_meta.KClass#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclectic.idc.ecl_meta.KClass#getFeatures()
	 * @see #getKClass()
	 * @generated
	 */
	EReference getKClass_Features();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KStructuralFeature <em>KStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KStructural Feature</em>'.
	 * @see org.eclectic.idc.ecl_meta.KStructuralFeature
	 * @generated
	 */
	EClass getKStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.ecl_meta.KStructuralFeature#isIsMultivalued <em>Is Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multivalued</em>'.
	 * @see org.eclectic.idc.ecl_meta.KStructuralFeature#isIsMultivalued()
	 * @see #getKStructuralFeature()
	 * @generated
	 */
	EAttribute getKStructuralFeature_IsMultivalued();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.ecl_meta.KStructuralFeature#getKtype <em>Ktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ktype</em>'.
	 * @see org.eclectic.idc.ecl_meta.KStructuralFeature#getKtype()
	 * @see #getKStructuralFeature()
	 * @generated
	 */
	EReference getKStructuralFeature_Ktype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.ecl_meta.KStructuralFeature#getKtypeName <em>Ktype Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ktype Name</em>'.
	 * @see org.eclectic.idc.ecl_meta.KStructuralFeature#getKtypeName()
	 * @see #getKStructuralFeature()
	 * @generated
	 */
	EAttribute getKStructuralFeature_KtypeName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KAttribute <em>KAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAttribute</em>'.
	 * @see org.eclectic.idc.ecl_meta.KAttribute
	 * @generated
	 */
	EClass getKAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.ecl_meta.KReference <em>KReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KReference</em>'.
	 * @see org.eclectic.idc.ecl_meta.KReference
	 * @generated
	 */
	EClass getKReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.ecl_meta.KReference#isIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Contained</em>'.
	 * @see org.eclectic.idc.ecl_meta.KReference#isIsContained()
	 * @see #getKReference()
	 * @generated
	 */
	EAttribute getKReference_IsContained();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ecl_metaFactory getEcl_metaFactory();

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
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.NamedElementImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KPackageImpl <em>KPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KPackageImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKPackage()
		 * @generated
		 */
		EClass KPACKAGE = eINSTANCE.getKPackage();

		/**
		 * The meta object literal for the '<em><b>Subpackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPACKAGE__SUBPACKAGES = eINSTANCE.getKPackage_Subpackages();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPACKAGE__CLASSIFIERS = eINSTANCE.getKPackage_Classifiers();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KMetamodelImpl <em>KMetamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KMetamodelImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKMetamodel()
		 * @generated
		 */
		EClass KMETAMODEL = eINSTANCE.getKMetamodel();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KClassifierImpl <em>KClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KClassifierImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKClassifier()
		 * @generated
		 */
		EClass KCLASSIFIER = eINSTANCE.getKClassifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KDataTypeImpl <em>KData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KDataTypeImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKDataType()
		 * @generated
		 */
		EClass KDATA_TYPE = eINSTANCE.getKDataType();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KPrimitiveTypeImpl <em>KPrimitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KPrimitiveTypeImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKPrimitiveType()
		 * @generated
		 */
		EClass KPRIMITIVE_TYPE = eINSTANCE.getKPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KEnumerationImpl <em>KEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KEnumerationImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKEnumeration()
		 * @generated
		 */
		EClass KENUMERATION = eINSTANCE.getKEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KENUMERATION__LITERALS = eINSTANCE.getKEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KEnumLiteralImpl <em>KEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KEnumLiteralImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKEnumLiteral()
		 * @generated
		 */
		EClass KENUM_LITERAL = eINSTANCE.getKEnumLiteral();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KClassImpl <em>KClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KClassImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKClass()
		 * @generated
		 */
		EClass KCLASS = eINSTANCE.getKClass();

		/**
		 * The meta object literal for the '<em><b>Supertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KCLASS__SUPERTYPES = eINSTANCE.getKClass_Supertypes();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KCLASS__FEATURES = eINSTANCE.getKClass_Features();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl <em>KStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKStructuralFeature()
		 * @generated
		 */
		EClass KSTRUCTURAL_FEATURE = eINSTANCE.getKStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Is Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KSTRUCTURAL_FEATURE__IS_MULTIVALUED = eINSTANCE.getKStructuralFeature_IsMultivalued();

		/**
		 * The meta object literal for the '<em><b>Ktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KSTRUCTURAL_FEATURE__KTYPE = eINSTANCE.getKStructuralFeature_Ktype();

		/**
		 * The meta object literal for the '<em><b>Ktype Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KSTRUCTURAL_FEATURE__KTYPE_NAME = eINSTANCE.getKStructuralFeature_KtypeName();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KAttributeImpl <em>KAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KAttributeImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKAttribute()
		 * @generated
		 */
		EClass KATTRIBUTE = eINSTANCE.getKAttribute();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.ecl_meta.impl.KReferenceImpl <em>KReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.ecl_meta.impl.KReferenceImpl
		 * @see org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl#getKReference()
		 * @generated
		 */
		EClass KREFERENCE = eINSTANCE.getKReference();

		/**
		 * The meta object literal for the '<em><b>Is Contained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KREFERENCE__IS_CONTAINED = eINSTANCE.getKReference_IsContained();

	}

} //Ecl_metaPackage
