package alumnos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// pruebas de objetos //
		Pistola Pistola = new Pistola("TAC", 7, 2);

		// sacamos la pistola principal, esto es una prueba para ver como se saca las
		// cosillas.
		String nombrePistola = Pistola.getModelo();
		double cargador = Pistola.getCargadorBala();
		double PosicionBala = Pistola.getPosicionBala();

		System.out.println("el modelo de la pistola es; " + nombrePistola);
		System.out.println("Los espacios de bala que tiene la pistola:  " + cargador);
		System.out.println("La posicion de la bala en este caso es " + PosicionBala);

		System.out.println("--------Empecemos el juego----------");

		System.out.println("--------¿Cuantos jugadores van a jugar?----------");
		int NumPlayers = s.nextInt(); // pone el numero de jugadores que van a empezar.
		Player[] Jugadores = new Player[NumPlayers]; // al principio le ponemos que sea un array segune l numero de
														// personas
		// Player Player2=new Player(nombre,"vivo"); Esto seria creando player2, solo
		// sin arrays de por medio

		// numero de jugadores que van a empezar a jugar
		for (int i = 0; i < NumPlayers; i++) {

			System.out.println("nombre de jugador" + (i + 1) + ": ");
			String nombre = s.next();

			Jugadores[i] = new Player(nombre, "vivo");

			nombre = Jugadores[i].getNombre();
			String estado = Jugadores[i].getEstado();

			System.out.println("jugador" + (i+1) + ": " + nombre + " esta:" + estado);

		}

		System.out.println("Los jugadores siguientes han accedido a jugar a la ruleta rusa");
		
		int contador = 0; // Esto es el contador de los muertos que hay
		while (contador < NumPlayers) {

			for (int i = 0; i < NumPlayers; i++) {

				String estado = Jugadores[i].getEstado();
				String nombre = Jugadores[i].getNombre();

				System.out.println("\n" + nombre + "| estado:" + estado);

				if (estado.equals("vivo")) {

					if (contador == NumPlayers - 1) { // aqui miramos si estan queda mas de uno o no, porque jugar a la
														// ruleta rusa es de retrasados
						System.out.println("El juego ha finalizado,el ganador es " + nombre
								+ "Felicidades,has ganado un ping del betis");
						contador++;
						break;
					}

					System.out.println(nombre + "Aprieta el gatillo de la pistola con confianza,escribir lo que sea para continuar");
					//Lo de abajo es para que no se haga todo automatico 
					//String tension = s.next();
					// int numero = (int)(Math.random()*10+1); // entre 1 y 10

					int recargar = (int) (Math.random() * cargador + 1);

					if (recargar == PosicionBala) {
						System.out.println("pium pium, estas muerto");
						contador++;
						Jugadores[i].setEstado("muerto");

					}

					else {
						System.out.println("te has salvado");
					}

				}

				else {
					System.out.println(nombre + " ,esta muerto");

				}
			}
		}
	}

}
