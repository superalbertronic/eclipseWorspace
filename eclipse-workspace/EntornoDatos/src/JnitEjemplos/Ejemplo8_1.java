package JnitEjemplos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ejemplo8_1 {

	public static void main(String[] args) throws Exception{
		// TODO Esbozo de método generado automáticamente
		// TODO Esbozo de método generado automáticamente
		Connection conn = null;
		String query = "CREATE PROCEDURE selectAllClients1() "
	               + "BEGIN "
	               + "SELECT * FROM clientes;"
	               + "END;";

		
		try {
			conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost/empresa","root","");
			Statement stmt = conn.createStatement();
		    stmt.executeUpdate(query);		
		    System.out.println("Procedimiento creado");
			conn.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}

}
