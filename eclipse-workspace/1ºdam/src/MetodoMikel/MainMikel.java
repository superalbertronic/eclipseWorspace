package MetodoMikel;

import java.util.Scanner;

public class MainMikel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el usuario: ");
        String usuario = scanner.nextLine();

        ClaseHija objeto = new ClaseHija(nombre, usuario);
        System.out.println(objeto);
        objeto.Gracias();
    }
}


