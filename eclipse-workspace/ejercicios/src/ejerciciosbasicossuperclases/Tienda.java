package ejerciciosbasicossuperclases;

public class Tienda {
 protected String nombreProducto;
 protected double precio;
 protected double preciobase;
 protected double iva;
 
 private String tienda;
 // en este caso no nos hace falta crear un constructor, porque por defecto
 // sería Tienda, pero aquí hemos definido un inicializador a la variable
public Tienda(){
	
	tienda="Erosky";
	
}
 
 
public String getNombreProducto() {
	return nombreProducto;
}
public void setNombreProducto(String nombreProducto) {
	this.nombreProducto = nombreProducto;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getPreciobase() {
	return preciobase;
}
public double getiva() {
	return iva;
}

/*lo que hace es sobreescribir el método, de manera que al 
llamarlo el return me va a permitir junto con tostring que me aparezca
el string de alimentacion y de papeleria

*/
@Override
public String toString() {
	 	return tienda+" nombreProducto=" + nombreProducto 
		 	+" Base imponible "+preciobase+
		 	" iva "+iva+
		    ", Precio= total " + precio + " €";
}

}
