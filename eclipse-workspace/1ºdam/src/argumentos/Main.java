package argumentos;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Antes de llamar al método: x = " + x);
        modificarValor(x);
        System.out.println("Después de llamar al método: x = " + x);

        Persona persona = new Persona("Juan");
        System.out.println("Antes de llamar al método: persona = " + persona.getNombre());
        modificarPersona(persona);
        System.out.println("Después de llamar al método: persona = " + persona.getNombre());
    }

    public static void modificarValor(int numero) {
        numero = 20;
        System.out.println("Dentro del método: numero = " + numero);
    }

    public static void modificarPersona(Persona persona) {
        persona.setNombre("Pedro");
        System.out.println("Dentro del método: persona = " + persona.getNombre());
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