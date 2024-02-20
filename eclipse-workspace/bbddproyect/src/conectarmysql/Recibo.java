package conectarmysql;

public class Recibo extends Compra {
    public double calcularTva(double precio, double tva) {
        double tvaCalculado = precio * (tva/100);
        return tvaCalculado;
    }
}
