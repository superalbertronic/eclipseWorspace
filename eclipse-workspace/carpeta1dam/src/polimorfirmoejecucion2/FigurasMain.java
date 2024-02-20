package polimorfirmoejecucion2;

public class FigurasMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Figura figura1 = new Circulo(3.0);
        Figura figura2 = new Triangulo(4.0, 5.0);
        Figura figura3 = new Rectangulo(2.0, 6.0);
        
        System.out.println(figura1.calcularArea()); // Output: 28.274333882308138
        System.out.println(figura2.calcularArea()); // Output: 10.0
        System.out.println(figura3.calcularArea()); // Output: 12.0
    }

	}

