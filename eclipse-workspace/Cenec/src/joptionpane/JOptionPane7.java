package joptionpane;
import javax.swing.JOptionPane;

public class JOptionPane7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//es String
		// se puede poner en español, pero hay que cambiar la configuracion de eclipse del proyecto
		int res=JOptionPane.showConfirmDialog(null, "Cita","Quieres salir conmigo", 
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (res==JOptionPane.YES_OPTION) {
        		System.out.println("tu respuesta ha sido si");
        	
        }else if(res==JOptionPane.NO_OPTION) {
    		System.out.println("tu respuesta ha sido NO");
        }else {
    		System.out.println("tu respuesta ha sido CANCELAR");
    		String name = JOptionPane.showInputDialog("Type your name please");
     }

		
		
	}

}
