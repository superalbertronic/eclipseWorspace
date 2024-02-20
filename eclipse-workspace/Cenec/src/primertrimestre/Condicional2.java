package primertrimestre;
import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String notacion;
		Scanner sc=new Scanner(System.in);
		System.out.print(" tu nota es: ");
		int nota=Integer.parseInt(sc.nextLine());
		
		switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				notacion="Suspenso";
				break;
			case 5:
				notacion="Aprobado";
				break;
			case 6:
				notacion="Bien";
				break;
			case 7:
			case 8:
				notacion="Notable";
				break;
			case 9:
			case 10:
				notacion="Sobresaliente";
				break;
			default:
				notacion="incorrecta";
		}
		System.out.println("su nota es "+notacion);
		sc.close();
	}

}
