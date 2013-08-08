/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import org.eclectic.idc.instr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstrFactoryImpl extends EFactoryImpl implements InstrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstrFactory init() {
		try {
			InstrFactory theInstrFactory = (InstrFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/idc/instructions"); 
			if (theInstrFactory != null) {
				return theInstrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InstrPackage.CREATE: return createCreate();
			case InstrPackage.SET: return createSet();
			case InstrPackage.GET: return createGet();
			case InstrPackage.LITERAL: return createLiteral();
			case InstrPackage.CLOSURE_DEF: return createClosureDef();
			case InstrPackage.ASSIGN: return createAssign();
			case InstrPackage.IF_INSTR: return createIfInstr();
			case InstrPackage.IF_BRANCH: return createIfBranch();
			case InstrPackage.IF_ELSE_BLOCK: return createIfElseBlock();
			case InstrPackage.METHOD_CALL: return createMethodCall();
			case InstrPackage.READ_META: return createReadMeta();
			case InstrPackage.INVOKE_EXTERNAL: return createInvokeExternal();
			case InstrPackage.INVOKE_INTERNAL: return createInvokeInternal();
			case InstrPackage.INVOCATION_PARAMETER: return createInvocationParameter();
			case InstrPackage.NAMED_INVOCATION_PARAMETER: return createNamedInvocationParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InstrPackage.GET_KIND:
				return createGetKindFromString(eDataType, initialValue);
			case InstrPackage.LITERAL_KIND:
				return createLiteralKindFromString(eDataType, initialValue);
			case InstrPackage.READ_META_KIND:
				return createReadMetaKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InstrPackage.GET_KIND:
				return convertGetKindToString(eDataType, instanceValue);
			case InstrPackage.LITERAL_KIND:
				return convertLiteralKindToString(eDataType, instanceValue);
			case InstrPackage.READ_META_KIND:
				return convertReadMetaKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Get createGet() {
		GetImpl get = new GetImpl();
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureDef createClosureDef() {
		ClosureDefImpl closureDef = new ClosureDefImpl();
		return closureDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfInstr createIfInstr() {
		IfInstrImpl ifInstr = new IfInstrImpl();
		return ifInstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBranch createIfBranch() {
		IfBranchImpl ifBranch = new IfBranchImpl();
		return ifBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseBlock createIfElseBlock() {
		IfElseBlockImpl ifElseBlock = new IfElseBlockImpl();
		return ifElseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadMeta createReadMeta() {
		ReadMetaImpl readMeta = new ReadMetaImpl();
		return readMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeExternal createInvokeExternal() {
		InvokeExternalImpl invokeExternal = new InvokeExternalImpl();
		return invokeExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeInternal createInvokeInternal() {
		InvokeInternalImpl invokeInternal = new InvokeInternalImpl();
		return invokeInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationParameter createInvocationParameter() {
		InvocationParameterImpl invocationParameter = new InvocationParameterImpl();
		return invocationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedInvocationParameter createNamedInvocationParameter() {
		NamedInvocationParameterImpl namedInvocationParameter = new NamedInvocationParameterImpl();
		return namedInvocationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetKind createGetKindFromString(EDataType eDataType, String initialValue) {
		GetKind result = GetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralKind createLiteralKindFromString(EDataType eDataType, String initialValue) {
		LiteralKind result = LiteralKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiteralKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadMetaKind createReadMetaKindFromString(EDataType eDataType, String initialValue) {
		ReadMetaKind result = ReadMetaKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadMetaKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrPackage getInstrPackage() {
		return (InstrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstrPackage getPackage() {
		return InstrPackage.eINSTANCE;
	}

} //InstrFactoryImpl
