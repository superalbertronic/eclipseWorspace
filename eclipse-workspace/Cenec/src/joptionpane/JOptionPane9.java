package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class JOptionPane9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.put("OptionPane.yesButtonText", "Sí cansino");
		UIManager.put("OptionPane.noButtonText", "No idiota");
		UIManager.put("OptionPane.cancelButtonText", "cancelar payaso");
		int dialogo;
		dialogo=JOptionPane.showConfirmDialog(null,"indica algo en verdad","ventana en aspañol", 
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		
	}

}
