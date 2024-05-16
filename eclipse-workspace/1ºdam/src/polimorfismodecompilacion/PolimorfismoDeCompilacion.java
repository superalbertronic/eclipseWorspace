package polimorfismodecompilacion;

public class PolimorfismoDeCompilacion {

    public static void main(String[] args) {
        // Definici�n de variables con diferentes tipos
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Polimorfismo de compilaci�n:
        // Invocaci�n del m�todo "comer" con diferentes tipos de objetos
        // en el momento que se compila se decide que metodo se va usar y sobre que objeto
        comer(perro);
        comer(gato);
    }

    // M�todo con diferentes implementaciones para diferentes tipos de animales
    public static void comer(Animal animal) {
        if (animal instanceof Perro) {
            System.out.println("El perro est� comiendo hamburguesas del macdonal y  no le gustan");
        } else if (animal instanceof Gato) {
            System.out.println("El gato est� comiendo at�n de Barbate");
        } else {
            System.out.println("El animal est� comiendo...");
        }
    }
}

class Animal {

}

class Perro extends Animal {

}

class Gato extends Animal {

}

