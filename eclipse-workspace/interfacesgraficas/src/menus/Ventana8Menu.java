package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana8Menu extends JFrame implements ActionListener {
    private JMenuBar mb = new JMenuBar();
    private JMenu menuClientes, menuProveedores;
    private JMenuItem mi1;

    public Ventana8Menu() {
        setTitle("Ejemplo de Men� con JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        setJMenuBar(mb);

        menuClientes = new JMenu("Clientes"); // Quitamos la declaraci�n "JMenu" para usar la variable de la clase
        mb.add(menuClientes);

        mi1 = new JMenuItem("Abrir");
        mi1.addActionListener(this);
        menuClientes.add(mi1);

        JMenuItem mi2 = new JMenuItem("Guardar");
        mi2.addActionListener(this);
        menuClientes.add(mi2);

        menuProveedores = new JMenu("Proveedores"); // Quitamos la declaraci�n "JMenu" para usar la variable de la clase
        mb.add(menuProveedores);

    }

    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane();
        if (e.getSource() == mi1) {
            contentPane.setBackground(new Color(255, 0, 0));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ventana8Menu formulario1 = new Ventana8Menu();
                formulario1.setBounds(10, 20, 300, 200);
                formulario1.setVisible(true);
            }
        });
    }
}