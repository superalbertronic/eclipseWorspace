package primertrimestre;

public class BucleFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio, numero, contador, siguiente;
		inicio=0;
		numero=1;
		contador=2;
		System.out.println(inicio);
		System.out.println(numero);
		while (contador<11) {
			siguiente=inicio+numero;
			System.out.println(siguiente);
			inicio=numero;
			
			numero=siguiente;
			
			
			contador++;
		}
		
		
	}

}
