package examenParcialAccesoDatosNicoRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		
		//CREAMOS CONSULTA PARA MOSTRAR LOS DATOS INGRESADOS A LA TABLA
		String sql="SELECT * FROM tvideojuegos";
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/dbgametop","root","");
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int idjuego=rs.getInt("Idjuego");
				String nombre=rs.getString("nombre");
				int anio=rs.getInt("anio");
				String compañia=rs.getString("compañia");
				String sinopsis=rs.getString("sinopsis");
				String plataforma=rs.getString("plataforma");
				System.out.println(
						"Idjuego: "+idjuego
						+" ,nombre: "+nombre
						+" ,anio: "+anio
						+" ,compañia: "+compañia
						+" ,sinopsis: "+sinopsis
						+" ,plataforma: "+plataforma);
			}
			conn.close();
			stmt.close();
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
