package org.eclectic.frontend.capi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.FrontEnd;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.ScriptParseUtil;
import org.eclectic.frontend.ScriptStandaloneSetup;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.script.ScriptedTransformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class ScriptFrontend<R> implements FrontEnd<XtextResource, R> {

	private MiddleEnd<ScriptedTransformation, R> next;

	public ScriptFrontend(MiddleEnd<ScriptedTransformation, R> next) {
		this.next = next;
	}
	
	@Override
	public R compile(String path) throws EclecticException, IOException {
		XtextResource r = parse(path, new FileInputStream(path));
		ScriptedTransformation t = (ScriptedTransformation) r.getContents().get(0);

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
		path   = new File(path).getName();
		t.setFile(path);
		TreeIterator<EObject> contents = t.eAllContents();
		while ( contents.hasNext() ) {
			EObject o = contents.next();
			if ( o instanceof LocatedElement ) {
				((LocatedElement) o).setFile(path);
			}
		}
		
		
		return next.compile(t);
	}

	@Override
	public MiddleEnd<ScriptedTransformation, R> getMiddleEnd() {
		return next;
	}

	@Override
	public XtextResource parse(String path, InputStream stream) throws EclecticException, IOException {
		Injector injector = new ScriptStandaloneSetup().createInjectorAndDoEMFRegistration();		
		try {
			return new ScriptParseUtil().parseFile(path, stream, injector);
		} catch (Exception e) {
			throw new EclecticException(e);
		}
	}

}
