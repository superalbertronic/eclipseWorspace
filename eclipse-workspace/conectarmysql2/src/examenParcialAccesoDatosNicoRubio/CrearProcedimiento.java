package examenParcialAccesoDatosNicoRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearProcedimiento {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement presta = null;
		String dropProcedure = "DROP PROCEDURE IF EXISTS ObtenerJuegos";
		String createProcedure = "CREATE PROCEDURE ObtenerJuegos()" + 
								 "BEGIN "+
								 "SELECT * FROM tvideojuegos;"+
								 "END;";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root","");
			
			//Primero, eliminamos el procedimiento si existe
			presta = conn.prepareStatement(dropProcedure);
			presta.executeUpdate();
			
			presta = conn.prepareStatement(createProcedure);
			presta.executeUpdate();
			
			System.out.println("Procedimiento creado");
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
