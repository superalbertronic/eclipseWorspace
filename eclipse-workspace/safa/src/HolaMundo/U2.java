package HolaMundo;

import java.util.*;				// IMPORTO LA LIBRERÍA JAVA.UTIL.(*) CON EL * IMPORTO TODAS SUS CLASES
public class U2 {				// AUNQUE PODRÍA SOLO IMPORTAR EL SCANNER EN ESTE CASO LO HAGO DE ESTE MODO TANTO POR COSTUMBRE COMO PORQUE CREO QUE A POSTERIORI ES LO MEJOR YA QUE NO SÉ QUE VOY A NECESITAR

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			// LLAMAMOS AL SCANNER
		
		int piedra = 1, tijeras = 2, papel = 3, j1, j2, puntos1 = 0, puntos2 = 0;		// VARIABLES
		

		
		System.out.println("Bienvenido al juego Piedra-papel-tijera de SAFA.");
		System.out.println("\nLos elementos estarán representados por números:\n\n\tPiedra ->\t1 \n\tTijeras ->\t2 \n\tPapel ->\t3");
		System.out.println("\nGanará el primero que llegue a tres puntos\n\n\t\t!VAMOS¡");
				
		do {										// BUCLE DO-WHILE PARA CONTROLAR LOS PUNTOS, LOS CUALES SERÁN LOS QUE DETERMINEN LA CONTINUACIÓN EN EL MISMO
													// DENTRO TENDREMOS VARIOS BUCLES QUE CONTROLARÁN DISTINTAS SITUACIONES
			try {																								
				
				System.out.println("\n Jugador 1 es tu turno"+ "\n\n Introduce tu elección: ");			// MEDIANTE EL TRY-CATCH CONTROLAREMOS LAS EXCEPCIONES, EN ESTE CASO TODO LO QUE NO SEA UN NUMERO ENTERO SERÁ CAPTURADO COMO TAL
				
				j1 = sc.nextInt();
				
				while (j1 < 1 || j1 > 3) {							// WHILE QUE CONTROLA QUE LA ELECCIÓN DEL JUGADOR 1 SEA UN NUMERO ENTRE 1 Y 3, EJECUTANDOSE HASTA QUE NO SE INTRODUZCA UN VALOR COMPRENDIDO ENTRE AMBOS
																										
					System.err.println("\n\t!TU ELECCIÓN DEBE SER UN NÚMERO DEL 1 AL 3!\n");
					System.out.println("Introduce de nuevo tu elección a continuación Jugador 1: ");					
					
					j1 = sc.nextInt();
				} 
								
				
				System.out.println("\n Jugador 2 es tu turno" + "\n\n Introduce tu elección: ");
				
				j2 = sc.nextInt();				
				
				while (j2 < 1 || j2 > 3) {							// WHILE QUE CONTROLA QUE LA ELECCIÓN DEL JUGADOR 2 SEA UN NUMERO ENTRE 1 Y 3, EJECUTANDOSE HASTA QUE NO SE INTRODUZCA UN VALOR COMPRENDIDO ENTRE AMBOS
					
					System.err.println("\n\tTU ELECCIÓN DEBE SER UN NÚMERO DEL 1 AL 3\n");	// system.ERR.printl() PARA MOSTRAR POR CONSOLA EL MENSAJE EN ROJO INDICANDO ERROR
					System.out.println("Introduce de nuevo tu elección a continuación Jugador 1: ");
					
					j2 = sc.nextInt();
				} 
				
				if ((j1 == 1 && j2 == 2) || (j1 == 3 && j2 == 1) || (j1 == 2 && j2 == 3)) {				// IF QUE CONTROLA LA CASUÍSTICA PARA LA VICTORIA DE J1
					
					puntos1++;																			// SUMÁNDOSE UN PUNTO SI OCURRE
					
					System.out.println("\n\tPUNTUACIÓN:\t\t Jugador 1: "+ puntos1 + "\t Jugador 2: "+ puntos2+ "\n");	// MUESTRA LA PUNTUACIÓN
					
					
				} else if ((j2 == 1 && j1 == 2) || (j2 == 3 && j1 == 1) || (j2 == 2 && j1 == 3)) {		// IF QUE CONTROLA LA CASUÍSTICA PARA LA VICTORIA DE J2
					
					puntos2++;																			// SUMÁNDOSE UN PUNTO SI OCURRE
					
					System.out.println("\n\tPUNTUACIÓN:\t\t Jugador 1: "+ puntos1 + "\t Jugador 2: "+ puntos2+"\n");  // MUESTRA LA PUNTUACIÓN
					
					
				} else if (j1 == j2) {							// ELSE IF QUE CONTROLA LOS EMPATES
					
																// NO SUMA NINGÚN PUNTO PERO MUESTRA DE IGUAL MODO LA PUNTUACIÓN TAL Y COMO SE VE EN LA LÍNEA 64
					
					System.out.println("!EMPATE!\n\tPUNTUACIÓN:\t\t Jugador 1: "+ puntos1 + "\t Jugador 2: "+ puntos2+"\n");
				}
				
				
				
				
			} catch (Exception e) {						// CAPTURA LA EXCEPCIÓN. EN ESTE CASO NO SE ESPECIFICA NINGUNA YA QUE ENTIENDO QUE CAPTURARÁ TODO LO QUE NO SEA UN INT
				
				System.err.println("\n\t!HAS INTRODUCIDO UN VALOR INVÁLIDO!\n");			// system.ERR.printl() PARA MOSTRAR POR CONSOLA EL MENSAJE EN ROJO INDICANDO ERROR
				
				sc.next();		// !MUY IMPORTANTE! LIMPIA LA VARIABLE LO CUAL EVITA UN BUCLE INFINITO
			}
			
		
		} while (puntos1 <= 2 && puntos2 <= 2);		//CONDICIÓN PARA SALIR DEL BUCLE DO-WHILE. CONTROLA LA PUNTUACIÓN LA CUAL MARCA LA EJECUCIÓN O NO DEL BUCLE
									
		if (puntos1 == 3) {				// IF PARA IMPRIMIR POR CONSOLA EL GANADOR. EN ESTE CASO J1
			
			
			System.out.println("\033[32m !ENHORABUENA JUGADOR 1!\n\n !Has ganado!"); // IMPRIME POR CONSOLA LA VICTORIA DE J1 Y PARA DESTACARLA, MEDIANTE \033[32m, IMPRIMIMOS EN VERDE EL MENSAJE POR CONSOLA
			
		} else if (puntos2 == 3) {		// IF PARA IMPRIMIR POR CONSOLA EL GANADOR. EN ESTE CASO J1
			
			
			System.out.println("\033[32m!ENHORABUENA JUGADOR 2!\n\n !Has ganado!");	// IMPRIME POR CONSOLA LA VICTORIA DE J2 Y PARA DESTACARLA, MEDIANTE \033[32m, IMPRIMIMOS EN VERDE EL MENSAJE POR CONSOLA
		}
		
		
				/*
				 *  HAY ESPACIOS QUE RESULTAN CAPRICHOSOS POR EL MERO HECHO DE QUE SEAN MÁS LEGIBLES LOS COMENTARIOS
				 *  
				 *  SE ESCRIBEN LOS COMENTARIOS EN MAYÚSCULAS PARA QUE NO MOLESTE EL SUBRAYADO EN ROJO SI SE hace en minúsculas
				 */
		
	}
	
}