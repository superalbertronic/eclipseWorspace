package safa1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class VentanaVentana {

	private JFrame frame;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAño;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVentana window = new VentanaVentana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTexto0 = new JLabel("Día :");
		lblTexto0.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTexto0.setForeground(SystemColor.text);
		lblTexto0.setBounds(23, 79, 61, 16);
		panel.add(lblTexto0);
		
		JLabel lblTexto1 = new JLabel("Mes :");
		lblTexto1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTexto1.setForeground(new Color(254, 255, 255));
		lblTexto1.setBounds(23, 126, 61, 16);
		panel.add(lblTexto1);
		
		JLabel lblTexto2 = new JLabel("Año :");
		lblTexto2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTexto2.setForeground(SystemColor.text);
		lblTexto2.setBounds(23, 173, 61, 16);
		panel.add(lblTexto2);
		
		textField = new JTextField();
		textField.setBounds(87, 41, 289, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textDia = new JTextField();
		textDia.setForeground(new Color(0, 0, 0));
		textDia.setBounds(68, 75, 130, 26);
		panel.add(textDia);
		textDia.setColumns(10);
		
		
		textMes =  new JTextField();
		textMes.setForeground(new Color(0, 0, 0));
		textMes.setBounds(68, 122, 130, 26);
		panel.add(textMes);
		textMes.setColumns(10);
		
		textAño = new JTextField();
		textAño.setBounds(68, 169, 130, 26);
		panel.add(textAño);
		textAño.setColumns(10);
		
		JButton btnFichero = new JButton("Datos fichero");
		btnFichero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Scanner datos = new Scanner (System.in);

				System.out.println("Ingrese día de nacimiento: ");
				Integer dia  = datos.nextInt();

				System.out.println("Ingrese mes de nacimiento: ");
				Integer mes = datos.nextInt();
				
				System.out.println("Ingrese año de nacimiento: ");
				Integer año = datos.nextInt();
				
				textDia.setText(dia.toString());
				
				textAño.setText(año.toString());
				
				textMes.setText(mes.toString());
				 
				
				 
				
				
			}
		});
		btnFichero.setBounds(81, 219, 117, 29);
		panel.add(btnFichero);
		
		
		
		JButton btnNewButton = new JButton("Consola");
		btnNewButton.setBounds(259, 219, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.println(textDia.getText());
				String fechaCuadritos = String.format("%02d", Integer.parseInt(textDia.getText())) + "/" + String.format("%02d", Integer.parseInt(textMes.getText())) + "/" + textAño.getText();
				System.out.println(fechaCuadritos);
				LocalDate fechaNac = LocalDate.parse(fechaCuadritos, fmt);
				LocalDate ahora = LocalDate.now();

				Period periodo = Period.between(fechaNac, ahora);
				System.out.printf("Tu edad es: %s años, %s meses y %s días",
				                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
					 
				String textoFecha = null;
				textoFecha = "Tu edad es: " + periodo.getYears() + " años " + periodo.getMonths() + " meses y " + periodo.getDays() + "  días";
				
				
			     
			     textField.setText(textoFecha);
                  
			}
		});
		btnCalcular.setBounds(259, 122, 117, 29);
		panel.add(btnCalcular);
		
		JLabel lblTexto2_1 = new JLabel("GESTIÓN DE CUMPLEAÑOS");
		lblTexto2_1.setForeground(SystemColor.text);
		lblTexto2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTexto2_1.setBounds(130, 18, 196, 27);
		panel.add(lblTexto2_1);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("/Users/jesusbenitezmaestre/Desktop/purple_and_blue_light_gradient_background.jpg"));
		lblFondo.setBounds(0, 0, 450, 272);
		panel.add(lblFondo);
	}
}
