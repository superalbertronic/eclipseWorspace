package serializar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {
 public static void main(String[] args) {
     // Crear objeto Persona
     Persona persona = new Persona("Juan", 30);

     // Serializar objeto a un archivo
     try {
         FileOutputStream fileOut = new FileOutputStream("persona.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(persona);
         out.close();
         fileOut.close();
         System.out.println("Objeto Persona serializado correctamente.");
     } catch (IOException i) {
         i.printStackTrace();
     }

     // Deserializar objeto desde el archivo
     Persona personaDeserializada = null;
     try {
         FileInputStream fileIn = new FileInputStream("persona.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         personaDeserializada = (Persona) in.readObject();
         in.close();
         fileIn.close();
     } catch (IOException i) {
         i.printStackTrace();
         return;
     } catch (ClassNotFoundException c) {
         System.out.println("Clase Persona no encontrada.");
         c.printStackTrace();
         return;
     }

     // Imprimir información del objeto deserializado
     System.out.println("Nombre: " + personaDeserializada.getNombre());
     System.out.println("Edad: " + personaDeserializada.getEdad());
 }
}
