package abstractainterface;

public class MainProductoInterface {

	public static void main(String[] args) {
		
		Librointerface libro = new Librointerface("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
	    Electrodomesticointerface electrodomestico = new Electrodomesticointerface("Refrigerador", "Refrigerador de marca LG", 500, "LG");
	   
	    
	    libro.mostrarInformacion();
	    System.out.println();
	    electrodomestico.mostrarInformacion();
	    System.out.println();
	    
	}

}
