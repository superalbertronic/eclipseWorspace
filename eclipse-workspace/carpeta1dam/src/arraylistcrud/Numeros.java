package arraylistcrud;



import java.util.ArrayList;
/**
 * Ejemplo de uso de la clase ArrayList
 *
 * @author Alberto Ruiz
 */
public class Numeros {
	public static void main(String[] args) {
		String buscar="Word";
			
		ArrayList<int> asigna = new ArrayList<int>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("Word");
		System.out.println(asigna);
		
		int position=asigna.indexOf(buscar);
		System.out.println(" la posicion de Word es "+position);
		asigna.set(position, "Marcas");
		System.out.println(asigna);
		
		
	   
	    
			
		}
				
	}
	