package alumnos;
import java.util.ArrayList;
import java.util.Collections;

public class MainGatoComparar {

    public static void main(String[] args) {
        ArrayList<GatoComparar> gatos = new ArrayList<>();

        gatos.add(new GatoComparar("Garfield", "naranja","Persa", 2,"grande"));
        gatos.add(new GatoComparar("Salem", "negro","Siames", 4,"grande"));
        gatos.add(new GatoComparar("Ton", "gris","Europeo", 8,"mediano"));
        gatos.add(new GatoComparar("Alan", "blanco","Europeo", 8,"mediano"));

        // lista sin ordenar
        System.out.println("Lista sin ordenar:");
        for (GatoComparar gato : gatos) {
            System.out.println(gato);
        }

        // lista ordenada alfabeticamente
        Collections.sort(gatos);
        System.out.println("-----------------");
        System.out.println("Lista de gatos ordenada alfabeticamente por nombre");
        for(GatoComparar gato : gatos) {
            System.out.println(gato);
        }

        // lista ordenada alfabeticamente descendiente
        Collections.sort(gatos, Collections.reverseOrder());
        System.out.println("\nLista de gatos ordenada alfabeticamente en orden descendente:");
        for (GatoComparar gato : gatos) {
            System.out.println(gato);
        }
    }
}