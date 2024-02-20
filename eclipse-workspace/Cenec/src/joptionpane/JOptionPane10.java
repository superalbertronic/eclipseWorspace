package joptionpane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.put("OptionPane.yesButtonText", "Si");
		UIManager.put("OptionPane.noButtonText","NOOL");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		int dialogue;
		dialogue=JOptionPane.showConfirmDialog(null, "indica que hacer","Dialogo",JOptionPane.YES_NO_CANCEL_OPTION);
		if (dialogue == JOptionPane.YES_OPTION) {
            System.out.println("has elegido Sí.");
        } else if (dialogue == JOptionPane.NO_OPTION) {
            System.out.println("Has elegido NOOL.");
        }else {
        	System.out.println("Has elegido cancelar.");
        	
        }
		
		
		
		
	}

}
