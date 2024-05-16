package test1;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteTest {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestSuite(testCalculadora.class)); // Agrega el TestCase
       
        return suite;
    }
}
