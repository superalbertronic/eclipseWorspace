package testeos;

public class PruebaDeErrores {
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return dividendo / divisor;
    }
    
    public static void main(String[] args) {
        // Prueba de manejo de errores
        try {
            double resultado = dividir(10, 4); // Intentar dividir por cero
            System.out.println("El resultado de la división es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}
