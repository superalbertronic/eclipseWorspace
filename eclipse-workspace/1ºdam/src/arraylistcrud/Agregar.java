package arraylistcrud;

import java.util.ArrayList;
/**
 * Ejemplo de uso de la clase ArrayList
 *
 * @author Alberto Ruiz
 */
public class Agregar {
	public static void main(String[] args) {
		
		
		ArrayList<String> asigna = new ArrayList<String>();
		
		System.out.println("Nº de elementos: " + asigna.size());
		
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		System.out.println("Nº de elementos: " + asigna.size());
		asigna.add("Sistemas");
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println("El elemento que hay en la posición 0 es " + asigna.get(0));
		System.out.println("El elemento que hay en la posición 3 es " + asigna.get(3));
				
		
			}
						
		}
				

	
