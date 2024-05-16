package argumentos;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Antes de llamar al m�todo: x = " + x);
        modificarValor(x);
        System.out.println("Despu�s de llamar al m�todo: x = " + x);

        Persona persona = new Persona("Juan");
        System.out.println("Antes de llamar al m�todo: persona = " + persona.getNombre());
        modificarPersona(persona);
        System.out.println("Despu�s de llamar al m�todo: persona = " + persona.getNombre());
    }

    public static void modificarValor(int numero) {
        numero = 20;
        System.out.println("Dentro del m�todo: numero = " + numero);
    }

    public static void modificarPersona(Persona persona) {
        persona.setNombre("Pedro");
        System.out.println("Dentro del m�todo: persona = " + persona.getNombre());
    }
}

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}