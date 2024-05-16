package reemplazartiposdeobjetosconsubclases.copy;

class Conductor {
	//relacionamos vehiculo con conductor, relacion de composición
	//el conductor no puede estar sin el vehiculo
    private Vehiculo vehiculo;

    public Conductor(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
//metodo acelerarVehiculo que llama al metodo acelerar de la clase vehiculo
    public void acelerarVehiculo() {
        vehiculo.acelerar();
    }
}