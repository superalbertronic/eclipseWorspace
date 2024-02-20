package swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class Ejercicio6Button extends JFrame implements ActionListener{
    private JButton boton1,boton2;
    public Ejercicio6Button() {
    	setBackground(Color.YELLOW);
        getContentPane().setLayout(null);
        boton1=new JButton("Varón");
        boton1.setBounds(10,11,100,30);
        boton1.addActionListener(this);
        getContentPane().add(boton1);
        boton2=new JButton("Mujer");
        boton2.setBounds(126,11,100,30);
        boton2.addActionListener(this);
        getContentPane().add(boton2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("Varón");
        }
        if (e.getSource()==boton2) {
            setTitle("Mujer");
        }
    }
    
    public static void main(String[] ar) {
        Ejercicio6Button formulario1=new Ejercicio6Button();
        formulario1.setBounds(0,0,130,140);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}