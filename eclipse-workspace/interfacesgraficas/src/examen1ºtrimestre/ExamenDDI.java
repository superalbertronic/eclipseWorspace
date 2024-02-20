package examen1ºtrimestre;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ExamenDDI extends JFrame{
	private JPanel panel;
	private File curriculum;
	private JRadioButton rbCicloMedio;
	private JRadioButton rbCicloSuperior;
	private JRadioButton rbBachillerato;
	
	
	@SuppressWarnings("deprecation")
	public ExamenDDI() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); //Ya...
		setLocationRelativeTo(null);
		panel = new JPanel(null);
		add(panel);
		//Todas las partes del formulario...
		JLabel lNombre = new JLabel("Nombre:");
		addComponente(lNombre, 1,2);
		JLabel lApellidos = new JLabel("Apellidos:");
		addComponente(lApellidos, 1,3);
		JLabel lEdad = new JLabel("Edad:");
		addComponente(lEdad, 1,4);
		JLabel lComentarios = new JLabel("Comentarios:");
		addComponente(lComentarios, 1,5);
		JTextField tfNombre = new JTextField();
		addComponente(tfNombre, 4,2);
		JTextField tfApellidos = new JTextField(); 
		addComponente(tfApellidos, 4,3);
		//Creo que había algo de numberfield... de todas formas poner la edad es un poco tontería, eso cambia cada año
		//Habría que haber puesto un calendario de esos...
		JTextField tfEdad = new JTextField(); 
		addComponente(tfEdad, 4,4);
		JTextArea taComentarios = new JTextArea();
		addComponente(taComentarios, 4,5);
		taComentarios.setSize(120, 60);
		
		JCheckBox cbJava = new JCheckBox("Java");
		addComponente(cbJava,1,8);
		JCheckBox cbPython = new JCheckBox("Python");
		addComponente(cbPython,4,8);
		

		ButtonGroup bgNivelEstudios = new ButtonGroup();
		rbCicloMedio = new JRadioButton("Ciclo Medio");
		addComponente(rbCicloMedio,1,9);
		 rbCicloSuperior = new JRadioButton("Ciclo Superior");
		addComponente(rbCicloSuperior,4,9);
		 rbBachillerato = new JRadioButton("Bachillerato");
		addComponente(rbBachillerato,1,10);
		bgNivelEstudios.add(rbCicloMedio);
		bgNivelEstudios.add(rbCicloSuperior);
		bgNivelEstudios.add(rbBachillerato);
		
		JButton jbCurriculum = new JButton("Cargar curriculum");
		jbCurriculum.setBorder(null);
		addComponente(jbCurriculum, 4,10);
	
		
		
		/**
		 * EJERCICIO 3
		 */
		//Esto es una función lambda, por si acaso
		jbCurriculum.addActionListener((ActionEvent e) -> {
			JFileChooser fcCurriculum = new JFileChooser();
			
			int eleccion = fcCurriculum.showOpenDialog(this);
			if(eleccion == JFileChooser.APPROVE_OPTION) {
				curriculum = fcCurriculum.getSelectedFile();
			}
			
		});
		
		
		

		
		
		
		
		JButton jbAceptar = new JButton("Aceptar");
		addComponente(jbAceptar, 1,12);
		JButton jbCerrar = new JButton("Cerrar");
		addComponente(jbCerrar,4,12);
		/*
		 * Ejercicio 2
		 */
		//Uso lambdas porque me gusta mucho escribir ->
		jbAceptar.addActionListener((ActionEvent e) ->{
			
			JDialog dialogo = new JDialog();
			dialogo.setSize(350,300);
			dialogo.setLocationRelativeTo(this);
			String conoce = (cbPython.isSelected()?"Python ":" ")+(cbJava.isSelected()?"Java": " ");
			
			//Siento tener que formatear esto como html, era la única opción...
			JLabel label = new JLabel("<html>Nombre completo: "+tfNombre.getText()+" "+tfApellidos.getText()
			+ "<br>Edad: "+tfEdad.getText()
			+ "<br>Comentarios: "+taComentarios.getText()
			+ "<br>Lenguajes de programación que conoce:  "+conoce
			+ "<br>Nivel de estudios: "+getRadioBoton()
			+"<br> Curriculum en: "+curriculum.getAbsolutePath()
			+ "</html>");
			label.setSize(300,300);
			dialogo.add(label);
			
			dialogo.setVisible(true);
			
		});
		/**
		 * Ejercicio 4
		 */
		jbCerrar.addActionListener((ActionEvent e) ->{
			JDialog dialogo = new JDialog();
			dialogo.setLayout(null);
			dialogo.setSize(200,300);
			dialogo.setLocationRelativeTo(this);
			JLabel gracias = new JLabel("Gracias por su visita");
			gracias.setSize(150,20);
			gracias.setLocation(30,30);
			dialogo.add(gracias);
			dialogo.setUndecorated(true);
			
			JButton botonCerrar = new JButton("Cerrar");
			botonCerrar.addActionListener((ActionEvent e1) ->{
				System.exit(0);
			});
			botonCerrar.setSize(100,20);
			botonCerrar.setLocation(20, 200);
			dialogo.add(botonCerrar);
			
			
			dialogo.setVisible(true);
		});
		
		setVisible(true);
	}
	//no me funciona el windowbuilder, y me he olvidado de cómo se añadían los layouts.
	//Mejor que nada. Puntos extra por tener recursos y tener la capacidad de salir de cualquier situación???
	private void addComponente(JComponent componente, int indexCol, int indexFila) {
		//No esto no escala en runtime pero con esto puede escalar... antes de comenzar el programa?
		final int ESCALA_ALTURA = 30;
		final int ESCALA_ANCHURA = 60;
		
		componente.setLocation(indexCol * ESCALA_ANCHURA, indexFila * ESCALA_ALTURA);
		componente.setSize(120,20);
		panel.add(componente);
		
	}
	private String getRadioBoton() {
		JRadioButton arr[] = new JRadioButton[3];
		arr[0] = rbCicloMedio;
		arr[1] = rbCicloSuperior;
		arr[2] = rbBachillerato;
		for(JRadioButton rb: arr) {
			if(rb.isSelected())
				return rb.getText();
		}
		return "";
	}

	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new ExamenDDI();
		});
		
	}

}
