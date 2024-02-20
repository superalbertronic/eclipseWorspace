package ficherostexto.EjemploClase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuantas personas quieres meter en la empresa?: ");
		int NumPersonas = s.nextInt();

		for (int i = 0; i < NumPersonas; i++) {

			try {
				System.out.println("Nuevo trabajador para registrar");
				String Nombre = s.next();
				File Ruta = new File("C:\\prueba\\" + Nombre + ".txt"); // crear en esta ruta la carpeta empresa

				if (Ruta.exists()) {
					System.out.println("El archivo ya existe");
					continue; 																		// se podría decir que el continue es para que empiece otra vez el bucle pero con una interacción mas
				}

				BufferedWriter bw = new BufferedWriter(new FileWriter(Ruta));

				bw.write("Nombre: " + Nombre);

				System.out.println("Apellidos: ");
				bw.write("Apellidos: " + s.next() + "\n");

				System.out.println("Poner Dni: ");
				bw.write("Dni: " + s.next() + "\n");

				System.out.println("Correo: ");
				bw.write("Correo-Electronico: " + s.next() + "\n");

				System.out.println("Fichero creado");
				bw.close();

			} catch (IOException ioe) {
				System.out.println("No se ha podido escribir en el fichero");
			}
		}
	}
}