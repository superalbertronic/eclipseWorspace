package com.tapetaldev.MiniHeidiSQL;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.tapetaldev.MiniHeidiSQL.DATABASE.BDConector;
import com.tapetaldev.MiniHeidiSQL.FILE.WriteReadFile;

public class Main {
	
	
	
	public static void main(String[] args) {
	    BDConector bd = new BDConector();	
		WriteReadFile file = new WriteReadFile(); //Lectura del archivo
		Scanner s = new Scanner(System.in);
		
		boolean salir = false;
		int op = 0;
		String bdConsult;
		String tabla;
		

		while(!salir) {
			System.out.print("\n\n ######## Menu ########");
			System.out.print("\n1. Modificar Conexion BD(URL,PORT..).");
			System.out.print("\n2. Mostrar Conexion Actual con la BD.");
			System.out.print("\n3. Mostar todas las base datos Disponibles");
			System.out.print("\n4. Listar Tablas de una BD.");
			System.out.print("\n5. Realizar Consulta.");
			System.out.print("\n6. *******.");
			System.out.print("\n7. Salir.");
			
			try{
				System.out.print("\nOpcion: ");
				op = s.nextInt();
			}catch(InputMismatchException e) {
				System.out.print("Solo numeros!\n");
				s.next(); //limpia el buffer
			}
			switch(op){
				case 1:
					file.readFile();
					file.WriteFileFull();
					break;
				case 2:
					file.readFile();
					break;
				case 3:
					bd.fullbd();
					
					break;
				case 4:
					bd.fullbd();
					System.out.print("\nIntroduce la Base datos a consultar: ");
					bdConsult = s.next();
					bd.conexionBD(bdConsult);
					//bd.consultaTablas(bdConsult);
					break;
				case 5:
					bd.fullbd();
					System.out.print("\nIntroduce la Base datos a consultar: ");
					bdConsult = s.next();
					bd.conexionBD(bdConsult);
					System.out.println("");
					System.out.print("Introduce la tabla a consultar: ");
					tabla = s.next();
					bd.consultSelect(tabla);
				case 6,7:
					System.exit(0);
					
					break;
			}
		}
			
	}
	


}
