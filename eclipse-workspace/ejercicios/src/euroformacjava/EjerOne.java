package euroformacjava;

import java.util.Scanner;

public class EjerOne {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        CifradoCesar ci = new CifradoCesar();
        String texto;
        int codigo;

        System.out.print("Introduce una pababra a cifrar(EJEM: GALLETA): ");
        texto = s.next();

        do{
            System.out.print("Introduce un num de cibrado (EJEM: 5): ");
            codigo = s.nextInt();
        }while(codigo < 1);


        System.out.println("Texto cifrado: ");

        CifradoCesar descifrar = new CifradoCesar();
        System.out.println(descifrar.encriptar(texto, codigo));

    }
}
