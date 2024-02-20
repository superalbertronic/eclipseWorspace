package proyectojunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraAreasTest {
    
    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(12.0, CalculadoraAreas.calcularAreaTriangulo(6.0, 4.0), 0.01);
        // Agrega más casos de prueba según sea necesario
    }
}
