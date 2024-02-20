package interface2;

public class Calculadora  implements Operaciones{

	@Override
	public int sumar(int a, int b) {
		
		return a+b;
	}
	
	@Override
	public int restar (int a, int b) {
		
		return a-b;
	}
	@Override
	public int multi (int a, int b) {
		return a*b;
	};
	
	
	@Override
	public int divi (int a, int b){
		return a/b;
	};
	
	
	
	
	
	
}
