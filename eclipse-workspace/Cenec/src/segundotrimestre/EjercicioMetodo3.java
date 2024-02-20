package segundotrimestre;
public class EjercicioMetodo3 {
    
    // Método para sumar dos números y no devolver ningún valor
  
    public static void main(String[] args) {
             
        // Llamada a los métodos sin devolver valor
 
       
       EjercicioMetodo3.sumar(12, 2); 
       EjercicioMetodo3.restar(4, 3); 
    }
    //Método para sumar dos númreos y no devolver ningún valor
    // con static no necesitamos crear una instancia
    
    public static void sumar(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("Suma: " + resultado);
    }

    // Método para restar dos números y no devolver ningún valor
    public static void restar(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("Resta: " + resultado);
    }
}