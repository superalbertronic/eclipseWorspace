package safaborrar;//creamos clase Nacional que hereda de Producto
public class Nacional extends Producto {
	//propiedades de Nacional
	String ciudadFabricación;
	
	public Nacional(String id, String nombre, Double stock, Double precio, String ciudadFabricación) {
		super(id, nombre, stock, precio);
		this.ciudadFabricación = ciudadFabricación;
	}
	//constructor de las propiedades heredadas
	public Nacional(String id, String nombre, Double stock, Double precio) {
		super(id, nombre, stock, precio);
		
		
		
	}
	//metodo abstracto de Producto que implementamos para Nacional
	@Override
	public double ObtenerPrecio() {
		return precio;
	}
	
	//En el toString() de los productos nacionales se mostrará además la ciudad de fabricación
	@Override
	public String toString() {
		
		return nombre + " " + precio + " " + ciudadFabricación;
	}
	
	
	

}
