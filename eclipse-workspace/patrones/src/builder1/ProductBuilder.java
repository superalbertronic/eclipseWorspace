package builder1;

//Clase Builder para construir productos
class ProductoBuilder {
private String nombre;
private String descripcion;
private double precio;
private String fabricante;
private int stock;

// Métodos para establecer los atributos del producto

public ProductoBuilder nombre(String nombre) {
   this.nombre = nombre;
   return this;
}

public ProductoBuilder descripcion(String descripcion) {
	
	this.descripcion = descripcion;
	return this;
}

public ProductoBuilder precio(double precio) {
   this.precio = precio;
   return this;
}
public ProductoBuilder fabricante(String fabricante) {
	this.fabricante=fabricante;
	return this;
}
public ProductoBuilder stock(int stock) {
	this.stock=stock;
	return this;
}

//Método build para construir el objeto Producto
public Producto build() {
   return new Producto(nombre, descripcion,precio, fabricante,stock);
}
}