package org.eclectic.frontend.test;

import org.eclectic.frontend.test.expressions.TestExpressions;
import org.eclectic.frontend.test.ifexpr.TestIfExpr;
import org.eclectic.frontend.test.inplace.TestInplaceReplacement;
import org.eclectic.frontend.test.inplace.TestMoveReference;
import org.eclectic.frontend.test.optimizations.TestOptimizeMap;
import org.eclectic.frontend.test.optimizations.TestOptimizeMapAttribution;
import org.eclectic.frontend.test.patterns.TestNestedPattern;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestExpressions.class,
	TestIfExpr.class,
	
	// In-place
	TestInplaceReplacement.class,
	TestMoveReference.class,
	
	// Optimizations
	TestOptimizeMap.class,
	TestOptimizeMapAttribution.class,
	
	// Patterns
	TestNestedPattern.class
	})
public class AllTests {

}
