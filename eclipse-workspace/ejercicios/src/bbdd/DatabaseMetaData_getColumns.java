package bbdd;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DatabaseMetaData_getColumns {
	   public static void main(String args[]) throws SQLException {
	      //Registering the Driver
		   	      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	      //Getting the connection
	      String url = "jdbc:mysql://localhost/empresa1";
	      Connection con = DriverManager.getConnection(url, "root", " ");
	      System.out.println("Connection established......");
	      //Retrieving the meta data object
	      DatabaseMetaData metaData = con.getMetaData();
	      //Retrieving the columns in the database
	      ResultSet columns = metaData.getColumns(null, null, "clientes", null);
	      //Printing the column name and size
	      while (columns.next()){
	         System.out.print("Column name and size: "+columns.getString("COLUMN_NAME"));
	         System.out.print("("+columns.getInt("COLUMN_SIZE")+")");
	         System.out.println(" ");
	         System.out.println("Ordinal position: "+columns.getInt("ORDINAL_POSITION"));
	         System.out.println("Catalog: "+columns.getString("TABLE_CAT"));
	         System.out.println("Data type (integer value): "+columns.getInt("DATA_TYPE"));
	         System.out.println("Data type name: "+columns.getString("TYPE_NAME"));
	         System.out.println(" ");
	      }
	   }
	}