package examenParcialAccesoDatosNicoRubio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InvocarProcedimiento {

    public static void main(String[] args) {
        Connection conn = null;
        //definimos un objeto callableStatement sirve para preparar un espacio
        CallableStatement cstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");

            // Llamar al procedimiento almacenado
            cstmt = conn.prepareCall("call ObtenerJuegos()");

            // Ejecutar el procedimiento
            cstmt.execute();

            // Obtener los resultados si el procedimiento devuelve algo
            ResultSet rs = cstmt.getResultSet();
            
            //este bucle muestra por pantalla el resultado de lo que hemos realizado
            while (rs.next()) {
				int idjuego=rs.getInt("Idjuego");
				String nombre=rs.getString("nombre");
				int anio=rs.getInt("año");
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

            System.out.println("Procedimiento invocado");

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
