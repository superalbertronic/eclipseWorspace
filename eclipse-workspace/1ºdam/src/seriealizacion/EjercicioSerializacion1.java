package seriealizacion;

import java.io.*;

//Clase que implementa Serializable
class Persona implements Serializable {
 private String nombre;
 private int edad;

 public Persona(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 public String toString() {
     return "Persona: " + nombre + ", Edad: " + edad;
 }
}

public class EjercicioSerializacion1 {
 public static void main(String[] args) {
     // Crear un objeto Persona
     Persona persona = new Persona("Juan", 30);

     // Serializar el objeto
     try {
         FileOutputStream archivoSalida = new FileOutputStream("persona.ser");
         ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
         objetoSalida.writeObject(persona);
         objetoSalida.close();
         archivoSalida.close();
         System.out.println("Objeto serializado correctamente.");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserializar el objeto
     try {
         FileInputStream archivoEntrada = new FileInputStream("persona.ser");
         ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
         Persona personaDeserializada = (Persona) objetoEntrada.readObject();
         objetoEntrada.close();
         archivoEntrada.close();
         System.out.println("Objeto deserializado correctamente.");
         System.out.println(personaDeserializada);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
