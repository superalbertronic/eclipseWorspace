package joptionpane;

import javax.swing.JOptionPane;

public class JoptionRepaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		
		nombre=JOptionPane.showInputDialog(null, "Dime tu nombre"," Datos personales",0);
		if (nombre!=null) {
			System.out.println("has pulsado ok");
		}else {
			System.out.println("has pulsado cancel");
		
		}	
		
		
	}

}
