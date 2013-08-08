/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling.impl;

import org.eclectic.idc.IdcPackage;

import org.eclectic.idc.core.CorePackage;

import org.eclectic.idc.core.impl.CorePackageImpl;

import org.eclectic.idc.ecl_meta.Ecl_metaPackage;

import org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl;

import org.eclectic.idc.extensions.ExtensionsPackage;
import org.eclectic.idc.extensions.impl.ExtensionsPackageImpl;
import org.eclectic.idc.impl.IdcPackageImpl;

import org.eclectic.idc.instr.InstrPackage;

import org.eclectic.idc.instr.impl.InstrPackageImpl;

import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.impl.QoolPackageImpl;
import org.eclectic.idc.scheduling.ParallelTransformation;
import org.eclectic.idc.scheduling.Composite;
import org.eclectic.idc.scheduling.ExecutionPlan;
import org.eclectic.idc.scheduling.ModelLink;
import org.eclectic.idc.scheduling.Node;
import org.eclectic.idc.scheduling.Parallel;
import org.eclectic.idc.scheduling.SchedulingFactory;
import org.eclectic.idc.scheduling.SchedulingPackage;
import org.eclectic.idc.scheduling.SequentialTransformation;
import org.eclectic.idc.scheduling.TransformationExecution;
import org.eclipse.emf.ecore.EAttribute;
import org.eclectic.idc.scheduling.Sequential;
import org.eclectic.idc.scheduling.Single;
import org.eclectic.idc.scheduling.SingleExecutionPlan;
import org.eclectic.idc.scheduling.SingleMapping;

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
public class SchedulingPackageImpl extends EPackageImpl implements SchedulingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationExecutionEClass = null;

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
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulingPackageImpl() {
		super(eNS_URI, SchedulingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchedulingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulingPackage init() {
		if (isInited) return (SchedulingPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI);

		// Obtain or create and register package
		SchedulingPackageImpl theSchedulingPackage = (SchedulingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchedulingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchedulingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IdcPackageImpl theIdcPackage = (IdcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) instanceof IdcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) : IdcPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		InstrPackageImpl theInstrPackage = (InstrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) instanceof InstrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) : InstrPackage.eINSTANCE);
		Ecl_metaPackageImpl theEcl_metaPackage = (Ecl_metaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) instanceof Ecl_metaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) : Ecl_metaPackage.eINSTANCE);

		// Create package meta-data objects
		theSchedulingPackage.createPackageContents();
		theIdcPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theInstrPackage.createPackageContents();
		theEcl_metaPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulingPackage.initializePackageContents();
		theIdcPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theInstrPackage.initializePackageContents();
		theEcl_metaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchedulingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulingPackage.eNS_URI, theSchedulingPackage);
		return theSchedulingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelTransformation() {
		return parallelTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelTransformation_Executions() {
		return (EReference)parallelTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialTransformation() {
		return sequentialTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialTransformation_Executions() {
		return (EReference)sequentialTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialTransformation_IntermediateModels() {
		return (EReference)sequentialTransformationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTransformationExecution_TransformationName() {
		return (EAttribute)transformationExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationExecution_InModels() {
		return (EReference)transformationExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationExecution_OutModels() {
		return (EReference)transformationExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingFactory getSchedulingFactory() {
		return (SchedulingFactory)getEFactoryInstance();
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
		parallelTransformationEClass = createEClass(PARALLEL_TRANSFORMATION);
		createEReference(parallelTransformationEClass, PARALLEL_TRANSFORMATION__EXECUTIONS);

		sequentialTransformationEClass = createEClass(SEQUENTIAL_TRANSFORMATION);
		createEReference(sequentialTransformationEClass, SEQUENTIAL_TRANSFORMATION__EXECUTIONS);
		createEReference(sequentialTransformationEClass, SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS);

		transformationExecutionEClass = createEClass(TRANSFORMATION_EXECUTION);
		createEAttribute(transformationExecutionEClass, TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME);
		createEReference(transformationExecutionEClass, TRANSFORMATION_EXECUTION__IN_MODELS);
		createEReference(transformationExecutionEClass, TRANSFORMATION_EXECUTION__OUT_MODELS);
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
		parallelTransformationEClass.getESuperTypes().add(theCorePackage.getExecutableUnit());
		sequentialTransformationEClass.getESuperTypes().add(theCorePackage.getExecutableUnit());
		transformationExecutionEClass.getESuperTypes().add(theCorePackage.getLocatedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(parallelTransformationEClass, ParallelTransformation.class, "ParallelTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelTransformation_Executions(), this.getTransformationExecution(), null, "executions", null, 0, -1, ParallelTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequentialTransformationEClass, SequentialTransformation.class, "SequentialTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialTransformation_Executions(), this.getTransformationExecution(), null, "executions", null, 0, -1, SequentialTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialTransformation_IntermediateModels(), theCorePackage.getModelDefinition(), null, "intermediateModels", null, 0, -1, SequentialTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationExecutionEClass, TransformationExecution.class, "TransformationExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationExecution_TransformationName(), ecorePackage.getEString(), "transformationName", null, 1, 1, TransformationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationExecution_InModels(), theCorePackage.getModelDefinition(), null, "inModels", null, 0, -1, TransformationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationExecution_OutModels(), theCorePackage.getModelDefinition(), null, "outModels", null, 0, -1, TransformationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SchedulingPackageImpl
