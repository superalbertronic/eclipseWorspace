package safa2;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static safa2.CalculadoraEdad.getEdad;

public class CalculadoraEdadGUI extends JFrame implements ActionListener {
    private JTextField txtDia, txtMes, txtAnio;
    private JLabel lblEdad;
    private File dirInput;
    int tipoEntrada = 0;

    public CalculadoraEdadGUI() {
        setTitle("Calculadora de Edad");
        setSize(280, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDia = new JLabel("Día:");
        lblDia.setBounds(30, 30, 50, 20);
        add(lblDia);

        txtDia = new JTextField();
        txtDia.setBounds(90, 30, 160, 20);
        add(txtDia);

        JLabel lblMes = new JLabel("Mes:");
        lblMes.setBounds(30, 60, 50, 20);
        add(lblMes);

        txtMes = new JTextField();
        txtMes.setBounds(90, 60, 160, 20);
        add(txtMes);

        JLabel lblAnio = new JLabel("Año:");
        lblAnio.setBounds(30, 90, 50, 20);
        add(lblAnio);

        txtAnio = new JTextField();
        txtAnio.setBounds(90, 90, 160, 20);
        add(txtAnio);

        JButton btnCrear = new JButton("Nuevo");
        btnCrear.setBounds(20, 150, 80, 30);
        btnCrear.addActionListener(this);
        add(btnCrear);

        JButton btnCargar = new JButton("Cargar");
        btnCargar.setBounds(100, 150, 80, 30);
        btnCargar.addActionListener(this);
        add(btnCargar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(180, 150, 80, 30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        lblEdad = new JLabel("");
        lblEdad.setBounds(120, 120, 80, 20);
        add(lblEdad);

        init();
        setVisible(true);
    }

    private void init() {
        txtDia.setEditable(false);
        txtMes.setEditable(false);
        txtAnio.setEditable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cargar")) {
            cargarDesdeArchivo();
        } else if (e.getActionCommand().equals("Calcular")) {
            calcularEdad();
        } else if (e.getActionCommand().equals("Nuevo")) {
            nuevaEdad();
        }
    }

    private void nuevaEdad() {
        Scanner src = new Scanner(System.in);

        System.out.print("Inserte día: ");
        int dia = Integer.parseInt(src.nextLine());
        System.out.print("Inserte mes: ");
        int mes = Integer.parseInt(src.nextLine());
        System.out.print("Inserte año: ");
        int anio = Integer.parseInt(src.nextLine());

        txtDia.setText(String.valueOf(dia));
        txtMes.setText(String.valueOf(mes));
        txtAnio.setText(String.valueOf(anio));

        src.close();

        tipoEntrada = 1;
    }

    private void cargarDesdeArchivo() {
        // Aquí implementa la lógica para cargar desde un archivo
        // Puedes usar JFileChooser para seleccionar el archivo

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            try {
                Scanner src = new Scanner(selectedFile);
                txtDia.setText(src.nextLine());
                txtMes.setText(src.nextLine());
                txtAnio.setText(src.nextLine());
                src.close();
                tipoEntrada = 2;
                dirInput = selectedFile;
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void calcularEdad() {
        if (tipoEntrada == 0) {
            return;
        }

        GregorianCalendar hoy = new GregorianCalendar();

        int diaHoy = hoy.get(GregorianCalendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(GregorianCalendar.MONTH) + 1;
        int anioHoy = hoy.get(GregorianCalendar.YEAR);

        int dia = Integer.parseInt(txtDia.getText());
        int mes = Integer.parseInt(txtMes.getText());
        int anio = Integer.parseInt(txtAnio.getText());

        int edad = (int)getEdad(anioHoy, anio, mesHoy, mes, diaHoy, dia);

        lblEdad.setText("Edad: " + edad);

        if (tipoEntrada == 2) {
            try {
                JFileChooser chooser = new JFileChooser();
                // Abrir el dialogo de seleccion de archivo en una direccion concreta
                chooser.setCurrentDirectory(dirInput.getParentFile());
                int result = chooser.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = chooser.getSelectedFile();

                    if (!selectedFile.getName().endsWith(".txt")) {
                        selectedFile = new File(selectedFile.getAbsolutePath() + ".txt");
                    }

                    FileWriter fw = new FileWriter(selectedFile);
                    fw.write(lblEdad.getText() + "\n");
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new CalculadoraEdadGUI();
    }
}