package valoresconobjetos2;

public class DetalleAlumnoFactorizado {
    private String nombre;
    private int edad;
    private String curso;
    private String estudios;

    public DetalleAlumnoFactorizado(String nombre, int edad, String curso, String estudios) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.estudios=estudios;
    }

    public String getEstudios() {
		return estudios;
	}

	public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }
}