package abstracta.cineherencia;



public class sala2 extends Cine {
	
	public sala2(String pelicula, String horario) {
		this.Pelicula=pelicula;
		this.horario=horario;
	}

	@Override
	public String toString() {
		return "La sala 2 proyecta la Pelicula " + Pelicula + " con horario " + horario;
	}
	

}