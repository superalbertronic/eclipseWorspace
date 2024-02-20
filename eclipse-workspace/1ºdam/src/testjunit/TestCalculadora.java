package testjunit;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
public class TestCalculadora {

	@Test
    public void testSuma() {
        int espera = 6;
        int actual = Calculadora.suma(6,0);
        assertEquals(espera, actual);
    }
	@Test
    public void testResta() {
        int espera = 2;
        int actual = Calculadora.resta(5,3);
        assertEquals(espera, actual);
    }
	@Test
    public void testMulti() {
        int espera = 15;
        int actual = Calculadora.multi(5,3);
        assertEquals(espera, actual);
    }
	@Test
    public void testDivi() {
        int espera = 1;
        int actual = Calculadora.division(4,3);
        assertEquals(espera, actual);
    }
}
