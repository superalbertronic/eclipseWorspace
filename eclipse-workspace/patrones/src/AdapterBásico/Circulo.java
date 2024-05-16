package AdapterBásico;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }
}


