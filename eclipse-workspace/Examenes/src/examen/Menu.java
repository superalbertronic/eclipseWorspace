package examen;

import java.io.*;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		//Inicializamos las variables principales del programa
		Scanner scanner = new Scanner(System.in);
		String opcion;
		String ruta = "C:\\";
		//Bucle para la ejecución del programa
		do {
			//Se imprimen las opciones del menú
			System.out.println("Seleccione una opción:");
			System.out.println("A - Crear carpeta / fichero");
			System.out.println("B - Borrar carpeta / fichero");
			System.out.println("C - Ver informacion del fichero / carpeta");
			System.out.println("D - Salir");

			opcion = scanner.nextLine();

			//Switch donde se ejecutan cada una de las opciones del menú
			switch (opcion) {
			case "A":
				//Código para crear carpetas y ficheros
				System.out.println("¿Desea crear una 'carpeta' o un 'fichero'?: ");
				String eleccion = scanner.nextLine();
				if (eleccion.equals("carpeta")) {
					//Información de la carpeta
					System.out.println("Introduzca el nombre de la carpeta");
					String nombreCarpeta = scanner.nextLine();
					File carpeta = new File(ruta + nombreCarpeta);

					if (!carpeta.exists()) {
						carpeta.mkdirs(); // crea la carpeta
						System.out.println("La carpeta " + nombreCarpeta + " se ha creado correctamente."); //confirmación
					} else {
						System.out.println("La carpeta " + nombreCarpeta + " ya existe.");
					}
				} else if (eleccion.equals("fichero")) {
					System.out.println("Introduzca el nombre de la carpeta:");
					//Información de la carpeta para el fichero
					String nombreCarpetaFichero = scanner.nextLine();
					File carpetaFichero = new File(ruta + nombreCarpetaFichero);

					if (carpetaFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero:");
						//Información del fichero
						String nombreFichero = scanner.nextLine();
						System.out.println("¿Deseas introducir informacion en el 'si' o 'no'?");
						String resultado = scanner.nextLine();
						try (BufferedWriter bw = new BufferedWriter(
								new FileWriter(ruta + nombreCarpetaFichero + "\\" + nombreFichero + ".txt"))) {
							//Se escribe el contenido del fichero que el usuario desee
							if (resultado.equals("si")) {
								System.out.println("Introduzca la informacion");
								String informacion = scanner.nextLine();
								bw.write(informacion); //se escribe la información
								bw.newLine();
							}
							System.out.println("Fichero creado correctamente."); //confirmacion
						} catch (IOException e) {
							System.out.println("No se ha podido escribir en el fichero"); //mensaje de error
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaFichero + " no existe.");
					}
				} else {
					System.out.println(
							"Debes esbribir 'carpeta' o 'fichero' para saber que quieres crear. tenlo en cuenta para la proxima");
				}
				break;

			case "B":
				//Código para borrar carpetas y ficheros
				System.out.println("Seleccione una opción:");
				System.out.println("1 - Borrar carpeta");
				System.out.println("2 - Borrar fichero");
				System.out.println("3 - Volver al menú principal");

				String eleccion2 = scanner.nextLine();

				switch (eleccion2) {
				case "1":
					//Aquí se borran las carpetas
					System.out.println("Introduzca el nombre de la carpeta a borrar:");
					String nombreCarpetaBorrar = scanner.nextLine();
					File carpetaBorrar = new File(ruta + nombreCarpetaBorrar);

					//Comprueba si existe para borrarla
					if (carpetaBorrar.exists()) {
						// Borrar carpeta y su contenido
						carpetaBorrar.delete(); 
						System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente."); //confirmación
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe.");
					}
					break;
				case "2":
					//Se selecciona la carpeta donde está el fichero
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaBorrarFichero = scanner.nextLine();
					File carpetaBorrarFichero = new File(ruta + nombreCarpetaBorrarFichero);
					//Se comprueba si existe la carpeta
					if (carpetaBorrarFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero a borrar:");
						String nombreFicheroBorrar = scanner.nextLine();
						File ficheroBorrar = new File(
								ruta + nombreCarpetaBorrarFichero + "\\" + nombreFicheroBorrar + ".txt");
						//Se comprueba si existe el fichero
						if (ficheroBorrar.exists()) {
							//Borra el fichero y su contenido
							ficheroBorrar.delete(); 
							System.out.println(
									"El fichero " + nombreFicheroBorrar + ".txt se ha borrado correctamente."); //confirmación
						} else {
							System.out.println("El fichero " + nombreFicheroBorrar + ".txt no existe.");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrarFichero + " no existe.");
					}
					break;
				case "3":
					//Opción para volver al menú
					System.out.println("Has vuelto al menú principal");
					break;
					//Si no eliges ninguna opción correcta, te vuelve al menú principal con un error
				default:
					System.out.println("Opción inválida.");
					break;
				}
				break;
			case "C":
				//Código para ver la información de las carpetas y los ficheros
				System.out.println("Seleccione una opción:");
				System.out.println("1 - Ver informacion carpeta");
				System.out.println("2 - Ver informacion fichero");
				System.out.println("3 - Volver al menú principal");

				String eleccion3 = scanner.nextLine();

				switch (eleccion3) {
				case "1":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaVer = scanner.nextLine();
					File carpetaVer = new File(ruta + nombreCarpetaVer);
					//Se compueba si la carpeta existe
					if (carpetaVer.exists()) {
						//Información de la carpeta que se quiere ver
						System.out.println("Nombre del directorio: "+carpetaVer.getName());
						System.out.println("Tamaño: "+carpetaVer.length()+ " Kb");
				        System.out.println("Ficheros: "+carpetaVer.listFiles());
					} else {
						System.out.println("La carpeta no existe");//mensaje de error
					}
					break;
				case "2":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaVerFichero = scanner.nextLine();
					File carpetaVerFichero = new File(ruta + nombreCarpetaVerFichero);
					//Se comprueba si la carpeta donde se encuentra el fichero existe
					if (carpetaVerFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero:");
						String nombreFicheroVer = scanner.nextLine();
						File ficheroVer = new File(ruta + nombreCarpetaVerFichero + "\\" + nombreFicheroVer + ".txt");
						//Se comprueba si el fichero existe
					if (ficheroVer.exists()) {
						//Información del fichero
						System.out.println("Nombre del directorio: "+ficheroVer.getName());
						System.out.println("Tamaño: "+ficheroVer.length()+ " Kb");
						//Se intenta leer el contenido del fichero
						try (BufferedReader br = new BufferedReader(new FileReader(ficheroVer))) {
							String linea;
							while ((linea = br.readLine()) != null) {
								System.out.println(linea);//Lee el fichero
							}
						} catch (IOException e) {
							System.out.println("No se puede leer el fichero.");//mensaje de error
						}
					} else {		
						System.out.println("El fichero no existe");
						} 
					} else {
						System.out.println("La carpeta no existe");
					}
					break;
				case "3":
					System.out.println("Has vuelto al menú principal");
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
				break;
				
			case "D":
				//Código para salir del programa
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción inválida.");
				break;
			}

		} while (!opcion.equals("D"));

		scanner.close();
	}
}