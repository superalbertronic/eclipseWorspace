package valoresconobjetosparcial;


public class Ejemplo1SinRefactorizar {
    private String nombre;
    private int curso;
    private String asignatura;
    private double salario;

    public Ejemplo1SinRefactorizar(String nombre, int curso, String especialidad, double salario) {
        this.nombre = nombre;
        this.curso = curso;
        this.asignatura = asignatura;
        this.salario=salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("curso: " + curso);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Ejemplo1SinRefactorizar profesor = new Ejemplo1SinRefactorizar("María", 1, "Matemáticas",1700.00);
        profesor.mostrarDetalles();
    }
}
