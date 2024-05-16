package tstsuite;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

// extens testCase y poner public y a�adir un constructor
// es para poder usar suitetest de junit
public class TestSuma {
	@Test
    public void testSuma() {
	
        assertEquals(5, Calculadora.suma(2, 3));
      
    }
		
}
