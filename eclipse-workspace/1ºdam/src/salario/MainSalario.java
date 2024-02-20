package salario;

public class MainSalario {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Salario sal=new Salario("Alberto",1200,300);
		//llamando al otro metodo constructor.
		Salario sal1=new Salario("Paco",1300);
		
		String nombre=sal.getNombre();
		double salario=sal.getSalario();
		double incremento=sal.getIncremento();
		double suma=salario+incremento;
		
		System.out.println("El empleado es "+nombre);
		System.out.println("El salario es "+salario);
		System.out.println("El incremento es "+incremento);
		System.out.println("El total a ingresar es "+suma);
	
		
		
	}
	
}
