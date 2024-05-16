package factorymethod;

//Implementación de productos concretos: electrodomésticos
class Ordenadores implements Producto {
@Override
public void venta() {
   System.out.println("Venta de ordenadorse.");
}
}