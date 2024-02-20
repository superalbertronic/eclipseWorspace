package mvc;
import java.util.List;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class AlumnoModel {
    private Connection conn;


    public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
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
        	Date fechaNacimiento = rs.getDate("fecha_nacimiento");
        	boolean repetidor = rs.getString("es_repetidor").equals("sí");
        	int telefono = rs.getInt("teléfono");
            alumnos.add(new Alumno(id, nombre, apellido1, apellido2, fechaNacimiento, repetidor, telefono)); 
        }

        stmt.close();
        rs.close();
        return alumnos; 
    }

   
    public void close() throws SQLException {
        conn.close();
    }
}

