package alumnos;

//Realiza un programa que pida 8 números enteros y que luego muestre esos
//números junto con la palabra par o impar según proceda.


import java.util.Scanner;
public class array13 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int[] num;
		 num = new int[7]; // le ponemos un maximo al array 
		 
        for(int i=0; i<num.length; i++)
        {
			System.out.println("Introduzca numero: ");
            num[i] = s.nextInt();

        }


        for(int i=0; i<num.length; i++)
        {
			System.out.print(num[i]);
			if (num[i]%2==0){
				System.out.println(":par ");
			}
			
			else{
				
				System.out.println(":impar");
				
			}

        }



	}
}

