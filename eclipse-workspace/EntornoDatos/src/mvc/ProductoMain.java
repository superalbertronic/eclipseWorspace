package mvc;

import java.util.List;

public class ProductoMain {



    public static void main(String[] args) {
        List<Producto> productos = ProductoControlador.getProductos();

        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
}
