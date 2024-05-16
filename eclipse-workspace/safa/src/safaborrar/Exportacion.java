package safaborrar;//creamos subclase de la clase Producto
public class Exportacion extends Producto {
	//propiedades
	double aranceles;
	
    //constructores que heredamos de Producto
	public Exportacion() {
		
	}
	
	public Exportacion(String id, String nombre, Double stock, Double precio) {
		super(id, nombre, stock, precio);
		
	}
	
	public Exportacion(String id, String nombre, Double stock, Double precio, double aranceles) {
		super(id, nombre, stock, precio);		
		this.aranceles = aranceles;
	}
	
	//metodo abstracto que heredamos de Pruducto y lo implementamos
	@Override
	public double ObtenerPrecio() {
		return precio + aranceles;
	}
	
	//método toString(), el nombre, y precio.
	@Override
	public String toString() {
		
		return nombre + " " + (precio + aranceles);
		
	}
	
	
	
	
		
	}
	


