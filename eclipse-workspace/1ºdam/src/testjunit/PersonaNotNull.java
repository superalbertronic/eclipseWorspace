package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaNotNull {

	@Test
	void test() {
			Persona persona = new Persona();
	        int edadObtenida = persona.obtenerEdad(25);

	        assertNotNull( edadObtenida);
	}

}
