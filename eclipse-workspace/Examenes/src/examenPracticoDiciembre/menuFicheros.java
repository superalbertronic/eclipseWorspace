package examenPracticoDiciembre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class menuFicheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		//PRESENTACION DEL PROGRAMA
		System.out.println(
				"Bienvenido al menu de gestion de carpetas y ficheros" 
						+ "\nrealizado por Alberto Palomo Pino.");
		System.out.println();

		String ruta = "C:\\";

		short opcion = 0;
		short opcion2 = 1;

		
		//BUBLE QUE REPITE EL PROGRAMA HASTA QUE PULSAS LA OPCION 4 PARA SALIR
		while (opcion != 4) {
			System.out.println("Que quieres hacer? (Elige un numero)" 
					+ "\n\t 1 - Crear carpeta o fichero."
					+ "\n\t 2 - Borrar carpeta o fichero." 
					+ "\n\t 3 - Ver informacion de la carpeta o fichero."
					+ "\n\t 4 - Salir del programa");

			opcion = Short.parseShort(sc.nextLine());

			
			//SWITCH PARA ELEGIR LA PRIMERA OPCION EN EL MENU PRINCIPAL
			switch (opcion) {
			case 1:
				System.out.println();
				System.out.println("Has seleccionado crear una carpeta o fichero.");
				System.out.println();

				opcion2 = 0;

				
				//BUCLE QUE SE REPITE HASTA QUE PULSAR EL 3 PARA VOLVER AL MENU PRINCIPAL
				while (opcion2 != 3) {
					System.out.println("Dime, quieres crear una carpeta o fichero?" 
							+ "\n\t 1-Carpeta"
							+ "\n\t 2-Fichero" 
							+ "\n\t 3-Volver al menu principal.");

					opcion2 = Short.parseShort(sc.nextLine());

					
					// SEGUNDO SWITCH PARA ELEGIR CARPETA O FICHERO EN LA OPCION DE CREAR
					switch (opcion2) {
					case 1:
						System.out.println();
						System.out.println("Quieres crear una carpeta." 
								+ "\nPor defecto la ruta de la carpeta es C:\\"
								+ "\nDime el nombre de la carpeta: ");

						String nombreCarpeta = sc.nextLine();

						File directorio = new File(ruta + nombreCarpeta);
						
						//CONDICION QUE COMPRUEBA SI EXISTE EL DIRECTORIO INDICADO Y SI ES UN DIRECTORIO
						if (directorio.exists() && directorio.isDirectory()) {
							System.out.println("Esa carpeta ya existe.");
						} else {
							directorio.mkdir();
							System.out.println("La carpeta ha sido creada.");
						}
						System.out.println();
						break;

						//CASO PARA CREAR UN FICHERO
					case 2:
						System.out.println();
						System.out.println("Quieres crear un fichero.");
						System.out.print("Dime primero el nombre del directorio" 
						+ " donde quieres crear el archivo: ");

						nombreCarpeta = sc.nextLine();
						directorio = new File(ruta + nombreCarpeta);

						//CONDICION QUE COMPRUEBA SI EXISTE EL DIRECTORIO INDICADO Y SI ES UN DIRECTORIO
						if (directorio.exists() && directorio.isDirectory()) {
							System.out.print("Dime el nombre que le quieres poner al fichero: ");
							String nombreFichero = sc.nextLine();
							String rutaFichero = directorio + File.separator + nombreFichero;

							File fichero = new File(rutaFichero);

						//CONDICION QUE COMPRUEBA SI EXISTE EL DIRECTORIO INDICADO Y SI ES UN DIRECTORIO
						if (fichero.exists() && fichero.isFile()) {
							System.out.println("Ese fichero ya existe.");
							System.out.println("Quieres escribir informacion en el fichero?" 
									+ "\n\t1 - Si"
									+ "\n\t2 - No");
							short opcion3 = 0;

							opcion3 = Short.parseShort(sc.nextLine());
							
							//SWITCH INTERNO DE LA OPCION CREAR FICHERO PARA ESCRIBIR DENTRO DEL FICHERO
							switch (opcion3) {
							//CASO PARA ESCRIBIR EN EL FICHERO
							case 1:
									System.out.println();
									System.out.println("Que quieres escribir dentro del fichero?");

									if (fichero.exists() && fichero.isFile()) {
										
										// BUFFEREDWRITER PARA ESCRIBIR EN EL FICHERO INDICADO
										try (BufferedWriter fw = new BufferedWriter(
												new FileWriter(rutaFichero))) {
											String contenido = sc.nextLine();
											fw.write(contenido);
											fw.newLine();

											System.out.println("Archivo bien escrito.");
										} catch (IOException e) {
											e.printStackTrace();
											System.err.println("Error al escribir sobre el archivo.");
										}
									} else {
										System.out.println("Fichero no existe o no encontrado");
									}
							}
						} else {
							try {
								boolean creado = fichero.createNewFile();
								if (creado) {
									System.out.println("El fichero ha sido creado sin problemas.");
									System.out.println();

									System.out.println("Quieres escribir informacion en el fichero?" 
											+ "\n\t1 - Si"
											+ "\n\t2 - No");
									short opcion3 = 0;

									opcion3 = Short.parseShort(sc.nextLine());
									
									//SWITCH INTERNO DE LA OPCION CREAR FICHERO PARA ESCRIBIR DENTRO DEL FICHERO
									switch (opcion3) {
									//CASO PARA ESCRIBIR EN EL FICHERO
									case 1:
											System.out.println();
											System.out.println("Que quieres escribir dentro del fichero?");

											if (fichero.exists() && fichero.isFile()) {
												
												// BUFFEREDWRITER PARA ESCRIBIR EN EL FICHERO INDICADO
												try (BufferedWriter fw = new BufferedWriter(
														new FileWriter(rutaFichero))) {
													String contenido = sc.nextLine();
													fw.write(contenido);
													fw.newLine();

													System.out.println("Archivo bien escrito.");
												} catch (IOException e) {
													e.printStackTrace();
													System.err.println("Error al escribir sobre el archivo.");
												}
											} else {
												System.out.println("Fichero no existe o no encontrado");
											}
											break;

										case 2:
											break;
										}

									} else {
										System.out.println("No se ha podido crear el fichero.");
									}
								} catch (IOException e) {
									System.err.println("No se encontro la ruta especificada");
								}
							}
						} else {
							System.out.println("Debes crear un directorio antes de crear un archivo.");
						}
						System.out.println();
					}
				}
				break;
				//CASO PARA BORRAR UNA CARPETA O FICHERO
			case 2:
				System.out.println();
				System.out.println("Has seleccionado borrar una carpeta o fichero.");
				System.out.println();

				opcion2 = 0;

				//BUCLE QUE SE REPITE HASTA QUE SE ELIGE EL NUMERO 3 PARA VOLVER AL MENU PRINCIPAL
				while (opcion2 != 3) {
					System.out.println("Dime, quieres borrar una carpeta o fichero?" 
							+ "\n\t 1-Carpeta"
							+ "\n\t 2-Fichero" 
							+ "\n\t 3-Volver al menu principal.");

					opcion2 = Short.parseShort(sc.nextLine());

					switch (opcion2) {
					//CASO PARA BORRAR UNA CARPETA
					case 1:
						System.out.println();
						System.out.println("Has seleccionado borrar una carpeta. "
								+ "\nPrimero asegurate de que no hay nada dentro.");
						System.out.println();

						System.out.println("Ahora dime el nombre de la carpeta que quieres borrar:");

						String nombreCarpeta = sc.nextLine();

						File directorio = new File(ruta + nombreCarpeta);

						//CONDICION QUE COMPRUEBA SI EXISTE EL DIRECTORIO INDICADO Y SI ES UN DIRECTORIO
						if (directorio.exists() && directorio.isDirectory()) {
							System.out.println("El directorio existe");
							FileUtils.deleteDirectory(directorio);
							System.out.println("El directorio ha sido borrado");
						} else {
							System.out.println("El directorio no existe");
						}
						break;
						//CASO PARA BORRAR UN FICHERO
					case 2:
						System.out.println();
						System.out.println("Has seleccionado borrar un fichero.");
						System.out.println();

						System.out.println(
								"Primero dime el directorio en el que esta el fichero " + "que quieres borrar: ");

						nombreCarpeta = sc.nextLine();
						directorio = new File(ruta + nombreCarpeta);

						//CONDICION QUE COMPRUEBA SI EXISTE EL DIRECTORIO INDICADO Y SI ES UN DIRECTORIO
						if (directorio.exists() && directorio.isDirectory()) {
							System.out.print("Dime el nombre del fichero que quieres borrar: ");
							String nombreFichero = sc.nextLine();
							String rutaFichero = directorio + File.separator + nombreFichero;

							File fichero = new File(rutaFichero);

							//CONDICION QUE COMPRUEBA SI EXISTE EL FICHERO Y SI ES UN FICHERO
							if (fichero.exists() && fichero.isFile()) {
								boolean borrado = fichero.delete();
								if (borrado) {
									System.out.println("El fichero se borro");
								} else {
									System.out.println("No se pudo borrar el fichero");
								}
							} else {
								System.out.println("El fichero no existe en esa ubicacion");
							}
							System.out.println("");

							break;
						}
					}
				}
				break;
				//CASO PARA VER INFORMACION DEL FICHERO
			case 3:
				System.out.println();
				System.out.println("Has seleccionado ver informacion de una carpeta o fichero.");
				System.out.println();

				opcion2 = 0;

				while (opcion2 != 3) {
					System.out.println("Dime, de que quieres ver la informacion" + "\n\t 1-Informacion Carpeta" + "\n\t 2-Informacion Fichero"
							+ "\n\t 3-Volver al menu principal.");

					opcion2 = Short.parseShort(sc.nextLine());

					switch (opcion2) {
					//CASO PARA VER INFORMACION DE UNA CARPETA
					case 1:
						System.out.println();
						System.out.println("Dime la carpeta sobre la que quieres ver informacion: ");
						String nombreCarpeta = sc.nextLine();

						File directorio = new File(ruta + nombreCarpeta);

						if (directorio.exists() && directorio.isDirectory()) {
							System.out.println("INFORMACION SOBRE LA CARPETA:");
							System.out.println("Nombre del directorio  : " + directorio.getName());
							System.out.println("Ruta                : " + directorio.getPath());
							System.out.println("Ruta absoluta       : " + directorio.getAbsolutePath());
							System.out.println("Lectura       : " + directorio.canRead());
							System.out.println("Escritura   : " + directorio.canWrite());
							System.out.println("Tamanho              : " + directorio.length() + " Kb");
							System.out.println("Directorio    : " + directorio.isDirectory());
							System.out.println("Fichero       : " + directorio.isFile());
							System.out.println("Nombre del directorio padre: " + directorio.getParent());

							System.out.println();
						} else {
							System.out.println("La carpeta no existe.");
							System.out.println();
						}

						break;

						//CASO PARA VER INFORMACION DE UN FICHERO Y SU CONTENIDO SI LO TIENE
					case 2:
						System.out.println();

						System.out.println("Primero, dime el directorio en el que esta el fichero: ");
						nombreCarpeta = sc.nextLine();
						directorio = new File(ruta + nombreCarpeta);

						System.out.println("Ahora, dime el fichero sobre el que quieres ver informacion: ");
						String nombreFichero = sc.nextLine();
						String rutaFichero = directorio + File.separator + nombreFichero;

						
						File fichero = new File(rutaFichero);

						if (fichero.exists() && fichero.isFile()) {
							System.out.println("INFORMACION SOBRE EL FICHERO:");
							System.out.println("Nombre del fichero  : " + fichero.getName());
							System.out.println("Ruta                : " + fichero.getPath());
							System.out.println("Ruta absoluta       : " + fichero.getAbsolutePath());
							System.out.println("Lectura       : " + fichero.canRead());
							System.out.println("Escritura   : " + fichero.canWrite());
							System.out.println("Tamanio              : " + fichero.length() + " Kb");
							System.out.println("Directorio    : " + fichero.isDirectory());
							System.out.println("Fichero       : " + fichero.isFile());
							System.out.println("Nombre del directorio padre: " + fichero.getParent());
							
							System.out.println();
							
							System.out.println("Contenido del fichero: ");
							
							try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
								String linea;
								while ((linea = br.readLine()) != null) {
									System.out.println(linea);
								}
							} catch (IOException e) {
								System.err.println("No se puede leer el fichero " + nombreFichero);
							}
							
						} else {
							System.out.println("No existe el fichero.");
						}
						System.out.println();
						break;
					}
				}

				break;
				//CASO PARA SALIR DEL PROGRAMA
			case 4:
				System.out.println("Saliendo del programa.");
				break;
			}
		}

	}
}