package metodos;

/**
 * Dice si un número es o no es primo (sin funciones)
 *
 * @author Alberto Ruiz
 */
import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		int n = Integer.parseInt(s.nextLine());
		boolean esPrimo = true;
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				esPrimo = false;
			}
		}
		if (esPrimo) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
	}
}