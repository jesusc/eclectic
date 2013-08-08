package org.eclectic.frontend.capi;

import idc.core.LocatedElement;

import java.io.IOException;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.frontend.qoolinit.SeedQool2Idc;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class QoolMiddleEndInjava<R> implements MiddleEnd<QoolTransformation, R> {

	private BackEnd<Resource, R> next;
	private QoolMiddleEndInJavaOptions options;

	public QoolMiddleEndInjava(BackEnd<Resource, R> b) {
		this(b, new QoolMiddleEndInJavaOptions());
	}

	public QoolMiddleEndInjava(BackEnd<Resource, R> b, QoolMiddleEndInJavaOptions options) {
		this.next = b;
		this.options = options;
	}

	@Override
	public R compile(QoolTransformation r) throws EclecticException {
		BasicEMFModel src = null;
		BasicEMFModel tgt = null;
		
		try {
			StandaloneIdc.init(); // TODO: This is because I cannot make the factory to get registered by the extension point!

			EMFLoader emfLoader = new EMFLoader(null);
			src = emfLoader.basicModelFromMemory(
					QoolPackage.eINSTANCE, r.eResource());
			tgt = emfLoader.basicEmptyModelFromMemory(
					org.eclectic.idc.core.CorePackage.eINSTANCE.eResource(),
					options.saveIntermediate == null ? "inMemory"
							: options.saveIntermediate);

			System.out.println("Compiling with Qool - Java Version");
			SeedQool2Idc k = new SeedQool2Idc(src, tgt);
			k.transform();

			if (options.saveIntermediate != null) {
				tgt.serialize();
			}
		} catch (IOException e) {
			throw new EclecticException(e);
		}
		if (options.checkLocatedElements) {
			TreeIterator<EObject> it = tgt.getHandler().getResource()
					.getAllContents();
			while (it.hasNext()) {
				EObject o = it.next();
				if (o instanceof LocatedElement) {
					LocatedElement l = (LocatedElement) o;
					if (l.getFile() == null) {
						throw new IllegalStateException("Element " + o
								+ " without localization");
					}
				}
			}
		}

		tgt.getHandler().packRootElements();
		return next.compile(tgt.getHandler().getResource());
	}

	public static class QoolMiddleEndInJavaOptions {
		public boolean checkLocatedElements = false;
		public String saveIntermediate = null;
	}
}
