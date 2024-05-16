package valoresconobjetosparcial;

public class Main {

	public static void main(String[] args) {
		DetalleProfesorFactorizado detalles= new DetalleProfesorFactorizado(
				"Alberto",1,"Entorno",4000.00);
		ProfesorFactorizado profesor=new ProfesorFactorizado(detalles);
		profesor.mostrarDetalles();;
	}
	

}
