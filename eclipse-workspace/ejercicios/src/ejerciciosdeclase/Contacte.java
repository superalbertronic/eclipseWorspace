package ejerciciosdeclase;

// CLASE PADRE CONTACTO
// CLASES HIJOS ANA, DNI, EVA. LAURA, CONTACTO
//CONTACTOPRINCIPAO MAIN

//VAMOS CREANDO LOS GET Y SET DE TELEFONO Y NOMBRE
public class Contacte {
protected String telefono;
protected String nombre;
public Contacte(String nombre, String telefono) {
	this.nombre=nombre;
	this.telefono=telefono;
	
	
}

public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return "Contacte [telefono=" + telefono + ", nombre=" + nombre + "]";
}

}
