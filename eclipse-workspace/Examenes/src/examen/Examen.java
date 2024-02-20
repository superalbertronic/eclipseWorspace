package examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {

		String path = "src\\ficheros\\"; //Esto es el poder de la encapsulación!
		Scanner sca = new Scanner(System.in);
		
		while(true) {
			System.out.println("¿Qué quieres hacer?"
					+ "\n1 - Crear carpeta o fichero"
					+ "\n2 - Borrar carpeta o fichero"
					+ "\n3 - Ver información de carpeta o fichero"
					+ "\n4 - Salir");
			int respuesta = 0;
			try {respuesta= Integer.parseInt(sca.nextLine());}catch(NumberFormatException e){System.out.println("No se ha podido leer el número");}
			if(respuesta<0||respuesta>4) {
				continue;
			}
			if(respuesta==4)
				break;
			
			switch(respuesta) {
				case 1:
					System.out.println("Dime de lo que quieras crear. En caso de una carpeta, pon solo el nombre. En caso de un archivo, añade la extensión");
					String pathCrear = sca.nextLine();
					File crear = new File(path+pathCrear);
					if(!pathCrear.contains(".")) {
						System.out.println(crear.mkdir()?"Carpeta creada correctamente":"Error");
						break;
					}
					else {
						System.out.println("Quieres añadirle texto al fichero? \n1 - Sí\n2 - No");
						respuesta = 0;
						while(true) {
						try {respuesta= Integer.parseInt(sca.nextLine());}catch(NumberFormatException e){System.out.println("No se ha podido leer el número");}
						if(respuesta==1||respuesta==2)
							break;
						System.out.println("1 - Sí\n2 - No");
						}
						if(respuesta==2)
							break;
						System.out.println("Puedes añadirle texto al archivo. Para dejar de escribir, escribe '!wq:'"); //(Broma)
						BufferedWriter bw;
						try {
							bw = new BufferedWriter(new FileWriter(crear));
							while(true) {
								String linea = sca.nextLine();
								if(linea.equals("!wq:")) { //En plan, no es broma, pero...
									break;
								}
								else
									bw.write(linea+"\n");
							}
							bw.flush(); //Funciona bien, de he hecho he escrito hello world en java usando la consola
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						} 
					}
					
					break;
			
				case 2:
					System.out.println("Dime que archivo o carpeta quieres borrar. En caso de ser un archivo, no olvides la extensión.");
					String pathBorrar = sca.nextLine();
					File borrar = new File(path+pathBorrar);
					if(!pathBorrar.contains(".")) {
						if(!borrar.isDirectory())
							System.out.println("No puedo encontrar la carpeta.");
						else {
							System.out.println(vaciarCarpeta(borrar)?"Carpeta borrada correctamente.":"No se ha podido borrar la carpeta.");
							
						}
					}
					else {
						if(borrar.exists())
							System.out.println(borrar.delete()?"Archivo borrado correctamente":"Ha habido un error");
						else
							System.out.println("Archivo no encontrado...");
					}
					
					break;
					
				case 3:
					System.out.println("Dime de qué archivo o carpeta quieres ver la información. No olvides la extensión, en el caso de que sea un archivo.");
					String pathLeer = sca.nextLine();
					File leer = new File(path+pathLeer);
					if(!pathLeer.contains(".")) {
						if(!leer.isDirectory())
							System.out.println("No se ha podido encontrar la carpeta...");
						else {
							System.out.println("Nombre de la carpeta:" +leer.getName());
							System.out.println("Path: "+leer.getAbsolutePath());
							System.out.println("Espacio ocupado: "+leer.length() + "bytes");
							System.out.println("Fecha de modificación: "+(leer.lastModified())); //To date????
							
						}
					} else {
						if(!leer.exists())
							System.out.println("No se ha podido encontrar el archivo...");
						else {
							System.out.println("Nombre del archivo:" +leer.getName());
							System.out.println("Path: "+leer.getAbsolutePath());
							System.out.println("Espacio ocupado: "+leer.length() + "bytes");
							System.out.println("Fecha de modificación: "+(leer.lastModified()));
							System.out.println("Contenido del archivo: \n");
							try {
								BufferedReader br = new BufferedReader(new FileReader(leer));
								String linea;
								while((linea = br.readLine())!=null) {
									System.out.println("\t"+linea);
								}
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
					break;
					default:
						System.out.println("huh?");
						break;
					
			}
			
		}
		
	}
	/**
	 * 
	 * Por si acaso, he de recordar que este código puede romperte el ordenador. Jaja.
	 */
	public static boolean vaciarCarpeta(File borrar) {
		
		File[] vaciar = borrar.listFiles();
		for(File archivo: vaciar) {
			if(archivo.isDirectory())
				vaciarCarpeta(archivo);
			archivo.delete();
		}
		return borrar.delete();
		
	}

}
