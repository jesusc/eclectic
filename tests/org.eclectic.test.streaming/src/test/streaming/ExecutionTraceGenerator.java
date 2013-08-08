package test.streaming;

import java.io.IOException;
import java.util.ArrayList;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.Util;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streaming.fragments.EmfFragment;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.streaming.fragments.FragmentEmitter;
import org.eclectic.streaming.fragments.StreamedEmfModel;
import org.eclectic.test.streaming.dtrace.Class;
import org.eclectic.test.streaming.dtrace.DTraceFactory;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.Instance;
import org.eclectic.test.streaming.dtrace.LocalExecution;
import org.eclectic.test.streaming.dtrace.MethodExecution;
import org.eclectic.test.streaming.dtrace.RemoteCall;
import org.eclectic.test.streaming.dtrace.RemoteMethodExecution;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import eclectic.dtrace2seq_diagrams;

public class ExecutionTraceGenerator extends AbstractTraceGenerator {
	
	
	public void feedTransformation(String modelName, dtrace2seq_diagrams transformation) {
		EmfFragmentFactory factory = getFactory();
		FragmentEmitter emitter = new FragmentEmitter(modelName, transformation);
		
		LocalClient localClient = new LocalClient(factory, emitter);
		RemoteServer remoteServer = new RemoteServer(factory, emitter);
		
		localClient.start();
		remoteServer.start();
		
		try {
			localClient.join();
			remoteServer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	class LocalClient extends Thread {
		private FragmentEmitter emitter;
		private EmfFragmentFactory factory;

		public LocalClient(EmfFragmentFactory factory, FragmentEmitter emitter) {
			this.factory = factory;
			this.emitter = emitter;
		}

		@Override
		public void run() {
			// Fragment #1
			EmfFragment fragment1 = factory.createFragment();
			LocalExecution initial = (LocalExecution) fragment1.createObject(LocalExecution.class.getSimpleName());
			initial.setMethodName("initial");
			
			final org.eclectic.test.streaming.dtrace.Class companyClass  = (Class) fragment1.createObject("Class");
			companyClass.setName("Company");

			Instance companyInstance1  = (Instance) fragment1.createObject("LocalInstance");
			companyInstance1.setObjectId(1);
			companyInstance1.setClazz(companyClass);
			LocalExecution Company_hire = (LocalExecution) fragment1.createObject(LocalExecution.class.getSimpleName());
			Company_hire.setNodeId(1);
			Company_hire.setTimestamp(1);
			Company_hire.setCaller(initial);
			Company_hire.setReceptor(companyInstance1);
			Company_hire.setMethodName("hire");

			emitter.sendFragment(fragment1);
			// transformation.receiveStreamedFragment(modelName, companyInstance1, Company_hire, companyClass);
			
			// Fragment #2			
			EmfFragment fragment2 = factory.createFragment();

			final org.eclectic.test.streaming.dtrace.Class employeeClass = (Class) fragment2.createObject("Class");
			employeeClass.setName("Employee");

			Instance employeeInstance1 = (Instance) fragment2.createObject("LocalInstance"); 
			employeeInstance1.setObjectId(2);
			employeeInstance1.setClazz(employeeClass);
			
			LocalExecution Employee_setSalary = (LocalExecution) fragment2.createObject(LocalExecution.class.getSimpleName());
			Employee_setSalary.setNodeId(1);
			Employee_setSalary.setTimestamp(2);
			Employee_setSalary.setReceptor(employeeInstance1);
			Employee_setSalary.setMethodName("setSalary");
			Employee_setSalary.setCaller( createReferencedValue(Company_hire) );

			// transformation.receiveStreamedFragment(modelName, employeeInstance1, Employee_setSalary, employeeClass);
			emitter.sendFragment(fragment2);

			// Fragment #3
			EmfFragment fragment3 = factory.createFragment();
			RemoteCall Persistence_saveEntity = (RemoteCall) fragment3.createObject(RemoteCall.class.getSimpleName());
			Persistence_saveEntity.setNodeId(1);
			Persistence_saveEntity.setTimestamp(3);
			// Persistence_saveEntity.setReceptor(persistenceInstance1);
			Persistence_saveEntity.setMethodName("saveEntity");
			Persistence_saveEntity.setCaller( createReferencedValue(Company_hire) );

			// transformation.receiveStreamedFragment(modelName, Persistence_saveEntity);
			emitter.sendFragment(fragment3);
		}

		private MethodExecution createReferencedValue(MethodExecution me) {
			return me;
		}
	}

	class RemoteServer extends Thread {
		private FragmentEmitter emitter;
		private EmfFragmentFactory factory;

		public RemoteServer(EmfFragmentFactory factory, FragmentEmitter emitter) {
			this.factory = factory;
			this.emitter = emitter;
		}
		
		@Override
		public void run() {
			EmfFragment fragment_server_1 = factory.createFragment();
			// Classes and instances
			final org.eclectic.test.streaming.dtrace.Class persistenceClass = (Class) fragment_server_1.createObject("Class");
			persistenceClass.setName("PersistenceCtx");

			// 
			Instance persistenceInstance1 = (Instance) fragment_server_1.createObject("LocalInstance"); 
			persistenceInstance1.setObjectId(3);
			persistenceInstance1.setClazz(persistenceClass);
						
			RemoteMethodExecution Persistence_saveEntity = (RemoteMethodExecution) fragment_server_1.createObject(RemoteMethodExecution.class.getSimpleName());
			Persistence_saveEntity.setNodeId(2);
			Persistence_saveEntity.setTimestamp(5);
			Persistence_saveEntity.setMethodName("saveEntity");
			Persistence_saveEntity.setClientNodeId(1);
			Persistence_saveEntity.setClientTimestamp(3);

			Persistence_saveEntity.setCaller( createRemoteCallProxy(fragment_server_1, Persistence_saveEntity) );
			
			Persistence_saveEntity.setReceptor(persistenceInstance1);

			// transformation.receiveStreamedFragment(modelName, persistenceInstance1, Persistence_saveEntity, persistenceClass);
			emitter.sendFragment(fragment_server_1);
			
		}

		private MethodExecution createRemoteCallProxy(EmfFragment fragment, RemoteMethodExecution rme) {
			RemoteCall rc = (RemoteCall) fragment.createProxyObject(RemoteCall.class.getSimpleName(), rme, "caller");
			rc.setNodeId( rme.getClientNodeId() );
			rc.setTimestamp( rme.getClientTimestamp());
			rc.setMethodName( rme.getMethodName() );
			
			return rc;
		}
	}

	
}
