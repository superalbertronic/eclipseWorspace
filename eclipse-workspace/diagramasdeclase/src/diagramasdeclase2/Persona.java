package diagramasdeclase2;

//Clase base Persona
public class Persona {
 private String nombre;

 // Constructor
 public Persona(String nombre) {
     this.nombre = nombre;
 }

 // Getter y setter
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }
}