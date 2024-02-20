package examen1ºtrimestre;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
	// Declaramos todas las variables que vamos a emplear
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField edad;
	private JTextArea comentarios;
	private JCheckBox java;
	private JCheckBox phyton;
	private JRadioButton bachillerato;
	private JRadioButton cicloMedio;
	private JRadioButton cicloSuperior;
	private JButton cargarCurriculum;

	// Clase que crea el formulario que se nos ha pedidio
	public Main() {
		setTitle("Formulario para los alumnos de FP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(new GridLayout(9, 1, 8, 5));

		// Se emplean las variables ya creadas para implementarlas en el formulario
		JLabel labelNombre = new JLabel("Nombre:");
		nombre = new JTextField();
		JLabel labelApellidos = new JLabel("Apellidos:");
		apellidos = new JTextField();
		JLabel labelEdad = new JLabel("Edad:");
		edad = new JTextField();
		JLabel labelComentarios = new JLabel("Comentarios:");
		comentarios = new JTextArea();
		JScrollPane scrollComentarios = new JScrollPane(comentarios);
		java = new JCheckBox("Java");
		phyton = new JCheckBox("Python");
		bachillerato = new JRadioButton("Ballicherato");
		cicloMedio = new JRadioButton("Ciclo Medio");
		cicloSuperior = new JRadioButton("Ciclo Superior");
		ButtonGroup nivelEstudios = new ButtonGroup();
		nivelEstudios.add(bachillerato);
		nivelEstudios.add(cicloMedio);
		nivelEstudios.add(cicloSuperior);
		cargarCurriculum = new JButton("Cargar curriculum");

		panelFormulario.add(labelNombre);
		panelFormulario.add(nombre);
		panelFormulario.add(labelApellidos);
		panelFormulario.add(apellidos);
		panelFormulario.add(labelEdad);
		panelFormulario.add(edad);
		panelFormulario.add(labelComentarios);
		panelFormulario.add(scrollComentarios);
		panelFormulario.add(java);
		panelFormulario.add(phyton);
		panelFormulario.add(bachillerato);
		panelFormulario.add(cicloMedio);
		panelFormulario.add(cicloSuperior);
		panelFormulario.add(cargarCurriculum);

		getContentPane().add(panelFormulario, BorderLayout.CENTER);

		//Se crea un panel con los botones de aceptar y cerrar
		JPanel panelBotones = new JPanel();
		JButton aceptar = new JButton("Aceptar");
		JButton cerrar = new JButton("Cerrar");
		panelBotones.add(aceptar);
		panelBotones.add(cerrar);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		//Creamos un evento cuando se pulsa el botón aceptar
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre1 = nombre.getText();
				String apellido1 = apellidos.getText();
				String edad1 = edad.getText();
				String comentario1 = comentarios.getText();
				Boolean javaCheck = java.isSelected();
				Boolean phytonCheck = phyton.isSelected();
				String nivelEstudios1 = "";
				if (bachillerato.isSelected()) {
					nivelEstudios1 = "Bachillerato";
				} else if (cicloMedio.isSelected()) {
					nivelEstudios1 = "Ciclo Medio";
				} else if (cicloSuperior.isSelected()) {
					nivelEstudios1 = "Ciclo Superior";
				}

				// Mostramos la información en un JOptionPane
				String mensaje = "Nombre: " + nombre1 + "\n" + "Apellidos: " + apellido1 + "\n" + "Edad: " + edad1
						+ "\n" + "Comentarios: " + comentario1 + "\n" + "Java: " + javaCheck + "\n" + "Python: "
						+ phytonCheck + "\n" + "Nivel de Estudios: " + nivelEstudios1;

				JOptionPane.showMessageDialog(Main.this, mensaje, "Información del Formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		//Creamos un evento cuando se pulsa el boton cerrar
		cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abrir ventana de agradecimiento
				mostrarVentanaAgradecimiento();
			}
		});
		//Creamos un evento cuando se pulsa en "Cargar curriculum"
		cargarCurriculum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lógica para cargar el currículum con el uso de JFileChooser
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(Main.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(Main.this, "Curriculum cargado: " + archivoSeleccionado.getName(),
							"Curriculum Cargado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		pack();
		setLocationRelativeTo(null);
	}

	//Esta será la ventana de agradecimiento de nuestro programa
	private void mostrarVentanaAgradecimiento() {
		JDialog dialogoAgradecimiento = new JDialog(Main.this, "Agradecimiento", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

		JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);

		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cierra la ventana de agradecimiento
				dialogoAgradecimiento.dispose();

				// Cierra la aplicación
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
		dialogoAgradecimiento.setLocationRelativeTo(Main.this);
		dialogoAgradecimiento.setVisible(true);
	}

	//Ejecuta el programa
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Main ventana = new Main();
			ventana.setVisible(true);
		});
	}

}
