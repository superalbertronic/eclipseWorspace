package primertrimestre;
import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" tu edad es: ");
		int edad=Integer.parseInt(sc.nextLine());
		//int edad=sc.nextInt();
		if (edad<=18) {
			System.out.println("eres menor de edad");
			
		}else if(edad>18 && edad<=65) {
			System.out.println("eres adulto");
		}		
		
		else {
			System.out.println("eres jubilado");
			
		}
		
		
		
		sc.close();
	}

}
