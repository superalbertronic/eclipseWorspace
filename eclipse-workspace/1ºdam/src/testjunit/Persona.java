package testjunit;
import java.util.*;
public class Persona {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Persona person = new Persona();

        System.out.print("Ingrese su edad: ");
        int edad = s.nextInt();
        person.setEdad(edad);

        System.out.println("Tu edad es: " + person.getEdad());
    }
}