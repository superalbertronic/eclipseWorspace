package valoresconobjetos;

public class Ejemplo1SinRefactorizar {
    private String nombre;
    private int edad;
    private String genero;

    public Ejemplo1SinRefactorizar(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }

    public static void main(String[] args) {
        Ejemplo1SinRefactorizar persona = new Ejemplo1SinRefactorizar("Juan", 25, "Masculino");
        persona.mostrarDetalles();
    }
}

