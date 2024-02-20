import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectDb {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		 try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/pedidos","root","");
	            Statement stmt=con.createStatement();  
	            ResultSet rs=stmt.executeQuery("show databases;");
	            System.out.println("Connected");  
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	}

}
