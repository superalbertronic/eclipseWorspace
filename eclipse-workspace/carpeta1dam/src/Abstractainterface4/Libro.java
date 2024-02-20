package Abstractainterface4;

public class Libro implements ProductoInterfaz{

	private String nombre;
	private String autor;
	private Double precio;
	private String descripcion;
	
	public Libro(String nombre, String autor, Double precio, String descripcion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	@Override
    public void MostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Autor: " + autor);
    }
}
