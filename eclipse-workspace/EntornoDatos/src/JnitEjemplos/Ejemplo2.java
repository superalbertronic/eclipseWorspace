package JnitEjemplos;

import java.sql.*;
public class Ejemplo2 {
	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(
                 "jdbc:mysql://localhost/empresa1","root","");
			
			System.out.println("consulta realizada");
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
