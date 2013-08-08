package org.eclectic.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	test.umlcopy.TestScript.class, 
	test.umlcopy.TestQool.class 
})
public class AllTests {

}
