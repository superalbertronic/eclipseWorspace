package valoresconobjetos;

public class DetallePersonaFactorizado {
    private String nombre;
    private int edad;
    private String genero;
    private double salario;
    private String profesion;
    private String telefono;
    
    

    public DetallePersonaFactorizado(String nombre, int edad, String genero, double salario
    		, String profesion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario=salario;
        this.profesion=profesion;
        this.telefono=telefono;
    }

    public String getProfesion() {
		return profesion;
	}

	public String getTelefono() {
		return telefono;
	}

	public double getSalario() {
		return salario;
	}

	public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}