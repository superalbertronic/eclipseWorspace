package ejerciciosbasicossuperclases;
public class Papeleria extends Tienda {
		
 public Papeleria(String nombreProducto, double precio) {
			this.nombreProducto=nombreProducto;
			this.precio=precio+(precio*0.21);
			this.preciobase=precio;
			this.iva=(precio*0.21);
			
		}
 }

