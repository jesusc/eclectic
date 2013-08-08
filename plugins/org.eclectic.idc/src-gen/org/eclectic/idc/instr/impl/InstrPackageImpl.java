/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import org.eclectic.idc.IdcPackage;

import org.eclectic.idc.core.CorePackage;

import org.eclectic.idc.core.impl.CorePackageImpl;

import org.eclectic.idc.ecl_meta.Ecl_metaPackage;

import org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl;

import org.eclectic.idc.extensions.ExtensionsPackage;
import org.eclectic.idc.extensions.impl.ExtensionsPackageImpl;
import org.eclectic.idc.impl.IdcPackageImpl;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.BindingCardinality;
import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.GetKind;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.IfElseBlock;
import org.eclectic.idc.instr.IfInstr;
import org.eclectic.idc.instr.InstrFactory;
import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.instr.InvocationParameter;
import org.eclectic.idc.instr.InvokeExternal;
import org.eclectic.idc.instr.InvokeInternal;
import org.eclectic.idc.instr.InvokeTransformation;
import org.eclectic.idc.instr.Literal;
import org.eclectic.idc.instr.LiteralKind;
import org.eclectic.idc.instr.MethodCall;
import org.eclectic.idc.instr.NamedInvocationParameter;
import org.eclectic.idc.instr.ReadMeta;
import org.eclectic.idc.instr.ReadMetaKind;
import org.eclectic.idc.instr.Set;


import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.impl.QoolPackageImpl;
import org.eclectic.idc.scheduling.SchedulingPackage;

