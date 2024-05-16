package HolaMundo;

public class Juego {

	public static void main(String[] args) {
		/*
		 * 1. Dado un número de segundos totales, escribe un algoritmo que muestre el número de horas, minutos y segundos equivalente.
		 * 
		 * 2. Dado un número de minutos totales, escribe un algoritmo que muestre el número de semanas, días, horas y minutos equivalente.
		 */

		int segTotal = 5000, horas = 0, min = 0, seg = 0;
		
		
		for (int i = segTotal; i >= 60 ; i-= 60) {		// Mediante este bucle for vamos a contar los minutos equivalentes a los segundos dados
		
			min ++;
			
			if (min >= 60) {							//SI LOS MINUTOS SON SUPERIORES O IGUALES A 60 SE CUMPLE LA CONDICIÓN Y ENTRA EN EL IF
																
				min = 0;								// Con este If obtenemos las horas equivalentes a los minutos, ya que cuando los minutos lleguen a 60 se suma una hora y el contador de minutos vuelve a cero
				
				horas++;								// De este modo conseguimos imprimir una cifra de minutos inferior a 60
				
			}
			
		 }
		
		if (segTotal < 60) {							// SI LOS SEGUNDOS SON MENORES A 60 LA CIFRA DE SEGUNDOS DADOS SERÁ IGUAL A LA EQUIVALENTE EN SEGUNDOS
			
			seg = segTotal;
			
		} else {										// SI LOS SEGUNDOS SON MAYORES O IGUALES A 60 NO ENTRA EN LA CONDICIÓN DEL IF Y SE HACE LA OPERACIÓN SIGUIENTE PARA OBTENER LOS SEGUNDOS EQUIVALENTES
			
			seg = segTotal - (horas * 3600 + min * 60);
			
		}
		
		System.out.println("El número de horas equivalentes es: "+ horas);
		
		System.out.println("El número de minutos equivalentes es: "+min);							// IMPRESIÓN POR CONSOLA
		
		System.out.println("El número de segundos equivalentes es: "+ seg);
		
		// 2. Dado un número de minutos totales, escribe un algoritmo que muestre el número de semanas, días, horas y minutos equivalente.

		
		System.out.println();	
								// Pongo dos sysos para que crear dos espacios entre las dos partes del proyecto y así ser más legible en consola
		System.out.println();	// Podría haber puesto un salto de linea \n pero en este ejercico se ha decidido así ya que de este modo me es más fácil leer el código
		
		int minTotal = 10081, semanas = 0, dias = 0, ho = 0, minus = 0;
		
		/*
		 * Un dia tiene 1440 minutos
		 * 										MISMO PROCEDIMIENTO QUE EN EL EJERCICIO ANTERIOR
		 * Una semana tiene 10080 minutos
		 */
																		
		for (int i = minTotal; i >= 60 ; i-= 60) {				// Bucle for con el que vamos a contar las horas equivalentes a los minutos dados
			
			ho ++;
			
			if (ho >= 24) {										// SI LAS HORAS SON SUPERIORES O IGUALES A 24 SE CUMPLE LA CONDICIÓN Y ENTRA EN EL IF
				
				ho = 0;											//  SI LAS HORAS SON IGUALES O MAYORES A 24 EL CONTADOR DE HORAS SE PONE EN 0 Y SE SUMA UN DÍA
				
				dias++;											// // De este modo conseguimos imprimir una cifra de horas inferior a 24
				
			}
			
			if (dias >= 7) {									// SI LOS DIAS SON SUPERIORES O IGUALES A 7 SE CUMPLE LA CONDICIÓN Y ENTRA EN EL IF
				
				dias = 0;										//  SI LOS DÍAS SON IGUALES O MAYORES A 7 EL CONTADOR DE DÍAS SE PONE EN 0 Y SE SUMA UNA SEMANA
				
				semanas++;										// De este modo conseguimos imprimir una cifra de dias inferior a 7
			}
			
		}
		
		if (minTotal < 60) {
			
			minus = minTotal;												 //// SI LOS MINUTOS SON MENORES A 60 LA CIFRA DE MINUTOS DADOS SERÁ IGUAL A LA EQUIVALENTE EN SEGUNDOS
			
		} else {
			
			minus = minTotal - (semanas * 10080 + dias * 1440 + ho * 60);	 // SI LOS MINUTOS SON MAYORES O IGUALES A 60 NO ENTRA EN LA CONDICIÓN DEL IF Y SE HACE LA OPERACIÓN SIGUIENTE PARA OBTENER LOS MIUNUTOS EQUIVALENTES

		}
		
		
		
		
		System.out.println("El numero de semanas equivalentes es: "+ semanas);
		
		System.out.println("El numero de dias equivalentes es: "+ dias);
																										// IMPRESIÓN POR CONSOLA
		System.out.println("El numero de horas equivalentes es: "+ ho);
		
		System.out.println("El numero de minutos equivalentes es: "+ minus);
		
		
		
	}

}
