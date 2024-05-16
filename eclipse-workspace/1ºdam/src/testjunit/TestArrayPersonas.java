package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestArrayPersonas {
		
	@Test
	void test() {
		ArrayPersonas personas = new ArrayPersonas();
		
        String[] nombresEsperados = {"Alberto", "Eva", "Cristina"};
        
        String[] nombresObtenidos = personas.getNombres();
       
        assertArrayEquals(nombresEsperados, nombresObtenidos);
	
	}

}
