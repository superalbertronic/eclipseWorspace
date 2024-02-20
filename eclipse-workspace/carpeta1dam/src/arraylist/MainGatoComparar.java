package arraylist;


import java.util.ArrayList;
import java.util.Collections;

public class MainGatoComparar  {
    public static void main(String[] args) {
        ArrayList<GatoComparar> gatos = new ArrayList<>();
        gatos.add(new GatoComparar("Garfield", "naranja", "Persa"));
        gatos.add(new GatoComparar("Salem", "negro", "Siamés"));
        gatos.add(new GatoComparar("Tom", "gris", "Europeo"));

        System.out.println("Lista de gatos sin ordenar:");
        for (GatoComparar gato : gatos) {
            System.out.println(gato);
        }

        Collections.sort(gatos);

        System.out.println("\nLista de gatos ordenada alfabéticamente por nombre:");
        for (GatoComparar gato : gatos) {
            System.out.println(gato);
        }
    }
}

