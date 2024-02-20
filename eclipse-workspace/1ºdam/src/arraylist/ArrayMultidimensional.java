package arraylist;
import java.util.ArrayList;
public class ArrayMultidimensional {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		ArrayList<ArrayList<Integer>> miLista = new ArrayList<>();

		// Agregar una fila a la lista
		ArrayList<Integer> fila1 = new ArrayList<>();
		fila1.add(1);
		fila1.add(2);
		fila1.add(3);
		miLista.add(fila1);

		// Agregar otra fila a la lista
		ArrayList<Integer> fila2 = new ArrayList<>();
		fila2.add(4);
		fila2.add(5);
		fila2.add(6);
		miLista.add(fila2);

		// Acceder a un elemento de la lista
		int elemento = miLista.get(1).get(2); // devuelve el valor 6
	}

}
