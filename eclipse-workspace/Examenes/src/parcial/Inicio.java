package parcial;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Inicio {
	//Usuario y contraseña para iniciar sesión
	private final String usuario = "admin";
	private final String pass = "1234";
	
	public Inicio() {
		//Creamos la ventana
		final JFrame inicio = new JFrame();
		inicio.setTitle("Iniciar sesión");
		inicio.setSize(400, 300);
		inicio.setLocation(300,300);
		inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contenedor = new JPanel();
		contenedor.setLayout(new BorderLayout());
		
		
		JPanel panelNorte = new JPanel();
		panelNorte.setLayout(new FlowLayout());
		
		JLabel labelUsuario = new JLabel("Usuario:");
		panelNorte.add(labelUsuario);
		
		final JTextArea textoUsuario = new JTextArea();
		textoUsuario.setSize(100, 50);
		textoUsuario.setText("       ");;
		panelNorte.add(textoUsuario);
		
		
		JPanel panelSur = new JPanel();
		panelSur.setLayout(new FlowLayout());

		JLabel labelPass = new JLabel("Contraseña:");
		panelSur.add(labelPass);
		
		final JTextArea textoPass = new JTextArea();
		textoPass.setSize(100, 50);
		textoPass.setText("       ");;
		panelSur.add(textoPass);
		
		contenedor.add(panelNorte, BorderLayout.NORTH);
		contenedor.add(panelSur, BorderLayout.CENTER);
		inicio.add(contenedor);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		
		JButton botonOk = new JButton("Ok");
		botonOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				/*Usamos .trim() para quitar los espacios del campo usuario
				y contraseña al compararlos para iniciar sesion*/
				String txtUsuario = textoUsuario.getText().trim();
				String txtPass = textoPass.getText().trim();
				
				/*Si es correcto, aparece una ventana dándonos la bienvenida, ocultando esta ventana
				e iniciando el Main; y si no es correcto, nos sale un error y podemos volverlo a intentar*/
				if(txtUsuario.equals(usuario) && txtPass.equals(pass)) {
					JOptionPane.showMessageDialog(null,"Inicio de sesión válido","Bienvenido", JOptionPane.INFORMATION_MESSAGE);
					inicio.setVisible(false);
					Main prin = new Main();
				} else {
					JOptionPane.showMessageDialog(null,"Usuario o contraseña inválidos","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		panelBotones.add(botonOk);
		
		//Creamos el botón cancelar que saldrá de la ventana y terminará el programa
		JButton botonCancelar = new JButton("Cancelar");
		botonCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				inicio.dispose();
				System.exit(0);
			}
		});
		
		panelBotones.add(botonCancelar);
		
		inicio.add(panelBotones, BorderLayout.SOUTH);
		inicio.setVisible(true);
	}
}
