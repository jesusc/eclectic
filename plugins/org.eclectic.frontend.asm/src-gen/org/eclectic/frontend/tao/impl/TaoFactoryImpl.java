/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao.impl;

import org.eclectic.frontend.tao.*;

import org.eclipse.emf.ecore.EClass;
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
public class TaoFactoryImpl extends EFactoryImpl implements TaoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaoFactory init() {
		try {
			TaoFactory theTaoFactory = (TaoFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/taoL"); 
			if (theTaoFactory != null) {
				return theTaoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaoFactoryImpl() {
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
			case TaoPackage.TAO_TRANSFORMATION: return createTaoTransformation();
			case TaoPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case TaoPackage.OBJECT_INSTANTIATION: return createObjectInstantiation();
			case TaoPackage.TEMPLATE_ROOT_OBJECT: return createTemplateRootObject();
			case TaoPackage.TEMPLATE: return createTemplate();
			case TaoPackage.ATTRIBUTE_ASSIGMENT: return createAttributeAssigment();
			case TaoPackage.WITH_OPTIONAL_VARIABLE_EXPRESSION: return createWithOptionalVariableExpression();
			case TaoPackage.OBJECT_SOURCE_VARIABLE: return createObjectSourceVariable();
			case TaoPackage.OBJECT_SYNTAX: return createObjectSyntax();
			case TaoPackage.INVOCATION: return createInvocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaoTransformation createTaoTransformation() {
		TaoTransformationImpl taoTransformation = new TaoTransformationImpl();
		return taoTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstantiation createObjectInstantiation() {
		ObjectInstantiationImpl objectInstantiation = new ObjectInstantiationImpl();
		return objectInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRootObject createTemplateRootObject() {
		TemplateRootObjectImpl templateRootObject = new TemplateRootObjectImpl();
		return templateRootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssigment createAttributeAssigment() {
		AttributeAssigmentImpl attributeAssigment = new AttributeAssigmentImpl();
		return attributeAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithOptionalVariableExpression createWithOptionalVariableExpression() {
		WithOptionalVariableExpressionImpl withOptionalVariableExpression = new WithOptionalVariableExpressionImpl();
		return withOptionalVariableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSourceVariable createObjectSourceVariable() {
		ObjectSourceVariableImpl objectSourceVariable = new ObjectSourceVariableImpl();
		return objectSourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSyntax createObjectSyntax() {
		ObjectSyntaxImpl objectSyntax = new ObjectSyntaxImpl();
		return objectSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invocation createInvocation() {
		InvocationImpl invocation = new InvocationImpl();
		return invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaoPackage getTaoPackage() {
		return (TaoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaoPackage getPackage() {
		return TaoPackage.eINSTANCE;
	}

} //TaoFactoryImpl
