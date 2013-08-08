package org.eclectic.streaming.fragments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclipse.emf.ecore.EPackage;

public class EmfFragmentFactory {
	
	private List<EPackage> pkgs;
	private EMFLoader loader;

	public EmfFragmentFactory(List<EPackage> pkgs) {
		this.pkgs = pkgs;
		this.loader  = new EMFLoader(new JavaListConverter());
	}
	
	public EmfFragment createFragment() {
		BasicEMFModel in;
		try {
			in = loader.emptyModelFromMemory(pkgs, "tmp_/input_model.xmi");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return new EmfFragment(in);		
	}
}
