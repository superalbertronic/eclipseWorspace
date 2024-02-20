package primertrimestre;
import java.lang.Math;
public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero=Math.random();
		//usamos esta forma porque parseint se usaria si fuera una cadena de texto
		int resultado= (int) (numero*100f);
		System.out.println(resultado);
		
		
		
		
	}

}
