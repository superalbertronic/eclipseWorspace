package builder1;

//Clase Producto
class Producto {
private String nombre;
private String descripcion;
private double precio;
private String fabricante;
private int stock;
//definimos rl constructor
public Producto(String nombre,String descripcion, double precio, String fabricante, int stock) {
   this.nombre = nombre;
   this.descripcion=descripcion;
   this.precio = precio;
   this.fabricante=fabricante;
   this.stock=stock;
}
//definimos getter
public int getStock() {
	return stock;
}

public String getFabricante() {
	return fabricante;
}

// Getters
public String getNombre() {
   return nombre;
}

public double getPrecio() {
   return precio;
}

public String getDescripcion() {
	return descripcion;
}

//Método para imprimir los detalles del producto
public void imprimirDetalles() {
System.out.println("Nombre: " + nombre);
System.out.println("Descripción: " + descripcion);
System.out.println("Precio: " + precio);
System.out.println("Fabricante: " + fabricante);
System.out.println("Stock: " + stock);
}

}