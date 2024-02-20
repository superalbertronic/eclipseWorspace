package modelovistacontrolador1;

import java.util.List;

import modelovistacontrolador.Cliente;

import java.sql.*;

public class Modelo {
	private Connection con;

	public Modelo(String url, String user, String password) throws SQLException {
		con = DriverManager.getConnection(url, user, password);
		public List<Cliente> ObtenerClientes() throws SQLException{
			
			List<Cliente> clientes=new ArrayLis<>();
	        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes"); // Crea una declaración SQL

	        // Ejecuta una consulta SQL para obtener todos los clientes de la tabla "clientes"
	        ResultSet rs = stmt.executeQuery();

	        // Itera a través de los resultados y crea objetos Cliente para cada fila
	        while (rs.next()) {
	        	int id=rs.getInt("id");
	        	String nif = rs.getString("nif");
	            String nombre = rs.getString("nombre");
	            String edad = rs.getString("edad");
	            clientes.add(new Cliente(id,nif,nombre,edad));
	            stmt.close(); // Cierra la declaración
	            rs.close(); // Cierra el resultado
	            return clientes;
	            
	        }
			
		}
		
		
	 
		
	}
	
	   public void close() throws SQLException {
	        con.close();
	    }

		
	
}
