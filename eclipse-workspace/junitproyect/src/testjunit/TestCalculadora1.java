package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculadora1 {

	@Test
	void testSuma() {
		 assertEquals(5, Calculadora.suma(2, 3));
	}

	@Test
	void testResta() {
		 assertEquals(5, Calculadora.resta(2, 3));
	}

}
