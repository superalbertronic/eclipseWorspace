package jfilechooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploFileChooserAbrirGuardar extends JFrame {

    public EjemploFileChooserAbrirGuardar() {
        JButton botonAbrirGuardar = new JButton("Abrir o Guardar Archivo");
        botonAbrirGuardar.setBounds(59, 58, 155, 33);
        botonAbrirGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirOGuardarArchivo();
            }
        });
        getContentPane().setLayout(null);

        getContentPane().add(botonAbrirGuardar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void abrirOGuardarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showDialog(this, "Seleccionar");

        if (resultado == JFileChooser.APPROVE_OPTION) {
            if (fileChooser.getSelectedFile().exists()) {
                // Abrir archivo existente
                String nombreArchivo = fileChooser.getSelectedFile().getName();
                JOptionPane.showMessageDialog(this, "Archivo abierto: " + nombreArchivo);
            } else {
                // Guardar nuevo archivo
                JOptionPane.showMessageDialog(this, "Archivo guardado como: " + fileChooser.getSelectedFile().getName());
            }
        } else if (resultado == JFileChooser.CANCEL_OPTION) {
            // Operación cancelada
            JOptionPane.showMessageDialog(this, "Operación cancelada");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EjemploFileChooserAbrirGuardar();
            }
        });
    }
}

