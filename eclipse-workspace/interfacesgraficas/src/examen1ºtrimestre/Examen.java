package examen1ºtrimestre;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;



import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Examen extends JFrame{
	//creo las variables que necesito para la ventana
	private JTextField comentariosField;
	private JTextField edadField;
	private JTextField apellidosField;
	private JTextField nombreField;
	private ButtonGroup grupoBotones;
	
	
	public Examen() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		//creo el jlabel de nombre
		JLabel nombreText = new JLabel("Nombre: ");
		GridBagConstraints gbc_nombreText = new GridBagConstraints();
		gbc_nombreText.anchor = GridBagConstraints.WEST;
		gbc_nombreText.insets = new Insets(0, 0, 5, 5);
		gbc_nombreText.gridx = 1;
		gbc_nombreText.gridy = 0;
		getContentPane().add(nombreText, gbc_nombreText);
		
		//creo el textfield de nombre
		nombreField = new JTextField();
		GridBagConstraints gbc_nombreField = new GridBagConstraints();
		gbc_nombreField.insets = new Insets(0, 0, 5, 0);
		gbc_nombreField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreField.gridx = 3;
		gbc_nombreField.gridy = 0;
		getContentPane().add(nombreField, gbc_nombreField);
		nombreField.setColumns(10);
		
		//creo el jlabel de apellidos
		JLabel apellidosText = new JLabel("Apellidos: ");
		GridBagConstraints gbc_apellidosText = new GridBagConstraints();
		gbc_apellidosText.anchor = GridBagConstraints.WEST;
		gbc_apellidosText.insets = new Insets(0, 0, 5, 5);
		gbc_apellidosText.gridx = 1;
		gbc_apellidosText.gridy = 1;
		getContentPane().add(apellidosText, gbc_apellidosText);
		
		//creo el textfield de apellidos
		apellidosField = new JTextField();
		GridBagConstraints gbc_apellidosField = new GridBagConstraints();
		gbc_apellidosField.insets = new Insets(0, 0, 5, 0);
		gbc_apellidosField.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellidosField.gridx = 3;
		gbc_apellidosField.gridy = 1;
		getContentPane().add(apellidosField, gbc_apellidosField);
		apellidosField.setColumns(10);
		
		//creo el jlabel de edad
		JLabel edadText = new JLabel("Edad: ");
		GridBagConstraints gbc_edadText = new GridBagConstraints();
		gbc_edadText.anchor = GridBagConstraints.WEST;
		gbc_edadText.insets = new Insets(0, 0, 5, 5);
		gbc_edadText.gridx = 1;
		gbc_edadText.gridy = 2;
		getContentPane().add(edadText, gbc_edadText);
		
		//creo el textfield de edad
		edadField = new JTextField();
		GridBagConstraints gbc_edadField = new GridBagConstraints();
		gbc_edadField.insets = new Insets(0, 0, 5, 0);
		gbc_edadField.fill = GridBagConstraints.HORIZONTAL;
		gbc_edadField.gridx = 3;
		gbc_edadField.gridy = 2;
		getContentPane().add(edadField, gbc_edadField);
		edadField.setColumns(10);
		
		//creo el jlabel de comentarios
		JLabel comentariosText = new JLabel("Comentarios: ");
		GridBagConstraints gbc_comentariosText = new GridBagConstraints();
		gbc_comentariosText.anchor = GridBagConstraints.WEST;
		gbc_comentariosText.insets = new Insets(0, 0, 5, 5);
		gbc_comentariosText.gridx = 1;
		gbc_comentariosText.gridy = 3;
		getContentPane().add(comentariosText, gbc_comentariosText);
		
		//creo el textfield de comentarios
		comentariosField = new JTextField();
		GridBagConstraints gbc_comentariosField = new GridBagConstraints();
		gbc_comentariosField.insets = new Insets(0, 0, 5, 0);
		gbc_comentariosField.fill = GridBagConstraints.HORIZONTAL;
		gbc_comentariosField.gridx = 3;
		gbc_comentariosField.gridy = 3;
		getContentPane().add(comentariosField, gbc_comentariosField);
		comentariosField.setColumns(10);
		
		//creo el checkbox java
		JCheckBox javaCB = new JCheckBox("Java");
		GridBagConstraints gbc_javaCB = new GridBagConstraints();
		gbc_javaCB.anchor = GridBagConstraints.WEST;
		gbc_javaCB.insets = new Insets(0, 0, 5, 5);
		gbc_javaCB.gridx = 1;
		gbc_javaCB.gridy = 4;
		getContentPane().add(javaCB, gbc_javaCB);
		
		//creo el checkbox phyton
		JCheckBox pythonCB = new JCheckBox("Python");
		GridBagConstraints gbc_pythonCB = new GridBagConstraints();
		gbc_pythonCB.anchor = GridBagConstraints.WEST;
		gbc_pythonCB.insets = new Insets(0, 0, 5, 0);
		gbc_pythonCB.gridx = 3;
		gbc_pythonCB.gridy = 4;
		getContentPane().add(pythonCB, gbc_pythonCB);
		
		//creo el radio button bachillerato
		JRadioButton bachilleratoCB = new JRadioButton("Bachillerato");
		GridBagConstraints gbc_bachilleratoCB = new GridBagConstraints();
		gbc_bachilleratoCB.anchor = GridBagConstraints.WEST;
		gbc_bachilleratoCB.insets = new Insets(0, 0, 5, 5);
		gbc_bachilleratoCB.gridx = 1;
		gbc_bachilleratoCB.gridy = 5;
		getContentPane().add(bachilleratoCB, gbc_bachilleratoCB);
		
		//creo el radio button ciclo medio
		JRadioButton cicloMedioRB = new JRadioButton("Ciclo Medio");
		GridBagConstraints gbc_cicloMedioRB = new GridBagConstraints();
		gbc_cicloMedioRB.anchor = GridBagConstraints.WEST;
		gbc_cicloMedioRB.insets = new Insets(0, 0, 5, 0);
		gbc_cicloMedioRB.gridx = 3;
		gbc_cicloMedioRB.gridy = 5;
		getContentPane().add(cicloMedioRB, gbc_cicloMedioRB);
		
		//creo el radio button ciclo superior
		JRadioButton cicloSupRB = new JRadioButton("Ciclo Superior");
		GridBagConstraints gbc_cicloSupRB = new GridBagConstraints();
		gbc_cicloSupRB.anchor = GridBagConstraints.WEST;
		gbc_cicloSupRB.insets = new Insets(0, 0, 5, 5);
		gbc_cicloSupRB.gridx = 1;
		gbc_cicloSupRB.gridy = 6;
		getContentPane().add(cicloSupRB, gbc_cicloSupRB);
		
		//creo el grupo de botones para que solo se pueda seleccionar uno
		grupoBotones = new ButtonGroup();
		grupoBotones.add(cicloSupRB);
		grupoBotones.add(cicloMedioRB);
		grupoBotones.add(bachilleratoCB);
		
		
		//cargo el curriculum con el filechooser
		JButton curriculumBtn = new JButton("Cargar Curriculum");
		curriculumBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(Examen.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(Examen.this,
							"Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		GridBagConstraints gbc_curriculumBtn = new GridBagConstraints();
		gbc_curriculumBtn.anchor = GridBagConstraints.WEST;
		gbc_curriculumBtn.insets = new Insets(0, 0, 5, 0);
		gbc_curriculumBtn.gridx = 3;
		gbc_curriculumBtn.gridy = 6;
		getContentPane().add(curriculumBtn, gbc_curriculumBtn);
		
		//cargo la info con un jdialog
		JButton aceptarBtn = new JButton("Aceptar");
		aceptarBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String nombre = nombreField.getText();
				String apellidos = apellidosField.getText();
				String edad = edadField.getText();
				String comentarios = comentariosField.getText();
				boolean javaChecked = javaCB.isSelected();
				boolean pythonChecked = pythonCB.isSelected();
				String nivelEstudios = "";
				if (bachilleratoCB.isSelected()) {
					nivelEstudios = "Bachillerato";
				} else if (cicloMedioRB.isSelected()) {
					nivelEstudios = "Ciclo Medio";
				} else if (cicloSupRB.isSelected()) {
					nivelEstudios = "Ciclo Superior";
				}
				
				JDialog dialogoInfo = new JDialog(Examen.this, "Mensaje Agradecimiento", true);
				dialogoInfo.getContentPane().setLayout(new BorderLayout());
				
				String informacion = "Nombre: " + nombre + "\nApellidos: " + apellidos +
						"\nEdad: " + edad + "\nComentarios: " + comentarios + "\nJava: " + javaChecked +
						"\nPython: " + pythonChecked + "\nNivel de Estudios: " + nivelEstudios;
				
				JLabel labelNombre = new JLabel("Nombre: " + nombre);
				JLabel labelApllidos = new JLabel("Apellidos: " + apellidos);
				JLabel labelEdad = new JLabel("Edad: " + edad );
				JLabel labelComentarios= new JLabel("Comentarios: " + comentarios);
				JLabel labelJava = new JLabel("Java: " + javaChecked);
				JLabel labelPython = new JLabel("Python: " + pythonChecked);
				JLabel LabelNivel = new JLabel("Nivel de Estudios: " + nivelEstudios);
				
				JButton botonAceptar = new JButton("Aceptar");
				botonAceptar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//Cerrar la ventana de agradecimiento
						dialogoInfo.dispose();

					}
				});

				JPanel panelAgradecimiento = new JPanel();
				panelAgradecimiento.add(labelNombre);
				panelAgradecimiento.add(labelApllidos);
				panelAgradecimiento.add(labelEdad);
				panelAgradecimiento.add(labelComentarios);
				panelAgradecimiento.add(labelJava);
				panelAgradecimiento.add(labelPython);
				panelAgradecimiento.add(LabelNivel);
				JPanel panelBoton = new JPanel();
				panelBoton.add(botonAceptar);

				dialogoInfo.getContentPane().add(panelAgradecimiento, BorderLayout.CENTER);
				dialogoInfo.getContentPane().add(panelBoton, BorderLayout.SOUTH);

				dialogoInfo.setSize(300, 150);
				dialogoInfo.setLocationRelativeTo(Examen.this);
				dialogoInfo.setVisible(true);
				
			}
		});
		GridBagConstraints gbc_aceptarBtn = new GridBagConstraints();
		gbc_aceptarBtn.insets = new Insets(0, 0, 0, 5);
		gbc_aceptarBtn.gridx = 1;
		gbc_aceptarBtn.gridy = 8;
		getContentPane().add(aceptarBtn, gbc_aceptarBtn);
		
		//cierro la ventana
		JButton cerrarBtn = new JButton("Cerrar");
		cerrarBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarVentanaAgradecimiento();
			}
		});
		GridBagConstraints gbc_cerrarBtn = new GridBagConstraints();
		gbc_cerrarBtn.anchor = GridBagConstraints.WEST;
		gbc_cerrarBtn.gridx = 3;
		gbc_cerrarBtn.gridy = 8;
		getContentPane().add(cerrarBtn, gbc_cerrarBtn);
	}

	
	//uso la función para cerrar la ventana
	private void mostrarVentanaAgradecimiento() {
		JDialog dialogoAgradecimiento = new JDialog(Examen.this, "Mensaje Agradecimiento", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

		JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);

		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Cerrar la ventana de agradecimiento
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
		dialogoAgradecimiento.setLocationRelativeTo(Examen.this);
		dialogoAgradecimiento.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Examen ventana = new Examen();
			ventana.setVisible(true);
			ventana.setSize(350,300);
		});

	}

}
