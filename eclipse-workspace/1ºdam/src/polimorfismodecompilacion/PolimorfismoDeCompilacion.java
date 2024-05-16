package polimorfismodecompilacion;

public class PolimorfismoDeCompilacion {

    public static void main(String[] args) {
        // Definición de variables con diferentes tipos
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Polimorfismo de compilación:
        // Invocación del método "comer" con diferentes tipos de objetos
        // en el momento que se compila se decide que metodo se va usar y sobre que objeto
        comer(perro);
        comer(gato);
    }

    // Método con diferentes implementaciones para diferentes tipos de animales
    public static void comer(Animal animal) {
        if (animal instanceof Perro) {
            System.out.println("El perro está comiendo hamburguesas del macdonal y  no le gustan");
        } else if (animal instanceof Gato) {
            System.out.println("El gato está comiendo atún de Barbate");
        } else {
            System.out.println("El animal está comiendo...");
        }
    }
}

class Animal {

}

class Perro extends Animal {

}

class Gato extends Animal {

}

