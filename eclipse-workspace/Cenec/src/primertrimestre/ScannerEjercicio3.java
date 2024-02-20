package primertrimestre;
import java.util.Scanner;
public class ScannerEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.print(" Quien es tu heroe favorito ");
		String heroe=sca.nextLine();
		System.out.print("cuantos enemigos quieres matar" );
		int enemigos=Integer.parseInt(sca.nextLine());
		System.out.print(" cuantas vidas quieres tener maximo 127");
		byte vidas= Byte.parseByte(sca.nextLine());
		
	}

}
