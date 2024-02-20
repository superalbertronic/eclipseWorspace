import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
public class Persona1 {
  public static void main(String[] args) {
    Persona i1 = new Ingeniero("pedro");
    Persona d1 = new Deportista("gema");
    Persona i2 = new Ingeniero("angel");
    Persona i3 = new Ingeniero("antonio");
    Persona i4 = new Ingeniero("maria");
    Persona d5 = new Deportista("david");
    List<Persona> lista = Arrays.asList(i1, d1, i2, i3, i4, i4, d5);
    OptionalDouble resultado = calcularMediaVelocidad(lista);
    if (resultado.isPresent()) {
      System.out.println(resultado.getAsDouble());
    }
  }
  public static OptionalDouble calcularMediaVelocidad(List<Persona> lista) {
    return lista.stream().mapToDouble(Persona::correr).average();
  }
}