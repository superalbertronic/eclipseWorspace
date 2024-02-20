package componentesbasicos;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3CheckBox2 extends JFrame {
    public Ejercicio3CheckBox2() {
        setTitle("Ejemplo JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox chckbxDeseaRecibirPublicidad = new JCheckBox("Desea recibir publicidad");
        getContentPane().add(chckbxDeseaRecibirPublicidad,BorderLayout.EAST);
               
        JCheckBox checkBox_1 = new JCheckBox("Aceptar términos y condiciones");
        getContentPane().add(checkBox_1, BorderLayout.WEST);
        setSize(445,213);
        setLocationRelativeTo(null);
    
       mensajeCheckBox(checkBox_1);
       mensajeCheckBox(chckbxDeseaRecibirPublicidad);
        
    
    //realiza lo mismo para desea recibir publicidad
    
    }
    private void mensajeCheckBox (JCheckBox nombre) {
    	nombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nombre.isSelected()) {
                	if(nombre.getName()=="checkBox_1") {
                    mostrarMensaje("Indica el código", "Has aceptado los términos y condiciones.");
                	} else if(nombre.getName()=="chckbxDeseaRecibirPublicidad") {
                	mostrarMensaje("Indica el código", "Has aceptado la publicidad");	
                	}
                }
            }
        });
    }
    private void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio3CheckBox2().setVisible(true);
        });
    }
}
