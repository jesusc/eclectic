/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

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

import org.eclectic.frontend.mappings.Attribute2Attribute;
import org.eclectic.frontend.mappings.AttributeIsBoolean;
import org.eclectic.frontend.mappings.AttributeIsDouble;
import org.eclectic.frontend.mappings.AttributeIsInteger;
import org.eclectic.frontend.mappings.AttributeIsResolveLink;
import org.eclectic.frontend.mappings.AttributeIsString;
import org.eclectic.frontend.mappings.AttributeMapping;
import org.eclectic.frontend.mappings.AttributeModifier;
import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.AttributeRightPart;
import org.eclectic.frontend.mappings.C2CModifier;
import org.eclectic.frontend.mappings.Class2Class;
import org.eclectic.frontend.mappings.ClassDef;
import org.eclectic.frontend.mappings.ClassMapping;
import org.eclectic.frontend.mappings.ClassRef;
import org.eclectic.frontend.mappings.Context;
import org.eclectic.frontend.mappings.ConvertModifier;
import org.eclectic.frontend.mappings.Converter;
import org.eclectic.frontend.mappings.DefaultValue;
import org.eclectic.frontend.mappings.Delegate;
import org.eclectic.frontend.mappings.EqualityFilter;
import org.eclectic.frontend.mappings.Feature2Feature;
import org.eclectic.frontend.mappings.FeatureRef;
import org.eclectic.frontend.mappings.FeatureIsLiteral;
import org.eclectic.frontend.mappings.FeatureIsString;
import org.eclectic.frontend.mappings.IntDefaultValue;
import org.eclectic.frontend.mappings.Join;
import org.eclectic.frontend.mappings.LinkedBy;
import org.eclectic.frontend.mappings.MappingCardinality;
import org.eclectic.frontend.mappings.MappingElement;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.frontend.mappings.MappingVariable;
import org.eclectic.frontend.mappings.MappingsFactory;
import org.eclectic.frontend.mappings.MappingsPackage;
import org.eclectic.frontend.mappings.MatchedElement;
import org.eclectic.frontend.mappings.MetamodelElementRef;
import org.eclectic.frontend.mappings.Modifier;
import org.eclectic.frontend.mappings.Operator;
import org.eclectic.frontend.mappings.Reference2Reference;
import org.eclectic.frontend.mappings.ReferenceRef;
import org.eclectic.frontend.mappings.RelatedBy;
import org.eclectic.frontend.mappings.Section;
import org.eclectic.frontend.mappings.Split;

import org.eclectic.frontend.mappings.Tag;
import org.eclectic.frontend.patterns.PatternsPackage;
import org.eclectic.frontend.patterns.impl.PatternsPackageImpl;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.facilities.FacilitiesPackage;
import org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl;
import org.eclectic.frontend.qool.impl.QoolPackageImpl;
import org.eclectic.frontend.script.ScriptPackage;

import org.eclectic.frontend.script.impl.ScriptPackageImpl;

