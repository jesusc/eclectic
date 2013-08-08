package org.eclectic.test.streaming.javaparser;

import java.util.ArrayList;

import org.eclectic.streaming.fragments.EmfFragment;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.test.nativejavaparser.ejctree.EjctreePackage;
import org.eclipse.emf.ecore.EPackage;

import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;

public class TestParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<EPackage> list = new ArrayList<EPackage>();
		list.add(EjctreePackage.eINSTANCE);

		NativeJavaParser parser = new NativeJavaParser(new EmfFragmentFactory(list));
		JCCompilationUnit cu = parser.parse("../org.eclectic.test.streaming/src-gen/org/eclectic/test/streaming/dtrace/impl/ClassifierImpl.java");
		EmfFragment frg = (EmfFragment) parser.getFragment(cu);
		
		System.out.println(frg);
		for(int i = 0; i < frg.getObjects().length; i++) {
			System.out.println(frg.getObjects()[i]);
		}
	}

}
