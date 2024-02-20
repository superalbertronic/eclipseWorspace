package conectarmysql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {
	   //declaramos los diferentes objetos necesarios para nuestra conexión
	   
	   public static void main(String[] args) throws SQLException  {
	      Connection conn = null;
	      Statement stmt=null;
	      String sql="INSERT INTO clientes (id, nif, nombre, edad)"+
	      " VALUES (1,'11111','Alberto','40')";
	     try {
	    	 //Desde aquí se encarga del driver JDBC    
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa1","root","");
	         //controlamos que la conexión ha sido ok
	         stmt=conn.createStatement();
	         stmt.executeUpdate(sql);
	         System.out.println("Datos insertados en la tabla clientes");
	         conn.close();
	         stmt.close();
	      }
	      catch(SQLException e)                   
	         {e.printStackTrace();  
	      }
	 }
}