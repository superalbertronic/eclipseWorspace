package lordoftherings;
//import
import java.util.Scanner;
public class Sauron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner
		 Scanner sc = new Scanner(System.in);
		
		//preguntas
		
		System.out.println("Bienvenido soy Sauron, cual es tu nombre  ");
		String nombreheroe=sc.nextLine();
		System.out.println("Vas a  morir "+nombreheroe);
		//indicamos el numero de orcos que puede matar un hombre, un elfo o un enano
		System.out.println("Eres enano(1), hombre(2), elfo(3) ");
		Byte queress=Byte.parseByte(sc.nextLine());
		System.out.println("Cuantos soldados tiene tu ejercito  ");
		Short cuantospringados=Short.parseShort(sc.nextLine());
		System.out.println("Con cuantos orcos quieres enfrentarte  ");
		Short orcos=Short.parseShort(sc.nextLine());
				
	    //calculo de orcos y enfrentamiento con elfos, enanos, hombres
		//según el índice 
		
		short muertos=(short) (cuantospringados*queress);
		System.out.println("Has matado a  "+muertos+" orcos, no te da pena");
		System.out.println("te quedan  "+(orcos-muertos)+" orcos");
		float media = muertos / (60 * 1.25f);
		System.out.println("Tu porcentaje de muertos por hora es "+media+" %");
		
		
		
		
		
		
		
		
	}

}
