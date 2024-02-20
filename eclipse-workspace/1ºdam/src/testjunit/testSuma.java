package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class testCalculadora {
	@Test
    public void testsuma() {
		
        assertEquals(5, Calculadora.suma(2, 3));
    }
}

