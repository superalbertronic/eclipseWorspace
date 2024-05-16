package variablestemporalesmal;

public class VariablesTemporalesFactorizado {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Intercambio de valores sin usar variable temporal
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Después del intercambio:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
