package primertrimestre;
import java.util.Scanner;
public class ScannerEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("dime tu nombre ");
		String name= scan.nextLine();
		System.out.print("dime tus apelidos ");
		String surname= scan.nextLine();
		System.out.print("dime tus ingresos ");
		int ingresos=Integer.parseInt(scan.nextLine());
	}

}
