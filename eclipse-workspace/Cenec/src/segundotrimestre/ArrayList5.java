package segundotrimestre;
import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de videojuegos
        ArrayList<String> listaVideojuegos = new ArrayList<>();

        // Agregar algunos nombres de videojuegos a la lista
        listaVideojuegos.add("The Legend of Zelda: Breath of the Wild");
        listaVideojuegos.add("The Witcher 3: Wild Hunt");
        listaVideojuegos.add("Red Dead Redemption 2");

        // Mostrar la lista de videojuegos
        System.out.println("Lista de Videojuegos:");
        for (String videojuego : listaVideojuegos) {
            System.out.println(videojuego);
        }

        // Obtener el tamaño de la lista
        int tamañoLista = listaVideojuegos.size();
        System.out.println("Número de videojuegos en la lista: " + tamañoLista);

        // Acceder a un elemento específico por índice
        String videojuegoElegido = listaVideojuegos.get(2);
        System.out.println("Videojuego en la posición 2: " + videojuegoElegido);

        // Eliminar un videojuego de la lista
        listaVideojuegos.remove("Hollow Knight");

        // Mostrar la lista actualizada
        System.out.println("\nLista de Videojuegos Actualizada:");
        for (String videojuego : listaVideojuegos) {
            System.out.println(videojuego);
        }

        // Verificar si un videojuego específico está en la lista
        boolean contieneWitcher3 = listaVideojuegos.contains("The Witcher 3: Wild Hunt");
        System.out.println("\n¿La lista contiene 'The Witcher 3: Wild Hunt'? " + contieneWitcher3);
    }
}
