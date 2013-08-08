package org.eclectic.frontend.capi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.FrontEnd;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.MappingsParseUtil;
import org.eclectic.frontend.MappingsStandaloneSetup;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class MappingsFrontend<R> implements FrontEnd<XtextResource, R> {

	private MiddleEnd<MappingTransformation, R> next;

	public MappingsFrontend(MiddleEnd<MappingTransformation, R> next) {
		this.next = next;
	}
	
	@Override
	public R compile(String path) throws EclecticException, IOException {
		XtextResource r = parse(path, new FileInputStream(path));
		MappingTransformation t = (MappingTransformation) r.getContents().get(0);

		// TODO: DUPLICATED WITH KOANFRONTEND: MERGE
		if ( r.getErrors().size() > 0 ) {
			String str = "";
			EList<Diagnostic> errors = r.getErrors();
			for (Diagnostic diagnostic : errors) {
				str = str + diagnostic.toString() + "\n";
			}
			throw new EclecticException("Syntax errors: " + str);
		}
		
		FrontendUtil.setFilePathToElements(path, t);
				
		return next.compile(t);
	}

	@Override
	public MiddleEnd<MappingTransformation, R> getMiddleEnd() {
		return next;
	}

	@Override
	public XtextResource parse(String path, InputStream s) throws EclecticException {
		Injector injector = new MappingsStandaloneSetup().createInjectorAndDoEMFRegistration();		
		try {
			return new MappingsParseUtil().parseFile(path, s, injector);
		} catch (Exception e) {
			throw new EclecticException(e);
		}
	}

}
