package abstracta.cineherencia;


public class sala1 extends Cine {
	
	public sala1(String pelicula, String horario) {
		this.Pelicula=pelicula;
		this.horario=horario;
	}

	@Override
	public String toString() {
		return "La sala 1 proyecta la Pelicula " + Pelicula + " con horario " + horario;
	}
	

}
