package JnitEjemplos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ejemplo8_2 {

	public static void main(String[] args) throws Exception{
		// TODO Esbozo de método generado automáticamente
		// TODO Esbozo de método generado automáticamente
		Connection conn = null;
		
		String query = "CALL selectAllClients();";
	    
		try {
			conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost/empresa","root","");
			Statement stmt = conn.createStatement();   
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("id nif nombre");
		    while (rs.next()) {
		    	int id=rs.getInt("id");
		    	String nif=rs.getString("nif");
		    	String nombre=rs.getString("nombre");
		    	
		    	System.out.println(id+" "+nif+" "+nombre);// procesar los resultados
		    }

		    
			conn.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}

}
