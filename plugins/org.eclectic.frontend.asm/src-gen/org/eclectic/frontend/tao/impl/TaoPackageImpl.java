/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao.impl;

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

import org.eclectic.frontend.qool.facilities.FacilitiesPackage;
import org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl;
import org.eclectic.frontend.qool.impl.QoolPackageImpl;

import org.eclectic.frontend.script.ScriptPackage;

import org.eclectic.frontend.script.impl.ScriptPackageImpl;

import org.eclectic.frontend.tao.Assignment;
import org.eclectic.frontend.tao.AttributeAssigment;
import org.eclectic.frontend.tao.GetExpression;
import org.eclectic.frontend.tao.Invocation;
import org.eclectic.frontend.tao.NormalExpression;
import org.eclectic.frontend.tao.ObjectInstantiation;
import org.eclectic.frontend.tao.ObjectSourceVariable;
import org.eclectic.frontend.tao.ObjectSyntax;
import org.eclectic.frontend.tao.ReferenceAssignment;
import org.eclectic.frontend.tao.SourceExpression;
import org.eclectic.frontend.tao.StringConstant;
import org.eclectic.frontend.tao.TaoFactory;
import org.eclectic.frontend.tao.TaoPackage;
import org.eclectic.frontend.tao.TaoTransformation;
import org.eclectic.frontend.tao.Template;
import org.eclectic.frontend.tao.TemplateParameter;
import org.eclectic.frontend.tao.TemplateRootObject;

