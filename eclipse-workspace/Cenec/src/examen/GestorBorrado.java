package examen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class GestorBorrado {

	public static void main(String[] args) {
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		while(continuar) {
			System.out.println("Elige una opción del menú:\n1-Borrar carpeta"
					+ "\n2-Borrar Fichero"
					+ "\n3-Volver al menú principal");
			byte opcion = Byte.parseByte(sc.nextLine());
			switch(opcion) {
			case 1:
				System.out.println("Introduce el nombre de la carpeta a borrar");
				String nombreCarpeta = sc.nextLine();
				File carpeta = new File("c:" + File.separator + nombreCarpeta);
				if(carpeta.exists()) {
					System.out.println("La carpeta podría contener ficheros, desea borrarla igualmente?");
					if(sc.nextLine().toLowerCase().equals("si")) {
						try {
							FileUtils.deleteDirectory(carpeta);
							System.out.println("La carpeta fue borrada con éxito");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					} else {
						System.out.println("La carpeta no fue borrada");
					}		
				}else {
					System.out.println("La carpeta no existe");
				}
				
				break;
			case 2: 
				System.out.println("Introduce el nombre del archivo a borrar");
				String nombreFichero = sc.nextLine();
				File archivo = new File("c:" + File.separator + "carpetaComplementariaParaElExamen"+ File.separator + nombreFichero);
				if(archivo.exists()) {
					archivo.delete();
					System.out.println("El fichero fue eliminado");
				}else {
					System.out.println("El archivo no existe");
				}
				break;
			case 3:
				System.out.println("Esto no lo tengo en el menú principal porque tendría que haber"
						+ "estado especificado en el exámen que todo tenía que estar en el mismo archivo"
						+ "y no yo estar adivinando, así que voy a utilizar esta opción para salir de"
						+ "ESTE menú.");
				continuar = false;
				break;
			default: 
					break;
			}
		}

	}

}
