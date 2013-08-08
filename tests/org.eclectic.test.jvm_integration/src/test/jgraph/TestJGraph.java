package test.jgraph;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import java.util.LinkedList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;

import test.base.BaseTest;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.layout.mxFastOrganicLayout;
import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.layout.mxGraphLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

public class TestJGraph extends BaseTest {
	public static void main(String[] args) throws Exception {	
	     System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		//createMxGraph(null);
		
		new TestJGraph().testPetriNet2JGraph();
	}
	
	
	public void testPetriNet2JGraph() throws Exception {
		eclectic.petrinet2jgraph transformation = new eclectic.petrinet2jgraph();
		Util.registerResourceFactory();


		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("../org.eclectic.test.jvm_integration/fixtures/metamodels/petrinet.ecore"), 
				withDir("../org.eclectic.test.jvm_integration/fixtures/models/petrinet1.xmi")); 

		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		ApiDescription api = (ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load("src/test/jgraph/jgraph.apidesc");
		ApiModel out = apiLoader.emptyModelFromDescription(api);
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();


		mxGraph g = (mxGraph) out.allObjectsOf("Graph").get(0);

		createMxGraph(g);
	}

	
	
	public static void createMxGraph(mxGraph graph) {
		class GraphFrame extends JFrame {
			public void drawGraph(mxGraph graph) {
		        
				//mxGraphLayout layout = new mxCircleLayout(graph); //
				//mxGraphLayout layout = new mxCompactTreeLayout(graph);  
				mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);  
				layout.setOrientation(SwingConstants.WEST);
				layout.setUseBoundingBox(true);
				layout.setParentBorder(50);
				
				layout.execute(graph.getDefaultParent());
				
		        mxGraphComponent graphComponent = new mxGraphComponent(graph);        
		        /*
		        graphComponent.setBorder(new Border() {					
					@Override
					public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
						g.setColor(Color.WHITE);
					}
					
					@Override
					public boolean isBorderOpaque() {
						// TODO Auto-generated method stub
						return true;
					}
					
					@Override
					public Insets getBorderInsets(Component c) {
						return new Insets(10, 10, 10, 10);
					}
				});
		        */
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

			//mxConstants.SHAPE_RECTANGLE
			mxCell place2 = new mxCell();

			graph.addCell(place1);
			graph.addCell(place2);

			place1.setValue("A");
			place1.setVertex(true);
			place1.setId("A");
			place1.setGeometry(new mxGeometry(0, 0, 20, 20));

			place2.setValue("B");
			place2.setVertex(true);
			place2.setId("B");
			place2.setGeometry(new mxGeometry(0, 0, 20, 20));

			mxCell transition_p1_p2 = new mxCell();
			graph.addCell(transition_p1_p2);

			transition_p1_p2.setValue("Transition_p1_p2");
			transition_p1_p2.setVertex(true);
			transition_p1_p2.setId("Transitoin_p1_p2");			
			transition_p1_p2.setGeometry(new mxGeometry(0, 0, 20, 20));
						
			mxCell link1_t = new mxCell();
			link1_t.setGeometry(new mxGeometry());
			link1_t.setEdge(true);
			
			mxCell link_t_2 = new mxCell();
			link_t_2.setGeometry(new mxGeometry());
			link_t_2.setEdge(true);


			graph.addCell(link1_t);
			graph.addCell(link_t_2);	


			link1_t.setSource(place1);
			link1_t.setTarget(transition_p1_p2);


			link_t_2.setSource(transition_p1_p2);
			link_t_2.setTarget(place2);
			
		}
		// End-of configure graph
		
		/*
		mxCell root = ((mxCell) graph.getDefaultParent());
		mxCell[] cells = new mxCell[root.getChildCount()];
		for(int i = 0; i < root.getChildCount(); i++) {
			cells[i] = (mxCell) root.getChildAt(i);
		}
		*/
		
		GraphFrame graphFrame = new GraphFrame();
		graphFrame.drawGraph(graph);
	}

}
