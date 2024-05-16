package variablestemporalesmal;

public class VariablesTemporales {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Intercambio de valores usando variable temporal
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Después del intercambio:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
