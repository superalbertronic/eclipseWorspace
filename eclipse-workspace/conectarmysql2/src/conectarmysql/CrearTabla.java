package conectarmysql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {
	   //declaramos los diferentes objetos necesarios para nuestra conexión
	   
	   public static void main(String[] args) throws SQLException  {
	      Connection conn = null;
	      Statement stmt=null;
	      String sql="CREATE TABLE clientes (id INT PRIMARY KEY,"
	      		+ "nif VARCHAR(10) NOT NULL,"
	      		+ "nombre VARCHAR(60) NOT NULL,"
	      		+ "edad VARCHAR(2))";
	     try {
	    	 //Desde aquí se encarga del driver JDBC    
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa1","root","");
	         //controlamos que la conexión ha sido ok
	         stmt=conn.createStatement();
	         stmt.execute(sql);
	         System.out.println("Creada la tabla clientes");
	         conn.close();
	         stmt.close();
	      }
	      catch(SQLException e)                   
	         {e.printStackTrace();  
	      }
	 }
}