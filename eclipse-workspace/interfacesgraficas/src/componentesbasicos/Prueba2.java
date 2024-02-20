package componentesbasicos;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Prueba2 extends JFrame{
	private JTextField textField_nombre;
	private JTextField textField_Apellidos;
	public Prueba2() {
		
		JPanel formulario = new JPanel();
		getContentPane().add(formulario, BorderLayout.NORTH);
		formulario.setLayout(new GridLayout(9, 5, 2, 2));
		
		textField_nombre = new JTextField();
		formulario.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		JLabel lblNewLabel_Nombre = new JLabel("Nombre");
		formulario.add(lblNewLabel_Nombre);
		
		JLabel lblNewLabel_apellidos = new JLabel("Apellidos");
		formulario.add(lblNewLabel_apellidos);
		
		textField_Apellidos = new JTextField();
		formulario.add(textField_Apellidos);
		textField_Apellidos.setColumns(10);
		
		JPanel botones = new JPanel();
		getContentPane().add(botones, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		botones.add(btnNewButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
