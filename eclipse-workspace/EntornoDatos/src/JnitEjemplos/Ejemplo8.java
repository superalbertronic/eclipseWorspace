package JnitEjemplos;
//ESTE CODIGO ES ERRONEO///
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class Ejemplo8{
	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conn = null;
		Statement stmt = null;  	
		CallableStatement ct=null; 
		String procedure="\"DELIMITER $$\" + \r\n"
				+ "	 	 	\"DROP PROCEDURE IF EXISTS \r\n"
				+ "EMPRESA`.`ObtenerDatosCliente` $$\" + \"CREATE PROCEDURE \r\n"
				+ "`EMPRESA`.`ObtenerDatosCliente` \" + \r\n"
				+ "	 	\"   (IN ES_ID INT, OUT ES_NIF VARCHAR(10))\" + \r\n"
				+ "	 	\"BEGIN\" + \r\n"
				+ "	 	\"   SELECT NIF INTO ES_NIFI\" + \r\n"
				+ "	 	\"   FROM CLIENTES\" + \r\n"
				+ "	 	\"   WHERE ID = ES_ID;\" + \r\n"
				+ "	 	\"END $$\" + \r\n"
				+ "	 	\"DELIMITER ;\"; \r\n"
				+ "";  	 
		try {
			conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost/empresa","root","");
			stmt = conn.createStatement();
			stmt.execute(procedure);
				
			conn.close();
			stmt.close();
			ct.close();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}