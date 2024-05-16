package test;

public class Nota {

    public String calcularNivelNota(double nota) {
        if (nota < 5) {
            return "Suspenso";
        } else if (nota == 5) {
            return "Suficiente";
        } else if (nota == 6) {
            return "Bien";
        } else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } else if (nota >= 9 && nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Nota no valida";
        }
    }

}