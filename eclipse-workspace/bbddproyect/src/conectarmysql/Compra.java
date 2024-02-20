package conectarmysql;

public abstract class Compra implements Calculable {
    public double calcularTotal(double precio, double tva) {
        double total = precio + calcularTva(precio, tva);
        return total;
    }
    public abstract double calcularTva(double precio, double tva);
}
