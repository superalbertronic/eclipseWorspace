package componentesbasicos;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
public class EjercicioWindowBuilder1 extends  JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public EjercicioWindowBuilder1() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel formulario = new JPanel();
		getContentPane().add(formulario, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		formulario.add(lblNewLabel);
		
		textField = new JTextField();
		formulario.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		formulario.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		formulario.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		formulario.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		formulario.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		formulario.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		formulario.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Estudios");
		formulario.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		formulario.add(comboBox);
		
		JPanel Botones = new JPanel();
		getContentPane().add(Botones, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botones.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		Botones.add(btnNewButton);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(() -> {
			 EjercicioWindowBuilder1 ventana = new EjercicioWindowBuilder1();
			  ventana.setSize(300, 400);
			  ventana.setLocationRelativeTo(null);
	            ventana.setVisible(true);
	            
	        });
	}

}