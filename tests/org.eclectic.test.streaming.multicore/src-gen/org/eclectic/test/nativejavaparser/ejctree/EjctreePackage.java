/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree;

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
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreeFactory
 * @model kind="package"
 * @generated
 */
public interface EjctreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ejctree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/streaming/emf_java_compiler_tree";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emf_java_compiler_tree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjctreePackage eINSTANCE = org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCTreeImpl <em>EJC Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCTreeImpl
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCTree()
	 * @generated
	 */
	int EJC_TREE = 0;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_TREE__OBJECT_ID = 0;

	/**
	 * The number of structural features of the '<em>EJC Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_TREE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCCompilationUnitImpl <em>EJC Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCCompilationUnitImpl
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCCompilationUnit()
	 * @generated
	 */
	int EJC_COMPILATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_COMPILATION_UNIT__OBJECT_ID = EJC_TREE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_COMPILATION_UNIT__SOURCE_FILE = EJC_TREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_COMPILATION_UNIT__TYPE_DECLS = EJC_TREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EJC Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_COMPILATION_UNIT_FEATURE_COUNT = EJC_TREE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl <em>EJC Class Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCClassDecl()
	 * @generated
	 */
	int EJC_CLASS_DECL = 2;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL__OBJECT_ID = EJC_TREE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL__QNAME = EJC_TREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL__SNAME = EJC_TREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extending Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL__EXTENDING_ID = EJC_TREE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL__EXTENDING = EJC_TREE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method Dcls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL__METHOD_DCLS = EJC_TREE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EJC Class Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_CLASS_DECL_FEATURE_COUNT = EJC_TREE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCMethodDeclImpl <em>EJC Method Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCMethodDeclImpl
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCMethodDecl()
	 * @generated
	 */
	int EJC_METHOD_DECL = 3;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_METHOD_DECL__OBJECT_ID = EJC_TREE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_METHOD_DECL__NAME = EJC_TREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_METHOD_DECL__QNAME = EJC_TREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EJC Method Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_METHOD_DECL_FEATURE_COUNT = EJC_TREE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCIdentImpl <em>EJC Ident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCIdentImpl
	 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCIdent()
	 * @generated
	 */
	int EJC_IDENT = 4;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_IDENT__OBJECT_ID = EJC_TREE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_IDENT__VALUE = EJC_TREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EJC Ident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJC_IDENT_FEATURE_COUNT = EJC_TREE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclectic.test.nativejavaparser.ejctree.EJCTree <em>EJC Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJC Tree</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCTree
	 * @generated
	 */
	EClass getEJCTree();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCTree#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCTree#getObjectId()
	 * @see #getEJCTree()
	 * @generated
	 */
	EAttribute getEJCTree_ObjectId();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit <em>EJC Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJC Compilation Unit</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit
	 * @generated
	 */
	EClass getEJCCompilationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getSourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source File</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getSourceFile()
	 * @see #getEJCCompilationUnit()
	 * @generated
	 */
	EAttribute getEJCCompilationUnit_SourceFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getTypeDecls <em>Type Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Decls</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getTypeDecls()
	 * @see #getEJCCompilationUnit()
	 * @generated
	 */
	EReference getEJCCompilationUnit_TypeDecls();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl <em>EJC Class Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJC Class Decl</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl
	 * @generated
	 */
	EClass getEJCClassDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getQName()
	 * @see #getEJCClassDecl()
	 * @generated
	 */
	EAttribute getEJCClassDecl_QName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getSName <em>SName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SName</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getSName()
	 * @see #getEJCClassDecl()
	 * @generated
	 */
	EAttribute getEJCClassDecl_SName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtendingId <em>Extending Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extending Id</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtendingId()
	 * @see #getEJCClassDecl()
	 * @generated
	 */
	EReference getEJCClassDecl_ExtendingId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtending <em>Extending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extending</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtending()
	 * @see #getEJCClassDecl()
	 * @generated
	 */
	EReference getEJCClassDecl_Extending();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getMethodDcls <em>Method Dcls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Dcls</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getMethodDcls()
	 * @see #getEJCClassDecl()
	 * @generated
	 */
	EReference getEJCClassDecl_MethodDcls();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl <em>EJC Method Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJC Method Decl</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl
	 * @generated
	 */
	EClass getEJCMethodDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getName()
	 * @see #getEJCMethodDecl()
	 * @generated
	 */
	EAttribute getEJCMethodDecl_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getQName()
	 * @see #getEJCMethodDecl()
	 * @generated
	 */
	EAttribute getEJCMethodDecl_QName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.nativejavaparser.ejctree.EJCIdent <em>EJC Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJC Ident</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCIdent
	 * @generated
	 */
	EClass getEJCIdent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.nativejavaparser.ejctree.EJCIdent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EJCIdent#getValue()
	 * @see #getEJCIdent()
	 * @generated
	 */
	EAttribute getEJCIdent_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjctreeFactory getEjctreeFactory();

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
		 * The meta object literal for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCTreeImpl <em>EJC Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCTreeImpl
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCTree()
		 * @generated
		 */
		EClass EJC_TREE = eINSTANCE.getEJCTree();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_TREE__OBJECT_ID = eINSTANCE.getEJCTree_ObjectId();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCCompilationUnitImpl <em>EJC Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCCompilationUnitImpl
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCCompilationUnit()
		 * @generated
		 */
		EClass EJC_COMPILATION_UNIT = eINSTANCE.getEJCCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Source File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_COMPILATION_UNIT__SOURCE_FILE = eINSTANCE.getEJCCompilationUnit_SourceFile();

		/**
		 * The meta object literal for the '<em><b>Type Decls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJC_COMPILATION_UNIT__TYPE_DECLS = eINSTANCE.getEJCCompilationUnit_TypeDecls();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl <em>EJC Class Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCClassDecl()
		 * @generated
		 */
		EClass EJC_CLASS_DECL = eINSTANCE.getEJCClassDecl();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_CLASS_DECL__QNAME = eINSTANCE.getEJCClassDecl_QName();

		/**
		 * The meta object literal for the '<em><b>SName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_CLASS_DECL__SNAME = eINSTANCE.getEJCClassDecl_SName();

		/**
		 * The meta object literal for the '<em><b>Extending Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJC_CLASS_DECL__EXTENDING_ID = eINSTANCE.getEJCClassDecl_ExtendingId();

		/**
		 * The meta object literal for the '<em><b>Extending</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJC_CLASS_DECL__EXTENDING = eINSTANCE.getEJCClassDecl_Extending();

		/**
		 * The meta object literal for the '<em><b>Method Dcls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJC_CLASS_DECL__METHOD_DCLS = eINSTANCE.getEJCClassDecl_MethodDcls();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCMethodDeclImpl <em>EJC Method Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCMethodDeclImpl
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCMethodDecl()
		 * @generated
		 */
		EClass EJC_METHOD_DECL = eINSTANCE.getEJCMethodDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_METHOD_DECL__NAME = eINSTANCE.getEJCMethodDecl_Name();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_METHOD_DECL__QNAME = eINSTANCE.getEJCMethodDecl_QName();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCIdentImpl <em>EJC Ident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EJCIdentImpl
		 * @see org.eclectic.test.nativejavaparser.ejctree.impl.EjctreePackageImpl#getEJCIdent()
		 * @generated
		 */
		EClass EJC_IDENT = eINSTANCE.getEJCIdent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJC_IDENT__VALUE = eINSTANCE.getEJCIdent_Value();

	}

} //EjctreePackage
