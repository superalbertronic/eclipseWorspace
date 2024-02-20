package componentesbasicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjercicioRadioButton6 extends JFrame {
    public EjercicioRadioButton6() {
        setTitle("Matrix");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton1 = new JRadioButton("Pastilla Azul");
        JRadioButton radioButton2 = new JRadioButton("Pastilla roja");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        add(panel);

        pack();
        setLocationRelativeTo(null);

        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 mostrarMensaje("Eleccion elegida", "Has elegida la opcion azul, quedate en tu mundo de fantasia");
               
               
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  mostrarMensaje("Eleccion elegida", "Has elegida la opcion roja, te contaré la verdad sobre Matrix.");
               
            }
        });
        
    
    
    }
    private void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjercicioRadioButton6().setVisible(true);
        });
    }
}
