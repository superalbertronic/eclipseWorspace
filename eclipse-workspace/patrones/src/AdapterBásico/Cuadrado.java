package AdapterBásico;

class Cuadrado implements Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }
}
