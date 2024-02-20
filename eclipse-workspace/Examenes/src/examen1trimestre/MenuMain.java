package examen1trimestre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestorArchivos gestor = new GestorArchivos();
		String ruta = "";
		byte opcion;
		do {
			opcion=-1;
			
			do{
				System.out.println("Seleccione una opción: "
							+ "\n\t0 - Salir"
							+ "\n\t1 - Crear Carpeta o Fichero"
							+ "\n\t2 - Borrar Carpeta o Fichero"
							+ "\n\t3 - Mostrar Información del Fichero o Carpeta");
				
				opcion = Byte.parseByte(sc.nextLine());
			}while(opcion<0||opcion>3);
			
			switch (opcion) {
			case 1:
				gestor.nombreArchivo();
				File fichero;
				if(gestor.esFichero) {
					fichero = new File(ruta + gestor.nombreArchivo);
					try {
						new BufferedWriter(new FileWriter(ruta + gestor.nombreArchivo));
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}else {
					fichero = new File(ruta+ gestor.nombreArchivo);
				}
				
				boolean ficheroCreado = fichero.mkdir();
				if (ficheroCreado) {
					System.out.println("Carpeta o fichero creado");
				} else {
					System.err.println("No se puedo crear la carpeta o fichero");
					if (fichero.exists()) {
						System.err.println("La carpeta o fichero ya existe");
					}
				}
				
				if(gestor.esFichero && gestor.contenido!=null && !gestor.contenido.isBlank()) {
					try {
						BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + gestor.nombreArchivo));
						fw.write(gestor.contenido);
						fw.flush();
						
					} catch (IOException e) {
						e.printStackTrace();
						System.out.println("Error");
					}
				}
				

				break;
			case 2:
				String nombreEliminar="";
				
				do {
					System.out.println("Dime el nombre del archivo o fichero a borrar (con la extensión que"
							+ "corresponda, si es un fichero).");
					nombreEliminar = sc.nextLine();
				}while(nombreEliminar=="");
				
				File eliminar = new File(ruta+nombreEliminar);
				if (eliminar.exists()) {
					if(eliminar.getName().contains(".")){
						boolean borrado = eliminar.delete();
						if (borrado) {
							System.out.println("El fichero ha sido borrado con éxito");
						} else {
							System.out.println("No se pudo borrar el fichero");
						}
					}else {
						String[] hijos = eliminar.list();
						if(hijos.length==0) {
							boolean borrado = eliminar.delete();
							if (borrado) {
								System.out.println("La carpeta ha sido borrada con éxito");
							} else {
								System.out.println("No se pudo borrar la carpeta");
							}
						}else {
							System.out.println("El archivo no está vacío.\nContenidos:\n");
							for(byte i=0;i<hijos.length;i++) {
								System.out.println(hijos[i]);
							}
						}
						
					}
					
				}else {
					System.out.println("El fichero o carpeta no existe.");
				}

				break;
			
			case 3:
				String nombreVer="";
				
				do {
					System.out.println("Dime el nombre del archivo o fichero(con la extensión que corresponda, si es un fichero).");
					nombreVer = sc.nextLine();
				}while(nombreVer=="");
				File archivo = new File(ruta+nombreVer);
				if (!archivo.exists()) {
					System.out.println("El archivo no existe ");
					break;
				}
				try {
					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);
					String linea;
					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
					}
					br.close();
					fr.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
				default:
					System.out.println("¿Seguro que quieres salir?");
					String respuesta=sc.nextLine();
					
					if(respuesta.equalsIgnoreCase("no")){
						opcion=-1;
					}
					
					break;
			}

		} while (opcion!=0);
		
		System.out.println("Has salido, adiós.");
	}

}
	
