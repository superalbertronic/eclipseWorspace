package swing;

import javax.swing.*;
public class Ejemplo1 extends JFrame{
    public Ejemplo1() {
        setLayout(null);
    }

    public static void main(String[] ar) {
        Ejemplo1 formulario1=new Ejemplo1();
        formulario1.setBounds(600,60,500,500);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}