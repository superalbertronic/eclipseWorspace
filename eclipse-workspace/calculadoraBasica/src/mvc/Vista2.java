package mvc;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vista2 extends JFrame {

	private JTextField pantalla;
	private ActionListener controlador;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista2 frame = new Vista2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Vista2() {
		setTitle("Calculadora Básica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(250, 250));
		setLayout(new GridBagLayout());

		// configuracion inicial de las restriciones
		Restricciones rts = new Restricciones().addfill(GridBagConstraints.BOTH).addinsets(2).addweightx(1.0).addweighty(1.0);
		// crear el controlador
		//controlador = new Controlador(this, new Modelo());

		crearPantalla(rts);
		crearBotonera(rts);

		pack();
	}

	private void crearPantalla(Restricciones r) {
		pantalla = new JTextField("0");
		pantalla.setEditable(false);
		pantalla.setHorizontalAlignment(JTextField.RIGHT);

		// Agregamos un JTexfield en la fila 0 que será el último elemento
		getContentPane().add(pantalla,r.addgridwidth(GridBagConstraints.REMAINDER));
	}

	private void crearBotonera(Restricciones r) {
		final String[] comandos = {"/","*","-","C","9","8","7","6","5","4","+","3","2","1","0",".","="};
		
		for(int i=0;i<comandos.length;i++){
			getContentPane().add(configurarBoton(comandos[i]),r.getRestriccion(i));
		}
	}

	private JButton configurarBoton(String text) {
		JButton boton = new JButton(text);
		boton.setActionCommand(text);
		boton.addActionListener(controlador);
		return boton;
	}

	public void putText(String n) {
		pantalla.setText(n);
	}

	public String readText() {
		return pantalla.getText();
	}
}