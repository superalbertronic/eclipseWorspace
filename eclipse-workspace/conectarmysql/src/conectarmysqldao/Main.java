package conectarmysqldao;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
          
        // clienteDAO.crearTablaClientes();
        clienteDAO.insertarCliente(4, "1222", "Laura", "42");
        List<Cliente> clientes = clienteDAO.obtenerClientes();
        
        
        for (Cliente cliente : clientes) {
            System.out.println("id: " + cliente.getId() + ", nif: " + cliente.getNif() + ", nombre: " 
        + cliente.getNombre() + ", edad: " + cliente.getEdad());
        }
    }
}
