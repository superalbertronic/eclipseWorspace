package primertrimestre;
import java.util.Scanner;
public class ScannerEjercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Tu nombre: ");
		String nombre=sc.nextLine();
		System.out.print("Tu Edad: ");
		byte edad= Byte.parseByte(sc.nextLine());
		System.out.print("Tu Ejercito es de: ");
		short ejercicio=Short.parseShort(sc.nextLine());
		System.out.println("Los brujos te han atacado con varios hechizos ");
		System.out.println("ahora tu edad es de "+(edad+30));
		System.out.println("Tu ejercito ahora es de "+ejercicio/10);
		System.out.println("eres un cobarde true/false?");
		boolean acuerdo=Boolean.parseBoolean(sc.nextLine());
		System.out.println(nombre+" has dicho "+acuerdo);
	}

}
