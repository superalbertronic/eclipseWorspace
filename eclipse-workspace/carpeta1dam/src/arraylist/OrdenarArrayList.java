package arraylist;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Ordenación de un ArrayList
 *
 * @author Alberto Ruiz
 */
public class OrdenarArrayList {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Malaga");
		a.add("Sevilla");
		a.add("Cadiz");
		a.add("Almeria");
		System.out.println("\nNúmeros en el orden original:");
		for (String numero: a) {
			System.out.println(numero);
		}
		Collections.sort(a);
		System.out.println("\nNúmeros ordenados:");
		for (String numero: a) {
			System.out.println(numero);
		}
	}
}