package reemplazartiposdeobjetosconsubclases.copy;

abstract class Vehiculo {
    protected int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
//metodo acelerar
    public abstract void acelerar();
}