package org.eclectic.frontend.capi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.FrontEnd;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.ChainParseUtil;
import org.eclectic.frontend.ChainStandaloneSetup;
import org.eclectic.frontend.chain.ChainTransformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;
public class ChainFrontend<R> implements FrontEnd<XtextResource, R> {

	private MiddleEnd<ChainTransformation, R> next;

	public ChainFrontend(MiddleEnd<ChainTransformation, R> next) {
		this.next = next;
	}
	
	@Override
	public R compile(String path) throws EclecticException, IOException {
		XtextResource r = parse(path, new FileInputStream(path));
		ChainTransformation t = (ChainTransformation) r.getContents().get(0);

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
	public MiddleEnd<ChainTransformation, R> getMiddleEnd() {
		return next;
	}

	@Override
	public XtextResource parse(String path, InputStream stream) throws EclecticException {
		Injector injector = new ChainStandaloneSetup().createInjectorAndDoEMFRegistration();		
		try {
			return new ChainParseUtil().parseFile(path, stream, injector);
		} catch (Exception e) {
			throw new EclecticException(e);
		}	
	}

}
