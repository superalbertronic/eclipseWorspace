package menu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase Menu que muestra por pantalla un menu el cual se pueda crear,borrar o leer ficheros y carpetas
 * 
 * @author javid
 *
 */
public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			mostrarMenu();
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				verInformacionFichero();
				break;
			case 2:
				verInformacionCarpeta();
				break;
			case 3:
				crearFichero();
				break;
			case 4:
				crearCarpeta();
				break;
			case 5:
				borrarFichero();
				break;
			case 6:
				borrarCarpeta();
				break;
			case 7:
				System.out.println("Saliendo del programa :(");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opcion incorrecta, introduce de nuevo");
			}
		}
	}
	// Constructor que muestra el menu por pantalla
	private static void mostrarMenu() {
		System.out.println("1. Ver informacion del fichero");
		System.out.println("2. Ver informacion de la carpeta");
		System.out.println("3. Crear fichero");
		System.out.println("4. Crear carpeta");
		System.out.println("5. Borrar fichero");
		System.out.println("6. Borrar carpeta");
		System.out.println("7. Salir");
		System.out.print("Seleccione una opción 1-7: ");
	}
	// Constructor que muestra la informacion de la carpeta por pantalla
	private static void verInformacionCarpeta() {
		File carpetaActual = new File(".");
		String[] contenido = carpetaActual.list();

		System.out.println("Contenido de la carpeta:");
		for (String item : contenido) {
			System.out.println(item);
			System.out.println("Nombre del fichero  : "+carpetaActual.getName());
	        System.out.println("Ruta                : "+carpetaActual.getPath());
	        System.out.println("Ruta absoluta       : "+carpetaActual.getAbsolutePath());
	        System.out.println("Lectura       : "+carpetaActual.canRead());
	        System.out.println("Escritura   : "+carpetaActual.canWrite());
	        System.out.println("Tamaño              : "+carpetaActual.length()+ " Kb");
			System.out.println("Directorio    : "+carpetaActual.isDirectory()); 
			System.out.println("Fichero       : "+carpetaActual.isFile());
			System.out.println("Nombre del directorio padre: "+carpetaActual.getParent());
			
		}
	}
	// Constructor que muestra la informacion del fichero por pantalla
	private static void verInformacionFichero() {
		File ficheroActual = new File(".");
		String[] contenido = ficheroActual.list();
		System.out.println("Contenido del fichero:");
		for (String item : contenido) {
			System.out.println(item);
			System.out.println("Nombre del fichero  : "+ficheroActual.getName());
	        System.out.println("Ruta                : "+ficheroActual.getPath());
	        System.out.println("Ruta absoluta       : "+ficheroActual.getAbsolutePath());
	        System.out.println("Lectura       : "+ficheroActual.canRead());
	        System.out.println("Escritura   : "+ficheroActual.canWrite());
	        System.out.println("Tamaño              : "+ficheroActual.length()+ " Kb");
			System.out.println("Directorio    : "+ficheroActual.isDirectory()); 
			System.out.println("Fichero       : "+ficheroActual.isFile());
			System.out.println("Nombre del directorio padre: "+ficheroActual.getParent());
		}
	}
	// Constructor que crea fichero
	private static void crearFichero() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el nombre del nuevo fichero: ");
		String nombre = scanner.nextLine();

		try {
			File nuevoFichero = new File(nombre);
			if (nuevoFichero.createNewFile()) {
				System.out.println("Fichero creado correctamente");
			} else {
				System.out.println("El fichero ya existe");
			}
		} catch (IOException e) {
			System.err.println("Error al crear el fichero: " + e.getMessage());
		}
	}
	// Constructor que crea carpeta
	private static void crearCarpeta() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre de la nueva carpeta: ");
		String nombre = scanner.nextLine();

		File nuevaCarpeta = new File(nombre);
		if (nuevaCarpeta.mkdir()) {
			System.out.println("Carpeta creada correctamente");
		} else {
			System.out.println("La carpeta ya existe o no se puede crear");
		}
	}
	// Constructor que borra fichero
	private static void borrarFichero() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre del fichero a borrar: ");
		String nombreFichero = scanner.nextLine();

		File fichero = new File(nombreFichero);

		if (fichero.exists() && fichero.isFile()) {
			if (fichero.delete()) {
				System.out.println("Fichero borrado correctamente");
			} else {
				System.out.println("No se pudo borrar el fichero");
			}
		} else {
			System.out.println("El fichero no existe o no es valida");
		}
	}
	// Constructor que borra carpeta
	private static void borrarCarpeta() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre de la carpeta a borrar: ");
		String nombreCarpeta = scanner.nextLine();

		File carpeta = new File(nombreCarpeta);

		if (carpeta.exists() && carpeta.isDirectory()) {
			if (carpeta.list().length == 0) {
				if (carpeta.delete()) {
					System.out.println("Carpeta borrada correctamente");
				} else {
					System.out.println("No se pudo borrar la carpeta");
				}
			} else {
				System.out.println("La carpeta no esta vacia,no se puede borrar");
			}
		} else {
			System.out.println("La carpeta no existe o no es valida");
		}
	}

}
