/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain.impl;

import org.eclectic.frontend.FrontendPackage;

import org.eclectic.frontend.attribution.AttributionPackage;

import org.eclectic.frontend.attribution.impl.AttributionPackageImpl;

import org.eclectic.frontend.chain.AvailableTransformation;
import org.eclectic.frontend.chain.ChainFactory;
import org.eclectic.frontend.chain.ChainPackage;
import org.eclectic.frontend.chain.ChainTransformation;
import org.eclectic.frontend.chain.CompositeTransformation;
import org.eclectic.frontend.chain.ExternalTransformation;
import org.eclectic.frontend.chain.GeneratedModel;
import org.eclectic.frontend.chain.TransformationExecution;

import org.eclectic.frontend.core.CorePackage;

import org.eclectic.frontend.core.impl.CorePackageImpl;

import org.eclectic.frontend.imperative.ImperativePackage;
import org.eclectic.frontend.imperative.impl.ImperativePackageImpl;
import org.eclectic.frontend.impl.FrontendPackageImpl;

import org.eclectic.frontend.koan.KoanPackage;

import org.eclectic.frontend.koan.impl.KoanPackageImpl;

import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclectic.frontend.mappings.impl.MappingsPackageImpl;

import org.eclectic.frontend.patterns.PatternsPackage;
import org.eclectic.frontend.patterns.impl.PatternsPackageImpl;
import org.eclectic.frontend.qool.QoolPackage;

import org.eclectic.frontend.qool.facilities.FacilitiesPackage;
import org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl;
import org.eclectic.frontend.qool.impl.QoolPackageImpl;

import org.eclectic.frontend.script.ScriptPackage;

import org.eclectic.frontend.script.impl.ScriptPackageImpl;

import org.eclectic.frontend.tao.TaoPackage;

import org.eclectic.frontend.tao.impl.TaoPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChainPackageImpl extends EPackageImpl implements ChainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatedModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availableTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTransformationEClass = null;

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
	 * @see org.eclectic.frontend.chain.ChainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChainPackageImpl() {
		super(eNS_URI, ChainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChainPackage init() {
		if (isInited) return (ChainPackage)EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI);

		// Obtain or create and register package
		ChainPackageImpl theChainPackage = (ChainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FrontendPackageImpl theFrontendPackage = (FrontendPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) instanceof FrontendPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) : FrontendPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		KoanPackageImpl theKoanPackage = (KoanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) instanceof KoanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) : KoanPackage.eINSTANCE);
		AttributionPackageImpl theAttributionPackage = (AttributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) instanceof AttributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) : AttributionPackage.eINSTANCE);
		ImperativePackageImpl theImperativePackage = (ImperativePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) instanceof ImperativePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) : ImperativePackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		MappingsPackageImpl theMappingsPackage = (MappingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI) instanceof MappingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI) : MappingsPackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		TaoPackageImpl theTaoPackage = (TaoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) instanceof TaoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) : TaoPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theChainPackage.createPackageContents();
		theFrontendPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theKoanPackage.createPackageContents();
		theAttributionPackage.createPackageContents();
		theImperativePackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theMappingsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theTaoPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theChainPackage.initializePackageContents();
		theFrontendPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theKoanPackage.initializePackageContents();
		theAttributionPackage.initializePackageContents();
		theImperativePackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theMappingsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theTaoPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChainPackage.eNS_URI, theChainPackage);
		return theChainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainTransformation() {
		return chainTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainTransformation_Composites() {
		return (EReference)chainTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainTransformation_Externals() {
		return (EReference)chainTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainTransformation_GeneratedModels() {
		return (EReference)chainTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainTransformation_Executions() {
		return (EReference)chainTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratedModel() {
		return generatedModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationExecution() {
		return transformationExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationExecution_Transformation() {
		return (EReference)transformationExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationExecution_InputModels() {
		return (EReference)transformationExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationExecution_OutputModels() {
		return (EReference)transformationExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailableTransformation() {
		return availableTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalTransformation() {
		return externalTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTransformation() {
		return compositeTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTransformation_Executions() {
		return (EReference)compositeTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFactory getChainFactory() {
		return (ChainFactory)getEFactoryInstance();
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
		chainTransformationEClass = createEClass(CHAIN_TRANSFORMATION);
		createEReference(chainTransformationEClass, CHAIN_TRANSFORMATION__COMPOSITES);
		createEReference(chainTransformationEClass, CHAIN_TRANSFORMATION__EXTERNALS);
		createEReference(chainTransformationEClass, CHAIN_TRANSFORMATION__GENERATED_MODELS);
		createEReference(chainTransformationEClass, CHAIN_TRANSFORMATION__EXECUTIONS);

		generatedModelEClass = createEClass(GENERATED_MODEL);

		transformationExecutionEClass = createEClass(TRANSFORMATION_EXECUTION);
		createEReference(transformationExecutionEClass, TRANSFORMATION_EXECUTION__TRANSFORMATION);
		createEReference(transformationExecutionEClass, TRANSFORMATION_EXECUTION__INPUT_MODELS);
		createEReference(transformationExecutionEClass, TRANSFORMATION_EXECUTION__OUTPUT_MODELS);

		availableTransformationEClass = createEClass(AVAILABLE_TRANSFORMATION);

		externalTransformationEClass = createEClass(EXTERNAL_TRANSFORMATION);

		compositeTransformationEClass = createEClass(COMPOSITE_TRANSFORMATION);
		createEReference(compositeTransformationEClass, COMPOSITE_TRANSFORMATION__EXECUTIONS);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		chainTransformationEClass.getESuperTypes().add(theCorePackage.getTransformationDefinition());
		generatedModelEClass.getESuperTypes().add(theCorePackage.getRepresentModel());
		generatedModelEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		transformationExecutionEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		externalTransformationEClass.getESuperTypes().add(this.getAvailableTransformation());
		externalTransformationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		compositeTransformationEClass.getESuperTypes().add(this.getAvailableTransformation());
		compositeTransformationEClass.getESuperTypes().add(theCorePackage.getTransformationDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(chainTransformationEClass, ChainTransformation.class, "ChainTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainTransformation_Composites(), this.getCompositeTransformation(), null, "composites", null, 0, -1, ChainTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainTransformation_Externals(), this.getExternalTransformation(), null, "externals", null, 0, -1, ChainTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainTransformation_GeneratedModels(), this.getGeneratedModel(), null, "generatedModels", null, 0, -1, ChainTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainTransformation_Executions(), this.getTransformationExecution(), null, "executions", null, 0, -1, ChainTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedModelEClass, GeneratedModel.class, "GeneratedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformationExecutionEClass, TransformationExecution.class, "TransformationExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationExecution_Transformation(), this.getAvailableTransformation(), null, "transformation", null, 1, 1, TransformationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationExecution_InputModels(), theCorePackage.getRepresentModel(), null, "inputModels", null, 0, -1, TransformationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationExecution_OutputModels(), theCorePackage.getRepresentModel(), null, "outputModels", null, 0, -1, TransformationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availableTransformationEClass, AvailableTransformation.class, "AvailableTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalTransformationEClass, ExternalTransformation.class, "ExternalTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeTransformationEClass, CompositeTransformation.class, "CompositeTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeTransformation_Executions(), this.getTransformationExecution(), null, "executions", null, 0, -1, CompositeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ChainPackageImpl
