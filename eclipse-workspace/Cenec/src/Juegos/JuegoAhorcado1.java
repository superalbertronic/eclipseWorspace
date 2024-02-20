package Juegos;


import java.util.Scanner;

public class JuegoAhorcado1 {
    private String palabraSecreta;
    private int intentosMaximos;
    private int intentos;
    private boolean palabraAdivinada;
    private char[] palabraAdivinadaArray;

    public JuegoAhorcado1() {
        // Constructor por defecto
    }

    public void iniciarJuego(String palabraSecreta, int intentosMaximos) {
        this.palabraSecreta = palabraSecreta;
        this.intentosMaximos = intentosMaximos;
        this.intentos = 0;
        this.palabraAdivinada = false;
        this.palabraAdivinadaArray = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraAdivinadaArray.length; i++) {
            palabraAdivinadaArray[i] = '_';
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (intentos < intentosMaximos && !palabraAdivinada) {
            System.out.println("Palabra adivinada: " + new String(palabraAdivinadaArray));
            System.out.println("Intentos restantes: " + (intentosMaximos - intentos));
            System.out.print("Ingresa una letra: ");
            String entrada = scanner.nextLine();

            if (entrada.length() == 1) {
                char letra = entrada.charAt(0);
                boolean letraAdivinada = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        palabraAdivinadaArray[i] = letra;
                        letraAdivinada = true;
                    }
                }

                if (!letraAdivinada) {
                    intentos++;
                    System.out.println("Letra incorrecta.");
                }
            } else {
                System.out.println("Debes ingresar solo una letra.");
            }

            palabraAdivinada = new String(palabraAdivinadaArray).equals(palabraSecreta);
        }
        scanner.close();
       
        // Mensaje de resultado fuera del bucle
        if (palabraAdivinada) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Has agotado tus intentos. La palabra secreta era: " + palabraSecreta);
        }
    }

  
}
