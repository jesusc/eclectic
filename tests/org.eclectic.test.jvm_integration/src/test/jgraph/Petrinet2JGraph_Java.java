package test.jgraph;

import java.awt.Color;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ICollectionConverter;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EObject;

import test.base.BaseTest;

import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.layout.mxGraphLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

public class Petrinet2JGraph_Java extends BaseTest {
	public static void main(String[] args) throws Exception {	
		new Petrinet2JGraph_Java().start();
	}

	private BasicEMFModel in;
		
	public void start() throws Exception {
		Util.registerResourceFactory();
		EMFLoader    loader  = new EMFLoader(new IdentityListConverter());
		in  = loader.basicModelFromFile(
				withDir("../org.eclectic.test.jvm_integration/fixtures/metamodels/petrinet.ecore"), 
				withDir("../org.eclectic.test.jvm_integration/fixtures/models/petrinet1.xmi")); 

		mxGraph g = transform();
		TestJGraph.createMxGraph(g);
	}
	
	private HashMap<Object, Object> trace = new HashMap<Object, Object>();
	private mxGraph graph; 
	
	private mxGraph transform() {		
		graph = new mxGraph();
		//graph.getModel().beginUpdate();
		
		EObject pn = in.allObjectsOf("PetriNet").get(0);
		Collection<EObject> nodes = (Collection<EObject>) in.getFeature(pn, "nodes");
		for (EObject node : nodes) {
			if ( in.isKindOf(node, "Transition") ) {
				transformTransition(node);
			} else if ( in.isKindOf(node, "Place") )  {
				transformPlace(node);
			} else {
				throw new IllegalArgumentException();
			}
		}

		Collection<EObject> arcs = (Collection<EObject>) in.getFeature(pn, "arcs");
		for (EObject node : arcs) {
			transformArc(node);
		}

		for(Object o : trace.values()) {
			graph.addCell(o);
		}
		
		//graph.getModel().endUpdate();
		
		return graph;
	}

	private void transformPlace(EObject node) {
		String name = (String) in.getFeature(node, "name");

		mxGeometry g = new mxGeometry();
		g.setHeight(20);
		g.setWidth(20);
		mxCell placeCell = new mxCell();
		placeCell.setGeometry(g);
		placeCell.setId(name);
		placeCell.setValue("      0   p1");
		placeCell.setVertex(true);
		placeCell.setStyle(";shape=ellipse;strokeColor=black;fillColor=white;");
		// mxCell placeCell = (mxCell) graph.insertVertex(graph.getDefaultParent(), name, name, 0, 0, 20, 20, ";shape=ellipse;strokeColor=black;fillColor=white;");

		trace.put(node,  placeCell);
	}


	private void transformTransition(EObject node) {
		String name = (String) in.getFeature(node, "name");

		mxGeometry g = new mxGeometry();
		g.setHeight(20);
		g.setWidth(10);
		mxCell transitionCell = new mxCell();
		transitionCell.setGeometry(g);
		transitionCell.setId(name);
		transitionCell.setValue(name);
		transitionCell.setVertex(true);
		transitionCell.setStyle(";shape=rectangle;strokeColor=black;fillColor=black;");
		
		// mxCell transitionCell = (mxCell) graph.insertVertex(graph.getDefaultParent(), name, name, 0, 0, 20, 10, ";shape=ellipse;strokeColor=black;fillColor=black;");

		trace.put(node,  transitionCell);		
	}

	private void transformArc(EObject node) {
		Object source = trace.get( in.getFeature(node, "source") ); 
		Object target = trace.get( in.getFeature(node, "target") ); 

		mxCell arcCell = new mxCell();
		arcCell.setEdge(true);		
		arcCell.setSource((mxICell) source);
		arcCell.setTarget((mxICell) target);		
		trace.put(node,  arcCell);		

		// graph.insertEdge(graph.getDefaultParent(), "", "", source, target, "");
	}

	
	private class IdentityListConverter implements ICollectionConverter {

		@Override
		public Object convertList(Object list) {
			return list;
		}

		@Override
		public boolean isList(Object list) {
			return list instanceof Collection<?>;
		}

		@SuppressWarnings("unchecked")
		@Override
		public Iterator<Object> toIterator(Object list) {
			return (Iterator<Object>) ((Collection<?>) list).iterator();
		}

		@Override
		public Object convertToStreamingList(Object list) {
			throw new UnsupportedOperationException();
		}		
	}

}
