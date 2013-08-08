package org.eclectic.frontend.capi;

import java.net.URISyntaxException;
import java.util.ArrayList;

import modelum.eclectic.runtime_scala.ModelBinding;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.OldIDCUtil;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.koan.KoanPackage;
import org.eclectic.frontend.script.ScriptedTransformation;
import org.eclectic.idc.IdcPackage;
import org.eclipse.emf.ecore.resource.Resource;

public class Script2IDC implements MiddleEnd<ScriptedTransformation, Resource> {

	@Override
	public Resource compile(ScriptedTransformation t) throws EclecticException {
		ScalaIDC s    = new ScalaIDC();
		// IDCExecutor r = s.compile(IDCUtil.loadIDCFromXMI("platform:/resource/modelum.eclectic.frontend/modelum/eclectic/frontend/koanidc/koan_v0.idc.xmi"));
		// IDCExecutor r = s.compile(IDCUtil.loadIDCFromXMI("../modelum.eclectic.frontend/src/modelum/eclectic/frontend/koanidc/koan_v0.idc.xmi"));
		IDCExecutor r;
		try {			
			r = s.compile(OldIDCUtil.loadIDCFromXMI(				
					ClassLoader.getSystemClassLoader().getResource("org/eclectic/frontend/koanidc/koan_v0.idc.xmi").toURI().toString() ));
		} catch (URISyntaxException e1) {
			throw new EclecticException(e1);
		} catch (EclecticException e1) {
			throw new EclecticException(e1);
		}
		
		try {
			Resource result = OldIDCUtil.emptyIDC();
			ModelBinding source = IDCExecutor.newModel(KoanPackage.eINSTANCE.eResource(), t.eResource());
			// ModelBinding target = IDCExecutor.newModel(IdcPackage.eINSTANCE.eResource(), result);
			ModelBinding target = IDCExecutor.newModel(IdcPackage.eINSTANCE.eResource(), result);
			
			ArrayList<ModelBinding> l = new ArrayList<ModelBinding>();
			l.add(source); 
			l.add(target);

			r.execute(l);
			return result;
		} catch (Exception e) {
			throw new EclecticException(e);
		}
	}

}
