package arraylistabstractinterfacebasico;

import java.util.ArrayList;

public class TiendaMain {
    private ArrayList<ProductoInformatico> productos; // Lista de productos inform�ticos

    // Constructor de la clase TiendaMain
    public TiendaMain() {
        productos = new ArrayList<ProductoInformatico>(); // Inicializaci�n de la lista de productos
    }

    // M�todo para agregar un producto a la lista
    public void agregarProducto(ProductoInformatico product) {
        productos.add(product); // Agrega el producto a la lista
    }

    // M�todo para mostrar los productos en la tienda
    public void mostrarProductos() {
        // Itera sobre cada producto en la lista
        for (ProductoInformatico product : productos) {
            // Muestra la descripci�n del producto
            System.out.println(product.Descripcion());
            // Simula la compra del producto y muestra un mensaje especial
            product.comprarProducto();
            // Muestra un mensaje de la tienda
            product.mensaje();
        }
    }

    // M�todo principal (punto de entrada del programa)
    public static void main(String[] args) {
        // Creaci�n de una instancia de TiendaMain
        TiendaMain tienda = new TiendaMain();

        // Creaci�n de productos (port�tiles) y agregaci�n a la tienda
        PortatilImpl portatil1 = new PortatilImpl("Lenovo ThinkPad X1 Carbon", 2000, 14);
        tienda.agregarProducto(portatil1);

        PortatilImpl portatil2 = new PortatilImpl("Dell XPS 13", 1500, 13);
        tienda.agregarProducto(portatil2);

        // Mostrar los productos en la tienda
        tienda.mostrarProductos();
    }
}

