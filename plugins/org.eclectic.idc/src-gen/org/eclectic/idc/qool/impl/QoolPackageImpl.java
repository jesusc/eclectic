/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

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


import org.eclectic.idc.qool.AccessByFeatureOptimization;
import org.eclectic.idc.qool.InlineModel;
import org.eclectic.idc.qool.KindOfPredicate;
import org.eclectic.idc.qool.LocalQueue;
import org.eclectic.idc.qool.LocalQuque;
import org.eclectic.idc.qool.ModelElementQueue;
import org.eclectic.idc.qool.PropertyEqualsPredicate;
import org.eclectic.idc.qool.QEmit;
import org.eclectic.idc.qool.Emit;
import org.eclectic.idc.qool.QForAll;
import org.eclectic.idc.qool.QIterator;
import org.eclectic.idc.qool.QMatch;
import org.eclectic.idc.qool.QMatchPredicate;
import org.eclectic.idc.qool.QoolFactory;
import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclectic.idc.qool.Queue;
import org.eclectic.idc.qool.QueueOptimization;
import org.eclectic.idc.qool.RequiredQueue;
import org.eclectic.idc.qool.Segment;

import org.eclectic.idc.scheduling.SchedulingPackage;

import org.eclectic.idc.scheduling.impl.SchedulingPackageImpl;

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
public class QoolPackageImpl extends EPackageImpl implements QoolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoolTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueOptimizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessByFeatureOptimizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qForAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qEmitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qMatchPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindOfPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEqualsPredicateEClass = null;

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
	 * @see org.eclectic.idc.qool.QoolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QoolPackageImpl() {
		super(eNS_URI, QoolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QoolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QoolPackage init() {
		if (isInited) return (QoolPackage)EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI);

		// Obtain or create and register package
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QoolPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IdcPackageImpl theIdcPackage = (IdcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) instanceof IdcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) : IdcPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);
		InstrPackageImpl theInstrPackage = (InstrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) instanceof InstrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) : InstrPackage.eINSTANCE);
		SchedulingPackageImpl theSchedulingPackage = (SchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) instanceof SchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) : SchedulingPackage.eINSTANCE);
		Ecl_metaPackageImpl theEcl_metaPackage = (Ecl_metaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) instanceof Ecl_metaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) : Ecl_metaPackage.eINSTANCE);

		// Create package meta-data objects
		theQoolPackage.createPackageContents();
		theIdcPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();
		theInstrPackage.createPackageContents();
		theSchedulingPackage.createPackageContents();
		theEcl_metaPackage.createPackageContents();

		// Initialize created meta-data
		theQoolPackage.initializePackageContents();
		theIdcPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();
		theInstrPackage.initializePackageContents();
		theSchedulingPackage.initializePackageContents();
		theEcl_metaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQoolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QoolPackage.eNS_URI, theQoolPackage);
		return theQoolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoolTransformation() {
		return qoolTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoolTransformation_Segments() {
		return (EReference)qoolTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoolTransformation_Queues() {
		return (EReference)qoolTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoolTransformation_Provided() {
		return (EReference)qoolTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoolTransformation_InlineModels() {
		return (EReference)qoolTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineModel() {
		return inlineModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineModel_Classifiers() {
		return (EReference)inlineModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegment() {
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegment_Name() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueue() {
		return queueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueue_Name() {
		return (EAttribute)queueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueue_Optimizations() {
		return (EReference)queueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueOptimization() {
		return queueOptimizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessByFeatureOptimization() {
		return accessByFeatureOptimizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessByFeatureOptimization_FeatureName() {
		return (EAttribute)accessByFeatureOptimizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessByFeatureOptimization_Speculative() {
		return (EAttribute)accessByFeatureOptimizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementQueue() {
		return modelElementQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementQueue_Type_() {
		return (EReference)modelElementQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementQueue_Additionals() {
		return (EReference)modelElementQueueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementQueue_Extension() {
		return (EReference)modelElementQueueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalQueue() {
		return localQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalQueue_Type_() {
		return (EReference)localQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredQueue() {
		return requiredQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredQueue_ImportedModel() {
		return (EReference)requiredQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQIterator() {
		return qIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQForAll() {
		return qForAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQForAll_Queue() {
		return (EReference)qForAllEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQEmit() {
		return qEmitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQEmit_Queue() {
		return (EReference)qEmitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQEmit_Value() {
		return (EReference)qEmitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQMatch() {
		return qMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQMatch_Queue() {
		return (EReference)qMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQMatch_Predicates() {
		return (EReference)qMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQMatch_GetterClosure() {
		return (EReference)qMatchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQMatchPredicate() {
		return qMatchPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindOfPredicate() {
		return kindOfPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindOfPredicate_ClassName() {
		return (EAttribute)kindOfPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindOfPredicate_Model() {
		return (EReference)kindOfPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyEqualsPredicate() {
		return propertyEqualsPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyEqualsPredicate_PropertyName() {
		return (EAttribute)propertyEqualsPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyEqualsPredicate_Value() {
		return (EReference)propertyEqualsPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolFactory getQoolFactory() {
		return (QoolFactory)getEFactoryInstance();
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
		qoolTransformationEClass = createEClass(QOOL_TRANSFORMATION);
		createEReference(qoolTransformationEClass, QOOL_TRANSFORMATION__SEGMENTS);
		createEReference(qoolTransformationEClass, QOOL_TRANSFORMATION__QUEUES);
		createEReference(qoolTransformationEClass, QOOL_TRANSFORMATION__PROVIDED);
		createEReference(qoolTransformationEClass, QOOL_TRANSFORMATION__INLINE_MODELS);

		inlineModelEClass = createEClass(INLINE_MODEL);
		createEReference(inlineModelEClass, INLINE_MODEL__CLASSIFIERS);

		segmentEClass = createEClass(SEGMENT);
		createEAttribute(segmentEClass, SEGMENT__NAME);

		queueEClass = createEClass(QUEUE);
		createEAttribute(queueEClass, QUEUE__NAME);
		createEReference(queueEClass, QUEUE__OPTIMIZATIONS);

		queueOptimizationEClass = createEClass(QUEUE_OPTIMIZATION);

		accessByFeatureOptimizationEClass = createEClass(ACCESS_BY_FEATURE_OPTIMIZATION);
		createEAttribute(accessByFeatureOptimizationEClass, ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME);
		createEAttribute(accessByFeatureOptimizationEClass, ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE);

		modelElementQueueEClass = createEClass(MODEL_ELEMENT_QUEUE);
		createEReference(modelElementQueueEClass, MODEL_ELEMENT_QUEUE__TYPE_);
		createEReference(modelElementQueueEClass, MODEL_ELEMENT_QUEUE__ADDITIONALS);
		createEReference(modelElementQueueEClass, MODEL_ELEMENT_QUEUE__EXTENSION);

		localQueueEClass = createEClass(LOCAL_QUEUE);
		createEReference(localQueueEClass, LOCAL_QUEUE__TYPE_);

		requiredQueueEClass = createEClass(REQUIRED_QUEUE);
		createEReference(requiredQueueEClass, REQUIRED_QUEUE__IMPORTED_MODEL);

		qIteratorEClass = createEClass(QITERATOR);

		qForAllEClass = createEClass(QFOR_ALL);
		createEReference(qForAllEClass, QFOR_ALL__QUEUE);

		qEmitEClass = createEClass(QEMIT);
		createEReference(qEmitEClass, QEMIT__QUEUE);
		createEReference(qEmitEClass, QEMIT__VALUE);

		qMatchEClass = createEClass(QMATCH);
		createEReference(qMatchEClass, QMATCH__QUEUE);
		createEReference(qMatchEClass, QMATCH__PREDICATES);
		createEReference(qMatchEClass, QMATCH__GETTER_CLOSURE);

		qMatchPredicateEClass = createEClass(QMATCH_PREDICATE);

		kindOfPredicateEClass = createEClass(KIND_OF_PREDICATE);
		createEAttribute(kindOfPredicateEClass, KIND_OF_PREDICATE__CLASS_NAME);
		createEReference(kindOfPredicateEClass, KIND_OF_PREDICATE__MODEL);

		propertyEqualsPredicateEClass = createEClass(PROPERTY_EQUALS_PREDICATE);
		createEAttribute(propertyEqualsPredicateEClass, PROPERTY_EQUALS_PREDICATE__PROPERTY_NAME);
		createEReference(propertyEqualsPredicateEClass, PROPERTY_EQUALS_PREDICATE__VALUE);
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
		Ecl_metaPackage theEcl_metaPackage = (Ecl_metaPackage)EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI);
		ExtensionsPackage theExtensionsPackage = (ExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI);
		InstrPackage theInstrPackage = (InstrPackage)EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qoolTransformationEClass.getESuperTypes().add(theCorePackage.getExecutableUnit());
		inlineModelEClass.getESuperTypes().add(theCorePackage.getModelDefinition());
		segmentEClass.getESuperTypes().add(theCorePackage.getInstructionBlock());
		accessByFeatureOptimizationEClass.getESuperTypes().add(this.getQueueOptimization());
		modelElementQueueEClass.getESuperTypes().add(this.getQueue());
		localQueueEClass.getESuperTypes().add(this.getQueue());
		requiredQueueEClass.getESuperTypes().add(this.getQueue());
		qIteratorEClass.getESuperTypes().add(theCorePackage.getVariable());
		qIteratorEClass.getESuperTypes().add(theCorePackage.getInstruction());
		qIteratorEClass.getESuperTypes().add(theCorePackage.getInstructionBlock());
		qForAllEClass.getESuperTypes().add(this.getQIterator());
		qEmitEClass.getESuperTypes().add(theCorePackage.getInstruction());
		qMatchEClass.getESuperTypes().add(theInstrPackage.getInstructionWithResult());
		kindOfPredicateEClass.getESuperTypes().add(this.getQMatchPredicate());
		propertyEqualsPredicateEClass.getESuperTypes().add(this.getQMatchPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(qoolTransformationEClass, QoolTransformation.class, "QoolTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoolTransformation_Segments(), this.getSegment(), null, "segments", null, 0, -1, QoolTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoolTransformation_Queues(), this.getQueue(), null, "queues", null, 0, -1, QoolTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoolTransformation_Provided(), this.getQueue(), null, "provided", null, 0, -1, QoolTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoolTransformation_InlineModels(), this.getInlineModel(), null, "inlineModels", null, 0, -1, QoolTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineModelEClass, InlineModel.class, "InlineModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineModel_Classifiers(), theEcl_metaPackage.getKClassifier(), null, "classifiers", null, 0, -1, InlineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueEClass, Queue.class, "Queue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueue_Name(), ecorePackage.getEString(), "name", null, 1, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueue_Optimizations(), this.getQueueOptimization(), null, "optimizations", null, 0, -1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueOptimizationEClass, QueueOptimization.class, "QueueOptimization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessByFeatureOptimizationEClass, AccessByFeatureOptimization.class, "AccessByFeatureOptimization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessByFeatureOptimization_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, AccessByFeatureOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessByFeatureOptimization_Speculative(), ecorePackage.getEBoolean(), "speculative", "true", 1, 1, AccessByFeatureOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementQueueEClass, ModelElementQueue.class, "ModelElementQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementQueue_Type_(), theCorePackage.getTypeInfo(), null, "type_", null, 1, 1, ModelElementQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementQueue_Additionals(), theCorePackage.getTypeInfo(), null, "additionals", null, 0, -1, ModelElementQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementQueue_Extension(), theExtensionsPackage.getExtension(), null, "extension", null, 1, 1, ModelElementQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localQueueEClass, LocalQueue.class, "LocalQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalQueue_Type_(), theCorePackage.getTypeInfo(), null, "type_", null, 0, 1, LocalQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredQueueEClass, RequiredQueue.class, "RequiredQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredQueue_ImportedModel(), theCorePackage.getImportedModel(), theCorePackage.getImportedModel_CapabilityQueues(), "importedModel", null, 1, 1, RequiredQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qIteratorEClass, QIterator.class, "QIterator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qForAllEClass, QForAll.class, "QForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQForAll_Queue(), this.getQueue(), null, "queue", null, 1, 1, QForAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qEmitEClass, QEmit.class, "QEmit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQEmit_Queue(), this.getQueue(), null, "queue", null, 1, 1, QEmit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQEmit_Value(), theCorePackage.getVariable(), theCorePackage.getVariable_EmitValues(), "value", null, 1, 1, QEmit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qMatchEClass, QMatch.class, "QMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQMatch_Queue(), this.getQueue(), null, "queue", null, 1, 1, QMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQMatch_Predicates(), this.getQMatchPredicate(), null, "predicates", null, 1, -1, QMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQMatch_GetterClosure(), theInstrPackage.getClosureDef(), null, "getterClosure", null, 0, 1, QMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qMatchPredicateEClass, QMatchPredicate.class, "QMatchPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kindOfPredicateEClass, KindOfPredicate.class, "KindOfPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKindOfPredicate_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, KindOfPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindOfPredicate_Model(), theCorePackage.getModelDefinition(), null, "model", null, 1, 1, KindOfPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEqualsPredicateEClass, PropertyEqualsPredicate.class, "PropertyEqualsPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyEqualsPredicate_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, PropertyEqualsPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyEqualsPredicate_Value(), theCorePackage.getVariable(), null, "value", null, 1, 1, PropertyEqualsPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //QoolPackageImpl
