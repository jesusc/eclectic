package test.streaming;

import java.io.IOException;
import java.util.ArrayList;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.Util;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.streaming.fragments.StreamedEmfModel;
import org.eclectic.test.streaming.dtrace.DTraceFactory;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import eclectic.dtrace2seq_diagrams;

public abstract class AbstractTraceGenerator {
	public static DTraceFactory f = DTraceFactory.eINSTANCE;
	
	public IModel<?, ?> getModel(String streamDesc) throws IOException {
		JavaListConverter converter = new JavaListConverter();
		ResourceSetImpl rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(DTracePackage.eINSTANCE.getNsURI(), DTracePackage.eINSTANCE);
		Resource resource = rs.createResource( Util.createURI("tmp_/input_model.xmi") );

		ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(DTracePackage.eINSTANCE);

		EMFHandler handler = new EMFHandler(pkgs, resource);
		StreamDescription desc = (StreamDescription) new org.eclectic.streamdesc.StreamDescLanguageLoader().load(streamDesc);
		StreamedEmfModel model = new StreamedEmfModel(handler, desc, converter);
		
		return model;
	}
	
	public EmfFragmentFactory getFactory() {
		ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(DTracePackage.eINSTANCE);
		return new EmfFragmentFactory(pkgs);
	}


	public abstract void feedTransformation(String modelName, dtrace2seq_diagrams transformation);
}
