package mvc;

import java.sql.*;

public class InsertarProducto {
    public static void main(String[] args) {
        try {
            // Cargar el driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/producto", "root", "");

            // Crear una sentencia preparada
            String sql = "INSERT INTO tproductos (id, nombre, precio) VALUES (?, ?, ?)";
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            // Establecer los valores para los parámetros
            sentencia.setInt(1, 1);
            sentencia.setString(2, "portatil");
            sentencia.setDouble(3, 800);

            // Ejecutar la consulta
            int filasAfectadas = sentencia.executeUpdate();

            // Mostrar el resultado
            System.out.println("Filas afectadas: " + filasAfectadas);

            // Cerrar la conexión
            conexion.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver MySQL: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al conectarse a la base de datos: " + ex.getMessage());
        }
    }
}