package ejemplo;


public class GetClassEjemplo {
	public String nombreClase() {
		return this.getClass().getSimpleName();
	}
	public static void main(String[] args) {
		GetClassEjemplo prueba = new GetClassEjemplo();
		System.out.print(prueba.nombreClase());
	}
}

