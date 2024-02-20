package examen.practico.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBD {
	public static void main(String[] args) throws SQLException {
		/*Creo la base de datos
		 * Me conecto a la url con mi usuario y contraseña
		 * Cierro la conexión
		*/
		Connection conn = null;
		Statement stmt = null;  	
		String sql="CREATE DATABASE dbgametop;";  	 

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la base de datos dbgametop");
				
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}