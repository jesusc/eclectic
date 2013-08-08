package org.eclectic.ttc2013.flowgraphs;

import java.io.File;
import java.net.URL;
import java.util.Collection;

import meteoric.at3rdx.kernel.Model;
import meteoric.at3rdx.kernel.Node;
import meteoric.at3rdx.kernel.VirtualMachine;
import meteoric.at3rdx.parse.ParserRegistry;
import meteoric.at3rdx.shell.commands.Environment;
import meteoric.at3rdx.shell.commands.LoadMDFile;
import meteoric.at3rdx.syntax.bootstrapping.BootstrappingV0;
import meteoric.at3rdx.syntax.test.TestableShell;

public class ReadPDG extends TestableShell {
	public static void main(String[] args) throws Exception {
		ReadPDG shell = new ReadPDG();
		shell.init();

		ParserRegistry.getRegistry();
		shell.execute("dsl/test0.validate");	
	}

	public Model execute(String dslFile) throws Exception  {
		Environment.getEnv().setValue("DIR", "dsl");
		Environment.getEnv().setValue("OUT", "bin/");
		Environment.getEnv().setValue("SRL", "src/");

		ParserRegistry.getRegistry().register("textual", "src/serializers/TextualSyntax_V1Interpreter.java");
		
		boolean LOAD_SYNTAX_DEFINITION = true;
		
		if ( LOAD_SYNTAX_DEFINITION ) {
			//URL r = BootstrappingV0.class.getResource("TextualSyntax.mdepth");
			//LoadMDFile l           = new LoadMDFile(r.getFile());
			LoadMDFile l           = new LoadMDFile("../lib/TextualSyntax.mdepth");
			l.Execute();
		}
		
		if ( LOAD_SYNTAX_DEFINITION ) {	
			System.out.println("Compiling textual syntax...");
			Model m = readDslDefinition("ValidationDSLSyntax", new File("dsl/validation_dsl.textual").getAbsolutePath(), "textual");
			m.setAttribute("parserCompiler", "ANTLR_FULL_TREE");

			compile(m);
		} else {
			LoadMDFile l           = new LoadMDFile(new File(sampleFile("dsl/validation_dsl.mdepth")).getAbsolutePath());
			l.Execute();			
		}
		
		System.out.println("");
		System.out.println("Reading text (Model) ...");
		ParserRegistry.getRegistry().register("validate", "src/serializers/ValidationDSLInterpreter.java");
		Model m2 = readDslDefinition("test0", new File(dslFile).getAbsolutePath(), "validate");
		//dumpModel(m2);
	
		return m2;
	}

}
