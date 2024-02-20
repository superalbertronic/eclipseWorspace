package seleccionFutbol;

public class Entrenador extends Seleccion {
	
	private String idFederacion;

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	public void dirigirPartido() {
		System.out.println("Dirigir Partido");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println("Dirigir Entrenamiento");
	}

}
