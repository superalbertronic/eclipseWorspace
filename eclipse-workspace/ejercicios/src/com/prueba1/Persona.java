package com.prueba1;

class Persona {
	//definimos los String
	 
	String nombre;
	String apellido;
	String direccion;
	// Creamos el constructor, la funci
	public Persona(String nombre, String apellido, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

		public String toString() {
		return "Persona = " + nombre + " " + apellido + " - Dir: " + direccion;
	}

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", "Garcia", "Gran Via 14");
		System.out.println(p1.toString());
		
	}
}