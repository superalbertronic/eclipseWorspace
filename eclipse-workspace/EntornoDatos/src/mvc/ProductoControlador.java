package mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoControlador {
    public static List<Producto> getProductos() {
        String url = "jdbc:mysql://localhost:3306/producto";
        String user = "root";
        String password = "";
        List<Producto> productos = new ArrayList<Producto>();
        try {
           
            Connection conexion = DriverManager.getConnection(url, user, password);
           conexion.setAutoCommit(false);
            CallableStatement st = conexion.prepareCall("{CALL listado()}");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                productos.add(new Producto(id, nombre, precio));
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
}

