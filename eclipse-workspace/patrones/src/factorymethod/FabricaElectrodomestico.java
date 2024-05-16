package factorymethod;

//Implementación de fábrica para electrodomésticos
class FabricaElectrodomestico extends Fabrica {
@Override
public Producto crearProducto() {
   return new Electrodomestico();
}
}
