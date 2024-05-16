package extraermetodos;

import java.util.Scanner;

public class Factorizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = pedirDatos("Introduce tu nombre: ", sc);
        String usuario = pedirDatos("Introduce tu usuario: ", sc);
        String password=pedirDatos("introduce tu password:",sc);
        sc.close();
        mostrarDatos("Nombre ", nombre);
        mostrarDatos("Usuario ", usuario);
        mostrarDatos("Password ",password);
        graciasMiArma();
    }
    
    
    
    private static String pedirDatos(String mensaje, Scanner sc) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
    
    private static void mostrarDatos(String linea, String datos) {
        System.out.println(linea + ": " + datos);
    }
    private static void graciasMiArma() {
    	System.out.println("¡¡Gracias mi arma!!");
    }
}
