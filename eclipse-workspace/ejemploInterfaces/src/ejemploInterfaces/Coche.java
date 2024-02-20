package ejemploInterfaces;

public class Coche {
	private String marca;
	private String matricula;
	private EventoCambiarPropiedad eventos[] = new EventoCambiarPropiedad[5];

	public Coche(String marca, String matricula) {
		this.marca = marca;
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMarca(String marca) {
		String anterior = this.marca;
		this.marca = marca;
		lanzarEvento("marca", marca, anterior);
	}

	public void setMatricula(String matricula) {
		String anterior = this.matricula;
		this.matricula = matricula;
		lanzarEvento("matricula", matricula, anterior);
	}

	// añadir evento
	public boolean addEventoCambiarPropiedad(EventoCambiarPropiedad manejador) {
		for (int i = 0; i < eventos.length; i++) {
			if (eventos[i] == null) {
				eventos[i] = manejador;
				return true;
			}
		}
		return false;
	}

	// lanzar el evento junto con la información del evento
	private void lanzarEvento(String propiedad, String valor, String anterior) {
		for (int i = 0; i < eventos.length; i++) {
			if (eventos[i] != null) {
				eventos[i].propiedadCambiada(new ObjetoEvento(this, propiedad,valor, anterior));
			}
		}
	}
}
