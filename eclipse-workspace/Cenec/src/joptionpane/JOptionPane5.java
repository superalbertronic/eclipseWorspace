package joptionpane;
import javax.swing.JOptionPane;

public class JOptionPane5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//es String
		String nombre=JOptionPane.showInputDialog(null,"Datos personales","edad",JOptionPane.INFORMATION_MESSAGE);
		if (nombre!=null) {
			System.out.println("la edad es "+nombre);
						
		}else {
			
			JOptionPane.showMessageDialog(null, "Hasta luego lucas");
			System.out.println("Te has ido");
		}
		
		
	}

}
