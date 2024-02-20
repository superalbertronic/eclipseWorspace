package abstractostring;



public class MainProducto {

	public static void main(String[] args) {
		Producto libro = new Libro("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
	    Producto electrodomestico = new Electrodomestico("Refrigerador", "Refrigerador de marca LG", 500, "LG");
	   
	    Libro libro1=new Libro("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
	    Electrodomestico electro=new Electrodomestico("Refrigerador", "Refrigerador de marca LG", 500, "LG");
	    
	   
	    System.out.println(libro);
	    System.out.println(libro1);
	    System.out.println("-----------------");
	    System.out.println(electrodomestico);
	    System.out.println(electro);
	    	
	    
	
	}

}
