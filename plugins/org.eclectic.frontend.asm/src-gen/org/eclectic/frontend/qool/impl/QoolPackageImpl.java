/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

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
import org.eclectic.frontend.qool.AccessByFeatureOptimization;
import org.eclectic.frontend.qool.EmitStatement;
import org.eclectic.frontend.qool.ForAllStatement;
import org.eclectic.frontend.qool.ForEachStatement;
import org.eclectic.frontend.qool.InvocationParameter;
import org.eclectic.frontend.qool.InvokeExternal;
import org.eclectic.frontend.qool.InvokeInternal;
import org.eclectic.frontend.qool.InvokeTransformation;
import org.eclectic.frontend.qool.IteratorStatement;
import org.eclectic.frontend.qool.KindOfPredicate;
import org.eclectic.frontend.qool.LocalQueue;
import org.eclectic.frontend.qool.MatchExpression;
import org.eclectic.frontend.qool.MatchPredicate;
import org.eclectic.frontend.qool.ModelElementQueue;
import org.eclectic.frontend.qool.NamedInvocationParameter;
import org.eclectic.frontend.qool.PropertyEqualsPredicate;
import org.eclectic.frontend.qool.ForAllMatcher;
import org.eclectic.frontend.qool.KoanRule;
import org.eclectic.frontend.qool.Matcher;
import org.eclectic.frontend.qool.QoolFactory;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.QoolQueue;
import org.eclectic.frontend.qool.QoolTransformation;

