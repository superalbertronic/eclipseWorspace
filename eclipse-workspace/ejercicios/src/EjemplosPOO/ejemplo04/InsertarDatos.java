package EjemplosPOO.ejemplo04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class InsertarDatos
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
          //Utiliza la clase auxiliar que hemos creado para establecer conexión con bbdd 
    	 	System.out.println("Nos hemos conectado a la BBDD"); 
     	 	 	 
    String sql = "INSERT INTO Estudiantes (id, n, nombre, apellido, edad) VALUES (?, ?, ?, ?, ?)"; 
    //Imaginemos que viene con datos 
    	 	Estudiante estudiante = new Estudiante(); 
     	 	 	 
    //Prepararemos la query para que coja los datos de manera dinamica. 
     	stmt = conn.prepareStatement(sql);  	stmt.setInt(1, estudiante.getId());  	stmt.setString(2, estudiante.getDni());  	stmt.setString(3, estudiante.getNombre());  	stmt.setString(4, estudiante.getApellido());  	stmt.setInt(5, estudiante.getEdad());  stmt.executeUpdate(sql); 	 
    }catch(SQLException se){ se.printStackTrace(); 
    }catch(Exception e){ 
     	e.printStackTrace(); }finally{ 
     	try{  	 	if(stmt!=null) 
    stmt.close(); 
    	 	 	 	conn.close(); 
    	 	}catch(SQLException se){ 
    System.out.println("No se ha podido cerrar la conexión."); 
    } 
    } 
     

            
            
            
            
            
         }
      }
      catch(SQLException ex)
      {
         System.out.println(ex);
      }
      catch(ClassNotFoundException ex)
      {
         System.out.println(ex);
      }
   }

}
