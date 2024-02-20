package abstracta.cineherencia;

public class sala4 extends Cine {
		
		public sala4(String pelicula, String horario) {
			this.Pelicula=pelicula;
			this.horario=horario;
		}

		@Override
		public String toString() {
			return "La sala 4 proyecta la Pelicula " + Pelicula + " con horario " + horario;
		}
		

	}


