package com.example.modelo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class MostrarDatos {
	   //declaramos los diferentes objetos necesarios para nuestra conexión
	   
	   public static void main(String[] args) throws SQLException  {
	      Connection conn = null;
	      Statement stmt=null;
	      String sql="SELECT * FROM clientes";
	     try {
	    	 //Desde aquí se encarga del driver JDBC    
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","");
	         //controlamos que la conexión ha sido ok
	         stmt=conn.createStatement();
	         ResultSet rs=stmt.executeQuery(sql);
	         while (rs.next()) {
	        	 int id=rs.getInt("id");
	        	 String nif=rs.getString("nif");
	        	 String nombre=rs.getString("nombre");
	        	 String edad=rs.getString("edad");
	        	 System.out.println("id: " + id + ", nif: " + nif + 
                         ", nombre: " + nombre + ", edad: " + edad);
	        	 
	         }
	         
	         
	         conn.close();
	         stmt.close();
	         rs.close();
	      }
	      catch(SQLException e)                   
	         {e.printStackTrace();  
	      }
	 }
}