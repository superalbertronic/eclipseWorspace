package metodos;
import java.util.Scanner;
public class MetodoVoid {
	public static void pedirdatos() {
        Scanner s= new Scanner(System.in);
		System.out.println("Ingrese el primer valor:");
        int a=s.nextInt();
        System.out.println("Ingrese el segundo valor valor:");
        int b=s.nextInt();
        System.out.println(a+b);   
    }
	  public static void main(String[] args) {
		pedirdatos();
	  }
}
