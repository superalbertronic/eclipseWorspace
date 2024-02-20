package juegoahorcadodani;

import java.util.Random;

import javax.swing.JOptionPane;

public class Funciones {
	
	public static String palabraSecreta() {
		
		String palabras[]= {"alcornoque","superman","rinoceronte","hienas"};
		Random r=new Random();
		byte palabraAleatoria=(byte) r.nextInt(palabras.length);
		
		return palabras[palabraAleatoria];
	}
	
	public static char [] palabrasGuiones(String palabra) {
		//con esto saco las letras de la palabra secreta
		byte nLetrasPalabraSecreta=(byte) palabra.length();
				
		//creo un array de char de guiones 
				
		char palabrasGuiones[]= new char [nLetrasPalabraSecreta*2-1];
		
		for(byte i=0, j=0; i<palabrasGuiones.length; i+=2) {
		palabrasGuiones[i]='_';
		if(i<palabrasGuiones.length-1) {
			palabrasGuiones[i+1]=' ';
			}
		}
		
		
		return palabrasGuiones;
	}
	
	//Este método lo que hace es comprobar con un for en una array si hay guiones.
	public static boolean hayGuiones(char[] comprobacion) {
		//Este tipo de for solo se usa en array!!
		for( int i=0;i<comprobacion.length;i++) {
			if (comprobacion[i]=='_')
				return true;
		}
		return false;
	}
	
	public static String dibujarAhorcado(int intentos) {
		String dibujo = "";
		switch (intentos) {
		case 7:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|____";
			break;
		case 6:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|       O";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|____";
			break;
		case 5:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|       O";
			dibujo+="\n|       |";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|____";
			break;
		case 4:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|       O";
			dibujo+="\n|      /|";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|____";
			break;
		case 3:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|       O";
			dibujo+="\n|      /|\\";
			dibujo+="\n|";
			dibujo+="\n|";
			dibujo+="\n|____";
			break;
		case 2:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|       O";
			dibujo+="\n|      /|\\";
			dibujo+="\n|      /";
			dibujo+="\n|";
			dibujo+="\n|____";
			break;
		case 1:
			dibujo+="\n ____";
			dibujo+="\n|       |";
			dibujo+="\n|       O";
			dibujo+="\n|      /|\\";
			dibujo+="\n|      / \\";
			dibujo+="\n|";
			dibujo+="\n|____";
			
			// Agrega el mensaje cuando el juego se pierde
            dibujo += "\n\nEn veces la vida no sale como quiere";
			break;
		}
		return dibujo;
	}
}
