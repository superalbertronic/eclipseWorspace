package tstsuite;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

// extens testCase y poner public y a�adir un constructor
// es para poder usar suitetest de junit
public class TestMulti {
	
	@Test
    public void testMulti() {
		
        assertEquals(6, Calculadora.multi(2, 3));
       
    }
	
	
}
