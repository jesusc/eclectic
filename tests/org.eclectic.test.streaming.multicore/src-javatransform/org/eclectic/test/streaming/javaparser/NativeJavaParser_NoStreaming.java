package org.eclectic.test.streaming.javaparser;

import org.eclectic.modeling.emf.BasicEMFModel;
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

public class NativeJavaParser_NoStreaming extends NativeJavaParser {

	private BasicEMFModel model;

	public NativeJavaParser_NoStreaming(BasicEMFModel model) {
		super(null);
		this.model = model;
	}
	
	@Override
	protected void setExtends(IStreamedFragment<EObject, Annotation> fragment, EJCClassDecl clazz_t, JCIdent extendsClause) {
		EJCIdent ident = createObject(fragment, EJCIdent.class);
		ident.setValue( extendsClause.getName().toString() );
		clazz_t.setExtendingId( ident );
	}
	
	@Override
	protected IStreamedFragment<EObject, Annotation> createNewFragment() {
		return new IStreamedFragment<EObject, Annotation>() {
			@Override
			public EObject createObject(String metaclassName) {
				return model.createObject(metaclassName);
			}
			@Override
			public EObject[] getObjects()        { throw new UnsupportedOperationException(); }
			@Override
			public EObject[] getProxyObjects()   { throw new UnsupportedOperationException(); }
			@Override
			public Annotation[] getAnnotations() { throw new UnsupportedOperationException(); }
			@Override
			public EObject createProxyObject(String metaclassName,
					EObject receptor, String featureName) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Annotation[] getProxyAnnotations() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
}
