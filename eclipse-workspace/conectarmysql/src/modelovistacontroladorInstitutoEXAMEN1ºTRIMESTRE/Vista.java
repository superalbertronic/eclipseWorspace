package modelovistacontroladorInstitutoEXAMEN1ºTRIMESTRE;
import java.util.List;
import java.sql.Connection;

public class Vista {
    // Método para mostrar los clientes en la vista
    public void mostrarClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId()); // Imprime el ID del cliente
            System.out.println("Nombre: " + cliente.getNombre()); // Imprime el nombre del cliente
            System.out.println("Apellido1: " + cliente.getApellido1()); // Imprime el nombre del cliente
            System.out.println("Apellido2: " + cliente.getApellido2()); // Imprime el nombre del cliente
            System.out.println("fecha_nacimiento: " + cliente.getFecha_nacimiento()); // Imprime el nombre del cliente
            System.out.println("Repetidor: " + cliente.getEs_repetidor()); // Imprime el nombre del cliente
            System.out.println("Teléfono: " + cliente.getTeléfono()); // Imprime el nombre del cliente
            System.out.println(); // Imprime una línea en blanco para separar los clientes
        }
    }
}
