package refactorizar;



public class MainProducto {

	public static void main(String[] args) {
		
		
		Libro[] book = new Libro [3];
		book[0]=new Libro("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
		book[1]=new Libro("El Hobbit", "Novela de aventura", 10.00, "Tolkien");
		book[2]=new Libro("El Silmarillion", "Novela de aventura", 40.00, "Tolkien");    
		
		prueba1[] electro = new prueba1 [2];
		electro[0]=new Electrodomestico("Lavadora", "Lava mu bien", 300.00, "LG");
		electro[1]=new Electrodomestico("Plancha", "La plancha es mi amiga", 30.00, "FAGOR");
		
		
		for (Libro libro : book) {
            System.out.println(libro.toString());
        }
		
		for (int i = 0;i<electro.length;i++) {
			System.out.println(electro[i]);
		}
		
		
		
	}

}
