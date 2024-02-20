package alumnos;

public class Array09 {
    public static void main (String [] args) {
        
        int[][] num = new int [10][10];

        int min = Integer.MAX_VALUE; //Almacena el valor maximo
        int max = Integer.MIN_VALUE; //Almacena el valor minimo
        int suma = 0;
        int media;

        for (int i = 0; i < 10; i++) 
        {   for ( int x= 0; x < 10; x++) 
            {   num[i][x] = (int) (Math.random() * (300-200 + 1) + 200); 
            }//Rellenar el array con numeros aleatorios
        }//entre 200 y 300, formula (X-Y+1)+Y

        System.out.println("Array: ");
        for (int i =0; i < 10; i++) 
        {   for (int x= 0; x < 10; x++)
            {   System.out.print(num[i][x] + " ");
            }
            System.out.println();
        } //Mostramos el array completo con numeros aleatorios entre 200 y 300.
        




        System.out.println("Diagonal 0,0 - 10,10: ");
        for (int i = 0; i <10; i++) 
        {   System.out.print(num[i][i] + " "); //Pasamos por la diagonal del array
            
                if (num[i][i] <min) 
                    { min = num[i][i]; 
                    }
                if (num[i][i] > max)
                    { max = num[i][i] ;
                    } //Guardamos el número menor y mayor de la diagonal
                    suma += num[i][i];
                    //Almacenamos cada valor en la variable suma (Para hacer la media despues)
        } 

        media = suma / 10;
        System.out.println("\n Min: " + min + "\n Max: " + max + "\n Media: " + media);      

    }
}