package excepciones;
import java.util.Scanner;
public class ExcepcionDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula la media de dos números");
        try {
            System.out.print("Introduzca el primer número: ");
            double numero1 = Double.parseDouble(s.nextLine());
            System.out.print("Introduzca el segundo número: ");
            double numero2 = Double.parseDouble(s.nextLine());
            double resultado = numero1 / numero2;
            if (Double.isInfinite(resultado)) {
                throw new ArithmeticException("División por cero");
            }
            System.out.println("El resultado de la división es " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Los datos introducidos no son correctos.");
        } catch (ArithmeticException e) {
            System.out.println("No se puede calcular la división. " + e.getMessage());
        } finally {
            System.out.println("Gracias por utilizar este programa ¡hasta la próxima!");
        }
    }
}

