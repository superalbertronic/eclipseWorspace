package factorymethod;







//Ejemplo de uso
public class FactoryMethod1 {
 public static void main(String[] args) {
     // Crear una fábrica de electrodomésticos
     Fabrica fabricaElectrodomestico = new FabricaElectrodomestico();
     // Utilizar la fábrica para crear un electrodoméstico
     Producto electrodomestico = fabricaElectrodomestico.crearProducto();
     // Operar con el electrodoméstico
     electrodomestico.venta();
        
    //crear una fabrica de ordenadores
     // Crear una fábrica de electrodomésticos
     Fabrica fabricaOrdenadores = new FabricaOrdenadores();
     // Utilizar la fábrica para crear un electrodoméstico
     Producto ordenadores = fabricaOrdenadores.crearProducto();
     // Operar con el electrodoméstico
     electrodomestico.venta();
     
     
     
 }
}
