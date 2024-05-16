package patronsingleton;

//Definición de la clase Calculadora
public class Calculadora { 

	// Declaración de una única instancia estática de la clase Calculadora
	private static Calculadora instance; 
	
	// Constructor privado de la clase Calculadora para evitar instanciación externa
	private Calculadora() {
		// No hace nada
	}
	
	// Método estático para obtener la instancia única de la clase Calculadora
	public static Calculadora getInstance() { 
		if(instance == null) { 
			instance = new Calculadora(); // Si la instancia no existe, la crea
		} 
		return instance; // Devuelve la instancia existente o recién creada
	} 
	
	// Método público para sumar dos números enteros
	public int suma(int a, int b) { 
		return a + b; // Devuelve la suma de los dos números
	} 
}
