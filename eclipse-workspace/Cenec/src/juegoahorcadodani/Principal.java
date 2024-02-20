package juegoahorcadodani;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		// Scanner sc= new Scanner(System.in);

		String palabraSecreta = Funciones.palabraSecreta();
		char[] palabraGuiones = Funciones.palabrasGuiones(palabraSecreta);
		boolean juegoTerminado = false;
		byte fallos = 7;

		// System.out.println("Bienvenido al juego del ahorcado\n");
		JOptionPane.showMessageDialog(null, "Bienvenido al juego del ahorcado", "Bienvenido",
				JOptionPane.PLAIN_MESSAGE);
		// Metodo que dibuja el ahorcado cuando fallo una letra.
		// Funciones.dibujarAhorcado(intentos);
		// String dibujo = Funciones.dibujarAhorcado(intentos);

		boolean juegoGanado = true;
		Set<String> contenedorLetrasYPalabras = new HashSet<String>();

		do {
			JTextArea textArea = new JTextArea(Funciones.dibujarAhorcado(fallos));
			textArea.setColumns(20); // Ancho personalizado
			textArea.setRows(10); // Alto personalizado

			// System.out.println("Te quedan "+ intentos+" vidas");
			JOptionPane.showMessageDialog(null, "Te quedan " + fallos + " vidas");
			// System.out.println(palabraGuiones);
			JOptionPane.showMessageDialog(null, new String(palabraGuiones));

			// System.out.println("Por favor, introduzca una letra\n");
			String letraOPalabraIntroducida = JOptionPane.showInputDialog("Por favor, introduzca una letra\n");

			// Verifica si el usuario presionó "Cancelar" o cerró la ventana del cuadro de
			// diálogo
			if (letraOPalabraIntroducida == null) {
				JOptionPane.showMessageDialog(null, "Juego terminado por cancelación del usuario");
				break; // Sale del bucle del juego
			}
			// Sirve para que no pete el programa sino introduces ninguna letra
			if (letraOPalabraIntroducida.isEmpty()) {
				continue;
			}

			// Convierte la entrada a minúsculas (o mayúsculas) para comparar sin distinción
			letraOPalabraIntroducida = letraOPalabraIntroducida.toLowerCase(); // o toUpperCase()

			// Verificar si la entrada ya se ha introducido anteriormente
			if (contenedorLetrasYPalabras.contains(letraOPalabraIntroducida)) {
				JOptionPane.showMessageDialog(null,
						"Ya has introducido '" + letraOPalabraIntroducida + "' anteriormente.");
				continue; // Salta a la siguiente iteración del bucle sin restar fallos
			}
			
			contenedorLetrasYPalabras.add(letraOPalabraIntroducida); // Agregar la entrada actual al contenedor

			// esta condicion lo que hace es que si tengo mas de una letra acertada ya tengo
			// oportunidad de aceptar la palabra
			if (letraOPalabraIntroducida.length() > 1) {
				if (letraOPalabraIntroducida.equalsIgnoreCase(palabraSecreta)) {
					JOptionPane.showMessageDialog(null, "¡Has ganado el juego!");
					juegoTerminado = true;
				} else {
					JOptionPane.showMessageDialog(null, "Palabra incorrecta");
					JOptionPane.showMessageDialog(null, textArea, "Ahorcado", JOptionPane.PLAIN_MESSAGE);
					--fallos;
					if (fallos == 0) {
						JOptionPane.showMessageDialog(null, "Has perdido porque se ha completado el ahorcado");
						juegoTerminado = true;
					}
				}
			} else {

				char letra = letraOPalabraIntroducida.charAt(0);
				boolean algunaLetraAcertada = false;

				for (int i = 0; i < palabraSecreta.length(); i++) {
					if (palabraSecreta.charAt(i) == letra && palabraGuiones[i * 2] == '_') {
						palabraGuiones[i * 2] = letra;
						algunaLetraAcertada = true;
					}
				}
				if (!algunaLetraAcertada) {
					JOptionPane.showMessageDialog(null, "\nNo has acertado ninguna letra\n");

					JOptionPane.showMessageDialog(null, textArea, "Ahorcado", JOptionPane.PLAIN_MESSAGE);
					--fallos;

					if (fallos == 0) {
						JOptionPane.showMessageDialog(null, "Has perdido porque se ha completado el ahorcado");
						juegoTerminado = true;
					}
				} else {

					for (int i = 0; i < palabraSecreta.length(); i++) {
						if (palabraGuiones[i * 2] != palabraSecreta.charAt(i)) {
							juegoGanado = false;
							break;
						}
					}
					if (juegoGanado) {
						JOptionPane.showMessageDialog(null, "Has ganado el juego");
						juegoTerminado = true;
					}
				}
			}
		} while (!juegoTerminado);

		// sc.close();
		// Prueba que me salga palabras random.
		// System.out.println(palabraSecreta);

		// Sustituye la palabra secreta por guiones.
		// System.out.println(palabraGuiones);
	}
}
