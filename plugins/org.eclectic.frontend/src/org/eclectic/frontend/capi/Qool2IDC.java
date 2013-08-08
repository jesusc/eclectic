package org.eclectic.frontend.capi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import modelum.eclectic.runtime_scala.ModelBinding;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.OldIDCUtil;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.idc.IdcPackage;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclipse.emf.ecore.resource.Resource;

public class Qool2IDC implements MiddleEnd<QoolTransformation, Resource> {

	@Override
	public Resource compile(QoolTransformation t) throws EclecticException {
		ScalaIDC s    = new ScalaIDC();
		// IDCExecutor r = s.compile(IDCUtil.loadIDCFromXMI("platform:/resource/modelum.eclectic.frontend/modelum/eclectic/frontend/koanidc/koan_v0.idc.xmi"));
		// IDCExecutor r = s.compile(IDCUtil.loadIDCFromXMI("../modelum.eclectic.frontend/src/modelum/eclectic/frontend/koanidc/koan_v0.idc.xmi"));
		IDCExecutor r;
		InputStream stream = null;
		try {		
			URL resource = getClass().getClassLoader().getResource("org/eclectic/frontend/koanidc/koan_v0.idc.xmi");
			stream = resource.openStream();
			r = s.compile(OldIDCUtil.loadIDCFromXMI(resource.toURI().toString(), stream));
			//System.out.println(ClassLoader.getSystemClassLoader());
			//System.out.println(getClass().getResource("org/eclectic/frontend/koanidc/koan_v0.idc.xmi"));
			//System.out.println(getClass().getClassLoader().getResource("org/eclectic/frontend/koanidc/koan_v0.idc.xmi"));
			//r = s.compile(IDCUtil.loadIDCFromXMI(
			//		ClassLoader.getSystemClassLoader().getResource("org/eclectic/frontend/koanidc/koan_v0.idc.xmi").toURI().toString() ));
		} catch (URISyntaxException e1) {
			throw new EclecticException(e1);
		} catch (EclecticException e1) {
			throw new EclecticException(e1);
		} catch (IOException e) {
			throw new EclecticException(e);
		} finally {
			if ( stream != null ) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		try {
			Resource result = OldIDCUtil.emptyIDC();
			ModelBinding source = IDCExecutor.newModel(QoolPackage.eINSTANCE.eResource(), t.eResource());
			// ModelBinding target = IDCExecutor.newModel(IdcPackage.eINSTANCE.eResource(), result);
			
			StandaloneIdc.init(); // TODO: This is because I cannot make the factory to get registered by the extension point!
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
