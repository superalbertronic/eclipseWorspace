package salario;
import java.util.Scanner;
public class MainSalarioScanner {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// TODO Esbozo de método generado automáticamente
				Scanner s=new Scanner(System.in);
				System.out.print("El empleado es: ");
				String nombre=s.nextLine();
				System.out.print("El salario es: ");
				double salario=s.nextDouble();
				System.out.print("El incremento es: ");
				double incremento=s.nextDouble();
										
				Salario sal=new Salario(nombre,salario,incremento);
				double suma=sal.getSalario()+sal.getIncremento();
				System.out.println("El empleado "+sal.getNombre()+ 
						" su salario es "+sal.getSalario()+" el incremento es "+
						sal.getIncremento()+ " el total salario es "+
						suma);
						
	}

}
