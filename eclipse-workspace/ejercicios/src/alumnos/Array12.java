package alumnos;

// Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
// muestre por pantalla separados por espacios. El programa pedirá entonces por
// teclado dos valores y a continuación cambiará todas las ocurrencias del primer
// valor por el segundo en la lista generada anteriormente. Los números que se
// han cambiado deben aparecer entrecomillados.

import java.util.Scanner;
public class Array12
 {
    public static void main(String[] args) {
		
		int a = 0;
		int b = 20;
		int[][] num = new int [10][10];
		Scanner s = new Scanner(System.in);
		String check="si";
		
		while(check.equals("si")) {
		for (int i = 0; i < 10; i++) 
		{
			for ( int x= 0; x < 10; x++) 			//entre 200 y 300
            {   num[i][x] = (int) (Math.random() * (b-a + 1) + a); 
				System.out.print(num[i][x]+ " ");
            }
            System.out.print("\n");
        }
			
			 System.out.println("Primer rango de la matriz");
             a = s.nextInt();
             System.out.println("Segundo rango de la matriz");
             b = s.nextInt();
			
			System.out.println("¿Despues de esto quieres seguir cambiando el intervalo?:si - no ");
            check = s.next();
     

		
	}
	
		System.out.println("Fin del programa");
	
}
}
