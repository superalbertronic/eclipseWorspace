package arralistabstractinterface.copia;

import java.util.ArrayList;

public class TiendaMain {
    private ArrayList<ProductoInformatico> productos;

    public TiendaMain() {
        productos = new ArrayList<ProductoInformatico>();
    }

    public void agregarProducto(ProductoInformatico producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (ProductoInformatico producto : productos) {
            System.out.println(producto.getDescripcion());
            producto.agregarACarrito();
        }
    }

    public static void main(String[] args) {
        TiendaMain tienda = new TiendaMain();

        // Agregar dos portátiles
        PortatilImpl portatil1 = new PortatilImpl("Lenovo ThinkPad X1 Carbon", 14, 16);
       
        tienda.agregarProducto(portatil1);
        
        PortatilImpl portatil2 = new PortatilImpl("Dell XPS 13", 13.4, 8);
        tienda.agregarProducto(portatil2);
        
        // Agregar dos móviles
        MovilImp movil1 = new MovilImp("Samsung Galaxy S21", 6.2, 8, "Movistar" );
        tienda.agregarProducto(movil1);
        
        MovilImp movil2 = new MovilImp("Xiaomi Spectrum 12", 8.2, 12, "Movistar" );
        tienda.agregarProducto(movil2);
       
        // Agregar dos tablets
        TabletImpl tablet1 = new TabletImpl ("Samsung Galaxy Tab S7", 649.99, 12,true);
        tienda.agregarProducto(tablet1);
        
        TabletImpl tablet2 = new TabletImpl ("Apple Tab S12", 1649.99, 14,true);
        tienda.agregarProducto(tablet2);
       
        tienda.mostrarProductos();
        
        
    }
}
