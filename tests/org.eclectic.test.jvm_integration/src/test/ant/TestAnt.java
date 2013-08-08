package test.ant;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DemuxInputStream;
import org.apache.tools.ant.DemuxOutputStream;
import org.apache.tools.ant.MagicNames;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.apache.tools.ant.PropertyHelper;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.launch.AntMain;
import org.apache.tools.ant.property.ResolvePropertyMap;
import org.apache.tools.ant.util.ProxySetup;
import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import apimodel.ApiModelEasyDev;

import com.mxgraph.view.mxGraph;

import test.base.BaseTest;
import test.jgraph.TestJGraph;

public class TestAnt extends BaseTest {
	public static void main(String[] args) throws IOException {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

	     
		// new TestAnt().learn();
		new TestAnt().transform();
	}
	
	
	
    private void transform() throws IOException {
		//Project p = new TestAnt().readAnt(new File("/home/jesus/usr/qool/workspace/org.eclectic.idc/build-instrument.xml"), TestAnt.class.getClassLoader());
		Project p = new TestAnt().readAnt(new File(withDir("src/test/ant/eclipse-build-example.xml")), TestAnt.class.getClassLoader());

    	eclectic.ant2jgraph transformation = new eclectic.ant2jgraph();

		Util.registerResourceFactory();
		
		// Declare models
		ModelManager manager = new ModelManager();

		// TODO: HOW TO SELECT THE OBJECTS INVOLVED!!
		//ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		//ApiModel in = apiLoader.modelFromRoot(p, 
		//		withDir("src/test/ant/ant.apidesc"),
		//		new org.eclectic.apidesc.ApiDescriptionLanguageLoader()); 

		ApiModelEasyDev in = new ApiModelEasyDev(p, 
				(ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load(withDir("src/test/ant/ant.apidesc")), 
				new JavaListConverter());
		// TODO: This should be automatic?
		in.registerMethodHandler(new BasicMethodHandler(manager));
		
		ApiLoader apiLoader2 = new ApiLoader(new JavaListConverter());
		ApiDescription api = (ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load("src/test/jgraph/jgraph.apidesc");
		ApiModel out = apiLoader2.emptyModelFromDescription(api);
		
		manager.register("ant", in);
		manager.register("jgraph", out);
		
		// Execute
		init("ant2jgraph");
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
		finish();
	
		mxGraph g = (mxGraph) out.allObjectsOf("Graph").get(0);
		System.out.println(g);
		TestJGraph.createMxGraph(g);
	}



	private void learn() {
		Project p = new TestAnt().readAnt(new File("/home/jesus/usr/qool/workspace/org.eclectic.idc/build-instrument.xml"), TestAnt.class.getClassLoader());
		System.out.println( p.getTaskDefinitions() );
		System.out.println( p.getTargets() );
		System.out.println( "@@@" );
		
		Set set = p.getTargets().keySet();
		for (Object key : set) {
			Target t = (Target) p.getTargets().get(key);
			System.out.println("Target: " + t);
			Enumeration deps = t.getDependencies();
			
			while ( deps.hasMoreElements() ) {
				Object obj = deps.nextElement();
				System.out.println("--");
				System.out.println(obj);
				System.out.println(obj.getClass());
			}
		}		
	}



	private Properties definedProps = new Properties();

    private Project readAnt(File buildFile, ClassLoader coreLoader) throws BuildException {
    	/*
        if (!readyToRun) {
            return;
        }
        */

        final Project project = new Project();
        project.setCoreLoader(coreLoader);

        Throwable error = null;

        try {
            //addBuildListeners(project);
            //addInputHandler(project);

            PrintStream savedErr = System.err;
            PrintStream savedOut = System.out;
            InputStream savedIn = System.in;

            // use a system manager that prevents from System.exit()
            SecurityManager oldsm = null;
            oldsm = System.getSecurityManager();

                //SecurityManager can not be installed here for backwards
                //compatibility reasons (PD). Needs to be loaded prior to
                //ant class if we are going to implement it.
                //System.setSecurityManager(new NoExitSecurityManager());
            try {
                //if (allowInput) {
                //    project.setDefaultInputStream(System.in);
                //}
                System.setIn(new DemuxInputStream(project));
                System.setOut(new PrintStream(new DemuxOutputStream(project, false)));
                System.setErr(new PrintStream(new DemuxOutputStream(project, true)));


                //if (!projectHelp) {
                //   project.fireBuildStarted();
                //}

                // set the thread priorities
                /*
                if (threadPriority != null) {
                    try {
                        project.log("Setting Ant's thread priority to "
                                + threadPriority, Project.MSG_VERBOSE);
                        Thread.currentThread().setPriority(threadPriority.intValue());
                    } catch (SecurityException swallowed) {
                        //we cannot set the priority here.
                        project.log("A security manager refused to set the -nice value");
                    }
                }
                */
                

                project.init();

                // resolve properties
                PropertyHelper propertyHelper
                    = (PropertyHelper) PropertyHelper.getPropertyHelper(project);
                HashMap props = new HashMap(definedProps);
                new ResolvePropertyMap(project, propertyHelper,
                                       propertyHelper.getExpanders())
                    .resolveAllProperties(props, null, false);

                // set user-define properties
                for (Iterator e = props.entrySet().iterator(); e.hasNext(); ) {
                    Map.Entry ent = (Map.Entry) e.next();
                    String arg = (String) ent.getKey();
                    Object value = ent.getValue();
                    project.setUserProperty(arg, String.valueOf(value));
                }

                project.setUserProperty(MagicNames.ANT_FILE,
                                        buildFile.getAbsolutePath());
                project.setUserProperty(MagicNames.ANT_FILE_TYPE,
                                        MagicNames.ANT_FILE_TYPE_FILE);

                /*
                project.setKeepGoingMode(keepGoingMode);
                if (proxy) {
                    //proxy setup if enabled
                    ProxySetup proxySetup = new ProxySetup(project);
                    proxySetup.enableProxies();
                }
                */

                ProjectHelper.configureProject(project, buildFile);

                /*
                if (projectHelp) {
                    printDescription(project);
                    printTargets(project, msgOutputLevel > Project.MSG_INFO,
                            msgOutputLevel > Project.MSG_VERBOSE);
                    return;
                }
                */
                
                // make sure that we have a target to execute
                /*
                if (targets.size() == 0) {
                    if (project.getDefaultTarget() != null) {
                        targets.addElement(project.getDefaultTarget());
                    }
                }

                project.executeTargets(targets);
            	*/
                return project;
            } finally {
                // put back the original security manager
                //The following will never eval to true. (PD)
                if (oldsm != null) {
                    System.setSecurityManager(oldsm);
                }

                System.setOut(savedOut);
                System.setErr(savedErr);
                System.setIn(savedIn);
            }
        } catch (RuntimeException exc) {
            error = exc;
            throw exc;
        } catch (Error e) {
            error = e;
            throw e;
        } finally {
            /*
        	if (!projectHelp) {
                try {
                    project.fireBuildFinished(error);
                } catch (Throwable t) {
                    // yes, I know it is bad style to catch Throwable,
                    // but if we don't, we lose valuable information
                    System.err.println("Caught an exception while logging the"
                                       + " end of the build.  Exception was:");
                    t.printStackTrace();
                    if (error != null) {
                        System.err.println("There has been an error prior to"
                                           + " that:");
                        error.printStackTrace();
                    }
                    throw new BuildException(t);
                }
            } else if (error != null) {
                project.log(error.toString(), Project.MSG_ERR);
            }
            */
        }
    }
	
}
