package examen4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GestorInformacion {

	public static void main(String[] args) {
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		while(continuar) {
			System.out.println("Elige una opción del menú:\n1-Ver info de carpeta"
					+ "\n2-Ver info de Fichero"
					+ "\n3-Volver al menú principal");
			byte opcion = Byte.parseByte(sc.nextLine());
			switch(opcion) {
			case 1:
				System.out.println("Ingresa el nombre de la carpeta");
				String nombre = sc.nextLine();
				File carpeta = new File("c:" + File.separator+ nombre);
				if(carpeta.exists()) {
					System.out.println("Nombre: "+ carpeta.getName());
					System.out.println("Tamaño: "+ carpeta.length());
					System.out.println("Ruta: "+ carpeta.getPath());
				}else {
					System.out.println("La carpeta no existe");
				}
				break;
			case 2:
				System.out.println("Ingresa el nombre del fichero");
				String nombre2 = sc.nextLine();
				File archivo = new File("c:" +File.separator+"carpetaComplementariaParaElExamen" +File.separator+ nombre2);
				if(archivo.exists()) {
					System.out.println("Nombre: "+ archivo.getName());
					System.out.println("Tamaño: "+ archivo.length());
					System.out.println("Contenido: ");
					try {
						FileReader fr = new FileReader(archivo);
						BufferedReader br = new BufferedReader(fr);
						String linea;
						while((linea=br.readLine())!=null) {
							System.out.println(linea);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else {
					System.out.println("El archivo no existe");
				}
				break;
			case 3:
				System.out.println("Lo mismo que puse en gestor borrado");
				continuar = false;
				break;
				
			}
		}

	}

}
