package componentesbasicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Ejercicio1TextField2 extends JFrame {
    private JTextField nombreTextField, edadTextField, direccionTextField, ciudadTextField, provinciaTextField;
    private JLabel nombreLabel, edadLabel, lblDireccion, ciudadLabel, provinciaLabel;

    public Ejercicio1TextField2() {
        setTitle("Ejemplo JTextField con nombre y apellidos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(425, 184);
        getContentPane().setLayout(new GridLayout(0, 2, 0, 0));

        // Creación de label
        nombreLabel = new JLabel("Indica tu nombre:");
        getContentPane().add(nombreLabel);

        // Creación de text fields
        nombreTextField = new JTextField();
        getContentPane().add(nombreTextField);
        
                edadLabel = new JLabel("Indica tu edad:");
                getContentPane().add(edadLabel);
               
        edadTextField = new JTextField();
        edadTextField.setPreferredSize(new Dimension(50, 50)); 
       
        getContentPane().add(edadTextField);
        
                lblDireccion = new JLabel("Dirección");
                getContentPane().add(lblDireccion);

        direccionTextField = new JTextField();
        getContentPane().add(direccionTextField);
        
                ciudadLabel = new JLabel("Ciudad");
                getContentPane().add(ciudadLabel);

        ciudadTextField = new JTextField();
        getContentPane().add(ciudadTextField);
        
                provinciaLabel = new JLabel("Provincia");
                getContentPane().add(provinciaLabel);

        provinciaTextField = new JTextField();
        getContentPane().add(provinciaTextField);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio1TextField2().setVisible(true);
        });
    }
}

