package diagramasdeclase2;

import java.util.List;

//Clase Main para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear una empresa
        Empresa miEmpresa = new Empresa("CENEC");

        // Crear clientes
        Cliente cliente1 = new Cliente("Alberto","alberto@gmail.com");
        Cliente cliente2 = new Cliente("Cristina","cristina@gmail.com");

        // Agregar clientes a la empresa
        miEmpresa.agregarCliente(cliente1);
        miEmpresa.agregarCliente(cliente2);

        // Crear empleados
        Empleado empleado1 = new Empleado("Laura", 2000.0);
        Empleado empleado2 = new Empleado("Juan", 2500.0);

        // Agregar empleados a la empresa
        miEmpresa.agregarEmpleado(empleado1);
        miEmpresa.agregarEmpleado(empleado2);

        // Crear directivo
        Directivo directivo = new Directivo("Alberto Ruiz", 5000.0, "Departamento contabilidad");
        Directivo directivo2 = new Directivo("Gandalf el gris", 5000.0, "Departamento magia y hechizos");
        
        // Agregar directivo a la empresa
        miEmpresa.agregarEmpleado(directivo);
        miEmpresa.agregarEmpleado(directivo2);
        
        
        // Obtener nombre de la empresa
        String nombreEmpresa = miEmpresa.getNombreEmpresa();
        System.out.println("Nombre de la empresa: " + nombreEmpresa);

        // Obtener clientes de la empresa
        List<Cliente> clientes = miEmpresa.getClientes();
        System.out.println("\nClientes de la empresa:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre());
        }

        // Obtener empleados de la empresa
        List<Empleado> empleados = miEmpresa.getEmpleados();
        System.out.println("\nEmpleados de la empresa:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " - Salario: " + empleado.getSalario());
        }
        empleado1.setSupervisor(directivo);
        empleado2.setSupervisor(directivo2);
        System.out.println("El empleado " + empleado1.getNombre() + " tiene como supervisor a " + directivo.getNombre());
        System.out.println("El empleado " + empleado2.getNombre() + " tiene como supervisor a " + directivo2.getNombre());
    }
}