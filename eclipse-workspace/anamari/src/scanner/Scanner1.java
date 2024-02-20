package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos=new Scanner(System.in);
		System.out.print("dime tu nombre: ");
		String nombre=datos.nextLine();
		System.out.print("dime apellidos: ");
		String apellidos=datos.nextLine();
		System.out.println("su nombre es "+nombre+" su apellido es "+apellidos);
		
	}

}
