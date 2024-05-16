package safaborrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//creamos un array de productos
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		//agragamos productos al array creado
		
		Nacional manzana = new Nacional("001", "manzana", 3000.0, 12.0, "Huelva");
		Exportacion kiwi = new Exportacion ("002", "kiwi", 102.0, 43.0, 21.0);
		Nacional almendra = new Nacional("003", "almendra", 5050.0, 23.0, "Sevilla" );
		Exportacion uva = new Exportacion ("234", "uva", 220.0, 33.0, 10.0);
		
		productos.add(manzana);
		productos.add(kiwi);
		productos.add(almendra);
		productos.add(uva);
		
		//ordenamos los array
		//Collections.sort((List<T>) productos);
		
		productos.sort(Comparator.comparing(Producto::getPrecio));
		//para ordenacion inversa lo haremos asi:
		//productos.sort(Comparator.comparing(Producto::getPrecio).reversed());

		System.out.println(productos);

		
		
		
		

	}

}
