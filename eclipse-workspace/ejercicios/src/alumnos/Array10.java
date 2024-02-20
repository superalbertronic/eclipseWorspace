package alumnos;

public class Array10 {
    public static void main (String [] args) {
        
        int[][] num = new int [9][9];

        int min = Integer.MAX_VALUE; //Almacena el valor maximo posible
        int max = Integer.MIN_VALUE; //Almacena el valor minimo posible
        int suma = 0;
        int media;
   

        for (int i = 0; i < 9; i++) 
        {   for ( int x= 0; x < 9; x++) 
            {   num[i][x] = (int) (Math.random() * (300-200 + 1) + 200); 
            }//Rellenar el array con numeros aleatorios
        }//entre 200 y 300, formula (X-Y+1)+Y

        System.out.println("Array: ");
        for (int i =0; i < 9; i++) 
        {   for (int x= 0; x < 9; x++)
            {   System.out.print(num[i][x] + " ");
            }
            System.out.println();
        } //Mostramos el array completo con numeros aleatorios entre 200 y 300.
        
        System.out.println("Diagonal 0 8  ");
			int x = 0;
        for (int i = 8; i >=0; i--) 
        {		

			   System.out.print(num[i][x] + " "); //Pasamos por la diagonal del array
            
                if (num[i][x] <min) 
                    { min = num[i][i]; 
                    }
                if (num[i][x] > max)
                    { max = num[i][x] ;
                    } //Guardamos el número menor y mayor de la diagonal
                    suma += num[i][x];
                    //Almacenamos cada valor en la variable suma (Para hacer la media despues)
				x++;
        } 

        media = suma / 9;
        System.out.println("\n Min: " + min + "\n Max: " + max + "\n Media: " + media);      

    }
}
