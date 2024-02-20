package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane8 {
    public static void main(String[] args) {
        // Configura los textos de los botones en español
        UIManager.put("OptionPane.yesButtonText", "Sí");
        UIManager.put("OptionPane.noButtonText", "No");
        

        // Crea un JOptionPane con los botones en español
        int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", 
        		"Confirmar", JOptionPane.YES_NO_OPTION);

        // Maneja la opción seleccionada
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Has elegido Sí.");
        } else if (opcion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Has elegido No.");
        }
    }
}
