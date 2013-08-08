package test.streaming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclectic.streaming.fragments.EmfFragment;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.streaming.fragments.FragmentEmitter;
import org.eclectic.test.streaming.dtrace.Class;
import org.eclectic.test.streaming.dtrace.Instance;
import org.eclectic.test.streaming.dtrace.LocalExecution;
import org.eclectic.test.streaming.dtrace.MethodExecution;

import eclectic.dtrace2seq_diagrams;

public class ExecutionTraceSimulator extends AbstractTraceGenerator {

	private HashMap<java.lang.Class<?>, ArrayList<SystemObject>> createdInstances = new HashMap<java.lang.Class<?>, ArrayList<SystemObject>>();
	private static int LastId = 0;
	private static int MAX_SIZE = 100;
	
	public ExecutionTraceSimulator() {
		createdInstances.put(GUIFrontend.class, new ArrayList<SystemObject>());
		createdInstances.put(GUIWidget.class, new ArrayList<SystemObject>());
		createdInstances.put(Controller.class, new ArrayList<SystemObject>());
		createdInstances.put(DomainObject.class, new ArrayList<SystemObject>());
		createdInstances.put(Persistence.class, new ArrayList<SystemObject>());
		createdInstances.put(DBManager.class, new ArrayList<SystemObject>());
	}
	
	public class Triple<T1, T2, T3> {
		public T1 _1;
		public T2 _2;
		public T3 _3;
		public Triple(T1 v1, T2 v2, T3 v3) { _1 = v1; _2 = v2; _3 = v3; } 
	}
	
	public abstract class SystemObject {
		public final int id = LastId++;

		public Instance createInstance(EmfFragment frg) {
			final org.eclectic.test.streaming.dtrace.Class clazz  = (Class) frg.createObject("Class");
			clazz.setName(this.getClass().getSimpleName());	
			
			Instance instance  = (Instance) frg.createObject("LocalInstance");
			instance.setObjectId(id);
			instance.setClazz(clazz);

			return instance;
		}

