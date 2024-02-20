package CalculadoraMvc;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vista extends JFrame {

	private JTextField pantalla;
	private ActionListener controlador;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Vista() {
		setTitle("Calculadora Básica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(250, 250));
		setLayout(new GridBagLayout());

		// configuracion inicial de las restriciones
		Restricciones rts = new Restricciones().addfill(GridBagConstraints.BOTH).addinsets(2).addweightx(1.0).addweighty(1.0);
		// crear el controlador
		controlador = new Controlador(this, new Modelo());

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
		// Agregar los 3 primeros botones / * - en la fila 1
		getContentPane().add(configurarBoton("/"), r.addgridwidth(1));
		getContentPane().add(configurarBoton("*"), r);
		getContentPane().add(configurarBoton("-"), r);

		// Agregamos el ultimo boton C de la fila 1
		getContentPane().add(configurarBoton("C"),r.addgridwidth(GridBagConstraints.REMAINDER));

		// Agregamos los 3 primeros botones 9 8 7 de la fila 2
		getContentPane().add(configurarBoton("9"), r.addgridwidth(1));
		getContentPane().add(configurarBoton("8"), r);
		getContentPane().add(configurarBoton("7"), r);

		// Agregamos los 3 primeros botones 6 5 4 de la fila 3
		getContentPane().add(configurarBoton("6"), r.addGridy(3));
		getContentPane().add(configurarBoton("5"), r);
		getContentPane().add(configurarBoton("4"), r);

		// Agregamos el ultimo boton + en la fila 2 que ocupara 2 filas
		getContentPane().add(configurarBoton("+"),r.addgridheight(2).addGridy(GridBagConstraints.RELATIVE).addgridwidth(GridBagConstraints.REMAINDER));

		// Agregamos los 3 primeros botones 3 2 1 de la fila 4
		getContentPane().add(configurarBoton("3"),r.addgridheight(1).addgridwidth(1));
		getContentPane().add(configurarBoton("2"), r);
		getContentPane().add(configurarBoton("1"), r);

		// Agregamos el primer boton 0 de la fila 5 que ocupara 2 columnas
		getContentPane().add(configurarBoton("0"),r.addgridwidth(2).addGridy(5));

		// Agregamos el siguiente boton . de la fila 5, este solo debe ocupar una columna
		getContentPane().add(configurarBoton("."), r.addgridwidth(1));

		// Agregamos el boton = de la fila 3 que ocupara 2 filas
		getContentPane().add(configurarBoton("="),r.addgridheight(2).addGridy(GridBagConstraints.RELATIVE).addgridwidth(GridBagConstraints.REMAINDER));
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