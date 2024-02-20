package carpeta1dam;

/**
 * @author Luis José Sánchez
 *
 * Ejemplo de uso de arrays bidimensionales
 */
public class clase1 {
	public static void main(String[] args) {

		int[][] n = {{10,20},{30,40},{60,90}}; // array de 3 filas por 2 columnas



		int fila, columna;
		for(fila = 0; fila < 3; fila++) {
			System.out.print("Fila: " + fila);
			for(columna = 0; columna < 2; columna++) {
				System.out.printf("%10d ", n[fila][columna]);

			}
			System.out.println();
		}
	}
}