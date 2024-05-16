package universidad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteModel {
    private Connection conn;

    public EstudianteModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    public List<Estudiante> getAllEstudiantes() throws SQLException {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo_electronico");
                String telefono = rs.getString("telefono");
                String curso = rs.getString("curso");
                String fechaInscripcion = rs.getString("fecha_inscripcion");

                Estudiante estudiante = new Estudiante(nombre, correo, telefono, curso, fechaInscripcion);
                estudiantes.add(estudiante);
            }
        }
        return estudiantes;
    }

    public void insertarEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "INSERT INTO universidad (nombre, correo_electronico, telefono, curso, fecha_inscripcion) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, estudiante.getNombre());
            preparedStatement.setString(2, estudiante.getCorreo());
            preparedStatement.setString(3, estudiante.getTelefono());
            preparedStatement.setString(4, estudiante.getCurso());
            preparedStatement.setString(5, estudiante.getFechaInscripcion());

            preparedStatement.executeUpdate();
        }
    }

    public void borrarEstudiantePorId(int idEstudiante) throws SQLException {
        String sql = "DELETE FROM universidad WHERE id=?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, idEstudiante);
            preparedStatement.executeUpdate();
        }
    }

    public void modificarNombreEstudiante(int idEstudiante, String nuevoNombre) throws SQLException {
        String sql = "UPDATE universidad SET nombre=? WHERE id=?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setInt(2, idEstudiante);
            preparedStatement.executeUpdate();
        }
    }

    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
