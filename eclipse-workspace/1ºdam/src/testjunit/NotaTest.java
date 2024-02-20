package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	 @Test
	    public void testNotaSuspenso() {
	        Nota nota = new Nota();
	        String resultado = nota.calcularNivelNota(8);
	        assertEquals("Suspenso", resultado);
	    }

}
