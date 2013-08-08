/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclectic.frontend.tao.TaoFactory
 * @model kind="package"
 * @generated
 */
public interface TaoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tao";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/taoL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_taoL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaoPackage eINSTANCE = org.eclectic.frontend.tao.impl.TaoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.TaoTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.TaoTransformationImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTaoTransformation()
	 * @generated
	 */
	int TAO_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION__TEMPLATES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAO_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.TemplateParameterImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTemplateParameter()
	 * @generated
	 */
	int TEMPLATE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__TYPE = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl <em>Object Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.ObjectInstantiationImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getObjectInstantiation()
	 * @generated
	 */
	int OBJECT_INSTANTIATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION__ROW = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION__COLUMN = CorePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION__FILE = CorePackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION__TYPE = CorePackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assigments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION__ASSIGMENTS = CorePackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Object Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANTIATION_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.TemplateRootObjectImpl <em>Template Root Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.TemplateRootObjectImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTemplateRootObject()
	 * @generated
	 */
	int TEMPLATE_ROOT_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT__NAME = OBJECT_INSTANTIATION__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT__ROW = OBJECT_INSTANTIATION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT__COLUMN = OBJECT_INSTANTIATION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT__FILE = OBJECT_INSTANTIATION__FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT__TYPE = OBJECT_INSTANTIATION__TYPE;

	/**
	 * The feature id for the '<em><b>Assigments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT__ASSIGMENTS = OBJECT_INSTANTIATION__ASSIGMENTS;

	/**
	 * The number of structural features of the '<em>Template Root Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROOT_OBJECT_FEATURE_COUNT = OBJECT_INSTANTIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.TemplateImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ROW = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__COLUMN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__FILE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ROOTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.AssignmentImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ROW = CorePackage.STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__COLUMN = CorePackage.STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FILE = CorePackage.STATEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = CorePackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.AttributeAssigmentImpl <em>Attribute Assigment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.AttributeAssigmentImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getAttributeAssigment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGMENT = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGMENT__ROW = ASSIGNMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGMENT__COLUMN = ASSIGNMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGMENT__FILE = ASSIGNMENT__FILE;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGMENT__TARGET_FEATURE = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGMENT__EXPR = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.SourceExpressionImpl <em>Source Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.SourceExpressionImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getSourceExpression()
	 * @generated
	 */
	int SOURCE_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EXPRESSION__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EXPRESSION__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EXPRESSION__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The number of structural features of the '<em>Source Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EXPRESSION_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.WithOptionalVariableExpressionImpl <em>With Optional Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.WithOptionalVariableExpressionImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getWithOptionalVariableExpression()
	 * @generated
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION__ROW = SOURCE_EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION__COLUMN = SOURCE_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION__FILE = SOURCE_EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION__VARIABLE = SOURCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION__EXPR = SOURCE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>With Optional Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPTIONAL_VARIABLE_EXPRESSION_FEATURE_COUNT = SOURCE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.ObjectSourceVariableImpl <em>Object Source Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.ObjectSourceVariableImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getObjectSourceVariable()
	 * @generated
	 */
	int OBJECT_SOURCE_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOURCE_VARIABLE__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Object Source Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOURCE_VARIABLE_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.ReferenceAssignmentImpl <em>Reference Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.ReferenceAssignmentImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getReferenceAssignment()
	 * @generated
	 */
	int REFERENCE_ASSIGNMENT = 10;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__ROW = ASSIGNMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__COLUMN = ASSIGNMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__FILE = ASSIGNMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__NAME = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__TARGET_FEATURE = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__EXPR = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__MULTIVALUED = ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reference Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.ObjectSyntaxImpl <em>Object Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.ObjectSyntaxImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getObjectSyntax()
	 * @generated
	 */
	int OBJECT_SYNTAX = 11;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__ROW = REFERENCE_ASSIGNMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__COLUMN = REFERENCE_ASSIGNMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__FILE = REFERENCE_ASSIGNMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__NAME = REFERENCE_ASSIGNMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__TARGET_FEATURE = REFERENCE_ASSIGNMENT__TARGET_FEATURE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__EXPR = REFERENCE_ASSIGNMENT__EXPR;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__MULTIVALUED = REFERENCE_ASSIGNMENT__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX__OBJECT = REFERENCE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SYNTAX_FEATURE_COUNT = REFERENCE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.tao.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.tao.impl.InvocationImpl
	 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 12;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ROW = REFERENCE_ASSIGNMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__COLUMN = REFERENCE_ASSIGNMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__FILE = REFERENCE_ASSIGNMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__NAME = REFERENCE_ASSIGNMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__TARGET_FEATURE = REFERENCE_ASSIGNMENT__TARGET_FEATURE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__EXPR = REFERENCE_ASSIGNMENT__EXPR;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__MULTIVALUED = REFERENCE_ASSIGNMENT__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__TEMPLATE = REFERENCE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = REFERENCE_ASSIGNMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.TaoTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.tao.TaoTransformation
	 * @generated
	 */
	EClass getTaoTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.tao.TaoTransformation#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.eclectic.frontend.tao.TaoTransformation#getTemplates()
	 * @see #getTaoTransformation()
	 * @generated
	 */
	EReference getTaoTransformation_Templates();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter</em>'.
	 * @see org.eclectic.frontend.tao.TemplateParameter
	 * @generated
	 */
	EClass getTemplateParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.TemplateParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.tao.TemplateParameter#getType()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EReference getTemplateParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.ObjectInstantiation <em>Object Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Instantiation</em>'.
	 * @see org.eclectic.frontend.tao.ObjectInstantiation
	 * @generated
	 */
	EClass getObjectInstantiation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.ObjectInstantiation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.tao.ObjectInstantiation#getType()
	 * @see #getObjectInstantiation()
	 * @generated
	 */
	EReference getObjectInstantiation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.tao.ObjectInstantiation#getAssigments <em>Assigments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigments</em>'.
	 * @see org.eclectic.frontend.tao.ObjectInstantiation#getAssigments()
	 * @see #getObjectInstantiation()
	 * @generated
	 */
	EReference getObjectInstantiation_Assigments();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.TemplateRootObject <em>Template Root Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Root Object</em>'.
	 * @see org.eclectic.frontend.tao.TemplateRootObject
	 * @generated
	 */
	EClass getTemplateRootObject();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.eclectic.frontend.tao.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.tao.Template#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.tao.Template#getParameters()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.tao.Template#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roots</em>'.
	 * @see org.eclectic.frontend.tao.Template#getRoots()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Roots();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.eclectic.frontend.tao.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.AttributeAssigment <em>Attribute Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assigment</em>'.
	 * @see org.eclectic.frontend.tao.AttributeAssigment
	 * @generated
	 */
	EClass getAttributeAssigment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.tao.AttributeAssigment#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Feature</em>'.
	 * @see org.eclectic.frontend.tao.AttributeAssigment#getTargetFeature()
	 * @see #getAttributeAssigment()
	 * @generated
	 */
	EAttribute getAttributeAssigment_TargetFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.AttributeAssigment#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclectic.frontend.tao.AttributeAssigment#getExpr()
	 * @see #getAttributeAssigment()
	 * @generated
	 */
	EReference getAttributeAssigment_Expr();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.SourceExpression <em>Source Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Expression</em>'.
	 * @see org.eclectic.frontend.tao.SourceExpression
	 * @generated
	 */
	EClass getSourceExpression();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.WithOptionalVariableExpression <em>With Optional Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With Optional Variable Expression</em>'.
	 * @see org.eclectic.frontend.tao.WithOptionalVariableExpression
	 * @generated
	 */
	EClass getWithOptionalVariableExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.WithOptionalVariableExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.eclectic.frontend.tao.WithOptionalVariableExpression#getVariable()
	 * @see #getWithOptionalVariableExpression()
	 * @generated
	 */
	EReference getWithOptionalVariableExpression_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.WithOptionalVariableExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclectic.frontend.tao.WithOptionalVariableExpression#getExpr()
	 * @see #getWithOptionalVariableExpression()
	 * @generated
	 */
	EReference getWithOptionalVariableExpression_Expr();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.ObjectSourceVariable <em>Object Source Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Source Variable</em>'.
	 * @see org.eclectic.frontend.tao.ObjectSourceVariable
	 * @generated
	 */
	EClass getObjectSourceVariable();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.ReferenceAssignment <em>Reference Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Assignment</em>'.
	 * @see org.eclectic.frontend.tao.ReferenceAssignment
	 * @generated
	 */
	EClass getReferenceAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.tao.ReferenceAssignment#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Feature</em>'.
	 * @see org.eclectic.frontend.tao.ReferenceAssignment#getTargetFeature()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EAttribute getReferenceAssignment_TargetFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.ReferenceAssignment#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclectic.frontend.tao.ReferenceAssignment#getExpr()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EReference getReferenceAssignment_Expr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.tao.ReferenceAssignment#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see org.eclectic.frontend.tao.ReferenceAssignment#isMultivalued()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EAttribute getReferenceAssignment_Multivalued();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.ObjectSyntax <em>Object Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Syntax</em>'.
	 * @see org.eclectic.frontend.tao.ObjectSyntax
	 * @generated
	 */
	EClass getObjectSyntax();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.tao.ObjectSyntax#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.eclectic.frontend.tao.ObjectSyntax#getObject()
	 * @see #getObjectSyntax()
	 * @generated
	 */
	EReference getObjectSyntax_Object();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.tao.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see org.eclectic.frontend.tao.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.tao.Invocation#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see org.eclectic.frontend.tao.Invocation#getTemplate()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Template();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaoFactory getTaoFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.TaoTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.TaoTransformationImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTaoTransformation()
		 * @generated
		 */
		EClass TAO_TRANSFORMATION = eINSTANCE.getTaoTransformation();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAO_TRANSFORMATION__TEMPLATES = eINSTANCE.getTaoTransformation_Templates();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.TemplateParameterImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTemplateParameter()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER__TYPE = eINSTANCE.getTemplateParameter_Type();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl <em>Object Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.ObjectInstantiationImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getObjectInstantiation()
		 * @generated
		 */
		EClass OBJECT_INSTANTIATION = eINSTANCE.getObjectInstantiation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANTIATION__TYPE = eINSTANCE.getObjectInstantiation_Type();

		/**
		 * The meta object literal for the '<em><b>Assigments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANTIATION__ASSIGMENTS = eINSTANCE.getObjectInstantiation_Assigments();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.TemplateRootObjectImpl <em>Template Root Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.TemplateRootObjectImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTemplateRootObject()
		 * @generated
		 */
		EClass TEMPLATE_ROOT_OBJECT = eINSTANCE.getTemplateRootObject();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.TemplateImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__PARAMETERS = eINSTANCE.getTemplate_Parameters();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__ROOTS = eINSTANCE.getTemplate_Roots();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.AssignmentImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.AttributeAssigmentImpl <em>Attribute Assigment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.AttributeAssigmentImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getAttributeAssigment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGMENT = eINSTANCE.getAttributeAssigment();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ASSIGMENT__TARGET_FEATURE = eINSTANCE.getAttributeAssigment_TargetFeature();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGMENT__EXPR = eINSTANCE.getAttributeAssigment_Expr();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.SourceExpressionImpl <em>Source Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.SourceExpressionImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getSourceExpression()
		 * @generated
		 */
		EClass SOURCE_EXPRESSION = eINSTANCE.getSourceExpression();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.WithOptionalVariableExpressionImpl <em>With Optional Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.WithOptionalVariableExpressionImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getWithOptionalVariableExpression()
		 * @generated
		 */
		EClass WITH_OPTIONAL_VARIABLE_EXPRESSION = eINSTANCE.getWithOptionalVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_OPTIONAL_VARIABLE_EXPRESSION__VARIABLE = eINSTANCE.getWithOptionalVariableExpression_Variable();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_OPTIONAL_VARIABLE_EXPRESSION__EXPR = eINSTANCE.getWithOptionalVariableExpression_Expr();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.ObjectSourceVariableImpl <em>Object Source Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.ObjectSourceVariableImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getObjectSourceVariable()
		 * @generated
		 */
		EClass OBJECT_SOURCE_VARIABLE = eINSTANCE.getObjectSourceVariable();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.ReferenceAssignmentImpl <em>Reference Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.ReferenceAssignmentImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getReferenceAssignment()
		 * @generated
		 */
		EClass REFERENCE_ASSIGNMENT = eINSTANCE.getReferenceAssignment();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_ASSIGNMENT__TARGET_FEATURE = eINSTANCE.getReferenceAssignment_TargetFeature();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ASSIGNMENT__EXPR = eINSTANCE.getReferenceAssignment_Expr();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_ASSIGNMENT__MULTIVALUED = eINSTANCE.getReferenceAssignment_Multivalued();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.ObjectSyntaxImpl <em>Object Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.ObjectSyntaxImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getObjectSyntax()
		 * @generated
		 */
		EClass OBJECT_SYNTAX = eINSTANCE.getObjectSyntax();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SYNTAX__OBJECT = eINSTANCE.getObjectSyntax_Object();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.tao.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.tao.impl.InvocationImpl
		 * @see org.eclectic.frontend.tao.impl.TaoPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__TEMPLATE = eINSTANCE.getInvocation_Template();

	}

} //TaoPackage
