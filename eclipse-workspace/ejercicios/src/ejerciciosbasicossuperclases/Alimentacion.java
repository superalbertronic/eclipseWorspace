package ejerciciosbasicossuperclases;

public class Alimentacion extends Tienda{
	
	public Alimentacion(String nombreProducto, double precio) {
		this.nombreProducto=nombreProducto;
		this.precio=precio+(precio*0.10);
		this.preciobase=precio;
		this.iva=(precio*0.10);
		
	}
}