import org.eclectic.idc.scheduling.impl.SchedulingPackageImpl;

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
public class InstrPackageImpl extends EPackageImpl implements InstrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionWithResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closureDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifInstrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifElseBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readMetaEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum getKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum literalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum readMetaKindEEnum = null;

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
	 * @see org.eclectic.idc.instr.InstrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstrPackageImpl() {
		super(eNS_URI, InstrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstrPackage init() {
		if (isInited) return (InstrPackage)EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI);

		// Obtain or create and register package
		InstrPackageImpl theInstrPackage = (InstrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstrPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IdcPackageImpl theIdcPackage = (IdcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) instanceof IdcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) : IdcPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		SchedulingPackageImpl theSchedulingPackage = (SchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) instanceof SchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) : SchedulingPackage.eINSTANCE);
		Ecl_metaPackageImpl theEcl_metaPackage = (Ecl_metaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) instanceof Ecl_metaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) : Ecl_metaPackage.eINSTANCE);

		// Create package meta-data objects
		theInstrPackage.createPackageContents();
		theIdcPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theSchedulingPackage.createPackageContents();
		theEcl_metaPackage.createPackageContents();

		// Initialize created meta-data
		theInstrPackage.initializePackageContents();
		theIdcPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theSchedulingPackage.initializePackageContents();
		theEcl_metaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstrPackage.eNS_URI, theInstrPackage);
		return theInstrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionWithResult() {
		return instructionWithResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_Model() {
		return (EReference)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreate_ClassName() {
		return (EAttribute)createEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_ConstructorParameters() {
		return (EReference)createEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Receptor() {
		return (EReference)setEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_FeatureName() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Value() {
		return (EReference)setEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGet() {
		return getEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGet_Receptor() {
		return (EReference)getEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_FeatureName() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_Kind() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_MaybeCollection() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_StringValue() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_IntValue() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_DoubleValue() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_BooleanValue() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Kind() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosureDef() {
		return closureDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssign() {
		return assignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssign_RightVariable() {
		return (EReference)assignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfInstr() {
		return ifInstrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfInstr_Then() {
		return (EReference)ifInstrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfInstr_Elsifs() {
		return (EReference)ifInstrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfInstr_ElseBlock() {
		return (EReference)ifInstrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfBranch() {
		return ifBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBranch_BooleanVariable() {
		return (EReference)ifBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBranch_IfBlock() {
		return (EReference)ifBranchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfElseBlock() {
		return ifElseBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCall() {
		return methodCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodCall_MethodName() {
		return (EAttribute)methodCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_Receptor() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_ActualParameters() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodCall_MaybeGet() {
		return (EAttribute)methodCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_ReceptorType() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadMeta() {
		return readMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadMeta_ClassName() {
		return (EAttribute)readMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadMeta_Kind() {
		return (EAttribute)readMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadMeta_Model() {
		return (EReference)readMetaEClass.getEStructuralFeatures().get(2);
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
	public EReference getInvokeTransformation_InputViewFilter() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeTransformation_EntryPointName() {
		return (EAttribute)invokeTransformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeTransformation_EntryPointParameters() {
		return (EReference)invokeTransformationEClass.getEStructuralFeatures().get(5);
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
	public EReference getInvokeExternal_Parameters() {
		return (EReference)invokeExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeExternal_OutputResolutionSourceElement() {
		return (EReference)invokeExternalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeExternal_QueueName() {
		return (EAttribute)invokeExternalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeExternal_SrcTraceAttributeName() {
		return (EAttribute)invokeExternalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeExternal_TgtTraceAttributeName() {
		return (EAttribute)invokeExternalEClass.getEStructuralFeatures().get(4);
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
	public EReference getNamedInvocationParameter_Result() {
		return (EReference)namedInvocationParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGetKind() {
		return getKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiteralKind() {
		return literalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReadMetaKind() {
		return readMetaKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrFactory getInstrFactory() {
		return (InstrFactory)getEFactoryInstance();
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
		instructionWithResultEClass = createEClass(INSTRUCTION_WITH_RESULT);

		createEClass = createEClass(CREATE);
		createEReference(createEClass, CREATE__MODEL);
		createEAttribute(createEClass, CREATE__CLASS_NAME);
		createEReference(createEClass, CREATE__CONSTRUCTOR_PARAMETERS);

		setEClass = createEClass(SET);
		createEReference(setEClass, SET__RECEPTOR);
		createEAttribute(setEClass, SET__FEATURE_NAME);
		createEReference(setEClass, SET__VALUE);

		getEClass = createEClass(GET);
		createEReference(getEClass, GET__RECEPTOR);
		createEAttribute(getEClass, GET__FEATURE_NAME);
		createEAttribute(getEClass, GET__KIND);
		createEAttribute(getEClass, GET__MAYBE_COLLECTION);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__STRING_VALUE);
		createEAttribute(literalEClass, LITERAL__INT_VALUE);
		createEAttribute(literalEClass, LITERAL__DOUBLE_VALUE);
		createEAttribute(literalEClass, LITERAL__BOOLEAN_VALUE);
		createEAttribute(literalEClass, LITERAL__KIND);

		closureDefEClass = createEClass(CLOSURE_DEF);

		assignEClass = createEClass(ASSIGN);
		createEReference(assignEClass, ASSIGN__RIGHT_VARIABLE);

		ifInstrEClass = createEClass(IF_INSTR);
		createEReference(ifInstrEClass, IF_INSTR__THEN);
		createEReference(ifInstrEClass, IF_INSTR__ELSIFS);
		createEReference(ifInstrEClass, IF_INSTR__ELSE_BLOCK);

		ifBranchEClass = createEClass(IF_BRANCH);
		createEReference(ifBranchEClass, IF_BRANCH__BOOLEAN_VARIABLE);
		createEReference(ifBranchEClass, IF_BRANCH__IF_BLOCK);

		ifElseBlockEClass = createEClass(IF_ELSE_BLOCK);

		methodCallEClass = createEClass(METHOD_CALL);
		createEAttribute(methodCallEClass, METHOD_CALL__METHOD_NAME);
		createEReference(methodCallEClass, METHOD_CALL__RECEPTOR);
		createEReference(methodCallEClass, METHOD_CALL__ACTUAL_PARAMETERS);
		createEAttribute(methodCallEClass, METHOD_CALL__MAYBE_GET);
		createEReference(methodCallEClass, METHOD_CALL__RECEPTOR_TYPE);

		readMetaEClass = createEClass(READ_META);
		createEAttribute(readMetaEClass, READ_META__CLASS_NAME);
		createEAttribute(readMetaEClass, READ_META__KIND);
		createEReference(readMetaEClass, READ_META__MODEL);

		invokeTransformationEClass = createEClass(INVOKE_TRANSFORMATION);
		createEAttribute(invokeTransformationEClass, INVOKE_TRANSFORMATION__TRANSFORMATION_NAME);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__SOURCE_MODELS);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__TARGET_MODELS);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER);
		createEAttribute(invokeTransformationEClass, INVOKE_TRANSFORMATION__ENTRY_POINT_NAME);
		createEReference(invokeTransformationEClass, INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS);

		invokeExternalEClass = createEClass(INVOKE_EXTERNAL);
		createEReference(invokeExternalEClass, INVOKE_EXTERNAL__PARAMETERS);
		createEReference(invokeExternalEClass, INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT);
		createEAttribute(invokeExternalEClass, INVOKE_EXTERNAL__QUEUE_NAME);
		createEAttribute(invokeExternalEClass, INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME);
		createEAttribute(invokeExternalEClass, INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME);

		invokeInternalEClass = createEClass(INVOKE_INTERNAL);

		invocationParameterEClass = createEClass(INVOCATION_PARAMETER);
		createEReference(invocationParameterEClass, INVOCATION_PARAMETER__MODEL);
		createEAttribute(invocationParameterEClass, INVOCATION_PARAMETER__CALLEE_MODEL_NAME);

		namedInvocationParameterEClass = createEClass(NAMED_INVOCATION_PARAMETER);
		createEAttribute(namedInvocationParameterEClass, NAMED_INVOCATION_PARAMETER__FORMAL_NAME);
		createEReference(namedInvocationParameterEClass, NAMED_INVOCATION_PARAMETER__RESULT);

		// Create enums
		getKindEEnum = createEEnum(GET_KIND);
		literalKindEEnum = createEEnum(LITERAL_KIND);
		readMetaKindEEnum = createEEnum(READ_META_KIND);
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
		instructionWithResultEClass.getESuperTypes().add(theCorePackage.getVariable());
		instructionWithResultEClass.getESuperTypes().add(theCorePackage.getInstruction());
		createEClass.getESuperTypes().add(this.getInstructionWithResult());
		setEClass.getESuperTypes().add(theCorePackage.getInstruction());
		getEClass.getESuperTypes().add(this.getInstructionWithResult());
		literalEClass.getESuperTypes().add(this.getInstructionWithResult());
		closureDefEClass.getESuperTypes().add(theCorePackage.getFunctionDef());
		closureDefEClass.getESuperTypes().add(this.getInstructionWithResult());
		assignEClass.getESuperTypes().add(this.getInstructionWithResult());
		ifInstrEClass.getESuperTypes().add(this.getInstructionWithResult());
		ifBranchEClass.getESuperTypes().add(theCorePackage.getInstructionBlock());
		ifElseBlockEClass.getESuperTypes().add(theCorePackage.getInstructionBlock());
		methodCallEClass.getESuperTypes().add(this.getInstructionWithResult());
		readMetaEClass.getESuperTypes().add(this.getInstructionWithResult());
		invokeTransformationEClass.getESuperTypes().add(this.getInstructionWithResult());
		invokeExternalEClass.getESuperTypes().add(this.getInvokeTransformation());
		invokeInternalEClass.getESuperTypes().add(this.getInvokeTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(instructionWithResultEClass, InstructionWithResult.class, "InstructionWithResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreate_Model(), theCorePackage.getModelDefinition(), null, "model", null, 1, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreate_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreate_ConstructorParameters(), this.getSet(), null, "constructorParameters", null, 0, -1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSet_Receptor(), theCorePackage.getVariable(), theCorePackage.getVariable_SetReceptors(), "receptor", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSet_Value(), theCorePackage.getVariable(), theCorePackage.getVariable_SetValues(), "value", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getEClass, Get.class, "Get", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGet_Receptor(), theCorePackage.getVariable(), theCorePackage.getVariable_GetReceptors(), "receptor", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_Kind(), this.getGetKind(), "kind", "0", 1, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_MaybeCollection(), ecorePackage.getEBooleanObject(), "maybeCollection", "false", 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_IntValue(), ecorePackage.getEIntegerObject(), "intValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_DoubleValue(), ecorePackage.getEDoubleObject(), "doubleValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_BooleanValue(), ecorePackage.getEBooleanObject(), "booleanValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Kind(), this.getLiteralKind(), "kind", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closureDefEClass, ClosureDef.class, "ClosureDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssign_RightVariable(), theCorePackage.getVariable(), theCorePackage.getVariable_AssignVariables(), "rightVariable", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifInstrEClass, IfInstr.class, "IfInstr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfInstr_Then(), this.getIfBranch(), null, "then", null, 1, 1, IfInstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfInstr_Elsifs(), this.getIfBranch(), null, "elsifs", null, 0, -1, IfInstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfInstr_ElseBlock(), this.getIfElseBlock(), null, "elseBlock", null, 0, 1, IfInstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifBranchEClass, IfBranch.class, "IfBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfBranch_BooleanVariable(), theCorePackage.getVariable(), theCorePackage.getVariable_IfConditions(), "booleanVariable", null, 0, 1, IfBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBranch_IfBlock(), this.getIfElseBlock(), null, "ifBlock", null, 1, 1, IfBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifElseBlockEClass, IfElseBlock.class, "IfElseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodCall_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_Receptor(), theCorePackage.getVariable(), theCorePackage.getVariable_CallReceptors(), "receptor", null, 1, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_ActualParameters(), theCorePackage.getVariable(), theCorePackage.getVariable_CallParameters(), "actualParameters", null, 0, -1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodCall_MaybeGet(), ecorePackage.getEBoolean(), "maybeGet", null, 1, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_ReceptorType(), theCorePackage.getTypeInfo(), null, "receptorType", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readMetaEClass, ReadMeta.class, "ReadMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadMeta_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, ReadMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadMeta_Kind(), this.getReadMetaKind(), "kind", "0", 1, 1, ReadMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadMeta_Model(), theCorePackage.getModelDefinition(), null, "model", null, 1, 1, ReadMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeTransformationEClass, InvokeTransformation.class, "InvokeTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvokeTransformation_TransformationName(), ecorePackage.getEString(), "transformationName", null, 1, 1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_SourceModels(), this.getInvocationParameter(), null, "sourceModels", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_TargetModels(), this.getInvocationParameter(), null, "targetModels", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_InputViewFilter(), theCorePackage.getVariable(), null, "inputViewFilter", null, 0, 1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeTransformation_EntryPointName(), ecorePackage.getEString(), "entryPointName", null, 0, 1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeTransformation_EntryPointParameters(), theCorePackage.getVariable(), null, "entryPointParameters", null, 0, -1, InvokeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeExternalEClass, InvokeExternal.class, "InvokeExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeExternal_Parameters(), this.getNamedInvocationParameter(), null, "parameters", null, 0, -1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeExternal_OutputResolutionSourceElement(), theCorePackage.getVariable(), null, "outputResolutionSourceElement", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeExternal_QueueName(), ecorePackage.getEString(), "queueName", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeExternal_SrcTraceAttributeName(), ecorePackage.getEString(), "srcTraceAttributeName", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeExternal_TgtTraceAttributeName(), ecorePackage.getEString(), "tgtTraceAttributeName", null, 0, 1, InvokeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeInternalEClass, InvokeInternal.class, "InvokeInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invocationParameterEClass, InvocationParameter.class, "InvocationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationParameter_Model(), theCorePackage.getModelDefinition(), null, "model", null, 1, 1, InvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvocationParameter_CalleeModelName(), ecorePackage.getEString(), "calleeModelName", null, 1, 1, InvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedInvocationParameterEClass, NamedInvocationParameter.class, "NamedInvocationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedInvocationParameter_FormalName(), ecorePackage.getEString(), "formalName", null, 1, 1, NamedInvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedInvocationParameter_Result(), theCorePackage.getVariable(), null, "result", null, 1, 1, NamedInvocationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(getKindEEnum, GetKind.class, "GetKind");
		addEEnumLiteral(getKindEEnum, GetKind.PLAIN_GET);
		addEEnumLiteral(getKindEEnum, GetKind.TRY_GET_FIRST);
		addEEnumLiteral(getKindEEnum, GetKind.TRY_METHOD_FIRST);

		initEEnum(literalKindEEnum, LiteralKind.class, "LiteralKind");
		addEEnumLiteral(literalKindEEnum, LiteralKind.STRING);
		addEEnumLiteral(literalKindEEnum, LiteralKind.INTEGER);
		addEEnumLiteral(literalKindEEnum, LiteralKind.DOUBLE);
		addEEnumLiteral(literalKindEEnum, LiteralKind.BOOLEAN);
		addEEnumLiteral(literalKindEEnum, LiteralKind.NULL);

		initEEnum(readMetaKindEEnum, ReadMetaKind.class, "ReadMetaKind");
		addEEnumLiteral(readMetaKindEEnum, ReadMetaKind.METACLASS);
		addEEnumLiteral(readMetaKindEEnum, ReadMetaKind.MODEL);
		addEEnumLiteral(readMetaKindEEnum, ReadMetaKind.THIS_TRANSFORMATION_METHOD_HANDLER);
		addEEnumLiteral(readMetaKindEEnum, ReadMetaKind.THIS_TRANSFORMATION_OBJECT);
	}

} //InstrPackageImpl
