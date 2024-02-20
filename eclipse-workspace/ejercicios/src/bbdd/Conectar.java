package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

import com.mysql.cj.jdbc.DatabaseMetaData;
public class Conectar{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String bbdd=JOptionPane.showInputDialog("indica la base de datos"); 
            String usuario=JOptionPane.showInputDialog("indica el usuario");
            String tabla=JOptionPane.showInputDialog("indica la tabla");
            
            Connection con=DriverManager.getConnection(
            		
                    "jdbc:mysql://localhost:3306/"+bbdd,usuario,"");
            
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");  
            
            //codigo copiado getcolu,
            
            java.sql.DatabaseMetaData metaData = con.getMetaData();
            //Retrieving the columns in the database
            ResultSet columns = metaData.getColumns(null, null, tabla, null);
            ResultSet r;
                   
            
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
               //
            
               while (rs.next()) {
            	   // El contenido de cada columna del ResultSet se puede ver
            	   // en la API, en el metodo getTables() de DataBaseMetaData.
            	   // La columna 1 es TABLE_CAT
            	   // y la 3 es TABLE_NAME
            	 
            	}
               
               
            }
            System.out.println("Tablas:");
            r = metaData.getTables(null, null, null,null);
           // while(r.next()) {
            //System.out.println("tabla-/ "+ r.getString("TABLE_NAME")+" BBDD+ / "+r.getString(1));
           // }
            con.close();
            System.out.println("Conexion cerrada");
            
            
            //este codigo superior se pordria borrar
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}