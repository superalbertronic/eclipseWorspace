package reemplazartiposdeobjetosconsubclases;

abstract class Vehiculo {
    protected int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
//metodo acelerar
    public abstract void acelerar();
    public abstract void frenar();
}