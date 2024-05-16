package valoresconobjetos2;

public class Ejemplo1SinRefactorizar {
    private String nombre;
    private int edad;
    private String curso;
    private String estudios;

    public Ejemplo1SinRefactorizar(String nombre, int edad, String curso, String estudios) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.estudios=estudios;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("Estudios: " + estudios);
    }

    public static void main(String[] args) {
        Ejemplo1SinRefactorizar persona = new Ejemplo1SinRefactorizar("Juan", 25, "1ºDAM", "Grado");
        persona.mostrarDetalles();
    }
}

