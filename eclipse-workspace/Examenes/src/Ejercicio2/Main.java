package Ejercicio2;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.stream.events.StartElement;

import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			String opcion;
			String ruta = "C:\\";
			String SeleccionSalir = null;
			do {
				System.out.println("Seleccione una opción:");
				System.out.println("1 - Crear carpeta");
				System.out.println("2 - Crear fichero");
				System.out.println("3 - Borrar fichero");
				System.out.println("4 - Borrar carpeta");
				System.out.println("5 - Leer fichero");
				System.out.println("6 - Salir");

				opcion = scanner.nextLine();

				switch (opcion) {
				case "1":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpeta = scanner.nextLine();
					File carpeta = new File(ruta + nombreCarpeta);

					if (!carpeta.exists()) {
						carpeta.mkdirs();
						System.out.println("La carpeta " + nombreCarpeta + " se ha creado correctamente");
					} else {
						System.out.println("La carpeta " + nombreCarpeta + " ya existe");
					}
					break;

				case "2":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaFichero = scanner.nextLine();
					File carpetaFichero = new File(ruta + nombreCarpetaFichero);

					if (carpetaFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero:");
						String nombreFichero = scanner.nextLine();

						try (BufferedWriter bw = new BufferedWriter(
								new FileWriter(ruta + nombreCarpetaFichero + "\\" + nombreFichero + ".txt"))) {
							System.out.println("Introduzca el nombre:");
							String nombre = scanner.nextLine();
							bw.write("Nombre: " + nombre);
							bw.newLine();

							System.out.println("Introduzca los apellidos:");
							String apellidos = scanner.nextLine();
							bw.write("Apellidos: " + apellidos);
							bw.newLine();

							System.out.println("Introduzca la dirección:");
							String direccion = scanner.nextLine();
							bw.write("Dirección: " + direccion);

							System.out.println("Fichero creado correctamente");
						} catch (IOException e) {
							System.out.println("No se ha podido escribir en el fichero");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaFichero + " no existe");
					}
					break;

				case "3":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaBorrarFichero = scanner.nextLine();
					File carpetaBorrarFichero = new File(ruta + nombreCarpetaBorrarFichero);

					if (carpetaBorrarFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero a borrar:");
						String nombreFicheroBorrar = scanner.nextLine();
						File ficheroBorrar = new File(
								ruta + nombreCarpetaBorrarFichero + "\\" + nombreFicheroBorrar + ".txt");

						if (ficheroBorrar.exists()) {
							ficheroBorrar.delete();
							System.out
									.println("El fichero " + nombreFicheroBorrar + ".txt se ha borrado correctamente");
						} else {
							System.out.println("El fichero " + nombreFicheroBorrar + ".txt no existe");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrarFichero + " no existe");
					}
					break;

				case "4":
					System.out.println("Introduzca el nombre de la carpeta a borrar:");
					String nombreCarpetaBorrar = scanner.nextLine();
					File carpetaBorrar = new File(ruta + nombreCarpetaBorrar);

					if (carpetaBorrar.exists()) {
						FileUtils.deleteDirectory(carpetaBorrar);
						System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente");
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe");
					}
					break;

				case "5":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaLeer = scanner.nextLine();
					File carpetaLeer = new File(ruta + nombreCarpetaLeer);

					if (carpetaLeer.exists()) {
						System.out.println("Introduzca el nombre del fichero a leer:");
						String nombreFicheroLeer = scanner.nextLine();
						File ficheroLeer = new File(ruta + nombreCarpetaLeer + "\\" + nombreFicheroLeer + ".txt");

						if (ficheroLeer.exists()) {
							try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
								String linea;
								while ((linea = br.readLine()) != null) {
									System.out.println(linea);
								}
							} catch (IOException e) {
								System.out.println("No se puede leer el fichero");
							}
						} else {
							System.out.println("El fichero " + nombreFicheroLeer + ".txt no existe en la carpeta");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaLeer + " no existe");
					}
					break;

				case "6":
					System.out.println("¿Desea salir del Programa?(si/no)");
					SeleccionSalir = scanner.nextLine();
					if(SeleccionSalir.equalsIgnoreCase("si")) {
						System.out.println("Fin del programa");
						break;
					}
					

				default:
					if (SeleccionSalir.equalsIgnoreCase("no")){
						System.out.println("Ok");
					} else {
						System.out.println("Seleccion no válida");
					}
					
					break;
				}

			} while ((!opcion.equals("6")) || (SeleccionSalir.equalsIgnoreCase("no")));

			scanner.close();

		} catch (IOException ioe) {
			System.out.println("Error");
		}
	}
}