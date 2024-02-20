package euroformacjava;

import java.security.PublicKey;
import java.util.Scanner;

public class Supermercado {
    Scanner s = new Scanner(System.in);

    public String cliente;
    public int area;
    public double precio;
    public String producto;
    public int cantidad;
    public double operacion;
    public int constDescuento;
    public double precioFinal;


    public Supermercado(){
        constDescuento = 1000;
    }

    public void compra(){
        System.out.print("Ingresa el producto: ");
        producto = s.next();

        System.out.print("Ingresa el precio/kg de " + producto + ": ");
        precio = s.nextDouble();

        System.out.print("Ingresa la cantidad de kilos de " + producto + ": ");
        cantidad = s.nextInt();

        operacion = precio * cantidad;

        System.out.print(
                "Compraste " + cantidad +
                " a un precio de " + precio +
                ". El precio a pagar es de " + operacion + "€"
        );
        System.out.println("");
        System.out.println("\nSi el precio a pagar es de mas 1000 tendras un 20% de descuento\n");

        if(operacion > constDescuento){
            precioFinal = operacion - (operacion * 0.20);
            System.out.println("Enorabuena tienes un descuento!! El precio final a pagar es: " + precioFinal);

        }else{
            System.out.println("No hay descuento, tu precio es de " + operacion + "€");
        }
    }

    public void cliente(){
        System.out.print("Nombre del Cliente: ");
        cliente = s.next();
        System.out.println("Area de compra: " + "\n1.Frutas" + "\n2.Verduras" + "\n3.Abarrotes");
        System.out.print("Area: ");
        area = s.nextInt();

        switch (area){
            case 1: compra(); break;
            case 2: compra(); break;
            case 3: compra(); break;
        }

    }
}
