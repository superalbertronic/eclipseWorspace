package JnitEjemplos;
import java.sql.*;
public class Ejemplo1{
   //declaramos los diferentes objetos necesarios para nuestra conexión
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/empresa";
   public static void main(String[] args) throws Exception  {
      Connection conn = null;
      try {
//Desde aquí se encarga del driver JDBC    
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url,login,password);
         if (conn != null) {
            System.out.println("Conexión a base de datos "+url+" ... Ok");
            conn.close();
         }
      }
      catch(SQLException e)                   
         {System.out.println("Error"+e.getMessage());  
      }
 }
}
