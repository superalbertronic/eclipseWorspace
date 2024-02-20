package JnitEjemplos;

import java.sql.*;
public class MetaDatos
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
            String [] tipos= {"TABLE"};
            ResultSet rs=meta.getTables("empresa",null,null, tipos);
            
            
			System.out.println("consulta realizada");
						
			System.out.println("BBDD empresa");
			System.out.println("Tipo "+"tabla");
			System.out.println("..............");
			while (rs.next()) {
				String tabla=rs.getString(3);
				String tipo=rs.getString(4);
				System.out.println(tipo+" "+tabla);
			}
			
            
            
            	
            
            conn.close();
         }
      }
      catch(SQLException e)
      		
      {System.out.println("Error"+e.getMessage());
      }
}
}