package org.eclectic.frontend.capi;

import java.io.InputStream;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.FrontEnd;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.AttributionParseUtil;
import org.eclectic.frontend.AttributionStandaloneSetup;
import org.eclectic.frontend.attribution.AttributionTransformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class AttributionFrontend<R> implements FrontEnd<XtextResource, R> {

	private MiddleEnd<AttributionTransformation, R> next;

	public AttributionFrontend(MiddleEnd<AttributionTransformation, R> next) {
		this.next = next;
	}
	
	@Override
	public R compile(String path) throws EclecticException {
		XtextResource r = parse(path, null);
		AttributionTransformation t = (AttributionTransformation) r.getContents().get(0);

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
	public MiddleEnd<AttributionTransformation, R> getMiddleEnd() {
		return next;
	}

	@Override
	public XtextResource parse(String path, InputStream s) throws EclecticException {
		Injector injector = new AttributionStandaloneSetup().createInjectorAndDoEMFRegistration();		
		try {
			return new AttributionParseUtil().parseFile(path, injector);
		} catch (Exception e) {
			throw new EclecticException(e);
		}
	}

}
