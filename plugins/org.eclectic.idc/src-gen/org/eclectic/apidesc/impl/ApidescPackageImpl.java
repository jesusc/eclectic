/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApidescFactory;
import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.AttributeMapping;
import org.eclectic.apidesc.ClassMapping;
import org.eclectic.apidesc.Constructor;
import org.eclectic.apidesc.CreationMechanism;
import org.eclectic.apidesc.DeclaredElement;
import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.GenericGet;
import org.eclectic.apidesc.GenericSet;
import org.eclectic.apidesc.GetMechanism;
import org.eclectic.apidesc.Method;
import org.eclectic.apidesc.PrimitiveType;
import org.eclectic.apidesc.ReturnKind;
import org.eclectic.apidesc.SetFeature;
import org.eclectic.apidesc.SetMechanism;
import org.eclectic.apidesc.SimpleAttributeMapping;
import org.eclectic.apidesc.SimpleClassMapping;

import org.eclectic.apidesc.SimpleGet;
import org.eclectic.apidesc.SimpleReferenceMapping;
import org.eclectic.apidesc.SimpleSet;
import org.eclectic.apidesc.Statement;
import org.eclectic.apidesc.patterns.PatternsPackage;
import org.eclectic.apidesc.patterns.impl.PatternsPackageImpl;
import org.eclectic.apidesc.SimpleFeatureMapping;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApidescPackageImpl extends EPackageImpl implements ApidescPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleClassMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleReferenceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclectic.apidesc.ApidescPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApidescPackageImpl() {
		super(eNS_URI, ApidescFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApidescPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApidescPackage init() {
		if (isInited) return (ApidescPackage)EPackage.Registry.INSTANCE.getEPackage(ApidescPackage.eNS_URI);

		// Obtain or create and register package
		ApidescPackageImpl theApidescPackage = (ApidescPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApidescPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApidescPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);

		// Create package meta-data objects
		theApidescPackage.createPackageContents();
		thePatternsPackage.createPackageContents();

		// Initialize created meta-data
		theApidescPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApidescPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApidescPackage.eNS_URI, theApidescPackage);
		return theApidescPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiDescription() {
		return apiDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiDescription_ApiName() {
		return (EAttribute)apiDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiDescription_MetamodelName() {
		return (EAttribute)apiDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiDescription_MapperClassName() {
		return (EAttribute)apiDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApiDescription_ClassMappings() {
		return (EReference)apiDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApiDescription_DeclaredElements() {
		return (EReference)apiDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMapping() {
		return classMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleClassMapping() {
		return simpleClassMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleClassMapping_MetaclassName() {
		return (EAttribute)simpleClassMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleClassMapping_CanonicalClassName() {
		return (EAttribute)simpleClassMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClassMapping_FeatureMappings() {
		return (EReference)simpleClassMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClassMapping_Creation() {
		return (EReference)simpleClassMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationMechanism() {
		return creationMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreationMechanism_Statement() {
		return (EReference)creationMechanismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetFeature() {
		return setFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetFeature_Feature() {
		return (EReference)setFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetFeature_ValueKind() {
		return (EAttribute)setFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetFeature_StrValue() {
		return (EAttribute)setFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetFeature_IntValue() {
		return (EAttribute)setFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetFeature_BoolValue() {
		return (EAttribute)setFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructor_Parameters() {
		return (EReference)constructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureMapping() {
		return featureMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureMapping_FeatureName() {
		return (EAttribute)featureMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureMapping_ConstructorType() {
		return (EAttribute)featureMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMapping_SetMethod() {
		return (EReference)featureMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMapping_GetMethod() {
		return (EReference)featureMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureMapping_IsMultivalued() {
		return (EAttribute)featureMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetMechanism() {
		return setMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSet() {
		return simpleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSet_Setter() {
		return (EReference)simpleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetMechanism() {
		return getMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleGet() {
		return simpleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleGet_DebugName() {
		return (EAttribute)simpleGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleGet_Getter() {
		return (EReference)simpleGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericGet() {
		return genericGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericSet() {
		return genericSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ParameterTypes() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnVoid() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnArray() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnCollection() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMapping_Type() {
		return (EAttribute)attributeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttributeMapping() {
		return simpleAttributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleReferenceMapping() {
		return simpleReferenceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleReferenceMapping_Type() {
		return (EReference)simpleReferenceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredElement() {
		return declaredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaredElement_Name() {
		return (EAttribute)declaredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReturnKind() {
		return returnKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApidescFactory getApidescFactory() {
		return (ApidescFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apiDescriptionEClass = createEClass(API_DESCRIPTION);
		createEAttribute(apiDescriptionEClass, API_DESCRIPTION__API_NAME);
		createEAttribute(apiDescriptionEClass, API_DESCRIPTION__METAMODEL_NAME);
		createEAttribute(apiDescriptionEClass, API_DESCRIPTION__MAPPER_CLASS_NAME);
		createEReference(apiDescriptionEClass, API_DESCRIPTION__CLASS_MAPPINGS);
		createEReference(apiDescriptionEClass, API_DESCRIPTION__DECLARED_ELEMENTS);

		classMappingEClass = createEClass(CLASS_MAPPING);

		simpleClassMappingEClass = createEClass(SIMPLE_CLASS_MAPPING);
		createEAttribute(simpleClassMappingEClass, SIMPLE_CLASS_MAPPING__METACLASS_NAME);
		createEAttribute(simpleClassMappingEClass, SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME);
		createEReference(simpleClassMappingEClass, SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS);
		createEReference(simpleClassMappingEClass, SIMPLE_CLASS_MAPPING__CREATION);

		creationMechanismEClass = createEClass(CREATION_MECHANISM);
		createEReference(creationMechanismEClass, CREATION_MECHANISM__STATEMENT);

		statementEClass = createEClass(STATEMENT);

		setFeatureEClass = createEClass(SET_FEATURE);
		createEReference(setFeatureEClass, SET_FEATURE__FEATURE);
		createEAttribute(setFeatureEClass, SET_FEATURE__VALUE_KIND);
		createEAttribute(setFeatureEClass, SET_FEATURE__STR_VALUE);
		createEAttribute(setFeatureEClass, SET_FEATURE__INT_VALUE);
		createEAttribute(setFeatureEClass, SET_FEATURE__BOOL_VALUE);

		constructorEClass = createEClass(CONSTRUCTOR);
		createEReference(constructorEClass, CONSTRUCTOR__PARAMETERS);

		featureMappingEClass = createEClass(FEATURE_MAPPING);
		createEAttribute(featureMappingEClass, FEATURE_MAPPING__FEATURE_NAME);
		createEAttribute(featureMappingEClass, FEATURE_MAPPING__CONSTRUCTOR_TYPE);
		createEReference(featureMappingEClass, FEATURE_MAPPING__SET_METHOD);
		createEReference(featureMappingEClass, FEATURE_MAPPING__GET_METHOD);
		createEAttribute(featureMappingEClass, FEATURE_MAPPING__IS_MULTIVALUED);

		setMechanismEClass = createEClass(SET_MECHANISM);

		simpleSetEClass = createEClass(SIMPLE_SET);
		createEReference(simpleSetEClass, SIMPLE_SET__SETTER);

		getMechanismEClass = createEClass(GET_MECHANISM);

		simpleGetEClass = createEClass(SIMPLE_GET);
		createEAttribute(simpleGetEClass, SIMPLE_GET__DEBUG_NAME);
		createEReference(simpleGetEClass, SIMPLE_GET__GETTER);

		genericGetEClass = createEClass(GENERIC_GET);

		genericSetEClass = createEClass(GENERIC_SET);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEAttribute(methodEClass, METHOD__PARAMETER_TYPES);
		createEAttribute(methodEClass, METHOD__RETURN_TYPE);
		createEAttribute(methodEClass, METHOD__RETURN_VOID);
		createEAttribute(methodEClass, METHOD__RETURN_ARRAY);
		createEAttribute(methodEClass, METHOD__RETURN_COLLECTION);

		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__TYPE);

		simpleAttributeMappingEClass = createEClass(SIMPLE_ATTRIBUTE_MAPPING);

		simpleReferenceMappingEClass = createEClass(SIMPLE_REFERENCE_MAPPING);
		createEReference(simpleReferenceMappingEClass, SIMPLE_REFERENCE_MAPPING__TYPE);

		declaredElementEClass = createEClass(DECLARED_ELEMENT);
		createEAttribute(declaredElementEClass, DECLARED_ELEMENT__NAME);

		// Create enums
		returnKindEEnum = createEEnum(RETURN_KIND);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePatternsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleClassMappingEClass.getESuperTypes().add(this.getClassMapping());
		setFeatureEClass.getESuperTypes().add(this.getStatement());
		constructorEClass.getESuperTypes().add(this.getCreationMechanism());
		simpleSetEClass.getESuperTypes().add(this.getSetMechanism());
		simpleGetEClass.getESuperTypes().add(this.getGetMechanism());
		genericGetEClass.getESuperTypes().add(this.getSimpleGet());
		genericSetEClass.getESuperTypes().add(this.getSimpleSet());
		attributeMappingEClass.getESuperTypes().add(this.getFeatureMapping());
		simpleAttributeMappingEClass.getESuperTypes().add(this.getAttributeMapping());
		simpleReferenceMappingEClass.getESuperTypes().add(this.getFeatureMapping());

		// Initialize classes and features; add operations and parameters
		initEClass(apiDescriptionEClass, ApiDescription.class, "ApiDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiDescription_ApiName(), ecorePackage.getEString(), "apiName", null, 1, 1, ApiDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDescription_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, ApiDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDescription_MapperClassName(), ecorePackage.getEString(), "mapperClassName", null, 0, 1, ApiDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApiDescription_ClassMappings(), this.getClassMapping(), null, "classMappings", null, 0, -1, ApiDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApiDescription_DeclaredElements(), this.getDeclaredElement(), null, "declaredElements", null, 0, -1, ApiDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classMappingEClass, ClassMapping.class, "ClassMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleClassMappingEClass, SimpleClassMapping.class, "SimpleClassMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleClassMapping_MetaclassName(), ecorePackage.getEString(), "metaclassName", null, 1, 1, SimpleClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleClassMapping_CanonicalClassName(), ecorePackage.getEString(), "canonicalClassName", null, 1, 1, SimpleClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClassMapping_FeatureMappings(), this.getFeatureMapping(), null, "featureMappings", null, 0, -1, SimpleClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClassMapping_Creation(), this.getCreationMechanism(), null, "creation", null, 1, 1, SimpleClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationMechanismEClass, CreationMechanism.class, "CreationMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreationMechanism_Statement(), this.getStatement(), null, "statement", null, 0, -1, CreationMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setFeatureEClass, SetFeature.class, "SetFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetFeature_Feature(), this.getFeatureMapping(), null, "feature", null, 1, 1, SetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetFeature_ValueKind(), this.getReturnKind(), "valueKind", null, 1, 1, SetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetFeature_StrValue(), ecorePackage.getEString(), "strValue", null, 0, 1, SetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetFeature_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, SetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetFeature_BoolValue(), ecorePackage.getEBoolean(), "boolValue", null, 0, 1, SetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructor_Parameters(), this.getFeatureMapping(), null, "parameters", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureMappingEClass, FeatureMapping.class, "FeatureMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureMapping_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureMapping_ConstructorType(), ecorePackage.getEString(), "constructorType", null, 0, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMapping_SetMethod(), this.getSetMechanism(), null, "setMethod", null, 0, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMapping_GetMethod(), this.getGetMechanism(), null, "getMethod", null, 0, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureMapping_IsMultivalued(), ecorePackage.getEBoolean(), "isMultivalued", "false", 1, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setMechanismEClass, SetMechanism.class, "SetMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleSetEClass, SimpleSet.class, "SimpleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSet_Setter(), this.getMethod(), null, "setter", null, 1, 1, SimpleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getMechanismEClass, GetMechanism.class, "GetMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleGetEClass, SimpleGet.class, "SimpleGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleGet_DebugName(), ecorePackage.getEString(), "debugName", null, 0, 1, SimpleGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleGet_Getter(), this.getMethod(), null, "getter", null, 1, 1, SimpleGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericGetEClass, GenericGet.class, "GenericGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericSetEClass, GenericSet.class, "GenericSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ParameterTypes(), ecorePackage.getEString(), "parameterTypes", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnVoid(), ecorePackage.getEBooleanObject(), "returnVoid", "false", 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnArray(), ecorePackage.getEBooleanObject(), "returnArray", "false", 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnCollection(), ecorePackage.getEBooleanObject(), "returnCollection", "false", 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeMapping_Type(), ecorePackage.getEString(), "type", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAttributeMappingEClass, SimpleAttributeMapping.class, "SimpleAttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleReferenceMappingEClass, SimpleReferenceMapping.class, "SimpleReferenceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleReferenceMapping_Type(), this.getClassMapping(), null, "type", null, 1, 1, SimpleReferenceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredElementEClass, DeclaredElement.class, "DeclaredElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaredElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeclaredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(returnKindEEnum, ReturnKind.class, "ReturnKind");
		addEEnumLiteral(returnKindEEnum, ReturnKind.SINGLE_OBJECT);
		addEEnumLiteral(returnKindEEnum, ReturnKind.PRIMITIVE_INTEGER);
		addEEnumLiteral(returnKindEEnum, ReturnKind.PRIMITIVE_STRING);
		addEEnumLiteral(returnKindEEnum, ReturnKind.PRIMITIVE_BOOLEAN);
		addEEnumLiteral(returnKindEEnum, ReturnKind.PRIMITIVE_DOUBLE);
		addEEnumLiteral(returnKindEEnum, ReturnKind.PRIMITIVE_FLOAT);
		addEEnumLiteral(returnKindEEnum, ReturnKind.ARRAY);
		addEEnumLiteral(returnKindEEnum, ReturnKind.COLLECTION);
		addEEnumLiteral(returnKindEEnum, ReturnKind.VOID);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.PRIMITIVE_INTEGER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.PRIMITIVE_STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.PRIMITIVE_BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.PRIMITIVE_DOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.PRIMITIVE_FLOAT);

		// Create resource
		createResource(eNS_URI);
	}

} //ApidescPackageImpl
