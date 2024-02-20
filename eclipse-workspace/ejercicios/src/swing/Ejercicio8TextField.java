package swing;


//variar este ejercicio y añadir,resta, multiplicacion, division y cerrar


import javax.swing.*;
import java.awt.event.*;
public class Ejercicio8TextField extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 809020124781061004L;
	private JTextField textfield1,textfield2;
    private JButton boton1,boton2;
   

    public Ejercicio8TextField() {
        getContentPane().setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,100,30);
        getContentPane().add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(10,50,100,30);
        getContentPane().add(textfield2);
        boton1=new JButton("Sumar");
        boton1.setBounds(10,90,100,30);
        getContentPane().add(boton1);
        
        boton2 = new JButton("Restar");
        boton2.setBounds(129, 90, 91, 30);
        getContentPane().add(boton2);
        boton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma); //valueof convierte a una cadenastring
            setTitle(total);
            JOptionPane.showMessageDialog(null, "La suma es "+total);
        }
        if (e.getSource()==boton2) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1-x2;
            String total=String.valueOf(resta); //valueof convierte a una cadenastring
            setTitle(total);
            JOptionPane.showMessageDialog(null, "La resta es "+total);
        }
   } 
    public static void main(String[] ar) {
        Ejercicio8TextField formulario1=new Ejercicio8TextField();
        formulario1.setBounds(0,0,240,170);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}