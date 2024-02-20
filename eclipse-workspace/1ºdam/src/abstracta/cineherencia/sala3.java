package abstracta.cineherencia;

public class sala3 extends Cine {
		
		public sala3(String pelicula, String horario) {
			this.Pelicula=pelicula;
			this.horario=horario;
		}

		@Override
		public String toString() {
			return "La sala 3 proyecta la Pelicula " + Pelicula + " con horario " + horario;
		}
		

	}

