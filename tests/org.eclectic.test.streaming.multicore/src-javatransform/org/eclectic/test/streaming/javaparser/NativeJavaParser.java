package org.eclectic.test.streaming.javaparser;

import java.nio.charset.Charset;

import org.eclectic.modeling.emf.IStreamedFragment;
import org.eclectic.streamdesc.runtime.Annotation;
import org.eclectic.streaming.fragments.EmfFragment;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl;
import org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit;
import org.eclectic.test.nativejavaparser.ejctree.EJCIdent;
import org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl;
import org.eclectic.test.nativejavaparser.ejctree.EJCTree;
import org.eclectic.test.nativejavaparser.ejctree.EjctreeFactory;
import org.eclipse.emf.ecore.EObject;

import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.JCTree.JCClassDecl;
import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;
import com.sun.tools.javac.tree.JCTree.JCIdent;
import com.sun.tools.javac.tree.JCTree.JCMethodDecl;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;

public class NativeJavaParser {
	private JavacFileManager manager;
	private Context ctx;
	private EmfFragmentFactory factory;

	public NativeJavaParser(EmfFragmentFactory factory) {
		ctx = new Context();
		manager = new JavacFileManager(ctx, true, Charset.defaultCharset());
		this.factory = factory;
	}
	
	public JCCompilationUnit parse(String filename) {
		ctx = new Context();
		manager = new JavacFileManager(ctx, true, null);

		JavaCompiler       c = com.sun.tools.javac.main.JavaCompiler.instance(ctx);
		JCCompilationUnit cu = c.parse(manager.getFileForInput(filename));
		return cu;
	}
	
	public IStreamedFragment<EObject, Annotation> getFragment(JCCompilationUnit cu) {
		IStreamedFragment<EObject, Annotation> fragment = createNewFragment();
		// JCCompilationUnit cu = parse(file);
		
		EJCCompilationUnit cu_t = createObject(fragment, EJCCompilationUnit.class); // EjctreeFactory.eINSTANCE.createEJCCompilationUnit();
		cu_t.setSourceFile( cu.getSourceFile().getName() );
		
		List<JCTree> types = cu.getTypeDecls();
		for (JCTree clazzTree : types) {
			if ( clazzTree instanceof JCClassDecl) {
				JCClassDecl clazz = (JCClassDecl) clazzTree;						
				cu_t.getTypeDecls().add( mapClass(fragment, cu, clazz) );
			}	
		}
		
		return fragment;
	}

	protected IStreamedFragment<EObject, Annotation> createNewFragment() {
		return factory.createFragment();	
	}

	private EJCClassDecl mapClass(IStreamedFragment<EObject, Annotation> fragment, JCCompilationUnit cu, JCClassDecl clazz) {
		
		EJCClassDecl clazz_t = createObject(fragment, EJCClassDecl.class); // EjctreeFactory.eINSTANCE.createEJCClassDecl();
		
		// Naming
		clazz_t.setSName( clazz.getSimpleName().toString() );
		
		String pkgQualifier = cu.getPackageName() != null ? (cu.getPackageName().toString() + ".") : "";
		clazz_t.setQName( pkgQualifier + clazz.getSimpleName().toString() );
		
		// Map methods
		for(JCTree tm : clazz.getMembers()) {
			if ( tm instanceof JCMethodDecl ) {
				clazz_t.getMethodDcls().add( mapMethod(fragment, clazz, (JCMethodDecl) tm) );
			}
		}
		
		// Inheritance
		JCTree extendsClause = clazz.getExtendsClause();
		if ( extendsClause != null && extendsClause instanceof JCIdent ) { // You may get a JCFieldAccess for qualified Classes
			/*
			// Create the Id (in case we want to use id-based resolution)
			EJCIdent id = (EJCIdent) createObject(fragment, EJCIdent.class); // EjctreeFactory.eINSTANCE.createEJCIdent();
			id.setValue( extendsClause.toString() );
			clazz_t.setExtendingId( id );
			*/
		
			// Create a proxy (in case we want to use proxy-based resolution)
			setExtends(fragment, clazz_t, (JCIdent) extendsClause);
		}

		return clazz_t;
	}

	protected void setExtends(IStreamedFragment<EObject, Annotation> fragment, EJCClassDecl clazz_t, JCIdent extendsClause) {
		
		// Create a proxy (in case we want to use proxy-based resolution)
		JCIdent ident = (JCIdent) extendsClause;
		EJCClassDecl e = (EJCClassDecl) fragment.createProxyObject(EJCClassDecl.class.getSimpleName(), clazz_t, "extending");
		e.setSName(ident.toString());
		e.setQName("TODO!! RESOLVE IMPORT!!");		
	
		clazz_t.setExtending( e );
	}

	protected EJCMethodDecl mapMethod(IStreamedFragment<EObject, Annotation> fragment, JCClassDecl clazz, JCMethodDecl m) {
		EJCMethodDecl method_t = createObject(fragment, EJCMethodDecl.class);
		method_t.setName( m.getName().toString() );
		
		method_t.setQName( clazz.getSimpleName() + "#" + m.getName());
		return method_t;
	}

	protected <T> T createObject(IStreamedFragment<EObject, Annotation> fragment, Class<T> clazz) {
		EObject obj = fragment.createObject(clazz.getSimpleName());
		EJCTree t = (EJCTree) obj;
		t.setObjectId( System.identityHashCode(t) + "");
		return (T) obj;
	}
}
