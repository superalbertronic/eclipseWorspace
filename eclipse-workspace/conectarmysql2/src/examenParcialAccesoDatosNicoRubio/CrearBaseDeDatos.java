package examenParcialAccesoDatosNicoRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBaseDeDatos {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		
		//Creamos la base de datos 
		String sql="CREATE DATABASE dbgametop";
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			stmt=conn.createStatement();
			stmt.execute(sql);
				System.out.println("La base de datos dbgametop ok");
				conn.close();
				stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
