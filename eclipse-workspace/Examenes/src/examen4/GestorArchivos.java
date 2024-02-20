package examen4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorArchivos {

	/*Posiblemente empieces corrigiendo esta clase, así que te recomiendo que vayas directamente
	 * a la clase MenuOpciones porque como aclaraste sobre el final que había que hacer 
	 * todo en un archivo yo ya tenía todos los gestores hechos y decidí dejarlos. Pero el examen
	 * está completo en MenuOpciones.
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de una carpeta o fichero");
		String nombre = sc.nextLine();
		if(nombre.endsWith(".txt")) {
			System.out.println("Desea introducir información?");
			if(sc.nextLine().toLowerCase().equals("si")) {
				System.out.println("Ingrese el texto a introducir");
				String contenido = sc.nextLine();
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter("c:"+File.separator+"carpetaComplementariaParaElExamen"+File.separator+nombre));
					bw.write(contenido);
					bw.flush();
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {
			File carpeta = new File("c:"+File.separator+nombre);
			if(carpeta.exists()) {
				System.out.println("La carpeta ya existe");
			}else {
				carpeta.mkdir();
				System.out.println("La carpeta fue creada");
			}		
		}
	}

}
