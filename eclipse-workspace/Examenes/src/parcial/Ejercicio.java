package parcial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;



public class Ejercicio {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				   Ejercicio ejercicio = new Ejercicio();
			}
		});
	}
	
	public Ejercicio() {
		/*Creamos un objeto JFrame y ponemos título, tamaño, localización y
		que se termine el programa al cerrar la ventana*/
		JFrame v = new JFrame();
		v.setTitle("Examen Práctico");
		v.setSize(400, 300);
		v.setLocation(300,300);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creamos el panel principal con layout BorderLayout
		JPanel botonPanel = new JPanel();
		botonPanel.setLayout(new BorderLayout());
		
		//Creamos el panel de botones superior con layout FlowLayout
		JPanel panelNorte = new JPanel();
		panelNorte.setLayout(new FlowLayout());

		//Creamos el panel de botones superior con layout FlowLayout
		JPanel panelSur = new JPanel();
		panelSur.setLayout(new FlowLayout());
		
		//Creamos los botones y los añadimos al panel norte
		for(byte i=0; i<3; i++) {
			JButton boton = new JButton("Botón " + (i+1));
			configurarBoton(boton);
			procesarBoton(boton);
			panelNorte.add(boton);
		}
		
		//Creamos los botones y los añadimos al panel sur
		for(byte i=0; i<3; i++) {
			JButton boton = new JButton("Botón " + (i+4));
			configurarBoton(boton);
			procesarBoton(boton);
			panelSur.add(boton);
		}

		//Creamos un panel para el menu, el menuBar, y le añadimos un menu llamado Botones
		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Botones");
		menuBar.add(menu);
		
		//Creamos los items del menu, creando un actionListener para cuando clicke, se abra otra ventana
		for(byte i=0; i<6; i++) {
			JMenuItem menuItem = new JMenuItem("Botón " + (i+1));
			procesarBoton(menuItem);
			menu.add(menuItem);
		}
		
		//Añadimos el menuBar al panel del menu, y los paneles norte y sur de los botones al panel principal
		panelMenu.add(menuBar, BorderLayout.WEST);
		botonPanel.add(panelNorte, BorderLayout.NORTH);
		botonPanel.add(panelSur, BorderLayout.SOUTH);
		
		//Añadimos el panel del menu y el panel principal a la ventana
		v.add(panelMenu, BorderLayout.NORTH);
		v.add(botonPanel, BorderLayout.CENTER);
		v.setVisible(true);
		
	}
	
	//Método que cambia el color de fondo y el color de la letra
	private static void configurarBoton(JButton b) {
		b.setBackground(new Color(135, 206, 250));
		b.setForeground(new Color(0,0,0));;
	}
	
	/*Método que añade un ActionListener a un boton, que abre
	una nueva ventana diciendo el boton que ha sido pulsado*/
	private static void procesarBoton(final JButton b) {
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				final JFrame ventanaNueva = new JFrame();
				ventanaNueva.setTitle("Ventana " + b.getText());
				ventanaNueva.setSize(400,300);
				ventanaNueva.setLocation(300,300);
				
				JPanel contenedor = new JPanel();
				contenedor.setLayout(new BorderLayout());
				
				JLabel texto = new JLabel();
				texto.setText("Se ha pulsado el " + b.getText());
				
				JButton cerrar = new JButton("Cerrar");
				cerrar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						ventanaNueva.setVisible(false);;
						
					}
					
				});
				
				contenedor.add(texto, BorderLayout.CENTER);
				contenedor.add(cerrar, BorderLayout.SOUTH);
				ventanaNueva.add(contenedor);
				ventanaNueva.setVisible(true);
			}
		});
	}
	
	//Aquí he sobrecargado el método procesarBoton para añadirle el ActionListener a los items del menu
	private static void procesarBoton(final JMenuItem item) {
		item.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				final JFrame ventanaNueva = new JFrame();
				ventanaNueva.setTitle("Ventana " + item.getText());
				ventanaNueva.setSize(400,300);
				ventanaNueva.setLocation(300,300);
				
				JPanel contenedor = new JPanel();
				contenedor.setLayout(new BorderLayout());
				
				JLabel texto = new JLabel();
				texto.setText("Se ha pulsado el " + item.getText());
				
				JButton cerrar = new JButton("Cerrar");
				cerrar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						ventanaNueva.setVisible(false);;
						
					}
					
				});
				
				contenedor.add(texto, BorderLayout.CENTER);
				contenedor.add(cerrar, BorderLayout.SOUTH);
				ventanaNueva.add(contenedor);
				ventanaNueva.setVisible(true);
			}
		});
	}

}
