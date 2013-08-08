package org.eclectic.jvm.devtools;

import org.apache.bcel.Repository;
import org.apache.bcel.verifier.Verifier;
import org.apache.bcel.verifier.VerifierFactory;

public class Verify {
	public static void main(String[] args) throws ClassNotFoundException {
		// String classname = "/home/jesus/usr/qool/workspace/tests/org.eclectic.frontend.test/eclectic-gen/eclectic/test_if_expr_forall.class";
		
		// String classname = "eclectic.invalid_code_length_tao$wrap_VirtualClassBinding";
		String classname = "eclectic.invalid_code_length_qool";
		
		System.out.println( Repository.getRepository().getClassPath() );
		Verifier.main(new String[] { classname });
		/*
		Verifier v = VerifierFactory.getVerifier(classname); //.doPass1(); // let observers do the rest.
		v.doPass1();
		v.doPass2();
		v.doPass3a(method_no)
		String[] messages = v.getMessages();
		for (String string : messages) {
			System.out.println(string);
		}
		
		if ( messages.length == 0 ) {
			System.out.println("No problems.");
		}
		
		*/
	}
}
