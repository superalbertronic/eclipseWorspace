package sobrecargademetodos;

public class CalculadoraMain {
// no rd un rjrmplo fr polimorfismo de compilacion sino de sobrecarga de metodos, no de constructores
	public static void main(String[] args) {
		// polimorfismo de compilacion, en la compilacion ya tiene el resultado
        int suma1 = Calculadora.sumar(2, 3); // Output: 5
        int suma2 = Calculadora.sumar(2, 3, 4); // Output: 9
        double suma3 = Calculadora.sumar(2.5, 3.5); // Output: 6.0
        
        
        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(suma3);
        
	}

}
