package examen1ºtrimestre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ExamenFinal extends JFrame {
	// Las variables que vamos a utilizar
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
	private JLabel labelLenguages;
	private JLabel labelVacio;

	public ExamenFinal() {
		// Title de la ventana
		setTitle("Registro para alumnos de Formación Profesional (FP)");
		// Cierra aplicacion cuando pusamos la crus
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Ponemos layout borderLayout
		getContentPane().setLayout(new BorderLayout());		
		// Ponemos otro layout para el formulario
		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(new GridLayout(10, 1, 10, 6));		
		// Input de los datos de usuario
		JLabel labelNombre = new JLabel("Nombre:");
		textFieldNombre = new JTextField();
		JLabel labelApellidos = new JLabel("Apellidos:");
		textFieldApellidos = new JTextField();
		JLabel labelEdad = new JLabel("Edad:");
		textFieldEdad = new JTextField();
		JLabel labelComentarios = new JLabel("Comentarios:");
		textAreaComentarios = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
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
		//Anadimos al panel
		panelFormulario.add(labelNombre);
		panelFormulario.add(textFieldNombre);
		panelFormulario.add(labelApellidos);
		panelFormulario.add(textFieldApellidos);
		panelFormulario.add(labelEdad);
		panelFormulario.add(textFieldEdad);
		panelFormulario.add(labelComentarios);
		panelFormulario.add(scrollPane);
		labelLenguages = new JLabel("Lenguajes De programacion conocidos");
		panelFormulario.add(labelLenguages);
		labelVacio = new JLabel("");
		panelFormulario.add(labelVacio);
		panelFormulario.add(checkBoxJava);
		panelFormulario.add(checkBoxPython);
		panelFormulario.add(radioButtonBachillerato);
		panelFormulario.add(radioButtonCicloMedio);
		panelFormulario.add(radioButtonCicloSuperior);
		panelFormulario.add(botonCargarCurriculum);	
		// Otro pane para botones
		getContentPane().add(panelFormulario, BorderLayout.CENTER);		
		// Anadimos los botones
		JPanel panelBotones = new JPanel();
		JButton botonCerrar = new JButton("Cerrar");
		JButton botonAceptar = new JButton("Aceptar");
		panelBotones.add(botonCerrar);
		panelBotones.add(botonAceptar);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);	
		// La logica al pulsar boton aceptar
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recibimos todos los datos del formulario al pulsar acetar
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
				// Imprimimos el mensaje
				String mensaje = "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Edad: " + edad + "\n"
						+ "Comentarios: " + comentarios + "\n" + "Java: " + javaChecked + "\n" + "Python: "
						+ pythonChecked + "\n" + "Nivel de Estudios: " + nivelEstudios;

				JOptionPane.showMessageDialog(ExamenFinal.this, mensaje, "Información del Formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		botonCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamamos la funcion para mostara la ventana agradecimiento y cerrar la programma
				mostrarVentanaAgradecimiento();
			}
		});
		botonCargarCurriculum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Para subir el archive al programma
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(ExamenFinal.this);			
				// Si ponimos aceptar
				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(ExamenFinal.this,
							"Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		// usamos pack para establece el tamano de la ventana:
		pack();
		setLocationRelativeTo(null);
	}

	private void mostrarVentanaAgradecimiento() {
		// Lanzamos JDialod
		JDialog dialogoAgradecimiento = new JDialog(ExamenFinal.this, "Agradecimiento", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());
		// Ponemos label para el programma
		JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);
		// Anadimos el boton aceptar e escribimos la logica
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cerrar la ventana
				dialogoAgradecimiento.dispose();
				// Terminamos la programma
				System.exit(0);
			}
		});
		
		JPanel panelAgradecimiento = new JPanel();
		panelAgradecimiento.add(labelAgradecimiento);
		// Anadimos el boton
		JPanel panelBoton = new JPanel();
		panelBoton.add(botonAceptar);
		// Anadimos elementos al panel
		dialogoAgradecimiento.getContentPane().add(panelAgradecimiento, BorderLayout.CENTER);
		dialogoAgradecimiento.getContentPane().add(panelBoton, BorderLayout.SOUTH);
		// Ponemos el tamano de la ventana
		dialogoAgradecimiento.setSize(300, 150);
		dialogoAgradecimiento.setLocationRelativeTo(ExamenFinal.this);
		dialogoAgradecimiento.setVisible(true);
	}
	
	//Lanzamos el main para ver la ventana
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			ExamenFinal ventana = new ExamenFinal();
			ventana.setVisible(true);
		});
	}
}