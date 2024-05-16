package testjunit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestExcepciones {

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        Calculadora.division(10, 0);
    }
}
