package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import testjunit.Array1;

public class TestArray1 {

	@SuppressWarnings("deprecation")
	@Test
    public void testArray() {
        String [] espera = {"Eva", "Ana", "Alberto"};
        String [] resultado = {"Eva", "Ana", "Alberto"};
        assertEquals(espera, resultado);
    }	
	
}