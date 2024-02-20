package examen1ºtrimAccespADatos;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("Menú Principal:");
	            System.out.println("1. Crear carpetas o ficheros");
	            System.out.println("2. Borrar carpeta o fichero");
	            System.out.println("3. Ver información del fichero o carpeta");
	            System.out.println("4. Salir del programa");
	            System.out.print("Seleccione una opción: ");

	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    GestorArchivos gestorArchivos = new GestorArchivos();
	                    gestorArchivos.ingresarNombreArchivo();
	                    System.out.println(gestorArchivos.obtenerInformacion());
	                    break;
	                case 2:
	                    GestorBorrado gestorBorrado = new GestorBorrado();
	                    gestorBorrado.realizarBorrado();
	                    break;
	                case 3:
	                    GestorInformacion gestorInformacion = new GestorInformacion();
	                    gestorInformacion.verInformacion();
	                    break;
	                case 4:
	                    System.out.println("Saliendo del programa. ¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
	            }
	        } while (opcion != 4);
	}

}
