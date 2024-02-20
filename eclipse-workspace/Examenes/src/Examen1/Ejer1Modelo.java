package Examen1;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Ejer1Modelo {
	
	private Connection conn;
	
	public void ClienteModelo(String dbURL, String dbUser, String dbPassword) throws SQLException {
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
		
	}
	
	public List<Alumno> getAllAlumnos() throws SQLException {
		List<Alumno> alumnos = new ArrayList<>(); 
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno");
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido1 = rs.getString("apellido1");
            String apellido2 = rs.getString("apellido2");
            String fecha_nacimiento = rs.getString("fecha_nacimiento");
            Boolean es_repetidor = rs.getBoolean("es_repetidor");
            String telefono = rs.getString("telefono");
            alumnos.add(new Alumno(id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetidor, telefono));
        }
		stmt.close();
        rs.close();
        return alumnos;
    }
	
	public void close() throws SQLException {
        conn.close();
    }
}