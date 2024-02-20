import java.util.Stack;


public class StackEjercicio {
	private static int sumaTotal=0;
	private static Stack<Integer> operaciones=new Stack();
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		sumar(10);
		sumar(20);
		sumar(30);
		sumar(4);
		sumar(7);
		System.out.println("valor actual: "+sumaTotal);
		previewDeshacer();
		System.out.println("valor actual: "+sumaTotal);
		deshacer();}
	
	private static void deshacer() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("se deshizo la ultima operacion");
		sumaTotal-=operaciones.pop();
	}
	private static void previewDeshacer() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("previsualizacion de deshacer la ultima operacion"+(sumaTotal-operaciones.peek()));
		sumaTotal-=operaciones.pop();
	}
	private static void sumar(int numero) {
		// TODO Esbozo de método generado automáticamente
		operaciones.push(numero);
		sumaTotal+=numero;
		System.out.println("se realizo una operacion valor actual: "+sumaTotal);
	}

}
