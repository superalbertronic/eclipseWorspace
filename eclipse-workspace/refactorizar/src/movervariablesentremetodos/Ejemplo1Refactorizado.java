package movervariablesentremetodos;


public class Ejemplo1Refactorizado {
    int dato = 5;

    public void metodoDestino() {
        System.out.println("Dato en ClaseDestino: " + dato);
    }

    public static void main(String[] args) {
        Ejemplo1Refactorizado destino = new Ejemplo1Refactorizado();
        System.out.println("Dato en ClaseDestino después del movimiento: " + destino.dato);
        destino.metodoDestino();
    }
}

