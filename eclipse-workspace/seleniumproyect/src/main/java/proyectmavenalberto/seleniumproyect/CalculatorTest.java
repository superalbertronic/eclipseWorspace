package proyectmavenalberto.seleniumproyect;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculatorTest {
  
  public void testAddition() {
    // Creamos un mock de una clase Sumador
    Sumador mockSumador = mock(Sumador.class);
    
    // Configuramos el comportamiento del mock
    when(mockSumador.sumar(1, 2)).thenReturn(3);
    
    // Creamos una instancia de Calculadora y le pasamos el mock de Sumador
    Calculadora calculator = new Calculadora(mockSumador);
    
    // Verificamos que la operación de suma sea correcta
    assertEquals(3, calculator.sumar(1, 2));
  }
  
  // Clase Sumador
  private class Sumador {
    public int sumar(int a, int b) {
      return a + b;
    }
  }
  
  // Clase Calculadora

private class Calculadora {
    private Sumador sumador;
    
    public Calculadora(Sumador sumador) {
      this.sumador = sumador;
    }
    
    public int sumar(int a, int b) {
      return sumador.sumar(a, b);
    }
  }
}