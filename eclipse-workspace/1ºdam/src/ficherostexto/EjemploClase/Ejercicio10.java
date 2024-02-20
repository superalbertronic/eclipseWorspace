package ficherostexto.EjemploClase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Que persona quieres buscar en la empresa?: ");
		String Persona = s.next();
		
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\prueba\\"+Persona+".txt"));
			String linea = "";
			
			
			
			while (linea!= null) {
				linea = br.readLine();
				if(linea!=null) {
					System.out.println(linea);
				}
			}


			br.close();

		} catch (IOException ioe) {
			System.out.println("Se ha producido un error de lectura");
			System.err.println(ioe.getMessage());
		}
	}
}
