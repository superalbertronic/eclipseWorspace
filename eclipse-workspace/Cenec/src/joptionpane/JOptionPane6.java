package joptionpane;
import javax.swing.JOptionPane;

public class JOptionPane6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//es String
		int codigo=JOptionPane.showConfirmDialog(null, 
				"¿Quieres darme un euro para una buena causa?", "Donacion", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE );
		
		if (codigo==JOptionPane.YES_OPTION){
            System.out.println("Has pulsado en SI");
        }else if(codigo==JOptionPane.NO_OPTION){
            System.out.println("Has pulsado en NO");
        }else {
        	System.out.println("Has pulsado en cancelar");
        	
        }
        		
	}

}
