package examen;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class FormularioAlumnosFP extends JFrame {
	// Variables internas:
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
	
	public FormularioAlumnosFP() {
		setTitle("Formulario para alumnos de FP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que al cerrar la ventana, se cierre también la aplicación.
		getContentPane().setLayout(new BorderLayout());
		
		// Panel formulario:
		JPanel formulario = new JPanel();
		formulario.setLayout(new GridLayout(9, 1, 8, 5));
		// El formulario ocupará la parte superior (norte) del Layout:
		getContentPane().add(formulario, BorderLayout.NORTH);
		
		// Nombre:
		JLabel labelNombre = new JLabel("Nombre:");
		formulario.add(labelNombre); 
		
		textFieldNombre = new JTextField();
		formulario.add(textFieldNombre); 
		
		// Apellidos:
		JLabel labelApellidos = new JLabel("Apellidos:");
		formulario.add(labelApellidos);
		
		textFieldApellidos = new JTextField();
		formulario.add(textFieldApellidos);
		
		// Edad:
		JLabel labelEdad = new JLabel("Edad:");
		formulario.add(labelEdad);
		
		textFieldEdad = new JTextField();
		formulario.add(textFieldEdad);
		
		// Comentarios:
		JLabel labelComentarios = new JLabel("Comentarios:");
		formulario.add(labelComentarios);
		
		textAreaComentarios = new JTextArea();
		formulario.add(textAreaComentarios);
		
		JScrollPane scrollPane = new JScrollPane(textAreaComentarios); // Para poder ver el texto completo.
		formulario.add(scrollPane);
		
		// Para seleccionar Java:
		checkBoxJava = new JCheckBox("Java");
		formulario.add(checkBoxJava);
		
		// Para seleccionar Phyton:
		checkBoxPython = new JCheckBox("Python");
		formulario.add(checkBoxPython);
		
		// Botón de opción Bachillerato:
		radioButtonBachillerato = new JRadioButton("Bachillerato");
		formulario.add(radioButtonBachillerato);
		
		// Botón de opción Ciclo Medio:
		radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
		formulario.add(radioButtonCicloMedio);
		
		// Botón de opción Ciclo Superior:
		radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
		formulario.add(radioButtonCicloSuperior);
		
		// Botones de opción agrupados:
		ButtonGroup grupoNivelEstudios = new ButtonGroup();
		grupoNivelEstudios.add(radioButtonBachillerato);
		grupoNivelEstudios.add(radioButtonCicloMedio);
		grupoNivelEstudios.add(radioButtonCicloSuperior);
		
		// Botón para cargar el currículum:
		botonCargarCurriculum = new JButton("Cargar Currículum");
		formulario.add(botonCargarCurriculum);
		
		botonCargarCurriculum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para cargar el currículum:
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(FormularioAlumnosFP.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					
					JOptionPane.showMessageDialog(FormularioAlumnosFP.this,
							"Currículum cargado: " + archivoSeleccionado.getName(), "Currículum cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		// Panel botones:
		JPanel botones = new JPanel();
		// Los botones "Cerrar" y "Aceptar" se situarán en la parte inferior (sur) del Layout:
		getContentPane().add(botones, BorderLayout.SOUTH);
		
		// Botón para mostrar mensaje de agradecimiento:
		JButton botonCerrar = new JButton("Cerrar");
		botones.add(botonCerrar);
		
		botonCerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Abre ventana con mensaje de agradecimiento:
				mostrarVentanaAgradecimiento();
			}
		});
		
		// Botón para recopilar la información del formulario y mostrarla en un cuadro de diálogo:
		JButton botonAceptar = new JButton("Aceptar");
		botones.add(botonAceptar);
		
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Recopila la información del formulario:
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

				// Muestra la información en un JOptionPane:
				String mensaje = "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad 
						+ "\nComentarios: " + comentarios + "\nJava: " + javaChecked + "\nPython: " 
						+ pythonChecked + "\nNivel de Estudios: " + nivelEstudios;

				JOptionPane.showMessageDialog(FormularioAlumnosFP.this, mensaje, "Información del formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		setLocationRelativeTo(null);
		pack();
	}
	
	// Método privado para mostrar mensaje de agradecimiento:
	private void mostrarVentanaAgradecimiento() {
		// Cuadro de diálogo:
		JDialog dialogoAgradecimiento = new JDialog(FormularioAlumnosFP.this, "Agradecimiento", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

		// Mensaje de agradecimiento:
		JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);

		// Botón para cerrar el cuadro de diálogo y la aplicación:
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cierra la ventana de agradecimiento:
				dialogoAgradecimiento.dispose();

				// Cierra la aplicación:
				System.exit(0);
			}
		});

		// Panel mensaje de agradecimiento:
		JPanel panelAgradecimiento = new JPanel();
		panelAgradecimiento.add(labelAgradecimiento);

		// Panel botón "Aceptar":
		JPanel panelBoton = new JPanel();
		panelBoton.add(botonAceptar);

		dialogoAgradecimiento.getContentPane().add(panelAgradecimiento, BorderLayout.CENTER);
		dialogoAgradecimiento.getContentPane().add(panelBoton, BorderLayout.SOUTH);
		dialogoAgradecimiento.setSize(300, 150);
		dialogoAgradecimiento.setLocationRelativeTo(FormularioAlumnosFP.this);
		dialogoAgradecimiento.setVisible(true);
	}

	public static void main(String[] args) {
		// Ejecuta la ventana del formulario:
		SwingUtilities.invokeLater(() -> {
			FormularioAlumnosFP ventana = new FormularioAlumnosFP();
			ventana.setVisible(true);
		});
	}
}