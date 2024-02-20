package swing;

import javax.swing.*;

public class Ejemplo3label extends JFrame {
    private JLabel label1,label2,label3,label4;
    
    public Ejemplo3label() {
    	//Un despliegue es un objeto de la clase
    	//Layout (del paquete java. awt).
    	//Los contenedores tienen un método 
    	//setLayout(Layout l) con el que 
    	//se les puede asignar cualquier despliegue.
    	//La finalidad de los despliegues es
    	//facilitar al programador el trabajo de acomodar 
    	//los componentes gráficos.
        setLayout(null);
        label1=new JLabel("Rojo");
        label1.setBounds(10,20,100,30);
        add(label1);
        label2=new JLabel("Verde");
        label2.setBounds(10,60,100,30);
        add(label2);
        label3=new JLabel("Azul");
        label3.setBounds(10,100,100,30);
        add(label3);
        label4 = new JLabel("otro color");
        label4.setBounds(10,140,200,30);
        add(label4);
        
        
    }
    
    public static void main(String[] ar) {
        Ejemplo3label formulario1=new Ejemplo3label();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}