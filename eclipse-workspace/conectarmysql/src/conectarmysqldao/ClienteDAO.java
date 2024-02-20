package conectarmysqldao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private ConexionBD conexion;

    public ClienteDAO() {
        conexion = new ConexionBD();
    }
      
    public void crearTablaClientes() {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "CREATE TABLE IF NOT EXISTS clientes (id INT PRIMARY KEY, " +
                "nif VARCHAR(10) NOT NULL, " +
                "nombre VARCHAR(60) NOT NULL, " +
                "edad VARCHAR(2))";

        try {
            conn = conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertarCliente(int id, String nif, String nombre, String edad) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "INSERT INTO clientes (id, nif, nombre, edad) VALUES (?, ?, ?, ?)";

        try {
            conn = conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, nif);
            stmt.setString(3, nombre);
            stmt.setString(4, edad);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Cliente> obtenerClientes() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try {
            conn = conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nif = rs.getString("nif");
                String nombre = rs.getString("nombre");
                String edad = rs.getString("edad");
                Cliente cliente = new Cliente(id, nif, nombre, edad);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return clientes;
    }
}
