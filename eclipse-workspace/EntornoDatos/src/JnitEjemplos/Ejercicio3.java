package JnitEjemplos;
import java.sql.*;
public class Ejercicio3 {

	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de método generado automáticamente
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empresa1","root","");
			Statement sentencia = conexion.createStatement();
			String nombre="ITEC";
			String consulta = "select * from clientes where nombre='"+nombre+"'";
			ResultSet rs=sentencia.executeQuery(consulta);
			System.out.println("consulta realizada");
			
			while (rs.next()) {
				String catalogo=rs.getString(1);
				String esquema=rs.getString(2);
				String tabla=rs.getString(3);
				String tipo=rs.getString(4);
				System.out.println(tipo+" "+catalogo+" "+ tabla+""+esquema);
			}
			
			conexion.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
			
			}
	}

}