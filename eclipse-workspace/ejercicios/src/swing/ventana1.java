package swing;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ventana1 extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-36,159
	 */
	private final TextArea textArea_1 = new TextArea();
private String profesion="";
private String color="";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("PROFESION");
		
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("INFORMATICO");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesion="informatica";
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("FORMADOR");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesion="formador";
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("ADMINISTRATIVO");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profesion="administrativo";
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("COLOR");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("ROSA\r\n");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="rosa";
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("CELESTE\r\n");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="celeste";
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("SEXO");
		menuBar.add(mnNewMenu_2);
		
		JRadioButtonMenuItem fem = new JRadioButtonMenuItem("FEMENINO");
		mnNewMenu_2.add(fem);
		
		JRadioButtonMenuItem masc = new JRadioButtonMenuItem("MASCULINO");
		mnNewMenu_2.add(masc);
		
		JMenu idi = new JMenu("IDIOMAS");
		menuBar.add(idi);
		
		JCheckBoxMenuItem ing = new JCheckBoxMenuItem("INGLES");
		idi.add(ing);
		
		JCheckBoxMenuItem fr = new JCheckBoxMenuItem("FRANCES\r\n");
		idi.add(fr);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea escribir = new TextArea();
		escribir.setBounds(10, 33, 380, 137);
		contentPane.add(escribir);
		
		JButton btnNewButton = new JButton("RESUMEN\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sexo="";
				String idioma="";
				if(fem.isSelected()) {
					sexo="femenino";
					
				}else if (masc.isSelected()) {
					sexo="masculino";
				}
				if(ing.isSelected()) {
					idioma="ingles";
				}else if(fr.isSelected()){
					idioma="frances";
				}
			JOptionPane.showMessageDialog(null, "tu profesion es "+profesion+ " ,su sexo es "+sexo+
					" ,su idioma es el "+idioma+" y su color favorito es " +color+"\nobservaciones:\n"+escribir.getText());
			}
		});
		btnNewButton.setBounds(38, 182, 142, 34);
		contentPane.add(btnNewButton);
		
		JLabel obs = new JLabel("OBSERVACIONES");
		obs.setBounds(10, 0, 156, 27);
		contentPane.add(obs);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
