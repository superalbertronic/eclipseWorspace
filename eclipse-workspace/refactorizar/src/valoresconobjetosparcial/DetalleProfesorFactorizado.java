package valoresconobjetosparcial;

public class DetalleProfesorFactorizado {
    private String nombre;
    private int curso;
    private String asignatura;
    private double salario;
   
    public DetalleProfesorFactorizado(String nombre, int curso, String asignatura, double salario
    		) {
        this.nombre = nombre;
        this.curso = curso;
        this.asignatura = asignatura;
        this.salario=salario;
        
    }

    public String getNombre() {
		return nombre;
	}

	public int getCurso() {
		return curso;
	}

	public double getSalario() {
		return salario;
	}

	public String getAsignatura() {
        return asignatura;
    }

   
}