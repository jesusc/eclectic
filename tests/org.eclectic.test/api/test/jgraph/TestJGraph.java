package test.jgraph;

import java.awt.Color;

import javax.swing.JFrame;

import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApiDescriptionLanguageLoader;
import org.eclectic.frontend.api.MappingsCompiler;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;

import com.mxgraph.layout.mxGraphLayout;
import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class TestJGraph {
	public static void main(String[] args) throws Exception {	
	     System.setProperty("org.apache.commons.logging.Log",
                 "org.apache.commons.logging.impl.NoOpLog");

		//createMxGraph(null);
		
		new TestJGraph().testPetriNet2JGraph();
	}
	
	
	public void testPetriNet2JGraph() throws Exception {
		JVMCompilationResult executor = new MappingsCompiler().
				withMetamodelManager(new MetamodelManager().addMetamodelLoader(new ApiDescriptionLanguageLoader())).
				execute(withDir("api/test/jgraph/petrinet2jgraph.map"));
		
		
		Util.registerResourceFactory();

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("../../runtime-Eclectic2/eclectic.test.jvm_integration/fixtures/metamodels/petrinet.ecore"), 
				withDir("../../runtime-Eclectic2/eclectic.test.jvm_integration/fixtures/models/petrinet1.xmi")); 
		
		/*
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("fixtures/metamodels/JGraph.ecore"), 
				withDir("_tmp/jgraph-output.xmi")); 
		*/

		
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		ApiDescription api = (ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load("api/test/jgraph/jgraph.apidesc");
		ApiModel out = apiLoader.emptyModelFromDescription(api);
		
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "petrinet2jgraph");

		//out.serialize();
		
		mxGraph g = (mxGraph) out.allObjectsOf("Graph").get(0);
		createMxGraph(g);
		
	}

	
	
	private static void createMxGraph(mxGraph graph) {
		class GraphFrame extends JFrame {
			public void drawGraph(mxGraph graph) {
		        
				mxGraphLayout layout = new mxOrganicLayout(graph); //new mxCompactTreeLayout(graph);  
		        layout.execute(graph.getDefaultParent());

		        mxGraphComponent graphComponent = new mxGraphComponent(graph);        
		        graphComponent.getViewport().setOpaque(true);
		        graphComponent.getViewport().setBackground(Color.WHITE);
		        
		        this.getContentPane().add(graphComponent);
		        
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        this.setSize(400, 400);
		        this.setVisible(true);
			}
		}
		
		if ( graph == null ) {
			// Configure graph
			graph = new mxGraph();
			
			mxCell place1 = new mxCell();
			place1.setValue("A");
			place1.setVertex(true);
			place1.setId("A");
			place1.setGeometry(new mxGeometry(0, 0, 20, 20));
			 //mxConstants.SHAPE_RECTANGLE
			mxCell place2 = new mxCell();
			place2.setValue("B");
			place2.setVertex(true);
			place2.setId("B");
			place2.setGeometry(new mxGeometry(0, 0, 20, 20));

			mxCell transition_p1_p2 = new mxCell();
			transition_p1_p2.setValue("Transition_p1_p2");
			transition_p1_p2.setVertex(true);
			transition_p1_p2.setId("Transitoin_p1_p2");			
			transition_p1_p2.setGeometry(new mxGeometry(0, 0, 20, 20));
						
			mxCell link1_t = new mxCell();
			link1_t.setEdge(true);
			link1_t.setSource(place1);
			link1_t.setTarget(transition_p1_p2);
			link1_t.setGeometry(new mxGeometry());

			mxCell link_t_2 = new mxCell();
			link_t_2.setEdge(true);
			link_t_2.setSource(transition_p1_p2);
			link_t_2.setTarget(place2);
			link_t_2.setGeometry(new mxGeometry());


			graph.addCell(place1);
			graph.addCell(place2);
			graph.addCell(link1_t);
			graph.addCell(link_t_2);	
			graph.addCell(transition_p1_p2);
		}
		// End-of configure graph
		
		GraphFrame graphFrame = new GraphFrame();
		graphFrame.drawGraph(graph);
	}

	public String withDir(String f) {
		String home = System.getenv("HOME");
		if ( home == null || home.isEmpty() ) 
			throw new RuntimeException("No HOME directory defined!");
		
		String d = home + "/usr/qool/workspace/org.eclectic.test/";
		return d + f;
	}

}
