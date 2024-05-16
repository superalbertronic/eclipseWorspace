package factorymethod;

//Implementación de fábrica para electrodomésticos
class FabricaOrdenadores extends Fabrica {
@Override
public Producto crearProducto() {
   return new Electrodomestico();
}
}