import org.eclectic.frontend.tao.WithOptionalVariableExpression;
import org.eclectic.frontend.tao.WithVariableExpression;
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
public class TaoPackageImpl extends EPackageImpl implements TaoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taoTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateRootObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withOptionalVariableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSourceVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationEClass = null;

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
	 * @see org.eclectic.frontend.tao.TaoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaoPackageImpl() {
		super(eNS_URI, TaoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaoPackage init() {
		if (isInited) return (TaoPackage)EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI);

		// Obtain or create and register package
		TaoPackageImpl theTaoPackage = (TaoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaoPackageImpl());

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
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theTaoPackage.createPackageContents();
		theFrontendPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theKoanPackage.createPackageContents();
		theAttributionPackage.createPackageContents();
		theImperativePackage.createPackageContents();
		theChainPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theMappingsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theTaoPackage.initializePackageContents();
		theFrontendPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theKoanPackage.initializePackageContents();
		theAttributionPackage.initializePackageContents();
		theImperativePackage.initializePackageContents();
		theChainPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theMappingsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaoPackage.eNS_URI, theTaoPackage);
		return theTaoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaoTransformation() {
		return taoTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaoTransformation_Templates() {
		return (EReference)taoTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Type() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInstantiation() {
		return objectInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstantiation_Type() {
		return (EReference)objectInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstantiation_Assigments() {
		return (EReference)objectInstantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateRootObject() {
		return templateRootObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplate_Parameters() {
		return (EReference)templateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplate_Roots() {
		return (EReference)templateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssigment() {
		return attributeAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeAssigment_TargetFeature() {
		return (EAttribute)attributeAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssigment_Expr() {
		return (EReference)attributeAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceExpression() {
		return sourceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithOptionalVariableExpression() {
		return withOptionalVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWithOptionalVariableExpression_Variable() {
		return (EReference)withOptionalVariableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWithOptionalVariableExpression_Expr() {
		return (EReference)withOptionalVariableExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSourceVariable() {
		return objectSourceVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceAssignment() {
		return referenceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceAssignment_TargetFeature() {
		return (EAttribute)referenceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceAssignment_Expr() {
		return (EReference)referenceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceAssignment_Multivalued() {
		return (EAttribute)referenceAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSyntax() {
		return objectSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSyntax_Object() {
		return (EReference)objectSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocation() {
		return invocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_Template() {
		return (EReference)invocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaoFactory getTaoFactory() {
		return (TaoFactory)getEFactoryInstance();
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
		taoTransformationEClass = createEClass(TAO_TRANSFORMATION);
		createEReference(taoTransformationEClass, TAO_TRANSFORMATION__TEMPLATES);

		templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__TYPE);

		objectInstantiationEClass = createEClass(OBJECT_INSTANTIATION);
		createEReference(objectInstantiationEClass, OBJECT_INSTANTIATION__TYPE);
		createEReference(objectInstantiationEClass, OBJECT_INSTANTIATION__ASSIGMENTS);

		templateRootObjectEClass = createEClass(TEMPLATE_ROOT_OBJECT);

		templateEClass = createEClass(TEMPLATE);
		createEReference(templateEClass, TEMPLATE__PARAMETERS);
		createEReference(templateEClass, TEMPLATE__ROOTS);

		assignmentEClass = createEClass(ASSIGNMENT);

		attributeAssigmentEClass = createEClass(ATTRIBUTE_ASSIGMENT);
		createEAttribute(attributeAssigmentEClass, ATTRIBUTE_ASSIGMENT__TARGET_FEATURE);
		createEReference(attributeAssigmentEClass, ATTRIBUTE_ASSIGMENT__EXPR);

		sourceExpressionEClass = createEClass(SOURCE_EXPRESSION);

		withOptionalVariableExpressionEClass = createEClass(WITH_OPTIONAL_VARIABLE_EXPRESSION);
		createEReference(withOptionalVariableExpressionEClass, WITH_OPTIONAL_VARIABLE_EXPRESSION__VARIABLE);
		createEReference(withOptionalVariableExpressionEClass, WITH_OPTIONAL_VARIABLE_EXPRESSION__EXPR);

		objectSourceVariableEClass = createEClass(OBJECT_SOURCE_VARIABLE);

		referenceAssignmentEClass = createEClass(REFERENCE_ASSIGNMENT);
		createEAttribute(referenceAssignmentEClass, REFERENCE_ASSIGNMENT__TARGET_FEATURE);
		createEReference(referenceAssignmentEClass, REFERENCE_ASSIGNMENT__EXPR);
		createEAttribute(referenceAssignmentEClass, REFERENCE_ASSIGNMENT__MULTIVALUED);

		objectSyntaxEClass = createEClass(OBJECT_SYNTAX);
		createEReference(objectSyntaxEClass, OBJECT_SYNTAX__OBJECT);

		invocationEClass = createEClass(INVOCATION);
		createEReference(invocationEClass, INVOCATION__TEMPLATE);
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
		taoTransformationEClass.getESuperTypes().add(theCorePackage.getTransformationDefinition());
		templateParameterEClass.getESuperTypes().add(theCorePackage.getVariable());
		objectInstantiationEClass.getESuperTypes().add(theCorePackage.getVariable());
		objectInstantiationEClass.getESuperTypes().add(theCorePackage.getStatement());
		templateRootObjectEClass.getESuperTypes().add(this.getObjectInstantiation());
		templateEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		templateEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		assignmentEClass.getESuperTypes().add(theCorePackage.getStatement());
		attributeAssigmentEClass.getESuperTypes().add(this.getAssignment());
		sourceExpressionEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		withOptionalVariableExpressionEClass.getESuperTypes().add(this.getSourceExpression());
		objectSourceVariableEClass.getESuperTypes().add(theCorePackage.getVariable());
		referenceAssignmentEClass.getESuperTypes().add(this.getAssignment());
		referenceAssignmentEClass.getESuperTypes().add(theCorePackage.getVariable());
		objectSyntaxEClass.getESuperTypes().add(this.getReferenceAssignment());
		invocationEClass.getESuperTypes().add(this.getReferenceAssignment());

		// Initialize classes and features; add operations and parameters
		initEClass(taoTransformationEClass, TaoTransformation.class, "TaoTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaoTransformation_Templates(), this.getTemplate(), null, "templates", null, 0, -1, TaoTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameter_Type(), theCorePackage.getClassUse(), null, "type", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectInstantiationEClass, ObjectInstantiation.class, "ObjectInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectInstantiation_Type(), theCorePackage.getClassUse(), null, "type", null, 1, 1, ObjectInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstantiation_Assigments(), this.getAssignment(), null, "assigments", null, 0, -1, ObjectInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateRootObjectEClass, TemplateRootObject.class, "TemplateRootObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplate_Parameters(), this.getTemplateParameter(), null, "parameters", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplate_Roots(), this.getTemplateRootObject(), null, "roots", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeAssigmentEClass, AttributeAssigment.class, "AttributeAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeAssigment_TargetFeature(), ecorePackage.getEString(), "targetFeature", null, 1, 1, AttributeAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssigment_Expr(), this.getSourceExpression(), null, "expr", null, 1, 1, AttributeAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceExpressionEClass, SourceExpression.class, "SourceExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withOptionalVariableExpressionEClass, WithOptionalVariableExpression.class, "WithOptionalVariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWithOptionalVariableExpression_Variable(), this.getObjectSourceVariable(), null, "variable", null, 0, 1, WithOptionalVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWithOptionalVariableExpression_Expr(), theCorePackage.getExpression(), null, "expr", null, 1, 1, WithOptionalVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSourceVariableEClass, ObjectSourceVariable.class, "ObjectSourceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceAssignmentEClass, ReferenceAssignment.class, "ReferenceAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceAssignment_TargetFeature(), ecorePackage.getEString(), "targetFeature", null, 1, 1, ReferenceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceAssignment_Expr(), this.getSourceExpression(), null, "expr", null, 0, 1, ReferenceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceAssignment_Multivalued(), ecorePackage.getEBoolean(), "multivalued", "false", 1, 1, ReferenceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSyntaxEClass, ObjectSyntax.class, "ObjectSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSyntax_Object(), this.getObjectInstantiation(), null, "object", null, 1, 1, ObjectSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocationEClass, Invocation.class, "Invocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocation_Template(), this.getTemplate(), null, "template", null, 1, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TaoPackageImpl
