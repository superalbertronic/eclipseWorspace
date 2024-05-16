package tstsuite;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteTest {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestSuite(TestSuma.class)); // Agrega el TestCase
        suite.addTest(new TestSuite(TestResta.class)); // Agrega el TestCase
        return suite;
    }
}
