/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.extensions.impl;

import org.eclectic.idc.IdcPackage;

import org.eclectic.idc.core.CorePackage;

import org.eclectic.idc.core.impl.CorePackageImpl;

import org.eclectic.idc.ecl_meta.Ecl_metaPackage;

import org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl;

import org.eclectic.idc.extensions.Extension;
import org.eclectic.idc.extensions.ExtensionsFactory;
import org.eclectic.idc.extensions.ExtensionsPackage;
import org.eclectic.idc.extensions.PotencyExtension;

import org.eclectic.idc.impl.IdcPackageImpl;

import org.eclectic.idc.instr.InstrPackage;

import org.eclectic.idc.instr.impl.InstrPackageImpl;

import org.eclectic.idc.qool.QoolPackage;

import org.eclectic.idc.qool.impl.QoolPackageImpl;

import org.eclectic.idc.scheduling.SchedulingPackage;

import org.eclectic.idc.scheduling.impl.SchedulingPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionsPackageImpl extends EPackageImpl implements ExtensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potencyExtensionEClass = null;

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
	 * @see org.eclectic.idc.extensions.ExtensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionsPackageImpl() {
		super(eNS_URI, ExtensionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionsPackage init() {
		if (isInited) return (ExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IdcPackageImpl theIdcPackage = (IdcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) instanceof IdcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI) : IdcPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		InstrPackageImpl theInstrPackage = (InstrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) instanceof InstrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) : InstrPackage.eINSTANCE);
		SchedulingPackageImpl theSchedulingPackage = (SchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) instanceof SchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) : SchedulingPackage.eINSTANCE);
		Ecl_metaPackageImpl theEcl_metaPackage = (Ecl_metaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) instanceof Ecl_metaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) : Ecl_metaPackage.eINSTANCE);

		// Create package meta-data objects
		theExtensionsPackage.createPackageContents();
		theIdcPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theInstrPackage.createPackageContents();
		theSchedulingPackage.createPackageContents();
		theEcl_metaPackage.createPackageContents();

		// Initialize created meta-data
		theExtensionsPackage.initializePackageContents();
		theIdcPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theInstrPackage.initializePackageContents();
		theSchedulingPackage.initializePackageContents();
		theEcl_metaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtensionsPackage.eNS_URI, theExtensionsPackage);
		return theExtensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotencyExtension() {
		return potencyExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPotencyExtension_Potency() {
		return (EAttribute)potencyExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsFactory getExtensionsFactory() {
		return (ExtensionsFactory)getEFactoryInstance();
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
		extensionEClass = createEClass(EXTENSION);

		potencyExtensionEClass = createEClass(POTENCY_EXTENSION);
		createEAttribute(potencyExtensionEClass, POTENCY_EXTENSION__POTENCY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		potencyExtensionEClass.getESuperTypes().add(this.getExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(extensionEClass, Extension.class, "Extension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(potencyExtensionEClass, PotencyExtension.class, "PotencyExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPotencyExtension_Potency(), ecorePackage.getEIntegerObject(), "potency", null, 1, 1, PotencyExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ExtensionsPackageImpl
