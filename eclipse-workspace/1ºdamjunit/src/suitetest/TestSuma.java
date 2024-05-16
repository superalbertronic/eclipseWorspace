package suitetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tstsuite.Calculadora;

class TestSuma {

	@Test
	void test() {
		 assertEquals(5, Calculadora.suma(2, 3));
		
	}

}
