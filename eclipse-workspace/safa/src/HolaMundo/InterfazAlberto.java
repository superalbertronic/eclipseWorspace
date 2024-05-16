package HolaMundo;

import java.awt.EventQueue;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.io.File;

import java.io.PrintWriter;

import java.time.DateTimeException;

import java.time.LocalDate;

import java.time.Period;

import java.util.ArrayList;

import java.util.Scanner;

import java.awt.event.ActionEvent;





//EJERCICIO "ALBERTO": CARGA EL ARCHIVO CON LA INFO, ESCRIBE EN UN ARCHIVO DE SALIDA LA EDAD Y EL NOMBRE

//BOTON CALCULAR

//CAMPO PARA INTRODUCIR NOMBRE!

//DATOS DESDE LA INTERFAZ EN EL ARCHIVO GENERADO TBB, ESPECIFICANDO QUE VIENEN DE LA INTERFAZ

//OPCIÓN POR CONSOLA

//



public class InterfazAlberto extends JFrame {



	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField año;

	private JTextField mes;

	private JTextField dia;

	private JTextField txtNombreEmpleado;

	

	//

	private final JLabel labelArchivoCargado = new JLabel("ARCHIVO CARGADO?");



	ArrayList<String> ListaEdadSalida = new ArrayList<>();



	ArrayList<Integer> ListaNumeros = new ArrayList<>();

	

	//

	

	private int d;

	private int m;

	private int a;

	//

	private final JLabel labelEdadIntenfaz = new JLabel("DEVUELVE EDAD DESDE LA INTERFAZ");



	

	public int edad() {

	

	LocalDate fechaHoy = LocalDate.now();

	

	if (!fechaOk(a, m, d)) {

	

	System.err.println("La fecha introducida no es válida.");

	

	return 0;

	}

	

	LocalDate fechaNacimiento = LocalDate.of(a, m, d);

	

	// calculo

	

	Period periodo = Period.between(fechaNacimiento, fechaHoy);

	

	int edad = periodo.getYears();

	

	return edad;

	}

	

	private boolean fechaOk(int a, int m, int d) {

	

	try {

	LocalDate.of(a, m, d);

	

	return true;

	

	} catch (DateTimeException e) {

	

	return false;

	}

	}

	

	/**

	* Launch the application.

	*/

	public static void main(String[] args) {

	EventQueue.invokeLater(new Runnable() {

	public void run() {

	try {

	InterfazAlberto frame = new InterfazAlberto();

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

	public InterfazAlberto() {

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setBounds(100, 100, 450, 300);

	contentPane = new JPanel();

	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));



	setContentPane(contentPane);

	

	JButton btnNewButton = new JButton("CARGAR ARCHIVO");

	

	

	btnNewButton.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {

	

	File u5 = new File("/Users/josecarlos/Desktop/u5");

	

	try {

	

	Scanner sc = new Scanner(u5);

	

	

	if (u5 != null) {

	

	labelArchivoCargado.setText("Archivo cargado");

	

	System.out.println("Archivo cargado");

	



	}

	

	sc.close();

	

	} catch (Exception e2) {

	

	System.err.println("Hubo algún error: " + e2.getMessage());

	

	e2.printStackTrace();

	

	}

	

	

	

	

	

	

	

	}

	});

	contentPane.add(btnNewButton);

	

	JLabel labelArchivoCargado = new JLabel("ARCHIVO CARGADO?");

	contentPane.add(labelArchivoCargado);

	

	JButton btnNewButton_1 = new JButton("CALCULAR ARC");

	

	

	btnNewButton_1.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {

	

	try {

	

	PrintWriter xmlFicheroSalida = new PrintWriter("/Users/josecarlos/Desktop/interfazFicheroSalida.txt");



	File u5 = new File("/Users/josecarlos/Desktop/u5");

	

	Scanner sc = new Scanner(u5);

	

	while (sc.hasNextLine()) {

	

	String info = sc.nextLine();

	

	ListaEdadSalida.add(info);	

	}

	

	

	String[] arrayListaSalida = new String[ListaEdadSalida.size()];

	

	for (int i = 0; i < ListaEdadSalida.size(); i++) {

	

	arrayListaSalida[i] = ListaEdadSalida.get(i);

	

	// System.out.println(arrayListaSalida[i]);

	

	}

	

	for (int i = 0; i < arrayListaSalida.length; i++) {

	

	String nombre = arrayListaSalida[i];

	

	

	

	if (nombre.contains("Nombre:")) {

	

	System.out.println(nombre);

	

	xmlFicheroSalida.println(nombre);

	}

	

	if (nombre.contains("Dia:")) {

	

	String dia = nombre.replaceAll("Dia:", "");

	

	String diaTrim = dia.trim();

	

	d = Integer.parseInt(diaTrim);

	

	

	}

	

	if (nombre.contains("Mes:")) {

	

	String mes = nombre.replaceAll("Mes:", "");

	

	String mesTrim = mes.trim();

	

	m = Integer.parseInt(mesTrim);

	

	

	}

	

	if (nombre.contains("Año:")) {

	

	String año = nombre.replaceAll("Año:", "");

	

	String añoTrim = año.trim();

	

	a = Integer.parseInt(añoTrim);

	

	xmlFicheroSalida.println("Edad: " + edad() + "\nDATOS CARGADOS DESDE ARCHIVO");

	

	

	}

	

	}

	

	

	

	xmlFicheroSalida.close(); 

	sc.close();

	

	

	

	} catch (Exception e2) {

	// TODO: handle exception

	}

	}

	});

