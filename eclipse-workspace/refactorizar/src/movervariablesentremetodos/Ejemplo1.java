package movervariablesentremetodos;



public class Ejemplo1 {
    public static void main(String[] args) {
        ClaseOrigen origen = new ClaseOrigen();
        System.out.println("Dato en ClaseDestino antes del movimiento: " + origen.dato);
        origen.metodoOrigen();
    }
}
