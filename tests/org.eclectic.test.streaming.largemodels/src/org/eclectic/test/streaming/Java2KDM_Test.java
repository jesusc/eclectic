package org.eclectic.test.streaming;

import static es.modelum.morsa.query.dsl.QueryBuilder.SELECT;
import static es.modelum.morsa.query.dsl.QueryBuilder.navigate;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.LocalQueue;
import org.eclectic.idc.jvm.runtime.ModelQueue;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streaming.fragments.EmfFragment;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.streaming.fragments.StreamedEmfModel;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Core.CorePackage;
import DOM.DOMPackage;
import PrimitiveTypes.PrimitiveTypesPackage;
import es.modelum.morsa.MorsaResource;
import es.modelum.morsa.MorsaResourceFactoryImpl;
import es.modelum.morsa.backend.mongodb.MongoDBMorsaBackendFactory;
import es.modelum.morsa.query.BOOLEQ;
import es.modelum.morsa.query.Condition;
import es.modelum.morsa.query.REF;
import es.modelum.morsa.query.STREQ;
import es.modelum.morsa.query.dsl.MorsaQuery;

/**
 * Test class for MorsaResource. The following tests have been implemented: full
 * save, full load, single load on demand, partial load on demand, Grabats query
 * with single load on demand and Grabats query with partial load on demand
 * 
 * From the console, execute the main method without arguments to show help
 * 
 * 
 */
public class Java2KDM_Test {
	static {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
	}
	
	/**
	 * Flag for breadth first traversal
	 */
	static public final int BREADTH_FIRST_ORDER = 0;
	/**
	 * Flag for depth first traversal
	 */
	static public final int DEPTH_FIRST_ORDER = 1;

	static private Map<EObject, MorsaQuery> morsaQueries = new HashMap<EObject, MorsaQuery>();

	static private MorsaQuery typeDeclarationQuery;

	private static void transformToKdm(Collection<EObject> root, List<EPackage> pkgs2)
			throws IOException {
		QoolTransformationBase transformation = new eclectic.jdt2kdm();
		Util.registerResourceFactory();

		// Load meta-model
		/*
		ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
		ResourceSet rs = new ResourceSetImpl();
		Resource mmr = rs.getResource(
				URI.createFileURI(withDir("model/JDTAST.ecore")), true);
		for (EObject o : mmr.getContents()) {
			EPackage pkg = (EPackage) o;
			pkgs.add(pkg);
			EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
		}
		*/
		
		for (EPackage ePackage : pkgs2) {
			EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
		}
		
		String streamDesc = withDir("src/org/eclectic/test/streaming/jdt.streamdesc");
		IModel<?, ?> in = getStreamedModel(pkgs2, streamDesc);

		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("model/kdm.ecore"),
				withDir("tmp_/kdm_output_streaming.xmi"));

		in.registerMethodHandler(new BasicMethodHandler(manager));
		out.registerMethodHandler(new BasicMethodHandler(manager));

		manager.register("jdt", in);
		manager.register("kdm", out);

		transformation.setModelManager(manager);
		transformation.configureStreamingMode("jdt", (IStreamedModel) in);
		transformation.configure_();

		transformation.start_();

		// EmfFragmentFactory factory = new EmfFragmentFactory(pkgs);

		int i = 0;
		for (EObject eObject : root) {
			// EmfFragment frg = factory.createFragment();
			i++;

			
			MorsaFragment fragment = new MorsaFragment();
			fragment.addObject(eObject);
			/*
			System.out.println("Getting elements " + ++i); 
			TreeIterator<EObject> contents = eObject.eAllContents();
			while ( contents.hasNext() ) {
				fragment.addObject(contents.next());
			}
			*/

			System.out.println("Transforming " + i);
			transformation.receiveStreamedFragment("jdt", fragment);
			
			((LocalQueue) transformation.getQueue("BodyQ")).clean();
			LinkedList<Object> objects = ((ModelQueue) transformation.getQueue("mMethodDeclaration")).getObjects();
			for (Object object : objects) {
				((IStreamedModel) in).remove(object);
			}
			
			((ModelQueue) transformation.getQueue("mFieldDeclaration")).getObjects();
			for (Object object : objects) {
				((IStreamedModel) in).remove(object);
			}
			
			((ModelQueue) transformation.getQueue("mMethodDeclaration")).clean();
			((ModelQueue) transformation.getQueue("mFieldDeclaration")).clean();
			
			
			
			// System.out.println(eObject);
			// Object superclass =
			// eObject.eGet(eObject.eClass().getEStructuralFeature("superclassType"));
			// System.out.println("Superclass: " + superclass);
			/*
			 * TreeIterator<EObject> contents = eObject.eAllContents(); while (
			 * contents.hasNext() ) { EObject obj = contents.next();
			 * System.out.println(obj); } break;
			 */
		}

