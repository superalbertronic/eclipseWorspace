package patronsingleton;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia única de la clase Calculadora
        Calculadora calculadora = Calculadora.getInstance();
        Calculadora calculadora1=Calculadora.getInstance();        
        // Realizamos algunas operaciones
        int resultado1 = calculadora.suma(2, 3);
        System.out.println("2 + 3 = " + resultado1);
        
        int resultado2 = calculadora.suma(5, 7);
        System.out.println("5 + 7 = " + resultado2);
        
        int resultado3 = calculadora.suma(10, 20);
        System.out.println("10 + 20 = " + resultado3);
        
        int resultado4 = calculadora1.suma(40, 40);
        System.out.println("40 + 40 = " + resultado4);
        //se comprueba que es la misma instancia
        System.out.println(calculadora==calculadora1);
    }
}
