package examen1trimestre;

import java.util.Scanner;

public class GestorArchivos {
	Scanner sc = new Scanner(System.in);
	String ruta = ".\\carpetas\\";
	String nombreArchivo;
	String contenido;
	boolean esFichero;
	
	public void nombreArchivo() {
		String nombre="";
		
		do {
			System.out.println("Dime el nombre del archivo o fichero(con la extensión que corresponda, si es un fichero).");
			nombre = sc.nextLine();
		}while(nombre=="");
		
		if(nombre.contains(".")) {
			esFichero=true;
			System.out.println("¿Quieres introducir información en el fichero?");
			String respuesta=sc.nextLine();
			
			if(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("sí")) {
				System.out.println("Escribe el contenido del fichero "+ nombre);
				contenido = sc.nextLine();
				
				
			}
		}
		nombreArchivo = nombre;		
	}

	public String getRuta() {
		return ruta;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public String getContenido() {
		return contenido;
	}

	public boolean esFichero() {
		return esFichero;
	}
	
}
