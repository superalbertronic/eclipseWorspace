package arraylist;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        // Crear un ArrayList de objetos de vehiculos 
        ArrayList<Vehiculo> miListaCoches = new ArrayList<>();

        // Añadir algunos objetos al ArrayList misListaCoches
        miListaCoches.add(new Vehiculo("Renault Megane"));
        miListaCoches.add(new Vehiculo("Citroen fx"));
        miListaCoches.add(new Vehiculo("Ferrari Testa"));
        miListaCoches.add(new Vehiculo("Maserati Blue"));

        // Obtener el objeto en la posición 1 y 2 (la primera posición tiene el índice 0)
        Vehiculo PosicionVehiculo1 = miListaCoches.get(1);
        Vehiculo PosicionVehiculo2 = miListaCoches.get(2);
        
        // Imprimir el valor del objeto en la posición 1 y 2
        
        System.out.println("El objeto en la posición 1 es: " + PosicionVehiculo1);
        System.out.println("El objeto en la posición 2 es: " + PosicionVehiculo2);
     }
        
}
//definiendo la clase vehiculo

class Vehiculo {
    private String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}