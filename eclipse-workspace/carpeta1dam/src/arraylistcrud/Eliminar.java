package arraylistcrud;
import java.util.Arrays;

import java.util.ArrayList;
/**
 * Ejemplo de uso de la clase ArrayList
 *
 * @author Alberto Ruiz
 */
public class Eliminar {
	public static void main(String[] args) {
				//creamos el arraylist y con arrays.aslist añadimos los valores)
		ArrayList<String> asigna = new ArrayList<String>(
				Arrays.asList("Entorno","programación","base de datos","Sistemas","Matematicas"));
		
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println(asigna);
		//usando Arrays.asList evitamos usar add por ejemplo, y creamos
		//un array con los valores que hemos insertado
		ArrayList<String> elementosAEliminar = new ArrayList<String>(
				Arrays.asList("Matematicas", "Sistemas", "Entorno"));
		asigna.removeAll(elementosAEliminar);

		System.out.println("Nº de elementos en la lista original después del borrado: " + asigna.size());
		System.out.println(asigna);

						
		}
				
	}
	
