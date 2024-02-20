package examen1ºtrimestre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
/*Se va a desarrollar un programam que nos cree un formulario de un FP, en el que introduciendo una serie
 * de datos nos devuelva dicha información.*/
public class FormularioAlumnos extends JFrame {
	/*Declaramos todas las variables necesarios para poder rellenar nuestro formulario*/
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldEdad;
	private JTextArea textAreaComentarios;
	private JCheckBox checkBoxJava;
	private JCheckBox checkBoxPython;
	private JRadioButton radioButtonBachiller;
	private JRadioButton radioButtonCicloMedio;
	private JRadioButton radioButtonCicloSuperior;
	private JButton botonCargarCurriculum;

	public FormularioAlumnos() {
		/*Aqui en la clase es donde creamos y seteamos nuestro
		 * panel donde irán todos elementos como el nombre,edad,apellidos,comentarios */
		setTitle("Formulario Alumnos FP-CENEC ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		//Declaramos nuestro JPanel
		JPanel panelFormulario = new JPanel();
		//Seteamos el Layout,en formato GridLayout
		panelFormulario.setLayout(new GridLayout(10, 2, 17, 5));
		//Nuestras variables, Jlabe,text y nuestro buttonGrop
		//Jlabels
		JLabel labelNombre = new JLabel("Nombre :");
		textFieldNombre = new JTextField();
		JLabel labelApellidos = new JLabel("Apellidos :");
		textFieldApellidos = new JTextField();
		JLabel labelEdad = new JLabel("Edad :");
		textFieldEdad = new JTextField();
		JLabel labelComentarios = new JLabel("Comentarios :");
		//TextArea 
		textAreaComentarios = new JTextArea();
		//ScrollPane
		JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
		//CheckBox para "chekear" si esta dando Java o Python 
		checkBoxJava = new JCheckBox("Java");
		checkBoxPython = new JCheckBox("Python");
		//RadioButton que nos dará 3 opciones Bachiller,CicloMedio,CicloSuperior
		radioButtonBachiller = new JRadioButton("Bachiller");
		radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
		radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
		//ButtonGroup, donde añadiremos mediante la función .add los botones que hemos declarado
		ButtonGroup groupNivelEstudios = new ButtonGroup();
		groupNivelEstudios.add(radioButtonBachiller);
		groupNivelEstudios.add(radioButtonCicloMedio);
		groupNivelEstudios.add(radioButtonCicloSuperior);
		//Boton cargar curriculum 
		botonCargarCurriculum = new JButton("Cargar Curriculum");
		
		//Aqui añadimos tooodo lo que hemos hecho antes,en el Jpanel llamado panelFormulario
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
		panelFormulario.add(radioButtonBachiller);
		panelFormulario.add(radioButtonCicloMedio);
		panelFormulario.add(radioButtonCicloSuperior);
		panelFormulario.add(botonCargarCurriculum);
		//Para añadir los componentes al Jframe usamos ContentPane y lo centramos 
		getContentPane().add(panelFormulario, BorderLayout.CENTER);

		/*Terminada nuestra travesía visual donde metemos nuestra parte superior ahora toca la parte inferiro que nos hará salir
		 * del progreama y cargar nuestra información mediante aceptar*/
		// Generamos otro JPanel y con sus correspondientes botones como hemos hecho anteriormente con el formulario.
		JPanel panelBotones = new JPanel();
		JButton botonCerrar = new JButton("CERRAR");
		JButton botonAceptar = new JButton("ACEPTAR");
		panelBotones.add(botonCerrar);
		panelBotones.add(botonAceptar);
		
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		//Añadimos el actionlistener que no recopilara la informacion y la guardará 
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Recopilar la información del formulario
				String nombre = textFieldNombre.getText();
				String apellidos = textFieldApellidos.getText();
				String edad = textFieldEdad.getText();
				String comentarios = textAreaComentarios.getText();
				boolean elijeJava = checkBoxJava.isSelected();
				boolean elijePython = checkBoxPython.isSelected();
				String nivelEstudios = "";
				if (radioButtonBachiller.isSelected()) {
					nivelEstudios = "Bachillerato";
				} else if (radioButtonCicloMedio.isSelected()) {
					nivelEstudios = "Ciclo Medio";
				} else if (radioButtonCicloSuperior.isSelected()) {
					nivelEstudios = "Ciclo Superior";
				}

				// Mostrar la información en un JOptionPane
				String mensaje = "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Edad: " + edad + "\n"
						+ "Comentarios: " + comentarios + "\n" + "Java: " + elijeJava + "\n" + "Python: "
						+ elijePython + "\n" + "Nivel de Estudios: " + nivelEstudios;

				JOptionPane.showMessageDialog(FormularioAlumnos.this, mensaje, "Información del Formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
//Boton cerrar
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
				// Lógica para cargar el currículum, donde utilizamos JFileChooser
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(FormularioAlumnos.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(FormularioAlumnos.this,
							"Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		pack();
		setLocationRelativeTo(null);
	}

	/*metodo para mostra ventana de agradecimiento*/
	private void mostrarVentanaAgradecimiento() {
		JDialog dialogoAgradecimiento = new JDialog(FormularioAlumnos.this, "Gracias", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

		JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);

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
		dialogoAgradecimiento.setLocationRelativeTo(FormularioAlumnos.this);
		dialogoAgradecimiento.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			FormularioAlumnos ventana = new FormularioAlumnos();
			ventana.setVisible(true);
		});
	}
}
