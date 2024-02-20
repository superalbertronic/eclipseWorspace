package excepciones2;
import java.util.Scanner;

public class VerMiError {

    public static void main(String[] args) {
        int i = 0;
        String texto;
        boolean error = false;
        Scanner scanner = new Scanner(System.in);

        do {
            error = false;
            try {
                System.out.print("Introduce un numero entero positivo: ");
                texto = scanner.nextLine();
                i = Integer.parseInt(texto);
                Validar.esValido(i > 0); //aqui si la validación de clase validar, en boolean estoy definiendo una condicion.
                } catch (MiError e) { //estoy definiendo la clase MiError
                System.out.println(e.getMessage());
                error = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                error = true;
            }
        } while (error);

        System.out.println("Admitido el valor: " + i);
        scanner.close();
    }
}