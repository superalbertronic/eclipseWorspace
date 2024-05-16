package examenfinal2T;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteModel {
    private Connection conn;

    public EstudianteModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    public List<Estudiante> getAllEstudiantes() throws SQLException {
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM estudiantes");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String correo = rs.getString("correo");
            String telefono = rs.getString("telefono");
            String curso = rs.getString("curso");
            String fecha = rs.getString("fecha");
            estudiantes.add(new Estudiante(id, nombre, correo, telefono, curso, fecha));
        }
        stmt.close();
        rs.close();
        return estudiantes;
    }

    public void mostrarEstudiantes() throws SQLException {
        List<Estudiante> estudiantes = getAllEstudiantes();
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void borrarRegistro(String nombre) throws SQLException {
        String sql = "DELETE FROM estudiantes WHERE nombre=?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, nombre);

            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Registro eliminado correctamente");
            } else {
                System.out.println("No se encontró el registro con el nombre especificado");
            }
        }
    }

    public void actualizarEstudiante(String nombreAntiguo, Estudiante estudiante) throws SQLException {
        String query = "UPDATE estudiantes SET nombre=?, correo=?, telefono=?, curso=?, fecha=? WHERE nombre=?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getCorreo());
            stmt.setString(3, estudiante.getTelefono());
            stmt.setString(4, estudiante.getCurso());
            stmt.setString(5, estudiante.getFecha());
            stmt.setString(6, nombreAntiguo);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Estudiante actualizado correctamente");
            } else {
                System.out.println("No se encontró el estudiante con el nombre especificado");
            }
        }
    }

    public void agregarEstudiante(Estudiante nuevoEstudiante) throws SQLException {
        String query = "INSERT INTO estudiantes (nombre, correo, telefono, curso, fecha) VALUES (?,?,?,?,?)";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nuevoEstudiante.getNombre());
            stmt.setString(2, nuevoEstudiante.getCorreo());
            stmt.setString(3, nuevoEstudiante.getTelefono());
            stmt.setString(4, nuevoEstudiante.getCurso());
            stmt.setString(5, nuevoEstudiante.getFecha());

            stmt.executeUpdate();
        }
    }

    public void close() throws SQLException {
        conn.close();
    }
}
