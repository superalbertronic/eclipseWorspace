package componentesbasicos;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3CheckBox3 extends JFrame {
    public Ejercicio3CheckBox3() {
        setTitle("Ejemplo JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox chckbxDeseaRecibirPublicidad = new JCheckBox("Desea recibir publicidad");
        getContentPane().add(chckbxDeseaRecibirPublicidad,BorderLayout.EAST);
               
        JCheckBox checkBox_1 = new JCheckBox("Aceptar términos y condiciones");
        getContentPane().add(checkBox_1, BorderLayout.WEST);
        setSize(445,213);
        setLocationRelativeTo(null);
    
        checkBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox_1.isSelected()) {
                    mostrarMensaje("Indica el código", "Has aceptado los términos y condiciones.");
                } else {
                    mostrarMensaje("Indica el código", "Has desmarcado los términos y condiciones.");
                }
            }
        });
    
    //realiza lo mismo para desea recibir publicidad
    
    }
    private void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio3CheckBox3().setVisible(true);
        });
    }
}
