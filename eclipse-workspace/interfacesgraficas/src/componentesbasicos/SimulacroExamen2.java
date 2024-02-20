package componentesbasicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SimulacroExamen2 extends JFrame {
    private JTextField textFieldNombre, textFieldApellidos,textFieldEdad, textFieldDireccion
    ,textFieldTelefono;
    private JTextArea textAreaComentarios;
    private JCheckBox checkBoxJava,checkBoxPython;
    private JRadioButton radioButtonBachillerato,radioButtonCicloMedio,radioButtonCicloSuperior;
    private JComboBox<String> comboBoxEstudiosPrevios;
    private JButton botonCargarCurriculum;
    private JComboBox comboBoxSituacionLaboral;
    private JLabel lblNewLabel;

    public SimulacroExamen2() {
        setTitle("Formulario para Alumnos de FP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // previamente creamos un layout de tipo borderlayout
        getContentPane().setLayout(new BorderLayout());
        // creamos el panel formulario y le asignamos un Gridlayout    
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(12, 1, 5, 5));
        // componentes del formulario
        JLabel labelNombre = new JLabel("Nombre:");
        textFieldNombre = new JTextField();
        JLabel labelApellidos = new JLabel("Apellidos:");
        textFieldApellidos = new JTextField();
        JLabel labelEdad = new JLabel("Edad:");
        textFieldEdad = new JTextField();
        JLabel labelDireccion = new JLabel("Dirección:");
        textFieldDireccion = new JTextField();
        JLabel labelTelefono = new JLabel("Teléfono:");
        textFieldTelefono = new JTextField();
        JLabel labelEstudiosPrevios = new JLabel("Estudios Previos:");
        comboBoxEstudiosPrevios = new JComboBox<>(new String[]{"Sin estudios previos", "Bachillerato", "Ciclo Medio", "Ciclo Superior"});
        JLabel labelComentarios = new JLabel("Comentarios:");
        textAreaComentarios = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
        checkBoxJava = new JCheckBox("Java");
        checkBoxPython = new JCheckBox("Python");
        radioButtonBachillerato = new JRadioButton("Bachillerato");
        radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
        radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
        ButtonGroup groupNivelEstudios = new ButtonGroup();
        //añadimos los radiosbuttons al grupo groupNivelEstudios
        groupNivelEstudios.add(radioButtonBachillerato);
        groupNivelEstudios.add(radioButtonCicloMedio);
        groupNivelEstudios.add(radioButtonCicloSuperior);
        //seguimos añadiendo componentes
        lblNewLabel = new JLabel("Situación laboral");
        comboBoxSituacionLaboral = new JComboBox();
        comboBoxSituacionLaboral.setModel(new DefaultComboBoxModel(new String[] {"Desempleado", 
        		"Trabajo por cuenta propia", "Trabajo por cuenta ajena", "Funcionario"}));
        botonCargarCurriculum = new JButton("Cargar Curriculum");
        // añadimos LOS COMPONENTES AL JPANE formualarios
        panelFormulario.add(labelNombre);
        panelFormulario.add(textFieldNombre);
        panelFormulario.add(labelApellidos);
        panelFormulario.add(textFieldApellidos);
        panelFormulario.add(labelEdad);
        panelFormulario.add(textFieldEdad);
        panelFormulario.add(labelDireccion);
        panelFormulario.add(textFieldDireccion);
        panelFormulario.add(labelTelefono);
        panelFormulario.add(textFieldTelefono);
        panelFormulario.add(labelEstudiosPrevios);
        panelFormulario.add(comboBoxEstudiosPrevios);
        panelFormulario.add(lblNewLabel);
        panelFormulario.add(comboBoxSituacionLaboral);
        panelFormulario.add(labelComentarios);
        panelFormulario.add(scrollPane);
        panelFormulario.add(checkBoxJava);
        panelFormulario.add(checkBoxPython);
        panelFormulario.add(radioButtonBachillerato);
        panelFormulario.add(radioButtonCicloMedio);
        panelFormulario.add(radioButtonCicloSuperior);
        panelFormulario.add(botonCargarCurriculum);
        //añadimos el panelformulario a la zona center del borderlayout
        getContentPane().add(panelFormulario, BorderLayout.CENTER);
        // creamos el panelbotones
        JPanel panelBotones = new JPanel();
        //creamos y añadimos los botones
        JButton botonCerrar = new JButton("Cerrar");
        JButton botonAceptar = new JButton("Aceptar");
        panelBotones.add(botonCerrar);
        panelBotones.add(botonAceptar);
        //el panelbotones va al area sur
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
        // addaciontlistener del boton aceptar
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recopilar la información del formulario
                String nombre = textFieldNombre.getText();
                String apellidos = textFieldApellidos.getText();
                String edad = textFieldEdad.getText();
                String direccion = textFieldDireccion.getText();
                String telefono = textFieldTelefono.getText();
                String estudiosPrevios = (String) comboBoxEstudiosPrevios.getSelectedItem();
                String situacionLaboral=(String) comboBoxSituacionLaboral.getSelectedItem();
                String comentarios = textAreaComentarios.getText();
                boolean javaChecked = checkBoxJava.isSelected();
                boolean pythonChecked = checkBoxPython.isSelected();
                String nivelEstudios = "";
                if (radioButtonBachillerato.isSelected()) {
                    nivelEstudios = "Bachillerato";
                } else if (radioButtonCicloMedio.isSelected()) {
                    nivelEstudios = "Ciclo Medio";
                } else if (radioButtonCicloSuperior.isSelected()) {
                    nivelEstudios = "Ciclo Superior";
                }

                // Mostrar la información en un JOptionPane
                String mensaje = "Nombre: " + nombre + "\n"
                        + "Apellidos: " + apellidos + "\n"
                        + "Edad: " + edad + "\n"
                        + "Dirección: " + direccion + "\n"
                        + "Teléfono: " + telefono + "\n"
                        + "Estudios Previos: " + estudiosPrevios + "\n"
                        + "Situacion laboral: " + situacionLaboral + "\n"
                        + "Comentarios: " + comentarios + "\n"
                        + "Java: " + javaChecked + "\n"
                        + "Python: " + pythonChecked + "\n"
                        + "Nivel de Estudios: " + nivelEstudios;
                //usamos un showmessagedialog con la información del examen.
                JOptionPane.showMessageDialog(SimulacroExamen2.this, mensaje, "Información del Formulario", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // configuramos lo que hará el botón cerrar
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir ventana de agradecimiento
            	
                mostrarVentanaAgradecimiento();
            }
        });
        //acción del botoón para cargar el curriculum e invocar a jfilechooser
        botonCargarCurriculum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cargar el currículum
                JFileChooser fileChooser = new JFileChooser();
                int seleccion = fileChooser.showOpenDialog(SimulacroExamen2.this);

                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    File archivoSeleccionado = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(SimulacroExamen2.this,
                            "Curriculum cargado: " + archivoSeleccionado.getName(),
                            "Curriculum Cargado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
    }
// ventana que llama a un jdialog, los jdialog, también tienen su layout, en este caso usamos
    //borderlayout
    private void mostrarVentanaAgradecimiento() {
        JDialog dialogoAgradecimiento = new JDialog(SimulacroExamen2.this, "Agradecimiento", true);
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
        dialogoAgradecimiento.setLocationRelativeTo(SimulacroExamen2.this);
        dialogoAgradecimiento.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimulacroExamen2 ventana = new SimulacroExamen2();
            ventana.setVisible(true);
        });
    }
}
