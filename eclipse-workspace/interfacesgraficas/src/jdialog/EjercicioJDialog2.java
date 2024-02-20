package jdialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioJDialog2 extends JFrame {

    public EjercicioJDialog2() {
        JButton botonAbrirDialog1 = new JButton("Abrir Diálogo 1");
        botonAbrirDialog1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirDialogo1();
            }
        });

        JButton botonAbrirDialog2 = new JButton("Abrir Diálogo 2");
        botonAbrirDialog2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirDialogo2();
            }
        });

        JButton botonAbrirDialog3 = new JButton("Abrir Diálogo 3");
        botonAbrirDialog3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirDialogo3();
            }
        });

        setLayout(new FlowLayout());
        add(botonAbrirDialog1);
        add(botonAbrirDialog2);
        add(botonAbrirDialog3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void abrirDialogo1() {
        JDialog dialogo = new JDialog(this, "Diálogo 1", true);
        configurarDialogo(dialogo, "Este es el Diálogo 1.");
    }

    private void abrirDialogo2() {
        JDialog dialogo = new JDialog(this, "Diálogo 2", true);
        configurarDialogo(dialogo, "Este es el Diálogo 2.");
    }

    private void abrirDialogo3() {
        JDialog dialogo = new JDialog(this, "Diálogo 3", true);
        configurarDialogo(dialogo, "Este es el Diálogo 3.");
    }

    private void configurarDialogo(JDialog dialogo, String textoEtiqueta) {
        JLabel etiqueta = new JLabel(textoEtiqueta);
        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });

        dialogo.setLayout(new BorderLayout());
        dialogo.add(etiqueta, BorderLayout.CENTER);
        dialogo.add(botonCerrar, BorderLayout.SOUTH);

        dialogo.setSize(200, 100);
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EjercicioJDialog2();
            }
        });
    }
}
