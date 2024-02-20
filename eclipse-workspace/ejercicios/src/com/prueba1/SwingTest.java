package com.prueba1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTest {

	private static JLabel label = new JLabel("--");
	private static JButton btnlimpia = new JButton("Limpia");
	private static JButton btnescribe = new JButton("EsCribe");
	public static void acciones(ActionEvent e) {
			Object obj = e.getSource();
			if (obj == btnlimpia) {
				label.setText("");
			}
			if (obj == btnescribe) {
				label.setText("hola mundo");
			}
	}

	public static void main (String [] args) {
		try {
			UIManager.setLookAndFeel(
				UIManager.getCrossPlatformLookAndFeelClassName () );
		} catch (Exception e) { }
		JFrame frame = new JFrame ("Controlando events");
		btnlimpia.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
						acciones (e) ;

			}
		});
		
		btnescribe.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
						acciones(e);
			}
		});
		
		frame.getContentPane () .add (label) ;
		frame.getContentPane () .add (btnlimpia) ;
		frame.getContentPane () .add (btnescribe) ;
		frame.addWindowListener (new WindowAdapter () {
			public void windowclosing (WindowEvent e) {
					System.exit (0);
			}
		});
		frame.setLayout(new GridLayout(0,1));
		frame.pack();
		frame.setVisible(true);
	}

}

	
	
	