package bbdd;
import java.sql.*;
public class StatementEjemplo {

	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empresa","root","");
			Statement sentencia = conexion.createStatement();
			String nombre="ENDESA";
			String consulta = "select * from clientes where nombre='"+nombre+"'";
			ResultSet rs=sentencia.executeQuery(consulta);
			} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		
		
	}

}
