package puertaslogicas;

import java.util.Scanner;

public class PuertasLogicaFinals {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        boolean bucle = false;
        do {
            boolean A, B, total;
            System.out.println("PUERTAS LÓGICAS, 1 AND 2 OR 3 NOT 4 NAND 5 NOR 6 XOR 7 XNOR: ");
            if (entrada.hasNextInt()) {
                int menu = entrada.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Puerta lógica AND");
                        System.out.println("Ingrese el valor de A (true/false): ");
                        A = entrada.nextBoolean();
                        System.out.println("Ingrese el valor de B (true/false): ");
                        B = entrada.nextBoolean();

                        total = A && B;

                        if (total) {
                            System.out.println("AND Encendido");
                        } else {
                            System.out.println("AND apagado");
                        }
                        break;
                    case 2:
                        System.out.println("Puerta lógica OR");
                        System.out.println("Ingrese el valor de A (true/false): ");
                        A = entrada.nextBoolean();
                        System.out.println("Ingrese el valor de B (true/false): ");
                        B = entrada.nextBoolean();

                        total = A || B;

                        if (total) {
                            System.out.println("OR Encendido");
                        } else {
                            System.out.println("OR apagado");
                        }
                        break;
                    case 3:
                        System.out.println("Puerta lógica NOT");
                        System.out.println("Esta es la puerta NOT, solo tiene una entrada, escribe solo una sentencia");
                        A = entrada.nextBoolean();

                        total = !A;

                        if (!total) {
                            System.out.println("NOT Encendido");
                        } else {
                            System.out.println("NOT apagado");
                        }
                        break;
                    case 4:
                        System.out.println("PUERTAS NAND");
                        System.out.println("Ingrese el valor de A (true/false): ");
                        A = entrada.nextBoolean();
                        System.out.println("Ingrese el valor de B (true/false): ");
                        B = entrada.nextBoolean();

                        total = !(A && B);

                        if (total) {
                            System.out.println("NAND Encendido");
                        } else {
                            System.out.println("NAND apagado");
                        }
                        break;
                    case 5:
                        System.out.println("PUERTAS NOR");
                        System.out.println("Ingrese el valor de A (true/false): ");
                        A = entrada.nextBoolean();
                        System.out.println("Ingrese el valor de B (true/false): ");
                        B = entrada.nextBoolean();

                        total = !(A || B);

                        if (!total) {
                            System.out.println("NOR Encendido");
                        } else {
                            System.out.println("NOR apagado");
                        }
                        break;
                    case 6:
                        System.out.println("PUERTAS XOR");
                        System.out.println("Ingrese el valor de A (true/false): ");
                        A = entrada.nextBoolean();
                        System.out.println("Ingrese el valor de B (true/false): ");
                        B = entrada.nextBoolean();

                        total = (A && !B) || (!A && B);

                        if (total) {
                            System.out.println("XOR Encendido");
                        } else {
                            System.out.println("XOR apagado");
                        }
                        break;
                    case 7:
                        System.out.println("PUERTAS XNOR");
                        System.out.println("Ingrese el valor de A (true/false): ");
                        A = entrada.nextBoolean();
                        System.out.println("Ingrese el valor de B (true/false): ");
                        B = entrada.nextBoolean();

                        total = (A && B) || (!A && !B);

                        if (total) {
                            System.out.println("XNOR Encendido");
                        } else {
                            System.out.println("XNOR apagado");
                        }
                        break;
                    case 8:
                        bucle = true;
                        break;
                    default:
                        System.out.println("Valor incorrecto, introduce un número del 1 al 8");
                }
            } else {
                System.out.println("Input inválido, introduzca un número");
                entrada.next();  // Consume the invalid input to avoid an infinite loop
            }

        } while (!bucle);

        System.out.println("Has salido");
        entrada.close();
    }
}
