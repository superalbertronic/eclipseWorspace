package alumnos.ruletaRusa2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int NUM_BALAS = 7;
		Pistola pistola = new Pistola("TAC", NUM_BALAS);
		pistola.recargar();
		for(int i = 0; i < NUM_BALAS; i++) {
			if(pistola.disparar()) {
				System.out.print("Hay disparo\n");
			}else {
				System.out.print("No hay disparo\n");
			}
		}	
	}
}