import org.eclectic.frontend.qool.QueueOptimization;
import org.eclectic.frontend.qool.Segment;
import org.eclectic.frontend.qool.facilities.FacilitiesPackage;
import org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl;
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
	private EClass qoolQueueEClass = null;

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
	private EClass localQueueEClass = null;

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
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forAllStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchPredicateEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeInternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedInvocationParameterEClass = null;

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
	 * @see org.eclectic.frontend.qool.QoolPackage#eNS_URI
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
		FrontendPackageImpl theFrontendPackage = (FrontendPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) instanceof FrontendPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) : FrontendPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		KoanPackageImpl theKoanPackage = (KoanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) instanceof KoanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) : KoanPackage.eINSTANCE);
		AttributionPackageImpl theAttributionPackage = (AttributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) instanceof AttributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) : AttributionPackage.eINSTANCE);
		ImperativePackageImpl theImperativePackage = (ImperativePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) instanceof ImperativePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) : ImperativePackage.eINSTANCE);
		ChainPackageImpl theChainPackage = (ChainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI) instanceof ChainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI) : ChainPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		MappingsPackageImpl theMappingsPackage = (MappingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI) instanceof MappingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI) : MappingsPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		TaoPackageImpl theTaoPackage = (TaoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) instanceof TaoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) : TaoPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theQoolPackage.createPackageContents();
		theFrontendPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theKoanPackage.createPackageContents();
		theAttributionPackage.createPackageContents();
		theImperativePackage.createPackageContents();
		theChainPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theMappingsPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theTaoPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theQoolPackage.initializePackageContents();
		theFrontendPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theKoanPackage.initializePackageContents();
		theAttributionPackage.initializePackageContents();
		theImperativePackage.initializePackageContents();
		theChainPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theMappingsPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theTaoPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

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
	public EReference getQoolTransformation_Queues() {
		return (EReference)qoolTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoolTransformation_Segments() {
		return (EReference)qoolTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoolQueue() {
		return qoolQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoolQueue_Optimizations() {
		return (EReference)qoolQueueEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAccessByFeatureOptimization_Force() {
		return (EAttribute)accessByFeatureOptimizationEClass.getEStructuralFeatures().get(1);
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
	public EClass getModelElementQueue() {
		return modelElementQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementQueue_Class_() {
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
	public EClass getSegment() {
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegment_Statements() {
		return (EReference)segmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorStatement() {
		return iteratorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorStatement_Condition() {
		return (EReference)iteratorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorStatement_Statements() {
		return (EReference)iteratorStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForAllStatement() {
		return forAllStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForAllStatement_Queue() {
		return (EReference)forAllStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachStatement() {
		return forEachStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachStatement_Collection() {
		return (EReference)forEachStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmitStatement() {
		return emitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmitStatement_Queue() {
		return (EReference)emitStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmitStatement_Value() {
		return (EReference)emitStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchExpression() {
		return matchExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchExpression_Queue() {
		return (EReference)matchExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchExpression_Predicates() {
		return (EReference)matchExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchPredicate() {
		return matchPredicateEClass;
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
	public EReference getKindOfPredicate_Class_() {
		return (EReference)kindOfPredicateEClass.getEStructuralFeatures().get(0);
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
	public EClass getInvokeTransformation() {
		return invokeTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeTransformation_TransformationName() {
		return (EAttribute)invokeTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeTransformation_SourceModels() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeTransformation_TargetModels() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeTransformation_Parameters() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeTransformation_InputViewFilter() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeTransformation_EntryPointName() {
		return (EAttribute)invokeTransformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeTransformation_EntryPointParameters() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeExternal() {
		return invokeExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeExternal_OutputResolutionSourceElement() {
		return (EReference)invokeExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeExternal_QueueName() {
		return (EAttribute)invokeExternalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeExternal_TraceAttributeName() {
		return (EAttribute)invokeExternalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeInternal() {
		return invokeInternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationParameter() {
		return invocationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationParameter_Model() {
		return (EReference)invocationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvocationParameter_CalleeModelName() {
		return (EAttribute)invocationParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedInvocationParameter() {
		return namedInvocationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedInvocationParameter_FormalName() {
		return (EAttribute)namedInvocationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedInvocationParameter_ActualParameter() {
		return (EReference)namedInvocationParameterEClass.getEStructuralFeatures().get(1);
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
		createEReference(qoolTransformationEClass, QOOL_TRANSFORMATION__QUEUES);
		createEReference(qoolTransformationEClass, QOOL_TRANSFORMATION__SEGMENTS);

		qoolQueueEClass = createEClass(QOOL_QUEUE);
		createEReference(qoolQueueEClass, QOOL_QUEUE__OPTIMIZATIONS);

		queueOptimizationEClass = createEClass(QUEUE_OPTIMIZATION);

		accessByFeatureOptimizationEClass = createEClass(ACCESS_BY_FEATURE_OPTIMIZATION);
		createEAttribute(accessByFeatureOptimizationEClass, ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME);
		createEAttribute(accessByFeatureOptimizationEClass, ACCESS_BY_FEATURE_OPTIMIZATION__FORCE);

		localQueueEClass = createEClass(LOCAL_QUEUE);
		createEReference(localQueueEClass, LOCAL_QUEUE__TYPE_);

		modelElementQueueEClass = createEClass(MODEL_ELEMENT_QUEUE);
		createEReference(modelElementQueueEClass, MODEL_ELEMENT_QUEUE__CLASS_);
		createEReference(modelElementQueueEClass, MODEL_ELEMENT_QUEUE__ADDITIONALS);

		segmentEClass = createEClass(SEGMENT);
		createEReference(segmentEClass, SEGMENT__STATEMENTS);

		iteratorStatementEClass = createEClass(ITERATOR_STATEMENT);
		createEReference(iteratorStatementEClass, ITERATOR_STATEMENT__CONDITION);
		createEReference(iteratorStatementEClass, ITERATOR_STATEMENT__STATEMENTS);

		forAllStatementEClass = createEClass(FOR_ALL_STATEMENT);
		createEReference(forAllStatementEClass, FOR_ALL_STATEMENT__QUEUE);

		forEachStatementEClass = createEClass(FOR_EACH_STATEMENT);
		createEReference(forEachStatementEClass, FOR_EACH_STATEMENT__COLLECTION);

		emitStatementEClass = createEClass(EMIT_STATEMENT);
		createEReference(emitStatementEClass, EMIT_STATEMENT__QUEUE);
		createEReference(emitStatementEClass, EMIT_STATEMENT__VALUE);

		matchExpressionEClass = createEClass(MATCH_EXPRESSION);
		createEReference(matchExpressionEClass, MATCH_EXPRESSION__QUEUE);
		createEReference(matchExpressionEClass, MATCH_EXPRESSION__PREDICATES);

		matchPredicateEClass = createEClass(MATCH_PREDICATE);

		kindOfPredicateEClass = createEClass(KIND_OF_PREDICATE);
		createEReference(kindOfPredicateEClass, KIND_OF_PREDICATE__CLASS_);

		propertyEqualsPredicateEClass = createEClass(PROPERTY_EQUALS_PREDICATE);
		createEAttribute(propertyEqualsPredicateEClass, PROPERTY_EQUALS_PREDICATE__PROPERTY_NAME);
		createEReference(propertyEqualsPredicateEClass, PROPERTY_EQUALS_PREDICATE__VALUE);

		invokeTransformationEClass = createEClass(INVOKE_TRANSFORMATION);
		createEAttribute(invokeTransformationEClass, INVOKE_TRANSFORMATION__TRANSFORMATION_NAME);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__SOURCE_MODELS);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__TARGET_MODELS);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__PARAMETERS);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER);
		createEAttribute(invokeTransformationEClass, INVOKE_TRANSFORMATION__ENTRY_POINT_NAME);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS);

		invokeExternalEClass = createEClass(INVOKE_EXTERNAL);
		createEReference(invokeExternalEClass, INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT);
		createEAttribute(invokeExternalEClass, INVOKE_EXTERNAL__QUEUE_NAME);
		createEAttribute(invokeExternalEClass, INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME);

		invokeInternalEClass = createEClass(INVOKE_INTERNAL);

		invocationParameterEClass = createEClass(INVOCATION_PARAMETER);
		createEReference(invocationParameterEClass, INVOCATION_PARAMETER__MODEL);
		createEAttribute(invocationParameterEClass, INVOCATION_PARAMETER__CALLEE_MODEL_NAME);

		namedInvocationParameterEClass = createEClass(NAMED_INVOCATION_PARAMETER);
		createEAttribute(namedInvocationParameterEClass, NAMED_INVOCATION_PARAMETER__FORMAL_NAME);
		createEReference(namedInvocationParameterEClass, NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER);
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
		FacilitiesPackage theFacilitiesPackage = (FacilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFacilitiesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qoolTransformationEClass.getESuperTypes().add(theCorePackage.getTransformationDefinition());
		qoolQueueEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		qoolQueueEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		accessByFeatureOptimizationEClass.getESuperTypes().add(this.getQueueOptimization());
		localQueueEClass.getESuperTypes().add(this.getQoolQueue());
		modelElementQueueEClass.getESuperTypes().add(this.getQoolQueue());
		segmentEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		iteratorStatementEClass.getESuperTypes().add(theCorePackage.getStatement());
		iteratorStatementEClass.getESuperTypes().add(theCorePackage.getVariable());
		forAllStatementEClass.getESuperTypes().add(this.getIteratorStatement());
		forEachStatementEClass.getESuperTypes().add(this.getIteratorStatement());
		emitStatementEClass.getESuperTypes().add(theCorePackage.getStatement());
		matchExpressionEClass.getESuperTypes().add(theCorePackage.getExpression());
		kindOfPredicateEClass.getESuperTypes().add(this.getMatchPredicate());
		propertyEqualsPredicateEClass.getESuperTypes().add(this.getMatchPredicate());
		invokeTransformationEClass.getESuperTypes().add(theCorePackage.getExpression());
		invokeExternalEClass.getESuperTypes().add(this.getInvokeTransformation());
		invokeInternalEClass.getESuperTypes().add(this.getInvokeTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(qoolTransformationEClass, QoolTransformation.class, "QoolTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoolTransformation_Queues(), this.getQoolQueue(), null, "queues", null, 0, -1, QoolTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoolTransformation_Segments(), this.getSegment(), null, "segments", null, 0, -1, QoolTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoolQueueEClass, QoolQueue.class, "QoolQueue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoolQueue_Optimizations(), this.getQueueOptimization(), null, "optimizations", null, 0, -1, QoolQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueOptimizationEClass, QueueOptimization.class, "QueueOptimization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessByFeatureOptimizationEClass, AccessByFeatureOptimization.class, "AccessByFeatureOptimization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessByFeatureOptimization_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, AccessByFeatureOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessByFeatureOptimization_Force(), ecorePackage.getEBoolean(), "force", "false", 1, 1, AccessByFeatureOptimization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localQueueEClass, LocalQueue.class, "LocalQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalQueue_Type_(), theCorePackage.getTypeExpression(), null, "type_", null, 1, 1, LocalQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementQueueEClass, ModelElementQueue.class, "ModelElementQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementQueue_Class_(), theCorePackage.getClassUse(), null, "class_", null, 1, 1, ModelElementQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementQueue_Additionals(), theCorePackage.getClassUse(), null, "additionals", null, 0, -1, ModelElementQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegment_Statements(), theCorePackage.getStatement(), null, "statements", null, 0, -1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorStatementEClass, IteratorStatement.class, "IteratorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIteratorStatement_Condition(), theCorePackage.getExpression(), null, "condition", null, 0, 1, IteratorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorStatement_Statements(), theCorePackage.getStatement(), null, "statements", null, 0, -1, IteratorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forAllStatementEClass, ForAllStatement.class, "ForAllStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForAllStatement_Queue(), this.getQoolQueue(), null, "queue", null, 1, 1, ForAllStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachStatementEClass, ForEachStatement.class, "ForEachStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEachStatement_Collection(), theCorePackage.getExpression(), null, "collection", null, 1, 1, ForEachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emitStatementEClass, EmitStatement.class, "EmitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmitStatement_Queue(), this.getQoolQueue(), null, "queue", null, 1, 1, EmitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmitStatement_Value(), theCorePackage.getExpression(), null, "value", null, 1, 1, EmitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchExpressionEClass, MatchExpression.class, "MatchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchExpression_Queue(), this.getQoolQueue(), null, "queue", null, 1, 1, MatchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchExpression_Predicates(), this.getMatchPredicate(), null, "predicates", null, 1, -1, MatchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchPredicateEClass, MatchPredicate.class, "MatchPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kindOfPredicateEClass, KindOfPredicate.class, "KindOfPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKindOfPredicate_Class_(), theCorePackage.getClassUse(), null, "class_", null, 1, 1, KindOfPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEqualsPredicateEClass, PropertyEqualsPredicate.class, "PropertyEqualsPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyEqualsPredicate_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, PropertyEqualsPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyEqualsPredicate_Value(), theCorePackage.getExpression(), null, "value", null, 1, 1, PropertyEqualsPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeTransformationEClass, InvokeTransformation.class, "InvokeTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvokeTransformation_TransformationName(), ecorePackage.getEString(), "transformationName", null, 1, 1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_SourceModels(), this.getInvocationParameter(), null, "sourceModels", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_TargetModels(), this.getInvocationParameter(), null, "targetModels", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_Parameters(), this.getNamedInvocationParameter(), null, "parameters", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_InputViewFilter(), theCorePackage.getVariable(), null, "inputViewFilter", null, 0, 1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeTransformation_EntryPointName(), ecorePackage.getEString(), "entryPointName", null, 0, 1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_EntryPointParameters(), theCorePackage.getExpression(), null, "entryPointParameters", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeExternalEClass, InvokeExternal.class, "InvokeExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeExternal_OutputResolutionSourceElement(), theCorePackage.getExpression(), null, "outputResolutionSourceElement", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeExternal_QueueName(), ecorePackage.getEString(), "queueName", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeExternal_TraceAttributeName(), ecorePackage.getEString(), "traceAttributeName", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeInternalEClass, InvokeInternal.class, "InvokeInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invocationParameterEClass, InvocationParameter.class, "InvocationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationParameter_Model(), theCorePackage.getTransformationDefinitionParameter(), null, "model", null, 1, 1, InvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvocationParameter_CalleeModelName(), ecorePackage.getEString(), "calleeModelName", null, 1, 1, InvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedInvocationParameterEClass, NamedInvocationParameter.class, "NamedInvocationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedInvocationParameter_FormalName(), ecorePackage.getEString(), "formalName", null, 1, 1, NamedInvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedInvocationParameter_ActualParameter(), theCorePackage.getExpression(), null, "actualParameter", null, 1, 1, NamedInvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //QoolPackageImpl
