package org.eclectic.test;

public class BaseTest {
	public String withDir(String f) {
		String home = System.getenv("HOME");
		if ( home == null || home.isEmpty() ) 
			throw new RuntimeException("No HOME directory defined!");
		
		String d = home + "/usr/qool/workspace/org.eclectic.test/";
		return d + f;
	}
}
