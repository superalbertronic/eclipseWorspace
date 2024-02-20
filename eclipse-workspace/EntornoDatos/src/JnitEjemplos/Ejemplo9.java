package JnitEjemplos;
//ESTE CODIGO ES ERRONEO///
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class Ejemplo9{
	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conn = null; 
		CallableStatement llamadaProcedure =null; 
		try { 
		 	//Realizamos la conexión  	
			conn = DriverManager.getConnection(
	                 "jdbc:mysql://localhost/empresa","root","");
			 	System.out.println("Conexión ok"); 
		 	 	 	 
		 	String sql = "{call ObtenerClientes ('DRED')}";  	
		//Llamada al procedimiento almacenado, tiene que existir en la BBDD 
		 	llamadaProcedure = conn.prepareCall(sql);  	
		//Definimos el parámetro OUT 
			 	
			 
		   // Ejecuta el procedimiento almacenado 
			 	boolean resultado = llamadaProcedure.execute(); 
			 	if(resultado) { 
			 	 	ResultSet lista = llamadaProcedure.getResultSet(); 
			 	 	while (lista.next()) { 
			   //Obtenemos el NIF
			 	 		int id=lista.getInt("id");
			 	 	 	String nombre=lista.getString("nombre");
			 	 		String nif = lista.getString("nif"); 
			 	 		System.out.println("id nombre nif");
			 	 		System.out.println(id+" "+nombre+" "+nif); 
			 	 	} 
			 	} 
		} catch (SQLException ex) { 
		 	System.out.println("Se ha producido un error en la ejecucion de la SQL: " + ex.getMessage()); } 

	}
}