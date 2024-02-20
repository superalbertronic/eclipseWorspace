package arraylistcrud;

import java.util.ArrayList;
/**
 * Ejemplo de uso de la clase ArrayList
 *
 * @author Alberto Ruiz
 */
public class Modificar2 {
	public static void main(String[] args) {
		String buscar="matematicas";
			
		ArrayList<String> asigna = new ArrayList<String>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("Word");
		System.out.println(asigna);
		
		int position=asigna.indexOf(buscar);
		
	    
		// busca un dato
		if (asigna.contains(buscar)==true) {
			asigna.set(position, "Marcas");
			
		}else {
			System.out.println(" la asignatura "+buscar+ " NO Está en la lista"
					);
			if (asigna.isEmpty()==true)
			{
				System.out.println("No hay datos");
			}else {
				System.out.println("Hay otras asignaturas");
				}
			}
		System.out.println(asigna);			
		}
				
	}
	