	contentPane.add(btnNewButton_1);

	

	JLabel lblNewLabel_1 = new JLabel("calcula edad y genera archivo");

	contentPane.add(lblNewLabel_1);

	

	txtNombreEmpleado = new JTextField();

	txtNombreEmpleado.setText("NOMBRE EMPLEADO");

	contentPane.add(txtNombreEmpleado);

	txtNombreEmpleado.setColumns(12);

	

	dia = new JTextField();

	dia.setText("DIA");

	contentPane.add(dia);

	dia.setColumns(3);

	

	mes = new JTextField();

	mes.setText("MES");

	contentPane.add(mes);

	mes.setColumns(3);

	

	año = new JTextField();

	año.setText("AÑO");

	contentPane.add(año);

	año.setColumns(3);

	

	JButton btnNewButton_2 = new JButton("CALC");

	btnNewButton_2.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {

	

	try {

	String nombreEmpleado = txtNombreEmpleado.getText();

	d = Integer.parseInt(dia.getText());

	m = Integer.parseInt(mes.getText());

	a = Integer.parseInt(año.getText());

	

	

	edad();

	

	labelEdadIntenfaz.setText("Tiene "+ edad()+ " años");

	

	System.out.println("nombre: "+ nombreEmpleado +"\nEDAD: " + edad());

	

	PrintWriter xmlFicheroSalida = new PrintWriter("/Users/josecarlos/Desktop/interfazFicheroSalida.txt");

	

	xmlFicheroSalida.println("Nombre:" + nombreEmpleado + "\nEdad: " + edad()+ "\nDATOS CARGADOS DESDE INTERFAZ");

	

	xmlFicheroSalida.close();

	

	} catch (Exception e3) {

	

	e3.getMessage();

	

	}

	

	

	

	}

	});

	contentPane.add(btnNewButton_2);

	

	JLabel labelEdadIntenfaz = new JLabel("DEVUELVE EDAD DESDE LA INTERFAZ");

	contentPane.add(labelEdadIntenfaz);

	

	JButton btnNewButton_3 = new JButton("CALCULAR EDAD DESDE CONSOLA");

	

	btnNewButton_3.addActionListener(new ActionListener() {

	

	public void actionPerformed(ActionEvent e) {

	

	try {

	

	

	Scanner consola = new Scanner(System.in);	

	

	System.out.println("\nIntroduce el nombre del empleado mediante consola: ");	

	

	String nombreConsola = consola.next();	

	

	System.out.println("\nIntroduce la fecha de Nacimiento mediante consola");

	

	

	System.out.println("\nIntroduce el día: ");

	

	d = consola.nextInt();

	

	System.out.println("\nIntroduce el mes: ");

	

	m = consola.nextInt();

	

	System.out.println("\nIntroduce el año: ");

	

	a = consola.nextInt();

	

	System.out.println("\n"+ nombreConsola + " tiene: " + edad() + " años");

	

	PrintWriter xmlFicheroSalida = new PrintWriter("/Users/josecarlos/Desktop/interfazFicheroSalida.xml");

	

	xmlFicheroSalida.println("Nombre:" + nombreConsola + "\nEdad: " + edad()+ "\nDATOS CARGADOS DESDE CONSOLA");

	

	xmlFicheroSalida.close();

	

	

	} catch (Exception e2) {

	

	e2.getMessage();

	

	}

	

	

	}

	});

	contentPane.add(btnNewButton_3);

	}



}