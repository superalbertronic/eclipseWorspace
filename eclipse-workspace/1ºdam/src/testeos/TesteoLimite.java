package testeos;

public class TesteoLimite {
    public static void main(String[] args) {
        // Creamos un array de longitud 10
        int[] array = new int[10];
        
        // Llenamos el array con n�meros del 1 al 10
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        
        // Imprimimos el contenido del array
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Ejemplo de bucle que recorre el array (for i > 10)
        System.out.println("Prueba de valor l�mite (for i > 10):");
        for (int i = 0; i > 10; i++) {
            // Este bucle no se ejecutar� nunca ya que la condici�n (i > 10) no se cumple inicialmente
            System.out.println("Este mensaje nunca se imprimir�");
        }
        System.out.println("Fin del bucle");
    }
}