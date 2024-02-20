package crud;

import java.util.ArrayList;

abstract class Producto {
	private String nombre;
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private double precio;


	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre + " Precio: " + precio);
	}
}