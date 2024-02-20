package Abstractainterface4;

public class Electrodomestico implements ProductoInterfaz{
	
	private String marca;
	private String nombre;
	private Double precio;
	private String descripcion;
	
	public Electrodomestico(String marca, String nombre, Double precio, String descripcion) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	
	@Override
    public void MostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
    }
}
