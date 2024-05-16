package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class TestSuma {

	@Test
	void testSuma() {
		 assertEquals(5, Calculadora.suma(2, 3));
	}
}


