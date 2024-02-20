package ficheros;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class Tarea1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		String ruta = "";
		String nombreArchivo = "";
		String contenido = "";

		do {
			System.out.println("Seleccione una opción:");
			System.out.println("A - Crear carpeta o fichero");
			System.out.println("B - Borrar carpeta o fichero");
			System.out.println("C - Ver info");
			System.out.println("D - Salir");

			opcion = sc.nextLine();

			switch (opcion) {
			case "A":
				System.out.println("Quieres crear una carpeta o fichero? Carpeta - 1, Fichero - 2");
				int opcion2 = Integer.parseInt(sc.nextLine());
				if (opcion2 == 1) {
					System.out.println("Dime el nombre de carpeta");
					ruta = sc.nextLine();
					ruta = "c:\\" + ruta + "\\";
					File fichero = new File(ruta);

					if (fichero.mkdir()) {
						System.out.println("Carpeta creada");
					} else {
						System.out.println("No se puedo crear la carpeta");
						if (fichero.exists()) {
							System.out.println("La carpeta ya existe");
						}
					}
					break;
				} else if (opcion2 == 2) {
					System.out.println("Dime el nombre de carpeta");
					ruta = sc.nextLine();
					ruta = "c:\\" + ruta + "\\";
					File fichero = new File(ruta);

					if (fichero.mkdir()) {
						System.out.println("Carpeta creada");
					} else {
						System.out.println("No se puedo crear la carpeta");
						if (fichero.exists()) {
							System.out.println("La carpeta ya existe");
						}
					}
					System.out.println("Dime el nombre de archivo");
					nombreArchivo = sc.nextLine();
					nombreArchivo = nombreArchivo + ".txt";
					System.out.println("Quieres escribir contenido? 1 - Sí, 2 - No");
					int opcion3 = Integer.parseInt(sc.nextLine());
					if (opcion3 == 1) {
						System.out.println("Dime el contenido");
						contenido = sc.nextLine();
						try (BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombreArchivo))) {
							System.out.println("Archivo " + nombreArchivo + " creado correctamente");
							fw.write(contenido);
						} catch (IOException e) {
							e.printStackTrace();
							System.err.println("Error al crear el archivo " + nombreArchivo);
						}
					} else if (opcion3 == 2) {
						try (BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombreArchivo))) {
							System.out.println("Archivo " + nombreArchivo + " creado correctamente");
						} catch (IOException e) {
							e.printStackTrace();
							System.err.println("Error al crear el archivo " + nombreArchivo);
						}
					} else {
						break;
					}
					break;
				} else {
					break;
				}

			case "B":
				System.out.println("Dime el nombre de carpeta");
				ruta = sc.nextLine();
				ruta = "c:\\" + ruta + "\\";
				Path carpetaToDeletePath = Paths.get(ruta);
				try {
					Files.delete(carpetaToDeletePath);
					System.out.println("Carpeta " + ruta + " borrado correctamente");
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("Error al borrar el carpeta " + ruta);
				}
				break;
			case "C":
				System.out.println("Dime el nombre de carpeta");
				ruta = sc.nextLine();
				ruta = "c:\\" + ruta + "\\";
				System.out.println("Dime el nombre de archivo");
				nombreArchivo = sc.nextLine();
				nombreArchivo = nombreArchivo + ".txt";
				File file = new File(ruta + nombreArchivo);
				System.out.println("Ruta absoluta: " + file.getAbsolutePath() + "\nNombre es: " + file.getName()
						+ "\nModificasion: " + file.lastModified());
				break;
			case "D":
				System.out.println("Adiós");
				break;

			default:
				System.out.println("Opción inválida.(Ten cuidado, hay que escibir leta mayuscula A, B, C o D!)");
				break;
			}

		} while (!opcion.equals("D"));

		sc.close();
	}
}
