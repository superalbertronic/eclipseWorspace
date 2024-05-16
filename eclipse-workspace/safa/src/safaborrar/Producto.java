package safaborrar;
public abstract class Producto {
	
	//propiedades
	String id;
	String nombre;
	Double stock;
	Double precio;
	
	//constructores
	public Producto() {
		
	}
	public Producto(String id, String nombre, Double stock, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	//metodo abstracto que implementaremos en las subclases
	public abstract double ObtenerPrecio();
	
	
	
	
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public Double getStock() {
		return stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public String toString() {
		
		
		return nombre + " " + precio;
		
		
		
	}
	
	
}