import org.eclectic.frontend.tao.TaoPackage;
import org.eclectic.frontend.tao.impl.TaoPackageImpl;
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
public class MappingsPackageImpl extends EPackageImpl implements MappingsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feature2FeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRightPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeIsStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeIsBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeIsDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeIsResolveLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeIsIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass converterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c2CModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute2AttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reference2ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingCardinalityEEnum = null;

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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingsPackageImpl() {
		super(eNS_URI, MappingsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingsPackage init() {
		if (isInited) return (MappingsPackage)EPackage.Registry.INSTANCE.getEPackage(MappingsPackage.eNS_URI);

		// Obtain or create and register package
		MappingsPackageImpl theMappingsPackage = (MappingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappingsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FrontendPackageImpl theFrontendPackage = (FrontendPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) instanceof FrontendPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FrontendPackage.eNS_URI) : FrontendPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		KoanPackageImpl theKoanPackage = (KoanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) instanceof KoanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KoanPackage.eNS_URI) : KoanPackage.eINSTANCE);
		AttributionPackageImpl theAttributionPackage = (AttributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) instanceof AttributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributionPackage.eNS_URI) : AttributionPackage.eINSTANCE);
		ImperativePackageImpl theImperativePackage = (ImperativePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) instanceof ImperativePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativePackage.eNS_URI) : ImperativePackage.eINSTANCE);
		ChainPackageImpl theChainPackage = (ChainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI) instanceof ChainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChainPackage.eNS_URI) : ChainPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		TaoPackageImpl theTaoPackage = (TaoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) instanceof TaoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaoPackage.eNS_URI) : TaoPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theMappingsPackage.createPackageContents();
		theFrontendPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theKoanPackage.createPackageContents();
		theAttributionPackage.createPackageContents();
		theImperativePackage.createPackageContents();
		theChainPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theTaoPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theMappingsPackage.initializePackageContents();
		theFrontendPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theKoanPackage.initializePackageContents();
		theAttributionPackage.initializePackageContents();
		theImperativePackage.initializePackageContents();
		theChainPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theTaoPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingsPackage.eNS_URI, theMappingsPackage);
		return theMappingsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingTransformation() {
		return mappingTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingTransformation_Delegates() {
		return (EReference)mappingTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingTransformation_Contexts() {
		return (EReference)mappingTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingVariable() {
		return mappingVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedElement() {
		return matchedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegate() {
		return delegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegate_Left() {
		return (EReference)delegateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegate_IsExternal() {
		return (EAttribute)delegateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegate_Module() {
		return (EReference)delegateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegate_LinkName() {
		return (EAttribute)delegateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegate_FeatureName() {
		return (EAttribute)delegateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegate_Tags() {
		return (EReference)delegateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Left() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Right() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Mappings() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Modifiers() {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Sections() {
		return (EReference)contextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Tags() {
		return (EReference)contextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_SectionType() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Mappings() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingElement() {
		return mappingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMapping() {
		return classMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature2Feature() {
		return feature2FeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature2Feature_LeftFeature() {
		return (EReference)feature2FeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature2Feature_Converter() {
		return (EReference)feature2FeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeMapping_Left() {
		return (EReference)attributeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeMapping_RightPart() {
		return (EReference)attributeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRightPart() {
		return attributeRightPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeIsString() {
		return attributeIsStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeIsString_StrValue() {
		return (EAttribute)attributeIsStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeIsBoolean() {
		return attributeIsBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeIsBoolean_BoolValue() {
		return (EAttribute)attributeIsBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeIsDouble() {
		return attributeIsDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeIsDouble_DoubleValue() {
		return (EAttribute)attributeIsDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeIsResolveLink() {
		return attributeIsResolveLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeIsResolveLink_ResolveLink() {
		return (EReference)attributeIsResolveLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeIsInteger() {
		return attributeIsIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeIsInteger_IntValue() {
		return (EAttribute)attributeIsIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConverter() {
		return converterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConverter_IsExternal() {
		return (EAttribute)converterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConverter_Module() {
		return (EReference)converterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConverter_ConverterName() {
		return (EAttribute)converterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass2Class() {
		return class2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass2Class_Cardinality() {
		return (EAttribute)class2ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass2Class_Modifiers() {
		return (EReference)class2ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass2Class_Left() {
		return (EReference)class2ClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass2Class_Right() {
		return (EReference)class2ClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass2Class_ScopedAttributes() {
		return (EReference)class2ClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC2CModifier() {
		return c2CModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedBy() {
		return relatedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedBy_Attribute() {
		return (EReference)relatedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkedBy() {
		return linkedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedBy_Attribute() {
		return (EReference)linkedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedBy_LinkedElement() {
		return (EReference)linkedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityFilter() {
		return equalityFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityFilter_Attribute() {
		return (EReference)equalityFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualityFilter_Filter() {
		return (EAttribute)equalityFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Mappings() {
		return (EReference)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Mappings() {
		return (EReference)joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute2Attribute() {
		return attribute2AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute2Attribute_Cardinality() {
		return (EAttribute)attribute2AttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute2Attribute_Context() {
		return (EReference)attribute2AttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute2Attribute_Right() {
		return (EReference)attribute2AttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute2Attribute_Modifiers() {
		return (EReference)attribute2AttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference2Reference() {
		return reference2ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference2Reference_Cardinality() {
		return (EAttribute)reference2ReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference2Reference_Left() {
		return (EReference)reference2ReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference2Reference_Right() {
		return (EReference)reference2ReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference2Reference_ResolverName() {
		return (EAttribute)reference2ReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeModifier() {
		return attributeModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvertModifier() {
		return convertModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvertModifier_Converter() {
		return (EAttribute)convertModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValue() {
		return defaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntDefaultValue() {
		return intDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntDefaultValue_DefaultValue() {
		return (EAttribute)intDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElementRef() {
		return metamodelElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassRef() {
		return classRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassRef_Klass() {
		return (EReference)classRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureRef() {
		return featureRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureRef_ReferredElement() {
		return (EReference)featureRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureRef_FeatureName() {
		return (EAttribute)featureRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureRef_Multivalued() {
		return (EAttribute)featureRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRef() {
		return attributeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeRef_ReferredElement() {
		return (EReference)attributeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeRef_FeatureName() {
		return (EAttribute)attributeRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeRef_Multivalued() {
		return (EAttribute)attributeRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceRef() {
		return referenceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceRef_ReferredElement() {
		return (EReference)referenceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceRef_FeatureName() {
		return (EAttribute)referenceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceRef_Multivalued() {
		return (EAttribute)referenceRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMappingCardinality() {
		return mappingCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingsFactory getMappingsFactory() {
		return (MappingsFactory)getEFactoryInstance();
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
		mappingTransformationEClass = createEClass(MAPPING_TRANSFORMATION);
		createEReference(mappingTransformationEClass, MAPPING_TRANSFORMATION__DELEGATES);
		createEReference(mappingTransformationEClass, MAPPING_TRANSFORMATION__CONTEXTS);

		mappingVariableEClass = createEClass(MAPPING_VARIABLE);

		matchedElementEClass = createEClass(MATCHED_ELEMENT);

		delegateEClass = createEClass(DELEGATE);
		createEReference(delegateEClass, DELEGATE__LEFT);
		createEAttribute(delegateEClass, DELEGATE__IS_EXTERNAL);
		createEReference(delegateEClass, DELEGATE__MODULE);
		createEAttribute(delegateEClass, DELEGATE__LINK_NAME);
		createEAttribute(delegateEClass, DELEGATE__FEATURE_NAME);
		createEReference(delegateEClass, DELEGATE__TAGS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__LEFT);
		createEReference(contextEClass, CONTEXT__RIGHT);
		createEReference(contextEClass, CONTEXT__MAPPINGS);
		createEReference(contextEClass, CONTEXT__MODIFIERS);
		createEReference(contextEClass, CONTEXT__SECTIONS);
		createEReference(contextEClass, CONTEXT__TAGS);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__SECTION_TYPE);
		createEReference(sectionEClass, SECTION__MAPPINGS);

		mappingElementEClass = createEClass(MAPPING_ELEMENT);

		classMappingEClass = createEClass(CLASS_MAPPING);

		feature2FeatureEClass = createEClass(FEATURE2_FEATURE);
		createEReference(feature2FeatureEClass, FEATURE2_FEATURE__LEFT_FEATURE);
		createEReference(feature2FeatureEClass, FEATURE2_FEATURE__CONVERTER);

		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);
		createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__LEFT);
		createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__RIGHT_PART);

		attributeRightPartEClass = createEClass(ATTRIBUTE_RIGHT_PART);

		attributeIsStringEClass = createEClass(ATTRIBUTE_IS_STRING);
		createEAttribute(attributeIsStringEClass, ATTRIBUTE_IS_STRING__STR_VALUE);

		attributeIsBooleanEClass = createEClass(ATTRIBUTE_IS_BOOLEAN);
		createEAttribute(attributeIsBooleanEClass, ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE);

		attributeIsDoubleEClass = createEClass(ATTRIBUTE_IS_DOUBLE);
		createEAttribute(attributeIsDoubleEClass, ATTRIBUTE_IS_DOUBLE__DOUBLE_VALUE);

		attributeIsResolveLinkEClass = createEClass(ATTRIBUTE_IS_RESOLVE_LINK);
		createEReference(attributeIsResolveLinkEClass, ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK);

		attributeIsIntegerEClass = createEClass(ATTRIBUTE_IS_INTEGER);
		createEAttribute(attributeIsIntegerEClass, ATTRIBUTE_IS_INTEGER__INT_VALUE);

		converterEClass = createEClass(CONVERTER);
		createEAttribute(converterEClass, CONVERTER__IS_EXTERNAL);
		createEReference(converterEClass, CONVERTER__MODULE);
		createEAttribute(converterEClass, CONVERTER__CONVERTER_NAME);

		tagEClass = createEClass(TAG);

		class2ClassEClass = createEClass(CLASS2_CLASS);
		createEAttribute(class2ClassEClass, CLASS2_CLASS__CARDINALITY);
		createEReference(class2ClassEClass, CLASS2_CLASS__MODIFIERS);
		createEReference(class2ClassEClass, CLASS2_CLASS__LEFT);
		createEReference(class2ClassEClass, CLASS2_CLASS__RIGHT);
		createEReference(class2ClassEClass, CLASS2_CLASS__SCOPED_ATTRIBUTES);

		c2CModifierEClass = createEClass(C2C_MODIFIER);

		relatedByEClass = createEClass(RELATED_BY);
		createEReference(relatedByEClass, RELATED_BY__ATTRIBUTE);

		linkedByEClass = createEClass(LINKED_BY);
		createEReference(linkedByEClass, LINKED_BY__ATTRIBUTE);
		createEReference(linkedByEClass, LINKED_BY__LINKED_ELEMENT);

		equalityFilterEClass = createEClass(EQUALITY_FILTER);
		createEReference(equalityFilterEClass, EQUALITY_FILTER__ATTRIBUTE);
		createEAttribute(equalityFilterEClass, EQUALITY_FILTER__FILTER);

		operatorEClass = createEClass(OPERATOR);

		splitEClass = createEClass(SPLIT);
		createEReference(splitEClass, SPLIT__MAPPINGS);

		joinEClass = createEClass(JOIN);
		createEReference(joinEClass, JOIN__MAPPINGS);

		attribute2AttributeEClass = createEClass(ATTRIBUTE2_ATTRIBUTE);
		createEAttribute(attribute2AttributeEClass, ATTRIBUTE2_ATTRIBUTE__CARDINALITY);
		createEReference(attribute2AttributeEClass, ATTRIBUTE2_ATTRIBUTE__CONTEXT);
		createEReference(attribute2AttributeEClass, ATTRIBUTE2_ATTRIBUTE__RIGHT);
		createEReference(attribute2AttributeEClass, ATTRIBUTE2_ATTRIBUTE__MODIFIERS);

		reference2ReferenceEClass = createEClass(REFERENCE2_REFERENCE);
		createEAttribute(reference2ReferenceEClass, REFERENCE2_REFERENCE__CARDINALITY);
		createEReference(reference2ReferenceEClass, REFERENCE2_REFERENCE__LEFT);
		createEReference(reference2ReferenceEClass, REFERENCE2_REFERENCE__RIGHT);
		createEAttribute(reference2ReferenceEClass, REFERENCE2_REFERENCE__RESOLVER_NAME);

		modifierEClass = createEClass(MODIFIER);

		attributeModifierEClass = createEClass(ATTRIBUTE_MODIFIER);

		convertModifierEClass = createEClass(CONVERT_MODIFIER);
		createEAttribute(convertModifierEClass, CONVERT_MODIFIER__CONVERTER);

		defaultValueEClass = createEClass(DEFAULT_VALUE);

		intDefaultValueEClass = createEClass(INT_DEFAULT_VALUE);
		createEAttribute(intDefaultValueEClass, INT_DEFAULT_VALUE__DEFAULT_VALUE);

		metamodelElementRefEClass = createEClass(METAMODEL_ELEMENT_REF);

		classRefEClass = createEClass(CLASS_REF);
		createEReference(classRefEClass, CLASS_REF__KLASS);

		featureRefEClass = createEClass(FEATURE_REF);
		createEReference(featureRefEClass, FEATURE_REF__REFERRED_ELEMENT);
		createEAttribute(featureRefEClass, FEATURE_REF__FEATURE_NAME);
		createEAttribute(featureRefEClass, FEATURE_REF__MULTIVALUED);

		attributeRefEClass = createEClass(ATTRIBUTE_REF);
		createEReference(attributeRefEClass, ATTRIBUTE_REF__REFERRED_ELEMENT);
		createEAttribute(attributeRefEClass, ATTRIBUTE_REF__FEATURE_NAME);
		createEAttribute(attributeRefEClass, ATTRIBUTE_REF__MULTIVALUED);

		referenceRefEClass = createEClass(REFERENCE_REF);
		createEReference(referenceRefEClass, REFERENCE_REF__REFERRED_ELEMENT);
		createEAttribute(referenceRefEClass, REFERENCE_REF__FEATURE_NAME);
		createEAttribute(referenceRefEClass, REFERENCE_REF__MULTIVALUED);

		// Create enums
		mappingCardinalityEEnum = createEEnum(MAPPING_CARDINALITY);
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
		mappingTransformationEClass.getESuperTypes().add(theCorePackage.getTransformationDefinition());
		mappingVariableEClass.getESuperTypes().add(theCorePackage.getVariable());
		matchedElementEClass.getESuperTypes().add(theCorePackage.getClassUse());
		matchedElementEClass.getESuperTypes().add(this.getMappingVariable());
		delegateEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		contextEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		sectionEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		mappingElementEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		classMappingEClass.getESuperTypes().add(this.getMappingElement());
		feature2FeatureEClass.getESuperTypes().add(this.getMappingElement());
		attributeMappingEClass.getESuperTypes().add(this.getFeature2Feature());
		attributeIsStringEClass.getESuperTypes().add(this.getAttributeRightPart());
		attributeIsBooleanEClass.getESuperTypes().add(this.getAttributeRightPart());
		attributeIsDoubleEClass.getESuperTypes().add(this.getAttributeRightPart());
		attributeIsResolveLinkEClass.getESuperTypes().add(this.getAttributeRightPart());
		attributeIsIntegerEClass.getESuperTypes().add(this.getAttributeRightPart());
		tagEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		class2ClassEClass.getESuperTypes().add(this.getClassMapping());
		c2CModifierEClass.getESuperTypes().add(this.getMappingElement());
		relatedByEClass.getESuperTypes().add(this.getC2CModifier());
		linkedByEClass.getESuperTypes().add(this.getC2CModifier());
		equalityFilterEClass.getESuperTypes().add(this.getC2CModifier());
		operatorEClass.getESuperTypes().add(theCorePackage.getLocatedElement());
		splitEClass.getESuperTypes().add(this.getOperator());
		joinEClass.getESuperTypes().add(this.getOperator());
		attribute2AttributeEClass.getESuperTypes().add(this.getFeature2Feature());
		attribute2AttributeEClass.getESuperTypes().add(this.getAttributeRightPart());
		reference2ReferenceEClass.getESuperTypes().add(this.getFeature2Feature());
		attributeModifierEClass.getESuperTypes().add(this.getModifier());
		convertModifierEClass.getESuperTypes().add(this.getAttributeModifier());
		defaultValueEClass.getESuperTypes().add(this.getAttributeModifier());
		intDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());
		classRefEClass.getESuperTypes().add(this.getMetamodelElementRef());
		featureRefEClass.getESuperTypes().add(this.getMetamodelElementRef());
		featureRefEClass.getESuperTypes().add(this.getFeature2Feature());
		attributeRefEClass.getESuperTypes().add(this.getMetamodelElementRef());
		referenceRefEClass.getESuperTypes().add(this.getMetamodelElementRef());

		// Initialize classes and features; add operations and parameters
		initEClass(mappingTransformationEClass, MappingTransformation.class, "MappingTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingTransformation_Delegates(), this.getDelegate(), null, "delegates", null, 0, -1, MappingTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingTransformation_Contexts(), this.getContext(), null, "contexts", null, 0, -1, MappingTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingVariableEClass, MappingVariable.class, "MappingVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchedElementEClass, MatchedElement.class, "MatchedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delegateEClass, Delegate.class, "Delegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegate_Left(), this.getMatchedElement(), null, "left", null, 0, -1, Delegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegate_IsExternal(), ecorePackage.getEBooleanObject(), "isExternal", "false", 1, 1, Delegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegate_Module(), theCorePackage.getUseDeclaration(), null, "module", null, 0, 1, Delegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegate_LinkName(), ecorePackage.getEString(), "linkName", null, 1, 1, Delegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegate_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Delegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegate_Tags(), this.getTag(), null, "tags", null, 0, -1, Delegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Left(), this.getMatchedElement(), null, "left", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Right(), this.getMatchedElement(), null, "right", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Mappings(), this.getMappingElement(), null, "mappings", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Modifiers(), this.getC2CModifier(), null, "modifiers", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Sections(), this.getSection(), null, "sections", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Tags(), this.getTag(), null, "tags", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_SectionType(), ecorePackage.getEString(), "sectionType", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Mappings(), this.getMappingElement(), null, "mappings", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingElementEClass, MappingElement.class, "MappingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingEClass, ClassMapping.class, "ClassMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feature2FeatureEClass, Feature2Feature.class, "Feature2Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature2Feature_LeftFeature(), this.getFeatureRef(), null, "leftFeature", null, 0, 1, Feature2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature2Feature_Converter(), this.getConverter(), null, "converter", null, 0, 1, Feature2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeMapping_Left(), this.getAttributeRef(), null, "left", null, 0, -1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeMapping_RightPart(), this.getAttributeRightPart(), null, "rightPart", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRightPartEClass, AttributeRightPart.class, "AttributeRightPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeIsStringEClass, AttributeIsString.class, "AttributeIsString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeIsString_StrValue(), ecorePackage.getEString(), "strValue", null, 1, 1, AttributeIsString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeIsBooleanEClass, AttributeIsBoolean.class, "AttributeIsBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeIsBoolean_BoolValue(), ecorePackage.getEBooleanObject(), "boolValue", null, 1, 1, AttributeIsBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeIsDoubleEClass, AttributeIsDouble.class, "AttributeIsDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeIsDouble_DoubleValue(), ecorePackage.getEDoubleObject(), "doubleValue", null, 1, 1, AttributeIsDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeIsResolveLinkEClass, AttributeIsResolveLink.class, "AttributeIsResolveLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeIsResolveLink_ResolveLink(), theCorePackage.getResolveLink(), null, "resolveLink", null, 1, 1, AttributeIsResolveLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeIsIntegerEClass, AttributeIsInteger.class, "AttributeIsInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeIsInteger_IntValue(), ecorePackage.getEInt(), "intValue", null, 1, 1, AttributeIsInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(converterEClass, Converter.class, "Converter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConverter_IsExternal(), ecorePackage.getEBooleanObject(), "isExternal", "false", 1, 1, Converter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConverter_Module(), theCorePackage.getUseDeclaration(), null, "module", null, 0, 1, Converter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConverter_ConverterName(), ecorePackage.getEString(), "converterName", null, 1, 1, Converter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class2ClassEClass, Class2Class.class, "Class2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass2Class_Cardinality(), this.getMappingCardinality(), "cardinality", "0", 1, 1, Class2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass2Class_Modifiers(), this.getC2CModifier(), null, "modifiers", null, 0, -1, Class2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass2Class_Left(), this.getClassRef(), null, "left", null, 1, -1, Class2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass2Class_Right(), this.getClassRef(), null, "right", null, 1, -1, Class2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass2Class_ScopedAttributes(), this.getAttribute2Attribute(), this.getAttribute2Attribute_Context(), "scopedAttributes", null, 0, -1, Class2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c2CModifierEClass, C2CModifier.class, "C2CModifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relatedByEClass, RelatedBy.class, "RelatedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedBy_Attribute(), this.getAttributeRef(), null, "attribute", null, 1, 1, RelatedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkedByEClass, LinkedBy.class, "LinkedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkedBy_Attribute(), this.getAttributeRef(), null, "attribute", null, 1, 1, LinkedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkedBy_LinkedElement(), this.getMatchedElement(), null, "linkedElement", null, 1, 1, LinkedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalityFilterEClass, EqualityFilter.class, "EqualityFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEqualityFilter_Attribute(), this.getAttributeRef(), null, "attribute", null, 1, 1, EqualityFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqualityFilter_Filter(), ecorePackage.getEString(), "filter", null, 1, 1, EqualityFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplit_Mappings(), this.getClassMapping(), null, "mappings", null, 0, -1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoin_Mappings(), this.getClassMapping(), null, "mappings", null, 0, -1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attribute2AttributeEClass, Attribute2Attribute.class, "Attribute2Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute2Attribute_Cardinality(), this.getMappingCardinality(), "cardinality", null, 1, 1, Attribute2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute2Attribute_Context(), this.getClass2Class(), this.getClass2Class_ScopedAttributes(), "context", null, 0, 1, Attribute2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute2Attribute_Right(), this.getAttributeRef(), null, "right", null, 1, -1, Attribute2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute2Attribute_Modifiers(), this.getAttributeModifier(), null, "modifiers", null, 0, -1, Attribute2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reference2ReferenceEClass, Reference2Reference.class, "Reference2Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference2Reference_Cardinality(), this.getMappingCardinality(), "cardinality", null, 1, 1, Reference2Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference2Reference_Left(), this.getReferenceRef(), null, "left", null, 0, -1, Reference2Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference2Reference_Right(), this.getReferenceRef(), null, "right", null, 1, -1, Reference2Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference2Reference_ResolverName(), ecorePackage.getEString(), "resolverName", null, 0, 1, Reference2Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeModifierEClass, AttributeModifier.class, "AttributeModifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convertModifierEClass, ConvertModifier.class, "ConvertModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConvertModifier_Converter(), ecorePackage.getEString(), "converter", null, 1, 1, ConvertModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intDefaultValueEClass, IntDefaultValue.class, "IntDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntDefaultValue_DefaultValue(), ecorePackage.getEIntegerObject(), "defaultValue", null, 1, 1, IntDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementRefEClass, MetamodelElementRef.class, "MetamodelElementRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classRefEClass, ClassRef.class, "ClassRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassRef_Klass(), theCorePackage.getClassUse(), null, "klass", null, 1, 1, ClassRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureRefEClass, FeatureRef.class, "FeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureRef_ReferredElement(), this.getMatchedElement(), null, "referredElement", null, 1, 1, FeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureRef_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureRef_Multivalued(), ecorePackage.getEBoolean(), "multivalued", "false", 1, 1, FeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRefEClass, AttributeRef.class, "AttributeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeRef_ReferredElement(), this.getMatchedElement(), null, "referredElement", null, 1, 1, AttributeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeRef_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, AttributeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeRef_Multivalued(), ecorePackage.getEBoolean(), "multivalued", "false", 1, 1, AttributeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceRefEClass, ReferenceRef.class, "ReferenceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceRef_ReferredElement(), this.getMatchedElement(), null, "referredElement", null, 1, 1, ReferenceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceRef_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, ReferenceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceRef_Multivalued(), ecorePackage.getEBoolean(), "multivalued", "false", 1, 1, ReferenceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mappingCardinalityEEnum, MappingCardinality.class, "MappingCardinality");
		addEEnumLiteral(mappingCardinalityEEnum, MappingCardinality.ONE_TO_ONE);
		addEEnumLiteral(mappingCardinalityEEnum, MappingCardinality.NTO_ONE);
		addEEnumLiteral(mappingCardinalityEEnum, MappingCardinality.ONE_TO_N);
	}

} //MappingsPackageImpl
