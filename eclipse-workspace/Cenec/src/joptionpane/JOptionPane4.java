package joptionpane;
import javax.swing.JOptionPane;

public class JOptionPane4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//es String
		String edad=JOptionPane.showInputDialog(null,"Datos personales","edad",0);
		if (edad!=null) {
			System.out.println("la edad es "+edad);
						
		}else {
			
			System.out.println("Te has ido");
		}
		
		
	}

}
