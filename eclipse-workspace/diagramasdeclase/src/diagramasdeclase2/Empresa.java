package diagramasdeclase2;

import java.util.ArrayList;
import java.util.List;

// Clase Empresa
public class Empresa {
    private String nombre;
    private List<Cliente> clientes;
    private List<Empleado> empleados;

    // Constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    // Métodos para gestionar clientes
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    // Métodos para gestionar empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

	public String getNombreEmpresa() {
		// TODO Auto-generated method stub
		return nombre;
	}
}