package com.prueba1;

import javax.swing.*;

public class holamundoswing {
	

	public holamundoswing() {
		
		JFrame frame = new JFrame("ventana hola mundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hola mundo");
		frame.getContentPane().add(label);
		frame.setSize(220, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
		
	}
	
	public String texto1() {
			String texto2="Alberto";
			System.out.println(texto2);
			
		return texto2;
		
		
	}
	
	public static void apellidos() {
		String ape="Ruiz";
		System.out.println(ape);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		holamundoswing hola=new holamundoswing();
		hola.texto1();
		apellidos();
	}

}
