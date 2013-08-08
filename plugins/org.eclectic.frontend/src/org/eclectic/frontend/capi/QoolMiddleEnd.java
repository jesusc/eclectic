package org.eclectic.frontend.capi;

import idc.core.LocatedElement;

import java.io.IOException;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class QoolMiddleEnd<R> implements MiddleEnd<QoolTransformation, R>{

	private BackEnd<Resource, R> next;
	private QoolMiddleEndOptions options;

	public QoolMiddleEnd(BackEnd<Resource, R> b) {
		this(b, new QoolMiddleEndOptions());
	}

	public QoolMiddleEnd(BackEnd<Resource, R> b, QoolMiddleEndOptions options) {
		this.next = b;
		this.options = options;
	}
	
	@Override
	public R compile(QoolTransformation r) throws EclecticException {
		Qool2IDC k = new Qool2IDC();
		Resource idc = k.compile(r);
		
		if ( options.saveIntermediate != null ) {
			idc.setURI(URI.createFileURI(options.saveIntermediate));			
			try {
				/*
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put(XMIResourceImpl.OPTION_SCHEMA_LOCATION, true);
				*/
				idc.save(null);
			} catch (IOException e) {
				throw new EclecticException(e);
			}
		}
		
		if ( options.checkLocatedElements ) {
			TreeIterator<EObject> it = idc.getAllContents();
			while ( it.hasNext()) {
				EObject o = it.next();
				if ( o instanceof LocatedElement ) {
					LocatedElement l = (LocatedElement) o;
					if ( l.getFile() == null ) {
						throw new IllegalStateException("Element " + o + " without localization");
					}
				}
			}
		}
		
		return next.compile(idc);
	}

	public static class QoolMiddleEndOptions {
		public boolean checkLocatedElements = false;
		public String saveIntermediate = null;
	}
}
