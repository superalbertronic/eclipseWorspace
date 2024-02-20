package carpeta1dam;
import java.util.Scanner;
public class ArrayForEach {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double[] nota = new double[4];
		int fin=nota.length;
		int inicio=fin-2;
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus exámenes.");
		for (int i = 0; i < 4; i++) {
			System.out.print("Nota del examen nº " + (i + 1) + ": ");
			nota[i] = Double.parseDouble(s.nextLine());
		}
		System.out.println("Tus notas son: ");
	
		System.out.println(nota.length);
		
		
	}
}