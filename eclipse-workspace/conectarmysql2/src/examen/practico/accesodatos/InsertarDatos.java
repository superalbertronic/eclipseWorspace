package examen.practico.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertarDatos {
	public static void main(String[] args) throws SQLException {
		
		/*
		 * Me conecto a la bd y ejecuto la sentencia que inserta lo nuevos datos en la tabla tvideojuegos
		 * Por último dejo un mensaje y cierro la conexión
		 */
		Connection conn = null;
		Statement stmt = null;  	
		String sql = "INSERT INTO tvideojuegos (idjuego, nombre, anio, compañia, precio, sinopsis, plataforma) " +
	             "VALUES (1, 'The Legend of Zelda', 2017, 'Nintendo', 59.99, 'Aventura épica', 'Nintendo Switch')"+
	             "VALUES (2, 'Red Dead Redemption 2', 2018, 'Rockstar Games', 49.99, 'Aventura del viejo oeste', 'Playstation 4')"+
	             "VALUES (3, 'Minecradt', 2011, 'Mojang', 29.99, 'Mundo abierto', 'Multiplataforma')";

	try {
	  conn = DriverManager.getConnection(
	         "jdbc:mysql://localhost/dbgametop","root","");
	  stmt = conn.createStatement();
	  stmt.executeUpdate(sql);
	  System.out.println("Datos insertados en la tabla tvideojuegos");
	  conn.close();
	  stmt.close();
	} catch (SQLException e) {
	  e.printStackTrace();
	}
	}
}