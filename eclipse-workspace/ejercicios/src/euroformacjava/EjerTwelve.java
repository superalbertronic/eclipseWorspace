package euroformacjava;

import java.util.Scanner;

public class EjerTwelve {

    public void Genero(String generouser){

        switch (generouser){
            case "M":
                System.out.println("Eres hombre");
                break;

            case "F":
                System.out.println("Eres Mujer");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String generoUser;

        do{
            System.out.print("Introduce tu genero(M o F): ");
            generoUser = s.next();
        }while(!generoUser.equals("M") && !generoUser.equals("F"));

        EjerTwelve gene = new EjerTwelve();

        gene.Genero(generoUser);
    }
}
