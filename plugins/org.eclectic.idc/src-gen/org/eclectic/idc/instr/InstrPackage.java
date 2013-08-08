/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.CorePackage;

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
 * @see org.eclectic.idc.instr.InstrFactory
 * @model kind="package"
 * @generated
 */
public interface InstrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/idc/instructions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idc_ast_instructions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstrPackage eINSTANCE = org.eclectic.idc.instr.impl.InstrPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.InstructionWithResultImpl <em>Instruction With Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.InstructionWithResultImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInstructionWithResult()
	 * @generated
	 */
	int INSTRUCTION_WITH_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__TYPE = CorePackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__GET_RECEPTORS = CorePackage.VARIABLE__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__SET_RECEPTORS = CorePackage.VARIABLE__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__SET_VALUES = CorePackage.VARIABLE__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES = CorePackage.VARIABLE__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__IF_CONDITIONS = CorePackage.VARIABLE__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__CALL_RECEPTORS = CorePackage.VARIABLE__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__CALL_PARAMETERS = CorePackage.VARIABLE__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__EMIT_VALUES = CorePackage.VARIABLE__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__ROW = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__COLUMN = CorePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT__FILE = CorePackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction With Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WITH_RESULT_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.CreateImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__MODEL = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CLASS_NAME = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constructor Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CONSTRUCTOR_PARAMETERS = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.SetImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getSet()
	 * @generated
	 */
	int SET = 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ROW = CorePackage.INSTRUCTION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__COLUMN = CorePackage.INSTRUCTION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__FILE = CorePackage.INSTRUCTION__FILE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__RECEPTOR = CorePackage.INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__FEATURE_NAME = CorePackage.INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUE = CorePackage.INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = CorePackage.INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.GetImpl <em>Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.GetImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getGet()
	 * @generated
	 */
	int GET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__RECEPTOR = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__FEATURE_NAME = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__KIND = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maybe Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__MAYBE_COLLECTION = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.LiteralImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__STRING_VALUE = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__INT_VALUE = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DOUBLE_VALUE = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__BOOLEAN_VALUE = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__KIND = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.ClosureDefImpl <em>Closure Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.ClosureDefImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getClosureDef()
	 * @generated
	 */
	int CLOSURE_DEF = 5;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__INSTRUCTIONS = CorePackage.FUNCTION_DEF__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__ROW = CorePackage.FUNCTION_DEF__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__COLUMN = CorePackage.FUNCTION_DEF__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__FILE = CorePackage.FUNCTION_DEF__FILE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__FORMAL_PARAMETERS = CorePackage.FUNCTION_DEF__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__NAME = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__TYPE = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__GET_RECEPTORS = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__SET_RECEPTORS = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__SET_VALUES = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__ASSIGN_VARIABLES = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__IF_CONDITIONS = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__CALL_RECEPTORS = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__CALL_PARAMETERS = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF__EMIT_VALUES = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Closure Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_DEF_FEATURE_COUNT = CorePackage.FUNCTION_DEF_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.AssignImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__RIGHT_VARIABLE = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.IfInstrImpl <em>If Instr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.IfInstrImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getIfInstr()
	 * @generated
	 */
	int IF_INSTR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__THEN = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elsifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__ELSIFS = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR__ELSE_BLOCK = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Instr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTR_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.IfBranchImpl <em>If Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.IfBranchImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getIfBranch()
	 * @generated
	 */
	int IF_BRANCH = 8;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH__INSTRUCTIONS = CorePackage.INSTRUCTION_BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Boolean Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH__BOOLEAN_VARIABLE = CorePackage.INSTRUCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH__IF_BLOCK = CorePackage.INSTRUCTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BRANCH_FEATURE_COUNT = CorePackage.INSTRUCTION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.IfElseBlockImpl <em>If Else Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.IfElseBlockImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getIfElseBlock()
	 * @generated
	 */
	int IF_ELSE_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_BLOCK__INSTRUCTIONS = CorePackage.INSTRUCTION_BLOCK__INSTRUCTIONS;

	/**
	 * The number of structural features of the '<em>If Else Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_BLOCK_FEATURE_COUNT = CorePackage.INSTRUCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.MethodCallImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD_NAME = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__RECEPTOR = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ACTUAL_PARAMETERS = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maybe Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__MAYBE_GET = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__RECEPTOR_TYPE = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.ReadMetaImpl <em>Read Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.ReadMetaImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getReadMeta()
	 * @generated
	 */
	int READ_META = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__CLASS_NAME = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__KIND = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META__MODEL = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Read Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_META_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl <em>Invoke Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.InvokeTransformationImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvokeTransformation()
	 * @generated
	 */
	int INVOKE_TRANSFORMATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__NAME = INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__TYPE = INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__GET_RECEPTORS = INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__SET_RECEPTORS = INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__SET_VALUES = INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ASSIGN_VARIABLES = INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__IF_CONDITIONS = INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__CALL_RECEPTORS = INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__CALL_PARAMETERS = INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__EMIT_VALUES = INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ROW = INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__COLUMN = INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__FILE = INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__TRANSFORMATION_NAME = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__SOURCE_MODELS = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__TARGET_MODELS = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ENTRY_POINT_NAME = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry Point Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Invoke Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION_FEATURE_COUNT = INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.InvokeExternalImpl <em>Invoke External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.InvokeExternalImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvokeExternal()
	 * @generated
	 */
	int INVOKE_EXTERNAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__NAME = INVOKE_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TYPE = INVOKE_TRANSFORMATION__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__GET_RECEPTORS = INVOKE_TRANSFORMATION__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__SET_RECEPTORS = INVOKE_TRANSFORMATION__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__SET_VALUES = INVOKE_TRANSFORMATION__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ASSIGN_VARIABLES = INVOKE_TRANSFORMATION__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__IF_CONDITIONS = INVOKE_TRANSFORMATION__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__CALL_RECEPTORS = INVOKE_TRANSFORMATION__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__CALL_PARAMETERS = INVOKE_TRANSFORMATION__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__EMIT_VALUES = INVOKE_TRANSFORMATION__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ROW = INVOKE_TRANSFORMATION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__COLUMN = INVOKE_TRANSFORMATION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__FILE = INVOKE_TRANSFORMATION__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TRANSFORMATION_NAME = INVOKE_TRANSFORMATION__TRANSFORMATION_NAME;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__SOURCE_MODELS = INVOKE_TRANSFORMATION__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TARGET_MODELS = INVOKE_TRANSFORMATION__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__INPUT_VIEW_FILTER = INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER;

	/**
	 * The feature id for the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ENTRY_POINT_NAME = INVOKE_TRANSFORMATION__ENTRY_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Entry Point Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ENTRY_POINT_PARAMETERS = INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__PARAMETERS = INVOKE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Resolution Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT = INVOKE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__QUEUE_NAME = INVOKE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Src Trace Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME = INVOKE_TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tgt Trace Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME = INVOKE_TRANSFORMATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Invoke External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL_FEATURE_COUNT = INVOKE_TRANSFORMATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.InvokeInternalImpl <em>Invoke Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.InvokeInternalImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvokeInternal()
	 * @generated
	 */
	int INVOKE_INTERNAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__NAME = INVOKE_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__TYPE = INVOKE_TRANSFORMATION__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__GET_RECEPTORS = INVOKE_TRANSFORMATION__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__SET_RECEPTORS = INVOKE_TRANSFORMATION__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__SET_VALUES = INVOKE_TRANSFORMATION__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ASSIGN_VARIABLES = INVOKE_TRANSFORMATION__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__IF_CONDITIONS = INVOKE_TRANSFORMATION__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__CALL_RECEPTORS = INVOKE_TRANSFORMATION__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__CALL_PARAMETERS = INVOKE_TRANSFORMATION__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__EMIT_VALUES = INVOKE_TRANSFORMATION__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ROW = INVOKE_TRANSFORMATION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__COLUMN = INVOKE_TRANSFORMATION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__FILE = INVOKE_TRANSFORMATION__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__TRANSFORMATION_NAME = INVOKE_TRANSFORMATION__TRANSFORMATION_NAME;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__SOURCE_MODELS = INVOKE_TRANSFORMATION__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__TARGET_MODELS = INVOKE_TRANSFORMATION__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__INPUT_VIEW_FILTER = INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER;

	/**
	 * The feature id for the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ENTRY_POINT_NAME = INVOKE_TRANSFORMATION__ENTRY_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Entry Point Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ENTRY_POINT_PARAMETERS = INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS;

	/**
	 * The number of structural features of the '<em>Invoke Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL_FEATURE_COUNT = INVOKE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.InvocationParameterImpl <em>Invocation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.InvocationParameterImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvocationParameter()
	 * @generated
	 */
	int INVOCATION_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_PARAMETER__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Callee Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_PARAMETER__CALLEE_MODEL_NAME = 1;

	/**
	 * The number of structural features of the '<em>Invocation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.impl.NamedInvocationParameterImpl <em>Named Invocation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.impl.NamedInvocationParameterImpl
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getNamedInvocationParameter()
	 * @generated
	 */
	int NAMED_INVOCATION_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INVOCATION_PARAMETER__FORMAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INVOCATION_PARAMETER__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Named Invocation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INVOCATION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.GetKind <em>Get Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.GetKind
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getGetKind()
	 * @generated
	 */
	int GET_KIND = 17;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.LiteralKind <em>Literal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.LiteralKind
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getLiteralKind()
	 * @generated
	 */
	int LITERAL_KIND = 18;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.instr.ReadMetaKind <em>Read Meta Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.instr.ReadMetaKind
	 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getReadMetaKind()
	 * @generated
	 */
	int READ_META_KIND = 19;

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.InstructionWithResult <em>Instruction With Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction With Result</em>'.
	 * @see org.eclectic.idc.instr.InstructionWithResult
	 * @generated
	 */
	EClass getInstructionWithResult();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see org.eclectic.idc.instr.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.Create#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.idc.instr.Create#getModel()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Create#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclectic.idc.instr.Create#getClassName()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.instr.Create#getConstructorParameters <em>Constructor Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructor Parameters</em>'.
	 * @see org.eclectic.idc.instr.Create#getConstructorParameters()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_ConstructorParameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.eclectic.idc.instr.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.Set#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receptor</em>'.
	 * @see org.eclectic.idc.instr.Set#getReceptor()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Receptor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Set#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.idc.instr.Set#getFeatureName()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_FeatureName();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.Set#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclectic.idc.instr.Set#getValue()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.Get <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get</em>'.
	 * @see org.eclectic.idc.instr.Get
	 * @generated
	 */
	EClass getGet();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.Get#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receptor</em>'.
	 * @see org.eclectic.idc.instr.Get#getReceptor()
	 * @see #getGet()
	 * @generated
	 */
	EReference getGet_Receptor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Get#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.idc.instr.Get#getFeatureName()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Get#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclectic.idc.instr.Get#getKind()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Get#getMaybeCollection <em>Maybe Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maybe Collection</em>'.
	 * @see org.eclectic.idc.instr.Get#getMaybeCollection()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_MaybeCollection();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclectic.idc.instr.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Literal#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.eclectic.idc.instr.Literal#getStringValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Literal#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.eclectic.idc.instr.Literal#getIntValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_IntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Literal#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see org.eclectic.idc.instr.Literal#getDoubleValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_DoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Literal#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.eclectic.idc.instr.Literal#getBooleanValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.Literal#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclectic.idc.instr.Literal#getKind()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.ClosureDef <em>Closure Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closure Def</em>'.
	 * @see org.eclectic.idc.instr.ClosureDef
	 * @generated
	 */
	EClass getClosureDef();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see org.eclectic.idc.instr.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.Assign#getRightVariable <em>Right Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Variable</em>'.
	 * @see org.eclectic.idc.instr.Assign#getRightVariable()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_RightVariable();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.IfInstr <em>If Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Instr</em>'.
	 * @see org.eclectic.idc.instr.IfInstr
	 * @generated
	 */
	EClass getIfInstr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.instr.IfInstr#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclectic.idc.instr.IfInstr#getThen()
	 * @see #getIfInstr()
	 * @generated
	 */
	EReference getIfInstr_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.instr.IfInstr#getElsifs <em>Elsifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsifs</em>'.
	 * @see org.eclectic.idc.instr.IfInstr#getElsifs()
	 * @see #getIfInstr()
	 * @generated
	 */
	EReference getIfInstr_Elsifs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.instr.IfInstr#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see org.eclectic.idc.instr.IfInstr#getElseBlock()
	 * @see #getIfInstr()
	 * @generated
	 */
	EReference getIfInstr_ElseBlock();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.IfBranch <em>If Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Branch</em>'.
	 * @see org.eclectic.idc.instr.IfBranch
	 * @generated
	 */
	EClass getIfBranch();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.IfBranch#getBooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boolean Variable</em>'.
	 * @see org.eclectic.idc.instr.IfBranch#getBooleanVariable()
	 * @see #getIfBranch()
	 * @generated
	 */
	EReference getIfBranch_BooleanVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.instr.IfBranch#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see org.eclectic.idc.instr.IfBranch#getIfBlock()
	 * @see #getIfBranch()
	 * @generated
	 */
	EReference getIfBranch_IfBlock();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.IfElseBlock <em>If Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Else Block</em>'.
	 * @see org.eclectic.idc.instr.IfElseBlock
	 * @generated
	 */
	EClass getIfElseBlock();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see org.eclectic.idc.instr.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.MethodCall#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclectic.idc.instr.MethodCall#getMethodName()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_MethodName();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.MethodCall#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receptor</em>'.
	 * @see org.eclectic.idc.instr.MethodCall#getReceptor()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Receptor();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.instr.MethodCall#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Parameters</em>'.
	 * @see org.eclectic.idc.instr.MethodCall#getActualParameters()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_ActualParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.MethodCall#isMaybeGet <em>Maybe Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maybe Get</em>'.
	 * @see org.eclectic.idc.instr.MethodCall#isMaybeGet()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_MaybeGet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.instr.MethodCall#getReceptorType <em>Receptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receptor Type</em>'.
	 * @see org.eclectic.idc.instr.MethodCall#getReceptorType()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_ReceptorType();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.ReadMeta <em>Read Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Meta</em>'.
	 * @see org.eclectic.idc.instr.ReadMeta
	 * @generated
	 */
	EClass getReadMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.ReadMeta#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclectic.idc.instr.ReadMeta#getClassName()
	 * @see #getReadMeta()
	 * @generated
	 */
	EAttribute getReadMeta_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.ReadMeta#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclectic.idc.instr.ReadMeta#getKind()
	 * @see #getReadMeta()
	 * @generated
	 */
	EAttribute getReadMeta_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.ReadMeta#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.idc.instr.ReadMeta#getModel()
	 * @see #getReadMeta()
	 * @generated
	 */
	EReference getReadMeta_Model();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.InvokeTransformation <em>Invoke Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Transformation</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation
	 * @generated
	 */
	EClass getInvokeTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.InvokeTransformation#getTransformationName <em>Transformation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Name</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation#getTransformationName()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EAttribute getInvokeTransformation_TransformationName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.instr.InvokeTransformation#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation#getSourceModels()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.instr.InvokeTransformation#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation#getTargetModels()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_TargetModels();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.InvokeTransformation#getInputViewFilter <em>Input View Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input View Filter</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation#getInputViewFilter()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_InputViewFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.InvokeTransformation#getEntryPointName <em>Entry Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point Name</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation#getEntryPointName()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EAttribute getInvokeTransformation_EntryPointName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.instr.InvokeTransformation#getEntryPointParameters <em>Entry Point Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry Point Parameters</em>'.
	 * @see org.eclectic.idc.instr.InvokeTransformation#getEntryPointParameters()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_EntryPointParameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.InvokeExternal <em>Invoke External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke External</em>'.
	 * @see org.eclectic.idc.instr.InvokeExternal
	 * @generated
	 */
	EClass getInvokeExternal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.instr.InvokeExternal#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.idc.instr.InvokeExternal#getParameters()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EReference getInvokeExternal_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.InvokeExternal#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Resolution Source Element</em>'.
	 * @see org.eclectic.idc.instr.InvokeExternal#getOutputResolutionSourceElement()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EReference getInvokeExternal_OutputResolutionSourceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.InvokeExternal#getQueueName <em>Queue Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Name</em>'.
	 * @see org.eclectic.idc.instr.InvokeExternal#getQueueName()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EAttribute getInvokeExternal_QueueName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.InvokeExternal#getSrcTraceAttributeName <em>Src Trace Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Trace Attribute Name</em>'.
	 * @see org.eclectic.idc.instr.InvokeExternal#getSrcTraceAttributeName()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EAttribute getInvokeExternal_SrcTraceAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.InvokeExternal#getTgtTraceAttributeName <em>Tgt Trace Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Trace Attribute Name</em>'.
	 * @see org.eclectic.idc.instr.InvokeExternal#getTgtTraceAttributeName()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EAttribute getInvokeExternal_TgtTraceAttributeName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.InvokeInternal <em>Invoke Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Internal</em>'.
	 * @see org.eclectic.idc.instr.InvokeInternal
	 * @generated
	 */
	EClass getInvokeInternal();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.InvocationParameter <em>Invocation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Parameter</em>'.
	 * @see org.eclectic.idc.instr.InvocationParameter
	 * @generated
	 */
	EClass getInvocationParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.InvocationParameter#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.idc.instr.InvocationParameter#getModel()
	 * @see #getInvocationParameter()
	 * @generated
	 */
	EReference getInvocationParameter_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.InvocationParameter#getCalleeModelName <em>Callee Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callee Model Name</em>'.
	 * @see org.eclectic.idc.instr.InvocationParameter#getCalleeModelName()
	 * @see #getInvocationParameter()
	 * @generated
	 */
	EAttribute getInvocationParameter_CalleeModelName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.instr.NamedInvocationParameter <em>Named Invocation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Invocation Parameter</em>'.
	 * @see org.eclectic.idc.instr.NamedInvocationParameter
	 * @generated
	 */
	EClass getNamedInvocationParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.instr.NamedInvocationParameter#getFormalName <em>Formal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Name</em>'.
	 * @see org.eclectic.idc.instr.NamedInvocationParameter#getFormalName()
	 * @see #getNamedInvocationParameter()
	 * @generated
	 */
	EAttribute getNamedInvocationParameter_FormalName();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.instr.NamedInvocationParameter#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see org.eclectic.idc.instr.NamedInvocationParameter#getResult()
	 * @see #getNamedInvocationParameter()
	 * @generated
	 */
	EReference getNamedInvocationParameter_Result();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.idc.instr.GetKind <em>Get Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Get Kind</em>'.
	 * @see org.eclectic.idc.instr.GetKind
	 * @generated
	 */
	EEnum getGetKind();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.idc.instr.LiteralKind <em>Literal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Kind</em>'.
	 * @see org.eclectic.idc.instr.LiteralKind
	 * @generated
	 */
	EEnum getLiteralKind();

	/**
	 * Returns the meta object for enum '{@link org.eclectic.idc.instr.ReadMetaKind <em>Read Meta Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Read Meta Kind</em>'.
	 * @see org.eclectic.idc.instr.ReadMetaKind
	 * @generated
	 */
	EEnum getReadMetaKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstrFactory getInstrFactory();

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
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.InstructionWithResultImpl <em>Instruction With Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.InstructionWithResultImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInstructionWithResult()
		 * @generated
		 */
		EClass INSTRUCTION_WITH_RESULT = eINSTANCE.getInstructionWithResult();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.CreateImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__MODEL = eINSTANCE.getCreate_Model();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__CLASS_NAME = eINSTANCE.getCreate_ClassName();

		/**
		 * The meta object literal for the '<em><b>Constructor Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__CONSTRUCTOR_PARAMETERS = eINSTANCE.getCreate_ConstructorParameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.SetImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__RECEPTOR = eINSTANCE.getSet_Receptor();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET__FEATURE_NAME = eINSTANCE.getSet_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__VALUE = eINSTANCE.getSet_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.GetImpl <em>Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.GetImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getGet()
		 * @generated
		 */
		EClass GET = eINSTANCE.getGet();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET__RECEPTOR = eINSTANCE.getGet_Receptor();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__FEATURE_NAME = eINSTANCE.getGet_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__KIND = eINSTANCE.getGet_Kind();

		/**
		 * The meta object literal for the '<em><b>Maybe Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__MAYBE_COLLECTION = eINSTANCE.getGet_MaybeCollection();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.LiteralImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__STRING_VALUE = eINSTANCE.getLiteral_StringValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__INT_VALUE = eINSTANCE.getLiteral_IntValue();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__DOUBLE_VALUE = eINSTANCE.getLiteral_DoubleValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__BOOLEAN_VALUE = eINSTANCE.getLiteral_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__KIND = eINSTANCE.getLiteral_Kind();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.ClosureDefImpl <em>Closure Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.ClosureDefImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getClosureDef()
		 * @generated
		 */
		EClass CLOSURE_DEF = eINSTANCE.getClosureDef();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.AssignImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Right Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__RIGHT_VARIABLE = eINSTANCE.getAssign_RightVariable();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.IfInstrImpl <em>If Instr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.IfInstrImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getIfInstr()
		 * @generated
		 */
		EClass IF_INSTR = eINSTANCE.getIfInstr();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_INSTR__THEN = eINSTANCE.getIfInstr_Then();

		/**
		 * The meta object literal for the '<em><b>Elsifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_INSTR__ELSIFS = eINSTANCE.getIfInstr_Elsifs();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_INSTR__ELSE_BLOCK = eINSTANCE.getIfInstr_ElseBlock();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.IfBranchImpl <em>If Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.IfBranchImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getIfBranch()
		 * @generated
		 */
		EClass IF_BRANCH = eINSTANCE.getIfBranch();

		/**
		 * The meta object literal for the '<em><b>Boolean Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BRANCH__BOOLEAN_VARIABLE = eINSTANCE.getIfBranch_BooleanVariable();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BRANCH__IF_BLOCK = eINSTANCE.getIfBranch_IfBlock();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.IfElseBlockImpl <em>If Else Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.IfElseBlockImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getIfElseBlock()
		 * @generated
		 */
		EClass IF_ELSE_BLOCK = eINSTANCE.getIfElseBlock();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.MethodCallImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL__METHOD_NAME = eINSTANCE.getMethodCall_MethodName();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__RECEPTOR = eINSTANCE.getMethodCall_Receptor();

		/**
		 * The meta object literal for the '<em><b>Actual Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__ACTUAL_PARAMETERS = eINSTANCE.getMethodCall_ActualParameters();

		/**
		 * The meta object literal for the '<em><b>Maybe Get</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL__MAYBE_GET = eINSTANCE.getMethodCall_MaybeGet();

		/**
		 * The meta object literal for the '<em><b>Receptor Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__RECEPTOR_TYPE = eINSTANCE.getMethodCall_ReceptorType();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.ReadMetaImpl <em>Read Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.ReadMetaImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getReadMeta()
		 * @generated
		 */
		EClass READ_META = eINSTANCE.getReadMeta();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_META__CLASS_NAME = eINSTANCE.getReadMeta_ClassName();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_META__KIND = eINSTANCE.getReadMeta_Kind();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_META__MODEL = eINSTANCE.getReadMeta_Model();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl <em>Invoke Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.InvokeTransformationImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvokeTransformation()
		 * @generated
		 */
		EClass INVOKE_TRANSFORMATION = eINSTANCE.getInvokeTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_TRANSFORMATION__TRANSFORMATION_NAME = eINSTANCE.getInvokeTransformation_TransformationName();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__SOURCE_MODELS = eINSTANCE.getInvokeTransformation_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__TARGET_MODELS = eINSTANCE.getInvokeTransformation_TargetModels();

		/**
		 * The meta object literal for the '<em><b>Input View Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER = eINSTANCE.getInvokeTransformation_InputViewFilter();

		/**
		 * The meta object literal for the '<em><b>Entry Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_TRANSFORMATION__ENTRY_POINT_NAME = eINSTANCE.getInvokeTransformation_EntryPointName();

		/**
		 * The meta object literal for the '<em><b>Entry Point Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS = eINSTANCE.getInvokeTransformation_EntryPointParameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.InvokeExternalImpl <em>Invoke External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.InvokeExternalImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvokeExternal()
		 * @generated
		 */
		EClass INVOKE_EXTERNAL = eINSTANCE.getInvokeExternal();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_EXTERNAL__PARAMETERS = eINSTANCE.getInvokeExternal_Parameters();

		/**
		 * The meta object literal for the '<em><b>Output Resolution Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT = eINSTANCE.getInvokeExternal_OutputResolutionSourceElement();

		/**
		 * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_EXTERNAL__QUEUE_NAME = eINSTANCE.getInvokeExternal_QueueName();

		/**
		 * The meta object literal for the '<em><b>Src Trace Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME = eINSTANCE.getInvokeExternal_SrcTraceAttributeName();

		/**
		 * The meta object literal for the '<em><b>Tgt Trace Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME = eINSTANCE.getInvokeExternal_TgtTraceAttributeName();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.InvokeInternalImpl <em>Invoke Internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.InvokeInternalImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvokeInternal()
		 * @generated
		 */
		EClass INVOKE_INTERNAL = eINSTANCE.getInvokeInternal();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.InvocationParameterImpl <em>Invocation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.InvocationParameterImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getInvocationParameter()
		 * @generated
		 */
		EClass INVOCATION_PARAMETER = eINSTANCE.getInvocationParameter();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_PARAMETER__MODEL = eINSTANCE.getInvocationParameter_Model();

		/**
		 * The meta object literal for the '<em><b>Callee Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION_PARAMETER__CALLEE_MODEL_NAME = eINSTANCE.getInvocationParameter_CalleeModelName();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.impl.NamedInvocationParameterImpl <em>Named Invocation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.impl.NamedInvocationParameterImpl
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getNamedInvocationParameter()
		 * @generated
		 */
		EClass NAMED_INVOCATION_PARAMETER = eINSTANCE.getNamedInvocationParameter();

		/**
		 * The meta object literal for the '<em><b>Formal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_INVOCATION_PARAMETER__FORMAL_NAME = eINSTANCE.getNamedInvocationParameter_FormalName();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_INVOCATION_PARAMETER__RESULT = eINSTANCE.getNamedInvocationParameter_Result();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.GetKind <em>Get Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.GetKind
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getGetKind()
		 * @generated
		 */
		EEnum GET_KIND = eINSTANCE.getGetKind();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.LiteralKind <em>Literal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.LiteralKind
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getLiteralKind()
		 * @generated
		 */
		EEnum LITERAL_KIND = eINSTANCE.getLiteralKind();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.instr.ReadMetaKind <em>Read Meta Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.instr.ReadMetaKind
		 * @see org.eclectic.idc.instr.impl.InstrPackageImpl#getReadMetaKind()
		 * @generated
		 */
		EEnum READ_META_KIND = eINSTANCE.getReadMetaKind();

	}

} //InstrPackage