		protected SystemObject retrieveSystemObject(double probCreateInstance, java.lang.Class<?> type) {
			boolean createNewSystemObject = randomNumber() < probCreateInstance ||
										createdInstances.get(type).isEmpty();
			SystemObject obj = null;
			
			if ( ! createNewSystemObject ) {
				obj = createdInstances.get(type).get((int) randomNumber() * createdInstances.get(type).size());
			} else {
				try {
					obj = (SystemObject) type.getConstructors()[0].newInstance(ExecutionTraceSimulator.this);
					// obj = (SystemObject) type.newInstance();
					createdInstances.get(type).add(obj);
				
					if ( createdInstances.get(type).size() > MAX_SIZE ) {
						createdInstances.get(type).remove(0);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}

			return obj;
		}
		
		public double randomNumber() {
			return Math.random();			
		}

		public MethodExecution createExecution(EmfFragment frg, Instance tgtInstance,
				MethodExecution lastMethodExecution) {

			LocalExecution me = (LocalExecution) frg.createObject(LocalExecution.class.getSimpleName());

			me.setNodeId(1);
			me.setTimestamp((int) System.currentTimeMillis()); // TODO: This is not going to work well.
			me.setMethodName(getMethodName());
			me.setDebugId(me.getNodeId() + "_" + me.getTimestamp() + "_" + me.getMethodName());
			
			me.setReceptor(tgtInstance);
			
			LocalExecution callerProxy = (LocalExecution) frg.createProxyObject(LocalExecution.class.getSimpleName(), me, "caller");
			callerProxy.setMethodName(lastMethodExecution.getMethodName());
			callerProxy.setTimestamp(lastMethodExecution.getTimestamp());
			me.setCaller(callerProxy);
			// callerProxy.setDebugId("Proxy: " + lastMethodExecution.getMethodName());
			callerProxy.setDebugId(lastMethodExecution.getDebugId());

			// me.setCaller(lastMethodExecution);
			return me;
		}

		public Triple<EmfFragment, SystemObject, MethodExecution> generateTrace(EmfFragmentFactory factory, MethodExecution lastMethodExecution) {
			EmfFragment frg = factory.createFragment();
			Instance guiInstance = createInstance(frg);
			
			java.lang.Class<?> selectedType = selectType();
			if ( selectedType == null )
				return null;
			SystemObject tgtSystemObject = retrieveSystemObject(0.5, selectedType);
			Instance tgtInstance = tgtSystemObject.createInstance(frg);
			
			MethodExecution me = tgtSystemObject.createExecution(frg, tgtInstance, lastMethodExecution);			
		
			return new Triple<EmfFragment, SystemObject, MethodExecution>(frg, tgtSystemObject, me);
		}

		public abstract java.lang.Class<?> selectType();
		public abstract String getMethodName();
		// public abstract EmfFragment generateTrace(EmfFragmentFactory factory, MethodExecution lastMethodExecution);
	}
	
	public class GUIFrontend extends SystemObject {
		public java.lang.Class<?> selectType() {
			double rnd = randomNumber();
			if ( rnd > 0.75 ) return Controller.class;
			if ( rnd > 0.50 ) return DomainObject.class;
			return GUIWidget.class;
		}

		@Override
		public String getMethodName() {
			double rnd = randomNumber();
			if ( rnd > 0.99 ) return getClass().getSimpleName() + "_abort";
			if ( rnd > 0.75 ) return getClass().getSimpleName() + "_open";
			if ( rnd > 0.5  ) return getClass().getSimpleName() + "_save";
			return getClass().getSimpleName() + "_help";
		}
	}
	
	public class GUIWidget extends SystemObject {
		public java.lang.Class<?> selectType() {
			double rnd = randomNumber();
			if ( rnd > 0.5 ) return GUIFrontend.class;
			return GUIWidget.class;
		}

		@Override
		public String getMethodName() {
			double rnd = randomNumber();
			if ( rnd > 0.75 ) return getClass().getSimpleName() + "_doubleclick";
			if ( rnd > 0.5  ) return getClass().getSimpleName() + "_focus";
			return getClass().getSimpleName() + "_click";
		}
		
	}
	
	public class Controller extends SystemObject {
		public java.lang.Class<?> selectType() {
			double rnd = randomNumber();
			if ( rnd > 0.75 ) return DomainObject.class;
			return Persistence.class;
		}

		@Override
		public String getMethodName() {
			double rnd = randomNumber();
			if ( rnd > 0.85 ) return getClass().getSimpleName() + "_startSession";
			if ( rnd > 0.65 ) return getClass().getSimpleName() + "_createEmployee";
			if ( rnd > 0.45  ) return getClass().getSimpleName() + "_saveEmployee";
			if ( rnd > 0.25  ) return getClass().getSimpleName() + "_createCompany";
			if ( rnd > 0.15  ) return getClass().getSimpleName() + "_saveCompany";
			return getClass().getSimpleName() + "finishSession";
		}		
	}
	
	public class DomainObject extends SystemObject {
		public java.lang.Class<?> selectType() {
			double rnd = randomNumber();
			if ( rnd > 0.65 ) return DomainObject.class;
			return DomainObject.class;
		}

		@Override
		public String getMethodName() {
			// For the moment without subclasses
			double rnd = randomNumber();
			if ( rnd > 0.85 ) return getClass().getSimpleName() + "_new";
			if ( rnd > 0.65 ) return getClass().getSimpleName() + "_setName";
			if ( rnd > 0.45  ) return getClass().getSimpleName() + "_getName";
			if ( rnd > 0.25  ) return getClass().getSimpleName() + "_setOtherData";
			if ( rnd > 0.15  ) return getClass().getSimpleName() + "_getOtherData";
			return getClass().getSimpleName() + "computeSomething";
		}		
		
	}
	
	public class Persistence extends SystemObject {
		public java.lang.Class<?> selectType() {
			double rnd = randomNumber();
			if ( rnd > 0.9 ) return Persistence.class;
			return DBManager.class;
		}

		@Override
		public String getMethodName() {
			double rnd = randomNumber();
			if ( rnd > 0.66 ) return getClass().getSimpleName() + "_saveEmployee";
			if ( rnd > 0.33  ) return getClass().getSimpleName() + "_saveCompany";
			return getClass().getSimpleName() + "_createJpaObject";
		}
		
	}
	
	public class DBManager extends SystemObject {
		public java.lang.Class<?> selectType() {
			double rnd = randomNumber();
			return null;
		}

		@Override
		public String getMethodName() {
			double rnd = randomNumber();
			if ( rnd > 0.75 ) return getClass().getSimpleName() + "_save";
			if ( rnd > 0.5  ) return getClass().getSimpleName() + "_delete";
			return getClass().getSimpleName() + "_update";
		}
				
	}
	

	public void feedTransformation(String modelName, dtrace2seq_diagrams transformation) {
		EmfFragmentFactory factory = getFactory();
		FragmentEmitter emitter = new FragmentEmitter(modelName, transformation);
		
		LocalClient localClient = new LocalClient(factory, emitter);
		// RemoteServer remoteServer = new RemoteServer(factory, emitter);
		
		localClient.start();
		// remoteServer.start();
		
		try {
			localClient.join();
			// remoteServer.join();
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
			GUIFrontend guiFrontend = new GUIFrontend();

			EmfFragment fragment1 = factory.createFragment();
			LocalExecution initial = (LocalExecution) fragment1.createObject(LocalExecution.class.getSimpleName());
			initial.setMethodName("start");
			initial.setDebugId("initial");
			
			guiFrontend.createInstance(fragment1);

			emitter.sendFragment(fragment1);
			
			SystemObject   currentObject = guiFrontend;
			MethodExecution lastExecution = initial;
			
			List<SystemObject> usedObjects    = new ArrayList<SystemObject>();
			List<MethodExecution> usedExecutions = new ArrayList<MethodExecution>();

			//Triple<EmfFragment, SystemObject, MethodExecution> trace = currentObject.generateTrace(factory, lastExecution);
			//emitter.sendFragment(trace._1);

			int i = 0;
			while ( true ) {
				if ( i++ > 5 * 1000 * 1000 ) break;
				// if ( i++ > 5 * 500 ) break;
				
				Triple<EmfFragment, SystemObject, MethodExecution> trace = currentObject.generateTrace(factory, lastExecution);
				if ( trace == null ) {
					int idx = (int) (Math.random() * usedExecutions.size());
					int idx2 = (int) (Math.random() * usedObjects.size());
				
					lastExecution = usedExecutions.get(idx);
					currentObject = usedObjects.get(idx2);
				} else {
					usedExecutions.add(lastExecution);
					usedObjects.add(currentObject);
					lastExecution = trace._3;
					currentObject = trace._2;
					emitter.sendFragment(trace._1);

					trace._1.clean();
					
					// In case the referenced objects are not released
					trace._1 = null;
					trace._2 = null;
					trace._3 = null;
					

					if ( usedObjects.size() > MAX_SIZE ) {
						usedObjects.remove(0);
						usedExecutions.remove(0);
					}
					
					if ( i % 100 == 0 ) {
						System.out.println("Memory [" + i + "]: " + Runtime.getRuntime().freeMemory() / 1024);
						emitter.printQueueStatus();
						/*
						int count = 0;
						for (ArrayList<SystemObject> array : createdInstances.values()) {
							count += array.size();
						}
						
						System.out.println("SyObj: " + count);
						*/
					}
					
					/*
					if ( i % 1000 == 0 ) {
						emitter.cleanTargetModel();
					}
					*/
				}
				
				
			}
			
		}
		
	}


}
