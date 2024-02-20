package examenParcialAccesoDatosNicoRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
				Connection conn=null;
				Statement stmt=null;
				
				//INSERTAMOS DATOS A LA TABLA SEGUN LOS PARAMETROS CREADOS
				String sql="INSERT INTO tvideojuegos (idjuego, nombre, anio, compañia, precio, sinopsis, plataforma)"

						+"VALUES (3, 'Minecraft',2011,'Mojang', 29.99,'Mundo abierto y construccion', 'Multiplataforma')";
				try {
					conn=DriverManager.getConnection("jdbc:mysql://localhost/dbgametop","root","");
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					System.out.println("Datos insertados en tabla tvideojuegos");
					conn.close();
					stmt.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}

	}

}
