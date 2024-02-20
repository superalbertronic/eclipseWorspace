package polimorfismoejecucion;

public class PolimorfismoMain {

	public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.hacerSonido(); // salida: El perro ladra
        animal2.hacerSonido(); // salida: El gato maulla
	}

}
