package parcial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class examenInterfaces1 extends JFrame {
    private static final String[] nombresBotones = {"Botón 1", "Botón 2", "Botón 3", "Botón 4", "Botón 5", "Botón 6"};

    public examenInterfaces1() {
        // Configuración del JFrame Principal
        setTitle("Examen Práctico");//establece el titulo
        setSize(400, 300);//se establece un tamaño
        setLocation(300, 300);

        // Diseño del Panel Principal
        JPanel botonPanel = new JPanel(new BorderLayout());

        //  Se Crean paneles con FlowLayout
        JPanel panelNorte = crearPanel("", FlowLayout.CENTER,0, 2);
        JPanel panelSur = crearPanel("", FlowLayout.CENTER, 3, 5);

        // Asociar los paneles a BotonPanel
        botonPanel.add(panelNorte, BorderLayout.NORTH);
        botonPanel.add(panelSur, BorderLayout.SOUTH);

        // Agregar BotonPanel al JFrame
        add(botonPanel);

        // Barra de Menú y Elementos de Menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menuBotones = new JMenu("Botones");

        // Generación de Elementos de Menú
        for (String nombreBoton : nombresBotones) {
        	//se crea el menu item que es el menu donde iran los elementos.
            JMenuItem menuItem = new JMenuItem(nombreBoton);
            menuItem.addActionListener(new ActionListener() {
               
                public void actionPerformed(ActionEvent e) {
               	//se utiliza para recuperar el comando asociado con el evento de acción.
                    procesarBoton(e.getActionCommand());
                }
            });
            //se añade el menuItem al menu Botones.
            menuBotones.add(menuItem);
        }

        // Agregar menú a la barra de menú
        menuBar.add(menuBotones);

        // Configurar la barra de menú en el JFrame
        setJMenuBar(menuBar);
    }
    // se crea una instancia privada con un constrcutor
    private JPanel crearPanel(String nombre, int alineacion, int inicio, int fin) {
        JPanel panel = new JPanel(new FlowLayout(alineacion));
        //Se utiliza para establecer un borde con un título en un panel.
        panel.setBorder(BorderFactory.createTitledBorder(nombre));
        //Bucle itera los botones
        for (int i = inicio; i <= fin; i++) {
            JButton boton = new JButton(nombresBotones[i]);
            configurarBoton(boton);
            panel.add(boton);

            // Agregar ActionListener para los botones en el panel
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    procesarBoton(e.getActionCommand());
                }
            });
        }

        return panel;
    }
//metodo privado configurar boton
    private void configurarBoton(JButton boton) {
        boton.setBackground(new Color(135, 206, 250));
        boton.setForeground(Color.BLACK);
    }
//metodo privado procesarBoton que muestra un mensaje por pantalla.
    private void procesarBoton(String nombreBoton) {
        JOptionPane.showMessageDialog(this, "Botón seleccionado: " + nombreBoton);
    }
//Main del codigo
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	examenInterfaces1 examen = new examenInterfaces1();
            examen.setVisible(true);
        });
    }
}
