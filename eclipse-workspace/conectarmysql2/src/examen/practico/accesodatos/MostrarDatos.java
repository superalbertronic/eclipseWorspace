package examen.practico.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {
  public static void main(String[] args) {
	  /*
	   * Selecciono la tabla tvidejuegos
	   * Hago la conexión y creo una sentencia para que me muestre los datos si están
	   * Muestro por consola 
	   * Cierro la conexión
	   */
    Connection conn = null;
    Statement stmt = null;
    String sql = "SELECT * FROM tvideojuegos";
    try {
      conn = DriverManager.getConnection(
             "jdbc:mysql://localhost/dbgametop","root","");
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        int idjuego = rs.getInt("idjuego");
        String nombre = rs.getString("nombre");
        int anio = rs.getInt("anio");
        String compañia = rs.getString("compañia");
        double precio = rs.getDouble("precio");
        String sinopsis = rs.getString("sinopsis");
        String plataforma = rs.getString("plataforma");
        
        System.out.println("idjuego: " + idjuego + ", nombre: " + nombre + 
                           ", anio: " + anio + ", compañia: " + compañia + 
                           ", precio: " + precio+" sinopsis: " + sinopsis +
                           "plataforma: " + plataforma);
      }
      rs.close();
      conn.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

