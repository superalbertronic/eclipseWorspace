package reemplazartiposdeobjetosconsubclases;
//clase abstracta Vehiculos



//clase conductor



public class Main {
    public static void main(String[] args) {
    	//creamos la instancia coche
        Coche coche = new Coche(0);
        Moto moto=new Moto(0);
        //creamos la instancia conductor
        Conductor conductor = new Conductor(coche);
        Conductor conductor2=new Conductor(moto);
        //invocamos al metodo acelerarVehiculo
        conductor.acelerarVehiculo(); // Acelera el coche
        conductor.frenarVehiculo();
        
        conductor2.acelerarVehiculo();
        conductor2.frenarVehiculo();
    }
}
