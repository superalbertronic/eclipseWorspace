package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EstudianteModel {
	private Connection conn;

    public EstudianteModel(String dbURL, String usurname, String password) throws SQLException {
        conn = DriverManager.getConnection(dbURL,usurname,password);
    }

    public List<Estudiante> getAllItems() throws SQLException {
        List<Estudiante> items = new ArrayList<>();

        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM estudiantes");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String nombre = rs.getString("nombre");
            String correo = rs.getString("correo_electronico");
            String telefono = rs.getString("telefono");
            String curso = rs.getString("curso");
            String fecha = rs.getString("fecha_inscripcion");

            Estudiante item = new Estudiante(nombre,correo, telefono,curso,fecha);
            items.add(item);
        }

        stmt.close();
        rs.close();
        return items;
    }

    public void addToDB(String nombre, String correo, String telefono, String curso, String fecha) throws SQLException {   
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO estudiantes"
                + "(nombre, correo_electronico, telefono, curso, fecha_inscripcion)"
                + " VALUES('" + nombre + "','" + correo + "','" + telefono + "','" + curso + "','" + fecha + "');");

        
       // "INSERT INTO estudiantes(nombre,correo_electronico,telefono,curso,fecha_inscripcion)VALUES('"+nombre+",'"+correo+",'"+telefono+",'"+curso+",'"+fecha+");"
        stmt.executeUpdate();
    }

    public void deleteInDB(String nombre) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM estudiantes WHERE nombre = '" + nombre + "'");
        stmt.executeUpdate();
    }

}
