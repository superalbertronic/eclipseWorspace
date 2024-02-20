package Juegos;

public class CodigoAhorcadJunit {
    private String palabraSecreta;
    private int intentosMaximos;
    private int intentos;
    private char[] palabraAdivinadaArray;

    public CodigoAhorcadJunit() {
        // Constructor por defecto
    }

    public void iniciarJuego(String palabraSecreta, int intentosMaximos) {
        this.palabraSecreta = palabraSecreta;
        this.intentosMaximos = intentosMaximos;
        this.intentos = 0;
        this.palabraAdivinadaArray = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraAdivinadaArray.length; i++) {
            palabraAdivinadaArray[i] = '_';
        }
    }

    public boolean adivinarLetra(char letra) {
        boolean letraAdivinada = false;

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraAdivinadaArray[i] = letra;
                letraAdivinada = true;
            }
        }

        if (!letraAdivinada) {
            intentos++;
        }

        return letraAdivinada;
    }

    public boolean adivinarPalabra(String palabra) {
        return palabraSecreta.equals(palabra);
    }

    public String obtenerPalabraAdivinada() {
        return new String(palabraAdivinadaArray);
    }

    public int obtenerIntentosRestantes() {
        return intentosMaximos - intentos;
    }

    public boolean haGanado() {
        return new String(palabraAdivinadaArray).equals(palabraSecreta);
    }

    public boolean haPerdido() {
        return intentos >= intentosMaximos;
    }
}
