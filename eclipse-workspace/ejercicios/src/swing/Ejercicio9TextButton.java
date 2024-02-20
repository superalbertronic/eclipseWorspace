package swing;

import javax.swing.*;
import java.awt.event.*;
public class Ejercicio9TextButton extends JFrame implements ActionListener {
    private JLabel label1,label2;
    private JTextField textfield1,textfield2;
    private JButton boton1;
    public Ejercicio9TextButton() {
        setLayout(null);
        label1=new JLabel("Nombre:");
        label1.setBounds(10,10,100,30);
        add(label1);
        label2=new JLabel("Clave:");
        label2.setBounds(10,50,100,30);
        add(label2);
        textfield1=new JTextField();
        textfield1.setBounds(130,10,100,30);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(130,50,100,30);
        add(textfield2);
        boton1=new JButton("Confirmar");
        boton1.setBounds(10,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            if (cad1.equals("alberto")==true && cad2.equals("1234")==true) {
                setTitle("Correcto");
                JOptionPane.showMessageDialog(null, "Que torpe eres canio, anda te lo doy por bueno");
            } else {
                setTitle("Incorrecto");
                JOptionPane.showMessageDialog(null, "Torpe, torpe, no zirves pa na");
            }
        }
    }
    
    public static void main(String[] ar) {
        Ejercicio9TextButton formulario1=new Ejercicio9TextButton();
        formulario1.setBounds(0,0,260,200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}