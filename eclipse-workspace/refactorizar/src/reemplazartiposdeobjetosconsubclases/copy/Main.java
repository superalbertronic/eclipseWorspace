package reemplazartiposdeobjetosconsubclases.copy;
//clase abstracta Vehiculos



//clase conductor



public class Main {
    public static void main(String[] args) {
    	//creamos la instancia coche
        Coche coche = new Coche(0);
        //creamos la instancia conductor
        Conductor conductor = new Conductor(coche);
        //invocamos al metodo acelerarVehiculo
        conductor.acelerarVehiculo(); // Acelera el coche
    }
}
