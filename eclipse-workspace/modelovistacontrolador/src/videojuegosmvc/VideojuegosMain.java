package videojuegosmvc;

import java.util.Scanner;


//Clase principal (Main) para ejecutar el programa
public class VideojuegosMain {
 public static void main(String[] args) {
     VistaVideojuegos vista = new VistaVideojuegos();
     ControladorVideojuegos controlador = new ControladorVideojuegos(vista);

     Scanner scanner = new Scanner(System.in);
     int opcion;

     do {
         vista.mostrarMenu();
         opcion = scanner.nextInt();

         switch (opcion) {
             case 1:
                 controlador.mostrarDetallesVideojuego();
                 break;
             case 2:
                 scanner.nextLine(); // Limpiar el buffer de entrada
                 System.out.print("Ingrese el nombre del videojuego: ");
                 String nombre = scanner.nextLine();
                 System.out.print("Ingrese el género del videojuego: ");
                 String genero = scanner.nextLine();
                 controlador.agregarVideojuego(nombre, genero);
                 break;
             case 3:
                 System.out.println("Saliendo del programa...");
                 break;
             default:
                 System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                 break;
         }
     } while (opcion != 3);
     scanner.close();
 }
}
