package componentesbasicos;

import javax.swing.*;


public class EjercicioCheckBoxSinInvoke extends JFrame{

	  public static void main(String[] args) {
		  	JFrame ventana=new JFrame();
		  		ventana.setTitle("Ejemplo JCheckBox");
		  		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  		JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");
		  		ventana.add(checkBox);
		  		ventana.setSize(300,200);
		  		ventana.setLocationRelativeTo(null);
		  		ventana.setVisible(true);
	  }
}