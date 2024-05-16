package safa1;
//importamos clases del apquete java.io
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PagaExtraNavidad {

	public static void main(String[] args) {
		// Instanciamos un objeto de la clase BufferedReader, usando la entrada estándar del sistema
		BufferedReader sueldoMensual = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce tu paga mensual:");
		try {
			String linea = sueldoMensual.readLine();
			// Transformamos la línea a int
						double num = Integer.parseInt(linea);
						double pagaExtra =  num * 84 / 100;
						System.out.printf("Tú sueldo mensual dices que es de : "+ "%.2f \n", num);
						System.out.printf("Tú paga extra es de: " + "%.2f \n", pagaExtra);
						System.out.printf("Tú sueldo de diciembre total es: " + "%.2f \n", num + pagaExtra);
						
						
		} catch (IOException e) {
			
			e.printStackTrace();
			
			
			
		}
		
	}

}
