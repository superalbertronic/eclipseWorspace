package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class testCalculadora {
    @Test
    public void testSuma() {
        assertEquals(5, Calculadora.suma(2, 3));
    }
}

