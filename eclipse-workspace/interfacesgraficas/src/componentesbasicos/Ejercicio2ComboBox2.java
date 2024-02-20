package componentesbasicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2ComboBox2 extends JFrame {
    private JComboBox<String> comboBox;
    private JComboBox<String> ide;
    private JLabel lblSeleccionaUnIde;

    public Ejercicio2ComboBox2() {
        setTitle("Ejemplo JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(340, 132);

        //label lenguaje	
        JLabel label = new JLabel("Selecciona un lenguaje:");
        label.setBounds(30, 6, 250, 30);
        getContentPane().add(label);
        //combo y array lenguaje
        String[] opciones = {"","Java", "Kotlin", "PHP"};
        comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(170, 11, 120, 20);
        getContentPane().add(comboBox);
        //listener de lenguaje
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox.getSelectedIndex();
                comboBox.setSelectedIndex(0); // Establecer la selección en -1
                String seleccion= opciones[selectedIndex];
                mostrarMensaje("Indica el código", "Has elegido: " + seleccion);
            }
        });
        
        //label ide----------------------------------
        lblSeleccionaUnIde = new JLabel("Selecciona un ide:");
        lblSeleccionaUnIde.setBounds(30, 30, 250, 30);
        getContentPane().add(lblSeleccionaUnIde);
        
        //combo y array de ide
        String[] opciones2 = {"","Eclipse", "Visual Studio", "Intelli"};
        ide = new JComboBox<>(opciones2);
        ide.setBounds(170, 35, 120, 20);
        getContentPane().add(ide);
        
        
        //listener de ide
        
        ide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = ide.getSelectedIndex();
                ide.setSelectedIndex(0); // Establecer la selección en -1
                String seleccion2= opciones2[selectedIndex];
                mostrarMensaje("Indica el código", "Has elegido: " + seleccion2);
            }
        });
          
        setLocationRelativeTo(null);
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio2ComboBox2().setVisible(true);
        });
    }
}
