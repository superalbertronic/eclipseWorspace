package interfacesgraficasopcionpane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class examenpractico1ºtrim2324version2 extends JFrame {

    public examenpractico1ºtrim2324version2() {
        // Configuración del JFrame principal
        setTitle("Examen práctico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(300, 300);

        // Crear un panel principal con BorderLayout
        JPanel BotonPanel = new JPanel(new BorderLayout());
        String[] nombresBotones = {"Botón 1", "Botón 2", "Botón 3", "Botón 4", "Botón 5", "Botón 6"};

        // Crear panel para los botones del Norte
        JPanel panelNorte = new JPanel(new FlowLayout());
        JPanel panelSur = new JPanel(new FlowLayout());
     

        for (int i = 0; i < 6; i++) {
            JButton boton = new JButton(nombresBotones[i]);
            configurarBoton(boton);
            boton.addActionListener(e -> procesarBoton(e));

            if (i < 3) {
                // Agregar los primeros tres botones al panelNorte
                panelNorte.add(boton);
            } else {
                // Agregar los siguientes tres botones al panelSur
                panelSur.add(boton);
            }
        }

        BotonPanel.add(panelNorte, BorderLayout.NORTH);
        BotonPanel.add(panelSur, BorderLayout.SOUTH);


        // Agregar paneles Norte y Sur al panel principal
        BotonPanel.add(panelNorte, BorderLayout.NORTH);
        BotonPanel.add(panelSur, BorderLayout.SOUTH);

        // Agregar el panel principal al centro del JFrame
        add(BotonPanel, BorderLayout.CENTER);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menuBotones = new JMenu("Botones");

        // Crear elementos de menú para cada botón
        for (String nombre : nombresBotones) {
            JMenuItem menuItem = new JMenuItem(nombre);
            // Agregar un ActionListener directamente para manejar clics en los elementos del menú
            menuItem.addActionListener((ActionEvent e) -> {
                // Crear la nueva ventana al pulsar la opción del menú
                JFrame nuevaVentana = new JFrame("Ventana " + nombre);
                nuevaVentana.setSize(300, 200);
                nuevaVentana.setLocation(300, 300);

                JLabel label = new JLabel("Se ha pulsado " + nombre);
                JButton cerrarBoton = new JButton("Cerrar");
                cerrarBoton.addActionListener(e2 -> nuevaVentana.dispose());

                nuevaVentana.setLayout(new BorderLayout());
                nuevaVentana.add(label, BorderLayout.CENTER);
                nuevaVentana.add(cerrarBoton, BorderLayout.SOUTH);

                nuevaVentana.setVisible(true);
            });
            // Agregar el elemento del menú al menú
            menuBotones.add(menuItem);
        }

        // Agregar el menú a la barra de menú
        menuBar.add(menuBotones);
        // Establecer la barra de menú en el JFrame
        setJMenuBar(menuBar);
    }

    // Método para configurar la apariencia de los botones
    private void configurarBoton(JButton boton) {
        boton.setBackground(new Color(135, 206, 250));
        boton.setForeground(Color.BLACK);
    }

    // Método para manejar acciones de los botones
    private void procesarBoton(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        JFrame nuevaVentana = new JFrame("Ventana " + source.getText());
        nuevaVentana.setSize(300, 200);

        JLabel label = new JLabel("Se ha pulsado " + source.getText());
        JButton cerrarBoton = new JButton("Cerrar");
        cerrarBoton.addActionListener(e2 -> nuevaVentana.dispose());

        nuevaVentana.setLayout(new BorderLayout());
        nuevaVentana.add(label, BorderLayout.CENTER);
        nuevaVentana.add(cerrarBoton, BorderLayout.SOUTH);
        nuevaVentana.setLocation(300, 300);
        nuevaVentana.setVisible(true);
    }

    public static void main(String[] args) {
        // Iniciar la aplicación Swing en el hilo de despacho de eventos
    	SwingUtilities.invokeLater(new Runnable() {
    	    @Override
    	    public void run() {
    	        new examenpractico1ºtrim2324version2().setVisible(true);
    	    }
    	});

    }
}
