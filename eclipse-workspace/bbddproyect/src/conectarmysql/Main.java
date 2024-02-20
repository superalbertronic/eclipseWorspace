package conectarmysql;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el tva (%): ");
        double tva = sc.nextDouble();
        
        Recibo recibo = new Recibo();
        double total = recibo.calcularTotal(precio, tva);
        System.out.println("Total a pagar: " + total);
    }
}
