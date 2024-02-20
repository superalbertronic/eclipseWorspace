package arralistabstractinterface;

import java.util.ArrayList;

public class TiendaMain {
    private ArrayList<ProductoInformatico> productos;
  //inicializamos el arraylist productos
    public TiendaMain() {
        productos = new ArrayList<ProductoInformatico>();
    }
  // creamos un método en donde el argumento es un elemento de un array denominado producto
    //creado a través de productoInformatico
    public void agregarProducto(ProductoInformatico product) {
        productos.add(product);
    }
 //es unmetodo que usa un bucle for each que va a mostrar por pantalla
    //agregar carrito es un metodo que muestra un mensaje diferente a cada clase.
    public void mostrarProductos() {
    	   for (ProductoInformatico product : productos) {
            System.out.println(product.Descripcion());
           
             product.comprarProducto();
             product.mensaje();
        }
    }

    public static void main(String[] args) {
    	//creamos un objeto de la clase main, para poder usar los metodos
        TiendaMain tienda = new TiendaMain();

        // Agregar dos portátiles
        PortatilImpl portatil1 = new PortatilImpl("Lenovo ThinkPad X1 Carbon", 14, 16);
               //los objetos creados se introducen en el metodo agregarproductos.
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
        //llamamos al metodo mostrar pdocutos que hemos creado en el main
        tienda.mostrarProductos();
        
    }
}
