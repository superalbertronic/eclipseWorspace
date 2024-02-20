package menuficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String opcion;
			String ruta = "c:\\";

			do {
				System.out.println("Seleccione una opción:" + "\n\tA - Crear carpeta" + "\n\tB - Crear fichero"
						+ "\n\tC - Borrar fichero" + "\n\tD - Borrar carpeta" + "\n\tE - Leer fichero"
						+ "\n\tF - Salir");
				opcion = sc.nextLine().toUpperCase();

				switch (opcion) {
				case "A":
					System.out.println("Introduzca el nombre de la carpeta");
					String nombreCarpeta = sc.nextLine();
					File carpeta = new File(ruta + nombreCarpeta);

					if (!carpeta.exists()) {
						carpeta.mkdirs();
						System.out.println("La carpeta " + nombreCarpeta + " se ha creado correctamente");
					} else {
						System.out.println("La carpeta " + nombreCarpeta + " ya existe");
					}
					break;
				case "B":
					System.out.println("Introduzca el nombre de la carpeta");
					String nombreCarpetaFichero = sc.nextLine();
					File carpetaFichero = new File(ruta + nombreCarpetaFichero);

					if (carpetaFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero");
						String nombreFichero = sc.nextLine();
						System.out.println("¿Quieres introducir algo en el fichero? (s/n)");
						String respuesta = sc.nextLine();
						if (respuesta.equals("s")) {
							try (BufferedWriter bw = new BufferedWriter(
									new FileWriter(ruta + nombreCarpetaFichero + "\\" + nombreFichero + ".txt"))) {
								System.out.println("Introduzca el contenido del fichero");
								String contenido = sc.nextLine();
								bw.write(contenido);
								bw.newLine();

								System.out.println("Fichero creado correctamente");
							} catch (IOException e) {
								System.out.println("No se ha podido escribir en el fichero");
							}
						} else {
							BufferedWriter fw = new BufferedWriter(
									new FileWriter(ruta + nombreCarpetaFichero + "\\" + nombreFichero + ".txt"));
							System.out.println("Archivo creado correctamente.");
						}

					} else {
						System.out.println("La carpeta " + nombreCarpetaFichero + " no existe");
					}
					break;
				case "C":
					System.out.println("Introduzca el nombre de la carpeta");
					String nombreCarpetaBorrarFichero = sc.nextLine();
					File carpetaBorrarFichero = new File(ruta + nombreCarpetaBorrarFichero);

					if (carpetaBorrarFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero a borrar");
						String nombreFicheroBorrar = sc.nextLine();
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
				case "D":
					System.out.println("Introduzca el nombre de la carpeta a borrar");
					String nombreCarpetaBorrar = sc.nextLine();
					File carpetaBorrar = new File(ruta + nombreCarpetaBorrar);

					if (carpetaBorrar.exists()) {
						FileUtils.deleteDirectory(carpetaBorrar);
						System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente");
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe");
					}
					break;
				case "E":
					System.out.println("Introduzca el nombre de la carpeta");
					String nombreCarpetaLeer = sc.nextLine();
					File carpetaLeer = new File(ruta + nombreCarpetaLeer);

					if (carpetaLeer.exists()) {
						System.out.println("Introduzca el nombre del fichero a leer");
						String nombreFicheroLeer = sc.nextLine();
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
				case "F":
					System.out.println("Saliendo");
					break;
				default:
					System.out.println("Opción inválida");
					break;
				}
			} while (!opcion.equals("F"));
			sc.close();

		} catch (IOException ioe) {
			System.out.println("Error en la operación.");
		}

	}

}
