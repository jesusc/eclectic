package test.base;

import java.io.File;

public abstract class BaseTest {
	private long init;
		
	public void init(String name) {
		init = System.currentTimeMillis();
		System.out.println("Starting " + name);
	}
	

	public void finish() {
		System.out.println("Finished in " + (System.currentTimeMillis() - init) / 1000.0);
	}

	
	public String withDir(String f) {
		return new File(".").getAbsolutePath() + File.separator + f;		
		/*
		String home = System.getenv("HOME");
		if ( home == null || home.isEmpty() ) 
			throw new RuntimeException("No HOME directory defined!");
		
		String d = home + "/usr/qool/workspace/org.eclectic.test/";
		return d + f;
		*/
	}
}
