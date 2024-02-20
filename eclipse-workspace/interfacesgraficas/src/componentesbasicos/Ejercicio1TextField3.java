package componentesbasicos;

import javax.swing.*;

//realizar este ejercicio usando Arrays y controlando que en edad no se pueda poner texto
public class Ejercicio1TextField3 extends JFrame {
	private JLabel label;
	private JTextField textField;
	    
    public Ejercicio1TextField3() {
        setTitle("Ejemplo JTextField con nombre y apellidos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLayout(null);
        setSize(510, 259);
        //creación de label
        String[] labels = {"Nombre", "Edad", "Dirección", "Ciudad", "Provincia"};

        for (int i = 0; i < labels.length; i++) {
            // Crear JLabel
            label = new JLabel("Indica tu " + labels[i] + ":");
            label.setBounds(10, 10 + i * 31, 150, 20);
            getContentPane().add(label);

            // Crear JTextField para todos los campos
            textField = new JTextField();
            textField.setBounds(160, 10 + i * 31, 175, 20);
            getContentPane().add(textField);
        }


        

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio1TextField3().setVisible(true);
        });
    }
}
