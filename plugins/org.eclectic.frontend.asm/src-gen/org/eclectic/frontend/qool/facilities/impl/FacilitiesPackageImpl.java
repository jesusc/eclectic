/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities.impl;

import org.eclectic.frontend.FrontendPackage;

import org.eclectic.frontend.attribution.AttributionPackage;

import org.eclectic.frontend.attribution.impl.AttributionPackageImpl;

import org.eclectic.frontend.chain.ChainPackage;

import org.eclectic.frontend.chain.impl.ChainPackageImpl;

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

import org.eclectic.frontend.qool.facilities.Copier;
import org.eclectic.frontend.qool.facilities.CopierCallbackDefinition;
import org.eclectic.frontend.qool.facilities.FacilitiesFactory;
import org.eclectic.frontend.qool.facilities.FacilitiesPackage;

import org.eclectic.frontend.qool.impl.QoolPackageImpl;

import org.eclectic.frontend.script.ScriptPackage;

import org.eclectic.frontend.script.impl.ScriptPackageImpl;

import org.eclectic.frontend.tao.TaoPackage;

import org.eclectic.frontend.tao.impl.TaoPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class FacilitiesPackageImpl extends EPackageImpl implements FacilitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copierCallbackDefinitionEClass = null;

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
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FacilitiesPackageImpl() {
		super(eNS_URI, FacilitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FacilitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FacilitiesPackage init() {
		if (isInited) return (FacilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI);

		// Obtain or create and register package
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FacilitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FrontendPackageImpl theFrontendPackage = (FrontendPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) instanceof FrontendPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) : FrontendPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		KoanPackageImpl theKoanPackage = (KoanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) instanceof KoanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) : KoanPackage.eINSTANCE);
		AttributionPackageImpl theAttributionPackage = (AttributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) instanceof AttributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) : AttributionPackage.eINSTANCE);
		ImperativePackageImpl theImperativePackage = (ImperativePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) instanceof ImperativePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) : ImperativePackage.eINSTANCE);
		ChainPackageImpl theChainPackage = (ChainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI) instanceof ChainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI) : ChainPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		MappingsPackageImpl theMappingsPackage = (MappingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI) instanceof MappingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI) : MappingsPackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		TaoPackageImpl theTaoPackage = (TaoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) instanceof TaoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) : TaoPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theFacilitiesPackage.createPackageContents();
		theFrontendPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theKoanPackage.createPackageContents();
		theAttributionPackage.createPackageContents();
		theImperativePackage.createPackageContents();
		theChainPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theMappingsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theTaoPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theFacilitiesPackage.initializePackageContents();
		theFrontendPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theKoanPackage.initializePackageContents();
		theAttributionPackage.initializePackageContents();
		theImperativePackage.initializePackageContents();
		theChainPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theMappingsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theTaoPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFacilitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FacilitiesPackage.eNS_URI, theFacilitiesPackage);
		return theFacilitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopier() {
		return copierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopier_Objects() {
		return (EReference)copierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopier_Callbacks() {
		return (EReference)copierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopier_CopyInModel() {
		return (EReference)copierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopierCallbackDefinition() {
		return copierCallbackDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopierCallbackDefinition_Stop() {
		return (EAttribute)copierCallbackDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopierCallbackDefinition_Trigger() {
		return (EReference)copierCallbackDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopierCallbackDefinition_Action() {
		return (EReference)copierCallbackDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesFactory getFacilitiesFactory() {
		return (FacilitiesFactory)getEFactoryInstance();
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
		copierEClass = createEClass(COPIER);
		createEReference(copierEClass, COPIER__OBJECTS);
		createEReference(copierEClass, COPIER__CALLBACKS);
		createEReference(copierEClass, COPIER__COPY_IN_MODEL);

		copierCallbackDefinitionEClass = createEClass(COPIER_CALLBACK_DEFINITION);
		createEAttribute(copierCallbackDefinitionEClass, COPIER_CALLBACK_DEFINITION__STOP);
		createEReference(copierCallbackDefinitionEClass, COPIER_CALLBACK_DEFINITION__TRIGGER);
		createEReference(copierCallbackDefinitionEClass, COPIER_CALLBACK_DEFINITION__ACTION);
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
		copierEClass.getESuperTypes().add(theCorePackage.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(copierEClass, Copier.class, "Copier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopier_Objects(), theCorePackage.getExpression(), null, "objects", null, 0, -1, Copier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopier_Callbacks(), this.getCopierCallbackDefinition(), null, "callbacks", null, 0, -1, Copier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopier_CopyInModel(), theCorePackage.getTransformationDefinitionParameter(), null, "copyInModel", null, 1, 1, Copier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copierCallbackDefinitionEClass, CopierCallbackDefinition.class, "CopierCallbackDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopierCallbackDefinition_Stop(), ecorePackage.getEBoolean(), "stop", "false", 1, 1, CopierCallbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopierCallbackDefinition_Trigger(), theCorePackage.getExpression(), null, "trigger", null, 1, 1, CopierCallbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopierCallbackDefinition_Action(), theCorePackage.getExpression(), null, "action", null, 1, 1, CopierCallbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FacilitiesPackageImpl
