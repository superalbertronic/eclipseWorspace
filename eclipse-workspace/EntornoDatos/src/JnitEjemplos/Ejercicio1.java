package JnitEjemplos;

import java.sql.*;
public class Ejercicio1
{
   //declaramos los diferentes objetos necesarios para nuestra conexión
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/empresa";
   public static void main(String[] args) throws Exception
   {
      Connection conn = null;
      try
      {
//Desde aquí se encarga del driver JDBC    
Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url,login,password);
         if (conn != null)
         {
            System.out.println("Conexión a base de datos "+url+" ... Ok");
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("Versión del driver JDBC " + meta.getDriverVersion());
            System.out.println("Nombre " + meta.getDatabaseProductName());
            System.out.println("Versión " + meta.getDatabaseProductVersion());
            System.out.println(meta.);
            	
            conn.close();
         }
      }
      catch(SQLException e)
      		
      {System.out.println("Error"+e.getMessage());
      }
}
}