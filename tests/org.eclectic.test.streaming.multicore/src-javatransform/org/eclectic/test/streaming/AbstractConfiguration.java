package org.eclectic.test.streaming;

import java.io.File;

public class AbstractConfiguration {

	public AbstractConfiguration() {
		super();
	}

	public String withDir(String f) {
		return new File(".").getAbsolutePath() + File.separator + f;		
	}

}