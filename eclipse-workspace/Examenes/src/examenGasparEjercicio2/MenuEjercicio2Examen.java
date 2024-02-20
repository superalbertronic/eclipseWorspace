package examenGasparEjercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class MenuEjercicio2Examen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean salir = false;
		String ruta = "";
		int opcion = 0;
		File fichero = null;
		boolean borrado = false;
		String nombreFichero="";
		 String rutaFichero="";
		 String nombreArchivo="";

		do {
			salir = false;

			System.out.println("Dime que quieres hacer");
			System.out.println("1-Crear carpeta");
			System.out.println("2-Crear Fichero");
			System.out.println("3-Borrar Fichero");
			System.out.println("4-Borrar Carpeta");
			System.out.println("5-Leer Fichero");
			System.out.println("6-Ver información");
			System.out.println("7-Salir");
			opcion=Integer.parseInt(sc.nextLine());
			switch(opcion) {
			case 1:
				
		
				
				
				//Creamos un fichero con la ruta
				 ruta="c:\\carpetaExamen\\";
				 fichero= new File(ruta);
				
				// si sie ha creado un fichero
				if(fichero.mkdir()){
					System.out.println("Se ha creado la carpeta ");
					
				}else {
					System.out.println("No se ha podido crear la carpeta");
					
					if(fichero.exists()) {
						System.out.println("Ya existe la carpeta ");
					}
				}
				break;
			case 2:
				String respuesta="";
				
				System.out.println("¿Quieres introducir informacion en el?,contestame con un si o un no ");
				respuesta=sc.nextLine();
				
				if(respuesta.equals("si")) {
					 ruta="c:\\carpetaExamen\\";
						 nombreArchivo="archivo.txt";
						System.out.println("Qué quieres introducir como información?");
						String contenido=sc.nextLine();
						try {
							BufferedWriter fw = new BufferedWriter(new FileWriter(ruta+nombreArchivo));
							System.out.println("Archivo.txt creado correctamente.");
							fw.write(contenido);
							fw.flush();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.err.println("Error al crear el archivo malaga.txt");
						}
				}else {
					 ruta="c:\\carpetaExamen\\";
						 nombreArchivo="archivo.txt";
						String contenido="Se ha creado el archivo";
						try {
							BufferedWriter fw = new BufferedWriter(new FileWriter(ruta+nombreArchivo));
							System.out.println("Archivo.txt creado correctamente.");
							fw.write(contenido);
							fw.flush();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.err.println("Error al crear el archivo.txt");
						}
				}
				
				break;
			case 3:
				// Nota para el lector... por mas que he intentado no he podido solucinar este error... 
				//y me ha sido imposible conseguir borrar los archivos de la carpeta
				
				/*Colocamos la ruta, luego el nombre del archivo*/
				 ruta="c:\\carpetaExamen.archivo.txt\\";
				 
				  nombreFichero="archivo.txt";
				 /*La ruta estar compuesta por la ruta, un File.separator mas el nombre del fichero. */
				  rutaFichero=ruta+File.separator+nombreFichero;
				 /*Sinceramente esto ultimo no se por que se hace pero se hace*/
				  fichero= new File(rutaFichero);
				  
				  if(fichero.exists()) {
					   borrado =fichero.delete();
					  if(borrado) {
						  System.out.println("Fichero borrado con exito");
					  }else {
						  System.out.println("No se puedo borrar el fichero");
					  }
					  
				  }else {
					  System.out.println("El fichero no existe en la ubicación especificada");
				  }
				  break;
			case 4:
				
				File carpeta =new File("c:\\carpetaExamen\\");
				
				if(carpeta.exists()&&carpeta.isDirectory()) {
					System.out.println("El directorio existe y se ha borrado");
					
					try {
						FileUtils.deleteDirectory(carpeta);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("El directorio ha sido borrado");
					}
					
				}else {
					System.out.println("El directorio no existe o no es un directorio ");
				}
				break;
			case 5:
				String[] carpeta2 = { "archivo.txt", };
				for (String carp : carpeta2) {
					System.out.println(carp + ":");
					
					try {
						File archivo = new File("c:\\carpetaExamen\\"+ carp);
						if (!archivo.exists()) {
							System.out.println("El archivo no existe");
							return;
						}
						FileReader fr;

						fr = new FileReader(archivo);

						// TODO Auto-generated catch block

						BufferedReader br = new BufferedReader(fr);
						String linea;
						while ((linea = br.readLine()) != null) {
							System.out.println(linea);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
				
				break;
			case 6:
				System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
				File f=new File("c:\\carpetaExamen\\");
				
				if(f.exists()) {
					System.out.println("Nombre del fichero: " + f.getName());
					System.out.println("Ruta: " + f.getPath());
					System.out.println("Ruta absoluta: " + f.getAbsolutePath());
					System.out.println("Lectura: " + f.canRead());
					System.out.println("Escritura: " + f.canWrite());
					System.out.println("Tamaño: " + f.length() + " Kb");
					System.out.println("Directorio: " + f.isDirectory());
					System.out.println("Fichero: " + f.isFile());
					System.out.println("Nombre del directorio padre: " + f.getParent());
				}else {
					System.out.println("El fichero no existe uwu.");
				}
				break;
			
			case 7:
				
				salir=true;
				break;
			}

		} while (salir != true);

	}
}
