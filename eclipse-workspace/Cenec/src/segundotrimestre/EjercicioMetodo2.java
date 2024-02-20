package segundotrimestre;

public class EjercicioMetodo2 {
    
       // Método para sumar dos números y devolver el resultado
    public int sumarConReturn(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    // Método para restar dos números y devolver el resultado
    public int restarConReturn(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static void main(String[] args) {
        EjercicioMetodo2 calculadora = new EjercicioMetodo2();
        
        // Llamada a los métodos sin devolver valor
        
        // Llamada a los métodos con devolución de valor
        int resultadoSuma = calculadora.sumarConReturn(7, 2);
        int resultadoResta = calculadora.restarConReturn(15, 8);

        System.out.println("Resultado de la suma con return: " + resultadoSuma);
        System.out.println("Resultado de la resta con return: " + resultadoResta);
    }
}
