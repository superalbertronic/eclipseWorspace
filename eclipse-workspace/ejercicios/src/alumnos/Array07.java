package alumnos;

// Escribe un programa que, daba una posicion en un tablero de ajedrez, nos diga a que casillas
// podria saltar un alfil que se encuentra en esa posicion. Como se indica en la figura, el alfil
// se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se in dican con las letras de la 
// a a la h y las filas se indican del 1 al 8

// Define un array de numeros enteros de 3 filas por 6 columnas con nombre num
// y asigna a los valores segun la siguiente tabla. Muestra el contenido de todos los elementos
// del array dispuestos en forma de tabla como se muestra en la figura :D
import java.util.Arrays;
import java.util.Scanner;

public class Array07
{
    public static void main(String[] args)
    {
		
		Scanner s = new Scanner(System.in);


				////////////////////Variables y arrays para inicializar//////////////////////////////////////////////////////////////
				////////////////////Variables y arrays para inicializar//////////////////////////////////////////////////////////////
				////////////////////Variables y arrays para inicializar//////////////////////////////////////////////////////////////
				////////////////////Variables y arrays para inicializar//////////////////////////////////////////////////////////////
				////////////////////Variables y arrays para inicializar//////////////////////////////////////////////////////////////

		int[][] num = new int[9][9]; //hacemos un array de 8 x 8 // creación de array bidimensional
		int[][] numcopia = new int[9][9]; //hacemos un array de 8 x 8 // creación de array bidimensional


		int fila,columna;  // para crear la fila
		char columnafuera;
		
		int ajedrez; 				 //pieza del ajedrez
		int usuarioFila=4;
		int usuarioColumna=4;
		num[4][4] = 2;    //estas tres variables anteriores se pueden poner para que lo escriba el usuario
		
		String afirmacion;
		String[] letras = new String[9]; // se reserva espacio para 4 enteros
		letras[1] = "A";
		letras[2] = "B";
		letras[3] = "C";
		letras[4] = "D";
		letras[5] = "E";
		letras[6] = "F";
		letras[7] = "G";
		letras[8] = "H";
		String index="";
		int derechaFila=0;
		int derechaColumna=0;
		
		//System.out.println(index);


		

					////////////////////Estructura//////////////////////////////////////////////////////////////
					////////////////////Estructura//////////////////////////////////////////////////////////////	
					////////////////////Estructura//////////////////////////////////////////////////////////////	
					////////////////////Estructura//////////////////////////////////////////////////////////////	
					////////////////////Estructura//////////////////////////////////////////////////////////////	
					////////////////////Estructura//////////////////////////////////////////////////////////////	
	


		System.out.println("Mostrar tabla de ajedrez? -si, -no");			
		afirmacion= s.next();
		

		while(afirmacion.equals("si")){													// el while en si sirve para que no acabe el bucle hasta que el usuario quiera

			System.out.print("   ");													// los espacios para que la columna este separada y antes del for
			for(columnafuera = 'A'; columnafuera < 'I'; columnafuera++) {        		// el primer bucle es para poner las columnas,
				System.out.print(columnafuera+" ");
				}

				System.out.print("\n ------------------");								// los espacios para que la columna este separada

			
			
			
				System.out.println("");

			
				for (fila = 1; fila <= 8; fila++){              						 //el segundo bucle es para poner los nombres
					
					System.out.print(fila+"|");
					
							////////////////////Fin de Estructura//////////////////////////////////////////////////////////////
							////////////////////Fin de Estructura//////////////////////////////////////////////////////////////
							////////////////////Fin de Estructura//////////////////////////////////////////////////////////////
							////////////////////Fin de Estructura//////////////////////////////////////////////////////////////
							////////////////////Fin de Estructura//////////////////////////////////////////////////////////////

					//aqui es donde colocaremos la pieza del ajedrez///
					for (columna = 1; columna<=8; columna++) {   						//dentro del bucle anterior aprovechamos para poner filas y columnas y poner el valor
						if (num[usuarioFila][usuarioColumna]==2){
						num[usuarioFila][usuarioColumna]=1; 				 	//pieza del ajedrez  //la variable realmente se puede quitar, pero lo vamos a mantener por si acaso
						

					}
						else if (num[usuarioFila][usuarioColumna]==0){
							
							System.out.println("ahi no puedes poner la ficha");
							break;
							
							}

											
							
							
//intentamos hacer los movimientos posibles							
							if (num[fila][columna]==1){
								//primer paso, probamos en una sola direccion
								num[fila+1][columna+1]=2;
	


								
								//aqui como se ha mostrado el numero se puede igualar a 2 que es lo que interesa

								}
								System.out.printf("%2d", num[fila][columna]);					// el porcentaje 2d es para que deje 2 espacios

					}
					System.out.println();												// para que inicie a la siguiente fila y no lo ponga junto
						
				}
				
				
				
									
									
									
									
									
									
																						// una vez enseñada la tabla le diremos al usuario donde quiere mover la pieza
																						
																						//tendremos que decirle al usuario a que posicion quiere cambiarlo , pos data para que no se me olvide, hay que darle  valor a los espacios
					
				num[usuarioFila][usuarioColumna]=0;  //despues de mostrar la tabla hay que igualarlo a 0, esta es la base, quitar y poner pero antes habra que hacer las validaciones
				System.out.println("Introduzca la posicion de la columna(1,2,3,4,5,6,7,8)");
					usuarioFila= s.nextInt();
						
				System.out.println("Introduzca la posicion de la columna(A,B,C,D,E,F,G,H");			
					index= s.next();
					usuarioColumna = Arrays.asList(letras).indexOf(index);
					System.out.println(usuarioColumna);

				
				// esto basicamente es para que
				System.out.println("pulsa si para ver el resultado o mover la ficha de nuevo en otra posicion, pulse no si quiere salir del programa -si, -no");			
				afirmacion= s.next();
					
					
		}
		System.out.println("Final de partida de Ajedrez");

		}
		
	}



// preguntar por teclado la posicion v y h, y hacer un bucle hasta que coincida la letra y el numero sumandole 1 +1
