package interfacedificil5;

import java.util.ArrayList;
import java.util.List;

// Interfaz para los clientes
interface Cliente {
    String getNombre();
    int getId();
    String getDireccion();
    List<Poliza> getPolizas();
    void agregarPoliza(Poliza poliza);
}

// Clase abstracta para representar pólizas de seguro
abstract class Poliza {
    private int id;
    private double montoPrima;
    private boolean vigente;

    public Poliza(int id, double montoPrima) {
        this.id = id;
        this.montoPrima = montoPrima;
        this.vigente = true; // Por defecto, la póliza está vigente al ser creada
    }

    public int getId() {
        return id;
    }

    public double getMontoPrima() {
        return montoPrima;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
}

// Clase para representar pólizas de seguro de automóvil
class PolizaAutomovil extends Poliza {
    public PolizaAutomovil(int id, double montoPrima) {
        super(id, montoPrima);
    }
}

// Clase para representar pólizas de seguro de hogar
class PolizaHogar extends Poliza {
    public PolizaHogar(int id, double montoPrima) {
        super(id, montoPrima);
    }
}

// Clase para representar pólizas de seguro de vida
class PolizaVida extends Poliza {
    public PolizaVida(int id, double montoPrima) {
        super(id, montoPrima);
    }
}

// Clase para representar clientes de la compañía de seguros
class ClienteSeguros implements Cliente {
    private String nombre;
    private int id;
    private String direccion;
    private List<Poliza> polizas;

    public ClienteSeguros(String nombre, int id, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.polizas = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public List<Poliza> getPolizas() {
        return polizas;
    }

    @Override
    public void agregarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }
}

// Clase para gestionar la compañía de seguros
public class Main {
    private List<Cliente> clientes;

    public Main() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Nuevo cliente agregado: " + cliente.getNombre());
    }

    public static void main(String[] args) {
        Main compania = new Main();

        // Agregar clientes
        ClienteSeguros cliente1 = new ClienteSeguros("Juan", 1001, "Calle 123");
        ClienteSeguros cliente2 = new ClienteSeguros("María", 1002, "Avenida XYZ");
        compania.agregarCliente(cliente1);
        compania.agregarCliente(cliente2);

        // Agregar pólizas para clientes
        PolizaAutomovil polizaAuto = new PolizaAutomovil(2001, 500.0);
        PolizaHogar polizaHogar = new PolizaHogar(2002, 800.0);
        cliente1.agregarPoliza(polizaAuto);
        cliente2.agregarPoliza(polizaHogar);
    }
}
