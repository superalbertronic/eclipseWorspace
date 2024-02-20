package com.pblazquez.examen.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal2 extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6;

    public Principal2() {
        setTitle("Examen práctico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 300);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menu = new JMenu("Botones");
        menuBar.add(menu);

        mi1 = new JMenuItem("Botón 1");
        mi1.addActionListener(this);
        menu.add(mi1);

        mi2 = new JMenuItem("Botón 2");
        mi2.addActionListener(this);
        menu.add(mi2);

        mi3 = new JMenuItem("Botón 3");
        mi3.addActionListener(this);
        menu.add(mi3);

        mi4 = new JMenuItem("Botón 4");
        mi4.addActionListener(this);
        menu.add(mi4);

        mi5 = new JMenuItem("Botón 5");
        mi5.addActionListener(this);
        menu.add(mi5);

        mi6 = new JMenuItem("Botón 6");
        mi6.addActionListener(this);
        menu.add(mi6);

        JPanel botonPanel = new JPanel();
        JPanel panelNorte = new JPanel();
        JPanel panelSur = new JPanel();

        for (int i = 1; i <= 6; i++) {
            JButton boton = new JButton("Boton " + i);
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame ventanaNueva = new JFrame("Ventana Botón");
                    ventanaNueva.setSize(200, 200);
                    ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ventanaNueva.add(new JLabel("Se ha pulsado " + boton.getText()));
                    ventanaNueva.setVisible(true);
                }
            });
            if (i <= 3) {
                panelNorte.add(boton);
            } else {
                panelSur.add(boton);
            }
        }

        setLayout(new BorderLayout());
        add(panelNorte, BorderLayout.NORTH);
        add(panelSur, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Principal2();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi1) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el botón 1");
        } else if (e.getSource() == mi2) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el botón 2");
        } else if (e.getSource() == mi3) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el botón 3");
        } else if (e.getSource() == mi4) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el botón 4");
        } else if (e.getSource() == mi5) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el botón 5");
        } else if (e.getSource() == mi6) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el botón 6");
        }
    }
}
