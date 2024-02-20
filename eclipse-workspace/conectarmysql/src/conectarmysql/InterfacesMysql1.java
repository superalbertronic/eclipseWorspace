package conectarmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfacesMysql1 extends JFrame implements ActionListener {
    // Declaraci�n de componentes
    JLabel idLabel, nifLabel, nombreLabel, edadLabel;
    JTextField idTextField, nifTextField, nombreTextField, edadTextField;
    JButton insertButton;

    public InterfacesMysql1() {
        // Configuraci�n del formulario
        setTitle("Insertar Datos en Clientes");
        setBounds(200, 100, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));


        // Inicializaci�n de componentes
        idLabel = new JLabel("ID:");
        nifLabel = new JLabel("NIF:");
        nombreLabel = new JLabel("Nombre:");
        edadLabel = new JLabel("Edad:");
        idTextField = new JTextField();
        nifTextField = new JTextField();
        nombreTextField = new JTextField();
        edadTextField = new JTextField();
        insertButton = new JButton("Insertar");

        // Agregar componentes al formulario
        add(idLabel);
        add(idTextField);
        add(nifLabel);
        add(nifTextField);
        add(nombreLabel);
        add(nombreTextField);
        add(edadLabel);
        add(edadTextField);
        add(new JLabel());
        add(insertButton);

        // Agregar acci�n al bot�n de inserci�n
        insertButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            // Obtener datos del formulario
            int id = Integer.parseInt(idTextField.getText());
            String nif = nifTextField.getText();
            String nombre = nombreTextField.getText();
            String edad = edadTextField.getText();

            // Configurar la conexi�n a la base de datos
            String url = "jdbc:mysql://localhost:3306/empresa";
            String usuario = "root";
            String password = "";

            try {
                // Establecer la conexi�n
                Connection con = DriverManager.getConnection(url, usuario, password);

                // Consulta SQL para insertar datos en la tabla
                String query = "INSERT INTO clientes (id, nif, nombre, edad) VALUES (?, ?, ?, ?)";

                // Preparar la sentencia SQL
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, nif);
                preparedStatement.setString(3, nombre);
                preparedStatement.setString(4, edad);

                // Ejecutar la sentencia SQL para insertar los datos
                int filasInsertadas = preparedStatement.executeUpdate();

                if (filasInsertadas > 0) {
                    JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudieron insertar los datos.");
                }

                // Cerrar la conexi�n
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        InterfacesMysql1 insertDataForm = new InterfacesMysql1();
        insertDataForm.setVisible(true);
    }
}
