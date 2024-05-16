package valoresconobjetos2;

public class Ejemplo1Factorizado {
    private DetalleAlumnoFactorizado detallesAlumnos;

  public Ejemplo1Factorizado(DetalleAlumnoFactorizado detalles) {
        this.detallesAlumnos = detalles;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + detallesAlumnos.getNombre());
        System.out.println("Edad: " + detallesAlumnos.getEdad());
        System.out.println("Curso: " + detallesAlumnos.getCurso());
        System.out.println("Estudios: " + detallesAlumnos.getEstudios());
    }

    public static void main(String[] args) {
        DetalleAlumnoFactorizado detalles = new DetalleAlumnoFactorizado("Juan", 25, "1ºDam","Grado");
        Ejemplo1Factorizado alumno = new Ejemplo1Factorizado(detalles);
        alumno.mostrarDetalles();
    }
}


