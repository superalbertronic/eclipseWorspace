package tstsuite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestResta.class, TestSuma.class, 
	TestDivi.class, TestMulti.class })

public class AllTests {

}
