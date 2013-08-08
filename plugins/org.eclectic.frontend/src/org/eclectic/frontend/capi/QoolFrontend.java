package org.eclectic.frontend.capi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.FrontEnd;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.QoolParseUtil;
import org.eclectic.frontend.QoolStandaloneSetup;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class QoolFrontend<R> implements FrontEnd<XtextResource, R> {

	private MiddleEnd<QoolTransformation, R> next;

	public QoolFrontend(MiddleEnd<QoolTransformation, R> next) {
		this.next = next;
	}

	@Override
	public R compile(String path) throws EclecticException {
		try {
			return compile(path, new FileInputStream(path));
		} catch (FileNotFoundException e) {
			throw new EclecticException(e);
		}
	}
	
	public R compile(String path, InputStream qoolS) throws EclecticException {
		XtextResource r = parse(path, qoolS);
		QoolTransformation t = (QoolTransformation) r.getContents().get(0);

		// TODO: DUPLICATED WITH KOANFRONTEND: MERGE
		if ( r.getErrors().size() > 0 ) {
			String str = "";
			EList<Diagnostic> errors = r.getErrors();
			for (Diagnostic diagnostic : errors) {
				str = str + diagnostic.toString() + "\n";
			}
			throw new EclecticException("Syntax errors: " + str);
		}
		
		// Set the path. For the moment I traverse every element so as not
		// to implement a complicated getFile() method
		
		FrontendUtil.setFilePathToElements(path, t);
		
		return next.compile(t);
	}

	@Override
	public MiddleEnd<QoolTransformation, R> getMiddleEnd() {
		return next;
	}

	@Override
	public XtextResource parse(String path, InputStream qoolS) throws EclecticException {
		// Injector injector = new QoolStandaloneSetup().createInjectorAndDoEMFRegistration();		
		Injector injector = Guice.createInjector(new org.eclectic.frontend.QoolRuntimeModule());
		try {
			return new QoolParseUtil().parseFile(path, qoolS, injector);
		} catch (Exception e) {
			throw new EclecticException(e);
		}
	}

}
