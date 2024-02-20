package joptionpane;
import javax.swing.JOptionPane;
public class JOptionPane2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null indica que es independiente, y no esta vinculado a ninguna ventana existente
		JOptionPane.showMessageDialog(null, 
				"Su ordenador tiene un Ransomware", "Error grave", 
				JOptionPane.INFORMATION_MESSAGE);
			
	}

}
