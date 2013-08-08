/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.impl;

import org.eclectic.idc.DummyToCreateAPackage;
import org.eclectic.idc.IdcFactory;
import org.eclectic.idc.IdcPackage;

import org.eclectic.idc.core.CorePackage;

import org.eclectic.idc.core.impl.CorePackageImpl;

import org.eclectic.idc.ecl_meta.Ecl_metaPackage;

import org.eclectic.idc.ecl_meta.impl.Ecl_metaPackageImpl;

import org.eclectic.idc.extensions.ExtensionsPackage;
import org.eclectic.idc.extensions.impl.ExtensionsPackageImpl;
import org.eclectic.idc.instr.InstrPackage;

import org.eclectic.idc.instr.impl.InstrPackageImpl;


import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.impl.QoolPackageImpl;
import org.eclectic.idc.scheduling.SchedulingPackage;

import org.eclectic.idc.scheduling.impl.SchedulingPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdcPackageImpl extends EPackageImpl implements IdcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyToCreateAPackageEClass = null;

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
	 * @see org.eclectic.idc.IdcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdcPackageImpl() {
		super(eNS_URI, IdcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdcPackage init() {
		if (isInited) return (IdcPackage)EPackage.Registry.INSTANCE.getEPackage(IdcPackage.eNS_URI);

		// Obtain or create and register package
		IdcPackageImpl theIdcPackage = (IdcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IdcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IdcPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);
		QoolPackageImpl theQoolPackage = (QoolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) instanceof QoolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI) : QoolPackage.eINSTANCE);
		InstrPackageImpl theInstrPackage = (InstrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) instanceof InstrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI) : InstrPackage.eINSTANCE);
		SchedulingPackageImpl theSchedulingPackage = (SchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) instanceof SchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) : SchedulingPackage.eINSTANCE);
		Ecl_metaPackageImpl theEcl_metaPackage = (Ecl_metaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) instanceof Ecl_metaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) : Ecl_metaPackage.eINSTANCE);

		// Create package meta-data objects
		theIdcPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();
		theQoolPackage.createPackageContents();
		theInstrPackage.createPackageContents();
		theSchedulingPackage.createPackageContents();
		theEcl_metaPackage.createPackageContents();

		// Initialize created meta-data
		theIdcPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();
		theQoolPackage.initializePackageContents();
		theInstrPackage.initializePackageContents();
		theSchedulingPackage.initializePackageContents();
		theEcl_metaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdcPackage.eNS_URI, theIdcPackage);
		return theIdcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyToCreateAPackage() {
		return dummyToCreateAPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdcFactory getIdcFactory() {
		return (IdcFactory)getEFactoryInstance();
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
		dummyToCreateAPackageEClass = createEClass(DUMMY_TO_CREATE_APACKAGE);
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
		ExtensionsPackage theExtensionsPackage = (ExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI);
		QoolPackage theQoolPackage = (QoolPackage)EPackage.Registry.INSTANCE.getEPackage(QoolPackage.eNS_URI);
		InstrPackage theInstrPackage = (InstrPackage)EPackage.Registry.INSTANCE.getEPackage(InstrPackage.eNS_URI);
		SchedulingPackage theSchedulingPackage = (SchedulingPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI);
		Ecl_metaPackage theEcl_metaPackage = (Ecl_metaPackage)EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theExtensionsPackage);
		getESubpackages().add(theQoolPackage);
		getESubpackages().add(theInstrPackage);
		getESubpackages().add(theSchedulingPackage);
		getESubpackages().add(theEcl_metaPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dummyToCreateAPackageEClass, DummyToCreateAPackage.class, "DummyToCreateAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IdcPackageImpl
