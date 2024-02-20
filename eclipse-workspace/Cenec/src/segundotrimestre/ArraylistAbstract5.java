package segundotrimestre;

import java.util.ArrayList;

//Definición de la clase abstracta Vehiculo
abstract class Vehiculo {
 private String marca;
 private String modelo;
 private int año;
 private double precio;

 public Vehiculo(String marca, String modelo, int año, double precio) {
     this.marca = marca;
     this.modelo = modelo;
     this.año = año;
     this.precio=precio;
 }
 

 public double getPrecio() {
	return precio;
}





// Método abstracto para calcular el precio del vehículo
 public abstract double calcularPrecio();

 @Override
 public String toString() {
     return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año+ " precio sin iva "+precio;
 }
}

//Definición de la clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {


 public Coche(String marca, String modelo, int año, double precio) {
     super(marca, modelo, año,precio);
     }

 @Override
 public double calcularPrecio() {
     return getPrecio()*1.21;
 }
}

public class ArraylistAbstract5 {
 public static void main(String[] args) {
     // Crear un ArrayList para almacenar objetos Coche
     ArrayList<Vehiculo> listaCoches = new ArrayList<>();

     // Agregar tres coches a la lista
     listaCoches.add(new Coche("Toyota", "Corolla", 2020, 25000.0));
     listaCoches.add(new Coche("Honda", "Civic", 2021, 28000.0));
     listaCoches.add(new Coche("Ford", "Focus", 2019, 22000.0));

     // Mostrar la lista de coches
     System.out.println("Lista de Coches:");
     for (Vehiculo coche : listaCoches) {
         System.out.println(coche);
         System.out.println("Precio+iva: " +coche.calcularPrecio()+"€");
         System.out.println();
     }
 }
}
