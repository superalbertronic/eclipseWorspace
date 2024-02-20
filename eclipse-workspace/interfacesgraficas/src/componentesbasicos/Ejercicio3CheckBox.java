package componentesbasicos;

import javax.swing.*;

public class Ejercicio3CheckBox extends JFrame {
    public Ejercicio3CheckBox() {
        setTitle("Ejemplo JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");
        add(checkBox);
        setSize(300,200);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio3CheckBox().setVisible(true);
        });
    }
}
