package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPersonaSame {

	@Test
	void test() {
		// Crear una instancia de Persona
        Persona persona1 = new Persona();
        Persona persona3= new Persona();
        // Asignar la misma instancia a otra variable
        Persona persona2 = persona1;

        // Verificar que persona1 y persona2 son la misma instancia
        assertSame(persona1, persona3);
    }
	}


