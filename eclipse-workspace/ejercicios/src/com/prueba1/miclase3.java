package com.prueba1;

import java.util.*;

public class miclase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Empezamos el programa");
        System.out.println ("Por favor introduzca una cadena por teclado:");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        System.out.println(a^b);
        System.out.println(b^c);
        System.out.println(c^a);
        System.out.println(b^d);

		
		
	}

}


