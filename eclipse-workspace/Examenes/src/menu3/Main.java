package menu3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Main {

	private static String ruta;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ruta = "d:\\examen\\";
		boolean salir = false;

		do {
			System.out.println("Menú Examen Acceso a Datos, Elige una opción." + "\n1. EspecificarRuta "
					+ "\n2. Crear Carpeta" + "\n3. Crear Fichero" + "\n4. Borrar Carpeta/Fichero"
					+ "\n5. Ver Información Carpeta/Fichero" + "\n6. Salir");
			switch (Byte.parseByte(sc.nextLine())) {
			case 1:
				System.out.println("Espeficiame la ruta exacta que quieres usar."
						+ "\n(Para meter ficheros/carpetas dentro de otra carpeta).");
				System.out.println(especificarRuta(sc.nextLine()));
				break;
			case 2:
				System.out.println("Ponle un nombre a tu carpeta.");
				System.out.println(crearCarpeta(sc.nextLine()));
				break;
			case 3:
				System.out.println("Ponle un nombre a tu fichero.");
				String nombre = sc.nextLine();
				System.out.println("¿Quieres meterle contenido a tu fichero? (si/no)");
				try {
					if (sc.nextLine().equals("si")) {
						System.out.println("Escribe el texto para tu fichero.");
						String contenido = sc.nextLine();
						System.out.println(crearFichero(nombre, contenido));
					} else {
						System.out.println(crearFichero(nombre, ""));
					} // else
				} catch (IOException e) {
					e.printStackTrace();
				} // catch
				break;
			case 4:
				System.out.println("Dime el nombre de la carpeta " 
						+ "(pon \".txt\" al final para ficheros) que quieres borrar.");
				try {
					System.out.println(borrarFichero(sc.nextLine()));
				} catch (IOException e) {
					e.printStackTrace();
				} // catch
				break;
			case 5:
				System.out.println("¿Cómo se llama el directorio de la que quieres ver la info?"
						+ "(Usa \".txt\" para ficheros por favor).");
				System.out.println(verInfo(sc.nextLine()));
				break;
			case 6:
				System.out.println("¿Estás seguro de que quieres salir? (si/no)");
				if (sc.nextLine().equals("si")) {
					salir = true;
				} else {
					salir = false;
				} // else
				break;
			} // switch
		} while (!salir);
	} // main

	// Método para espeficiar la ruta al crear ficheros u otras carpetas.
	private static String especificarRuta(String nuevaRuta) {
		ruta = "d:\\examen\\" + nuevaRuta + "\\";
		return "La nueva ruta es: " + ruta;
	} // method

	// // Método para crear carpetas.
	private static String crearCarpeta(String nombreCarpeta) {
		String texto = null;

		File fichero = new File(ruta + nombreCarpeta);

		if (fichero.mkdir()) {
			texto = "Carpeta creada.";
		} else {
			texto = "No se pudo crear la carpeta.";
			if (fichero.exists()) {
				texto = "La carpeta ya existe.";
			} // if
		} // else
		return texto;
	} // method

	// Método para crear ficheros.
	private static String crearFichero(String nombreFichero, String contenido) throws IOException {
		BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombreFichero + ".txt"));
		fw.write(contenido);
		fw.close();

		return "Archivo " + nombreFichero + ".txt creado correctamente.";
	} // method

	// Método para borrar ficheros y carpetas (incl. interior).
	private static String borrarFichero(String nombreFichero) throws IOException {
		File fichero = new File(ruta + nombreFichero);

		if (!fichero.exists()) {
			return "Archivo " + fichero + " no existe.";
		} // if
		FileUtils.deleteDirectory(fichero);
		return "La carpeta / fichero " + nombreFichero + " se ha borrado.";
	} // method

	// Método para ver la información de un fichero o carpeta.
	private static String verInfo(String nombreDirectorio) {
		String texto = null;
		File direc = new File(ruta + nombreDirectorio);

		if (direc.exists()) {
			texto = "IFORMACIÓN DIRECTORIO\n";
			texto += "Nombre del directorio: " + direc.getName() + "\n";
			texto += "Ruta: " + direc.getPath() + "\n";
			texto += "Ruta absoluta: " + direc.getAbsolutePath() + "\n";
			texto += "Lectura: " + direc.canRead() + "\n";
			texto += "Escritura: " + direc.canWrite() + "\n";
			texto += "Tamaño: " + direc.length() + " kb" + "\n";
			texto += "Directorio: " + direc.isDirectory() + "\n";
			texto += "Fichero: " + direc.isFile() + "\n";
			texto += "Nombre directorio padre: " + direc.getParent() + "\n";
		} // if
		return texto;
	} // method

} // class
