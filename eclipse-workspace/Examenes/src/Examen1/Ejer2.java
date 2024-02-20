package Examen1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
		do {
        	System.out.println("¿Que desea hacer?");
        	System.out.println("Crear carpeta o fichero - introduce '1'");
        	System.out.println("Borrar carpeta o fichero - introduce '2'");
        	System.out.println("Ver información de un fichero o carpeta - introduce '3'");
        	System.out.println("Salir del programa - introduce '4'");
        	num  =  sc.nextInt();
        }while(num < 1 || num > 4);
        
        
		if(num == 1) {
			int fichero;
		    do {
		    	System.out.println("¿Que desea crear? fichero = 1 / carpeta = 2");
			    fichero = sc.nextInt();
		    }while(fichero < 1 || fichero > 2);
		    System.out.println("Introduce el nombre:");
		    String nombre = sc.next();
		    if(fichero == 1) {
		    	System.out.println("el fichero "+ nombre + " ha sido creado con exito");
		    	System.out.println("¿Desea introducir informacion?");
		    }
		    else {
		    	System.out.println("La carpeta " + nombre + " ha sido creada con exito");
		    }
		}
		else if(num == 2) {
			System.out.println("Introduce el nombre del archivo a borrar: ");
			String nombre = sc.next();
			System.out.println("El archivo " + nombre + " ha sido borrado con exito.");
		}
		else if(num == 3) {
			System.out.println("Introduce el nombre del archivo que quieres ver: ");
			String nombre = sc.next();
		}
		else {
			int salir;
			do {
				System.out.println("¿Seguro que quieres salir? si = 1 / no = 2");
				salir = sc.nextInt();
			}
			while(salir < 1 || salir > 2);
		}
    }
}
