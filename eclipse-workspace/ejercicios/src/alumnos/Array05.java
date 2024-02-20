// Realiza un programa que pida la temperatura media que ha hecho en cada mes
// de un determinado año y que muestre a continuación un diagrama de barras
// horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
// P g . 3 | 7
// de asteriscos o cualquier otro carácter


import java.util.Scanner;

public class Array05
{
    public static void main(String[] args)
    {
        int i;
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

		int[] media = new int[12];
		
        String Asteriscos="";
        
        Scanner s = new Scanner(System.in);
        

        for(i=0; i<media.length; i++)															// la longitud de la media que le hemos puesto 12, hara 12 veces el bucle
        {
            System.out.println("Introduzca la media de la temperatura del mes de : "+meses[i]);	// introducimos la media porr teclado 12 veces y lo guardamos en el array de la media
            media[i] = s.nextInt();            
        }
        
        
        System.out.println("/////////////////////////GRAFICA GRAFICA GRAFICA //////////////////////");
        for(i=0; i<media.length; i++)						// se podria utilizar el for de arriba para hacerlo del tiron, pero academicamente me parece mas visible esto
        {
			System.out.println("----------------------------------------------------------");
			System.out.print(meses[i]+":");                // Lo ponemos aqui para que no se repita en el bucle de abajo los meses, queremos poner el mes y luego el numero de asteriscos que hay por el valor que tenemos
					   
			for (int a=1; a<=media[i]; a++){				// para hacer la grafica hacemos otro for y le ponemos el limite del valor de la media que le hemos puesto
				
				String Almacen = (Asteriscos + "*");
				System.out.print(Almacen);

					
			}
			
			System.out.println("\n");   // hacemos un salto de linea porque cuando termina el bucle, se queda guardado todos los asteriscos en linea, segun el valor que le hayamos dado
		}
		System.out.println("/////////////////////////Fin de la GRAFICA //////////////////////");

        
        
    }
}
