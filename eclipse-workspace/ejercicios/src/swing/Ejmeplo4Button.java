package swing;

import javax.swing.*;
import java.awt.event.*;
public class Ejmeplo4Button extends JFrame implements ActionListener {
    JButton boton1,boton2;
    public Ejmeplo4Button() {
        getContentPane().setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(288,148,100,30);
        getContentPane().add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("ACEPTAR EN VERDAD");
        boton2.setBounds(91,148,137,47);
        getContentPane().add(boton2);
        boton2.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
        if (e.getSource()==boton2) {
            System.out.println("has pulsado el botón 2");
        }
        
    }
    
    public static void main(String[] ar) {
        Ejmeplo4Button formulario1=new Ejmeplo4Button();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}