		transformation.printPending();
		out.serialize();
	}

	public static IModel<?, ?> getStreamedModel(List<EPackage> pkgs, String streamDesc)
			throws IOException {
		JavaListConverter converter = new JavaListConverter();
		EMFHandler handler = createModelHandler(pkgs);
		StreamDescription desc = (StreamDescription) new org.eclectic.streamdesc.StreamDescLanguageLoader()
				.load(streamDesc);
		StreamedEmfModel model = new StreamedEmfModel(handler, desc, converter);
		model.setExplicitKeyMode();
		model.setLazyLoading();	
		return model;
	}

	private static EMFHandler createModelHandler(List<EPackage> pkgs) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new XMIResourceFactoryImpl());

		ResourceSetImpl rs = new ResourceSetImpl();

		/*
		 * rs.getPackageRegistry().put(PrimitiveTypesPackage.eINSTANCE.getNsURI()
		 * , PrimitiveTypesPackage.eINSTANCE);
		 * rs.getPackageRegistry().put(DOMPackage.eINSTANCE.getNsURI(),
		 * DOMPackage.eINSTANCE);
		 * rs.getPackageRegistry().put(CorePackage.eINSTANCE.getNsURI(),
		 * CorePackage.eINSTANCE);
		 */
		Resource resource = rs.createResource(Util
				.createURI("tmp_/input_model.xmi"));

		EMFHandler handler = new EMFHandler(pkgs, resource);
		return handler;
	}

	public static String withDir(String f) {
		return new File(".").getAbsolutePath() + File.separator + f;
	}

	// Morsa stuff

	static public void main(String[] args) {
		Map<String, String> argMap = mapArgs(args);

		if (args.length != 0) {
			ResourceSet rs = new ResourceSetImpl();
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("ecore", new EcoreResourceFactoryImpl());
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("xmi", new XMIResourceFactoryImpl());
			rs.getResourceFactoryRegistry()
					.getProtocolToFactoryMap()
					.put("morsa",
							new MorsaResourceFactoryImpl(
									new MongoDBMorsaBackendFactory()));

			String operation = argMap.get("op");
			String engine = argMap.get("engine");
			String mode = argMap.get("mode");
			String queryEngine = argMap.get("qengine");
			String sourceFile = argMap.get("file");
			String morsaURI = argMap.get("uri");
			String backendURI = argMap.get("db");
			boolean printTrace = argMap.containsKey("ptrace") ? Boolean
					.parseBoolean(argMap.get("ptrace")) : false;
			boolean discardSaved = argMap.containsKey("discard") ? Boolean
					.parseBoolean(argMap.get("discard")) : true;
			int clusterSize = argMap.containsKey("clsize") ? Integer
					.parseInt(argMap.get("clsize")) : 0;
			int order = argMap.containsKey("order")
					&& argMap.get("order").equals("depth") ? DEPTH_FIRST_ORDER
					: BREADTH_FIRST_ORDER;
			String cachePolicy = argMap.get("capol");
			int cacheSize = argMap.containsKey("casize") ? Integer
					.parseInt(argMap.get("casize")) : 0;
			float flushFactor = argMap.containsKey("caff") ? Float
					.parseFloat(argMap.get("caff")) : 0.0f;
			boolean readOnly = argMap.containsKey("ronly") ? Boolean
					.parseBoolean(argMap.get("ronly")) : true;
			int clusterDepth = argMap.containsKey("cldep") ? Integer
					.parseInt(argMap.get("cldep")) : -1;
			int clusterBreadth = argMap.containsKey("clbr") ? Integer
					.parseInt(argMap.get("clbr")) : -1;
			boolean getAll = argMap.containsKey("all") ? Boolean
					.parseBoolean(argMap.get("all")) : true;
			boolean isRoot = argMap.containsKey("root") ? Boolean
					.parseBoolean(argMap.get("root")) : true;

			if (operation.equals("save")) {
				if (engine.equals("xmi")) {
					testSaveXMI(rs, sourceFile);
				} else if (engine.equals("morsa")) {
					if (mode.equals("full")) {
						testFullSave(rs, sourceFile, morsaURI, backendURI,
								cacheSize, printTrace);
					} else {
						if (mode.equals("inc")) {
							testIncrementalSave(rs, sourceFile, morsaURI,
									backendURI, cacheSize, printTrace,
									discardSaved, clusterSize);

						} else if (mode.equals("upd")) {
							testIncrementalSaveByUpdate(rs, sourceFile,
									morsaURI, backendURI, cacheSize,
									printTrace, discardSaved);
						}
					}
				}
			}

			else if (operation.equals("load")) {
				if (engine.equals("xmi")) {
					testLoadXMI(rs, sourceFile, order);
				} else if (engine.equals("morsa")) {
					if (mode.equals("full")) {
						testFullLoad(rs, morsaURI, backendURI, printTrace,
								order);
					} else if (mode.equals("single")) {
						testSingleLoad(rs, morsaURI, backendURI, cachePolicy,
								order, cacheSize, flushFactor, printTrace,
								readOnly);
					} else if (mode.equals("partial")) {
						testPartialLoad(rs, morsaURI, backendURI, cachePolicy,
								order, cacheSize, flushFactor, clusterDepth,
								clusterBreadth, printTrace, readOnly);
					}
				}
			}

			else if (operation.equals("update")) {
				if (engine.equals("xmi")) {
					testUpdateXMI(rs, sourceFile);
				} else if (engine.equals("morsa")) {
					if (mode.equals("full")) {
						testUpdateFullLoad(rs, morsaURI, backendURI, printTrace);
					} else if (mode.equals("single")) {
						testUpdateSingleLoad(rs, morsaURI, backendURI,
								cachePolicy, cacheSize, flushFactor, printTrace);
					} else if (mode.equals("partial")) {
						testUpdatePartialLoad(rs, morsaURI, backendURI,
								cachePolicy, cacheSize, flushFactor,
								clusterDepth, clusterBreadth, printTrace);
					}
				}
			}

			else if (operation.equals("query")) {
				if (engine.equals("xmi")) {
					testGrabatsXMI(rs, sourceFile, queryEngine);
				} else if (engine.equals("morsa")) {
					if (mode.equals("full")) {
						if (queryEngine.equals("emfquery"))
							throw new UnsupportedOperationException();
						else
							testGrabatsFullLoad(rs, morsaURI, backendURI,
									printTrace, queryEngine, readOnly);
					} else if (mode.equals("single")) {
						if (queryEngine.equals("emfquery"))
							throw new UnsupportedOperationException();
						else
							testGrabatsSingleLoad(rs, morsaURI, backendURI,
									cachePolicy, cacheSize, flushFactor,
									printTrace, queryEngine, readOnly);
					} else if (mode.equals("partial")) {
						if (queryEngine.equals("emfquery"))
							throw new UnsupportedOperationException();
						else
							testGrabatsPartialLoad(rs, morsaURI, backendURI,
									cachePolicy, cacheSize, flushFactor,
									clusterDepth, clusterBreadth, printTrace,
									queryEngine, readOnly);
					}
				}
			}

			else if (operation.equals("delete")) {
				testDelete(rs, morsaURI, backendURI, printTrace, isRoot);
			}

			else if (operation.equals("referencers")) {
				boolean queryAsCode = queryEngine.equals("emf");
				if (engine.equals("xmi")) {
					testReferencersXMI(rs, sourceFile, queryAsCode, getAll);
				} else if (engine.equals("morsa")) {
					if (mode.equals("full")) {
						if (queryEngine.equals("emfquery")) {

						} else
							testReferencersFullLoad(rs, morsaURI, backendURI,
									printTrace, queryAsCode, readOnly, getAll);
					} else if (mode.equals("single")) {
						if (queryEngine.equals("-emfquery")) {
						} else
							testReferencersSingleLoad(rs, morsaURI, backendURI,
									cachePolicy, cacheSize, flushFactor,
									printTrace, queryAsCode, readOnly, getAll);
					} else if (mode.equals("partial")) {
						if (queryEngine.equals("-emfquery")) {
						} else
							testReferencersPartialLoad(rs, morsaURI,
									backendURI, cachePolicy, cacheSize,
									flushFactor, clusterDepth, clusterBreadth,
									printTrace, queryAsCode, readOnly, getAll);
					}
				}
			}

			else if (operation.equals("inclusion")) {
				boolean queryAsCode = queryEngine.equals("emf");
				if (engine.equals("xmi")) {
					testReferencersXMI(rs, sourceFile, queryAsCode, getAll);
				} else if (engine.equals("morsa")) {
					if (mode.equals("full")) {
						if (queryEngine.equals("emfquery")) {

						} else
							testInclusionFullLoad(rs, morsaURI, backendURI,
									printTrace, queryAsCode, readOnly, getAll);
					} else if (mode.equals("single")) {
						if (queryEngine.equals("-emfquery")) {
						} else
							testInclusionSingleLoad(rs, morsaURI, backendURI,
									cachePolicy, cacheSize, flushFactor,
									printTrace, queryAsCode, readOnly, getAll);
					} else if (mode.equals("partial")) {
						if (queryEngine.equals("-emfquery")) {
						} else
							testInclusionPartialLoad(rs, morsaURI, backendURI,
									cachePolicy, cacheSize, flushFactor,
									clusterDepth, clusterBreadth, printTrace,
									queryAsCode, readOnly, getAll);
					}
				}
			}

		} else {
			// TODO print howto
		}
	}

	/**
	 * Tests the full save of a model from an XMI file
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the path to the source file of the model
	 */
	static public void testSaveXMI(ResourceSet rs, String sourceFile) {
		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		List<EObject> roots = r.getContents();

		long l = System.currentTimeMillis();

		File otherf = new File(sourceFile.replace(".xmi", "_test.xmi"));
		Resource otherr = rs.createResource(URI.createFileURI(otherf
				.getAbsolutePath()));
		for (EObject root : roots) {
			otherr.getContents().add(root);
		}

		try {
			otherr.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("SAVE TIME: " + (System.currentTimeMillis() - l));
	}

	/**
	 * Tests the full load of a model from an XMI file
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the path to the source file of the model
	 * @param order
	 *            the traversal order (DEPTH_FIRST_ORDER for depth first,
	 *            BREADTH_FIRST_ORDER for breadth first)
	 */
	static public void testLoadXMI(ResourceSet rs, String sourceFile, int order) {
		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		long l = System.currentTimeMillis();

		int objectCount = traverseModel(r, order);

		System.out.println("LOAD TIME: " + (System.currentTimeMillis() - l)
				+ " FOR " + objectCount + " OBJECTS");
	}

	/**
	 * Tests the update of an XMI file. The update executes the Grabats query
	 * over a model and depending on the number of results it performs one of
	 * the following actions:
	 * 
	 * 1. If the result size is 0, it does nothing 2. If the result size is 1,
	 * that object is deleted 3. If the result size is 2, parents are exchanged
	 * between both objects 4. If the result size is greater than 2, parents are
	 * exchanged between the first and the last objects and the object in the
	 * middle is deleted
	 * 
	 * This update can only be executed on a model that conforms to the
	 * metamodel defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the XMI file
	 */
	static public void testUpdateXMI(ResourceSet rs, String sourceFile) {
		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		long l = System.currentTimeMillis();

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		File destFile = new File(sourceFile.replace(".xmi", "_test.xmi"));
		Resource d = rs.createResource(URI.createFileURI(destFile
				.getAbsolutePath()));
		d.getContents().addAll(r.getContents());

		Iterator<EObject> contentIterator = d.getAllContents();

		EPackage dom = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.dom");
		EClass typeDeclarationClass = (EClass) dom
				.getEClassifier("TypeDeclaration");
		EClass methodDeclarationClass = (EClass) dom
				.getEClassifier("MethodDeclaration");
		EClass modifierClass = (EClass) dom.getEClassifier("Modifier");
		EClass simpleNameClass = (EClass) dom.getEClassifier("SimpleName");

		List<EObject> foundObjs = new LinkedList<EObject>();

		while (contentIterator.hasNext()) {
			EObject content = contentIterator.next();
			if (content.eClass().equals(typeDeclarationClass)) {
				EObject typeDeclaration = content;

				EObject typeName = (EObject) typeDeclaration
						.eGet(typeDeclarationClass
								.getEStructuralFeature("name"));
				if (typeName == null)
					continue;

				String typeQName = (String) typeName.eGet(typeName.eClass()
						.getEStructuralFeature("fullyQualifiedName"));
				EReference bodyDeclarationsRef = (EReference) typeDeclarationClass
						.getEStructuralFeature("bodyDeclarations");

				Object o = typeDeclaration.eGet(bodyDeclarationsRef);
				if (o != null) {
					List<EObject> bodyDeclarationList = (List<EObject>) o;
					boolean found = false;
					for (int j = 0; j < bodyDeclarationList.size() && !found; j++) {
						EObject bodyDeclaration = bodyDeclarationList.get(j);
						if (bodyDeclaration.eClass() == methodDeclarationClass) {
							EReference modifiersRef = (EReference) methodDeclarationClass
									.getEStructuralFeature("modifiers");
							Object o2 = bodyDeclaration.eGet(modifiersRef);
							if (o2 != null) {
								List<EObject> modifiersList = (List<EObject>) o2;
								boolean foundStatic = false;
								boolean foundPublic = false;
								for (int k = 0; k < modifiersList.size(); k++) {
									EObject modifier = modifiersList.get(k);
									if (modifier.eClass() == modifierClass) {
										boolean isStatic = (Boolean) modifier
												.eGet(modifierClass
														.getEStructuralFeature("static"));
										boolean isPublic = (Boolean) modifier
												.eGet(modifierClass
														.getEStructuralFeature("public"));
										if (isStatic)
											foundStatic = true;
										if (isPublic)
											foundPublic = true;
									}
								}

								if (foundStatic && foundPublic) {
									EReference returnTypeRef = (EReference) methodDeclarationClass
											.getEStructuralFeature("returnType");
									Object o3 = bodyDeclaration
											.eGet(returnTypeRef);
									if (o3 != null) {
										EObject returnType = (EObject) o3;
										EReference typeNameRef = (EReference) returnType
												.eClass()
												.getEStructuralFeature("name");

										if (typeNameRef != null) {
											EObject returnTypeName = (EObject) returnType
													.eGet(typeNameRef);
											if (returnTypeName != null) {
												String returnTypeQName = (String) returnTypeName
														.eGet(returnTypeName
																.eClass()
																.getEStructuralFeature(
																		"fullyQualifiedName"));
												if (returnTypeQName
														.equals(typeQName)) {
													EObject simpleName = (EObject) bodyDeclaration
															.eGet(methodDeclarationClass
																	.getEStructuralFeature("name"));
													System.out
															.println(typeQName
																	+ " : "
																	+ simpleName
																			.eGet(simpleNameClass
																					.getEStructuralFeature("fullyQualifiedName")));
													found = true;
													foundObjs
															.add(typeDeclaration);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (foundObjs.size() > 0) {
			l = System.currentTimeMillis();

			EObject firstResult = foundObjs.get(0);
			EReference firstContainingFeature = (EReference) firstResult
					.eContainingFeature();
			EObject firstContainer = firstResult.eContainer();

			if (foundObjs.size() > 1) {
				EObject lastResult = foundObjs.get(foundObjs.size() - 1);
				EReference lastContainingFeature = (EReference) lastResult
						.eContainingFeature();
				EObject lastContainer = lastResult.eContainer();

				if (firstResult.eContainingFeature().isMany()) {
					((List<EObject>) firstContainer
							.eGet(firstContainingFeature)).set(
							((List<EObject>) firstContainer
									.eGet(firstContainingFeature))
									.indexOf(firstResult), lastResult);
				} else {
					firstContainer.eSet(firstResult.eContainingFeature(),
							lastResult);
				}

				if (lastContainingFeature.isMany()) {
					((List<EObject>) lastContainer.eGet(lastContainingFeature))
							.add(firstResult);
				} else {
					lastContainer.eSet(lastContainingFeature, firstResult);
				}

				if (foundObjs.size() > 2) {
					EObject middleResult = foundObjs
							.get((foundObjs.size() - 1) / 2);
					EObject middleContainer = middleResult.eContainer();

					if (middleResult.eContainingFeature().isMany()) {
						((List<EObject>) middleContainer.eGet(middleResult
								.eContainingFeature())).remove(middleResult);
					} else {
						middleContainer.eUnset(middleResult
								.eContainingFeature());
					}
				}
			}

			else {
				if (firstResult.eContainingFeature().isMany()) {
					((List<EObject>) firstContainer.eGet(firstResult
							.eContainingFeature())).remove(firstResult);
				} else {
					firstContainer.eUnset(firstResult.eContainingFeature());
				}
			}

			try {
				d.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// try {
			// Thread.sleep(10000);
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }

			System.out.println("UPDATE TIME: "
					+ (System.currentTimeMillis() - l));
		}
	}

	/**
	 * Tests the Grabats query against an XMI file.
	 * 
	 * The query finds all classes (TypeDeclaration) that declare static public
	 * methods (MethodDeclaration) whose return type is the same class
	 * 
	 * This query can only be executed on a model that conforms to the metamodel
	 * defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the source XMI file
	 * @param queryAsCode
	 *            TODO
	 */
	static public void testGrabatsXMI(ResourceSet rs, String sourceFile,
			String queryEngine) {
		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long l = System.currentTimeMillis();

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		EPackage dom = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.dom");
		EClass typeDeclarationClass = (EClass) dom
				.getEClassifier("TypeDeclaration");

		System.out.println("LOAD TIME: " + (System.currentTimeMillis() - l));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		l = System.currentTimeMillis();

		Iterator<EObject> contentIterator = r.getAllContents();

		while (contentIterator.hasNext()) {
			EObject content = contentIterator.next();
			if (content.eClass().equals(typeDeclarationClass)) {
				EObject typeDeclaration = content;
				if (queryEngine.equals("emf"))
					checkTypeDeclaration(typeDeclaration);
			}
		}

		System.out.println("QUERY TIME 1: " + (System.currentTimeMillis() - l));

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		l = System.currentTimeMillis();

		contentIterator = r.getAllContents();

		while (contentIterator.hasNext()) {
			EObject content = contentIterator.next();
			if (content.eClass().equals(typeDeclarationClass)) {
				EObject typeDeclaration = content;
				if (queryEngine.equals("emf"))
					checkTypeDeclaration(typeDeclaration);
			}
		}

		System.out.println("QUERY TIME 2: " + (System.currentTimeMillis() - l));

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static public void testReferencersXMI(ResourceSet rs, String sourceFile,
			boolean queryAsCode, boolean all) {
		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		long l = System.currentTimeMillis();

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		EPackage dom = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.core");
		EClass typeClass = (EClass) dom.getEClassifier("IType");

		Iterator<EObject> contentIterator = r.getAllContents();

		while (contentIterator.hasNext()) {
			EObject content = contentIterator.next();
			if (content.eClass().equals(typeClass)) {
				EObject type = content;
				if (queryAsCode)
					referencersQueryAsCode(type, r, all);
				else {
				}
			}
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));

	}

	/**
	 * Tests the full save of a model
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the path to the source file of the model
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param saveCacheSize
	 *            the size of the save chace
	 * @param printTrace
	 *            flag for trace print
	 */
	static public void testFullSave(ResourceSet rs, String sourceFile,
			String morsaURI, String backendURI, int saveCacheSize,
			boolean printTrace) {

		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		List<EObject> roots = new ArrayList<EObject>(r.getContents());

		long l = System.currentTimeMillis();

		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));

		for (EObject root : roots) {
			morsaResource.getContents().add(root);
		}

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			if (saveCacheSize > 0)
				options.put(MorsaResource.OPTION_MAX_SAVE_CACHE_SIZE,
						saveCacheSize);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			morsaResource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("FULL SAVE TIME: "
				+ (System.currentTimeMillis() - l));
	}

	/**
	 * Tests the incremental save of a model.
	 * 
	 * The model is traversed in breadth-first order, when the size of the
	 * traversed objects is greater than or equals to the size of the cluster,
	 * they are saved in the repository and then discarded from memory.
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the path to the source file of the model
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param saveCacheSize
	 *            the size of the save cache
	 * @param printTrace
	 *            flag for trace print
	 * @param discardSaved
	 *            true to unload already saved objects, false to keep them in
	 *            memory
	 * @param clusterSize
	 *            the size of the cluster of objects that is saved in each step
	 */
	static public void testIncrementalSave(ResourceSet rs, String sourceFile,
			String morsaURI, String backendURI, int saveCacheSize,
			boolean printTrace, boolean discardSaved, int clusterSize) {

		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		long l = System.currentTimeMillis();

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));
		System.err.println("XMI LOADED: " + (System.currentTimeMillis() - l));
		l = System.currentTimeMillis();
		EObject[] contents = (EObject[]) r.getContents().toArray();

		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		if (saveCacheSize > 0)
			options.put(MorsaResource.OPTION_MAX_SAVE_CACHE_SIZE, saveCacheSize);
		options.put(MorsaResource.OPTION_SAVE_CLUSTER_SIZE, 1);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);

		morsaResource.getContents().addAll(r.getContents());

		try {
			System.err.println("SAVING NO. 1");
			morsaResource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}

		morsaResource.getContents().clear();

		options.put(MorsaResource.OPTION_OVERWRITE_ROOTS, false);
		options.put(MorsaResource.OPTION_DISCARD_SAVED, discardSaved);
		int currentClusterSize = 0;
		int saveCount = 2;

		for (EObject content : contents) {
			List<EObject> children = new LinkedList<EObject>();
			children.addAll(content.eContents());

			while (!children.isEmpty()) {
				EObject child = children.remove(0);
				children.addAll(0, child.eContents());
				morsaResource.getContents().add(child);
				if (currentClusterSize++ >= clusterSize) {
					System.err.println("SAVING NO. " + saveCount++);
					try {
						morsaResource.save(options);
						if (!discardSaved)
							morsaResource.getContents().clear();
					} catch (IOException e) {
						e.printStackTrace();
					}
					currentClusterSize = 0;
				}
			}
		}

		if (currentClusterSize++ > 0) {
			System.err.println("SAVING NO. " + saveCount++);
			try {
				morsaResource.save(options);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("INCREMENTAL SAVE TIME: "
				+ (System.currentTimeMillis() - l));
	}

	/**
	 * Tests the incremental save of a model by update.
	 * 
	 * The root of the model is initially saved and then each branch contained
	 * by the root is saved incrementally by updating the already saved model
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param sourceFile
	 *            the path to the source file of the model
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param saveCacheSize
	 *            the size of the save cache
	 * @param printTrace
	 *            flag for trace print
	 * @param discardSaved
	 *            true to unload already saved objects, false to keep them in
	 *            memory
	 */
	@SuppressWarnings({ "unchecked", "unchecked", "rawtypes" })
	static public void testIncrementalSaveByUpdate(ResourceSet rs,
			String sourceFile, String morsaURI, String backendURI,
			int saveCacheSize, boolean printTrace, boolean discardSaved) {

		File f = new File(sourceFile);

		for (File mm : f.getParentFile().listFiles()) {
			if (mm.getAbsolutePath().endsWith(".ecore")) {
				Resource mmr = rs.getResource(
						URI.createFileURI(mm.getAbsolutePath()), true);
				for (EObject o : mmr.getContents()) {
					registerPackages((EPackage) o);
				}
			}
		}

		Resource r = rs
				.getResource(URI.createFileURI(new File(sourceFile)
						.getAbsolutePath()), true);

		List<EObject> roots = new ArrayList<EObject>(r.getContents());

		long l = System.currentTimeMillis();
		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));

		Map<EObject, Map<EReference, List<EObject>>> removedObjects = new HashMap<EObject, Map<EReference, List<EObject>>>();

		for (EObject root : roots) {
			for (EReference ref : root.eClass().getEAllContainments()) {
				if (ref.isMany() && root.eGet(ref) != null
						&& !((List<EObject>) root.eGet(ref)).isEmpty()) {
					if (!removedObjects.containsKey(root)) {
						removedObjects.put(root,
								new HashMap<EReference, List<EObject>>());
					}

					Map<EReference, List<EObject>> removedObjectsByRef = removedObjects
							.get(root);

					if (!removedObjectsByRef.containsKey(ref)) {
						removedObjectsByRef.put(ref, new LinkedList<EObject>());
					}

					List<EObject> removedObjectsList = removedObjectsByRef
							.get(ref);

					for (EObject o : (List<EObject>) root.eGet(ref)) {
						removedObjectsList.add(o);
					}
					((Collection<EObject>) root.eGet(ref)).clear();
				}
			}
			morsaResource.getContents().add(root);
		}

		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		if (saveCacheSize > 0)
			options.put(MorsaResource.OPTION_MAX_SAVE_CACHE_SIZE, saveCacheSize);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		options.put(MorsaResource.OPTION_DISCARD_SAVED, discardSaved);

		try {
			morsaResource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.err.println("FIRST SAVE DONE: "
				+ (System.currentTimeMillis() - l));

		morsaResource.getContents().clear();

		int count = 1;
		for (EObject root : removedObjects.keySet()) {
			EObject removedRoot = EcoreUtil.resolve(root, morsaResource);
			for (EReference ref : removedObjects.get(root).keySet()) {
				List<EObject> refObjs = removedObjects.get(root).get(ref);
				while (!refObjs.isEmpty()) {
					EObject removedObject = refObjs.remove(0);
					System.err.println("SAVE NO. " + (count++) + " FOR "
							+ ref.getName());
					((List<EObject>) removedRoot.eGet(ref)).add(removedObject);

					try {
						morsaResource.getContents().add(removedRoot);
						morsaResource.save(options);
					} catch (IOException e) {
						e.printStackTrace();
					}

					System.err.println("DONE IN "
							+ (System.currentTimeMillis() - l));
				}

			}
		}

		System.out.println("INCREMENTAL SAVE TIME: "
				+ (System.currentTimeMillis() - l));
	}

	/**
	 * Tests the full load of a model
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param printTrace
	 *            flag for trace print
	 * @param order
	 *            the traversal order (DEPTH_FIRST_ORDER for depth first,
	 *            BREADTH_FIRST_ORDER for breadth first)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testFullLoad(ResourceSet rs, String morsaURI,
			String backendURI, boolean printTrace, int order) {
		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, false);
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);
			long l = System.currentTimeMillis();
			morsaResource.load(options);

			int objectCount = traverseModel(morsaResource, order);

			System.out.println("LOAD TIME: " + (System.currentTimeMillis() - l)
					+ " FOR " + objectCount + " OBJECTS");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests a single load on demand of a model
	 * 
	 * The model is fully traversed on depth first or breadth first order
	 * 
	 * @param rs
	 *            the ResourceSet in which the MorsaResource is contained
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param order
	 *            the traversal order (DEPTH_FIRST_ORDER for depth first,
	 *            BREADTH_FIRST_ORDER for breadth first)
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param printTrace
	 *            flag for trace print
	 * @param readOnly
	 *            flag for read only mode
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testSingleLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int order, int cacheSize,
			float flushFactor, boolean printTrace, boolean readOnly) {
		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
			options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
			options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
			options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
					MorsaResource.OPTION_SINGLE_LOAD_STRATEGY);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			if (readOnly)
				options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);
			long l = System.currentTimeMillis();

			morsaResource.load(options);

			int objectCount = traverseModel(morsaResource, order);

			System.out.println("LOAD TIME: " + (System.currentTimeMillis() - l)
					+ " FOR " + objectCount + " OBJECTS");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests a partial load on demand of a model.
	 * 
	 * The model is fully traversed on depth first or breadth first order
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param order
	 *            the traversal order (DEPTH_FIRST_ORDER for depth first,
	 *            BREADTH_FIRST_ORDER for breadth first)
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param clusterDepth
	 *            the depth of the partial load on demand cluster
	 * @param clusterBreadth
	 *            the breadth of the partial load on demand cluster
	 * @param printTrace
	 *            flag for trace print
	 * @param readOnly
	 *            flag for read only mode
	 */
	static public void testPartialLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int order, int cacheSize,
			float flushFactor, int clusterDepth, int clusterBreadth,
			boolean printTrace, boolean readOnly) {
		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
			options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
			options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
			options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
					MorsaResource.OPTION_PARTIAL_LOAD_STRATEGY);
			options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_DEPTH,
					clusterDepth);
			options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_BREADTH,
					clusterBreadth);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			if (readOnly)
				options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);
			long l = System.currentTimeMillis();
			morsaResource.load(options);

			int objectCount = traverseModel(morsaResource, order);

			System.out.println("LOAD TIME: " + (System.currentTimeMillis() - l)
					+ " FOR " + objectCount + " OBJECTS");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests the update of a model using the Morsa repository with full load.
	 * The update executes the Grabats query over a model and depending on the
	 * number of results it performs one of the following actions:
	 * 
	 * 1. If the result size is 0, it does nothing 2. If the result size is 1,
	 * that object is deleted 3. If the result size is 2, parents are exchanged
	 * between both objects 4. If the result size is greater than 2, parents are
	 * exchanged between the first and the last objects and the object in the
	 * middle is deleted
	 * 
	 * This update can only be executed on a model that conforms to the
	 * metamodel defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param printTrace
	 *            flag for trace print
	 */
	static public void testUpdateFullLoad(ResourceSet rs, String morsaURI,
			String backendURI, boolean printTrace) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, false);
			options.put(MorsaResource.OPTION_OVERWRITE_ROOTS, false);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, false);

			morsaResource.load(options);
			update(morsaResource, options);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests the update of a model using the Morsa repository with single load
	 * on demand. The update executes the Grabats query over a model and
	 * depending on the number of results it performs one of the following
	 * actions:
	 * 
	 * 1. If the result size is 0, it does nothing 2. If the result size is 1,
	 * that object is deleted 3. If the result size is 2, parents are exchanged
	 * between both objects 4. If the result size is greater than 2, parents are
	 * exchanged between the first and the last objects and the object in the
	 * middle is deleted
	 * 
	 * This update can only be executed on a model that conforms to the
	 * metamodel defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param printTrace
	 *            flag for trace print
	 */
	static public void testUpdateSingleLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int cacheSize,
			float flushFactor, boolean printTrace) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
			options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
			options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
			options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
					MorsaResource.OPTION_SINGLE_LOAD_STRATEGY);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
			options.put(MorsaResource.OPTION_OVERWRITE_ROOTS, false);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, false);

			morsaResource.load(options);
			update(morsaResource, options);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests the update of a model using the Morsa repository with partial load
	 * on demand. The update executes the Grabats query over a model and
	 * depending on the number of results it performs one of the following
	 * actions:
	 * 
	 * 1. If the result size is 0, it does nothing 2. If the result size is 1,
	 * that object is deleted 3. If the result size is 2, parents are exchanged
	 * between both objects 4. If the result size is greater than 2, parents are
	 * exchanged between the first and the last objects and the object in the
	 * middle is deleted
	 * 
	 * This update can only be executed on a model that conforms to the
	 * metamodel defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param clusterDepth
	 *            the depth of the partial load cluster
	 * @param clusterBreadth
	 *            the breadth of the partial load cluster
	 * @param printTrace
	 *            flag for trace print
	 */
	static public void testUpdatePartialLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int cacheSize,
			float flushFactor, int clusterDepth, int clusterBreadth,
			boolean printTrace) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
			options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
			options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
			options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
					MorsaResource.OPTION_PARTIAL_LOAD_STRATEGY);
			options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_DEPTH,
					clusterDepth);
			options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_BREADTH,
					clusterBreadth);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
			options.put(MorsaResource.OPTION_OVERWRITE_ROOTS, false);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, false);

			morsaResource.load(options);
			update(morsaResource, options);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests the Grabats query on a model with full load.
	 * 
	 * The query finds all classes (TypeDeclaration) that declare static public
	 * methods (MethodDeclaration) whose return type is the same class
	 * 
	 * This query can only be executed on a model that conforms to the metamodel
	 * defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet in which the MorsaResource is contained
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param printTrace
	 *            true if trace must be printed, false if not
	 * @param queryAsCode
	 *            true if the query must be executed with raw EMF code, false if
	 *            it must be executed with the dedicated query DSL
	 * @param readOnly
	 *            flag for read only mode
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testGrabatsFullLoad(ResourceSet rs, String morsaURI,
			String backendURI, boolean printTrace, String queryEngine,
			boolean readOnly) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, false);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage dom = morsaResource.loadMetamodel("org.amma.dsl.jdt.dom");
			List<EPackage> pkgs = registerPackages(dom);
			testGrabatsMorsa_Transformation(morsaResource, queryEngine, pkgs);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	/**
	 * Tests the Grabats query on a model with partial load on demand
	 * 
	 * The query finds all classes (TypeDeclaration) that declare static public
	 * methods (MethodDeclaration) whose return type is the same class
	 * 
	 * This query can only be executed on a model that conforms to the metamodel
	 * defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param clusterDepth
	 *            the depth of the partial load on demand cluster
	 * @param clusterBreadth
	 *            the breadth of the partial load on demand cluster
	 * @param printTrace
	 *            flag for trace print
	 * @param queryAsCode
	 *            true if the query must be executed with raw EMF code, false if
	 *            it must be executed with the dedicated query DSL
	 * @param readOnly
	 *            flag for read only mode
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testGrabatsPartialLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int cacheSize,
			float flushFactor, int clusterDepth, int clusterBreadth,
			boolean printTrace, String queryEngine, boolean readOnly) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
		options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
		options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
		options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
				MorsaResource.OPTION_PARTIAL_LOAD_STRATEGY);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_DEPTH, clusterDepth);
		options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_BREADTH,
				clusterBreadth);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage dom = morsaResource.loadMetamodel("org.amma.dsl.jdt.dom");
			List<EPackage> pkgs = registerPackages(dom);
			testGrabatsMorsa_Transformation(morsaResource, queryEngine, pkgs);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	/**
	 * Tests the Grabats query on a model with single load on demand
	 * 
	 * The query finds all classes (TypeDeclaration) that declare static public
	 * methods (MethodDeclaration) whose return type is the same class
	 * 
	 * This query can only be executed on a model that conforms to the metamodel
	 * defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param rs
	 *            the ResourceSet in which the MorsaResource is contained
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param printTrace
	 *            true if trace must be printed, false if not
	 * @param queryAsCode
	 *            true if the query must be executed with raw EMF code, false if
	 *            it must be executed with the dedicated query DSL
	 * @param readOnly
	 *            flag for read only mode
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testGrabatsSingleLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int cacheSize,
			float flushFactor, boolean printTrace, String queryEngine,
			boolean readOnly) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
		options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
		options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
		options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
				MorsaResource.OPTION_SINGLE_LOAD_STRATEGY);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);
		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage dom = morsaResource.loadMetamodel("org.amma.dsl.jdt.dom");
			List<EPackage> pkgs = registerPackages(dom);
			System.out
					.println("LOAD TIME: " + (System.currentTimeMillis() - l));
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l = System.currentTimeMillis();
			testGrabatsMorsa_Transformation(morsaResource, queryEngine, pkgs);
			System.out.println("QUERY TIME 1: "
					+ (System.currentTimeMillis() - l));
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l = System.currentTimeMillis();
			testGrabatsMorsa_Transformation(morsaResource, queryEngine, pkgs);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME 2: " + (System.currentTimeMillis() - l));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Tests the special features of Morsa: loading a specific object, obtaining
	 * the conainer of an object, deleting single objects and updating the
	 * model.
	 * 
	 * This test moves an object from one container to another and removes the
	 * old container from the model
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the model
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param objectURI
	 *            the Morsa URI of the object that will be moved
	 * @param newContainerURI
	 *            the Morsa URI of the object that will contained the moved
	 *            object
	 * @param cachePolicy
	 *            the name of the cache policy class
	 * @param cacheSize
	 *            the size of the cache
	 * @param flushFactor
	 *            the flush factor of the cache
	 * @param clusterDepth
	 *            the depth of the partial load cluster
	 * @param clusterBreadth
	 *            the breadth of the partial load cluster
	 * @param printTrace
	 *            flag for trace print
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testFeatures(ResourceSet rs, String morsaURI,
			String backendURI, String objectURI, String newContainerURI,
			String cachePolicy, int cacheSize, float flushFactor,
			int clusterDepth, int clusterBreadth, boolean printTrace) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
			options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
			options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
			options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
					MorsaResource.OPTION_PARTIAL_LOAD_STRATEGY);
			options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_DEPTH,
					clusterDepth);
			options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_BREADTH,
					clusterBreadth);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
			options.put(MorsaResource.OPTION_OVERWRITE_ROOTS, false);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			long l = System.currentTimeMillis();

			morsaResource.load(options);

			EObject obj = morsaResource.loadObject(objectURI);
			System.out.println("OBJECT FOUND: " + obj);

			EObject newContainer = morsaResource.loadObject(newContainerURI);
			System.out.println("NEW CONTAINER FOUND: " + newContainer);

			EReference containmentFeature = null;
			for (EReference ref : newContainer.eClass().getEAllContainments()) {
				if (obj.eClass().equals(ref.getEType())
						|| obj.eClass().getEAllSuperTypes()
								.contains(ref.getEType())) {
					containmentFeature = ref;
					break;
				}
			}

			if (containmentFeature.isMany()) {
				((List<EObject>) newContainer.eGet(containmentFeature))
						.add(obj);
			} else
				newContainer.eSet(containmentFeature, obj);

			EObject oldContainer = morsaResource.loadObject(objectURI
					.substring(0, objectURI.lastIndexOf("/@")));
			System.out.println("OLD CONTAINER FOUND: " + oldContainer);

			EObject ancestor = morsaResource.getContainer(oldContainer);
			EcoreUtil.remove(oldContainer);

			morsaResource.save(options);

			System.out.println("QUERY TIME: "
					+ (System.currentTimeMillis() - l));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests the deletion of a single object or a model
	 * 
	 * @param rs
	 *            the ResourceSet
	 * @param morsaURI
	 *            the Morsa URI of the object to delete
	 * @param backendURI
	 *            the URI of the repository backend
	 * @param printTrace
	 *            trace print flag
	 * @param isRoot
	 *            true if the morsaURI corresponds to a (meta)model, false if it
	 *            corresponds to a single object
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testDelete(ResourceSet rs, String morsaURI,
			String backendURI, boolean printTrace, boolean isRoot) {
		Resource morsaResource = rs.createResource(URI.createURI(morsaURI));

		try {
			Map options = new HashMap();
			options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
			options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
			options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
					MorsaResource.OPTION_SINGLE_LOAD_STRATEGY);
			options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
			options.put(MorsaResource.OPTION_OVERWRITE_ROOTS, false);
			long l = System.currentTimeMillis();
			if (!isRoot) {
				morsaResource.load(options);
				((MorsaResource) morsaResource).deleteEObject(morsaURI);
				morsaResource.save(options);
			} else
				morsaResource.delete(options);

			// Thread.sleep(10000);
			System.out.println("DELETE TIME: "
					+ (System.currentTimeMillis() - l));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testReferencersFullLoad(ResourceSet rs, String morsaURI,
			String backendURI, boolean printTrace, boolean queryAsCode,
			boolean readOnly, boolean all) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, false);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage core = morsaResource
					.loadMetamodel("org.amma.dsl.jdt.core");
			registerPackages(core);
			testReferencersMorsa(morsaResource, all, queryAsCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testReferencersPartialLoad(ResourceSet rs,
			String morsaURI, String backendURI, String cachePolicy,
			int cacheSize, float flushFactor, int clusterDepth,
			int clusterBreadth, boolean printTrace, boolean queryAsCode,
			boolean readOnly, boolean all) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
		options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
		options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
		options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
				MorsaResource.OPTION_PARTIAL_LOAD_STRATEGY);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_DEPTH, clusterDepth);
		options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_BREADTH,
				clusterBreadth);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage core = morsaResource
					.loadMetamodel("org.amma.dsl.jdt.core");
			registerPackages(core);
			testReferencersMorsa(morsaResource, all, queryAsCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testReferencersSingleLoad(ResourceSet rs,
			String morsaURI, String backendURI, String cachePolicy,
			int cacheSize, float flushFactor, boolean printTrace,
			boolean queryAsCode, boolean readOnly, boolean all) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
		options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
		options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
		options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
				MorsaResource.OPTION_SINGLE_LOAD_STRATEGY);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage core = morsaResource
					.loadMetamodel("org.amma.dsl.jdt.core");
			registerPackages(core);
			testReferencersMorsa(morsaResource, all, queryAsCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testInclusionFullLoad(ResourceSet rs, String morsaURI,
			String backendURI, boolean printTrace, boolean queryAsCode,
			boolean readOnly, boolean all) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, false);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage core = morsaResource
					.loadMetamodel("org.amma.dsl.jdt.core");
			registerPackages(core);

			testInclusionMorsa(morsaResource, queryAsCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testInclusionPartialLoad(ResourceSet rs,
			String morsaURI, String backendURI, String cachePolicy,
			int cacheSize, float flushFactor, int clusterDepth,
			int clusterBreadth, boolean printTrace, boolean queryAsCode,
			boolean readOnly, boolean all) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
		options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
		options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
		options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
				MorsaResource.OPTION_PARTIAL_LOAD_STRATEGY);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_DEPTH, clusterDepth);
		options.put(MorsaResource.OPTION_DEFAULT_CLUSTER_BREADTH,
				clusterBreadth);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage core = morsaResource
					.loadMetamodel("org.amma.dsl.jdt.core");
			registerPackages(core);
			testInclusionMorsa(morsaResource, queryAsCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static public void testInclusionSingleLoad(ResourceSet rs, String morsaURI,
			String backendURI, String cachePolicy, int cacheSize,
			float flushFactor, boolean printTrace, boolean queryAsCode,
			boolean readOnly, boolean all) {
		MorsaResource morsaResource = (MorsaResource) rs.createResource(URI
				.createURI(morsaURI));
		Map options = new HashMap();
		options.put(MorsaResource.OPTION_SERVER_URI, backendURI);
		options.put(MorsaResource.OPTION_CACHE_POLICY, cachePolicy);
		options.put(MorsaResource.OPTION_MAX_CACHE_SIZE, cacheSize);
		options.put(MorsaResource.OPTION_CACHE_FLUSH_FACTOR, flushFactor);
		options.put(MorsaResource.OPTION_DEMAND_LOAD_STRATEGY,
				MorsaResource.OPTION_SINGLE_LOAD_STRATEGY);
		options.put(MorsaResource.OPTION_DEMAND_LOAD, true);
		options.put(MorsaResource.OPTION_PRINT_TRACE, printTrace);
		if (readOnly)
			options.put(MorsaResource.OPTION_READ_ONLY_MODE, true);

		long l = System.currentTimeMillis();
		try {
			morsaResource.load(options);
			EPackage core = morsaResource
					.loadMetamodel("org.amma.dsl.jdt.core");
			registerPackages(core);
			testInclusionMorsa(morsaResource, queryAsCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("QUERY TIME: " + (System.currentTimeMillis() - l));
	}

	static private void checkTypeDeclaration(EObject typeDeclaration) {
		EPackage dom = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.dom");
		EClass typeDeclarationClass = (EClass) dom
				.getEClassifier("TypeDeclaration");
		EClass methodDeclarationClass = (EClass) dom
				.getEClassifier("MethodDeclaration");
		EClass modifierClass = (EClass) dom.getEClassifier("Modifier");
		EClass simpleNameClass = (EClass) dom.getEClassifier("SimpleName");

		EObject typeName = (EObject) typeDeclaration.eGet(typeDeclarationClass
				.getEStructuralFeature("name"));
		if (typeName == null)
			return;

		String typeQName = (String) typeName.eGet(typeName.eClass()
				.getEStructuralFeature("fullyQualifiedName"));
		EReference bodyDeclarationsRef = (EReference) typeDeclarationClass
				.getEStructuralFeature("bodyDeclarations");

		Object o = typeDeclaration.eGet(bodyDeclarationsRef);
		if (o != null) {
			List<EObject> bodyDeclarationList = (List<EObject>) o;
			boolean found = false;
			for (int j = 0; j < bodyDeclarationList.size() && !found; j++) {
				EObject bodyDeclaration = bodyDeclarationList.get(j);
				if (bodyDeclaration.eClass() == methodDeclarationClass) {
					EReference modifiersRef = (EReference) methodDeclarationClass
							.getEStructuralFeature("modifiers");
					Object o2 = bodyDeclaration.eGet(modifiersRef);
					if (o2 != null) {
						List<EObject> modifiersList = (List<EObject>) o2;
						boolean foundStatic = false;
						boolean foundPublic = false;
						for (int k = 0; k < modifiersList.size(); k++) {
							EObject modifier = modifiersList.get(k);
							if (modifier.eClass() == modifierClass) {
								boolean isStatic = (Boolean) modifier
										.eGet(modifierClass
												.getEStructuralFeature("static"));
								boolean isPublic = (Boolean) modifier
										.eGet(modifierClass
												.getEStructuralFeature("public"));
								if (isStatic)
									foundStatic = true;
								if (isPublic)
									foundPublic = true;
							}
						}

						if (foundStatic && foundPublic) {
							EReference returnTypeRef = (EReference) methodDeclarationClass
									.getEStructuralFeature("returnType");
							Object o3 = bodyDeclaration.eGet(returnTypeRef);
							if (o3 != null) {
								EObject returnType = (EObject) o3;
								EReference typeNameRef = (EReference) returnType
										.eClass().getEStructuralFeature("name");

								if (typeNameRef != null) {
									EObject returnTypeName = (EObject) returnType
											.eGet(typeNameRef);
									if (returnTypeName != null) {
										String returnTypeQName = (String) returnTypeName
												.eGet(returnTypeName
														.eClass()
														.getEStructuralFeature(
																"fullyQualifiedName"));
										if (returnTypeQName.equals(typeQName)) {
											EObject simpleName = (EObject) bodyDeclaration
													.eGet(methodDeclarationClass
															.getEStructuralFeature("name"));
											System.out
													.println(typeQName
															+ " : "
															+ simpleName
																	.eGet(simpleNameClass
																			.getEStructuralFeature("fullyQualifiedName")));
											found = true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Executes the Grabats query on a model using the Morsa Query DSL
	 * 
	 * The query finds all classes (TypeDeclaration) that declare static public
	 * methods (MethodDeclaration) whose return type is the same class
	 * 
	 * This query can only be executed on a model that conforms to the metamodel
	 * defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param morsaResource
	 *            the Morsa resource that holds the model
	 */
	static private void grabatsQuery(MorsaResource morsaResource) {
		EPackage dom = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.dom");

		EClass typeDeclarationClass = (EClass) dom
				.getEClassifier("TypeDeclaration");
		EClass methodDeclarationClass = (EClass) dom
				.getEClassifier("MethodDeclaration");
		EClass simpleNameClass = (EClass) dom.getEClassifier("SimpleName");

		if (typeDeclarationQuery == null) {
			typeDeclarationQuery = SELECT(
					"org.amma.dsl.jdt.dom/TypeDeclaration").FROM(morsaResource)
					.asProxies().includeSubtypes().done();
		}

		Collection<EObject> typeDeclarationList = morsaResource
				.query(typeDeclarationQuery);

		for (EObject typeDeclaration : typeDeclarationList) {
			EObject typeDeclarationName = (EObject) typeDeclaration
					.eGet(typeDeclarationClass.getEStructuralFeature("name"));
			String typeDeclarationQName = (String) typeDeclarationName
					.eGet(typeDeclarationName.eClass().getEStructuralFeature(
							"fullyQualifiedName"));

			MorsaQuery query;

			if (morsaQueries.containsKey(typeDeclaration)) {
				query = morsaQueries.get(typeDeclaration);
			} else {
				query = SELECT("org.amma.dsl.jdt.dom/MethodDeclaration")
						.FROM(typeDeclaration)
						.WHERE(navigate("returnType")
								.ofType("org.amma.dsl.jdt.dom/SimpleType")
								.navigate("name")
								.ofType("org.amma.dsl.jdt.dom/SimpleName")
								.STREQ("fullyQualifiedName",
										typeDeclarationQName))
						.AND(navigate("modifiers").ofType(
								"org.amma.dsl.jdt.dom/Modifier").BOOLEQ(
								"static", true))
						.AND(navigate("modifiers").ofType(
								"org.amma.dsl.jdt.dom/Modifier").BOOLEQ(
								"public", true)).asProxies().includeSubtypes()
						.done();
				morsaQueries.put(typeDeclaration, query);
			}

			Collection<EObject> result = morsaResource.query(query);
			if (!result.isEmpty()) {
				EObject obj = result.iterator().next();
				EObject simpleName = (EObject) obj.eGet(methodDeclarationClass
						.getEStructuralFeature("name"));
				System.out.println("FOUND: "
						+ typeDeclarationQName
						+ " : "
						+ simpleName.eGet(simpleNameClass
								.getEStructuralFeature("fullyQualifiedName")));
			}
		}
	}

	/**
	 * Executes the Grabats query on a model using EMF code
	 * 
	 * The query finds all classes (TypeDeclaration) that declare static public
	 * methods (MethodDeclaration) whose return type is the same class
	 * 
	 * This query can only be executed on a model that conforms to the metamodel
	 * defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param morsaResource
	 *            the Morsa resource that holds the model
	 */
	static private void grabatsQueryAsCode(
			Collection<EObject> typeDeclarationList, String queryEngine) {
		Iterator<EObject> typeDeclarationIterator = typeDeclarationList
				.iterator();
		while (typeDeclarationIterator.hasNext()) {
			EObject typeDeclaration = typeDeclarationIterator.next();
			if (queryEngine.equals("emf"))
				checkTypeDeclaration(typeDeclaration);
		}
	}

	static private void testInclusionMorsa(MorsaResource morsaResource,
			boolean queryAsCode) {
		if (queryAsCode) {
			Collection<EObject> typeList = morsaResource.loadObjects(
					"org.amma.dsl.jdt.dom", "Type", true, true);
			inclusionQueryAsCode(typeList);
		} else {
			inclusionQuery(morsaResource);
		}
	}

	static private void inclusionQuery(MorsaResource morsaResource) {
		EPackage core = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.core");

		Collection<EObject> typeList = SELECT("org.amma.dsl.jdt.dom/Type")
				.FROM(morsaResource).asProxies().find();
		for (EObject type : typeList) {
			System.out.println(type + " :: "
					+ morsaResource.include(typeList, type) + " :: "
					+ morsaResource.include(typeList, core));
		}

		typeList = SELECT("org.amma.dsl.jdt.dom/Type").FROM(morsaResource)
				.asProxies().find();
		for (EObject type : typeList) {
			Collection<EObject> methods = (Collection<EObject>) type.eGet(type
					.eClass().getEStructuralFeature("methods"));
			if (methods != null && !methods.isEmpty()) {
				System.out.println(type
						+ " :: "
						+ morsaResource.include(type, "methods", methods
								.iterator().next()) + " :: "
						+ morsaResource.include(type, "methods", type));
			}
		}
	}

	static private void inclusionQueryAsCode(Collection<EObject> typeList) {
		EPackage core = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.core");

		for (EObject type : typeList) {
			System.out.println(type + " :: " + typeList.contains(type) + " :: "
					+ typeList.contains(core));
		}

		for (EObject type : typeList) {
			Collection<EObject> methods = (Collection<EObject>) type.eGet(type
					.eClass().getEStructuralFeature("methods"));
			if (methods != null && !methods.isEmpty()) {
				System.out.println(type
						+ " :: "
						+ methods.contains((methods.iterator().next()) + " :: "
								+ methods.contains(type)));
			}
		}
	}

	static private void referencersQuery(MorsaResource morsaResource,
			boolean all) {
		Collection<EObject> typeList = SELECT("org.amma.dsl.jdt.core/IType")
				.FROM(morsaResource).asProxies().find();
		for (EObject type : typeList) {
			Collection<EObject> refs = all ? morsaResource.getReferencers(type,
					true) : SELECT("org.amma.dsl.jdt.core/ICompilationUnit")
					.FROM(morsaResource)
					.WHERE(navigate("types").ofType(
							"org.amma.dsl.jdt.core/IType").CONTAINS(type))
					.asProxies().includeSubtypes().find();
			if (!refs.isEmpty())
				System.out.println(type);
			for (EObject ref : refs) {
				System.out.println("\t" + ref);
			}
		}
	}

	static private void testReferencersMorsa(MorsaResource morsaResource,
			boolean all, boolean queryAsCode) {
		if (queryAsCode) {
			Collection<EObject> typeList = SELECT("org.amma.dsl.jdt.core/IType")
					.FROM(morsaResource).asProxies().find();
			for (EObject type : typeList)
				referencersQueryAsCode(type, morsaResource, all);
		} else
			referencersQuery(morsaResource, all);
	}

	static private void referencersQueryAsCode(EObject type, Resource resource,
			boolean all) {
		EPackage core = EPackage.Registry.INSTANCE
				.getEPackage("org.amma.dsl.jdt.core");
		EClass compilationUnitClass = (EClass) core
				.getEClassifier("ICompilationUnit");

		System.out.println(type);
		Iterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (all) {
				for (EReference ref : obj.eClass().getEAllReferences()) {
					if (ref.getEReferenceType().isSuperTypeOf(
							compilationUnitClass)) {
						List<EObject> refValues = ref.isMany() ? (List<EObject>) obj
								.eGet(ref) : Collections
								.singletonList((EObject) obj.eGet(ref));
						if (refValues.contains(type)) {
							System.out.println("\t" + obj);
						}
					}
				}
				System.out.println("\t" + obj);
			} else if (obj.eClass().equals(compilationUnitClass)
					&& ((List<EObject>) obj.eGet(compilationUnitClass
							.getEStructuralFeature("types"))).contains(type)) {
				System.out.println("\t" + obj);
			}
		}
	}

	/**
	 * Registers an EPackage and all its subpackages in the global package
	 * registry
	 * 
	 * @param root
	 *            the EPackage
	 */
	static private List<EPackage> registerPackages(EPackage root) {
		ArrayList<EPackage> result = new ArrayList<EPackage>();
		result.add(root);
		if (!root.getNsURI().equals(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(root.getNsURI(), root);
			for (EPackage pkg : root.getESubpackages()) {
				List<EPackage> pkgs = registerPackages(pkg);
				result.addAll(pkgs);
			}
		}
		return result;
	}

	static private void testGrabatsMorsa_Transformation(MorsaResource morsaResource,
			String queryEngine, List<EPackage> pkgs) throws IOException {
		if (queryEngine.equals("emf") || queryEngine.equals("ocl")) {
			if (typeDeclarationQuery == null) {
				typeDeclarationQuery = SELECT(
						"org.amma.dsl.jdt.dom/TypeDeclaration")
						.FROM(morsaResource).asProxies().includeSubtypes()
						.done();
			}

			Collection<EObject> typeDeclarationList = morsaResource
					.query(typeDeclarationQuery);

			int i = 0;
			for (EObject eObject : typeDeclarationList) {
				// System.out.println(eObject);
				i++;
			}
			System.out.println(i);
			transformToKdm(typeDeclarationList, pkgs);
			// grabatsQueryAsCode(typeDeclarationList, queryEngine);
		} else
			grabatsQuery(morsaResource);
	}

	/**
	 * Traverses a model in depth first or breadth first order
	 * 
	 * @param morsaResource
	 *            the resource that contains the model
	 * 
	 * @param order
	 *            DEPTH_FIRST_ORDER for depth first order, BREADTH_FIRST_ORDER
	 *            for breadth first order
	 * @return
	 */
	static private int traverseModel(Resource morsaResource, int order) {
		int objectCount = 0;

		EObject[] contents = (EObject[]) morsaResource.getContents().toArray();

		for (EObject content : contents) {
			List<EObject> children = new LinkedList<EObject>();
			children.add(content);

			while (!children.isEmpty()) {
				EObject child = children.remove(0);

				switch (order) {
				case DEPTH_FIRST_ORDER:
					children.addAll(0, child.eContents());
					break;
				case BREADTH_FIRST_ORDER:
					children.addAll(child.eContents());
					break;
				}

				// if (child.eIsProxy()) {
				// System.out.println("FAILED. PROXY UNRESOLVED: "
				// + ((InternalEObject) child).eProxyURI().fragment());
				// }
				if (!child.eIsProxy())
					objectCount++;
			}
		}

		return objectCount;
	}

	/**
	 * Executes the update of a model using the Morsa repository. The update
	 * executes the Grabats query over a model and depending on the number of
	 * results it performs one of the following actions:
	 * 
	 * 1. If the result size is 0, it does nothing 2. If the result size is 1,
	 * that object is deleted 3. If the result size is 2, parents are exchanged
	 * between both objects 4. If the result size is greater than 2, parents are
	 * exchanged between the first and the last objects and the object in the
	 * middle is deleted
	 * 
	 * This update can only be executed on a model that conforms to the
	 * metamodel defined by the following EPackages: org.amma.dsl.jdt.dom,
	 * org.amma.dsl.jdt.ast, org.amma.dsl.jdt.primitiveTypes
	 * 
	 * @param morsaResource
	 *            the Morsa EMF Resource
	 * @param options
	 *            the options for the Morsa EMF Resource the ResourceSet
	 */
	static private void update(MorsaResource morsaResource, Map options) {
		List<EObject> foundObjs = new LinkedList<EObject>();

		EPackage dom = morsaResource.loadMetamodel("org.amma.dsl.jdt.dom");
		EClass typeDeclarationClass = (EClass) dom
				.getEClassifier("TypeDeclaration");
		EClass methodDeclarationClass = (EClass) dom
				.getEClassifier("MethodDeclaration");
		EClass modifierClass = (EClass) dom.getEClassifier("Modifier");
		EClass simpleNameClass = (EClass) dom.getEClassifier("SimpleName");
		EClass simpleTypeClass = (EClass) dom.getEClassifier("SimpleType");
		Collection<EObject> typeDeclarationList = morsaResource.loadObjects(
				typeDeclarationClass, false, -1, true);
		for (EObject typeDeclaration : typeDeclarationList) {
			EObject typeDeclarationName = (EObject) typeDeclaration
					.eGet(typeDeclarationClass.getEStructuralFeature("name"));
			String typeDeclarationQName = (String) typeDeclarationName
					.eGet(typeDeclarationName.eClass().getEStructuralFeature(
							"fullyQualifiedName"));
			Condition condition = new REF(methodDeclarationClass, "returnType",
					new REF(simpleTypeClass, "name", new STREQ(simpleNameClass,
							"fullyQualifiedName", typeDeclarationQName)))
					.AND(new REF(methodDeclarationClass, "modifiers",
							new BOOLEQ(modifierClass, "static", true))
							.AND(new REF(methodDeclarationClass, "modifiers",
									new BOOLEQ(modifierClass, "public", true))));

			// Collection<EObject> result = morsaResource.query(typeDeclaration,
			// condition, true, -1, -1, true);
			// if (!result.isEmpty()) {
			// System.err.println("FOUND " + typeDeclaration);
			// foundObjs.add(typeDeclaration);
			// }
		}

		if (foundObjs.size() > 0) {
			long l = System.currentTimeMillis();

			EObject firstResult = foundObjs.get(0);
			EReference firstContainingFeature = (EReference) firstResult
					.eContainingFeature();
			EObject firstContainer = firstResult.eContainer();

			if (foundObjs.size() > 1) {
				EObject lastResult = foundObjs.get(foundObjs.size() - 1);
				EReference lastContainingFeature = (EReference) lastResult
						.eContainingFeature();
				EObject lastContainer = lastResult.eContainer();

				if (firstResult.eContainingFeature().isMany()) {
					((List<EObject>) firstContainer
							.eGet(firstContainingFeature)).set(
							((List<EObject>) firstContainer
									.eGet(firstContainingFeature))
									.indexOf(firstResult), lastResult);
				} else {
					firstContainer.eSet(firstResult.eContainingFeature(),
							lastResult);
				}

				if (lastContainingFeature.isMany()) {
					((List<EObject>) lastContainer.eGet(lastContainingFeature))
							.add(firstResult);
				} else {
					lastContainer.eSet(lastContainingFeature, firstResult);
				}

				if (foundObjs.size() > 2) {
					EObject middleResult = foundObjs
							.get((foundObjs.size() - 1) / 2);
					EObject middleContainer = middleResult.eContainer();

					if (middleResult.eContainingFeature().isMany()) {
						((List<EObject>) middleContainer.eGet(middleResult
								.eContainingFeature())).remove(middleResult);
					} else {
						middleContainer.eUnset(middleResult
								.eContainingFeature());
					}
				}
			}

			else {
				if (firstResult.eContainingFeature().isMany()) {
					((List<EObject>) firstContainer.eGet(firstResult
							.eContainingFeature())).remove(firstResult);
				} else {
					firstContainer.eUnset(firstResult.eContainingFeature());
				}
			}

			try {
				morsaResource.save(options);
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("UPDATE TIME: "
					+ (System.currentTimeMillis() - l));
		}
	}

	static private Map<String, String> mapArgs(String[] args) {
		Map<String, String> argMap = new HashMap<String, String>();

		for (String arg : args) {
			String[] splittedArg = arg.split("=");
			argMap.put(splittedArg[0], splittedArg[1]);
		}

		return argMap;
	}
}
