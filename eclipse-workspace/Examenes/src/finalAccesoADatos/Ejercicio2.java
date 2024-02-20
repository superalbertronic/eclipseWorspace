package finalAccesoADatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Ejercicio2 {

	// Método para crear un directorio
	public static void crearDirectorio() {
		System.out.println("Dime la ruta con el nombre de la carpeta \n Ejemplo: c:\\prueba\\");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();

		// String ruta = "c:\\prueba\\";
		File fichero = new File(ruta);

		if (fichero.mkdir()) {
			System.out.println("Carpeta creada");
		} else {
			// Manejar errores
			System.err.println("No se pudo crear la carpeta");
			if (fichero.exists()) {
				System.err.println("La carpeta ya existe");
			}

		}
	}
	// Método para crear un fichero y añadirle el texto que el usuario diga por consola 
	public static void CrearFichero() {
		System.out.println("Dime la ruta con el nombre de la carpeta \n Ejemplo: c:\\prueba\\");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();

		System.out.println("Dime el nombre de archivo, Ejemplo: prueba.txt");

		String nombre = sc.nextLine();

		System.out.println("Dime el texto que quiere que tenga el archivo");
		String contenido = sc.nextLine();
		// TODO Auto-generated method stub

		// Hay que darle permiso de escritura para que funciona
		try (BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombre))) {
			System.out.println("Archivo creado correctamente.");
			fw.write(contenido);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("Error al crear el archivo");
		}
	}

	// Método para crear una carpeta
	public static void borrarCarpeta() {
		System.out.println("Dime la ruta con el nombre de la carpeta \n Ejemplo: c:\\prueba\\");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();
		File carpeta = new File(ruta);

		if (carpeta.exists() && carpeta.isDirectory()) {
			System.out.println("El directorio existe.");
			try {
				FileUtils.deleteDirectory(carpeta);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("El direcotrio ha sido borrado");
		} else {
			System.out.println("El directorio no existe o no es un directorio");
		}
	}

	// Método para borrar un fichero
	public static void borrarFichero() {
		System.out.println("Dime la ruta con el nombre de la carpeta \n Ejemplo: c:\\prueba\\");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();

		System.out.println("Dime el nombre de archivo, Ejemplo: prueba.txt");

		String nombre = sc.nextLine();
		String rutaFichero = ruta + File.separator + nombre;
		File fichero = new File(rutaFichero);
		if (fichero.exists()) {
			boolean borrado = fichero.delete();
			if (borrado) {
				System.out.println("El fichero ha sido borrado");
			} else {
				System.out.println("No se pudo borrar el fichero");
			}
		} else {
			System.out.println("El fichero no existe");
		}

	}
	
	// Método para ver la información de un directorio
	public static void verInformacion() {
		System.out.println("Dime la ruta con el nombre de la carpeta \n Ejemplo: c:\\prueba\\prueba.txt");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();
		File direc = new File(ruta);

		System.out.println("INFORMACION SOBRE EL DIRECTORIO");
		if (direc.exists()) {
			System.out.println("Nombre del directorio : " + direc.getName());
			System.out.println("Ruta : " + direc.getPath());
			System.out.println("Ruta absoluta : " + direc.getAbsolutePath());
			System.out.println("Lectura : " + direc.canRead());
			System.out.println("Escritura : " + direc.canWrite());
			System.out.println("Tamaño : " + direc.length());
			System.out.println("Directorio : " + direc.isDirectory());
			System.out.println("Fichero : " + direc.isFile());
			System.out.println("Nombre del directorio padre : " + direc.getParent());

		}

	}
	
	// Método para leer un fichero
	public static void LeerFichero() {
		try {

			System.out.println("Dime la ruta con el nombre de la carpeta \n Ejemplo: c:\\prueba\\prueba.txt");
			Scanner sc = new Scanner(System.in);
			String ruta = sc.nextLine();
			File archivo = new File(ruta);

			if (!archivo.exists()) {
				System.out.println("El archivo no existe");
				return;
			}
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// Menú con opciones de posibles operaciones con carpetas y ficheros
		String respuesta;
		do {
			System.out.println(
					"Selecciona una opción:\n" + "A - Crear Carpeta\n" + "B - Crear Fichero\n" + "C - Borrar Fichero\n"
							+ "D - Borrar Carpeta\n" + "E - Leer Fichero\n" + "F - Ver Información\n" + "G - Salir\n");
			Scanner sc = new Scanner(System.in);
			respuesta = sc.nextLine();
			respuesta.toUpperCase();

			switch (respuesta) {
			case "A":
				crearDirectorio();

				break;
			case "B":
				CrearFichero();
				break;
			case "C":
				borrarFichero();
				break;
			case "D":
				borrarCarpeta();
				break;
			case "E":
				LeerFichero();
				break;
			case "F":
				verInformacion();
				break;
			case "G":
				System.out.println("Saliendo...");
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida.");
				break;

			}
		} while (!respuesta.equals("G"));
	}
}
