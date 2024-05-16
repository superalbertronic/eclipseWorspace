package tstsuite;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

// extens testCase y poner public y a�adir un constructor
// es para poder usar suitetest de junit
public class TestDivi {
	@Test
    public void testDivi() {
		
        assertEquals(2, Calculadora.division(4, 2));
       
    }
	
	
}
