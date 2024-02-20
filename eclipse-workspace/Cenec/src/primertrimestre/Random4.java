package primertrimestre;
import java.util.Random;
import java.util.Scanner;
public class Random4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random sc=new Random();
		Random rm=new Random();	
		int alea=rm.nextInt(100);
		int aletu=sc.nextInt(100);
		System.out.println("mi apuesta es "+alea);
		System.out.println("tu apuesta es "+aletu);
		if (alea>aletu) {
			System.out.println("He ganado");
		}else if(alea<aletu){ 		
			System.out.println("He perdido");
			}	
		else {
			System.out.println("Hemos empatado");
		}
		}
		
	}


