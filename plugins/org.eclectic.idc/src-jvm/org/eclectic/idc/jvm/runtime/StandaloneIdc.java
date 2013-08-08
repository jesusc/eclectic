package org.eclectic.idc.jvm.runtime;

import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.jvmgen.ApidescFactoryJVMGen;
import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.jvmgen.CoreFactoryJVMGen;
import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.jvmgen.InstrFactoryJVMGen;
import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.jvmgen.QoolFactoryJVMGen;
import org.eclectic.idc.scheduling.SchedulingPackage;
import org.eclectic.idc.scheduling.jvmgen.SchedulingFactoryJVMGen;
import org.eclipse.emf.ecore.EPackage;

public class StandaloneIdc {
	public static void init() {
		// Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		CorePackage.eINSTANCE.setEFactoryInstance(new CoreFactoryJVMGen());
		InstrPackage.eINSTANCE.setEFactoryInstance(new InstrFactoryJVMGen());
		QoolPackage.eINSTANCE.setEFactoryInstance(new QoolFactoryJVMGen());
		SchedulingPackage.eINSTANCE.setEFactoryInstance(new SchedulingFactoryJVMGen());
		
		ApidescPackage.eINSTANCE.setEFactoryInstance(new ApidescFactoryJVMGen());
		
		
		EPackage.Registry.INSTANCE.put(ApidescPackage.eNS_URI, ApidescPackage.eINSTANCE);
		
		/*
		RegistryDescriptor core = new RegistryDescriptor(CorePackage.eINSTANCE, new CoreFactoryJVMGen());		
		EPackage.Registry.INSTANCE.put(core.getURI(), core);
		*/
	}
	
	
}
