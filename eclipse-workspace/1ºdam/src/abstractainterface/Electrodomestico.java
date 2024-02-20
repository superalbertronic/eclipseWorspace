package abstractainterface;



class Electrodomestico extends Producto {
    private String marca;
    
    public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
        super(nombre, descripcion, precio);
        this.marca = marca;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Marca: " + marca);
    }
}
