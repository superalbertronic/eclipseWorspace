package JnitEjemplos;

import java.sql.*;
public class Ejemplo6 {
   //declaramos los diferentes objetos necesarios para nuestra conexión
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/empresa";
   public static void main(String[] args) throws Exception{
      Connection conn = null;
      try {
//Desde aquí se encarga del driver JDBC    
    	  Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection(url,login,password);
          Statement consulta = conn.createStatement();
		  String sql = "select * from clientes";
		  ResultSet rs=consulta.executeQuery(sql);
          if (conn != null) {
            System.out.println("Conexión a base de datos "+url+" ... Ok");
            System.out.println("BBDD empresa-Tabla clientes");
			System.out.println("id nif nombre");
			System.out.println("............................");
			while (rs.next()) {
				String idcol=rs.getString("id");
				String nifcol=rs.getString("nif");
				String nomcol=rs.getString("nombre");
				System.out.println(idcol+" "+nifcol+" "+nomcol);
			}
			rs.close();
            conn.close();
         }
      }
      catch(SQLException e)
      		
      {System.out.println("Error "+e.getMessage());
      }
}
}