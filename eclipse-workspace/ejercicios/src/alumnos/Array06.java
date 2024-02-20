// Define un array de numeros enteros de 3 filas por 6 columnas con nombre num
// y asigna a los valores segun la siguiente tabla. Muestra el contenido de todos los elementos
// del array dispuestos en forma de tabla como se muestra en la figura :D


public class Array06
{
    public static void main(String[] args)
    {
		//throws InterruptedException{ // se añade esta linea para poder usar sleep
		
		int[][] num = new int[3][6]; //Array de 3 filas por 2 columnas 
		
		num[0][0]=0;
		num[1][0]=75;
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;

		
		int fila,columna;



    	
    System.out.print("       ");
    for(columna = 0; columna < 6; columna++) {          // el primer bucle es para poner las columnas,
      System.out.print("   Columna " + columna);
    }
    
		System.out.println("");
    
		for (fila = 0; fila < 3; fila++){               //el segundo bucle es para poner los nombres
			
			System.out.print("fila: " +fila);
			
			
            
			
			for (columna = 0; columna<6; columna++) {   //dentro del bucle anterior aprovechamos para poner filas y columnas y poner el valor

				System.out.printf("%10d ", num[fila][columna]);
				//Thread.sleep(1000); // retardo de un segundo
				
			}
			System.out.println();
				
		}
		
	}
}        
    
