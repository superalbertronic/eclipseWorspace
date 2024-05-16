package startrek;

import java.util.Scanner;


//Clase principal (Main) para ejecutar el programa
public class StarTrekMain {
 public static void main(String[] args) {
     VistaStarTrek vista = new VistaStarTrek();
     ControladorStarTrek controlador = new ControladorStarTrek(vista);

     Scanner scanner = new Scanner(System.in);
     int opcion;

     while(true) {
         vista.mostrarMenu();
         opcion = scanner.nextInt();

         switch (opcion) {
             case 1:
                 controlador.mostrarDetallesPersonaje();
                 break;
             case 2:
                 controlador.agregarPersonaje();
                 break;
             case 3:
            	 controlador.borrarRegistro();
            	 
             case 4:
            	 controlador.modificarRegistro();
             case 5:
                 System.out.println("Saliendo del programa...");
                 break;
                 
             default:
                 System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                 break;
         }
     } 
  
 }
}
