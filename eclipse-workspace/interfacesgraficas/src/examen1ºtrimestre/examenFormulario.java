package examen1ºtrimestre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class examenFormulario extends JFrame {
	
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldEdad;
	private JTextArea textAreaComentarios;
	private JCheckBox checkBoxJava;
	private JCheckBox checkBoxPython;
	private JRadioButton radioButtonBachillerato;
	private JRadioButton radioButtonCicloMedio;
	private JRadioButton radioButtonCicloSuperior;
	private JButton botonCargarCurriculum;

	public examenFormulario() {
		
		//Configuración del panel formulario alumno. 
		
		setTitle("Formulario para Alumnos de FP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(new GridLayout(9, 1, 8, 5));
		
		//Usamos Label poner las etiquetas como nombres, apellidos, comentarios...
		
		JLabel labelNombre = new JLabel("Nombre:");
		textFieldNombre = new JTextField();
		JLabel labelApellidos = new JLabel("Apellidos:");
		textFieldApellidos = new JTextField();
		JLabel labelEdad = new JLabel("Edad:");
		textFieldEdad = new JTextField();
		JLabel labelComentarios = new JLabel("Comentarios:");
		textAreaComentarios = new JTextArea();
		
		//JScrollPane para escribir un breve texto del alumnado
		
		JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
		
		//CheckBoxJava lo usamos para establecer los niveles de estudios
		
		checkBoxJava = new JCheckBox("Java");
		checkBoxPython = new JCheckBox("Python");
		radioButtonBachillerato = new JRadioButton("Bachillerato");
		radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
		radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
		ButtonGroup groupNivelEstudios = new ButtonGroup();
		groupNivelEstudios.add(radioButtonBachillerato);
		groupNivelEstudios.add(radioButtonCicloMedio);
		groupNivelEstudios.add(radioButtonCicloSuperior);
		botonCargarCurriculum = new JButton("Cargar Curriculum");
		
		//Añadimos todas las variables al panel formulario
		
		panelFormulario.add(labelNombre);
		panelFormulario.add(textFieldNombre);
		panelFormulario.add(labelApellidos);
		panelFormulario.add(textFieldApellidos);
		panelFormulario.add(labelEdad);
		panelFormulario.add(textFieldEdad);
		panelFormulario.add(labelComentarios);
		panelFormulario.add(scrollPane);
		panelFormulario.add(checkBoxJava);
		panelFormulario.add(checkBoxPython);
		panelFormulario.add(radioButtonBachillerato);
		panelFormulario.add(radioButtonCicloMedio);
		panelFormulario.add(radioButtonCicloSuperior);
		panelFormulario.add(botonCargarCurriculum);
		
		//Esto sirve para centrar el panel.
		
		getContentPane().add(panelFormulario, BorderLayout.CENTER);

		JPanel panelBotones = new JPanel();
		JButton botonCerrar = new JButton("Cerrar");
		JButton botonAceptar = new JButton("Aceptar");
		panelBotones.add(botonCerrar);
		panelBotones.add(botonAceptar);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		
		//El AcctionListener sirve para darle una acción al botón aceptar 
		
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Recopilar la información del formulario
				String nombre = textFieldNombre.getText();
				String apellidos = textFieldApellidos.getText();
				String edad = textFieldEdad.getText();
				String comentarios = textAreaComentarios.getText();
				boolean javaChecked = checkBoxJava.isSelected();
				boolean pythonChecked = checkBoxPython.isSelected();
				String nivelEstudios = "";
				if (radioButtonBachillerato.isSelected()) {
					nivelEstudios = "Bachillerato";
				} else if (radioButtonCicloMedio.isSelected()) {
					nivelEstudios = "Ciclo Medio";
				} else if (radioButtonCicloSuperior.isSelected()) {
					nivelEstudios = "Ciclo Superior";
				}

				// Mostrar la información en un JOptionPane
				String mensaje = "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Edad: " + edad + "\n"
						+ "Comentarios: " + comentarios + "\n" + "Java: " + javaChecked + "\n" + "Python: "
						+ pythonChecked + "\n" + "Nivel de Estudios: " + nivelEstudios;

				JOptionPane.showMessageDialog(examenFormulario.this, mensaje, "Información del Formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//El ActionListener establece en el botón cerrar que cierre el programa
		
		botonCerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Abrir ventana de agradecimiento
				mostrarVentanaAgradecimiento();
			}
		});
		
		botonCargarCurriculum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para cargar el currículum
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(examenFormulario.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(examenFormulario.this,
							"Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		pack();
		setLocationRelativeTo(null);
	}
	
	//Esta función establece la configuracion de la ventana Agradaceimiento  
	
	private void mostrarVentanaAgradecimiento() {
		JDialog dialogoAgradecimiento = new JDialog(examenFormulario.this, "Agradecimiento", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

		JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);
		
		//El ActionListener del botón aceptar termina cerrando la ventana agradecimiento.
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cerrar la ventana de agradecimiento
				dialogoAgradecimiento.dispose();

				// Cerrar la aplicación
				System.exit(0);
			}
		});

		JPanel panelAgradecimiento = new JPanel();
		panelAgradecimiento.add(labelAgradecimiento);

		JPanel panelBoton = new JPanel();
		panelBoton.add(botonAceptar);

		dialogoAgradecimiento.getContentPane().add(panelAgradecimiento, BorderLayout.CENTER);
		dialogoAgradecimiento.getContentPane().add(panelBoton, BorderLayout.SOUTH);

		dialogoAgradecimiento.setSize(300, 150);
		dialogoAgradecimiento.setLocationRelativeTo(examenFormulario.this);
		dialogoAgradecimiento.setVisible(true);
	}
	
	//Practicamente esto ayuda a lanzar el programa
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			examenFormulario ventana = new examenFormulario();
			ventana.setVisible(true);
		});
	}
}
