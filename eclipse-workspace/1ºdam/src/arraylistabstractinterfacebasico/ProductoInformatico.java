package arraylistabstractinterfacebasico;

public abstract class ProductoInformatico {
    protected String nombre;
    protected double precio;

    public ProductoInformatico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract String Descripcion();

    public void comprarProducto() {
        System.out.println("¡Gracias por comprar " + getNombre() + " a su carrito!");
    }

    public void mensaje() {
        System.out.println("----------------PHONELAND SHOP 2024-----------------");
    }
}
