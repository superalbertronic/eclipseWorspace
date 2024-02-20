package swing;

import javax.swing.*;
public class EjercicioTextarea1 extends JFrame{
    private JTextField textfield1;
    private JTextArea textarea1;
    public EjercicioTextarea1() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1=new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);
    }

    public static void main(String[] ar) {
        EjercicioTextarea1 formulario1=new EjercicioTextarea1();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}