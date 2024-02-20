package JnitEjemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Ejemplo5 {
	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conn = null;
		Statement stmt = null;  	
		String sql="ALTER TABLE clientes DROP COLUMN edad ;";  	 
		try {
			conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost/empresa","root","");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Eliminada columna edad");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}