package encapsulararrays;

public class EncapsularArrays {
    private String[] nombres;

    public EncapsularArrays(int capacidad) {
        nombres = new String[capacidad];
    }

    // Método para agregar un nombre a la lista
    public void agregarNombre(int indice, String nombre) {
        if (indice >= 0 && indice < nombres.length) {
            nombres[indice] = nombre;
        } else {
            System.out.println("Índice fuera de los límites de la lista");
        }
    }

    // Método para obtener un nombre de la lista
    public String obtenerNombre(int indice) {
        if (indice >= 0 && indice < nombres.length) {
            return nombres[indice];
        } else {
            System.out.println("Índice fuera de los límites de la lista");
            return null;
        }
    }

    public static void main(String[] args) {
        EncapsularArrays lista = new EncapsularArrays(5); // Crear una lista con capacidad para 5 estudiantes

        // Agregar nombres a la lista
        lista.agregarNombre(0, "Juan");
        lista.agregarNombre(1, "María");
        lista.agregarNombre(2, "Pedro");

        // Obtener y mostrar nombres de la lista
        System.out.println("Nombre en la posición 0: " + lista.obtenerNombre(0));
        System.out.println("Nombre en la posición 1: " + lista.obtenerNombre(1));
        System.out.println("Nombre en la posición 2: " + lista.obtenerNombre(2));
    }
}
