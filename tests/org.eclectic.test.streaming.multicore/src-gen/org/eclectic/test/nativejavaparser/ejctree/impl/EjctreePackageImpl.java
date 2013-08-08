/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree.impl;

import org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl;
import org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit;
import org.eclectic.test.nativejavaparser.ejctree.EJCIdent;
import org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl;
import org.eclectic.test.nativejavaparser.ejctree.EJCTree;
import org.eclectic.test.nativejavaparser.ejctree.EjctreeFactory;
import org.eclectic.test.nativejavaparser.ejctree.EjctreePackage;

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
public class EjctreePackageImpl extends EPackageImpl implements EjctreePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejcTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejcCompilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejcClassDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejcMethodDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejcIdentEClass = null;

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
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EjctreePackageImpl() {
		super(eNS_URI, EjctreeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EjctreePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EjctreePackage init() {
		if (isInited) return (EjctreePackage)EPackage.Registry.INSTANCE.getEPackage(EjctreePackage.eNS_URI);

		// Obtain or create and register package
		EjctreePackageImpl theEjctreePackage = (EjctreePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EjctreePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EjctreePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEjctreePackage.createPackageContents();

		// Initialize created meta-data
		theEjctreePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEjctreePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EjctreePackage.eNS_URI, theEjctreePackage);
		return theEjctreePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJCTree() {
		return ejcTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCTree_ObjectId() {
		return (EAttribute)ejcTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJCCompilationUnit() {
		return ejcCompilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCCompilationUnit_SourceFile() {
		return (EAttribute)ejcCompilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEJCCompilationUnit_TypeDecls() {
		return (EReference)ejcCompilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJCClassDecl() {
		return ejcClassDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCClassDecl_QName() {
		return (EAttribute)ejcClassDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCClassDecl_SName() {
		return (EAttribute)ejcClassDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEJCClassDecl_ExtendingId() {
		return (EReference)ejcClassDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEJCClassDecl_Extending() {
		return (EReference)ejcClassDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEJCClassDecl_MethodDcls() {
		return (EReference)ejcClassDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJCMethodDecl() {
		return ejcMethodDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCMethodDecl_Name() {
		return (EAttribute)ejcMethodDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCMethodDecl_QName() {
		return (EAttribute)ejcMethodDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJCIdent() {
		return ejcIdentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJCIdent_Value() {
		return (EAttribute)ejcIdentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjctreeFactory getEjctreeFactory() {
		return (EjctreeFactory)getEFactoryInstance();
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
		ejcTreeEClass = createEClass(EJC_TREE);
		createEAttribute(ejcTreeEClass, EJC_TREE__OBJECT_ID);

		ejcCompilationUnitEClass = createEClass(EJC_COMPILATION_UNIT);
		createEAttribute(ejcCompilationUnitEClass, EJC_COMPILATION_UNIT__SOURCE_FILE);
		createEReference(ejcCompilationUnitEClass, EJC_COMPILATION_UNIT__TYPE_DECLS);

		ejcClassDeclEClass = createEClass(EJC_CLASS_DECL);
		createEAttribute(ejcClassDeclEClass, EJC_CLASS_DECL__QNAME);
		createEAttribute(ejcClassDeclEClass, EJC_CLASS_DECL__SNAME);
		createEReference(ejcClassDeclEClass, EJC_CLASS_DECL__EXTENDING_ID);
		createEReference(ejcClassDeclEClass, EJC_CLASS_DECL__EXTENDING);
		createEReference(ejcClassDeclEClass, EJC_CLASS_DECL__METHOD_DCLS);

		ejcMethodDeclEClass = createEClass(EJC_METHOD_DECL);
		createEAttribute(ejcMethodDeclEClass, EJC_METHOD_DECL__NAME);
		createEAttribute(ejcMethodDeclEClass, EJC_METHOD_DECL__QNAME);

		ejcIdentEClass = createEClass(EJC_IDENT);
		createEAttribute(ejcIdentEClass, EJC_IDENT__VALUE);
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
		ejcCompilationUnitEClass.getESuperTypes().add(this.getEJCTree());
		ejcClassDeclEClass.getESuperTypes().add(this.getEJCTree());
		ejcMethodDeclEClass.getESuperTypes().add(this.getEJCTree());
		ejcIdentEClass.getESuperTypes().add(this.getEJCTree());

		// Initialize classes and features; add operations and parameters
		initEClass(ejcTreeEClass, EJCTree.class, "EJCTree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJCTree_ObjectId(), ecorePackage.getEString(), "objectId", null, 1, 1, EJCTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejcCompilationUnitEClass, EJCCompilationUnit.class, "EJCCompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJCCompilationUnit_SourceFile(), ecorePackage.getEString(), "sourceFile", null, 1, 1, EJCCompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJCCompilationUnit_TypeDecls(), this.getEJCTree(), null, "typeDecls", null, 0, -1, EJCCompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejcClassDeclEClass, EJCClassDecl.class, "EJCClassDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJCClassDecl_QName(), ecorePackage.getEString(), "qName", null, 1, 1, EJCClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJCClassDecl_SName(), ecorePackage.getEString(), "sName", null, 1, 1, EJCClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJCClassDecl_ExtendingId(), this.getEJCIdent(), null, "extendingId", null, 0, 1, EJCClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJCClassDecl_Extending(), this.getEJCClassDecl(), null, "extending", null, 0, 1, EJCClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJCClassDecl_MethodDcls(), this.getEJCMethodDecl(), null, "methodDcls", null, 0, -1, EJCClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejcMethodDeclEClass, EJCMethodDecl.class, "EJCMethodDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJCMethodDecl_Name(), ecorePackage.getEString(), "name", null, 1, 1, EJCMethodDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJCMethodDecl_QName(), ecorePackage.getEString(), "qName", null, 1, 1, EJCMethodDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejcIdentEClass, EJCIdent.class, "EJCIdent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJCIdent_Value(), ecorePackage.getEString(), "value", null, 1, 1, EJCIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EjctreePackageImpl
