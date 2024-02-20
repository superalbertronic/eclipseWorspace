 package abstracta.cineherencia;


public class sala5 extends Cine {
		
		public sala5(String pelicula, String horario) {
			this.Pelicula=pelicula;
			this.horario=horario;
		}

		@Override
		public String toString() {
			return "La sala 5 proyecta la Pelicula " + Pelicula + " con horario " + horario;
		}
		

	}

