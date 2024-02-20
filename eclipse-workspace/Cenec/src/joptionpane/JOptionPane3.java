package joptionpane;
import javax.swing.JOptionPane;
public class JOptionPane3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null indica que es independiente, y no esta vinculado a ninguna ventana existente
		
		String nombre = JOptionPane.showInputDialog(null, 
				"Dime tu nombre", "Datos personales", 
				JOptionPane.QUESTION_MESSAGE);
		
		if (nombre != null) {
            System.out.println("Le has dado ok, tu nombre es " + nombre);
           
        } else {
            System.out.println("Le has dado a cancelar");
            
        }
			
	}

}
