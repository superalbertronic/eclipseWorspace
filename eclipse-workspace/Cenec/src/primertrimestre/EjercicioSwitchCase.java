package primertrimestre;
import java.util.Scanner;

public class EjercicioSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu nota ");
		int nota=Integer.parseInt(sc.nextLine());
		
		switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Tas mu suspenso");
				break;
			case 5:
				System.out.println("Aprobado por los pelos");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Nota incorrecta");
				break;
		}
	}
}
