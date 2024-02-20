package JnitEjemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class Ejemplo7{
	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conn = null;
		Statement stmt = null;  	
		CallableStatement ct=null; 
		ResultSet res=null;
		String sql="CALL obtenerClientes('DRED');";  	 
		try {
			conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost/empresa","root","");
			stmt = conn.createStatement();
			ct=conn.prepareCall(sql);
			ct.execute(sql);
			System.out.println("Ejecutando procedimiento");
			while (ct!=null) {
				
				String nifcol=ct.getString("nif");
				String nomcol=ct.getString("nombre");
				System.out.println( nifcol+" "+nomcol);
			}
			
			conn.close();
			stmt.close();
			ct.close();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}