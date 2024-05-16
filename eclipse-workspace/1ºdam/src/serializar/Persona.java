package serializar;

import java.io.Serializable;

//Clase que implementa Serializable
class Persona implements Serializable {
private String nombre;
private int edad;

// Constructor
public Persona(String nombre, int edad) {
   this.nombre = nombre;
   this.edad = edad;
}

// Getters y setters
public String getNombre() {
   return nombre;
}

public void setNombre(String nombre) {
   this.nombre = nombre;
}

public int getEdad() {
   return edad;
}

public void setEdad(int edad) {
   this.edad = edad;
}
}