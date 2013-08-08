package org.eclectic.test.streaming.javaparser;

import org.eclectic.modeling.emf.IStreamedFragment;
import org.eclectic.streamdesc.runtime.Annotation;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl;
import org.eclectic.test.nativejavaparser.ejctree.EJCIdent;
import org.eclipse.emf.ecore.EObject;

import com.sun.tools.javac.tree.JCTree.JCIdent;

public class NativeJavaParser_StreamingId extends NativeJavaParser {

	
	public NativeJavaParser_StreamingId(EmfFragmentFactory factory) {
		super(factory);
	}

	@Override
	protected void setExtends(IStreamedFragment<EObject, Annotation> fragment, EJCClassDecl clazz_t, JCIdent extendsClause) {
		EJCIdent ident = createObject(fragment, EJCIdent.class);
		ident.setValue( extendsClause.getName().toString() );
		clazz_t.setExtendingId( ident );
	}
}
