package modelVistaControlador9;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoModel {
    private Connection connection;

    public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    public List<Alumno> obtenerTodosLosAlumnos() throws SQLException {
        List<Alumno> alumnos = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM alumno");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombre = resultSet.getString("nombre");
            String apellido1 = resultSet.getString("apellido1");
            String apellido2 = resultSet.getString("apellido2");
            Date fechaNacimiento = resultSet.getDate("fecha_nacimiento");
            String esRepetidor = resultSet.getString("es_repetidor");
            String telefono = resultSet.getString("telefono");

            Alumno alumno = new Alumno(id, nombre, apellido1, apellido2, fechaNacimiento, esRepetidor, telefono);
            alumnos.add(alumno);
        }

        statement.close();
        resultSet.close();
        return alumnos;
    }

    public void cerrarConexion() throws SQLException {
        connection.close();
    }
}

