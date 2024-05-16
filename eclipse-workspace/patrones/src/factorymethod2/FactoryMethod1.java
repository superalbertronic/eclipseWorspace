package factorymethod2;

//Interfaz para productos
interface Producto {
 void venta();
 void precio();
 
}

//Implementación de productos concretos: electrodomésticos
class Electrodomestico implements Producto {
 @Override
 public void venta() {
     System.out.println("Venta de electrodoméstico.");
 }
 @Override
 public void precio() {
	 System.out.println("el electrodomestico vale 1000 euros");
	 
 }
 
}

//Implementación de productos concretos: ropa
class Ropa implements Producto {
 @Override
 public void venta() {
     System.out.println("Venta de ropa.");
 }
 @Override
 public void precio() {
	 System.out.println("la ropa vale 300 euros");
	 
 }
}

class Vehiculo implements Producto{

	@Override
	public void venta() {
		System.out.println("Venta de vehiculo.");
		
	}
	 @Override
	 public void precio() {
		 System.out.println("el vehiculo vale 50000 euros");
		 
	 }
	
}

class Ordenadores implements Producto{
	@Override
	public void venta() {
		System.out.println("Venta de ordenadores.");
		
	}
	 @Override
	 public void precio() {
		 System.out.println("el ordenador vale 800 euros");
		 
	 }
	
}

//Clase base para la fábrica de productos
abstract class Fabrica {
 public abstract Producto crearProducto();
}

//Implementación de fábrica para electrodomésticos
class FabricaElectrodomesticos extends Fabrica {
 @Override
 public Producto crearProducto() {
     return new Electrodomestico();
 }
}

//Implementación de fábrica para ropa
class FabricaRopa extends Fabrica {
 @Override
 public Producto crearProducto() {
     return new Ropa();
 }
}

//implementacion de fábrica para vehículos
class FabricaVehiculo extends Fabrica{

	@Override
	public Producto crearProducto() {
		// TODO Auto-generated method stub
		return new Vehiculo();
	}
	
}
class FabricaOrdenadores extends Fabrica{
	@Override
	public Producto crearProducto() {
		// TODO Auto-generated method stub
		return new Ordenadores();
	}
	
}


//Ejemplo de uso
public class FactoryMethod1 {
 public static void main(String[] args) {
     // Crear una fábrica de electrodomésticos
     Fabrica fabricaElectrodomesticos = new FabricaElectrodomesticos();
     // Utilizar la fábrica para crear un electrodoméstico
     Producto electrodomestico = fabricaElectrodomesticos.crearProducto();
     // Operar con el electrodoméstico
     electrodomestico.venta();
     electrodomestico.precio();

     // Crear una fábrica de ropa
     Fabrica fabricaRopa = new FabricaRopa();
     // Utilizar la fábrica para crear ropa
     Producto ropa = fabricaRopa.crearProducto();
     // Operar con la ropa
     ropa.venta();
     ropa.precio();
     //crear fabrica de veniculo
     Fabrica fabricavehiculo=new FabricaVehiculo();
     Producto vehiculo=fabricavehiculo.crearProducto();
     vehiculo.venta();
     vehiculo.precio();
     //crear ordenadores
     Fabrica fabricaordenadores=new FabricaOrdenadores();
     
     Producto ordenadores=fabricaordenadores.crearProducto();
     ordenadores.venta();
     ordenadores.precio();
 }
}
