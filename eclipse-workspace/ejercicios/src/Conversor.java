import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;

public class Conversor extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField casillaeuro;
	private static JTextField casilladolar;
	private static JTextField casillaconversor;
	private static JSlider slidere;
	private static JSlider sliderd;
	private static Conversor frame;
	
	public static void cambiotexto(ActionEvent e) {
		if (e.getSource() == casillaeuro)	{
			float icambio = Float.parseFloat(casillaeuro.getText());
			icambio = 100*icambio*Float.parseFloat(casillaconversor.getText());
			icambio = Math.round(icambio);
			icambio = icambio/100;
		casilladolar.setText(String.valueOf(icambio));
		sliderd.setValue(Math.round(Float.parseFloat(casilladolar.getText())));
		slidere.setValue(Math.round(Float.parseFloat(casillaeuro.getText())));	
	}
	if (e.getSource() == casilladolar) {
		System.out.println("dentro");
		float icambio = Float.parseFloat(casilladolar.getText());
		icambio = 100*icambio/Float.parseFloat(casillaconversor.getText());
		icambio = Math.round(icambio);
		icambio = icambio/100;
	casillaeuro.setText(String.valueOf(icambio));	
	}	
	}

	public static void mueveSlider(ChangeEvent e) {
		int valor;
		JSlider obj = (JSlider)e.getSource();
		System.out.println(obj.getValueIsAdjusting());
		System.out.println(obj.getValue());
		
		if (!obj.getValueIsAdjusting()) {
			System.out.println(obj.getValue());
			valor = (int)obj.getValue();
			if (obj==sliderd) {
				casilladolar.setText(String.valueOf(valor));
				float icambio = 100*valor/Float.parseFloat(casillaconversor.getText());
				icambio = Math.round(icambio);
				icambio = icambio/100;
				casillaeuro.setText(String.valueOf(icambio));
				int i = Math.round(icambio);
				slidere.setValue(i);
			}
			if (obj == slidere) {
				casillaeuro.setText(String.valueOf(valor));
				float icambio = 100*valor*Float.parseFloat(casillaconversor.getText());
				icambio = Math.round(icambio);
				icambio = icambio/100;
				int i =  Math.round(icambio);
				slidere.setValue(i);
				
			}
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Conversor();
					Eventos ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setBackground(Color.WHITE);
		setTitle("Conversor de Euros a D\u00F3lares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(0, 0, 422, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Euro(s):");
		lblNewLabel.setBounds(10, 47, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00F3lar(es):");
		lblNewLabel_1.setBounds(322, 47, 61, 14);
		panel.add(lblNewLabel_1);
		
		casillaeuro = new JTextField();
		casillaeuro.setBounds(10, 87, 86, 20);
		panel.add(casillaeuro);
		casillaeuro.setColumns(10);
		
		casilladolar = new JTextField();
		casilladolar.setBounds(322, 87, 86, 20);
		panel.add(casilladolar);
		casilladolar.setColumns(10);
		
		casillaconversor = new JTextField();
		casillaconversor.setHorizontalAlignment(SwingConstants.CENTER);
		casillaconversor.setText("1.36");
		casillaconversor.setBounds(178, 90, 56, 20);
		panel.add(casillaconversor);
		casillaconversor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u20AC/$");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(178, 76, 56, 14);
		panel.add(lblNewLabel_2);
		
		slidere = new JSlider();
		slidere.setFont(new Font("Tahoma", Font.PLAIN, 11));
		slidere.setSnapToTicks(true);
		slidere.setPaintTicks(true);
		slidere.setPaintLabels(true);
		slidere.setToolTipText("Euros");
		slidere.setMinorTickSpacing(100);
		slidere.setMajorTickSpacing(200);
		slidere.setMaximum(1000);
		slidere.setBounds(10, 118, 168, 46);
		panel.add(slidere);
		
		sliderd = new JSlider();
		sliderd.setToolTipText("Euros");
		sliderd.setSnapToTicks(true);
		sliderd.setPaintTicks(true);
		sliderd.setPaintLabels(true);
		sliderd.setMinorTickSpacing(100);
		sliderd.setMaximum(1000);
		sliderd.setMajorTickSpacing(200);
		sliderd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		sliderd.setBounds(240, 118, 168, 46);
		panel.add(sliderd);		
}
	
	public static void Eventos () {
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		casillaeuro.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				cambiotexto(e);
			}
		});
		casilladolar.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				cambiotexto(e);
			}
		});	
	}
}