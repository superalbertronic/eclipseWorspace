package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana9Menu extends JFrame implements ActionListener { //implements es necesario
	//para poder manejar eventos de acción
    private JMenuBar mb = new JMenuBar(); //
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;

    public Ventana9Menu() {
        setTitle("Ejemplo de Menú con JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
               
        setJMenuBar(mb);
        menu1 = new JMenu("me canto tn to");
        mb.add(menu1);

        mi1 = new JMenuItem("Añadir tu tputa madre");
        mi1.addActionListener(this); //al utilizar la implementación, nos permite usar directamente
        //actionlistener this hace referencia al propio objeto
        menu1.add(mi1);

        mi2 = new JMenuItem("Listado de una mierda para ti");
        mi2.addActionListener(this);
        menu1.add(mi2);

        mi3 = new JMenuItem("Salir de este puto infierno de de tu puta nacion");
        mi3.addActionListener(this);
        menu1.add(mi3);
    }

    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane();
        if (e.getSource() == mi1) {
            contentPane.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == mi2) {
            contentPane.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == mi3) {
            contentPane.setBackground(new Color(0, 0, 255));
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
    	    public void run() {
    	    	 Ventana9Menu formulario1 = new Ventana9Menu();
    	            formulario1.setBounds(10, 20, 300, 200);
    	            formulario1.setVisible(true);
    	    }
    	});
    	
   
    }
}
